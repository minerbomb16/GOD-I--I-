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
		T__31=32, T__32=33, STRING=34, INT=35, REAL=36, ID=37, WS=38;
	public static final int
		RULE_prog = 0, RULE_start = 1, RULE_functionDecl = 2, RULE_paramList = 3, 
		RULE_argList = 4, RULE_type = 5, RULE_expr = 6, RULE_andOp = 7, RULE_orOp = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "start", "functionDecl", "paramList", "argList", "type", "expr", 
			"andOp", "orOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Create'", "'['", "']'", "';'", "'be transformed into'", "'Confess'", 
			"'Reveal'", "'row'", "'column'", "':'", "'in the image of'", "'('", "')'", 
			"'Fulfill'", "'Miracle'", "'{'", "'}'", "','", "'Mortal'", "'Divine'", 
			"'SmallDivine'", "'Eternal'", "'Dogma'", "'-'", "'NEG'", "'*'", "'/'", 
			"'+'", "'XOR'", "'Heaven'", "'Hell'", "'AND'", "'OR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "STRING", 
			"INT", "REAL", "ID", "WS"
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
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(20);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(18);
					functionDecl();
					}
					break;
				case T__0:
				case T__5:
				case T__6:
				case T__13:
				case ID:
					{
					setState(19);
					start();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 137439002818L) != 0) );
			setState(24);
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
		enterRule(_localctx, 2, RULE_start);
		int _la;
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new DeclareMatrixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(T__0);
				setState(27);
				type();
				setState(28);
				match(ID);
				setState(29);
				match(T__1);
				setState(30);
				match(INT);
				setState(31);
				match(T__2);
				setState(32);
				match(T__1);
				setState(33);
				match(INT);
				setState(34);
				match(T__2);
				setState(35);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new AssignMatrixElemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(ID);
				setState(38);
				match(T__1);
				setState(39);
				expr(0);
				setState(40);
				match(T__2);
				setState(41);
				match(T__1);
				setState(42);
				expr(0);
				setState(43);
				match(T__2);
				setState(44);
				match(T__4);
				setState(45);
				expr(0);
				setState(46);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new ReadMatrixElemContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(T__5);
				setState(49);
				match(ID);
				setState(50);
				match(T__1);
				setState(51);
				expr(0);
				setState(52);
				match(T__2);
				setState(53);
				match(T__1);
				setState(54);
				expr(0);
				setState(55);
				match(T__2);
				setState(56);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new WriteMatrixRowContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				match(T__6);
				setState(59);
				match(T__7);
				setState(60);
				match(ID);
				setState(61);
				match(T__1);
				setState(62);
				match(INT);
				setState(63);
				match(T__2);
				setState(64);
				match(T__3);
				}
				break;
			case 5:
				_localctx = new WriteMatrixColumnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				match(T__6);
				setState(66);
				match(T__8);
				setState(67);
				match(ID);
				setState(68);
				match(T__1);
				setState(69);
				match(INT);
				setState(70);
				match(T__2);
				setState(71);
				match(T__3);
				}
				break;
			case 6:
				_localctx = new DeclareArrayContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				match(T__0);
				setState(73);
				type();
				setState(74);
				match(ID);
				setState(75);
				match(T__1);
				setState(76);
				match(INT);
				setState(77);
				match(T__2);
				setState(78);
				match(T__3);
				}
				break;
			case 7:
				_localctx = new AssignArrayElemContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(80);
				match(ID);
				setState(81);
				match(T__1);
				setState(82);
				expr(0);
				setState(83);
				match(T__2);
				setState(84);
				match(T__4);
				setState(85);
				expr(0);
				setState(86);
				match(T__3);
				}
				break;
			case 8:
				_localctx = new ReadArrayElemContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(88);
				match(T__5);
				setState(89);
				match(ID);
				setState(90);
				match(T__1);
				setState(91);
				expr(0);
				setState(92);
				match(T__2);
				setState(93);
				match(T__3);
				}
				break;
			case 9:
				_localctx = new WriteIdContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(95);
				match(T__6);
				setState(96);
				match(ID);
				setState(97);
				match(T__3);
				}
				break;
			case 10:
				_localctx = new WriteArrayRangeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(98);
				match(T__6);
				setState(99);
				match(ID);
				setState(100);
				match(T__1);
				setState(101);
				match(INT);
				setState(102);
				match(T__9);
				setState(103);
				match(INT);
				setState(104);
				match(T__2);
				setState(105);
				match(T__3);
				}
				break;
			case 11:
				_localctx = new WriteArrayFromContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(106);
				match(T__6);
				setState(107);
				match(ID);
				setState(108);
				match(T__1);
				setState(109);
				match(INT);
				setState(110);
				match(T__9);
				setState(111);
				match(T__2);
				setState(112);
				match(T__3);
				}
				break;
			case 12:
				_localctx = new WriteArrayToContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(113);
				match(T__6);
				setState(114);
				match(ID);
				setState(115);
				match(T__1);
				setState(116);
				match(T__9);
				setState(117);
				match(INT);
				setState(118);
				match(T__2);
				setState(119);
				match(T__3);
				}
				break;
			case 13:
				_localctx = new DeclareAndAssignContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(120);
				match(T__0);
				setState(121);
				type();
				setState(122);
				match(ID);
				setState(123);
				match(T__10);
				setState(124);
				expr(0);
				setState(125);
				match(T__3);
				}
				break;
			case 14:
				_localctx = new DeclareContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(127);
				match(T__0);
				setState(128);
				type();
				setState(129);
				match(ID);
				setState(130);
				match(T__3);
				}
				break;
			case 15:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(132);
				match(ID);
				setState(133);
				match(T__4);
				setState(134);
				expr(0);
				setState(135);
				match(T__3);
				}
				break;
			case 16:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(137);
				match(T__6);
				setState(138);
				expr(0);
				setState(139);
				match(T__3);
				}
				break;
			case 17:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(141);
				match(T__5);
				setState(142);
				match(ID);
				setState(143);
				match(T__3);
				}
				break;
			case 18:
				_localctx = new FunctionCallStatContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(144);
				match(ID);
				setState(145);
				match(T__11);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 260969598976L) != 0)) {
					{
					setState(146);
					argList();
					}
				}

				setState(149);
				match(T__12);
				}
				break;
			case 19:
				_localctx = new ReturnStatContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(150);
				match(T__13);
				setState(151);
				expr(0);
				setState(152);
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
	public static class FunctionDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 4, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__14);
			setState(157);
			type();
			setState(158);
			match(ID);
			setState(159);
			match(T__11);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16252928L) != 0)) {
				{
				setState(160);
				paramList();
				}
			}

			setState(163);
			match(T__12);
			setState(164);
			match(T__15);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438970050L) != 0)) {
				{
				{
				setState(165);
				start();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(T__16);
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
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
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
		enterRule(_localctx, 6, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			type();
			setState(174);
			match(ID);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(175);
				match(T__17);
				setState(176);
				type();
				setState(177);
				match(ID);
				}
				}
				setState(183);
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
		enterRule(_localctx, 8, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			expr(0);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(185);
				match(T__17);
				setState(186);
				expr(0);
				}
				}
				setState(191);
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
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16252928L) != 0)) ) {
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(195);
				match(T__23);
				setState(196);
				expr(17);
				}
				break;
			case 2:
				{
				_localctx = new LogicNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				match(T__24);
				setState(198);
				expr(16);
				}
				break;
			case 3:
				{
				_localctx = new MatrixElemContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(ID);
				setState(200);
				match(T__1);
				setState(201);
				expr(0);
				setState(202);
				match(T__2);
				setState(203);
				match(T__1);
				setState(204);
				expr(0);
				setState(205);
				match(T__2);
				}
				break;
			case 4:
				{
				_localctx = new ArrayElemContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(ID);
				setState(208);
				match(T__1);
				setState(209);
				expr(0);
				setState(210);
				match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new TrueConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				match(T__29);
				}
				break;
			case 6:
				{
				_localctx = new FalseConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				match(T__30);
				}
				break;
			case 7:
				{
				_localctx = new IntConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(INT);
				}
				break;
			case 8:
				{
				_localctx = new RealConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				match(REAL);
				}
				break;
			case 9:
				{
				_localctx = new StringConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				match(STRING);
				}
				break;
			case 10:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(ID);
				}
				break;
			case 11:
				{
				_localctx = new FunctionCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(ID);
				setState(219);
				match(T__11);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 260969598976L) != 0)) {
					{
					setState(220);
					argList();
					}
				}

				setState(223);
				match(T__12);
				}
				break;
			case 12:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(T__11);
				setState(225);
				expr(0);
				setState(226);
				match(T__12);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(247);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(231);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(232);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(234);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__27) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(235);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new LogicAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(237);
						andOp();
						setState(238);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new LogicOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(240);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(241);
						orOp();
						setState(242);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new LogicXorContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(244);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(245);
						((LogicXorContext)_localctx).op = match(T__28);
						setState(246);
						expr(12);
						}
						break;
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 14, RULE_andOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__31);
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
		enterRule(_localctx, 16, RULE_orOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__32);
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
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001&\u0101\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0004\u0000\u0015\b\u0000\u000b\u0000"+
		"\f\u0000\u0016\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0094\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u009b\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u00a2\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"\u00a7\b\u0002\n\u0002\f\u0002\u00aa\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u00b4\b\u0003\n\u0003\f\u0003\u00b7\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u00bc\b\u0004\n\u0004\f\u0004\u00bf\t\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00de"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00e5\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u00f8\b\u0006\n\u0006\f\u0006\u00fb\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0000\u0001\f\t\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0000\u0003\u0001\u0000\u0013\u0017\u0001\u0000"+
		"\u001a\u001b\u0002\u0000\u0018\u0018\u001c\u001c\u0121\u0000\u0014\u0001"+
		"\u0000\u0000\u0000\u0002\u009a\u0001\u0000\u0000\u0000\u0004\u009c\u0001"+
		"\u0000\u0000\u0000\u0006\u00ad\u0001\u0000\u0000\u0000\b\u00b8\u0001\u0000"+
		"\u0000\u0000\n\u00c0\u0001\u0000\u0000\u0000\f\u00e4\u0001\u0000\u0000"+
		"\u0000\u000e\u00fc\u0001\u0000\u0000\u0000\u0010\u00fe\u0001\u0000\u0000"+
		"\u0000\u0012\u0015\u0003\u0004\u0002\u0000\u0013\u0015\u0003\u0002\u0001"+
		"\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0014\u0013\u0001\u0000\u0000"+
		"\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000"+
		"\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000"+
		"\u0000\u0018\u0019\u0005\u0000\u0000\u0001\u0019\u0001\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0005\u0001\u0000\u0000\u001b\u001c\u0003\n\u0005\u0000"+
		"\u001c\u001d\u0005%\u0000\u0000\u001d\u001e\u0005\u0002\u0000\u0000\u001e"+
		"\u001f\u0005#\u0000\u0000\u001f \u0005\u0003\u0000\u0000 !\u0005\u0002"+
		"\u0000\u0000!\"\u0005#\u0000\u0000\"#\u0005\u0003\u0000\u0000#$\u0005"+
		"\u0004\u0000\u0000$\u009b\u0001\u0000\u0000\u0000%&\u0005%\u0000\u0000"+
		"&\'\u0005\u0002\u0000\u0000\'(\u0003\f\u0006\u0000()\u0005\u0003\u0000"+
		"\u0000)*\u0005\u0002\u0000\u0000*+\u0003\f\u0006\u0000+,\u0005\u0003\u0000"+
		"\u0000,-\u0005\u0005\u0000\u0000-.\u0003\f\u0006\u0000./\u0005\u0004\u0000"+
		"\u0000/\u009b\u0001\u0000\u0000\u000001\u0005\u0006\u0000\u000012\u0005"+
		"%\u0000\u000023\u0005\u0002\u0000\u000034\u0003\f\u0006\u000045\u0005"+
		"\u0003\u0000\u000056\u0005\u0002\u0000\u000067\u0003\f\u0006\u000078\u0005"+
		"\u0003\u0000\u000089\u0005\u0004\u0000\u00009\u009b\u0001\u0000\u0000"+
		"\u0000:;\u0005\u0007\u0000\u0000;<\u0005\b\u0000\u0000<=\u0005%\u0000"+
		"\u0000=>\u0005\u0002\u0000\u0000>?\u0005#\u0000\u0000?@\u0005\u0003\u0000"+
		"\u0000@\u009b\u0005\u0004\u0000\u0000AB\u0005\u0007\u0000\u0000BC\u0005"+
		"\t\u0000\u0000CD\u0005%\u0000\u0000DE\u0005\u0002\u0000\u0000EF\u0005"+
		"#\u0000\u0000FG\u0005\u0003\u0000\u0000G\u009b\u0005\u0004\u0000\u0000"+
		"HI\u0005\u0001\u0000\u0000IJ\u0003\n\u0005\u0000JK\u0005%\u0000\u0000"+
		"KL\u0005\u0002\u0000\u0000LM\u0005#\u0000\u0000MN\u0005\u0003\u0000\u0000"+
		"NO\u0005\u0004\u0000\u0000O\u009b\u0001\u0000\u0000\u0000PQ\u0005%\u0000"+
		"\u0000QR\u0005\u0002\u0000\u0000RS\u0003\f\u0006\u0000ST\u0005\u0003\u0000"+
		"\u0000TU\u0005\u0005\u0000\u0000UV\u0003\f\u0006\u0000VW\u0005\u0004\u0000"+
		"\u0000W\u009b\u0001\u0000\u0000\u0000XY\u0005\u0006\u0000\u0000YZ\u0005"+
		"%\u0000\u0000Z[\u0005\u0002\u0000\u0000[\\\u0003\f\u0006\u0000\\]\u0005"+
		"\u0003\u0000\u0000]^\u0005\u0004\u0000\u0000^\u009b\u0001\u0000\u0000"+
		"\u0000_`\u0005\u0007\u0000\u0000`a\u0005%\u0000\u0000a\u009b\u0005\u0004"+
		"\u0000\u0000bc\u0005\u0007\u0000\u0000cd\u0005%\u0000\u0000de\u0005\u0002"+
		"\u0000\u0000ef\u0005#\u0000\u0000fg\u0005\n\u0000\u0000gh\u0005#\u0000"+
		"\u0000hi\u0005\u0003\u0000\u0000i\u009b\u0005\u0004\u0000\u0000jk\u0005"+
		"\u0007\u0000\u0000kl\u0005%\u0000\u0000lm\u0005\u0002\u0000\u0000mn\u0005"+
		"#\u0000\u0000no\u0005\n\u0000\u0000op\u0005\u0003\u0000\u0000p\u009b\u0005"+
		"\u0004\u0000\u0000qr\u0005\u0007\u0000\u0000rs\u0005%\u0000\u0000st\u0005"+
		"\u0002\u0000\u0000tu\u0005\n\u0000\u0000uv\u0005#\u0000\u0000vw\u0005"+
		"\u0003\u0000\u0000w\u009b\u0005\u0004\u0000\u0000xy\u0005\u0001\u0000"+
		"\u0000yz\u0003\n\u0005\u0000z{\u0005%\u0000\u0000{|\u0005\u000b\u0000"+
		"\u0000|}\u0003\f\u0006\u0000}~\u0005\u0004\u0000\u0000~\u009b\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005\u0001\u0000\u0000\u0080\u0081\u0003\n\u0005"+
		"\u0000\u0081\u0082\u0005%\u0000\u0000\u0082\u0083\u0005\u0004\u0000\u0000"+
		"\u0083\u009b\u0001\u0000\u0000\u0000\u0084\u0085\u0005%\u0000\u0000\u0085"+
		"\u0086\u0005\u0005\u0000\u0000\u0086\u0087\u0003\f\u0006\u0000\u0087\u0088"+
		"\u0005\u0004\u0000\u0000\u0088\u009b\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005\u0007\u0000\u0000\u008a\u008b\u0003\f\u0006\u0000\u008b\u008c\u0005"+
		"\u0004\u0000\u0000\u008c\u009b\u0001\u0000\u0000\u0000\u008d\u008e\u0005"+
		"\u0006\u0000\u0000\u008e\u008f\u0005%\u0000\u0000\u008f\u009b\u0005\u0004"+
		"\u0000\u0000\u0090\u0091\u0005%\u0000\u0000\u0091\u0093\u0005\f\u0000"+
		"\u0000\u0092\u0094\u0003\b\u0004\u0000\u0093\u0092\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u009b\u0005\r\u0000\u0000\u0096\u0097\u0005\u000e\u0000\u0000\u0097"+
		"\u0098\u0003\f\u0006\u0000\u0098\u0099\u0005\u0004\u0000\u0000\u0099\u009b"+
		"\u0001\u0000\u0000\u0000\u009a\u001a\u0001\u0000\u0000\u0000\u009a%\u0001"+
		"\u0000\u0000\u0000\u009a0\u0001\u0000\u0000\u0000\u009a:\u0001\u0000\u0000"+
		"\u0000\u009aA\u0001\u0000\u0000\u0000\u009aH\u0001\u0000\u0000\u0000\u009a"+
		"P\u0001\u0000\u0000\u0000\u009aX\u0001\u0000\u0000\u0000\u009a_\u0001"+
		"\u0000\u0000\u0000\u009ab\u0001\u0000\u0000\u0000\u009aj\u0001\u0000\u0000"+
		"\u0000\u009aq\u0001\u0000\u0000\u0000\u009ax\u0001\u0000\u0000\u0000\u009a"+
		"\u007f\u0001\u0000\u0000\u0000\u009a\u0084\u0001\u0000\u0000\u0000\u009a"+
		"\u0089\u0001\u0000\u0000\u0000\u009a\u008d\u0001\u0000\u0000\u0000\u009a"+
		"\u0090\u0001\u0000\u0000\u0000\u009a\u0096\u0001\u0000\u0000\u0000\u009b"+
		"\u0003\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u000f\u0000\u0000\u009d"+
		"\u009e\u0003\n\u0005\u0000\u009e\u009f\u0005%\u0000\u0000\u009f\u00a1"+
		"\u0005\f\u0000\u0000\u00a0\u00a2\u0003\u0006\u0003\u0000\u00a1\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005\r\u0000\u0000\u00a4\u00a8\u0005\u0010"+
		"\u0000\u0000\u00a5\u00a7\u0003\u0002\u0001\u0000\u00a6\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0011"+
		"\u0000\u0000\u00ac\u0005\u0001\u0000\u0000\u0000\u00ad\u00ae\u0003\n\u0005"+
		"\u0000\u00ae\u00b5\u0005%\u0000\u0000\u00af\u00b0\u0005\u0012\u0000\u0000"+
		"\u00b0\u00b1\u0003\n\u0005\u0000\u00b1\u00b2\u0005%\u0000\u0000\u00b2"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b3\u00af\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u0007\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b8\u00bd\u0003\f\u0006\u0000\u00b9\u00ba"+
		"\u0005\u0012\u0000\u0000\u00ba\u00bc\u0003\f\u0006\u0000\u00bb\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\t\u0001\u0000"+
		"\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c1\u0007\u0000"+
		"\u0000\u0000\u00c1\u000b\u0001\u0000\u0000\u0000\u00c2\u00c3\u0006\u0006"+
		"\uffff\uffff\u0000\u00c3\u00c4\u0005\u0018\u0000\u0000\u00c4\u00e5\u0003"+
		"\f\u0006\u0011\u00c5\u00c6\u0005\u0019\u0000\u0000\u00c6\u00e5\u0003\f"+
		"\u0006\u0010\u00c7\u00c8\u0005%\u0000\u0000\u00c8\u00c9\u0005\u0002\u0000"+
		"\u0000\u00c9\u00ca\u0003\f\u0006\u0000\u00ca\u00cb\u0005\u0003\u0000\u0000"+
		"\u00cb\u00cc\u0005\u0002\u0000\u0000\u00cc\u00cd\u0003\f\u0006\u0000\u00cd"+
		"\u00ce\u0005\u0003\u0000\u0000\u00ce\u00e5\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0005%\u0000\u0000\u00d0\u00d1\u0005\u0002\u0000\u0000\u00d1\u00d2"+
		"\u0003\f\u0006\u0000\u00d2\u00d3\u0005\u0003\u0000\u0000\u00d3\u00e5\u0001"+
		"\u0000\u0000\u0000\u00d4\u00e5\u0005\u001e\u0000\u0000\u00d5\u00e5\u0005"+
		"\u001f\u0000\u0000\u00d6\u00e5\u0005#\u0000\u0000\u00d7\u00e5\u0005$\u0000"+
		"\u0000\u00d8\u00e5\u0005\"\u0000\u0000\u00d9\u00e5\u0005%\u0000\u0000"+
		"\u00da\u00db\u0005%\u0000\u0000\u00db\u00dd\u0005\f\u0000\u0000\u00dc"+
		"\u00de\u0003\b\u0004\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e5"+
		"\u0005\r\u0000\u0000\u00e0\u00e1\u0005\f\u0000\u0000\u00e1\u00e2\u0003"+
		"\f\u0006\u0000\u00e2\u00e3\u0005\r\u0000\u0000\u00e3\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e4\u00c2\u0001\u0000\u0000\u0000\u00e4\u00c5\u0001\u0000"+
		"\u0000\u0000\u00e4\u00c7\u0001\u0000\u0000\u0000\u00e4\u00cf\u0001\u0000"+
		"\u0000\u0000\u00e4\u00d4\u0001\u0000\u0000\u0000\u00e4\u00d5\u0001\u0000"+
		"\u0000\u0000\u00e4\u00d6\u0001\u0000\u0000\u0000\u00e4\u00d7\u0001\u0000"+
		"\u0000\u0000\u00e4\u00d8\u0001\u0000\u0000\u0000\u00e4\u00d9\u0001\u0000"+
		"\u0000\u0000\u00e4\u00da\u0001\u0000\u0000\u0000\u00e4\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e5\u00f9\u0001\u0000\u0000\u0000\u00e6\u00e7\n\u000f\u0000"+
		"\u0000\u00e7\u00e8\u0007\u0001\u0000\u0000\u00e8\u00f8\u0003\f\u0006\u0010"+
		"\u00e9\u00ea\n\u000e\u0000\u0000\u00ea\u00eb\u0007\u0002\u0000\u0000\u00eb"+
		"\u00f8\u0003\f\u0006\u000f\u00ec\u00ed\n\r\u0000\u0000\u00ed\u00ee\u0003"+
		"\u000e\u0007\u0000\u00ee\u00ef\u0003\f\u0006\u000e\u00ef\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\n\f\u0000\u0000\u00f1\u00f2\u0003\u0010\b\u0000"+
		"\u00f2\u00f3\u0003\f\u0006\r\u00f3\u00f8\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\n\u000b\u0000\u0000\u00f5\u00f6\u0005\u001d\u0000\u0000\u00f6\u00f8"+
		"\u0003\f\u0006\f\u00f7\u00e6\u0001\u0000\u0000\u0000\u00f7\u00e9\u0001"+
		"\u0000\u0000\u0000\u00f7\u00ec\u0001\u0000\u0000\u0000\u00f7\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f4\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fa\r\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0005 \u0000\u0000\u00fd\u000f\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0005!\u0000\u0000\u00ff\u0011\u0001\u0000\u0000\u0000"+
		"\f\u0014\u0016\u0093\u009a\u00a1\u00a8\u00b5\u00bd\u00dd\u00e4\u00f7\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}