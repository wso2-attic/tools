package org.wso2.developerstudio.eclipse.gmf.esb.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Tool;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.PaletteStack;
import org.eclipse.gef.palette.PaletteToolbar;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.tools.ConnectionBendpointTracker;
import org.eclipse.gef.tools.ConnectionDragCreationTool;
import org.eclipse.gef.tools.ConnectionEndpointTracker;
import org.eclipse.gef.tools.MarqueeDragTracker;
import org.eclipse.gef.tools.MarqueeSelectionTool;
import org.eclipse.gef.tools.SimpleDragTracker;
import org.eclipse.gef.tools.TargetingTool;
import org.eclipse.gef.ui.palette.PaletteContextMenuProvider;
import org.eclipse.gmf.runtime.diagram.ui.internal.services.palette.PaletteToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.tools.ConnectionCreationTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.action.Separator;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.wso2.developerstudio.eclipse.gmf.esb.AddressEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractEndpoint;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractEndpointInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediatorInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.ToolPalleteDetails;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.AddressEndPointEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.AddressEndPointInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyFaultInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyInputConnectorEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyServiceContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyServiceEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyServiceFaultContainerEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

/**
 * @generated
 */
public class EsbPaletteFactory {

	/**
	 * @generated NOT
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNodes1Group());
		paletteRoot.add(createMediators2Group());
		paletteRoot.add(createEndPoints3Group());
		paletteRoot.add(createLinks4Group());
		//paletteRoot.add(createHelpers5Group());
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated NOT
	 */
	private PaletteContainer createNodes1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Nodes1Group_title);
		paletteContainer.setId("createNodes1Group"); //$NON-NLS-1$
		//paletteContainer.add(createEsbServer1CreationTool());
		paletteContainer.add(createProxyService2CreationTool());
		//paletteContainer.add(createMessageMediator3CreationTool());
		paletteContainer.add(createSequence4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Mediators" palette tool group
	 * @generated NOT
	 */
	private PaletteContainer createMediators2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Mediators2Group_title);
		paletteContainer.setId("createMediators2Group"); //$NON-NLS-1$	

		paletteContainer.add(createLogMediator3CreationTool());
		paletteContainer.add(createDropMediator1CreationTool());
		paletteContainer.add(createPropertyMediator4CreationTool());
		paletteContainer.add(createEnrichMediator5CreationTool());
		paletteContainer.add(createEventMediator8CreationTool());
		paletteContainer.add(createSendMediator19CreationTool());
		paletteContainer.add(createCallTemplateMediator33CreationTool());
		paletteContainer.add(createEnqueueMediator35CreationTool());

		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createFilterMediator2CreationTool());
		paletteContainer.add(createSwitchMediator7CreationTool());
		paletteContainer.add(createValidateMediator37CreationTool());
		paletteContainer.add(createRouterMediator38CreationTool());
		paletteContainer.add(createConditionalRouterMediator39CreationTool());

		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createXSLTMediator6CreationTool());
		paletteContainer.add(createXQueryMediator14CreationTool());
		paletteContainer.add(createFaultMediator13CreationTool());
		paletteContainer.add(createHeaderMediator20CreationTool());
		paletteContainer.add(createPayloadFactoryMediator34CreationTool());
		paletteContainer.add(createURLRewriteMediator36CreationTool());

		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createDBLookupMediator16CreationTool());
		paletteContainer.add(createDBReportMediator17CreationTool());
		paletteContainer.add(createEntitlementMediator9CreationTool());
		paletteContainer.add(createCloneMediator21CreationTool());
		paletteContainer.add(createIterateMediator22CreationTool());
		paletteContainer.add(createCacheMediator23CreationTool());
		paletteContainer.add(createAggregateMediator24CreationTool());
		paletteContainer.add(createCalloutMediator25CreationTool());
		paletteContainer.add(createTransactionMediator26CreationTool());
		paletteContainer.add(createThrottleMediator27CreationTool());
		paletteContainer.add(createRMSequenceMediator28CreationTool());
		paletteContainer.add(createOAuthMediator29CreationTool());
		paletteContainer.add(createRuleMediator30CreationTool());
		paletteContainer.add(createStoreMediator31CreationTool());
		paletteContainer.add(createBuilderMediator32CreationTool());

		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createClassMediator10CreationTool());
		paletteContainer.add(createSpringMediator11CreationTool());
		paletteContainer.add(createScriptMediator12CreationTool());
		paletteContainer.add(createSmooksMediator18CreationTool());
		paletteContainer.add(createCommandMediator15CreationTool());

		return paletteContainer;
	}

	/**
	 * Creates "EndPoints" palette tool group
	 * @generated NOT
	 */
	private PaletteContainer createEndPoints3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.EndPoints3Group_title);
		paletteContainer.setId("createEndPoints3Group"); //$NON-NLS-1$
		paletteContainer.add(createDefaultEndPoint1CreationTool());
		paletteContainer.add(createAddressEndPoint2CreationTool());
		//	paletteContainer.add(createFailoverEndPoint3CreationTool());
		paletteContainer.add(createWSDLEndPoint4CreationTool());
		//	paletteContainer.add(createLoadBalanceEndPoint5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Links" palette tool group
	 * @generated
	 */
	private PaletteContainer createLinks4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Links4Group_title);
		paletteContainer.setId("createLinks4Group"); //$NON-NLS-1$
		paletteContainer.add(createEsbLink1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Helpers" palette tool group
	 * @generated
	 */
	private PaletteContainer createHelpers5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Helpers5Group_title);
		paletteContainer.setId("createHelpers5Group"); //$NON-NLS-1$
		paletteContainer.add(createMergeNode1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEsbServer1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EsbServer1CreationTool_title,
				Messages.EsbServer1CreationTool_desc,
				Collections.singletonList(EsbElementTypes.EsbServer_2001));
		entry.setId("createEsbServer1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.EsbServer_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProxyService2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ProxyService2CreationTool_title,
				Messages.ProxyService2CreationTool_desc,
				Collections.singletonList(EsbElementTypes.ProxyService_3001));
		entry.setId("createProxyService2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.ProxyService_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessageMediator3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MessageMediator3CreationTool_title,
				Messages.MessageMediator3CreationTool_desc,
				Collections.singletonList(EsbElementTypes.MessageMediator_3045));
		entry.setId("createMessageMediator3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.MessageMediator_3045));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSequence4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Sequence4CreationTool_title,
				Messages.Sequence4CreationTool_desc,
				Collections.singletonList(EsbElementTypes.Sequence_3503));
		entry.setId("createSequence4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.Sequence_3503));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDropMediator1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DropMediator1CreationTool_title,
				Messages.DropMediator1CreationTool_desc,
				Collections.singletonList(EsbElementTypes.DropMediator_3491));
		entry.setId("createDropMediator1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.DropMediator_3491));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFilterMediator2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FilterMediator2CreationTool_title,
				Messages.FilterMediator2CreationTool_desc,
				Collections.singletonList(EsbElementTypes.FilterMediator_3494));
		entry.setId("createFilterMediator2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.FilterMediator_3494));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLogMediator3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LogMediator3CreationTool_title,
				Messages.LogMediator3CreationTool_desc,
				Collections.singletonList(EsbElementTypes.LogMediator_3495));
		entry.setId("createLogMediator3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.LogMediator_3495));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPropertyMediator4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PropertyMediator4CreationTool_title,
				Messages.PropertyMediator4CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.PropertyMediator_3492));
		entry.setId("createPropertyMediator4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.PropertyMediator_3492));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnrichMediator5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EnrichMediator5CreationTool_title,
				Messages.EnrichMediator5CreationTool_desc,
				Collections.singletonList(EsbElementTypes.EnrichMediator_3496));
		entry.setId("createEnrichMediator5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.EnrichMediator_3496));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createXSLTMediator6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.XSLTMediator6CreationTool_title,
				Messages.XSLTMediator6CreationTool_desc,
				Collections.singletonList(EsbElementTypes.XSLTMediator_3497));
		entry.setId("createXSLTMediator6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.XSLTMediator_3497));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSwitchMediator7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SwitchMediator7CreationTool_title,
				Messages.SwitchMediator7CreationTool_desc,
				Collections.singletonList(EsbElementTypes.SwitchMediator_3498));
		entry.setId("createSwitchMediator7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.SwitchMediator_3498));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEventMediator8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EventMediator8CreationTool_title,
				Messages.EventMediator8CreationTool_desc,
				Collections.singletonList(EsbElementTypes.EventMediator_3504));
		entry.setId("createEventMediator8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.EventMediator_3504));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntitlementMediator9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EntitlementMediator9CreationTool_title,
				Messages.EntitlementMediator9CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.EntitlementMediator_3505));
		entry.setId("createEntitlementMediator9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.EntitlementMediator_3505));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClassMediator10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ClassMediator10CreationTool_title,
				Messages.ClassMediator10CreationTool_desc,
				Collections.singletonList(EsbElementTypes.ClassMediator_3506));
		entry.setId("createClassMediator10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.ClassMediator_3506));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSpringMediator11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SpringMediator11CreationTool_title,
				Messages.SpringMediator11CreationTool_desc,
				Collections.singletonList(EsbElementTypes.SpringMediator_3507));
		entry.setId("createSpringMediator11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.SpringMediator_3507));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createScriptMediator12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ScriptMediator12CreationTool_title,
				Messages.ScriptMediator12CreationTool_desc,
				Collections.singletonList(EsbElementTypes.ScriptMediator_3508));
		entry.setId("createScriptMediator12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.ScriptMediator_3508));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFaultMediator13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FaultMediator13CreationTool_title,
				Messages.FaultMediator13CreationTool_desc,
				Collections.singletonList(EsbElementTypes.FaultMediator_3509));
		entry.setId("createFaultMediator13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.FaultMediator_3509));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createXQueryMediator14CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.XQueryMediator14CreationTool_title,
				Messages.XQueryMediator14CreationTool_desc,
				Collections.singletonList(EsbElementTypes.XQueryMediator_3510));
		entry.setId("createXQueryMediator14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.XQueryMediator_3510));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCommandMediator15CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CommandMediator15CreationTool_title,
				Messages.CommandMediator15CreationTool_desc,
				Collections.singletonList(EsbElementTypes.CommandMediator_3511));
		entry.setId("createCommandMediator15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.CommandMediator_3511));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDBLookupMediator16CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DBLookupMediator16CreationTool_title,
				Messages.DBLookupMediator16CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.DBLookupMediator_3512));
		entry.setId("createDBLookupMediator16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.DBLookupMediator_3512));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDBReportMediator17CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DBReportMediator17CreationTool_title,
				Messages.DBReportMediator17CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.DBReportMediator_3513));
		entry.setId("createDBReportMediator17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.DBReportMediator_3513));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSmooksMediator18CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SmooksMediator18CreationTool_title,
				Messages.SmooksMediator18CreationTool_desc,
				Collections.singletonList(EsbElementTypes.SmooksMediator_3514));
		entry.setId("createSmooksMediator18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.SmooksMediator_3514));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSendMediator19CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SendMediator19CreationTool_title,
				Messages.SendMediator19CreationTool_desc,
				Collections.singletonList(EsbElementTypes.SendMediator_3515));
		entry.setId("createSendMediator19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.SendMediator_3515));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHeaderMediator20CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.HeaderMediator20CreationTool_title,
				Messages.HeaderMediator20CreationTool_desc,
				Collections.singletonList(EsbElementTypes.HeaderMediator_3516));
		entry.setId("createHeaderMediator20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.HeaderMediator_3516));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCloneMediator21CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CloneMediator21CreationTool_title,
				Messages.CloneMediator21CreationTool_desc,
				Collections.singletonList(EsbElementTypes.CloneMediator_3517));
		entry.setId("createCloneMediator21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.CloneMediator_3517));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIterateMediator22CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IterateMediator22CreationTool_title,
				Messages.IterateMediator22CreationTool_desc,
				Collections.singletonList(EsbElementTypes.IterateMediator_3519));
		entry.setId("createIterateMediator22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.IterateMediator_3519));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCacheMediator23CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CacheMediator23CreationTool_title,
				Messages.CacheMediator23CreationTool_desc,
				Collections.singletonList(EsbElementTypes.CacheMediator_3518));
		entry.setId("createCacheMediator23CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.CacheMediator_3518));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAggregateMediator24CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AggregateMediator24CreationTool_title,
				Messages.AggregateMediator24CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.AggregateMediator_3525));
		entry.setId("createAggregateMediator24CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.AggregateMediator_3525));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCalloutMediator25CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CalloutMediator25CreationTool_title,
				Messages.CalloutMediator25CreationTool_desc,
				Collections.singletonList(EsbElementTypes.CalloutMediator_3520));
		entry.setId("createCalloutMediator25CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.CalloutMediator_3520));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransactionMediator26CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TransactionMediator26CreationTool_title,
				Messages.TransactionMediator26CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.TransactionMediator_3521));
		entry.setId("createTransactionMediator26CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.TransactionMediator_3521));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createThrottleMediator27CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ThrottleMediator27CreationTool_title,
				Messages.ThrottleMediator27CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.ThrottleMediator_3493));
		entry.setId("createThrottleMediator27CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.ThrottleMediator_3493));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRMSequenceMediator28CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RMSequenceMediator28CreationTool_title,
				Messages.RMSequenceMediator28CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.RMSequenceMediator_3522));
		entry.setId("createRMSequenceMediator28CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.RMSequenceMediator_3522));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOAuthMediator29CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OAuthMediator29CreationTool_title,
				Messages.OAuthMediator29CreationTool_desc,
				Collections.singletonList(EsbElementTypes.OAuthMediator_3524));
		entry.setId("createOAuthMediator29CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.OAuthMediator_3524));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRuleMediator30CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RuleMediator30CreationTool_title,
				Messages.RuleMediator30CreationTool_desc,
				Collections.singletonList(EsbElementTypes.RuleMediator_3523));
		entry.setId("createRuleMediator30CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.RuleMediator_3523));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createStoreMediator31CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StoreMediator31CreationTool_title,
				Messages.StoreMediator31CreationTool_desc,
				Collections.singletonList(EsbElementTypes.StoreMediator_3588));
		entry.setId("createStoreMediator31CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.StoreMediator_3588));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createBuilderMediator32CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BuilderMediator32CreationTool_title,
				Messages.BuilderMediator32CreationTool_desc,
				Collections.singletonList(EsbElementTypes.BuilderMediator_3591));
		entry.setId("createBuilderMediator32CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.BuilderMediator_3591));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createCallTemplateMediator33CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CallTemplateMediator33CreationTool_title,
				Messages.CallTemplateMediator33CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.CallTemplateMediator_3594));
		entry.setId("createCallTemplateMediator33CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.CallTemplateMediator_3594));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPayloadFactoryMediator34CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PayloadFactoryMediator34CreationTool_title,
				Messages.PayloadFactoryMediator34CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.PayloadFactoryMediator_3597));
		entry.setId("createPayloadFactoryMediator34CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.PayloadFactoryMediator_3597));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnqueueMediator35CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EnqueueMediator35CreationTool_title,
				Messages.EnqueueMediator35CreationTool_desc,
				Collections.singletonList(EsbElementTypes.EnqueueMediator_3600));
		entry.setId("createEnqueueMediator35CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.EnqueueMediator_3600));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createURLRewriteMediator36CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.URLRewriteMediator36CreationTool_title,
				Messages.URLRewriteMediator36CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.URLRewriteMediator_3620));
		entry.setId("createURLRewriteMediator36CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.URLRewriteMediator_3620));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createValidateMediator37CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ValidateMediator37CreationTool_title,
				Messages.ValidateMediator37CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.ValidateMediator_3623));
		entry.setId("createValidateMediator37CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.ValidateMediator_3623));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRouterMediator38CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RouterMediator38CreationTool_title,
				Messages.RouterMediator38CreationTool_desc,
				Collections.singletonList(EsbElementTypes.RouterMediator_3628));
		entry.setId("createRouterMediator38CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.RouterMediator_3628));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConditionalRouterMediator39CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ConditionalRouterMediator39CreationTool_title,
				Messages.ConditionalRouterMediator39CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.ConditionalRouterMediator_3635));
		entry.setId("createConditionalRouterMediator39CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.ConditionalRouterMediator_3635));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDefaultEndPoint1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DefaultEndPoint1CreationTool_title,
				Messages.DefaultEndPoint1CreationTool_desc,
				Collections.singletonList(EsbElementTypes.DefaultEndPoint_3609));
		entry.setId("createDefaultEndPoint1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.DefaultEndPoint_3609));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAddressEndPoint2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AddressEndPoint2CreationTool_title,
				Messages.AddressEndPoint2CreationTool_desc,
				Collections.singletonList(EsbElementTypes.AddressEndPoint_3610));
		entry.setId("createAddressEndPoint2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.AddressEndPoint_3610));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFailoverEndPoint3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FailoverEndPoint3CreationTool_title,
				Messages.FailoverEndPoint3CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.FailoverEndPoint_3611));
		entry.setId("createFailoverEndPoint3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.FailoverEndPoint_3611));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWSDLEndPoint4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WSDLEndPoint4CreationTool_title,
				Messages.WSDLEndPoint4CreationTool_desc,
				Collections.singletonList(EsbElementTypes.WSDLEndPoint_3612));
		entry.setId("createWSDLEndPoint4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.WSDLEndPoint_3612));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLoadBalanceEndPoint5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LoadBalanceEndPoint5CreationTool_title,
				Messages.LoadBalanceEndPoint5CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.LoadBalanceEndPoint_3613));
		entry.setId("createLoadBalanceEndPoint5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.LoadBalanceEndPoint_3613));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEsbLink1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.EsbLink1CreationTool_title,
				Messages.EsbLink1CreationTool_desc,
				Collections.singletonList(EsbElementTypes.EsbLink_4001));
		entry.setId("createEsbLink1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.EsbLink_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMergeNode1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MergeNode1CreationTool_title,
				Messages.MergeNode1CreationTool_desc,
				Collections.singletonList(EsbElementTypes.MergeNode_3013));
		entry.setId("createMergeNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.MergeNode_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	public void addDefinedSequences(IEditorPart editor) {
		ArrayList<String> definedSequences = new ArrayList<String>();
		if (editor != null) {
			IFileEditorInput input = (IFileEditorInput) editor.getEditorInput();
			IFile file = input.getFile();
			IProject activeProject = file.getProject();
			try {
				for (int j = 0; j < activeProject.members().length; ++j) {

					Pattern p = Pattern.compile(".esb_diagram");
					Matcher m = p.matcher(activeProject.members()[j].getName());
					StringBuffer sb = new StringBuffer();
					boolean result = m.find();

					if (result) {
						String[] splittedFilename = activeProject.members()[j]
								.getName().split(".esb_diagram");
						if (splittedFilename[0] != null) {
							String[] tempName = splittedFilename[0]
									.split("sequence_");
							definedSequences.add(tempName[1].trim());
						}
					}
				}
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		if ((((DiagramEditDomain) ((EsbDiagramEditor) editor)
				.getDiagramEditDomain()).getPaletteViewer().getPaletteRoot()
				.getChildren().size() - 1) != ToolPalleteDetails.SEQUENCE) {
			((DiagramEditDomain) ((EsbDiagramEditor) editor)
					.getDiagramEditDomain()).getPaletteViewer()
					.getPaletteRoot().add(createSequenceGroup());
		}

		for (int k = 0; k < definedSequences.size(); ++k) {
			((PaletteContainer) ((DiagramEditDomain) ((EsbDiagramEditor) editor)
					.getDiagramEditDomain()).getPaletteViewer()
					.getPaletteRoot().getChildren()
					.get(ToolPalleteDetails.SEQUENCE))
					.add(createDefinedSequenceCreationTool(definedSequences
							.get(k)));
			SequenceEditPart.definedSequenceNames.add(definedSequences.get(k));
		}

	}

	private PaletteContainer createSequenceGroup() {
		PaletteDrawer paletteContainer = new PaletteDrawer("Sequences");
		paletteContainer.setId("Sequences"); //$NON-NLS-1$

		return paletteContainer;
	}

	private ToolEntry createDefinedSequenceCreationTool(String name) {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EsbElementTypes.Sequence_3503);
		/*	types.add(EsbElementTypes.Sequence_3187);
			types.add(EsbElementTypes.Sequence_3254);
			types.add(EsbElementTypes.Sequence_3375);*/
		NodeToolEntry entry = new NodeToolEntry(name,
				Messages.Sequence4CreationTool_desc, types);
		entry.setId("createSequence4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.Sequence_3503));
		entry.setLargeIcon(entry.getSmallIcon());

		return entry;
	}

	/**
	 * @generated NOT
	 */
	public static class NodeToolEntry extends PaletteToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated NOT
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			//super(title, description, null, null);
			super(null, title, null);
			this.setDescription(description);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated NOT
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes) {

				public void mouseDown(MouseEvent me, EditPartViewer viewer) {
					super.mouseDown(me, viewer);

				}

				public void mouseUp(MouseEvent me, EditPartViewer viewer) {
					super.mouseUp(me, viewer);
				}

				public void mouseDrag(MouseEvent me, EditPartViewer viewer) {
					super.mouseDrag(me, viewer);
				}

				public void mouseHover(MouseEvent me, EditPartViewer viewer) {
					super.mouseHover(me, viewer);
				}

				public void mouseMove(MouseEvent me, EditPartViewer viewer) {
					super.mouseMove(me, viewer);
				}

				protected Command getCommand() {
					if (getTargetEditPart() == null) {
						return null;
					}
					if (getTargetEditPart() instanceof AbstractMediator) {
						for (int i = 0; i < ((AbstractMediator) getTargetEditPart())
								.getChildren().size(); ++i) {
							if (((AbstractMediator) getTargetEditPart())
									.getChildren().get(i) instanceof AbstractMediatorInputConnectorEditPart) {
								return ((AbstractMediatorInputConnectorEditPart) ((AbstractMediator) getTargetEditPart())
										.getChildren().get(i))
										.getCommand(getTargetRequest());
							}
						}
					} else if (getTargetEditPart() instanceof AbstractEndpoint) {
						for (int j = 0; j < ((AbstractEndpoint) getTargetEditPart())
								.getChildren().size(); ++j) {
							if (((AbstractEndpoint) getTargetEditPart())
									.getChildren().get(j) instanceof AbstractEndpointInputConnectorEditPart) {
								return ((AbstractEndpointInputConnectorEditPart) ((AbstractEndpoint) getTargetEditPart())
										.getChildren().get(j))
										.getCommand(getTargetRequest());
							}
						}
					} else if (getTargetEditPart() instanceof ProxyServiceEditPart) {
						for (int i = 0; i < ((ProxyServiceEditPart) getTargetEditPart())
								.getChildren().size(); ++i) {
							int yFaultContainer = ((ProxyServiceFaultContainerEditPart) ((ProxyServiceContainerEditPart) ((ProxyServiceEditPart) getTargetEditPart())
									.getChildren().get(4)).getChildren().get(1))
									.getFigure().getBounds().getLocation().y;
							if ((((ProxyServiceEditPart) getTargetEditPart())
									.getChildren().get(i) instanceof ProxyInputConnectorEditPart)
									&& (getStartLocation().y < yFaultContainer)) {
								return ((ProxyInputConnectorEditPart) ((ProxyServiceEditPart) getTargetEditPart())
										.getChildren().get(i))
										.getCommand(getTargetRequest());
							} else if ((((ProxyServiceEditPart) getTargetEditPart())
									.getChildren().get(i) instanceof ProxyFaultInputConnectorEditPart)
									&& (getStartLocation().y > yFaultContainer)) {
								return ((ProxyFaultInputConnectorEditPart) ((ProxyServiceEditPart) getTargetEditPart())
										.getChildren().get(i))
										.getCommand(getTargetRequest());
							}
						}
					}
					return getTargetEditPart().getCommand(getTargetRequest());
				}
			};
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}