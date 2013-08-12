package temp;

import java.io.File;

import org.wso2.datamapper.core.DataMapper;

public class Example {

	public static void main(String[] args) {
		
		DataMapper configHandler = new DataMapper();
		configHandler.domapping("xml", new File("./resource/mapping_rules"),new File("./resource/input.xml"));

	}

}
