// Generated from Mapping.g4 by ANTLR 4.1

  package org.wso2.datamapper.parsers;
  import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MappingParser}.
 */
public interface MappingListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MappingParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(@NotNull MappingParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(@NotNull MappingParser.ArgContext ctx);

	/**
	 * Enter a parse tree produced by {@link MappingParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull MappingParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull MappingParser.StatContext ctx);

	/**
	 * Enter a parse tree produced by {@link MappingParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull MappingParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull MappingParser.FunctionContext ctx);
}