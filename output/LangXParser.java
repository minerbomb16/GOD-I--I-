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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, STRING=52, 
		INT=53, REAL=54, ID=55, WS=56;
	public static final int
		RULE_prog = 0, RULE_structDecl = 1, RULE_structField = 2, RULE_classDecl = 3, 
		RULE_classField = 4, RULE_visibility = 5, RULE_start = 6, RULE_ifStatement = 7, 
		RULE_ifCond = 8, RULE_elseBlock = 9, RULE_whileStatement = 10, RULE_whileCond = 11, 
		RULE_whileKeyword = 12, RULE_forStatement = 13, RULE_forInitCond = 14, 
		RULE_forStartExpr = 15, RULE_typeName = 16, RULE_functionDecl = 17, RULE_paramList = 18, 
		RULE_argList = 19, RULE_type = 20, RULE_expr = 21, RULE_andOp = 22, RULE_orOp = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "structDecl", "structField", "classDecl", "classField", "visibility", 
			"start", "ifStatement", "ifCond", "elseBlock", "whileStatement", "whileCond", 
			"whileKeyword", "forStatement", "forInitCond", "forStartExpr", "typeName", 
			"functionDecl", "paramList", "argList", "type", "expr", "andOp", "orOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Legion'", "'{'", "'}'", "';'", "'Order'", "'Sacred'", "'Profane'", 
			"'Create'", "'['", "']'", "'be transformed into'", "'Confess'", "'Reveal'", 
			"'row'", "'column'", "':'", "'in the image of'", "'('", "')'", "'Fulfill'", 
			"'.'", "'Judge'", "'Otherwise'", "'Pilgrimage'", "'to'", "'step'", "'Way of the Cross'", 
			"'Stations'", "'Miracle'", "','", "'Mortal'", "'Divine'", "'SmallDivine'", 
			"'Eternal'", "'Dogma'", "'-'", "'NEG'", "'=='", "'!='", "'>'", "'<'", 
			"'>='", "'<='", "'*'", "'/'", "'+'", "'XOR'", "'Heaven'", "'Hell'", "'AND'", 
			"'OR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "STRING", "INT", "REAL", "ID", "WS"
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
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
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
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(52);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(48);
					structDecl();
					}
					break;
				case T__4:
					{
					setState(49);
					classDecl();
					}
					break;
				case T__28:
					{
					setState(50);
					functionDecl();
					}
					break;
				case T__7:
				case T__11:
				case T__12:
				case T__19:
				case T__21:
				case T__23:
				case T__26:
				case ID:
					{
					setState(51);
					start();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 36028797712085282L) != 0) );
			setState(56);
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
			setState(58);
			match(T__0);
			setState(59);
			match(ID);
			setState(60);
			match(T__1);
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				structField();
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 66571993088L) != 0) );
			setState(66);
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
			setState(68);
			type();
			setState(69);
			match(ID);
			setState(70);
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
	public static class ClassDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public List<ClassFieldContext> classField() {
			return getRuleContexts(ClassFieldContext.class);
		}
		public ClassFieldContext classField(int i) {
			return getRuleContext(ClassFieldContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitClassDecl(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__4);
			setState(73);
			match(ID);
			setState(74);
			match(T__1);
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(77);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
				case T__6:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
				case T__34:
					{
					setState(75);
					classField();
					}
					break;
				case T__28:
					{
					setState(76);
					functionDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 67108864192L) != 0) );
			setState(81);
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
	public static class ClassFieldContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public ClassFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterClassField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitClassField(this);
		}
	}

	public final ClassFieldContext classField() throws RecognitionException {
		ClassFieldContext _localctx = new ClassFieldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__6) {
				{
				setState(83);
				visibility();
				}
			}

			setState(86);
			type();
			setState(87);
			match(ID);
			setState(88);
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
	public static class VisibilityContext extends ParserRuleContext {
		public VisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterVisibility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitVisibility(this);
		}
	}

	public final VisibilityContext visibility() throws RecognitionException {
		VisibilityContext _localctx = new VisibilityContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_visibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
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
	public static class DeclareClassContext extends StartContext {
		public List<TerminalNode> ID() { return getTokens(LangXParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LangXParser.ID, i);
		}
		public DeclareClassContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterDeclareClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitDeclareClass(this);
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
	public static class MethodCallStatContext extends StartContext {
		public List<TerminalNode> ID() { return getTokens(LangXParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LangXParser.ID, i);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public MethodCallStatContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterMethodCallStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitMethodCallStat(this);
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
		enterRule(_localctx, 12, RULE_start);
		int _la;
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new DeclareMatrixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(T__7);
				setState(93);
				type();
				setState(94);
				match(ID);
				setState(95);
				match(T__8);
				setState(96);
				match(INT);
				setState(97);
				match(T__9);
				setState(98);
				match(T__8);
				setState(99);
				match(INT);
				setState(100);
				match(T__9);
				setState(101);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new AssignMatrixElemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(ID);
				setState(104);
				match(T__8);
				setState(105);
				expr(0);
				setState(106);
				match(T__9);
				setState(107);
				match(T__8);
				setState(108);
				expr(0);
				setState(109);
				match(T__9);
				setState(110);
				match(T__10);
				setState(111);
				expr(0);
				setState(112);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new ReadMatrixElemContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(T__11);
				setState(115);
				match(ID);
				setState(116);
				match(T__8);
				setState(117);
				expr(0);
				setState(118);
				match(T__9);
				setState(119);
				match(T__8);
				setState(120);
				expr(0);
				setState(121);
				match(T__9);
				setState(122);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new WriteMatrixRowContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				match(T__12);
				setState(125);
				match(T__13);
				setState(126);
				match(ID);
				setState(127);
				match(T__8);
				setState(128);
				match(INT);
				setState(129);
				match(T__9);
				setState(130);
				match(T__3);
				}
				break;
			case 5:
				_localctx = new WriteMatrixColumnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				match(T__12);
				setState(132);
				match(T__14);
				setState(133);
				match(ID);
				setState(134);
				match(T__8);
				setState(135);
				match(INT);
				setState(136);
				match(T__9);
				setState(137);
				match(T__3);
				}
				break;
			case 6:
				_localctx = new DeclareArrayContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				match(T__7);
				setState(139);
				type();
				setState(140);
				match(ID);
				setState(141);
				match(T__8);
				setState(142);
				match(INT);
				setState(143);
				match(T__9);
				setState(144);
				match(T__3);
				}
				break;
			case 7:
				_localctx = new AssignArrayElemContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(146);
				match(ID);
				setState(147);
				match(T__8);
				setState(148);
				expr(0);
				setState(149);
				match(T__9);
				setState(150);
				match(T__10);
				setState(151);
				expr(0);
				setState(152);
				match(T__3);
				}
				break;
			case 8:
				_localctx = new ReadArrayElemContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(154);
				match(T__11);
				setState(155);
				match(ID);
				setState(156);
				match(T__8);
				setState(157);
				expr(0);
				setState(158);
				match(T__9);
				setState(159);
				match(T__3);
				}
				break;
			case 9:
				_localctx = new WriteIdContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(161);
				match(T__12);
				setState(162);
				match(ID);
				setState(163);
				match(T__3);
				}
				break;
			case 10:
				_localctx = new WriteArrayRangeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(164);
				match(T__12);
				setState(165);
				match(ID);
				setState(166);
				match(T__8);
				setState(167);
				match(INT);
				setState(168);
				match(T__15);
				setState(169);
				match(INT);
				setState(170);
				match(T__9);
				setState(171);
				match(T__3);
				}
				break;
			case 11:
				_localctx = new WriteArrayFromContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(172);
				match(T__12);
				setState(173);
				match(ID);
				setState(174);
				match(T__8);
				setState(175);
				match(INT);
				setState(176);
				match(T__15);
				setState(177);
				match(T__9);
				setState(178);
				match(T__3);
				}
				break;
			case 12:
				_localctx = new WriteArrayToContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(179);
				match(T__12);
				setState(180);
				match(ID);
				setState(181);
				match(T__8);
				setState(182);
				match(T__15);
				setState(183);
				match(INT);
				setState(184);
				match(T__9);
				setState(185);
				match(T__3);
				}
				break;
			case 13:
				_localctx = new DeclareAndAssignContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(186);
				match(T__7);
				setState(187);
				type();
				setState(188);
				match(ID);
				setState(189);
				match(T__16);
				setState(190);
				expr(0);
				setState(191);
				match(T__3);
				}
				break;
			case 14:
				_localctx = new DeclareContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(193);
				match(T__7);
				setState(194);
				type();
				setState(195);
				match(ID);
				setState(196);
				match(T__3);
				}
				break;
			case 15:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(198);
				match(ID);
				setState(199);
				match(T__10);
				setState(200);
				expr(0);
				setState(201);
				match(T__3);
				}
				break;
			case 16:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(203);
				match(T__12);
				setState(204);
				expr(0);
				setState(205);
				match(T__3);
				}
				break;
			case 17:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(207);
				match(T__11);
				setState(208);
				match(ID);
				setState(209);
				match(T__3);
				}
				break;
			case 18:
				_localctx = new IfStmtNodeContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(210);
				ifStatement();
				}
				break;
			case 19:
				_localctx = new WhileStmtNodeContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(211);
				whileStatement();
				}
				break;
			case 20:
				_localctx = new ForStmtNodeContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(212);
				forStatement();
				}
				break;
			case 21:
				_localctx = new FunctionCallStatContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(213);
				match(ID);
				setState(214);
				match(T__17);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68398625499381760L) != 0)) {
					{
					setState(215);
					argList();
					}
				}

				setState(218);
				match(T__18);
				setState(219);
				match(T__3);
				}
				break;
			case 22:
				_localctx = new ReturnStatContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(220);
				match(T__19);
				setState(221);
				expr(0);
				setState(222);
				match(T__3);
				}
				break;
			case 23:
				_localctx = new DeclareStructContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(224);
				match(T__7);
				setState(225);
				match(T__0);
				setState(226);
				match(ID);
				setState(227);
				match(ID);
				setState(228);
				match(T__3);
				}
				break;
			case 24:
				_localctx = new DeclareClassContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(229);
				match(T__7);
				setState(230);
				match(T__4);
				setState(231);
				match(ID);
				setState(232);
				match(ID);
				setState(233);
				match(T__3);
				}
				break;
			case 25:
				_localctx = new AssignStructFieldContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(234);
				match(ID);
				setState(235);
				match(T__20);
				setState(236);
				match(ID);
				setState(237);
				match(T__10);
				setState(238);
				expr(0);
				setState(239);
				match(T__3);
				}
				break;
			case 26:
				_localctx = new ReadStructFieldContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(241);
				match(T__11);
				setState(242);
				match(ID);
				setState(243);
				match(T__20);
				setState(244);
				match(ID);
				setState(245);
				match(T__3);
				}
				break;
			case 27:
				_localctx = new WriteStructFieldContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(246);
				match(T__12);
				setState(247);
				match(ID);
				setState(248);
				match(T__20);
				setState(249);
				match(ID);
				setState(250);
				match(T__3);
				}
				break;
			case 28:
				_localctx = new MethodCallStatContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(251);
				match(ID);
				setState(252);
				match(T__20);
				setState(253);
				match(ID);
				setState(254);
				match(T__17);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68398625499381760L) != 0)) {
					{
					setState(255);
					argList();
					}
				}

				setState(258);
				match(T__18);
				setState(259);
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
		enterRule(_localctx, 14, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			ifCond();
			setState(263);
			match(T__1);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028797175214336L) != 0)) {
				{
				{
				setState(264);
				start();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			match(T__2);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(271);
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
		enterRule(_localctx, 16, RULE_ifCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__21);
			setState(275);
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
		enterRule(_localctx, 18, RULE_elseBlock);
		int _la;
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(T__22);
				setState(278);
				match(T__1);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028797175214336L) != 0)) {
					{
					{
					setState(279);
					start();
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(285);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(T__22);
				setState(287);
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
		enterRule(_localctx, 20, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			whileCond();
			setState(291);
			match(T__1);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028797175214336L) != 0)) {
				{
				{
				setState(292);
				start();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
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
		enterRule(_localctx, 22, RULE_whileCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			whileKeyword();
			setState(301);
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
		enterRule(_localctx, 24, RULE_whileKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__23);
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
		enterRule(_localctx, 26, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			forInitCond();
			setState(306);
			match(T__1);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028797175214336L) != 0)) {
				{
				{
				setState(307);
				start();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
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
		enterRule(_localctx, 28, RULE_forInitCond);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ForToContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				forStartExpr();
				setState(316);
				match(T__24);
				setState(317);
				expr(0);
				}
				break;
			case 2:
				_localctx = new ForToStepContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				forStartExpr();
				setState(320);
				match(T__24);
				setState(321);
				expr(0);
				setState(322);
				match(T__25);
				setState(323);
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
		enterRule(_localctx, 30, RULE_forStartExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(T__26);
			setState(328);
			match(ID);
			setState(329);
			match(T__27);
			setState(330);
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
		enterRule(_localctx, 32, RULE_typeName);
		try {
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				type();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
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
		enterRule(_localctx, 34, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(T__28);
			setState(337);
			typeName();
			setState(338);
			match(ID);
			setState(339);
			match(T__17);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028863590957056L) != 0)) {
				{
				setState(340);
				paramList();
				}
			}

			setState(343);
			match(T__18);
			setState(344);
			match(T__1);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028797175214336L) != 0)) {
				{
				{
				setState(345);
				start();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
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
		enterRule(_localctx, 36, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			typeName();
			setState(354);
			match(ID);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(355);
				match(T__29);
				setState(356);
				typeName();
				setState(357);
				match(ID);
				}
				}
				setState(363);
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
		enterRule(_localctx, 38, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			expr(0);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(365);
				match(T__29);
				setState(366);
				expr(0);
				}
				}
				setState(371);
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
		enterRule(_localctx, 40, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66571993088L) != 0)) ) {
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
	public static class MethodCallExprContext extends ExprContext {
		public List<TerminalNode> ID() { return getTokens(LangXParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LangXParser.ID, i);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public MethodCallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterMethodCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitMethodCallExpr(this);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(375);
				match(T__35);
				setState(376);
				expr(20);
				}
				break;
			case 2:
				{
				_localctx = new LogicNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(377);
				match(T__36);
				setState(378);
				expr(19);
				}
				break;
			case 3:
				{
				_localctx = new FunctionCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(379);
				match(ID);
				setState(380);
				match(T__17);
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68398625499381760L) != 0)) {
					{
					setState(381);
					argList();
					}
				}

				setState(384);
				match(T__18);
				}
				break;
			case 4:
				{
				_localctx = new MatrixElemContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(385);
				match(ID);
				setState(386);
				match(T__8);
				setState(387);
				expr(0);
				setState(388);
				match(T__9);
				setState(389);
				match(T__8);
				setState(390);
				expr(0);
				setState(391);
				match(T__9);
				}
				break;
			case 5:
				{
				_localctx = new ArrayElemContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(393);
				match(ID);
				setState(394);
				match(T__8);
				setState(395);
				expr(0);
				setState(396);
				match(T__9);
				}
				break;
			case 6:
				{
				_localctx = new TrueConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(398);
				match(T__47);
				}
				break;
			case 7:
				{
				_localctx = new FalseConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(399);
				match(T__48);
				}
				break;
			case 8:
				{
				_localctx = new IntConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(400);
				match(INT);
				}
				break;
			case 9:
				{
				_localctx = new RealConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(401);
				match(REAL);
				}
				break;
			case 10:
				{
				_localctx = new StringConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(402);
				match(STRING);
				}
				break;
			case 11:
				{
				_localctx = new StructFieldAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(403);
				match(ID);
				setState(404);
				match(T__20);
				setState(405);
				match(ID);
				}
				break;
			case 12:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(406);
				match(ID);
				}
				break;
			case 13:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(407);
				match(T__17);
				setState(408);
				expr(0);
				setState(409);
				match(T__18);
				}
				break;
			case 14:
				{
				_localctx = new MethodCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(411);
				match(ID);
				setState(412);
				match(T__20);
				setState(413);
				match(ID);
				setState(414);
				match(T__17);
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68398625499381760L) != 0)) {
					{
					setState(415);
					argList();
					}
				}

				setState(418);
				match(T__18);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(443);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(441);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new RelOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(421);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(422);
						((RelOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17317308137472L) != 0)) ) {
							((RelOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(423);
						expr(19);
						}
						break;
					case 2:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(424);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(425);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__43 || _la==T__44) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(426);
						expr(18);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(427);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(428);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__45) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(429);
						expr(17);
						}
						break;
					case 4:
						{
						_localctx = new LogicAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(430);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(431);
						andOp();
						setState(432);
						expr(16);
						}
						break;
					case 5:
						{
						_localctx = new LogicOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(434);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(435);
						orOp();
						setState(436);
						expr(15);
						}
						break;
					case 6:
						{
						_localctx = new LogicXorContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(438);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(439);
						((LogicXorContext)_localctx).op = match(T__46);
						setState(440);
						expr(14);
						}
						break;
					}
					} 
				}
				setState(445);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		enterRule(_localctx, 44, RULE_andOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(T__49);
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
		enterRule(_localctx, 46, RULE_orOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(T__50);
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
		case 21:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00018\u01c3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0004\u00005\b\u0000\u000b\u0000\f\u00006\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001?\b\u0001\u000b\u0001\f\u0001@\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0004\u0003N\b\u0003\u000b\u0003\f\u0003O\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0003\u0004U\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00d9\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0101\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0105"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u010a\b\u0007"+
		"\n\u0007\f\u0007\u010d\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0111"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u0119"+
		"\b\t\n\t\f\t\u011c\t\t\u0001\t\u0001\t\u0001\t\u0003\t\u0121\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0126\b\n\n\n\f\n\u0129\t\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u0135\b\r\n\r\f\r\u0138\t\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0146\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u014f\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0156\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u015b\b\u0011\n\u0011\f\u0011\u015e\t\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u0168\b\u0012\n\u0012\f\u0012\u016b\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u0170\b\u0013\n\u0013\f\u0013\u0173\t\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u017f\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u01a1\b\u0015\u0001\u0015\u0003\u0015"+
		"\u01a4\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u01ba\b\u0015\n\u0015"+
		"\f\u0015\u01bd\t\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0000\u0001*\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000\u0005\u0001"+
		"\u0000\u0006\u0007\u0001\u0000\u001f#\u0001\u0000&+\u0001\u0000,-\u0002"+
		"\u0000$$..\u01f0\u00004\u0001\u0000\u0000\u0000\u0002:\u0001\u0000\u0000"+
		"\u0000\u0004D\u0001\u0000\u0000\u0000\u0006H\u0001\u0000\u0000\u0000\b"+
		"T\u0001\u0000\u0000\u0000\nZ\u0001\u0000\u0000\u0000\f\u0104\u0001\u0000"+
		"\u0000\u0000\u000e\u0106\u0001\u0000\u0000\u0000\u0010\u0112\u0001\u0000"+
		"\u0000\u0000\u0012\u0120\u0001\u0000\u0000\u0000\u0014\u0122\u0001\u0000"+
		"\u0000\u0000\u0016\u012c\u0001\u0000\u0000\u0000\u0018\u012f\u0001\u0000"+
		"\u0000\u0000\u001a\u0131\u0001\u0000\u0000\u0000\u001c\u0145\u0001\u0000"+
		"\u0000\u0000\u001e\u0147\u0001\u0000\u0000\u0000 \u014e\u0001\u0000\u0000"+
		"\u0000\"\u0150\u0001\u0000\u0000\u0000$\u0161\u0001\u0000\u0000\u0000"+
		"&\u016c\u0001\u0000\u0000\u0000(\u0174\u0001\u0000\u0000\u0000*\u01a3"+
		"\u0001\u0000\u0000\u0000,\u01be\u0001\u0000\u0000\u0000.\u01c0\u0001\u0000"+
		"\u0000\u000005\u0003\u0002\u0001\u000015\u0003\u0006\u0003\u000025\u0003"+
		"\"\u0011\u000035\u0003\f\u0006\u000040\u0001\u0000\u0000\u000041\u0001"+
		"\u0000\u0000\u000042\u0001\u0000\u0000\u000043\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u000078\u0001\u0000\u0000\u000089\u0005\u0000\u0000\u00019\u0001\u0001"+
		"\u0000\u0000\u0000:;\u0005\u0001\u0000\u0000;<\u00057\u0000\u0000<>\u0005"+
		"\u0002\u0000\u0000=?\u0003\u0004\u0002\u0000>=\u0001\u0000\u0000\u0000"+
		"?@\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000BC\u0005\u0003\u0000\u0000C\u0003\u0001"+
		"\u0000\u0000\u0000DE\u0003(\u0014\u0000EF\u00057\u0000\u0000FG\u0005\u0004"+
		"\u0000\u0000G\u0005\u0001\u0000\u0000\u0000HI\u0005\u0005\u0000\u0000"+
		"IJ\u00057\u0000\u0000JM\u0005\u0002\u0000\u0000KN\u0003\b\u0004\u0000"+
		"LN\u0003\"\u0011\u0000MK\u0001\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QR\u0005\u0003\u0000\u0000R\u0007\u0001"+
		"\u0000\u0000\u0000SU\u0003\n\u0005\u0000TS\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0003(\u0014\u0000WX\u0005"+
		"7\u0000\u0000XY\u0005\u0004\u0000\u0000Y\t\u0001\u0000\u0000\u0000Z[\u0007"+
		"\u0000\u0000\u0000[\u000b\u0001\u0000\u0000\u0000\\]\u0005\b\u0000\u0000"+
		"]^\u0003(\u0014\u0000^_\u00057\u0000\u0000_`\u0005\t\u0000\u0000`a\u0005"+
		"5\u0000\u0000ab\u0005\n\u0000\u0000bc\u0005\t\u0000\u0000cd\u00055\u0000"+
		"\u0000de\u0005\n\u0000\u0000ef\u0005\u0004\u0000\u0000f\u0105\u0001\u0000"+
		"\u0000\u0000gh\u00057\u0000\u0000hi\u0005\t\u0000\u0000ij\u0003*\u0015"+
		"\u0000jk\u0005\n\u0000\u0000kl\u0005\t\u0000\u0000lm\u0003*\u0015\u0000"+
		"mn\u0005\n\u0000\u0000no\u0005\u000b\u0000\u0000op\u0003*\u0015\u0000"+
		"pq\u0005\u0004\u0000\u0000q\u0105\u0001\u0000\u0000\u0000rs\u0005\f\u0000"+
		"\u0000st\u00057\u0000\u0000tu\u0005\t\u0000\u0000uv\u0003*\u0015\u0000"+
		"vw\u0005\n\u0000\u0000wx\u0005\t\u0000\u0000xy\u0003*\u0015\u0000yz\u0005"+
		"\n\u0000\u0000z{\u0005\u0004\u0000\u0000{\u0105\u0001\u0000\u0000\u0000"+
		"|}\u0005\r\u0000\u0000}~\u0005\u000e\u0000\u0000~\u007f\u00057\u0000\u0000"+
		"\u007f\u0080\u0005\t\u0000\u0000\u0080\u0081\u00055\u0000\u0000\u0081"+
		"\u0082\u0005\n\u0000\u0000\u0082\u0105\u0005\u0004\u0000\u0000\u0083\u0084"+
		"\u0005\r\u0000\u0000\u0084\u0085\u0005\u000f\u0000\u0000\u0085\u0086\u0005"+
		"7\u0000\u0000\u0086\u0087\u0005\t\u0000\u0000\u0087\u0088\u00055\u0000"+
		"\u0000\u0088\u0089\u0005\n\u0000\u0000\u0089\u0105\u0005\u0004\u0000\u0000"+
		"\u008a\u008b\u0005\b\u0000\u0000\u008b\u008c\u0003(\u0014\u0000\u008c"+
		"\u008d\u00057\u0000\u0000\u008d\u008e\u0005\t\u0000\u0000\u008e\u008f"+
		"\u00055\u0000\u0000\u008f\u0090\u0005\n\u0000\u0000\u0090\u0091\u0005"+
		"\u0004\u0000\u0000\u0091\u0105\u0001\u0000\u0000\u0000\u0092\u0093\u0005"+
		"7\u0000\u0000\u0093\u0094\u0005\t\u0000\u0000\u0094\u0095\u0003*\u0015"+
		"\u0000\u0095\u0096\u0005\n\u0000\u0000\u0096\u0097\u0005\u000b\u0000\u0000"+
		"\u0097\u0098\u0003*\u0015\u0000\u0098\u0099\u0005\u0004\u0000\u0000\u0099"+
		"\u0105\u0001\u0000\u0000\u0000\u009a\u009b\u0005\f\u0000\u0000\u009b\u009c"+
		"\u00057\u0000\u0000\u009c\u009d\u0005\t\u0000\u0000\u009d\u009e\u0003"+
		"*\u0015\u0000\u009e\u009f\u0005\n\u0000\u0000\u009f\u00a0\u0005\u0004"+
		"\u0000\u0000\u00a0\u0105\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\r\u0000"+
		"\u0000\u00a2\u00a3\u00057\u0000\u0000\u00a3\u0105\u0005\u0004\u0000\u0000"+
		"\u00a4\u00a5\u0005\r\u0000\u0000\u00a5\u00a6\u00057\u0000\u0000\u00a6"+
		"\u00a7\u0005\t\u0000\u0000\u00a7\u00a8\u00055\u0000\u0000\u00a8\u00a9"+
		"\u0005\u0010\u0000\u0000\u00a9\u00aa\u00055\u0000\u0000\u00aa\u00ab\u0005"+
		"\n\u0000\u0000\u00ab\u0105\u0005\u0004\u0000\u0000\u00ac\u00ad\u0005\r"+
		"\u0000\u0000\u00ad\u00ae\u00057\u0000\u0000\u00ae\u00af\u0005\t\u0000"+
		"\u0000\u00af\u00b0\u00055\u0000\u0000\u00b0\u00b1\u0005\u0010\u0000\u0000"+
		"\u00b1\u00b2\u0005\n\u0000\u0000\u00b2\u0105\u0005\u0004\u0000\u0000\u00b3"+
		"\u00b4\u0005\r\u0000\u0000\u00b4\u00b5\u00057\u0000\u0000\u00b5\u00b6"+
		"\u0005\t\u0000\u0000\u00b6\u00b7\u0005\u0010\u0000\u0000\u00b7\u00b8\u0005"+
		"5\u0000\u0000\u00b8\u00b9\u0005\n\u0000\u0000\u00b9\u0105\u0005\u0004"+
		"\u0000\u0000\u00ba\u00bb\u0005\b\u0000\u0000\u00bb\u00bc\u0003(\u0014"+
		"\u0000\u00bc\u00bd\u00057\u0000\u0000\u00bd\u00be\u0005\u0011\u0000\u0000"+
		"\u00be\u00bf\u0003*\u0015\u0000\u00bf\u00c0\u0005\u0004\u0000\u0000\u00c0"+
		"\u0105\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\b\u0000\u0000\u00c2\u00c3"+
		"\u0003(\u0014\u0000\u00c3\u00c4\u00057\u0000\u0000\u00c4\u00c5\u0005\u0004"+
		"\u0000\u0000\u00c5\u0105\u0001\u0000\u0000\u0000\u00c6\u00c7\u00057\u0000"+
		"\u0000\u00c7\u00c8\u0005\u000b\u0000\u0000\u00c8\u00c9\u0003*\u0015\u0000"+
		"\u00c9\u00ca\u0005\u0004\u0000\u0000\u00ca\u0105\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0005\r\u0000\u0000\u00cc\u00cd\u0003*\u0015\u0000\u00cd"+
		"\u00ce\u0005\u0004\u0000\u0000\u00ce\u0105\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0005\f\u0000\u0000\u00d0\u00d1\u00057\u0000\u0000\u00d1\u0105"+
		"\u0005\u0004\u0000\u0000\u00d2\u0105\u0003\u000e\u0007\u0000\u00d3\u0105"+
		"\u0003\u0014\n\u0000\u00d4\u0105\u0003\u001a\r\u0000\u00d5\u00d6\u0005"+
		"7\u0000\u0000\u00d6\u00d8\u0005\u0012\u0000\u0000\u00d7\u00d9\u0003&\u0013"+
		"\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u0013\u0000"+
		"\u0000\u00db\u0105\u0005\u0004\u0000\u0000\u00dc\u00dd\u0005\u0014\u0000"+
		"\u0000\u00dd\u00de\u0003*\u0015\u0000\u00de\u00df\u0005\u0004\u0000\u0000"+
		"\u00df\u0105\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\b\u0000\u0000\u00e1"+
		"\u00e2\u0005\u0001\u0000\u0000\u00e2\u00e3\u00057\u0000\u0000\u00e3\u00e4"+
		"\u00057\u0000\u0000\u00e4\u0105\u0005\u0004\u0000\u0000\u00e5\u00e6\u0005"+
		"\b\u0000\u0000\u00e6\u00e7\u0005\u0005\u0000\u0000\u00e7\u00e8\u00057"+
		"\u0000\u0000\u00e8\u00e9\u00057\u0000\u0000\u00e9\u0105\u0005\u0004\u0000"+
		"\u0000\u00ea\u00eb\u00057\u0000\u0000\u00eb\u00ec\u0005\u0015\u0000\u0000"+
		"\u00ec\u00ed\u00057\u0000\u0000\u00ed\u00ee\u0005\u000b\u0000\u0000\u00ee"+
		"\u00ef\u0003*\u0015\u0000\u00ef\u00f0\u0005\u0004\u0000\u0000\u00f0\u0105"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\f\u0000\u0000\u00f2\u00f3\u0005"+
		"7\u0000\u0000\u00f3\u00f4\u0005\u0015\u0000\u0000\u00f4\u00f5\u00057\u0000"+
		"\u0000\u00f5\u0105\u0005\u0004\u0000\u0000\u00f6\u00f7\u0005\r\u0000\u0000"+
		"\u00f7\u00f8\u00057\u0000\u0000\u00f8\u00f9\u0005\u0015\u0000\u0000\u00f9"+
		"\u00fa\u00057\u0000\u0000\u00fa\u0105\u0005\u0004\u0000\u0000\u00fb\u00fc"+
		"\u00057\u0000\u0000\u00fc\u00fd\u0005\u0015\u0000\u0000\u00fd\u00fe\u0005"+
		"7\u0000\u0000\u00fe\u0100\u0005\u0012\u0000\u0000\u00ff\u0101\u0003&\u0013"+
		"\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u0013\u0000"+
		"\u0000\u0103\u0105\u0005\u0004\u0000\u0000\u0104\\\u0001\u0000\u0000\u0000"+
		"\u0104g\u0001\u0000\u0000\u0000\u0104r\u0001\u0000\u0000\u0000\u0104|"+
		"\u0001\u0000\u0000\u0000\u0104\u0083\u0001\u0000\u0000\u0000\u0104\u008a"+
		"\u0001\u0000\u0000\u0000\u0104\u0092\u0001\u0000\u0000\u0000\u0104\u009a"+
		"\u0001\u0000\u0000\u0000\u0104\u00a1\u0001\u0000\u0000\u0000\u0104\u00a4"+
		"\u0001\u0000\u0000\u0000\u0104\u00ac\u0001\u0000\u0000\u0000\u0104\u00b3"+
		"\u0001\u0000\u0000\u0000\u0104\u00ba\u0001\u0000\u0000\u0000\u0104\u00c1"+
		"\u0001\u0000\u0000\u0000\u0104\u00c6\u0001\u0000\u0000\u0000\u0104\u00cb"+
		"\u0001\u0000\u0000\u0000\u0104\u00cf\u0001\u0000\u0000\u0000\u0104\u00d2"+
		"\u0001\u0000\u0000\u0000\u0104\u00d3\u0001\u0000\u0000\u0000\u0104\u00d4"+
		"\u0001\u0000\u0000\u0000\u0104\u00d5\u0001\u0000\u0000\u0000\u0104\u00dc"+
		"\u0001\u0000\u0000\u0000\u0104\u00e0\u0001\u0000\u0000\u0000\u0104\u00e5"+
		"\u0001\u0000\u0000\u0000\u0104\u00ea\u0001\u0000\u0000\u0000\u0104\u00f1"+
		"\u0001\u0000\u0000\u0000\u0104\u00f6\u0001\u0000\u0000\u0000\u0104\u00fb"+
		"\u0001\u0000\u0000\u0000\u0105\r\u0001\u0000\u0000\u0000\u0106\u0107\u0003"+
		"\u0010\b\u0000\u0107\u010b\u0005\u0002\u0000\u0000\u0108\u010a\u0003\f"+
		"\u0006\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000"+
		"\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000"+
		"\u0000\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000"+
		"\u0000\u0000\u010e\u0110\u0005\u0003\u0000\u0000\u010f\u0111\u0003\u0012"+
		"\t\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000"+
		"\u0000\u0111\u000f\u0001\u0000\u0000\u0000\u0112\u0113\u0005\u0016\u0000"+
		"\u0000\u0113\u0114\u0003*\u0015\u0000\u0114\u0011\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0005\u0017\u0000\u0000\u0116\u011a\u0005\u0002\u0000\u0000"+
		"\u0117\u0119\u0003\f\u0006\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0119"+
		"\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0001\u0000\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c"+
		"\u011a\u0001\u0000\u0000\u0000\u011d\u0121\u0005\u0003\u0000\u0000\u011e"+
		"\u011f\u0005\u0017\u0000\u0000\u011f\u0121\u0003\u000e\u0007\u0000\u0120"+
		"\u0115\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121"+
		"\u0013\u0001\u0000\u0000\u0000\u0122\u0123\u0003\u0016\u000b\u0000\u0123"+
		"\u0127\u0005\u0002\u0000\u0000\u0124\u0126\u0003\f\u0006\u0000\u0125\u0124"+
		"\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012a"+
		"\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0005\u0003\u0000\u0000\u012b\u0015\u0001\u0000\u0000\u0000\u012c\u012d"+
		"\u0003\u0018\f\u0000\u012d\u012e\u0003*\u0015\u0000\u012e\u0017\u0001"+
		"\u0000\u0000\u0000\u012f\u0130\u0005\u0018\u0000\u0000\u0130\u0019\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0003\u001c\u000e\u0000\u0132\u0136\u0005"+
		"\u0002\u0000\u0000\u0133\u0135\u0003\f\u0006\u0000\u0134\u0133\u0001\u0000"+
		"\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0139\u0001\u0000"+
		"\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013a\u0005\u0003"+
		"\u0000\u0000\u013a\u001b\u0001\u0000\u0000\u0000\u013b\u013c\u0003\u001e"+
		"\u000f\u0000\u013c\u013d\u0005\u0019\u0000\u0000\u013d\u013e\u0003*\u0015"+
		"\u0000\u013e\u0146\u0001\u0000\u0000\u0000\u013f\u0140\u0003\u001e\u000f"+
		"\u0000\u0140\u0141\u0005\u0019\u0000\u0000\u0141\u0142\u0003*\u0015\u0000"+
		"\u0142\u0143\u0005\u001a\u0000\u0000\u0143\u0144\u0003*\u0015\u0000\u0144"+
		"\u0146\u0001\u0000\u0000\u0000\u0145\u013b\u0001\u0000\u0000\u0000\u0145"+
		"\u013f\u0001\u0000\u0000\u0000\u0146\u001d\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u0005\u001b\u0000\u0000\u0148\u0149\u00057\u0000\u0000\u0149\u014a"+
		"\u0005\u001c\u0000\u0000\u014a\u014b\u0003*\u0015\u0000\u014b\u001f\u0001"+
		"\u0000\u0000\u0000\u014c\u014f\u0003(\u0014\u0000\u014d\u014f\u00057\u0000"+
		"\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014d\u0001\u0000\u0000"+
		"\u0000\u014f!\u0001\u0000\u0000\u0000\u0150\u0151\u0005\u001d\u0000\u0000"+
		"\u0151\u0152\u0003 \u0010\u0000\u0152\u0153\u00057\u0000\u0000\u0153\u0155"+
		"\u0005\u0012\u0000\u0000\u0154\u0156\u0003$\u0012\u0000\u0155\u0154\u0001"+
		"\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u0001"+
		"\u0000\u0000\u0000\u0157\u0158\u0005\u0013\u0000\u0000\u0158\u015c\u0005"+
		"\u0002\u0000\u0000\u0159\u015b\u0003\f\u0006\u0000\u015a\u0159\u0001\u0000"+
		"\u0000\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015f\u0001\u0000"+
		"\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0160\u0005\u0003"+
		"\u0000\u0000\u0160#\u0001\u0000\u0000\u0000\u0161\u0162\u0003 \u0010\u0000"+
		"\u0162\u0169\u00057\u0000\u0000\u0163\u0164\u0005\u001e\u0000\u0000\u0164"+
		"\u0165\u0003 \u0010\u0000\u0165\u0166\u00057\u0000\u0000\u0166\u0168\u0001"+
		"\u0000\u0000\u0000\u0167\u0163\u0001\u0000\u0000\u0000\u0168\u016b\u0001"+
		"\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001"+
		"\u0000\u0000\u0000\u016a%\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000"+
		"\u0000\u0000\u016c\u0171\u0003*\u0015\u0000\u016d\u016e\u0005\u001e\u0000"+
		"\u0000\u016e\u0170\u0003*\u0015\u0000\u016f\u016d\u0001\u0000\u0000\u0000"+
		"\u0170\u0173\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000"+
		"\u0171\u0172\u0001\u0000\u0000\u0000\u0172\'\u0001\u0000\u0000\u0000\u0173"+
		"\u0171\u0001\u0000\u0000\u0000\u0174\u0175\u0007\u0001\u0000\u0000\u0175"+
		")\u0001\u0000\u0000\u0000\u0176\u0177\u0006\u0015\uffff\uffff\u0000\u0177"+
		"\u0178\u0005$\u0000\u0000\u0178\u01a4\u0003*\u0015\u0014\u0179\u017a\u0005"+
		"%\u0000\u0000\u017a\u01a4\u0003*\u0015\u0013\u017b\u017c\u00057\u0000"+
		"\u0000\u017c\u017e\u0005\u0012\u0000\u0000\u017d\u017f\u0003&\u0013\u0000"+
		"\u017e\u017d\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u01a4\u0005\u0013\u0000\u0000"+
		"\u0181\u0182\u00057\u0000\u0000\u0182\u0183\u0005\t\u0000\u0000\u0183"+
		"\u0184\u0003*\u0015\u0000\u0184\u0185\u0005\n\u0000\u0000\u0185\u0186"+
		"\u0005\t\u0000\u0000\u0186\u0187\u0003*\u0015\u0000\u0187\u0188\u0005"+
		"\n\u0000\u0000\u0188\u01a4\u0001\u0000\u0000\u0000\u0189\u018a\u00057"+
		"\u0000\u0000\u018a\u018b\u0005\t\u0000\u0000\u018b\u018c\u0003*\u0015"+
		"\u0000\u018c\u018d\u0005\n\u0000\u0000\u018d\u01a4\u0001\u0000\u0000\u0000"+
		"\u018e\u01a4\u00050\u0000\u0000\u018f\u01a4\u00051\u0000\u0000\u0190\u01a4"+
		"\u00055\u0000\u0000\u0191\u01a4\u00056\u0000\u0000\u0192\u01a4\u00054"+
		"\u0000\u0000\u0193\u0194\u00057\u0000\u0000\u0194\u0195\u0005\u0015\u0000"+
		"\u0000\u0195\u01a4\u00057\u0000\u0000\u0196\u01a4\u00057\u0000\u0000\u0197"+
		"\u0198\u0005\u0012\u0000\u0000\u0198\u0199\u0003*\u0015\u0000\u0199\u019a"+
		"\u0005\u0013\u0000\u0000\u019a\u01a4\u0001\u0000\u0000\u0000\u019b\u019c"+
		"\u00057\u0000\u0000\u019c\u019d\u0005\u0015\u0000\u0000\u019d\u019e\u0005"+
		"7\u0000\u0000\u019e\u01a0\u0005\u0012\u0000\u0000\u019f\u01a1\u0003&\u0013"+
		"\u0000\u01a0\u019f\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a4\u0005\u0013\u0000"+
		"\u0000\u01a3\u0176\u0001\u0000\u0000\u0000\u01a3\u0179\u0001\u0000\u0000"+
		"\u0000\u01a3\u017b\u0001\u0000\u0000\u0000\u01a3\u0181\u0001\u0000\u0000"+
		"\u0000\u01a3\u0189\u0001\u0000\u0000\u0000\u01a3\u018e\u0001\u0000\u0000"+
		"\u0000\u01a3\u018f\u0001\u0000\u0000\u0000\u01a3\u0190\u0001\u0000\u0000"+
		"\u0000\u01a3\u0191\u0001\u0000\u0000\u0000\u01a3\u0192\u0001\u0000\u0000"+
		"\u0000\u01a3\u0193\u0001\u0000\u0000\u0000\u01a3\u0196\u0001\u0000\u0000"+
		"\u0000\u01a3\u0197\u0001\u0000\u0000\u0000\u01a3\u019b\u0001\u0000\u0000"+
		"\u0000\u01a4\u01bb\u0001\u0000\u0000\u0000\u01a5\u01a6\n\u0012\u0000\u0000"+
		"\u01a6\u01a7\u0007\u0002\u0000\u0000\u01a7\u01ba\u0003*\u0015\u0013\u01a8"+
		"\u01a9\n\u0011\u0000\u0000\u01a9\u01aa\u0007\u0003\u0000\u0000\u01aa\u01ba"+
		"\u0003*\u0015\u0012\u01ab\u01ac\n\u0010\u0000\u0000\u01ac\u01ad\u0007"+
		"\u0004\u0000\u0000\u01ad\u01ba\u0003*\u0015\u0011\u01ae\u01af\n\u000f"+
		"\u0000\u0000\u01af\u01b0\u0003,\u0016\u0000\u01b0\u01b1\u0003*\u0015\u0010"+
		"\u01b1\u01ba\u0001\u0000\u0000\u0000\u01b2\u01b3\n\u000e\u0000\u0000\u01b3"+
		"\u01b4\u0003.\u0017\u0000\u01b4\u01b5\u0003*\u0015\u000f\u01b5\u01ba\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b7\n\r\u0000\u0000\u01b7\u01b8\u0005/\u0000"+
		"\u0000\u01b8\u01ba\u0003*\u0015\u000e\u01b9\u01a5\u0001\u0000\u0000\u0000"+
		"\u01b9\u01a8\u0001\u0000\u0000\u0000\u01b9\u01ab\u0001\u0000\u0000\u0000"+
		"\u01b9\u01ae\u0001\u0000\u0000\u0000\u01b9\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b9\u01b6\u0001\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000"+
		"\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000"+
		"\u01bc+\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be"+
		"\u01bf\u00052\u0000\u0000\u01bf-\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005"+
		"3\u0000\u0000\u01c1/\u0001\u0000\u0000\u0000\u001a46@MOT\u00d8\u0100\u0104"+
		"\u010b\u0110\u011a\u0120\u0127\u0136\u0145\u014e\u0155\u015c\u0169\u0171"+
		"\u017e\u01a0\u01a3\u01b9\u01bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}