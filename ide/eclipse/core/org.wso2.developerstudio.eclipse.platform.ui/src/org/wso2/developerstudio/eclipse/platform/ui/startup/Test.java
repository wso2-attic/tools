/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.eclipse.platform.ui.startup;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Display display = new Display ();
		Shell shell = new Shell (display);
		ToolBar bar = new ToolBar (shell, SWT.BORDER);
		for (int i=0; i<4; i++) {
			ToolItem item = new ToolItem (bar, 0);
			item.setText ("Item " + i);
		}
		ToolItem sep = new ToolItem (bar, SWT.SEPARATOR);
		int start = bar.getItemCount ();
		for (int i=start; i<start+4; i++) {
			ToolItem item = new ToolItem (bar, 0);
			item.setText ("Item " + i);
		}
		Combo combo = new Combo (bar, SWT.READ_ONLY);
		for (int i=0; i<4; i++) {
			combo.add ("Item " + i);
		}
		combo.pack ();
		sep.setWidth (combo.getSize ().x);
		sep.setControl (combo);
		bar.pack ();
		shell.pack ();
		shell.open ();
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		display.dispose ();

//		Display display = new Display ();
//		final Shell shell = new Shell (display);
//		shell.setLayout (new FillLayout ());
//		Listener listener = new Listener () {
//			public void handleEvent (Event e) {
//				Control [] children = shell.getChildren ();
//				for (int i=0; i<children.length; i++) {
//					Control child = children [i];
//					if (e.widget != child && child instanceof Button && (child.getStyle () & SWT.TOGGLE) != 0) {
//						((Button) child).setSelection (false);
//					}
//				}
//				((Button) e.widget).setSelection (true);
//			}
//		};
//		for (int i=0; i<20; i++) {
//			Button button = new Button (shell, SWT.TOGGLE);
//			button.setText ("B" + i);
//			button.addListener (SWT.Selection, listener);
//			if (i == 0) button.setSelection (true);
//		}
//		shell.pack ();
//		shell.open ();
//		while (!shell.isDisposed ()) {
//			if (!display.readAndDispatch ()) display.sleep ();
//		}
//		display.dispose ();

	}

}
