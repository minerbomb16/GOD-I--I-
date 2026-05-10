// Generated from LangX.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LangXParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, STRING=49, INT=50, REAL=51, ID=52, WS=53;
	public static final int
		RULE_prog = 0, RULE_structDecl = 1, RULE_structField = 2, RULE_start = 3, 
		RULE_ifStatement = 4, RULE_ifCond = 5, RULE_elseBlock = 6, RULE_whileStatement = 7, 
		RULE_whileCond = 8, RULE_whileKeyword = 9, RULE_forStatement = 10, RULE_forInitCond = 11, 
		RULE_forStartExpr = 12, RULE_typeName = 13, RULE_functionDecl = 14, RULE_paramList = 15, 
		RULE_argList = 16, RULE_type = 17, RULE_expr = 18, RULE_andOp = 19, RULE_orOp = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "structDecl", "structField", "start", "ifStatement", "ifCond", 
			"elseBlock", "whileStatement", "whileCond", "whileKeyword", "forStatement", 
			"forInitCond", "forStartExpr", "typeName", "functionDecl", "paramList", 
			"argList", "type", "expr", "andOp", "orOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Legion'", "'{'", "'}'", "';'", "'Create'", "'['", "']'", "'be transformed into'", 
			"'Confess'", "'Reveal'", "'row'", "'column'", "':'", "'in the image of'", 
			"'('", "')'", "'Fulfill'", "'.'", "'Judge'", "'Otherwise'", "'Pilgrimage'", 
			"'to'", "'step'", "'Way of the Cross'", "'Stations'", "'Miracle'", "','", 
			"'Mortal'", "'Divine'", "'SmallDivine'", "'Eternal'", "'Dogma'", "'-'", 
			"'NEG'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'*'", "'/'", 
			"'+'", "'XOR'", "'Heaven'", "'Hell'", "'AND'", "'OR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "STRING", "INT", "REAL", "ID", "WS"
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
	public String getGrammarFileName() { return "LangX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangXParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LangXParser.EOF, 0); }
		public List<StructDeclContext> structDecl() {
			return getRuleContexts(StructDeclContext.class);
		}
		public StructDeclContext structDecl(int i) {
			return getRuleContext(StructDeclContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public List<StartContext> start() {
			return getRuleContexts(StartContext.class);
		}
		public StartContext start(int i) {
			return getRuleContext(StartContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(45);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(42);
					structDecl();
					}
					break;
				case T__25:
					{
					setState(43);
					functionDecl();
					}
					break;
				case T__4:
				case T__8:
				case T__9:
				case T__16:
				case T__18:
				case T__20:
				case T__23:
				case ID:
					{
					setState(44);
					start();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4503599714010658L) != 0) );
			setState(49);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public List<StructFieldContext> structField() {
			return getRuleContexts(StructFieldContext.class);
		}
		public StructFieldContext structField(int i) {
			return getRuleContext(StructFieldContext.class,i);
		}
		public StructDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterStructDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitStructDecl(this);
		}
	}

	public final StructDeclContext structDecl() throws RecognitionException {
		StructDeclContext _localctx = new StructDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_structDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__0);
			setState(52);
			match(ID);
			setState(53);
			match(T__1);
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				structField();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8321499136L) != 0) );
			setState(59);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructFieldContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public StructFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterStructField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitStructField(this);
		}
	}

	public final StructFieldContext structField() throws RecognitionException {
		StructFieldContext _localctx = new StructFieldContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_structField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			type();
			setState(62);
			match(ID);
			setState(63);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	 
		public StartContext() { }
		public void copyFrom(StartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteArrayToContext extends StartContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public TerminalNode INT() { return getToken(LangXParser.INT, 0); }
		public WriteArrayToContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterWriteArrayTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitWriteArrayTo(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteStructFieldContext extends StartContext {
		public List<TerminalNode> ID() { return getTokens(LangXParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LangXParser.ID, i);
		}
		public WriteStructFieldContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterWriteStructField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitWriteStructField(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtNodeContext extends StartContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhileStmtNodeContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterWhileStmtNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitWhileStmtNode(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclareContext extends StartContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public DeclareContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitDeclare(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignMatrixElemContext extends StartContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignMatrixElemContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterAssignMatrixElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitAssignMatrixElem(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteMatrixRowContext extends StartContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public TerminalNode INT() { return getToken(LangXParser.INT, 0); }
		public WriteMatrixRowContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterWriteMatrixRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitWriteMatrixRow(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadArrayElemContext extends StartContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReadArrayElemContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterReadArrayElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitReadArrayElem(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteIdContext extends StartContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public WriteIdContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterWriteId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitWriteId(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignArrayElemContext extends StartContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignArrayElemContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterAssignArrayElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitAssignArrayElem(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatContext extends StartContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterReturnStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitReturnStat(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteContext extends StartContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WriteContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitWrite(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtNodeContext extends StartContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForStmtNodeContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterForStmtNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitForStmtNode(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteArrayFromContext extends StartContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public TerminalNode INT() { return getToken(LangXParser.INT, 0); }
		public WriteArrayFromContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterWriteArrayFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitWriteArrayFrom(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclareAndAssignContext extends StartContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclareAndAssignContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterDeclareAndAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitDeclareAndAssign(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadContext extends StartContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public ReadContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitRead(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteArrayRangeContext extends StartContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public List<TerminalNode> INT() { return getTokens(LangXParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LangXParser.INT, i);
		}
		public WriteArrayRangeContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterWriteArrayRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitWriteArrayRange(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclareMatrixContext extends StartContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public List<TerminalNode> INT() { return getTokens(LangXParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LangXParser.INT, i);
		}
		public DeclareMatrixContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterDeclareMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitDeclareMatrix(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtNodeContext extends StartContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStmtNodeContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterIfStmtNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitIfStmtNode(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteMatrixColumnContext extends StartContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public TerminalNode INT() { return getToken(LangXParser.INT, 0); }
		public WriteMatrixColumnContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterWriteMatrixColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitWriteMatrixColumn(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclareStructContext extends StartContext {
		public List<TerminalNode> ID() { return getTokens(LangXParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LangXParser.ID, i);
		}
		public DeclareStructContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterDeclareStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitDeclareStruct(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclareArrayContext extends StartContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public TerminalNode INT() { return getToken(LangXParser.INT, 0); }
		public DeclareArrayContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterDeclareArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitDeclareArray(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallStatContext extends StartContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FunctionCallStatContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterFunctionCallStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitFunctionCallStat(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadMatrixElemContext extends StartContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ReadMatrixElemContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterReadMatrixElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitReadMatrixElem(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStructFieldContext extends StartContext {
		public List<TerminalNode> ID() { return getTokens(LangXParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LangXParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStructFieldContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterAssignStructField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitAssignStructField(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadStructFieldContext extends StartContext {
		public List<TerminalNode> ID() { return getTokens(LangXParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LangXParser.ID, i);
		}
		public ReadStructFieldContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterReadStructField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitReadStructField(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends StartContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitAssign(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_start);
		int _la;
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new DeclareMatrixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(T__4);
				setState(66);
				type();
				setState(67);
				match(ID);
				setState(68);
				match(T__5);
				setState(69);
				match(INT);
				setState(70);
				match(T__6);
				setState(71);
				match(T__5);
				setState(72);
				match(INT);
				setState(73);
				match(T__6);
				setState(74);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new AssignMatrixElemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(ID);
				setState(77);
				match(T__5);
				setState(78);
				expr(0);
				setState(79);
				match(T__6);
				setState(80);
				match(T__5);
				setState(81);
				expr(0);
				setState(82);
				match(T__6);
				setState(83);
				match(T__7);
				setState(84);
				expr(0);
				setState(85);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new ReadMatrixElemContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(T__8);
				setState(88);
				match(ID);
				setState(89);
				match(T__5);
				setState(90);
				expr(0);
				setState(91);
				match(T__6);
				setState(92);
				match(T__5);
				setState(93);
				expr(0);
				setState(94);
				match(T__6);
				setState(95);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new WriteMatrixRowContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(T__9);
				setState(98);
				match(T__10);
				setState(99);
				match(ID);
				setState(100);
				match(T__5);
				setState(101);
				match(INT);
				setState(102);
				match(T__6);
				setState(103);
				match(T__3);
				}
				break;
			case 5:
				_localctx = new WriteMatrixColumnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				match(T__9);
				setState(105);
				match(T__11);
				setState(106);
				match(ID);
				setState(107);
				match(T__5);
				setState(108);
				match(INT);
				setState(109);
				match(T__6);
				setState(110);
				match(T__3);
				}
				break;
			case 6:
				_localctx = new DeclareArrayContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				match(T__4);
				setState(112);
				type();
				setState(113);
				match(ID);
				setState(114);
				match(T__5);
				setState(115);
				match(INT);
				setState(116);
				match(T__6);
				setState(117);
				match(T__3);
				}
				break;
			case 7:
				_localctx = new AssignArrayElemContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(119);
				match(ID);
				setState(120);
				match(T__5);
				setState(121);
				expr(0);
				setState(122);
				match(T__6);
				setState(123);
				match(T__7);
				setState(124);
				expr(0);
				setState(125);
				match(T__3);
				}
				break;
			case 8:
				_localctx = new ReadArrayElemContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(127);
				match(T__8);
				setState(128);
				match(ID);
				setState(129);
				match(T__5);
				setState(130);
				expr(0);
				setState(131);
				match(T__6);
				setState(132);
				match(T__3);
				}
				break;
			case 9:
				_localctx = new WriteIdContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(134);
				match(T__9);
				setState(135);
				match(ID);
				setState(136);
				match(T__3);
				}
				break;
			case 10:
				_localctx = new WriteArrayRangeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(137);
				match(T__9);
				setState(138);
				match(ID);
				setState(139);
				match(T__5);
				setState(140);
				match(INT);
				setState(141);
				match(T__12);
				setState(142);
				match(INT);
				setState(143);
				match(T__6);
				setState(144);
				match(T__3);
				}
				break;
			case 11:
				_localctx = new WriteArrayFromContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(145);
				match(T__9);
				setState(146);
				match(ID);
				setState(147);
				match(T__5);
				setState(148);
				match(INT);
				setState(149);
				match(T__12);
				setState(150);
				match(T__6);
				setState(151);
				match(T__3);
				}
				break;
			case 12:
				_localctx = new WriteArrayToContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(152);
				match(T__9);
				setState(153);
				match(ID);
				setState(154);
				match(T__5);
				setState(155);
				match(T__12);
				setState(156);
				match(INT);
				setState(157);
				match(T__6);
				setState(158);
				match(T__3);
				}
				break;
			case 13:
				_localctx = new DeclareAndAssignContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(159);
				match(T__4);
				setState(160);
				type();
				setState(161);
				match(ID);
				setState(162);
				match(T__13);
				setState(163);
				expr(0);
				setState(164);
				match(T__3);
				}
				break;
			case 14:
				_localctx = new DeclareContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(166);
				match(T__4);
				setState(167);
				type();
				setState(168);
				match(ID);
				setState(169);
				match(T__3);
				}
				break;
			case 15:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(171);
				match(ID);
				setState(172);
				match(T__7);
				setState(173);
				expr(0);
				setState(174);
				match(T__3);
				}
				break;
			case 16:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(176);
				match(T__9);
				setState(177);
				expr(0);
				setState(178);
				match(T__3);
				}
				break;
			case 17:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(180);
				match(T__8);
				setState(181);
				match(ID);
				setState(182);
				match(T__3);
				}
				break;
			case 18:
				_localctx = new IfStmtNodeContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(183);
				ifStatement();
				}
				break;
			case 19:
				_localctx = new WhileStmtNodeContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(184);
				whileStatement();
				}
				break;
			case 20:
				_localctx = new ForStmtNodeContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(185);
				forStatement();
				}
				break;
			case 21:
				_localctx = new FunctionCallStatContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(186);
				match(ID);
				setState(187);
				match(T__14);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8549828187422720L) != 0)) {
					{
					setState(188);
					argList();
					}
				}

				setState(191);
				match(T__15);
				setState(192);
				match(T__3);
				}
				break;
			case 22:
				_localctx = new ReturnStatContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(193);
				match(T__16);
				setState(194);
				expr(0);
				setState(195);
				match(T__3);
				}
				break;
			case 23:
				_localctx = new DeclareStructContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(197);
				match(T__4);
				setState(198);
				match(T__0);
				setState(199);
				match(ID);
				setState(200);
				match(ID);
				setState(201);
				match(T__3);
				}
				break;
			case 24:
				_localctx = new AssignStructFieldContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(202);
				match(ID);
				setState(203);
				match(T__17);
				setState(204);
				match(ID);
				setState(205);
				match(T__7);
				setState(206);
				expr(0);
				setState(207);
				match(T__3);
				}
				break;
			case 25:
				_localctx = new ReadStructFieldContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(209);
				match(T__8);
				setState(210);
				match(ID);
				setState(211);
				match(T__17);
				setState(212);
				match(ID);
				setState(213);
				match(T__3);
				}
				break;
			case 26:
				_localctx = new WriteStructFieldContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(214);
				match(T__9);
				setState(215);
				match(ID);
				setState(216);
				match(T__17);
				setState(217);
				match(ID);
				setState(218);
				match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public IfCondContext ifCond() {
			return getRuleContext(IfCondContext.class,0);
		}
		public List<StartContext> start() {
			return getRuleContexts(StartContext.class);
		}
		public StartContext start(int i) {
			return getRuleContext(StartContext.class,i);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			ifCond();
			setState(222);
			match(T__1);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503599646901792L) != 0)) {
				{
				{
				setState(223);
				start();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			match(T__2);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(230);
				elseBlock();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfCondContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterIfCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitIfCond(this);
		}
	}

	public final IfCondContext ifCond() throws RecognitionException {
		IfCondContext _localctx = new IfCondContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__18);
			setState(234);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseBlockContext extends ParserRuleContext {
		public List<StartContext> start() {
			return getRuleContexts(StartContext.class);
		}
		public StartContext start(int i) {
			return getRuleContext(StartContext.class,i);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitElseBlock(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseBlock);
		int _la;
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(T__19);
				setState(237);
				match(T__1);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503599646901792L) != 0)) {
					{
					{
					setState(238);
					start();
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(244);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(T__19);
				setState(246);
				ifStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public WhileCondContext whileCond() {
			return getRuleContext(WhileCondContext.class,0);
		}
		public List<StartContext> start() {
			return getRuleContexts(StartContext.class);
		}
		public StartContext start(int i) {
			return getRuleContext(StartContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			whileCond();
			setState(250);
			match(T__1);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503599646901792L) != 0)) {
				{
				{
				setState(251);
				start();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileCondContext extends ParserRuleContext {
		public WhileKeywordContext whileKeyword() {
			return getRuleContext(WhileKeywordContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhileCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterWhileCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitWhileCond(this);
		}
	}

	public final WhileCondContext whileCond() throws RecognitionException {
		WhileCondContext _localctx = new WhileCondContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			whileKeyword();
			setState(260);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileKeywordContext extends ParserRuleContext {
		public WhileKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterWhileKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitWhileKeyword(this);
		}
	}

	public final WhileKeywordContext whileKeyword() throws RecognitionException {
		WhileKeywordContext _localctx = new WhileKeywordContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(T__20);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public ForInitCondContext forInitCond() {
			return getRuleContext(ForInitCondContext.class,0);
		}
		public List<StartContext> start() {
			return getRuleContexts(StartContext.class);
		}
		public StartContext start(int i) {
			return getRuleContext(StartContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			forInitCond();
			setState(265);
			match(T__1);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503599646901792L) != 0)) {
				{
				{
				setState(266);
				start();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitCondContext extends ParserRuleContext {
		public ForInitCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInitCond; }
	 
		public ForInitCondContext() { }
		public void copyFrom(ForInitCondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForToContext extends ForInitCondContext {
		public ForStartExprContext forStartExpr() {
			return getRuleContext(ForStartExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForToContext(ForInitCondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterForTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitForTo(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForToStepContext extends ForInitCondContext {
		public ForStartExprContext forStartExpr() {
			return getRuleContext(ForStartExprContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForToStepContext(ForInitCondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterForToStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitForToStep(this);
		}
	}

	public final ForInitCondContext forInitCond() throws RecognitionException {
		ForInitCondContext _localctx = new ForInitCondContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forInitCond);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new ForToContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				forStartExpr();
				setState(275);
				match(T__21);
				setState(276);
				expr(0);
				}
				break;
			case 2:
				_localctx = new ForToStepContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				forStartExpr();
				setState(279);
				match(T__21);
				setState(280);
				expr(0);
				setState(281);
				match(T__22);
				setState(282);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStartExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForStartExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStartExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterForStartExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitForStartExpr(this);
		}
	}

	public final ForStartExprContext forStartExpr() throws RecognitionException {
		ForStartExprContext _localctx = new ForStartExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forStartExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__23);
			setState(287);
			match(ID);
			setState(288);
			match(T__24);
			setState(289);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeName);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				type();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public List<StartContext> start() {
			return getRuleContexts(StartContext.class);
		}
		public StartContext start(int i) {
			return getRuleContext(StartContext.class,i);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitFunctionDecl(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(T__25);
			setState(296);
			typeName();
			setState(297);
			match(ID);
			setState(298);
			match(T__14);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503607948869632L) != 0)) {
				{
				setState(299);
				paramList();
				}
			}

			setState(302);
			match(T__15);
			setState(303);
			match(T__1);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503599646901792L) != 0)) {
				{
				{
				setState(304);
				start();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParserRuleContext {
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(LangXParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LangXParser.ID, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitParamList(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			typeName();
			setState(313);
			match(ID);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(314);
				match(T__26);
				setState(315);
				typeName();
				setState(316);
				match(ID);
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitArgList(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			expr(0);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(324);
				match(T__26);
				setState(325);
				expr(0);
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8321499136L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayElemContext extends ExprContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayElemContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterArrayElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitArrayElem(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitParens(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ExprContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public VarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitVar(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicOrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrOpContext orOp() {
			return getRuleContext(OrOpContext.class,0);
		}
		public LogicOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterLogicOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitLogicOr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueConstContext extends ExprContext {
		public TrueConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterTrueConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitTrueConst(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitAddSub(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntConstContext extends ExprContext {
		public TerminalNode INT() { return getToken(LangXParser.INT, 0); }
		public IntConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterIntConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitIntConst(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelOpContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitRelOp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitMulDiv(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructFieldAccessContext extends ExprContext {
		public List<TerminalNode> ID() { return getTokens(LangXParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LangXParser.ID, i);
		}
		public StructFieldAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterStructFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitStructFieldAccess(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicAndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndOpContext andOp() {
			return getRuleContext(AndOpContext.class,0);
		}
		public LogicAndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterLogicAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitLogicAnd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicXorContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LogicXorContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterLogicXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitLogicXor(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryMinusContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitUnaryMinus(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FunctionCallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterFunctionCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitFunctionCallExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicNegContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LogicNegContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterLogicNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitLogicNeg(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealConstContext extends ExprContext {
		public TerminalNode REAL() { return getToken(LangXParser.REAL, 0); }
		public RealConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterRealConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitRealConst(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MatrixElemContext extends ExprContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MatrixElemContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterMatrixElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitMatrixElem(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseConstContext extends ExprContext {
		public FalseConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterFalseConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitFalseConst(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringConstContext extends ExprContext {
		public TerminalNode STRING() { return getToken(LangXParser.STRING, 0); }
		public StringConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterStringConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitStringConst(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(334);
				match(T__32);
				setState(335);
				expr(19);
				}
				break;
			case 2:
				{
				_localctx = new LogicNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(336);
				match(T__33);
				setState(337);
				expr(18);
				}
				break;
			case 3:
				{
				_localctx = new FunctionCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(338);
				match(ID);
				setState(339);
				match(T__14);
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8549828187422720L) != 0)) {
					{
					setState(340);
					argList();
					}
				}

				setState(343);
				match(T__15);
				}
				break;
			case 4:
				{
				_localctx = new MatrixElemContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(344);
				match(ID);
				setState(345);
				match(T__5);
				setState(346);
				expr(0);
				setState(347);
				match(T__6);
				setState(348);
				match(T__5);
				setState(349);
				expr(0);
				setState(350);
				match(T__6);
				}
				break;
			case 5:
				{
				_localctx = new ArrayElemContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(352);
				match(ID);
				setState(353);
				match(T__5);
				setState(354);
				expr(0);
				setState(355);
				match(T__6);
				}
				break;
			case 6:
				{
				_localctx = new TrueConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(357);
				match(T__44);
				}
				break;
			case 7:
				{
				_localctx = new FalseConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(358);
				match(T__45);
				}
				break;
			case 8:
				{
				_localctx = new IntConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(359);
				match(INT);
				}
				break;
			case 9:
				{
				_localctx = new RealConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(360);
				match(REAL);
				}
				break;
			case 10:
				{
				_localctx = new StringConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(361);
				match(STRING);
				}
				break;
			case 11:
				{
				_localctx = new StructFieldAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(362);
				match(ID);
				setState(363);
				match(T__17);
				setState(364);
				match(ID);
				}
				break;
			case 12:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(365);
				match(ID);
				}
				break;
			case 13:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(366);
				match(T__14);
				setState(367);
				expr(0);
				setState(368);
				match(T__15);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(392);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new RelOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(372);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(373);
						((RelOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2164663517184L) != 0)) ) {
							((RelOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(374);
						expr(18);
						}
						break;
					case 2:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(375);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(376);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__40 || _la==T__41) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(377);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(378);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(379);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__32 || _la==T__42) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(380);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new LogicAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(381);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(382);
						andOp();
						setState(383);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new LogicOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(385);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(386);
						orOp();
						setState(387);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new LogicXorContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(389);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(390);
						((LogicXorContext)_localctx).op = match(T__43);
						setState(391);
						expr(13);
						}
						break;
					}
					} 
				}
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AndOpContext extends ParserRuleContext {
		public AndOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterAndOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitAndOp(this);
		}
	}

	public final AndOpContext andOp() throws RecognitionException {
		AndOpContext _localctx = new AndOpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_andOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(T__46);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrOpContext extends ParserRuleContext {
		public OrOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterOrOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitOrOp(this);
		}
	}

	public final OrOpContext orOp() throws RecognitionException {
		OrOpContext _localctx = new OrOpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_orOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(T__47);
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
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00015\u0192\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0004\u0000.\b\u0000\u000b\u0000\f\u0000/\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u00018\b"+
		"\u0001\u000b\u0001\f\u00019\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u00be\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u00dc\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u00e1\b\u0004\n\u0004\f\u0004\u00e4\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u00e8\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u00f0\b\u0006\n\u0006\f\u0006\u00f3"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00f8\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00fd\b\u0007\n\u0007"+
		"\f\u0007\u0100\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n\u010c\b\n\n\n\f\n\u010f"+
		"\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u011d\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0003\r\u0126\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u012d\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u0132\b\u000e\n\u000e\f\u000e\u0135\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u013f\b\u000f\n\u000f\f\u000f\u0142\t\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u0147\b\u0010\n\u0010\f\u0010\u014a\t\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0156\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0173\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u0189\b\u0012\n\u0012\f\u0012\u018c\t\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0000\u0001$\u0015"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(\u0000\u0004\u0001\u0000\u001c \u0001\u0000#(\u0001"+
		"\u0000)*\u0002\u0000!!++\u01b9\u0000-\u0001\u0000\u0000\u0000\u00023\u0001"+
		"\u0000\u0000\u0000\u0004=\u0001\u0000\u0000\u0000\u0006\u00db\u0001\u0000"+
		"\u0000\u0000\b\u00dd\u0001\u0000\u0000\u0000\n\u00e9\u0001\u0000\u0000"+
		"\u0000\f\u00f7\u0001\u0000\u0000\u0000\u000e\u00f9\u0001\u0000\u0000\u0000"+
		"\u0010\u0103\u0001\u0000\u0000\u0000\u0012\u0106\u0001\u0000\u0000\u0000"+
		"\u0014\u0108\u0001\u0000\u0000\u0000\u0016\u011c\u0001\u0000\u0000\u0000"+
		"\u0018\u011e\u0001\u0000\u0000\u0000\u001a\u0125\u0001\u0000\u0000\u0000"+
		"\u001c\u0127\u0001\u0000\u0000\u0000\u001e\u0138\u0001\u0000\u0000\u0000"+
		" \u0143\u0001\u0000\u0000\u0000\"\u014b\u0001\u0000\u0000\u0000$\u0172"+
		"\u0001\u0000\u0000\u0000&\u018d\u0001\u0000\u0000\u0000(\u018f\u0001\u0000"+
		"\u0000\u0000*.\u0003\u0002\u0001\u0000+.\u0003\u001c\u000e\u0000,.\u0003"+
		"\u0006\u0003\u0000-*\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"-,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0005\u0000"+
		"\u0000\u00012\u0001\u0001\u0000\u0000\u000034\u0005\u0001\u0000\u0000"+
		"45\u00054\u0000\u000057\u0005\u0002\u0000\u000068\u0003\u0004\u0002\u0000"+
		"76\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0005\u0003"+
		"\u0000\u0000<\u0003\u0001\u0000\u0000\u0000=>\u0003\"\u0011\u0000>?\u0005"+
		"4\u0000\u0000?@\u0005\u0004\u0000\u0000@\u0005\u0001\u0000\u0000\u0000"+
		"AB\u0005\u0005\u0000\u0000BC\u0003\"\u0011\u0000CD\u00054\u0000\u0000"+
		"DE\u0005\u0006\u0000\u0000EF\u00052\u0000\u0000FG\u0005\u0007\u0000\u0000"+
		"GH\u0005\u0006\u0000\u0000HI\u00052\u0000\u0000IJ\u0005\u0007\u0000\u0000"+
		"JK\u0005\u0004\u0000\u0000K\u00dc\u0001\u0000\u0000\u0000LM\u00054\u0000"+
		"\u0000MN\u0005\u0006\u0000\u0000NO\u0003$\u0012\u0000OP\u0005\u0007\u0000"+
		"\u0000PQ\u0005\u0006\u0000\u0000QR\u0003$\u0012\u0000RS\u0005\u0007\u0000"+
		"\u0000ST\u0005\b\u0000\u0000TU\u0003$\u0012\u0000UV\u0005\u0004\u0000"+
		"\u0000V\u00dc\u0001\u0000\u0000\u0000WX\u0005\t\u0000\u0000XY\u00054\u0000"+
		"\u0000YZ\u0005\u0006\u0000\u0000Z[\u0003$\u0012\u0000[\\\u0005\u0007\u0000"+
		"\u0000\\]\u0005\u0006\u0000\u0000]^\u0003$\u0012\u0000^_\u0005\u0007\u0000"+
		"\u0000_`\u0005\u0004\u0000\u0000`\u00dc\u0001\u0000\u0000\u0000ab\u0005"+
		"\n\u0000\u0000bc\u0005\u000b\u0000\u0000cd\u00054\u0000\u0000de\u0005"+
		"\u0006\u0000\u0000ef\u00052\u0000\u0000fg\u0005\u0007\u0000\u0000g\u00dc"+
		"\u0005\u0004\u0000\u0000hi\u0005\n\u0000\u0000ij\u0005\f\u0000\u0000j"+
		"k\u00054\u0000\u0000kl\u0005\u0006\u0000\u0000lm\u00052\u0000\u0000mn"+
		"\u0005\u0007\u0000\u0000n\u00dc\u0005\u0004\u0000\u0000op\u0005\u0005"+
		"\u0000\u0000pq\u0003\"\u0011\u0000qr\u00054\u0000\u0000rs\u0005\u0006"+
		"\u0000\u0000st\u00052\u0000\u0000tu\u0005\u0007\u0000\u0000uv\u0005\u0004"+
		"\u0000\u0000v\u00dc\u0001\u0000\u0000\u0000wx\u00054\u0000\u0000xy\u0005"+
		"\u0006\u0000\u0000yz\u0003$\u0012\u0000z{\u0005\u0007\u0000\u0000{|\u0005"+
		"\b\u0000\u0000|}\u0003$\u0012\u0000}~\u0005\u0004\u0000\u0000~\u00dc\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005\t\u0000\u0000\u0080\u0081\u00054"+
		"\u0000\u0000\u0081\u0082\u0005\u0006\u0000\u0000\u0082\u0083\u0003$\u0012"+
		"\u0000\u0083\u0084\u0005\u0007\u0000\u0000\u0084\u0085\u0005\u0004\u0000"+
		"\u0000\u0085\u00dc\u0001\u0000\u0000\u0000\u0086\u0087\u0005\n\u0000\u0000"+
		"\u0087\u0088\u00054\u0000\u0000\u0088\u00dc\u0005\u0004\u0000\u0000\u0089"+
		"\u008a\u0005\n\u0000\u0000\u008a\u008b\u00054\u0000\u0000\u008b\u008c"+
		"\u0005\u0006\u0000\u0000\u008c\u008d\u00052\u0000\u0000\u008d\u008e\u0005"+
		"\r\u0000\u0000\u008e\u008f\u00052\u0000\u0000\u008f\u0090\u0005\u0007"+
		"\u0000\u0000\u0090\u00dc\u0005\u0004\u0000\u0000\u0091\u0092\u0005\n\u0000"+
		"\u0000\u0092\u0093\u00054\u0000\u0000\u0093\u0094\u0005\u0006\u0000\u0000"+
		"\u0094\u0095\u00052\u0000\u0000\u0095\u0096\u0005\r\u0000\u0000\u0096"+
		"\u0097\u0005\u0007\u0000\u0000\u0097\u00dc\u0005\u0004\u0000\u0000\u0098"+
		"\u0099\u0005\n\u0000\u0000\u0099\u009a\u00054\u0000\u0000\u009a\u009b"+
		"\u0005\u0006\u0000\u0000\u009b\u009c\u0005\r\u0000\u0000\u009c\u009d\u0005"+
		"2\u0000\u0000\u009d\u009e\u0005\u0007\u0000\u0000\u009e\u00dc\u0005\u0004"+
		"\u0000\u0000\u009f\u00a0\u0005\u0005\u0000\u0000\u00a0\u00a1\u0003\"\u0011"+
		"\u0000\u00a1\u00a2\u00054\u0000\u0000\u00a2\u00a3\u0005\u000e\u0000\u0000"+
		"\u00a3\u00a4\u0003$\u0012\u0000\u00a4\u00a5\u0005\u0004\u0000\u0000\u00a5"+
		"\u00dc\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0005\u0000\u0000\u00a7"+
		"\u00a8\u0003\"\u0011\u0000\u00a8\u00a9\u00054\u0000\u0000\u00a9\u00aa"+
		"\u0005\u0004\u0000\u0000\u00aa\u00dc\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u00054\u0000\u0000\u00ac\u00ad\u0005\b\u0000\u0000\u00ad\u00ae\u0003"+
		"$\u0012\u0000\u00ae\u00af\u0005\u0004\u0000\u0000\u00af\u00dc\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0005\n\u0000\u0000\u00b1\u00b2\u0003$\u0012"+
		"\u0000\u00b2\u00b3\u0005\u0004\u0000\u0000\u00b3\u00dc\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0005\t\u0000\u0000\u00b5\u00b6\u00054\u0000\u0000"+
		"\u00b6\u00dc\u0005\u0004\u0000\u0000\u00b7\u00dc\u0003\b\u0004\u0000\u00b8"+
		"\u00dc\u0003\u000e\u0007\u0000\u00b9\u00dc\u0003\u0014\n\u0000\u00ba\u00bb"+
		"\u00054\u0000\u0000\u00bb\u00bd\u0005\u000f\u0000\u0000\u00bc\u00be\u0003"+
		" \u0010\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0010"+
		"\u0000\u0000\u00c0\u00dc\u0005\u0004\u0000\u0000\u00c1\u00c2\u0005\u0011"+
		"\u0000\u0000\u00c2\u00c3\u0003$\u0012\u0000\u00c3\u00c4\u0005\u0004\u0000"+
		"\u0000\u00c4\u00dc\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0005\u0000"+
		"\u0000\u00c6\u00c7\u0005\u0001\u0000\u0000\u00c7\u00c8\u00054\u0000\u0000"+
		"\u00c8\u00c9\u00054\u0000\u0000\u00c9\u00dc\u0005\u0004\u0000\u0000\u00ca"+
		"\u00cb\u00054\u0000\u0000\u00cb\u00cc\u0005\u0012\u0000\u0000\u00cc\u00cd"+
		"\u00054\u0000\u0000\u00cd\u00ce\u0005\b\u0000\u0000\u00ce\u00cf\u0003"+
		"$\u0012\u0000\u00cf\u00d0\u0005\u0004\u0000\u0000\u00d0\u00dc\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0005\t\u0000\u0000\u00d2\u00d3\u00054\u0000"+
		"\u0000\u00d3\u00d4\u0005\u0012\u0000\u0000\u00d4\u00d5\u00054\u0000\u0000"+
		"\u00d5\u00dc\u0005\u0004\u0000\u0000\u00d6\u00d7\u0005\n\u0000\u0000\u00d7"+
		"\u00d8\u00054\u0000\u0000\u00d8\u00d9\u0005\u0012\u0000\u0000\u00d9\u00da"+
		"\u00054\u0000\u0000\u00da\u00dc\u0005\u0004\u0000\u0000\u00dbA\u0001\u0000"+
		"\u0000\u0000\u00dbL\u0001\u0000\u0000\u0000\u00dbW\u0001\u0000\u0000\u0000"+
		"\u00dba\u0001\u0000\u0000\u0000\u00dbh\u0001\u0000\u0000\u0000\u00dbo"+
		"\u0001\u0000\u0000\u0000\u00dbw\u0001\u0000\u0000\u0000\u00db\u007f\u0001"+
		"\u0000\u0000\u0000\u00db\u0086\u0001\u0000\u0000\u0000\u00db\u0089\u0001"+
		"\u0000\u0000\u0000\u00db\u0091\u0001\u0000\u0000\u0000\u00db\u0098\u0001"+
		"\u0000\u0000\u0000\u00db\u009f\u0001\u0000\u0000\u0000\u00db\u00a6\u0001"+
		"\u0000\u0000\u0000\u00db\u00ab\u0001\u0000\u0000\u0000\u00db\u00b0\u0001"+
		"\u0000\u0000\u0000\u00db\u00b4\u0001\u0000\u0000\u0000\u00db\u00b7\u0001"+
		"\u0000\u0000\u0000\u00db\u00b8\u0001\u0000\u0000\u0000\u00db\u00b9\u0001"+
		"\u0000\u0000\u0000\u00db\u00ba\u0001\u0000\u0000\u0000\u00db\u00c1\u0001"+
		"\u0000\u0000\u0000\u00db\u00c5\u0001\u0000\u0000\u0000\u00db\u00ca\u0001"+
		"\u0000\u0000\u0000\u00db\u00d1\u0001\u0000\u0000\u0000\u00db\u00d6\u0001"+
		"\u0000\u0000\u0000\u00dc\u0007\u0001\u0000\u0000\u0000\u00dd\u00de\u0003"+
		"\n\u0005\u0000\u00de\u00e2\u0005\u0002\u0000\u0000\u00df\u00e1\u0003\u0006"+
		"\u0003\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e7\u0005\u0003\u0000\u0000\u00e6\u00e8\u0003\f\u0006"+
		"\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e8\t\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u0013\u0000\u0000"+
		"\u00ea\u00eb\u0003$\u0012\u0000\u00eb\u000b\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u0005\u0014\u0000\u0000\u00ed\u00f1\u0005\u0002\u0000\u0000\u00ee"+
		"\u00f0\u0003\u0006\u0003\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f8\u0005\u0003\u0000\u0000\u00f5"+
		"\u00f6\u0005\u0014\u0000\u0000\u00f6\u00f8\u0003\b\u0004\u0000\u00f7\u00ec"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\r\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0003\u0010\b\u0000\u00fa\u00fe\u0005\u0002"+
		"\u0000\u0000\u00fb\u00fd\u0003\u0006\u0003\u0000\u00fc\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0101\u0001\u0000"+
		"\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0102\u0005\u0003"+
		"\u0000\u0000\u0102\u000f\u0001\u0000\u0000\u0000\u0103\u0104\u0003\u0012"+
		"\t\u0000\u0104\u0105\u0003$\u0012\u0000\u0105\u0011\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0005\u0015\u0000\u0000\u0107\u0013\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0003\u0016\u000b\u0000\u0109\u010d\u0005\u0002\u0000"+
		"\u0000\u010a\u010c\u0003\u0006\u0003\u0000\u010b\u010a\u0001\u0000\u0000"+
		"\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000"+
		"\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0110\u0001\u0000\u0000"+
		"\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u0111\u0005\u0003\u0000"+
		"\u0000\u0111\u0015\u0001\u0000\u0000\u0000\u0112\u0113\u0003\u0018\f\u0000"+
		"\u0113\u0114\u0005\u0016\u0000\u0000\u0114\u0115\u0003$\u0012\u0000\u0115"+
		"\u011d\u0001\u0000\u0000\u0000\u0116\u0117\u0003\u0018\f\u0000\u0117\u0118"+
		"\u0005\u0016\u0000\u0000\u0118\u0119\u0003$\u0012\u0000\u0119\u011a\u0005"+
		"\u0017\u0000\u0000\u011a\u011b\u0003$\u0012\u0000\u011b\u011d\u0001\u0000"+
		"\u0000\u0000\u011c\u0112\u0001\u0000\u0000\u0000\u011c\u0116\u0001\u0000"+
		"\u0000\u0000\u011d\u0017\u0001\u0000\u0000\u0000\u011e\u011f\u0005\u0018"+
		"\u0000\u0000\u011f\u0120\u00054\u0000\u0000\u0120\u0121\u0005\u0019\u0000"+
		"\u0000\u0121\u0122\u0003$\u0012\u0000\u0122\u0019\u0001\u0000\u0000\u0000"+
		"\u0123\u0126\u0003\"\u0011\u0000\u0124\u0126\u00054\u0000\u0000\u0125"+
		"\u0123\u0001\u0000\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0126"+
		"\u001b\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u001a\u0000\u0000\u0128"+
		"\u0129\u0003\u001a\r\u0000\u0129\u012a\u00054\u0000\u0000\u012a\u012c"+
		"\u0005\u000f\u0000\u0000\u012b\u012d\u0003\u001e\u000f\u0000\u012c\u012b"+
		"\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0005\u0010\u0000\u0000\u012f\u0133"+
		"\u0005\u0002\u0000\u0000\u0130\u0132\u0003\u0006\u0003\u0000\u0131\u0130"+
		"\u0001\u0000\u0000\u0000\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0131"+
		"\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0136"+
		"\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0136\u0137"+
		"\u0005\u0003\u0000\u0000\u0137\u001d\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0003\u001a\r\u0000\u0139\u0140\u00054\u0000\u0000\u013a\u013b\u0005"+
		"\u001b\u0000\u0000\u013b\u013c\u0003\u001a\r\u0000\u013c\u013d\u00054"+
		"\u0000\u0000\u013d\u013f\u0001\u0000\u0000\u0000\u013e\u013a\u0001\u0000"+
		"\u0000\u0000\u013f\u0142\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u001f\u0001\u0000"+
		"\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0143\u0148\u0003$\u0012"+
		"\u0000\u0144\u0145\u0005\u001b\u0000\u0000\u0145\u0147\u0003$\u0012\u0000"+
		"\u0146\u0144\u0001\u0000\u0000\u0000\u0147\u014a\u0001\u0000\u0000\u0000"+
		"\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000"+
		"\u0149!\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014b"+
		"\u014c\u0007\u0000\u0000\u0000\u014c#\u0001\u0000\u0000\u0000\u014d\u014e"+
		"\u0006\u0012\uffff\uffff\u0000\u014e\u014f\u0005!\u0000\u0000\u014f\u0173"+
		"\u0003$\u0012\u0013\u0150\u0151\u0005\"\u0000\u0000\u0151\u0173\u0003"+
		"$\u0012\u0012\u0152\u0153\u00054\u0000\u0000\u0153\u0155\u0005\u000f\u0000"+
		"\u0000\u0154\u0156\u0003 \u0010\u0000\u0155\u0154\u0001\u0000\u0000\u0000"+
		"\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000"+
		"\u0157\u0173\u0005\u0010\u0000\u0000\u0158\u0159\u00054\u0000\u0000\u0159"+
		"\u015a\u0005\u0006\u0000\u0000\u015a\u015b\u0003$\u0012\u0000\u015b\u015c"+
		"\u0005\u0007\u0000\u0000\u015c\u015d\u0005\u0006\u0000\u0000\u015d\u015e"+
		"\u0003$\u0012\u0000\u015e\u015f\u0005\u0007\u0000\u0000\u015f\u0173\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\u00054\u0000\u0000\u0161\u0162\u0005\u0006"+
		"\u0000\u0000\u0162\u0163\u0003$\u0012\u0000\u0163\u0164\u0005\u0007\u0000"+
		"\u0000\u0164\u0173\u0001\u0000\u0000\u0000\u0165\u0173\u0005-\u0000\u0000"+
		"\u0166\u0173\u0005.\u0000\u0000\u0167\u0173\u00052\u0000\u0000\u0168\u0173"+
		"\u00053\u0000\u0000\u0169\u0173\u00051\u0000\u0000\u016a\u016b\u00054"+
		"\u0000\u0000\u016b\u016c\u0005\u0012\u0000\u0000\u016c\u0173\u00054\u0000"+
		"\u0000\u016d\u0173\u00054\u0000\u0000\u016e\u016f\u0005\u000f\u0000\u0000"+
		"\u016f\u0170\u0003$\u0012\u0000\u0170\u0171\u0005\u0010\u0000\u0000\u0171"+
		"\u0173\u0001\u0000\u0000\u0000\u0172\u014d\u0001\u0000\u0000\u0000\u0172"+
		"\u0150\u0001\u0000\u0000\u0000\u0172\u0152\u0001\u0000\u0000\u0000\u0172"+
		"\u0158\u0001\u0000\u0000\u0000\u0172\u0160\u0001\u0000\u0000\u0000\u0172"+
		"\u0165\u0001\u0000\u0000\u0000\u0172\u0166\u0001\u0000\u0000\u0000\u0172"+
		"\u0167\u0001\u0000\u0000\u0000\u0172\u0168\u0001\u0000\u0000\u0000\u0172"+
		"\u0169\u0001\u0000\u0000\u0000\u0172\u016a\u0001\u0000\u0000\u0000\u0172"+
		"\u016d\u0001\u0000\u0000\u0000\u0172\u016e\u0001\u0000\u0000\u0000\u0173"+
		"\u018a\u0001\u0000\u0000\u0000\u0174\u0175\n\u0011\u0000\u0000\u0175\u0176"+
		"\u0007\u0001\u0000\u0000\u0176\u0189\u0003$\u0012\u0012\u0177\u0178\n"+
		"\u0010\u0000\u0000\u0178\u0179\u0007\u0002\u0000\u0000\u0179\u0189\u0003"+
		"$\u0012\u0011\u017a\u017b\n\u000f\u0000\u0000\u017b\u017c\u0007\u0003"+
		"\u0000\u0000\u017c\u0189\u0003$\u0012\u0010\u017d\u017e\n\u000e\u0000"+
		"\u0000\u017e\u017f\u0003&\u0013\u0000\u017f\u0180\u0003$\u0012\u000f\u0180"+
		"\u0189\u0001\u0000\u0000\u0000\u0181\u0182\n\r\u0000\u0000\u0182\u0183"+
		"\u0003(\u0014\u0000\u0183\u0184\u0003$\u0012\u000e\u0184\u0189\u0001\u0000"+
		"\u0000\u0000\u0185\u0186\n\f\u0000\u0000\u0186\u0187\u0005,\u0000\u0000"+
		"\u0187\u0189\u0003$\u0012\r\u0188\u0174\u0001\u0000\u0000\u0000\u0188"+
		"\u0177\u0001\u0000\u0000\u0000\u0188\u017a\u0001\u0000\u0000\u0000\u0188"+
		"\u017d\u0001\u0000\u0000\u0000\u0188\u0181\u0001\u0000\u0000\u0000\u0188"+
		"\u0185\u0001\u0000\u0000\u0000\u0189\u018c\u0001\u0000\u0000\u0000\u018a"+
		"\u0188\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b"+
		"%\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018d\u018e"+
		"\u0005/\u0000\u0000\u018e\'\u0001\u0000\u0000\u0000\u018f\u0190\u0005"+
		"0\u0000\u0000\u0190)\u0001\u0000\u0000\u0000\u0015-/9\u00bd\u00db\u00e2"+
		"\u00e7\u00f1\u00f7\u00fe\u010d\u011c\u0125\u012c\u0133\u0140\u0148\u0155"+
		"\u0172\u0188\u018a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}