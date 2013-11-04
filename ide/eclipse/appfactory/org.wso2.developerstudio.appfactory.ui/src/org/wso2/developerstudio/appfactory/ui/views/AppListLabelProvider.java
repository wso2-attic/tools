/*
 * Copyright (c) 2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.appfactory.ui.views;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.ViewerCell;
import org.wso2.developerstudio.appfactory.core.model.AppVersionInfo;
import org.wso2.developerstudio.appfactory.core.model.ApplicationInfo;
import org.wso2.developerstudio.appfactory.ui.Activator;
import org.wso2.developerstudio.appfactory.ui.utils.Messages;


public class AppListLabelProvider extends StyledCellLabelProvider {
	  @Override
	  public void update(ViewerCell cell) {
	    Object element = cell.getElement();
	    StyledString text = new StyledString();
	    if (element instanceof ApplicationInfo) {
	      ApplicationInfo app = (ApplicationInfo) element;
	      text.append(app.getKey());
	      ImageDescriptor imageDescriptorFromPlugin = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
					 Messages.AppListLabelProvider_0);
	      cell.setImage(imageDescriptorFromPlugin.createImage());
	      
	      if(app.getLableState()==1){
	    	  text.append(Messages.AppListLabelProvider_1, StyledString.DECORATIONS_STYLER);
	      }else if(app.getLableState()==2){
	    	  text.append(Messages.AppListLabelProvider_2, StyledString.COUNTER_STYLER);
	      }else{
	    	  text.append(Messages.AppListLabelProvider_3, StyledString.DECORATIONS_STYLER);
	      }
	    } else {
	      AppVersionInfo version = (AppVersionInfo) element;
	      if(version.isCheckedout()){
	    	  text.append(version.getVersion()+Messages.AppListLabelProvider_4,StyledString.COUNTER_STYLER);
	      }else{
	    	  text.append(version.getVersion()+Messages.AppListLabelProvider_5,StyledString.DECORATIONS_STYLER);
	      }
	      ImageDescriptor imageDescriptorFromPlugin = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
					 Messages.AppListLabelProvider_6);
	      cell.setImage(imageDescriptorFromPlugin.createImage());
	    }
	    cell.setText(text.toString());
	    cell.setStyleRanges(text.getStyleRanges());
	    super.update(cell);
	  }
} 