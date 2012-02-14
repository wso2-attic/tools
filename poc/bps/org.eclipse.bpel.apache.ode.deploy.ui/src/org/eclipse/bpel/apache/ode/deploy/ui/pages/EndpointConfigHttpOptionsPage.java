
/**
 * 
 */
package org.eclipse.bpel.apache.ode.deploy.ui.pages;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * @author ishan
 *
 */
public class EndpointConfigHttpOptionsPage extends WizardPage {

	Text firstNameText;
    Text secondNameText;
    Text protocolVersion;
    Text protocolContentCharset;
    Text connectionTimeout;
    Text socketTimeout;
    Text protocolRedirects;
    
    protected EndpointConfigHttpOptionsPage(String pageName) {
             super(pageName);
             //setTitle("Endpoint Configuration");
             setDescription("Endpoint Options -> Http Options");
    }
    
    public void createControl(Composite parent) {
             Composite composite = new Composite(parent, SWT.NONE);
             GridLayout layout = new GridLayout();
              layout.numColumns = 2;
              composite.setLayout(layout);
              //setControl(composite);
              
              GridData gd = new GridData();
              gd.horizontalSpan= 2;
              Button reqstChunkBtn = new Button(composite, SWT.CHECK);
              reqstChunkBtn.setText("Request Chunk");
              reqstChunkBtn.setLayoutData(gd);
              
              gd = new GridData();
              gd.horizontalSpan= 2;
              Button reqstGzipBtn = new Button(composite, SWT.CHECK);
              reqstGzipBtn.setText("Request gzip");
              reqstGzipBtn.setLayoutData(gd);
              
              gd = new GridData();
              gd.horizontalSpan= 2;
              Button accptGzipBtn = new Button(composite, SWT.CHECK);
              accptGzipBtn.setText("Accept gzip");
              accptGzipBtn.setLayoutData(gd);
              //button.setLayoutData(layout);
              
              //GridLayout newLayout = new GridLayout();
              //newLayout.numColumns = 2;
              //composite.setLayout(newLayout);
              //setControl(composite);
              gd = new GridData();
              gd.horizontalSpan= 1;
              new Label(composite,SWT.NONE).setText("Protocol Versioin");
              protocolVersion = new Text(composite,SWT.NONE);
              protocolVersion.setLayoutData(gd);
              
              gd = new GridData();
              gd.horizontalSpan= 1;
              new Label(composite,SWT.NONE).setText("Protocol Content Charset");
              protocolContentCharset = new Text(composite,SWT.NONE);
              protocolContentCharset.setLayoutData(gd);
              
              gd = new GridData();
              gd.horizontalSpan= 1;
              new Label(composite,SWT.NONE).setText("Connection Timeout");
              connectionTimeout = new Text(composite,SWT.NONE);
              connectionTimeout.setLayoutData(gd);
              
              gd = new GridData();
              gd.horizontalSpan= 1;
              new Label(composite,SWT.NONE).setText("Socket Timeout");
              socketTimeout = new Text(composite,SWT.NONE);
              socketTimeout.setLayoutData(gd);
              
              gd = new GridData();
              gd.horizontalSpan= 1;
              new Label(composite,SWT.NONE).setText("Maximum protocol redirects");
              protocolRedirects = new Text(composite,SWT.NONE);
              protocolRedirects.setLayoutData(gd);
              
              setControl(composite);
    }

}
