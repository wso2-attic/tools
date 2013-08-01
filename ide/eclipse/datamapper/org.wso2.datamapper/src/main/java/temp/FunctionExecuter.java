package temp;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;
import org.wso2.datamapper.parsers.MappingBaseListener;
import org.wso2.datamapper.parsers.MappingParser.ArgContext;
import org.wso2.datamapper.parsers.MappingParser.FunctionContext;
import org.wso2.datamapper.parsers.MappingParser.StatContext;
import org.wso2.datamapper.core.InputDataHandler;

public class FunctionExecuter extends MappingBaseListener {

	private String funcName;
	private String result;
	private List<String> argList;
	InputDataHandler inputHandler;

	public FunctionExecuter() {
		result = "";
		argList = new ArrayList<String>();
		inputHandler = new InputDataHandler();
		inputHandler.setInputFile(new File("./resource/input.xml"));
	}

	public String getResult() {
		return result;
	}

	@Override
	public void exitArg(@NotNull ArgContext ctx) {
		super.exitArg(ctx);

		String arg = ctx.getText();
		String argValue = inputHandler.getInputvalue(arg);
		this.argList.add(argValue);

	}

	@Override
	public void exitStat(@NotNull StatContext ctx) {
		if (this.funcName.equals("concat")) {
			Iterator<String> it = this.argList.listIterator();

			while (it.hasNext()) {
				this.result = this.result.concat(" " + it.next());
			}

		} else if (this.funcName.equals("split")) {

		} else {
			System.out.println("not a method");
		}
	}

	@Override
	public void exitFunction(@NotNull FunctionContext ctx) {
		super.exitFunction(ctx);
		this.funcName = ctx.getText();
	}

}
