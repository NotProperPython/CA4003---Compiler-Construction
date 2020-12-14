// Generated from c:\Users\Umar\Desktop\Computer Applications (DC-121)\Year-4\semester 1\CA4003 - Compiler Construction\assign1\cal.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Begin=1, Is=2, Variable=3, Constant=4, Return=5, Integer=6, Boolean=7, 
		Void=8, Main=9, If=10, Else=11, True=12, False=13, While=14, Sskip=15, 
		End=16, COMMA=17, SEMI=18, COLON=19, ASSIGN=20, LBR=21, RBR=22, PLUS=23, 
		MINUS=24, NOT=25, OR=26, AND=27, EQUAL=28, NOT_EQUAL=29, LESS_THAN=30, 
		LESS_THAN_EQUAL_TO=31, GREATER_THAN=32, GREATER_THAN_EQUAL_TO=33, ID=34, 
		NUMBER=35, BOOLEAN=36, WS=37, COMMENT=38, LINE_COMMENT=39;
	public static final int
		RULE_prog = 0, RULE_decl_list = 1, RULE_decl = 2, RULE_type = 3, RULE_var_decl = 4, 
		RULE_const_decl = 5, RULE_function_list = 6, RULE_function = 7, RULE_parameter_list = 8, 
		RULE_nemp_parameter_list = 9, RULE_main = 10, RULE_statement_block = 11, 
		RULE_statement = 12, RULE_expression = 13, RULE_binary_arith_op = 14, 
		RULE_fragment_ = 15, RULE_condition = 16, RULE_comp_op = 17, RULE_arg_list = 18, 
		RULE_nemp_arg_list = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl_list", "decl", "type", "var_decl", "const_decl", "function_list", 
			"function", "parameter_list", "nemp_parameter_list", "main", "statement_block", 
			"statement", "expression", "binary_arith_op", "fragment_", "condition", 
			"comp_op", "arg_list", "nemp_arg_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "','", "';'", "':'", "':='", "'('", "')'", 
			"'+'", "'-'", "'~'", "'|'", "'&'", "'='", "'!='", "'<'", "'<='", "'>'", 
			"'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Begin", "Is", "Variable", "Constant", "Return", "Integer", "Boolean", 
			"Void", "Main", "If", "Else", "True", "False", "While", "Sskip", "End", 
			"COMMA", "SEMI", "COLON", "ASSIGN", "LBR", "RBR", "PLUS", "MINUS", "NOT", 
			"OR", "AND", "EQUAL", "NOT_EQUAL", "LESS_THAN", "LESS_THAN_EQUAL_TO", 
			"GREATER_THAN", "GREATER_THAN_EQUAL_TO", "ID", "NUMBER", "BOOLEAN", "WS", 
			"COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "cal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public calParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Function_listContext function_list() {
			return getRuleContext(Function_listContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			decl_list();
			setState(41);
			function_list();
			setState(42);
			main();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_listContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(calParser.SEMI, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_list; }
	}

	public final Decl_listContext decl_list() throws RecognitionException {
		Decl_listContext _localctx = new Decl_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl_list);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Variable:
			case Constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				decl();
				setState(45);
				match(SEMI);
				setState(46);
				decl_list();
				}
				break;
			case Begin:
			case Integer:
			case Boolean:
			case Void:
			case Main:
			case If:
			case Else:
			case While:
			case Sskip:
			case End:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Const_declContext const_decl() {
			return getRuleContext(Const_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Variable:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				var_decl();
				}
				break;
			case Constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				const_decl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(calParser.Integer, 0); }
		public TerminalNode Boolean() { return getToken(calParser.Boolean, 0); }
		public TerminalNode Void() { return getToken(calParser.Void, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Integer) | (1L << Boolean) | (1L << Void))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode Variable() { return getToken(calParser.Variable, 0); }
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode COLON() { return getToken(calParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(Variable);
			setState(58);
			match(ID);
			setState(59);
			match(COLON);
			setState(60);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_declContext extends ParserRuleContext {
		public TerminalNode Constant() { return getToken(calParser.Constant, 0); }
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode COLON() { return getToken(calParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(calParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Const_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_decl; }
	}

	public final Const_declContext const_decl() throws RecognitionException {
		Const_declContext _localctx = new Const_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_const_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(Constant);
			setState(63);
			match(ID);
			setState(64);
			match(COLON);
			setState(65);
			type();
			setState(66);
			match(ASSIGN);
			setState(67);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_listContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Function_listContext function_list() {
			return getRuleContext(Function_listContext.class,0);
		}
		public Function_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_list; }
	}

	public final Function_listContext function_list() throws RecognitionException {
		Function_listContext _localctx = new Function_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_list);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
			case Boolean:
			case Void:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				function();
				setState(70);
				function_list();
				}
				break;
			case Main:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public List<TerminalNode> LBR() { return getTokens(calParser.LBR); }
		public TerminalNode LBR(int i) {
			return getToken(calParser.LBR, i);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public List<TerminalNode> RBR() { return getTokens(calParser.RBR); }
		public TerminalNode RBR(int i) {
			return getToken(calParser.RBR, i);
		}
		public TerminalNode Is() { return getToken(calParser.Is, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public TerminalNode Begin() { return getToken(calParser.Begin, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode Return() { return getToken(calParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(calParser.SEMI, 0); }
		public TerminalNode End() { return getToken(calParser.End, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			type();
			setState(76);
			match(ID);
			setState(77);
			match(LBR);
			setState(78);
			parameter_list();
			setState(79);
			match(RBR);
			setState(80);
			match(Is);
			setState(81);
			decl_list();
			setState(82);
			match(Begin);
			setState(83);
			statement_block();
			setState(84);
			match(Return);
			setState(85);
			match(LBR);
			setState(86);
			expression();
			setState(87);
			match(RBR);
			setState(88);
			match(SEMI);
			setState(89);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public Nemp_parameter_listContext nemp_parameter_list() {
			return getRuleContext(Nemp_parameter_listContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter_list);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				nemp_parameter_list();
				}
				break;
			case RBR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nemp_parameter_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode COLON() { return getToken(calParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(calParser.COMMA, 0); }
		public Nemp_parameter_listContext nemp_parameter_list() {
			return getRuleContext(Nemp_parameter_listContext.class,0);
		}
		public Nemp_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemp_parameter_list; }
	}

	public final Nemp_parameter_listContext nemp_parameter_list() throws RecognitionException {
		Nemp_parameter_listContext _localctx = new Nemp_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nemp_parameter_list);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(ID);
				setState(96);
				match(COLON);
				setState(97);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(ID);
				setState(99);
				match(COLON);
				setState(100);
				type();
				setState(101);
				match(COMMA);
				setState(102);
				nemp_parameter_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode Main() { return getToken(calParser.Main, 0); }
		public TerminalNode Begin() { return getToken(calParser.Begin, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode End() { return getToken(calParser.End, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(Main);
			setState(107);
			match(Begin);
			setState(108);
			decl_list();
			setState(109);
			statement_block();
			setState(110);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_blockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public Statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_block; }
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement_block);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Begin:
			case If:
			case Else:
			case While:
			case Sskip:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				statement();
				setState(113);
				statement_block();
				}
				break;
			case Return:
			case End:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(calParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(calParser.SEMI, 0); }
		public TerminalNode LBR() { return getToken(calParser.LBR, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode RBR() { return getToken(calParser.RBR, 0); }
		public TerminalNode Begin() { return getToken(calParser.Begin, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode End() { return getToken(calParser.End, 0); }
		public TerminalNode If() { return getToken(calParser.If, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode Else() { return getToken(calParser.Else, 0); }
		public TerminalNode While() { return getToken(calParser.While, 0); }
		public TerminalNode Sskip() { return getToken(calParser.Sskip, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(ID);
				setState(119);
				match(ASSIGN);
				setState(120);
				expression();
				setState(121);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(ID);
				setState(124);
				match(LBR);
				setState(125);
				arg_list();
				setState(126);
				match(RBR);
				setState(127);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(Begin);
				setState(130);
				statement_block();
				setState(131);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				match(If);
				setState(134);
				condition(0);
				setState(135);
				match(Begin);
				setState(136);
				statement_block();
				setState(137);
				match(End);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				match(Else);
				setState(140);
				match(Begin);
				setState(141);
				statement_block();
				setState(142);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				match(While);
				setState(145);
				condition(0);
				setState(146);
				match(Begin);
				setState(147);
				statement_block();
				setState(148);
				match(End);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(150);
				match(Sskip);
				setState(151);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<Fragment_Context> fragment_() {
			return getRuleContexts(Fragment_Context.class);
		}
		public Fragment_Context fragment_(int i) {
			return getRuleContext(Fragment_Context.class,i);
		}
		public Binary_arith_opContext binary_arith_op() {
			return getRuleContext(Binary_arith_opContext.class,0);
		}
		public TerminalNode LBR() { return getToken(calParser.LBR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBR() { return getToken(calParser.RBR, 0); }
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				fragment_();
				setState(155);
				binary_arith_op();
				setState(156);
				fragment_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(LBR);
				setState(159);
				expression();
				setState(160);
				match(RBR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(ID);
				setState(163);
				match(LBR);
				setState(164);
				arg_list();
				setState(165);
				match(RBR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				fragment_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_arith_opContext extends ParserRuleContext {
		public Token op;
		public TerminalNode PLUS() { return getToken(calParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(calParser.MINUS, 0); }
		public Binary_arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_arith_op; }
	}

	public final Binary_arith_opContext binary_arith_op() throws RecognitionException {
		Binary_arith_opContext _localctx = new Binary_arith_opContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_binary_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			((Binary_arith_opContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
				((Binary_arith_opContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fragment_Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode MINUS() { return getToken(calParser.MINUS, 0); }
		public TerminalNode NUMBER() { return getToken(calParser.NUMBER, 0); }
		public TerminalNode True() { return getToken(calParser.True, 0); }
		public TerminalNode False() { return getToken(calParser.False, 0); }
		public Binary_arith_opContext binary_arith_op() {
			return getRuleContext(Binary_arith_opContext.class,0);
		}
		public Fragment_Context fragment_() {
			return getRuleContext(Fragment_Context.class,0);
		}
		public TerminalNode LBR() { return getToken(calParser.LBR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBR() { return getToken(calParser.RBR, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public Fragment_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragment_; }
	}

	public final Fragment_Context fragment_() throws RecognitionException {
		Fragment_Context _localctx = new Fragment_Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_fragment_);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(MINUS);
				setState(175);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(True);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				match(False);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
				binary_arith_op();
				setState(180);
				fragment_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(182);
				match(LBR);
				setState(183);
				expression();
				setState(184);
				match(RBR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				match(ID);
				setState(187);
				match(LBR);
				setState(188);
				arg_list();
				setState(189);
				match(RBR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public Token op;
		public TerminalNode NOT() { return getToken(calParser.NOT, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode LBR() { return getToken(calParser.LBR, 0); }
		public TerminalNode RBR() { return getToken(calParser.RBR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Comp_opContext comp_op() {
			return getRuleContext(Comp_opContext.class,0);
		}
		public TerminalNode OR() { return getToken(calParser.OR, 0); }
		public TerminalNode AND() { return getToken(calParser.AND, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(194);
				match(NOT);
				setState(195);
				condition(4);
				}
				break;
			case 2:
				{
				setState(196);
				match(LBR);
				setState(197);
				condition(0);
				setState(198);
				match(RBR);
				}
				break;
			case 3:
				{
				setState(200);
				expression();
				setState(201);
				comp_op();
				setState(202);
				expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(206);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(207);
					((ConditionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==OR || _la==AND) ) {
						((ConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(208);
					condition(2);
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(calParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(calParser.NOT_EQUAL, 0); }
		public TerminalNode LESS_THAN() { return getToken(calParser.LESS_THAN, 0); }
		public TerminalNode LESS_THAN_EQUAL_TO() { return getToken(calParser.LESS_THAN_EQUAL_TO, 0); }
		public TerminalNode GREATER_THAN() { return getToken(calParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_EQUAL_TO() { return getToken(calParser.GREATER_THAN_EQUAL_TO, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LESS_THAN) | (1L << LESS_THAN_EQUAL_TO) | (1L << GREATER_THAN) | (1L << GREATER_THAN_EQUAL_TO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg_listContext extends ParserRuleContext {
		public Nemp_arg_listContext nemp_arg_list() {
			return getRuleContext(Nemp_arg_listContext.class,0);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arg_list);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				nemp_arg_list();
				}
				break;
			case RBR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nemp_arg_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(calParser.COMMA, 0); }
		public Nemp_arg_listContext nemp_arg_list() {
			return getRuleContext(Nemp_arg_listContext.class,0);
		}
		public Nemp_arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemp_arg_list; }
	}

	public final Nemp_arg_listContext nemp_arg_list() throws RecognitionException {
		Nemp_arg_listContext _localctx = new Nemp_arg_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nemp_arg_list);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(ID);
				setState(222);
				match(COMMA);
				setState(223);
				nemp_arg_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00e5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\64\n\3\3\4\3\4\5\48\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bL\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\5\n`\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13k\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\5\rw\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009b\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00ac\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c2\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00cf\n\22\3\22\3\22\3\22"+
		"\7\22\u00d4\n\22\f\22\16\22\u00d7\13\22\3\23\3\23\3\24\3\24\5\24\u00dd"+
		"\n\24\3\25\3\25\3\25\3\25\5\25\u00e3\n\25\3\25\2\3\"\26\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(\2\6\3\2\b\n\3\2\31\32\3\2\34\35\3\2\36"+
		"#\2\u00ec\2*\3\2\2\2\4\63\3\2\2\2\6\67\3\2\2\2\b9\3\2\2\2\n;\3\2\2\2\f"+
		"@\3\2\2\2\16K\3\2\2\2\20M\3\2\2\2\22_\3\2\2\2\24j\3\2\2\2\26l\3\2\2\2"+
		"\30v\3\2\2\2\32\u009a\3\2\2\2\34\u00ab\3\2\2\2\36\u00ad\3\2\2\2 \u00c1"+
		"\3\2\2\2\"\u00ce\3\2\2\2$\u00d8\3\2\2\2&\u00dc\3\2\2\2(\u00e2\3\2\2\2"+
		"*+\5\4\3\2+,\5\16\b\2,-\5\26\f\2-\3\3\2\2\2./\5\6\4\2/\60\7\24\2\2\60"+
		"\61\5\4\3\2\61\64\3\2\2\2\62\64\3\2\2\2\63.\3\2\2\2\63\62\3\2\2\2\64\5"+
		"\3\2\2\2\658\5\n\6\2\668\5\f\7\2\67\65\3\2\2\2\67\66\3\2\2\28\7\3\2\2"+
		"\29:\t\2\2\2:\t\3\2\2\2;<\7\5\2\2<=\7$\2\2=>\7\25\2\2>?\5\b\5\2?\13\3"+
		"\2\2\2@A\7\6\2\2AB\7$\2\2BC\7\25\2\2CD\5\b\5\2DE\7\26\2\2EF\5\34\17\2"+
		"F\r\3\2\2\2GH\5\20\t\2HI\5\16\b\2IL\3\2\2\2JL\3\2\2\2KG\3\2\2\2KJ\3\2"+
		"\2\2L\17\3\2\2\2MN\5\b\5\2NO\7$\2\2OP\7\27\2\2PQ\5\22\n\2QR\7\30\2\2R"+
		"S\7\4\2\2ST\5\4\3\2TU\7\3\2\2UV\5\30\r\2VW\7\7\2\2WX\7\27\2\2XY\5\34\17"+
		"\2YZ\7\30\2\2Z[\7\24\2\2[\\\7\22\2\2\\\21\3\2\2\2]`\5\24\13\2^`\3\2\2"+
		"\2_]\3\2\2\2_^\3\2\2\2`\23\3\2\2\2ab\7$\2\2bc\7\25\2\2ck\5\b\5\2de\7$"+
		"\2\2ef\7\25\2\2fg\5\b\5\2gh\7\23\2\2hi\5\24\13\2ik\3\2\2\2ja\3\2\2\2j"+
		"d\3\2\2\2k\25\3\2\2\2lm\7\13\2\2mn\7\3\2\2no\5\4\3\2op\5\30\r\2pq\7\22"+
		"\2\2q\27\3\2\2\2rs\5\32\16\2st\5\30\r\2tw\3\2\2\2uw\3\2\2\2vr\3\2\2\2"+
		"vu\3\2\2\2w\31\3\2\2\2xy\7$\2\2yz\7\26\2\2z{\5\34\17\2{|\7\24\2\2|\u009b"+
		"\3\2\2\2}~\7$\2\2~\177\7\27\2\2\177\u0080\5&\24\2\u0080\u0081\7\30\2\2"+
		"\u0081\u0082\7\24\2\2\u0082\u009b\3\2\2\2\u0083\u0084\7\3\2\2\u0084\u0085"+
		"\5\30\r\2\u0085\u0086\7\22\2\2\u0086\u009b\3\2\2\2\u0087\u0088\7\f\2\2"+
		"\u0088\u0089\5\"\22\2\u0089\u008a\7\3\2\2\u008a\u008b\5\30\r\2\u008b\u008c"+
		"\7\22\2\2\u008c\u009b\3\2\2\2\u008d\u008e\7\r\2\2\u008e\u008f\7\3\2\2"+
		"\u008f\u0090\5\30\r\2\u0090\u0091\7\22\2\2\u0091\u009b\3\2\2\2\u0092\u0093"+
		"\7\20\2\2\u0093\u0094\5\"\22\2\u0094\u0095\7\3\2\2\u0095\u0096\5\30\r"+
		"\2\u0096\u0097\7\22\2\2\u0097\u009b\3\2\2\2\u0098\u0099\7\21\2\2\u0099"+
		"\u009b\7\24\2\2\u009ax\3\2\2\2\u009a}\3\2\2\2\u009a\u0083\3\2\2\2\u009a"+
		"\u0087\3\2\2\2\u009a\u008d\3\2\2\2\u009a\u0092\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\33\3\2\2\2\u009c\u009d\5 \21\2\u009d\u009e\5\36\20\2\u009e"+
		"\u009f\5 \21\2\u009f\u00ac\3\2\2\2\u00a0\u00a1\7\27\2\2\u00a1\u00a2\5"+
		"\34\17\2\u00a2\u00a3\7\30\2\2\u00a3\u00ac\3\2\2\2\u00a4\u00a5\7$\2\2\u00a5"+
		"\u00a6\7\27\2\2\u00a6\u00a7\5&\24\2\u00a7\u00a8\7\30\2\2\u00a8\u00ac\3"+
		"\2\2\2\u00a9\u00ac\5 \21\2\u00aa\u00ac\3\2\2\2\u00ab\u009c\3\2\2\2\u00ab"+
		"\u00a0\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2"+
		"\2\2\u00ac\35\3\2\2\2\u00ad\u00ae\t\3\2\2\u00ae\37\3\2\2\2\u00af\u00c2"+
		"\7$\2\2\u00b0\u00b1\7\32\2\2\u00b1\u00c2\7$\2\2\u00b2\u00c2\7%\2\2\u00b3"+
		"\u00c2\7\16\2\2\u00b4\u00c2\7\17\2\2\u00b5\u00b6\5\36\20\2\u00b6\u00b7"+
		"\5 \21\2\u00b7\u00c2\3\2\2\2\u00b8\u00b9\7\27\2\2\u00b9\u00ba\5\34\17"+
		"\2\u00ba\u00bb\7\30\2\2\u00bb\u00c2\3\2\2\2\u00bc\u00bd\7$\2\2\u00bd\u00be"+
		"\7\27\2\2\u00be\u00bf\5&\24\2\u00bf\u00c0\7\30\2\2\u00c0\u00c2\3\2\2\2"+
		"\u00c1\u00af\3\2\2\2\u00c1\u00b0\3\2\2\2\u00c1\u00b2\3\2\2\2\u00c1\u00b3"+
		"\3\2\2\2\u00c1\u00b4\3\2\2\2\u00c1\u00b5\3\2\2\2\u00c1\u00b8\3\2\2\2\u00c1"+
		"\u00bc\3\2\2\2\u00c2!\3\2\2\2\u00c3\u00c4\b\22\1\2\u00c4\u00c5\7\33\2"+
		"\2\u00c5\u00cf\5\"\22\6\u00c6\u00c7\7\27\2\2\u00c7\u00c8\5\"\22\2\u00c8"+
		"\u00c9\7\30\2\2\u00c9\u00cf\3\2\2\2\u00ca\u00cb\5\34\17\2\u00cb\u00cc"+
		"\5$\23\2\u00cc\u00cd\5\34\17\2\u00cd\u00cf\3\2\2\2\u00ce\u00c3\3\2\2\2"+
		"\u00ce\u00c6\3\2\2\2\u00ce\u00ca\3\2\2\2\u00cf\u00d5\3\2\2\2\u00d0\u00d1"+
		"\f\3\2\2\u00d1\u00d2\t\4\2\2\u00d2\u00d4\5\"\22\4\u00d3\u00d0\3\2\2\2"+
		"\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6#\3"+
		"\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\t\5\2\2\u00d9%\3\2\2\2\u00da\u00dd"+
		"\5(\25\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\'\3\2\2\2\u00de\u00e3\7$\2\2\u00df\u00e0\7$\2\2\u00e0\u00e1\7\23\2\2"+
		"\u00e1\u00e3\5(\25\2\u00e2\u00de\3\2\2\2\u00e2\u00df\3\2\2\2\u00e3)\3"+
		"\2\2\2\17\63\67K_jv\u009a\u00ab\u00c1\u00ce\u00d5\u00dc\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}