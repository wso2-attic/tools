package temp;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;
import org.apache.axiom.om.OMElement;
import org.wso2.datamapper.parsers.MappingBaseListener;
import org.wso2.datamapper.parsers.MappingParser.ArgContext;
import org.wso2.datamapper.parsers.MappingParser.FunctionContext;
import org.wso2.datamapper.parsers.MappingParser.FunctionnameContext;
import org.wso2.datamapper.parsers.MappingParser.OutputelementContext;
import org.wso2.datamapper.parsers.MappingParser.StatContext;
import org.wso2.datamapper.core.InputDataHandler;
import org.wso2.datamapper.dataModels.OutputDataModel;

public class FunctionExecuter extends MappingBaseListener {

	private String outputElement;
	private String funcName;
	private List<OMElement> argList;
	private Map<String,String> resultMap;
	private InputDataHandler inputHandler;
	private String output = "";
	private OutputDataModel outDataModel;

	public FunctionExecuter() {
		outDataModel = new OutputDataModel();
		argList = new ArrayList<OMElement>();
		resultMap = new HashMap<String, String>();
		inputHandler = new InputDataHandler("xml");
		inputHandler.setInputFile(new File("./resource/input.xml"));
	}

	public Map<String, String> getResultMap() {
		return resultMap;
	}

	@Override
	public void exitArg(@NotNull ArgContext ctx) {
		super.exitArg(ctx);

		String arg = ctx.getText();
		this.argList = inputHandler.getInputvalues(arg);	
		Iterator<OMElement> it = this.argList.listIterator();
		OMElement element;
		
		while (it.hasNext()) {
			element = it.next();
			if(this.funcName.equals("concat")){
				output = output.concat(" "+element.getText());
			}	
		}
	}

	@Override
	public void exitStat(@NotNull StatContext ctx) {
		resultMap.put(outputElement, output);
	}

	@Override
	public void exitFunction(@NotNull FunctionContext ctx) {		
		System.out.println(this.outputElement+" == "+this.output);
		resultMap.put(this.outputElement, this.output);
	}

	@Override
	public void exitOutputelement(@NotNull OutputelementContext ctx) {
		this.outputElement = ctx.getText();
	}

	@Override
	public void exitFunctionname(@NotNull FunctionnameContext ctx) {
		this.funcName = ctx.getText();
		this.output = "";
	}

	
	
}
