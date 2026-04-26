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
		T__24=25, T__25=26, STRING=27, INT=28, REAL=29, ID=30, WS=31;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_type = 2, RULE_expr = 3, RULE_andOp = 4, 
		RULE_orOp = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "type", "expr", "andOp", "orOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Create'", "'['", "']'", "';'", "'be transformed into'", "'Confess'", 
			"'Reveal'", "':'", "'in the image of'", "'Mortal'", "'Divine'", "'SmallDivine'", 
			"'Eternal'", "'Dogma'", "'NEG'", "'*'", "'/'", "'+'", "'-'", "'XOR'", 
			"'Heaven'", "'Hell'", "'('", "')'", "'AND'", "'OR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "STRING", "INT", "REAL", "ID", "WS"
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
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
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
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				stat();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1073742018L) != 0) );
			setState(17);
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
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteArrayToContext extends StatContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public TerminalNode INT() { return getToken(LangXParser.INT, 0); }
		public WriteArrayToContext(StatContext ctx) { copyFrom(ctx); }
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
	public static class ReadArrayElemContext extends StatContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReadArrayElemContext(StatContext ctx) { copyFrom(ctx); }
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
	public static class WriteIdContext extends StatContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public WriteIdContext(StatContext ctx) { copyFrom(ctx); }
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
	public static class WriteArrayFromContext extends StatContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public TerminalNode INT() { return getToken(LangXParser.INT, 0); }
		public WriteArrayFromContext(StatContext ctx) { copyFrom(ctx); }
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
	public static class DeclareAndAssignContext extends StatContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclareAndAssignContext(StatContext ctx) { copyFrom(ctx); }
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
	public static class ReadContext extends StatContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public ReadContext(StatContext ctx) { copyFrom(ctx); }
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
	public static class DeclareContext extends StatContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public DeclareContext(StatContext ctx) { copyFrom(ctx); }
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
	public static class AssignArrayElemContext extends StatContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignArrayElemContext(StatContext ctx) { copyFrom(ctx); }
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
	public static class WriteArrayRangeContext extends StatContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public List<TerminalNode> INT() { return getTokens(LangXParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LangXParser.INT, i);
		}
		public WriteArrayRangeContext(StatContext ctx) { copyFrom(ctx); }
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
	public static class WriteContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WriteContext(StatContext ctx) { copyFrom(ctx); }
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
	public static class DeclareArrayContext extends StatContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public TerminalNode INT() { return getToken(LangXParser.INT, 0); }
		public DeclareArrayContext(StatContext ctx) { copyFrom(ctx); }
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
	public static class AssignContext extends StatContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitAssign(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new DeclareArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(T__0);
				setState(20);
				type();
				setState(21);
				match(ID);
				setState(22);
				match(T__1);
				setState(23);
				match(INT);
				setState(24);
				match(T__2);
				setState(25);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new AssignArrayElemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(ID);
				setState(28);
				match(T__1);
				setState(29);
				expr(0);
				setState(30);
				match(T__2);
				setState(31);
				match(T__4);
				setState(32);
				expr(0);
				setState(33);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new ReadArrayElemContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				match(T__5);
				setState(36);
				match(ID);
				setState(37);
				match(T__1);
				setState(38);
				expr(0);
				setState(39);
				match(T__2);
				setState(40);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new WriteIdContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				match(T__6);
				setState(43);
				match(ID);
				setState(44);
				match(T__3);
				}
				break;
			case 5:
				_localctx = new WriteArrayRangeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				match(T__6);
				setState(46);
				match(ID);
				setState(47);
				match(T__1);
				setState(48);
				match(INT);
				setState(49);
				match(T__7);
				setState(50);
				match(INT);
				setState(51);
				match(T__2);
				setState(52);
				match(T__3);
				}
				break;
			case 6:
				_localctx = new WriteArrayFromContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				match(T__6);
				setState(54);
				match(ID);
				setState(55);
				match(T__1);
				setState(56);
				match(INT);
				setState(57);
				match(T__7);
				setState(58);
				match(T__2);
				setState(59);
				match(T__3);
				}
				break;
			case 7:
				_localctx = new WriteArrayToContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				match(T__6);
				setState(61);
				match(ID);
				setState(62);
				match(T__1);
				setState(63);
				match(T__7);
				setState(64);
				match(INT);
				setState(65);
				match(T__2);
				setState(66);
				match(T__3);
				}
				break;
			case 8:
				_localctx = new DeclareAndAssignContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(67);
				match(T__0);
				setState(68);
				type();
				setState(69);
				match(ID);
				setState(70);
				match(T__8);
				setState(71);
				expr(0);
				setState(72);
				match(T__3);
				}
				break;
			case 9:
				_localctx = new DeclareContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(74);
				match(T__0);
				setState(75);
				type();
				setState(76);
				match(ID);
				setState(77);
				match(T__3);
				}
				break;
			case 10:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(79);
				match(ID);
				setState(80);
				match(T__4);
				setState(81);
				expr(0);
				setState(82);
				match(T__3);
				}
				break;
			case 11:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(84);
				match(T__6);
				setState(85);
				expr(0);
				setState(86);
				match(T__3);
				}
				break;
			case 12:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(88);
				match(T__5);
				setState(89);
				match(ID);
				setState(90);
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
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31744L) != 0)) ) {
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new LogicNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(96);
				match(T__14);
				setState(97);
				expr(14);
				}
				break;
			case 2:
				{
				_localctx = new ArrayElemContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				match(ID);
				setState(99);
				match(T__1);
				setState(100);
				expr(0);
				setState(101);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new TrueConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(T__20);
				}
				break;
			case 4:
				{
				_localctx = new FalseConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(T__21);
				}
				break;
			case 5:
				{
				_localctx = new IntConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new RealConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(REAL);
				}
				break;
			case 7:
				{
				_localctx = new StringConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(T__22);
				setState(110);
				expr(0);
				setState(111);
				match(T__23);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(132);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(115);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(116);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(117);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(118);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(119);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(120);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new LogicAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(121);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(122);
						andOp();
						setState(123);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new LogicOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(125);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(126);
						orOp();
						setState(127);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new LogicXorContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(130);
						((LogicXorContext)_localctx).op = match(T__19);
						setState(131);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		enterRule(_localctx, 8, RULE_andOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__24);
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
		enterRule(_localctx, 10, RULE_orOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__25);
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
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u008e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000"+
		"\f\u0000\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
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
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\\\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003r\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u0085\b\u0003\n\u0003\f\u0003\u0088"+
		"\t\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0000"+
		"\u0001\u0006\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0003\u0001\u0000"+
		"\n\u000e\u0001\u0000\u0010\u0011\u0001\u0000\u0012\u0013\u00a0\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0002[\u0001\u0000\u0000\u0000\u0004]\u0001\u0000"+
		"\u0000\u0000\u0006q\u0001\u0000\u0000\u0000\b\u0089\u0001\u0000\u0000"+
		"\u0000\n\u008b\u0001\u0000\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000"+
		"\r\f\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f"+
		"\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0011"+
		"\u0001\u0000\u0000\u0000\u0011\u0012\u0005\u0000\u0000\u0001\u0012\u0001"+
		"\u0001\u0000\u0000\u0000\u0013\u0014\u0005\u0001\u0000\u0000\u0014\u0015"+
		"\u0003\u0004\u0002\u0000\u0015\u0016\u0005\u001e\u0000\u0000\u0016\u0017"+
		"\u0005\u0002\u0000\u0000\u0017\u0018\u0005\u001c\u0000\u0000\u0018\u0019"+
		"\u0005\u0003\u0000\u0000\u0019\u001a\u0005\u0004\u0000\u0000\u001a\\\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0005\u001e\u0000\u0000\u001c\u001d\u0005"+
		"\u0002\u0000\u0000\u001d\u001e\u0003\u0006\u0003\u0000\u001e\u001f\u0005"+
		"\u0003\u0000\u0000\u001f \u0005\u0005\u0000\u0000 !\u0003\u0006\u0003"+
		"\u0000!\"\u0005\u0004\u0000\u0000\"\\\u0001\u0000\u0000\u0000#$\u0005"+
		"\u0006\u0000\u0000$%\u0005\u001e\u0000\u0000%&\u0005\u0002\u0000\u0000"+
		"&\'\u0003\u0006\u0003\u0000\'(\u0005\u0003\u0000\u0000()\u0005\u0004\u0000"+
		"\u0000)\\\u0001\u0000\u0000\u0000*+\u0005\u0007\u0000\u0000+,\u0005\u001e"+
		"\u0000\u0000,\\\u0005\u0004\u0000\u0000-.\u0005\u0007\u0000\u0000./\u0005"+
		"\u001e\u0000\u0000/0\u0005\u0002\u0000\u000001\u0005\u001c\u0000\u0000"+
		"12\u0005\b\u0000\u000023\u0005\u001c\u0000\u000034\u0005\u0003\u0000\u0000"+
		"4\\\u0005\u0004\u0000\u000056\u0005\u0007\u0000\u000067\u0005\u001e\u0000"+
		"\u000078\u0005\u0002\u0000\u000089\u0005\u001c\u0000\u00009:\u0005\b\u0000"+
		"\u0000:;\u0005\u0003\u0000\u0000;\\\u0005\u0004\u0000\u0000<=\u0005\u0007"+
		"\u0000\u0000=>\u0005\u001e\u0000\u0000>?\u0005\u0002\u0000\u0000?@\u0005"+
		"\b\u0000\u0000@A\u0005\u001c\u0000\u0000AB\u0005\u0003\u0000\u0000B\\"+
		"\u0005\u0004\u0000\u0000CD\u0005\u0001\u0000\u0000DE\u0003\u0004\u0002"+
		"\u0000EF\u0005\u001e\u0000\u0000FG\u0005\t\u0000\u0000GH\u0003\u0006\u0003"+
		"\u0000HI\u0005\u0004\u0000\u0000I\\\u0001\u0000\u0000\u0000JK\u0005\u0001"+
		"\u0000\u0000KL\u0003\u0004\u0002\u0000LM\u0005\u001e\u0000\u0000MN\u0005"+
		"\u0004\u0000\u0000N\\\u0001\u0000\u0000\u0000OP\u0005\u001e\u0000\u0000"+
		"PQ\u0005\u0005\u0000\u0000QR\u0003\u0006\u0003\u0000RS\u0005\u0004\u0000"+
		"\u0000S\\\u0001\u0000\u0000\u0000TU\u0005\u0007\u0000\u0000UV\u0003\u0006"+
		"\u0003\u0000VW\u0005\u0004\u0000\u0000W\\\u0001\u0000\u0000\u0000XY\u0005"+
		"\u0006\u0000\u0000YZ\u0005\u001e\u0000\u0000Z\\\u0005\u0004\u0000\u0000"+
		"[\u0013\u0001\u0000\u0000\u0000[\u001b\u0001\u0000\u0000\u0000[#\u0001"+
		"\u0000\u0000\u0000[*\u0001\u0000\u0000\u0000[-\u0001\u0000\u0000\u0000"+
		"[5\u0001\u0000\u0000\u0000[<\u0001\u0000\u0000\u0000[C\u0001\u0000\u0000"+
		"\u0000[J\u0001\u0000\u0000\u0000[O\u0001\u0000\u0000\u0000[T\u0001\u0000"+
		"\u0000\u0000[X\u0001\u0000\u0000\u0000\\\u0003\u0001\u0000\u0000\u0000"+
		"]^\u0007\u0000\u0000\u0000^\u0005\u0001\u0000\u0000\u0000_`\u0006\u0003"+
		"\uffff\uffff\u0000`a\u0005\u000f\u0000\u0000ar\u0003\u0006\u0003\u000e"+
		"bc\u0005\u001e\u0000\u0000cd\u0005\u0002\u0000\u0000de\u0003\u0006\u0003"+
		"\u0000ef\u0005\u0003\u0000\u0000fr\u0001\u0000\u0000\u0000gr\u0005\u0015"+
		"\u0000\u0000hr\u0005\u0016\u0000\u0000ir\u0005\u001c\u0000\u0000jr\u0005"+
		"\u001d\u0000\u0000kr\u0005\u001b\u0000\u0000lr\u0005\u001e\u0000\u0000"+
		"mn\u0005\u0017\u0000\u0000no\u0003\u0006\u0003\u0000op\u0005\u0018\u0000"+
		"\u0000pr\u0001\u0000\u0000\u0000q_\u0001\u0000\u0000\u0000qb\u0001\u0000"+
		"\u0000\u0000qg\u0001\u0000\u0000\u0000qh\u0001\u0000\u0000\u0000qi\u0001"+
		"\u0000\u0000\u0000qj\u0001\u0000\u0000\u0000qk\u0001\u0000\u0000\u0000"+
		"ql\u0001\u0000\u0000\u0000qm\u0001\u0000\u0000\u0000r\u0086\u0001\u0000"+
		"\u0000\u0000st\n\r\u0000\u0000tu\u0007\u0001\u0000\u0000u\u0085\u0003"+
		"\u0006\u0003\u000evw\n\f\u0000\u0000wx\u0007\u0002\u0000\u0000x\u0085"+
		"\u0003\u0006\u0003\ryz\n\u000b\u0000\u0000z{\u0003\b\u0004\u0000{|\u0003"+
		"\u0006\u0003\f|\u0085\u0001\u0000\u0000\u0000}~\n\n\u0000\u0000~\u007f"+
		"\u0003\n\u0005\u0000\u007f\u0080\u0003\u0006\u0003\u000b\u0080\u0085\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\n\t\u0000\u0000\u0082\u0083\u0005\u0014"+
		"\u0000\u0000\u0083\u0085\u0003\u0006\u0003\n\u0084s\u0001\u0000\u0000"+
		"\u0000\u0084v\u0001\u0000\u0000\u0000\u0084y\u0001\u0000\u0000\u0000\u0084"+
		"}\u0001\u0000\u0000\u0000\u0084\u0081\u0001\u0000\u0000\u0000\u0085\u0088"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0001\u0000\u0000\u0000\u0087\u0007\u0001\u0000\u0000\u0000\u0088\u0086"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0019\u0000\u0000\u008a\t\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005\u001a\u0000\u0000\u008c\u000b\u0001"+
		"\u0000\u0000\u0000\u0005\u000f[q\u0084\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}