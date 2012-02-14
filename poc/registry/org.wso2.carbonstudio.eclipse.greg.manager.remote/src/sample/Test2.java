package sample;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class Test2 {
	private String menuText="sdfdsf";
	
	public String getText(){
		return menuText;
	}
	
	public static void main (String [] args) {
		
		Test2 t = new Test2();
		try {
			t.getClass().getDeclaredField("menuText").set(t, "Saminda");
			System.out.println(t.getText());
		} catch (IllegalArgumentException e1) {
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoSuchFieldException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.exit(0);
		  Display display = new Display ();
		  final Shell shell = new Shell (display);
		  shell.setLayout(new FillLayout());

		  Button open = new Button (shell, SWT.PUSH);
		  open.setText ("Open Dialog");
		  open.addSelectionListener (new SelectionAdapter () {
		    public void widgetSelected (SelectionEvent e) {
		      final Shell dialog = new Shell (shell, SWT.DIALOG_TRIM);
		      dialog.setLayout (new GridLayout (3, false));

		      final DateTime calendar = new DateTime (dialog, SWT.CALENDAR | SWT.BORDER);
		      final DateTime date = new DateTime (dialog, SWT.DATE | SWT.SHORT);
		      final DateTime time = new DateTime (dialog, SWT.TIME | SWT.SHORT);

		      new Label (dialog, SWT.NONE);
		      new Label (dialog, SWT.NONE);
		      Button ok = new Button (dialog, SWT.PUSH);
		      ok.setText ("OK");
		      ok.setLayoutData(new GridData (SWT.FILL, SWT.CENTER, false, false));
		      ok.addSelectionListener (new SelectionAdapter () {
		        public void widgetSelected (SelectionEvent e) {
		          System.out.println ("Calendar date selected (MM/DD/YYYY) = " + (calendar.getMonth () + 1) + "/" + calendar.getDay () + "/" + calendar.getYear ());
		          System.out.println ("Date selected (MM/YYYY) = " + (date.getMonth () + 1) + "/" + date.getYear ());
		          System.out.println ("Time selected (HH:MM) = " + time.getHours () + ":" + time.getMinutes ());
		          dialog.close ();
		        }
		      });
		      dialog.setDefaultButton (ok);
		      dialog.pack ();
		      dialog.open ();
		    }
		  });
		  shell.pack ();
		  shell.open ();
		  
		  while (!shell.isDisposed ()) {
		    if (!display.readAndDispatch ()) display.sleep ();
		  }
		  display.dispose ();
		}
}
