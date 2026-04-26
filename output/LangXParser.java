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
		RULE_prog = 0, RULE_stat = 1, RULE_type = 2, RULE_expr = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "type", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Create'", "'['", "']'", "';'", "'be transformed into'", "'Confess'", 
			"'Reveal'", "':'", "'in the image of'", "'Mortal'", "'Divine'", "'SmallDivine'", 
			"'Eternal'", "'Dogma'", "'NEG'", "'*'", "'/'", "'+'", "'-'", "'AND'", 
			"'OR'", "'XOR'", "'Heaven'", "'Hell'", "'('", "')'"
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
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				stat();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1073742018L) != 0) );
			setState(13);
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
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new DeclareArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				match(T__0);
				setState(16);
				type();
				setState(17);
				match(ID);
				setState(18);
				match(T__1);
				setState(19);
				match(INT);
				setState(20);
				match(T__2);
				setState(21);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new AssignArrayElemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(ID);
				setState(24);
				match(T__1);
				setState(25);
				expr(0);
				setState(26);
				match(T__2);
				setState(27);
				match(T__4);
				setState(28);
				expr(0);
				setState(29);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new ReadArrayElemContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				match(T__5);
				setState(32);
				match(ID);
				setState(33);
				match(T__1);
				setState(34);
				expr(0);
				setState(35);
				match(T__2);
				setState(36);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new WriteIdContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				match(T__6);
				setState(39);
				match(ID);
				setState(40);
				match(T__3);
				}
				break;
			case 5:
				_localctx = new WriteArrayRangeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				match(T__6);
				setState(42);
				match(ID);
				setState(43);
				match(T__1);
				setState(44);
				match(INT);
				setState(45);
				match(T__7);
				setState(46);
				match(INT);
				setState(47);
				match(T__2);
				setState(48);
				match(T__3);
				}
				break;
			case 6:
				_localctx = new WriteArrayFromContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(49);
				match(T__6);
				setState(50);
				match(ID);
				setState(51);
				match(T__1);
				setState(52);
				match(INT);
				setState(53);
				match(T__7);
				setState(54);
				match(T__2);
				setState(55);
				match(T__3);
				}
				break;
			case 7:
				_localctx = new WriteArrayToContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(56);
				match(T__6);
				setState(57);
				match(ID);
				setState(58);
				match(T__1);
				setState(59);
				match(T__7);
				setState(60);
				match(INT);
				setState(61);
				match(T__2);
				setState(62);
				match(T__3);
				}
				break;
			case 8:
				_localctx = new DeclareAndAssignContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(63);
				match(T__0);
				setState(64);
				type();
				setState(65);
				match(ID);
				setState(66);
				match(T__8);
				setState(67);
				expr(0);
				setState(68);
				match(T__3);
				}
				break;
			case 9:
				_localctx = new DeclareContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(70);
				match(T__0);
				setState(71);
				type();
				setState(72);
				match(ID);
				setState(73);
				match(T__3);
				}
				break;
			case 10:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(75);
				match(ID);
				setState(76);
				match(T__4);
				setState(77);
				expr(0);
				setState(78);
				match(T__3);
				}
				break;
			case 11:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(80);
				match(T__6);
				setState(81);
				expr(0);
				setState(82);
				match(T__3);
				}
				break;
			case 12:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(84);
				match(T__5);
				setState(85);
				match(ID);
				setState(86);
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
			setState(89);
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
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new LogicNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(92);
				match(T__14);
				setState(93);
				expr(14);
				}
				break;
			case 2:
				{
				_localctx = new ArrayElemContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				match(ID);
				setState(95);
				match(T__1);
				setState(96);
				expr(0);
				setState(97);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new TrueConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(T__22);
				}
				break;
			case 4:
				{
				_localctx = new FalseConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(T__23);
				}
				break;
			case 5:
				{
				_localctx = new IntConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new RealConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(REAL);
				}
				break;
			case 7:
				{
				_localctx = new StringConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				match(T__24);
				setState(106);
				expr(0);
				setState(107);
				match(T__25);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(126);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(112);
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
						setState(113);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(114);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(115);
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
						setState(116);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new LogicAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(118);
						((LogicAndContext)_localctx).op = match(T__19);
						setState(119);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new LogicOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(121);
						((LogicOrContext)_localctx).op = match(T__20);
						setState(122);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new LogicXorContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(124);
						((LogicXorContext)_localctx).op = match(T__21);
						setState(125);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(130);
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
		"\u0004\u0001\u001f\u0084\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0004\u0000"+
		"\n\b\u0000\u000b\u0000\f\u0000\u000b\u0001\u0000\u0001\u0000\u0001\u0001"+
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
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"X\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003n\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u007f\b\u0003\n\u0003\f\u0003\u0082"+
		"\t\u0003\u0001\u0003\u0000\u0001\u0006\u0004\u0000\u0002\u0004\u0006\u0000"+
		"\u0003\u0001\u0000\n\u000e\u0001\u0000\u0010\u0011\u0001\u0000\u0012\u0013"+
		"\u0098\u0000\t\u0001\u0000\u0000\u0000\u0002W\u0001\u0000\u0000\u0000"+
		"\u0004Y\u0001\u0000\u0000\u0000\u0006m\u0001\u0000\u0000\u0000\b\n\u0003"+
		"\u0002\u0001\u0000\t\b\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000"+
		"\u0000\u000b\t\u0001\u0000\u0000\u0000\u000b\f\u0001\u0000\u0000\u0000"+
		"\f\r\u0001\u0000\u0000\u0000\r\u000e\u0005\u0000\u0000\u0001\u000e\u0001"+
		"\u0001\u0000\u0000\u0000\u000f\u0010\u0005\u0001\u0000\u0000\u0010\u0011"+
		"\u0003\u0004\u0002\u0000\u0011\u0012\u0005\u001e\u0000\u0000\u0012\u0013"+
		"\u0005\u0002\u0000\u0000\u0013\u0014\u0005\u001c\u0000\u0000\u0014\u0015"+
		"\u0005\u0003\u0000\u0000\u0015\u0016\u0005\u0004\u0000\u0000\u0016X\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0005\u001e\u0000\u0000\u0018\u0019\u0005"+
		"\u0002\u0000\u0000\u0019\u001a\u0003\u0006\u0003\u0000\u001a\u001b\u0005"+
		"\u0003\u0000\u0000\u001b\u001c\u0005\u0005\u0000\u0000\u001c\u001d\u0003"+
		"\u0006\u0003\u0000\u001d\u001e\u0005\u0004\u0000\u0000\u001eX\u0001\u0000"+
		"\u0000\u0000\u001f \u0005\u0006\u0000\u0000 !\u0005\u001e\u0000\u0000"+
		"!\"\u0005\u0002\u0000\u0000\"#\u0003\u0006\u0003\u0000#$\u0005\u0003\u0000"+
		"\u0000$%\u0005\u0004\u0000\u0000%X\u0001\u0000\u0000\u0000&\'\u0005\u0007"+
		"\u0000\u0000\'(\u0005\u001e\u0000\u0000(X\u0005\u0004\u0000\u0000)*\u0005"+
		"\u0007\u0000\u0000*+\u0005\u001e\u0000\u0000+,\u0005\u0002\u0000\u0000"+
		",-\u0005\u001c\u0000\u0000-.\u0005\b\u0000\u0000./\u0005\u001c\u0000\u0000"+
		"/0\u0005\u0003\u0000\u00000X\u0005\u0004\u0000\u000012\u0005\u0007\u0000"+
		"\u000023\u0005\u001e\u0000\u000034\u0005\u0002\u0000\u000045\u0005\u001c"+
		"\u0000\u000056\u0005\b\u0000\u000067\u0005\u0003\u0000\u00007X\u0005\u0004"+
		"\u0000\u000089\u0005\u0007\u0000\u00009:\u0005\u001e\u0000\u0000:;\u0005"+
		"\u0002\u0000\u0000;<\u0005\b\u0000\u0000<=\u0005\u001c\u0000\u0000=>\u0005"+
		"\u0003\u0000\u0000>X\u0005\u0004\u0000\u0000?@\u0005\u0001\u0000\u0000"+
		"@A\u0003\u0004\u0002\u0000AB\u0005\u001e\u0000\u0000BC\u0005\t\u0000\u0000"+
		"CD\u0003\u0006\u0003\u0000DE\u0005\u0004\u0000\u0000EX\u0001\u0000\u0000"+
		"\u0000FG\u0005\u0001\u0000\u0000GH\u0003\u0004\u0002\u0000HI\u0005\u001e"+
		"\u0000\u0000IJ\u0005\u0004\u0000\u0000JX\u0001\u0000\u0000\u0000KL\u0005"+
		"\u001e\u0000\u0000LM\u0005\u0005\u0000\u0000MN\u0003\u0006\u0003\u0000"+
		"NO\u0005\u0004\u0000\u0000OX\u0001\u0000\u0000\u0000PQ\u0005\u0007\u0000"+
		"\u0000QR\u0003\u0006\u0003\u0000RS\u0005\u0004\u0000\u0000SX\u0001\u0000"+
		"\u0000\u0000TU\u0005\u0006\u0000\u0000UV\u0005\u001e\u0000\u0000VX\u0005"+
		"\u0004\u0000\u0000W\u000f\u0001\u0000\u0000\u0000W\u0017\u0001\u0000\u0000"+
		"\u0000W\u001f\u0001\u0000\u0000\u0000W&\u0001\u0000\u0000\u0000W)\u0001"+
		"\u0000\u0000\u0000W1\u0001\u0000\u0000\u0000W8\u0001\u0000\u0000\u0000"+
		"W?\u0001\u0000\u0000\u0000WF\u0001\u0000\u0000\u0000WK\u0001\u0000\u0000"+
		"\u0000WP\u0001\u0000\u0000\u0000WT\u0001\u0000\u0000\u0000X\u0003\u0001"+
		"\u0000\u0000\u0000YZ\u0007\u0000\u0000\u0000Z\u0005\u0001\u0000\u0000"+
		"\u0000[\\\u0006\u0003\uffff\uffff\u0000\\]\u0005\u000f\u0000\u0000]n\u0003"+
		"\u0006\u0003\u000e^_\u0005\u001e\u0000\u0000_`\u0005\u0002\u0000\u0000"+
		"`a\u0003\u0006\u0003\u0000ab\u0005\u0003\u0000\u0000bn\u0001\u0000\u0000"+
		"\u0000cn\u0005\u0017\u0000\u0000dn\u0005\u0018\u0000\u0000en\u0005\u001c"+
		"\u0000\u0000fn\u0005\u001d\u0000\u0000gn\u0005\u001b\u0000\u0000hn\u0005"+
		"\u001e\u0000\u0000ij\u0005\u0019\u0000\u0000jk\u0003\u0006\u0003\u0000"+
		"kl\u0005\u001a\u0000\u0000ln\u0001\u0000\u0000\u0000m[\u0001\u0000\u0000"+
		"\u0000m^\u0001\u0000\u0000\u0000mc\u0001\u0000\u0000\u0000md\u0001\u0000"+
		"\u0000\u0000me\u0001\u0000\u0000\u0000mf\u0001\u0000\u0000\u0000mg\u0001"+
		"\u0000\u0000\u0000mh\u0001\u0000\u0000\u0000mi\u0001\u0000\u0000\u0000"+
		"n\u0080\u0001\u0000\u0000\u0000op\n\r\u0000\u0000pq\u0007\u0001\u0000"+
		"\u0000q\u007f\u0003\u0006\u0003\u000ers\n\f\u0000\u0000st\u0007\u0002"+
		"\u0000\u0000t\u007f\u0003\u0006\u0003\ruv\n\u000b\u0000\u0000vw\u0005"+
		"\u0014\u0000\u0000w\u007f\u0003\u0006\u0003\fxy\n\n\u0000\u0000yz\u0005"+
		"\u0015\u0000\u0000z\u007f\u0003\u0006\u0003\u000b{|\n\t\u0000\u0000|}"+
		"\u0005\u0016\u0000\u0000}\u007f\u0003\u0006\u0003\n~o\u0001\u0000\u0000"+
		"\u0000~r\u0001\u0000\u0000\u0000~u\u0001\u0000\u0000\u0000~x\u0001\u0000"+
		"\u0000\u0000~{\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u0007\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0005"+
		"\u000bWm~\u0080";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}