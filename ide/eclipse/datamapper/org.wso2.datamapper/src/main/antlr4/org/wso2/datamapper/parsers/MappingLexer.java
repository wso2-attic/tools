// Generated from Mapping.g4 by ANTLR 4.1

  package org.wso2.datamapper.parsers;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MappingLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, ID=5, INT=6, NEWLINE=7, WS=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'.'", "')'", "','", "'('", "ID", "INT", "NEWLINE", "WS"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "ID", "INT", "NEWLINE", "WS"
	};


	public MappingLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mapping.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 7: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\n\61\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\6\6\35\n\6\r\6\16\6\36\3\7\6\7\"\n\7\r\7\16\7#"+
		"\3\b\5\b\'\n\b\3\b\3\b\3\t\6\t,\n\t\r\t\16\t-\3\t\3\t\2\n\3\3\1\5\4\1"+
		"\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\2\3\2\5\4\2C\\c|\3\2\62;\4\2\13"+
		"\13\"\"\64\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5\25\3\2\2\2\7\27"+
		"\3\2\2\2\t\31\3\2\2\2\13\34\3\2\2\2\r!\3\2\2\2\17&\3\2\2\2\21+\3\2\2\2"+
		"\23\24\7\60\2\2\24\4\3\2\2\2\25\26\7+\2\2\26\6\3\2\2\2\27\30\7.\2\2\30"+
		"\b\3\2\2\2\31\32\7*\2\2\32\n\3\2\2\2\33\35\t\2\2\2\34\33\3\2\2\2\35\36"+
		"\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\f\3\2\2\2 \"\t\3\2\2! \3\2\2\2"+
		"\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\16\3\2\2\2%\'\7\17\2\2&%\3\2\2\2&\'\3"+
		"\2\2\2\'(\3\2\2\2()\7\f\2\2)\20\3\2\2\2*,\t\4\2\2+*\3\2\2\2,-\3\2\2\2"+
		"-+\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\b\t\2\2\60\22\3\2\2\2\7\2\36#&-";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}