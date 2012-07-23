package org.wso2.developerstudio.eclipse.artifact.cep.editor;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.maven.project.MavenProject;
import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.w3c.dom.Document;
import org.wso2.carbon.cep.core.Bucket;
import org.wso2.carbon.cep.core.Query;
import org.wso2.carbon.cep.core.exception.CEPConfigurationException;
import org.wso2.carbon.cep.core.internal.config.BucketHelper;
import org.wso2.carbon.cep.core.mapping.input.Input;
import org.wso2.developerstudio.eclipse.artifact.cep.Activator;
import org.wso2.developerstudio.eclipse.artifact.cep.ui.Dialog.BucketInputDialog;
import org.wso2.developerstudio.eclipse.artifact.cep.ui.Dialog.QueryDialog;
import org.wso2.developerstudio.eclipse.artifact.cep.utils.CEPArtifactConstants;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.platform.core.project.export.util.ExportUtil;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


public class CEPProjectEditorPage extends FormPage {
	private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);
	private  String outputfileLocation;
	public static String bucketProjectName;
	public static String initialFileLocation;
	public static boolean isNewProject = true;
	private IFile pomFileRes;
	private MavenProject parentPrj;
	private FormToolkit toolkit;
	private ScrolledForm form;
	private Composite body;
	private Text txtBucketName;
	private Text txtDescription;
	private boolean pageDirty;
	private Button overWriteChecked;
	private TableViewer viewer;
	private TableViewer viewerQuery;
	private List<Input> inputList = new ArrayList<Input>();
	private List<Query> queryList = new ArrayList<Query>();
	private Action exportAction;
	private Table inputTable;
	private Table queryTable;
	private int selectedIndex;
	private int selectedIndexQuery;
	private Bucket bucket;
	private String bucketName;
	private String bucketDescription;
	private String bucketNameSpace;
	private String bucketEngineProvider;
	private String[] arrayCEPEngine = {
			CEPArtifactConstants.WIZARD_OPTION_DROOLS_FUSION_CEP_RUNTIME,
			CEPArtifactConstants.WIZARD_OPTION_ESPER_CEP_RUNTIME };
	private boolean overWriteRegistry;
	private Combo engineCombo;
	private File cepTemplateFile;

	public CEPProjectEditorPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
		bucket = new Bucket();
		
	}

	public void initContent() throws Exception {
		pomFileRes = ((IFileEditorInput) (getEditor().getEditorInput()))
				.getFile();
		pomFileRes.getLocation().toFile();
		outputfileLocation =pomFileRes.getLocation().toFile().getAbsolutePath();
		cepTemplateFile = new File(outputfileLocation);
	}

	public void saveConfigurationFile() throws Exception {
		bucket = new Bucket();
		bucket.setName(getBucketName());
		bucket.setDescription(getBucketDescription());
		bucket.setEngineProvider(getBucketEngineProvider());
		bucket.setOverWriteRegistry(isOverWriteRegistry());
		bucket.setInputs(inputList);
		for(Query query:queryList){
			query.setQueryIndex(queryList.indexOf(query));
		}
		bucket.setQueries(queryList);
		writeTOFile(bucket);
		setPageDirty(false);
		pomFileRes.getProject().refreshLocal(IResource.DEPTH_INFINITE,
				new NullProgressMonitor());
	}

	protected void createFormContent(final IManagedForm managedForm) {
		toolkit = managedForm.getToolkit();
		form = managedForm.getForm();
		body = form.getBody();
		toolkit.decorateFormHeading(form.getForm());
		toolkit.paintBordersFor(body);
		managedForm.getForm().getBody().setLayout(new GridLayout(2, false));
		managedForm.getToolkit().createLabel(managedForm.getForm().getBody(),
				"Bucket Name", SWT.NONE);
		txtBucketName = managedForm.getToolkit().createText(
				managedForm.getForm().getBody(),
				CEPProjectEditorPage.bucketProjectName, SWT.NONE);
		setBucketName(CEPProjectEditorPage.bucketProjectName);//
		GridData gd_txtGroupId = new GridData(SWT.LEFT, SWT.CENTER, true,
				false, 1, 1);
		gd_txtGroupId.widthHint = 180;
		txtBucketName.setLayoutData(gd_txtGroupId);
		txtBucketName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent evt) {
				setBucketName(txtBucketName.getText().trim());
				setPageDirty(true);
				updateDirtyState();
			}
		});

		Label lblDescription = managedForm.getToolkit()
				.createLabel(managedForm.getForm().getBody(),
						"Bucket Description", SWT.NONE);
		lblDescription.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false,
				false, 1, 1));
		txtDescription = managedForm.getToolkit().createText(
				managedForm.getForm().getBody(), "",
				SWT.MULTI | SWT.V_SCROLL | SWT.WRAP);

		GridData gd_txtDescription = new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1);
		gd_txtDescription.heightHint = 60;
		txtDescription.setLayoutData(gd_txtDescription);
		setBucketDescription(txtDescription.getText().trim());//
		txtDescription.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent evt) {

				setBucketDescription(txtDescription.getText().trim());
				setPageDirty(true);
				updateDirtyState();
			}
		});

		Label lblCepRuntime = managedForm.getToolkit().createLabel(
				managedForm.getForm().getBody(), "CEP Engine Provider",
				SWT.NONE);
		lblCepRuntime.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false,
				false, 1, 1));

		engineCombo = new Combo(managedForm.getForm().getBody(), SWT.DROP_DOWN
				| SWT.READ_ONLY);
		toolkit.adapt(engineCombo);
		toolkit.paintBordersFor(managedForm.getForm().getBody());
		engineCombo.setItems(arrayCEPEngine);
		engineCombo
				.setText(CEPArtifactConstants.WIZARD_OPTION_ESPER_CEP_RUNTIME);
		setBucketEngineProvider(CEPArtifactConstants.WIZARD_OPTION_ESPER_CEP_RUNTIME);
		engineCombo.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (arrayCEPEngine[engineCombo.getSelectionIndex()]
						.equals(CEPArtifactConstants.WIZARD_OPTION_ESPER_CEP_RUNTIME)) {
					setBucketEngineProvider(CEPArtifactConstants.WIZARD_OPTION_ESPER_CEP_RUNTIME);
					setPageDirty(true);
					updateDirtyState();

				} else if (arrayCEPEngine[engineCombo.getSelectionIndex()]
						.equals(CEPArtifactConstants.WIZARD_OPTION_DROOLS_FUSION_CEP_RUNTIME)) {
					setBucketEngineProvider(CEPArtifactConstants.WIZARD_OPTION_DROOLS_FUSION_CEP_RUNTIME);
					setPageDirty(true);
					updateDirtyState();

				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				

			}
		});

		overWriteChecked = managedForm.getToolkit().createButton(
				managedForm.getForm().getBody(), "", SWT.CHECK);
		overWriteChecked.setSelection(true);
		setOverWriteRegistry(true);
		Label over = managedForm.getToolkit().createLabel(
				managedForm.getForm().getBody(),
				"Overwrite Registry Stored Bucket", SWT.NONE);
		over.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));

		overWriteChecked.setLayoutData(new GridData(SWT.RIGHT, SWT.RIGHT,
				false, false, 1, 1));
		overWriteChecked.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {

				if (overWriteChecked.getSelection()) {

					setOverWriteRegistry(true);
					setPageDirty(true);
					updateDirtyState();
				} else {
					setOverWriteRegistry(false);
					setPageDirty(true);
					updateDirtyState();
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});

		Section bucketInputs = managedForm.getToolkit().createSection(
				managedForm.getForm().getBody(),
				Section.TWISTIE | Section.TITLE_BAR);

		GridData gd_inputs = new GridData(SWT.NONE, SWT.CENTER, true, false, 2,
				1);
		bucketInputs.setText("Inputs");
		bucketInputs.setLayoutData(gd_inputs);
		bucketInputs.setExpanded(true);
		final Composite compositeone = managedForm.getToolkit()
				.createComposite(bucketInputs, SWT.NONE);
		bucketInputs.setClient(compositeone);
		compositeone.setLayout(new GridLayout(3, false));
		if (!isNewProject) {
			try {
				bucket = readFromFile(initialFileLocation);
			} catch (Exception e) {
				e.printStackTrace();
			}
			txtBucketName.setText(bucket.getName());
			setBucketName(bucket.getName());
			txtDescription.setText(bucket.getDescription());
			setBucketDescription(bucket.getDescription());
			if (bucket
					.getEngineProvider()
					.equals(CEPArtifactConstants.WIZARD_OPTION_DROOLS_FUSION_CEP_RUNTIME)) {
				engineCombo
						.setText(CEPArtifactConstants.WIZARD_OPTION_DROOLS_FUSION_CEP_RUNTIME);
				setBucketEngineProvider(CEPArtifactConstants.WIZARD_OPTION_DROOLS_FUSION_CEP_RUNTIME);
			} else if (bucket.getEngineProvider().equals(
					CEPArtifactConstants.WIZARD_OPTION_ESPER_CEP_RUNTIME)) {
				engineCombo
						.setText(CEPArtifactConstants.WIZARD_OPTION_ESPER_CEP_RUNTIME);
				setBucketEngineProvider(CEPArtifactConstants.WIZARD_OPTION_ESPER_CEP_RUNTIME);
			}
			if (bucket.isOverWriteRegistry()) {
				overWriteChecked.setSelection(true);
				setOverWriteRegistry(true);
			} else {
				overWriteChecked.setSelection(false);
				setOverWriteRegistry(false);
			}
			if (bucket.getInputs() != null) {
				inputList = bucket.getInputs();
			}
			if (bucket.getQueries() != null) {
				queryList = bucket.getQueries();
			}
		}
		initInputTable(compositeone, managedForm);

		GridData gdBtn = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gdBtn.widthHint = 100;
		Button addButton = managedForm.getToolkit().createButton(compositeone,
				"Add...", SWT.PUSH);
		addButton.setLayoutData(gdBtn);

		addButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				BucketInputDialog dialog = new BucketInputDialog(managedForm
						.getForm().getBody().getShell(), false);
				dialog.create();
			
				if (dialog.open() == Window.OK) {
					Input p = dialog.getInput();
					updateInputTable(p, false);
				}

				setPageDirty(true);
				updateDirtyState();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
		Button editButton = managedForm.getToolkit().createButton(compositeone,
				"Edit...", SWT.PUSH);
		addButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 1, 1));

		editButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				selectedIndex = inputTable.getSelectionIndex();
				Input p = inputList.get(inputTable.getSelectionIndex());

				BucketInputDialog dialog = new BucketInputDialog(managedForm
						.getForm().getBody().getShell(), false);
				dialog.initiatePage(p);
				dialog.create();
				if (dialog.open() == Window.OK) {
					Input inp = dialog.getInput();
					updateInputTable(inp, true);
				}

				setPageDirty(true);
				updateDirtyState();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});

		Button deleteButton = managedForm.getToolkit().createButton(
				compositeone, "Delete", SWT.PUSH);
		editButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 1, 1));
		deleteButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 1, 1));
		deleteButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				
				selectedIndex = inputTable.getSelectionIndex();
				
				inputList.remove(selectedIndex);
				viewer.setInput(inputList.toArray());
				viewer.refresh();
				setPageDirty(true);
				updateDirtyState();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});

		Section bucketQueries = managedForm.getToolkit().createSection(
				managedForm.getForm().getBody(),
				Section.TWISTIE | Section.TITLE_BAR);

		GridData gd_queries = new GridData(SWT.NONE, SWT.CENTER, true, false,
				2, 1);
		bucketQueries.setText("Queries");
		bucketQueries.setLayoutData(gd_queries);
		bucketQueries.setExpanded(true);
		final Composite compositetwo = managedForm.getToolkit()
				.createComposite(bucketQueries, SWT.NONE);
		bucketQueries.setClient(compositetwo);
		compositetwo.setLayout(new GridLayout(3, false));
		initQueryTable(compositetwo, managedForm);

		gdBtn.widthHint = 100;
		Button addButtonQuery = managedForm.getToolkit().createButton(
				compositetwo, "Add...", SWT.PUSH);
		addButtonQuery.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 1, 1));
		addButtonQuery.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {

				QueryDialog dialog = new QueryDialog(managedForm.getForm()
						.getBody().getShell(), false);
				dialog.create();
				if (dialog.open() == Window.OK) {
					Query query = dialog.getQueryObject();
					updateQueryTable(query, false);
					setPageDirty(true);
					updateDirtyState();
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});
		Button editButtonQuery = managedForm.getToolkit().createButton(
				compositetwo, "Edit...", SWT.PUSH);
		editButtonQuery.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 1, 1));
		editButtonQuery.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				

				selectedIndexQuery = queryTable.getSelectionIndex();
				Query p = queryList.get(queryTable.getSelectionIndex());
                 
				QueryDialog dialog = new QueryDialog(managedForm.getForm()
						.getBody().getShell(), true);
				dialog.initializePage(p);
				dialog.create();

				if (dialog.open() == Window.OK) {
					Query query = dialog.getQueryObject();
					updateQueryTable(query, true);
				}
				setPageDirty(true);
				updateDirtyState();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});

		Button deleteButtonQuery = managedForm.getToolkit().createButton(
				compositetwo, "Delete", SWT.PUSH);
		deleteButtonQuery.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				false, false, 1, 1));
		deleteButtonQuery.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				
				selectedIndexQuery = queryTable.getSelectionIndex();
				queryList.remove(selectedIndexQuery);
			    viewerQuery.setInput(queryList.toArray());
				viewerQuery.refresh();
				setPageDirty(true);
				updateDirtyState();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				
			}
		});

		form.updateToolBar();
		form.reflow(true);
	}

	private void updateInputTable(Input input, boolean edit) {
		Input m = input;

		if (!edit) {
			inputList.add(m);
		} else if (edit) {
			inputList.remove(selectedIndex);
			inputList.add(selectedIndex, m);
		}
		if (inputList.size() > 0) {
			viewer.setInput(inputList.toArray());
			viewer.refresh();
		}

	}

	private void initInputTable(Composite composite, IManagedForm managedForm) {
		final Table table = managedForm.getToolkit().createTable(
				composite,
				SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION
						| SWT.BORDER | SWT.VIRTUAL);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		inputTable = table;
		viewer = new TableViewer(table);
		GridData db = new GridData(SWT.NONE, SWT.TOP, true, true, 4, 10);
		db.horizontalSpan = 2;
		table.setLayoutData(db);

		TableViewerColumn viewerColumn = new TableViewerColumn(viewer,
				SWT.NONE, 0);
		viewerColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Input p = (Input) element;
				if (p != null) {
					return p.getTopic();
				} else
					return "";
			}
		});
		viewerColumn.getColumn().setWidth(300);
		viewerColumn.getColumn().setText("Topic");
		TableViewerColumn viewerColumnBrokerName = new TableViewerColumn(viewer,
				SWT.NONE, 1);
		viewerColumnBrokerName.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Input p = (Input) element;
				if (p != null) {
					return p.getBrokerName();
				} else
					return "";
			}

		});
		viewerColumnBrokerName.getColumn().setWidth(300);
		viewerColumnBrokerName.getColumn().setText("Broker Name");
		TableViewerColumn viewerColumnStream = new TableViewerColumn(viewer,
				SWT.NONE, 2);
		viewerColumnStream.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Input p = (Input) element;
				if (p != null) {
					return p.getInputMapping().getStream();
				} else
					return "";
			}
		});
		viewerColumnStream.getColumn().setWidth(300);
		viewerColumnStream.getColumn().setText("Stream");
		viewer.setContentProvider(new ArrayContentProvider());
		viewer.setInput(inputList.toArray());
		table.setItemCount(3);
		table.addListener(SWT.SetData, new Listener() {
			public void handleEvent(Event event) {

			}

		});

		table.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
			

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				

			}
		});

	}

	private void initQueryTable(Composite composite, IManagedForm managedForm) {
		final Table table = managedForm.getToolkit().createTable(
				composite,
				SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION
						| SWT.BORDER | SWT.VIRTUAL);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		queryTable = table;
		viewerQuery = new TableViewer(table);
		GridData dbone = new GridData(SWT.NONE, SWT.TOP, true, true, 4, 10);
		dbone.horizontalSpan = 2;
		table.setLayoutData(dbone);

		TableViewerColumn viewerColumn = new TableViewerColumn(viewerQuery,
				SWT.NONE, 0);
		viewerColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Query q = (Query) element;
				if (q != null) {
					return q.getName();
				} else
					return "";
			}
		});
		viewerColumn.getColumn().setWidth(300);
		viewerColumn.getColumn().setText("Query Name");
		TableViewerColumn viewerColumnType = new TableViewerColumn(viewerQuery,
				SWT.NONE, 1);
		viewerColumnType.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Query q = (Query) element;
				if (q != null) {
					return q.getExpression().getType();
				} else
					return "";

			}

		});
		viewerColumnType.getColumn().setWidth(300);
		viewerColumnType.getColumn().setText("Expression Type");
		TableViewerColumn viewerColumnTopic = new TableViewerColumn(viewerQuery,
				SWT.NONE, 2);
		viewerColumnTopic.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Query q = (Query) element;
				if (q != null) {
					return q.getOutput().getTopic();
				} else
					return "";

			}
		});
		viewerColumnTopic.getColumn().setWidth(300);
		viewerColumnTopic.getColumn().setText("OutPut Topic");
		viewerQuery.setContentProvider(new ArrayContentProvider());
		viewerQuery.setInput(queryList.toArray());
		table.setItemCount(3);
		table.addListener(SWT.SetData, new Listener() {
			public void handleEvent(Event event) {

			}

		});

		table.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				

			}
		});

	}

	private void updateQueryTable(Query query, boolean edit) {

	

		if (!edit) {
			
			
			queryList.add(query);
			
			
			} else if (edit) {
				
			queryList.remove(selectedIndexQuery);
			queryList.add(selectedIndexQuery, query);
				
			
		}
		viewerQuery.setInput(queryList.toArray());
		viewerQuery.refresh();
	}

	private void writeTOFile(Bucket bucket) throws IOException,
			XMLStreamException {

		String templateContent = BucketHelper.bucketToOM(bucket).toString();
		templateContent = templateContent.replace("<![CDATA[", "");
		templateContent = templateContent.replace("]]>", "");
		templateContent = format(templateContent);
		templateContent = templateContent.replace(
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "");
		templateContent = templateContent.replaceAll("&gt;", ">");
		templateContent = templateContent.replaceAll("&lt;", "<");
		FileUtils.writeContent(cepTemplateFile, templateContent);

	}

	private Bucket readFromFile(String path) throws XMLStreamException,
		FactoryConfigurationError, CEPConfigurationException, IOException {
		File bucketFile = new File(path);
		BufferedInputStream inputStream = null;
		OMElement bucketElement = null;
		inputStream = new BufferedInputStream(new FileInputStream(bucketFile));
		XMLStreamReader parser = XMLInputFactory.newInstance()
				.createXMLStreamReader(inputStream);
		StAXOMBuilder builder = new StAXOMBuilder(parser);
		bucketElement = builder.getDocumentElement();
		bucketElement.build();
		inputStream.close();
		Bucket bucket = BucketHelper.fromOM(bucketElement);
		return bucket;
	}

	private void updateDesignChanges(Bucket bucket) {
		String name = bucket.getName();
		String description = bucket.getDescription();
		String engineProvider = bucket.getEngineProvider();
		boolean isOverWrte = bucket.isOverWriteRegistry();
		List<Input> input =  bucket.getInputs();
		List<Query> query =  bucket.getQueries();

		txtBucketName.setText(name);
		txtDescription.setText(description);
		if (engineProvider
				.equals(CEPArtifactConstants.WIZARD_OPTION_DROOLS_FUSION_CEP_RUNTIME)) {
			engineCombo
					.setText(CEPArtifactConstants.WIZARD_OPTION_DROOLS_FUSION_CEP_RUNTIME);

		} else if (engineProvider
				.equals(CEPArtifactConstants.WIZARD_OPTION_ESPER_CEP_RUNTIME)) {
			engineCombo
					.setText(CEPArtifactConstants.WIZARD_OPTION_ESPER_CEP_RUNTIME);
		}

		if (isOverWrte) {
			overWriteChecked.setSelection(true);
			overWriteRegistry = true;
		} else {
			overWriteChecked.setSelection(false);
			overWriteRegistry = false;
		}
		if (input != null) {
			inputList = input;
			viewer.setInput(inputList.toArray());
			viewer.refresh();
		}
		if (query != null) {
		
			queryList = query;
			
			
			viewerQuery.setInput(queryList.toArray());
			viewerQuery.refresh();
		}

	}

	private Document parseXmlFile(String in) {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			InputSource is = new InputSource(new StringReader(in));
			return (Document) db.parse(is);
		} catch (ParserConfigurationException e) {
			throw new RuntimeException(e);
		} catch (SAXException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

	private String format(String unformattedXml) {

		try {
			final Document document = parseXmlFile(unformattedXml);

			OutputFormat format = new OutputFormat(document);
			format.setLineWidth(65);
			format.setIndenting(true);
			format.setIndent(2);
			Writer out = new StringWriter();
			XMLSerializer serializer = new XMLSerializer(out, format);
			serializer.serialize(document);

			return out.toString();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public boolean isPageDirty() {
		return pageDirty;
	}

	public void setPageDirty(boolean isPageDirty) {
		this.pageDirty = isPageDirty;
	}

	public void updateDirtyState() {
		((CEPProjectEditor) getEditor()).updateDirtyState();
		;
	}

	public boolean isDirty() {
		return isPageDirty();
	}

	public String getBucketName() {
		return bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getBucketDescription() {
		return bucketDescription;
	}

	public void setBucketDescription(String bucketDescription) {
		this.bucketDescription = bucketDescription;
	}

	public String getBucketNameSpace() {
		return bucketNameSpace;
	}

	public void setBucketNameSpace(String bucketNameSpace) {
		this.bucketNameSpace = bucketNameSpace;
	}

	public String getBucketEngineProvider() {
		return bucketEngineProvider;
	}

	public void setBucketEngineProvider(String bucketEngineProvider) {
		this.bucketEngineProvider = bucketEngineProvider;
	}

	public boolean isOverWriteRegistry() {
		return overWriteRegistry;
	}

	public void setOverWriteRegistry(boolean overWriteRegistry) {
		this.overWriteRegistry = overWriteRegistry;
	}

	public void exportCar() {
		MessageBox exportMsg = new MessageBox(PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getShell(), SWT.ICON_INFORMATION);
		exportMsg.setText("WSO2 Platform Distribution");
		String finalFileName = String.format("%s_%s.car", parentPrj.getModel()
				.getArtifactId(), parentPrj.getModel().getVersion());
		try {
			saveConfigurationFile();
			IResource CarbonArchive = ExportUtil.BuildCAppProject(pomFileRes
					.getProject());
			DirectoryDialog dirDlg = new DirectoryDialog(PlatformUI
					.getWorkbench().getActiveWorkbenchWindow().getShell());
			String dirName = dirDlg.open();
			if (dirName != null) {
				File destFileName = new File(dirName, finalFileName);
				FileUtils.copy(CarbonArchive.getLocation().toFile(),
						destFileName);
				// exportMsg.setMessage("archive created successfully at " +
				// destFileName );
				// exportMsg.open();
			}
		} catch (Exception e) {
			exportMsg
					.setMessage("Error occurred while exporting the archive :\n"
							+ e.getMessage());
			exportMsg.open();
		}
	}

	public void refreshForm() throws Exception  {
		initContent();
		updateDesignChanges(readFromFile(outputfileLocation));
		

	}

}
