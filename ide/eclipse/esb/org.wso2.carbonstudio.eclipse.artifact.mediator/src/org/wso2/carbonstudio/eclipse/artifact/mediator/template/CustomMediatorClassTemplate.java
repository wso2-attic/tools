package org.wso2.carbonstudio.eclipse.artifact.mediator.template;


public class CustomMediatorClassTemplate {

public static String getClassTemplete(String packgeName,String className){
		   try{
				StringBuffer buffer = new StringBuffer();
				if(!"".equals(packgeName)){
					buffer.append("package ");
					buffer.append(packgeName);
					buffer.append(";");
					}
				buffer.append("\n\n");
				buffer.append("import org.apache.synapse.MessageContext; \n");
				buffer.append("import org.apache.synapse.mediators.AbstractMediator;\n\n");
				buffer.append("public class " + className +" extends AbstractMediator { \n\n\t" );
				//buffer.append("@Override \n\t");
				buffer.append("public boolean mediate(MessageContext context) { \n\t\t");
				buffer.append("// TODO Implement your mediation logic here \n\t\t");
				buffer.append("return true;\n\t");
				buffer.append("}\n}\n");
				return buffer.toString();
            }catch (Exception e){
              e.printStackTrace();
              return"";
            }
	}
}
