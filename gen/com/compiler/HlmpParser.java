// Generated from C:/Users/Jakob/Documents/GitHub/Arduino-high-level-languageP4AAU/src/com/compiler\Hlmp.g4 by ANTLR 4.9.2
package com.compiler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HlmpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NUMTYPE=2, BOOLTYPE=3, PWMTYPE=4, PINTYPE=5, RELATIONAL=6, ARITHMETIC=7, 
		LOGICAL=8, NEG=9, PLUS=10, MINUS=11, DIVIDE=12, MULT=13, MODULU=14, LESSTHAN=15, 
		GREATERTHAN=16, EQUAL=17, NOTEQUAL=18, LOGAND=19, LOGOR=20, SETUP=21, 
		LOOP=22, FUNC=23, PROC=24, WRITE=25, READPWM=26, READA=27, READD=28, LPAREN=29, 
		RPAREN=30, LBRACE=31, RBRACE=32, END=33, ASSIGN=34, NEGATIVE=35, HIGH=36, 
		LOW=37, PINMODE=38, TOGGLE=39, BOOL=40, IF=41, ELSE=42, RETURN=43, WHILE=44, 
		PINNUMBER=45, INT=46, ID=47, COMMENT=48, LINECOMMENT=49, WS=50, NEWLINE=51;
	public static final int
		RULE_program = 0, RULE_content = 1, RULE_funcProc = 2, RULE_funcHead = 3, 
		RULE_procHead = 4, RULE_id = 5, RULE_parameters = 6, RULE_parameter = 7, 
		RULE_type = 8, RULE_body = 9, RULE_stmt = 10, RULE_varDecl = 11, RULE_expr = 12, 
		RULE_operand = 13, RULE_operator = 14, RULE_readFunc = 15, RULE_pinLiteral = 16, 
		RULE_assign = 17, RULE_returnExpr = 18, RULE_funcCall = 19, RULE_args = 20, 
		RULE_writeFunc = 21, RULE_val = 22, RULE_ifStmt = 23, RULE_elseStmt = 24, 
		RULE_whileExpr = 25, RULE_setupDef = 26, RULE_loopDef = 27, RULE_comment = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "content", "funcProc", "funcHead", "procHead", "id", "parameters", 
			"parameter", "type", "body", "stmt", "varDecl", "expr", "operand", "operator", 
			"readFunc", "pinLiteral", "assign", "returnExpr", "funcCall", "args", 
			"writeFunc", "val", "ifStmt", "elseStmt", "whileExpr", "setupDef", "loopDef", 
			"comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'Num '", "'Bool '", "'Pwm '", "'Pin '", null, null, null, 
			"'!'", "'+'", "'-'", "'/'", "'*'", "'%'", "'<'", "'>'", "'=='", "'!='", 
			"'&&'", "'||'", "'setup'", "'loop'", "'func '", "'proc '", "'.Write'", 
			"'.ReadPwm'", "'.ReadAnalog'", "'.ReadDigital'", "'('", "')'", "'{'", 
			"'}'", "';'", "'='", "'~'", "'HIGH'", "'LOW'", null, "'TOGGLE'", null, 
			"'if'", "'else'", "'return'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NUMTYPE", "BOOLTYPE", "PWMTYPE", "PINTYPE", "RELATIONAL", 
			"ARITHMETIC", "LOGICAL", "NEG", "PLUS", "MINUS", "DIVIDE", "MULT", "MODULU", 
			"LESSTHAN", "GREATERTHAN", "EQUAL", "NOTEQUAL", "LOGAND", "LOGOR", "SETUP", 
			"LOOP", "FUNC", "PROC", "WRITE", "READPWM", "READA", "READD", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "END", "ASSIGN", "NEGATIVE", "HIGH", "LOW", 
			"PINMODE", "TOGGLE", "BOOL", "IF", "ELSE", "RETURN", "WHILE", "PINNUMBER", 
			"INT", "ID", "COMMENT", "LINECOMMENT", "WS", "NEWLINE"
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
	public String getGrammarFileName() { return "Hlmp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HlmpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE) | (1L << FUNC) | (1L << PROC) | (1L << COMMENT) | (1L << LINECOMMENT))) != 0)) {
				{
				{
				setState(58);
				content();
				}
				}
				setState(63);
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

	public static class ContentContext extends ParserRuleContext {
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
	 
		public ContentContext() { }
		public void copyFrom(ContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CntCommentContext extends ContentContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public CntCommentContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterCntComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitCntComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitCntComment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StandardFuncContext extends ContentContext {
		public SetupDefContext setupDef() {
			return getRuleContext(SetupDefContext.class,0);
		}
		public LoopDefContext loopDef() {
			return getRuleContext(LoopDefContext.class,0);
		}
		public StandardFuncContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterStandardFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitStandardFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitStandardFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CntFuncProcContext extends ContentContext {
		public FuncProcContext funcProc() {
			return getRuleContext(FuncProcContext.class,0);
		}
		public CntFuncProcContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterCntFuncProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitCntFuncProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitCntFuncProc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CntvarDeclContext extends ContentContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public TerminalNode END() { return getToken(HlmpParser.END, 0); }
		public CntvarDeclContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterCntvarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitCntvarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitCntvarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_content);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new CntFuncProcContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				funcProc();
				}
				break;
			case 2:
				_localctx = new StandardFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				setupDef();
				}
				break;
			case 3:
				_localctx = new StandardFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				loopDef();
				}
				break;
			case 4:
				_localctx = new CntvarDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				varDecl();
				setState(68);
				match(END);
				}
				break;
			case 5:
				_localctx = new CntCommentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				comment();
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

	public static class FuncProcContext extends ParserRuleContext {
		public FuncProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcProc; }
	 
		public FuncProcContext() { }
		public void copyFrom(FuncProcContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncDefinitionContext extends FuncProcContext {
		public FuncHeadContext funcHead() {
			return getRuleContext(FuncHeadContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(HlmpParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HlmpParser.RBRACE, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public FuncDefinitionContext(FuncProcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterFuncDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitFuncDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitFuncDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProcDefinitionContext extends FuncProcContext {
		public ProcHeadContext procHead() {
			return getRuleContext(ProcHeadContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(HlmpParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HlmpParser.RBRACE, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public ProcDefinitionContext(FuncProcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterProcDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitProcDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitProcDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncProcContext funcProc() throws RecognitionException {
		FuncProcContext _localctx = new FuncProcContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcProc);
		int _la;
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
				_localctx = new FuncDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				funcHead();
				setState(74);
				match(LBRACE);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << ID) | (1L << COMMENT) | (1L << LINECOMMENT))) != 0)) {
					{
					{
					setState(75);
					body();
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(81);
				match(RBRACE);
				}
				break;
			case PROC:
				_localctx = new ProcDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				procHead();
				setState(84);
				match(LBRACE);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << ID) | (1L << COMMENT) | (1L << LINECOMMENT))) != 0)) {
					{
					{
					setState(85);
					body();
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91);
				match(RBRACE);
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

	public static class FuncHeadContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(HlmpParser.FUNC, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HlmpParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HlmpParser.RPAREN, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public FuncHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterFuncHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitFuncHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitFuncHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncHeadContext funcHead() throws RecognitionException {
		FuncHeadContext _localctx = new FuncHeadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcHead);
		int _la;
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(FUNC);
				setState(96);
				type();
				setState(97);
				id();
				setState(98);
				match(LPAREN);
				setState(99);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(FUNC);
				setState(102);
				type();
				setState(103);
				id();
				setState(104);
				match(LPAREN);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE))) != 0)) {
					{
					setState(105);
					parameter();
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(106);
						match(T__0);
						setState(107);
						parameter();
						}
						}
						setState(112);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(115);
				match(RPAREN);
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

	public static class ProcHeadContext extends ParserRuleContext {
		public TerminalNode PROC() { return getToken(HlmpParser.PROC, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HlmpParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HlmpParser.RPAREN, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ProcHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterProcHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitProcHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitProcHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcHeadContext procHead() throws RecognitionException {
		ProcHeadContext _localctx = new ProcHeadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_procHead);
		int _la;
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(PROC);
				setState(120);
				id();
				setState(121);
				match(LPAREN);
				setState(122);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(PROC);
				setState(125);
				id();
				setState(126);
				match(LPAREN);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE))) != 0)) {
					{
					setState(127);
					parameter();
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(128);
						match(T__0);
						setState(129);
						parameter();
						}
						}
						setState(134);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(137);
				match(RPAREN);
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

	public static class IdContext extends ParserRuleContext {
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	 
		public IdContext() { }
		public void copyFrom(IdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierContext extends IdContext {
		public TerminalNode ID() { return getToken(HlmpParser.ID, 0); }
		public IdentifierContext(IdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_id);
		try {
			_localctx = new IdentifierContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ID);
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

	public static class ParametersContext extends ParserRuleContext {
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	 
		public ParametersContext() { }
		public void copyFrom(ParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamsContext extends ParametersContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParamsContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameters);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new ParamsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				parameter();
				}
				break;
			case 2:
				_localctx = new ParamsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				parameter();
				setState(145);
				match(T__0);
				setState(146);
				parameters();
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

	public static class ParameterContext extends ParserRuleContext {
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	 
		public ParameterContext() { }
		public void copyFrom(ParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamContext extends ParameterContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ParamContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter);
		try {
			_localctx = new ParamContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			type();
			setState(151);
			id();
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
		public TerminalNode NUMTYPE() { return getToken(HlmpParser.NUMTYPE, 0); }
		public TerminalNode BOOLTYPE() { return getToken(HlmpParser.BOOLTYPE, 0); }
		public TerminalNode PWMTYPE() { return getToken(HlmpParser.PWMTYPE, 0); }
		public TerminalNode PINTYPE() { return getToken(HlmpParser.PINTYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE))) != 0)) ) {
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

	public static class BodyContext extends ParserRuleContext {
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	 
		public BodyContext() { }
		public void copyFrom(BodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BodyCommentContext extends BodyContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public BodyCommentContext(BodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterBodyComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitBodyComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitBodyComment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BodyStmtContext extends BodyContext {
		public FuncProcContext funcProc() {
			return getRuleContext(FuncProcContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public BodyStmtContext(BodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterBodyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitBodyStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitBodyStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_body);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case PROC:
				_localctx = new BodyStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				funcProc();
				}
				break;
			case NUMTYPE:
			case BOOLTYPE:
			case PWMTYPE:
			case PINTYPE:
			case IF:
			case RETURN:
			case WHILE:
			case ID:
				_localctx = new BodyStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				stmt();
				}
				break;
			case COMMENT:
			case LINECOMMENT:
				_localctx = new BodyCommentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				comment();
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtWriteFuncContext extends StmtContext {
		public WriteFuncContext writeFunc() {
			return getRuleContext(WriteFuncContext.class,0);
		}
		public TerminalNode END() { return getToken(HlmpParser.END, 0); }
		public StmtWriteFuncContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterStmtWriteFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitStmtWriteFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitStmtWriteFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtFuncCallContext extends StmtContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode END() { return getToken(HlmpParser.END, 0); }
		public StmtFuncCallContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterStmtFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitStmtFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitStmtFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtIfStmtContext extends StmtContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public StmtIfStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterStmtIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitStmtIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitStmtIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtReadFuncContext extends StmtContext {
		public ReadFuncContext readFunc() {
			return getRuleContext(ReadFuncContext.class,0);
		}
		public TerminalNode END() { return getToken(HlmpParser.END, 0); }
		public StmtReadFuncContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterStmtReadFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitStmtReadFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitStmtReadFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtWhileExprContext extends StmtContext {
		public WhileExprContext whileExpr() {
			return getRuleContext(WhileExprContext.class,0);
		}
		public StmtWhileExprContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterStmtWhileExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitStmtWhileExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitStmtWhileExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtReturnExprContext extends StmtContext {
		public ReturnExprContext returnExpr() {
			return getRuleContext(ReturnExprContext.class,0);
		}
		public TerminalNode END() { return getToken(HlmpParser.END, 0); }
		public StmtReturnExprContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterStmtReturnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitStmtReturnExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitStmtReturnExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtVarDeclContext extends StmtContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public TerminalNode END() { return getToken(HlmpParser.END, 0); }
		public StmtVarDeclContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterStmtVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitStmtVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitStmtVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtAssignContext extends StmtContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode END() { return getToken(HlmpParser.END, 0); }
		public StmtAssignContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterStmtAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitStmtAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitStmtAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new StmtVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				varDecl();
				setState(161);
				match(END);
				}
				break;
			case 2:
				_localctx = new StmtAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				assign();
				setState(164);
				match(END);
				}
				break;
			case 3:
				_localctx = new StmtReturnExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				returnExpr();
				setState(167);
				match(END);
				}
				break;
			case 4:
				_localctx = new StmtFuncCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				funcCall();
				setState(170);
				match(END);
				}
				break;
			case 5:
				_localctx = new StmtWriteFuncContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				writeFunc();
				setState(173);
				match(END);
				}
				break;
			case 6:
				_localctx = new StmtReadFuncContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
				readFunc();
				setState(176);
				match(END);
				}
				break;
			case 7:
				_localctx = new StmtIfStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(178);
				ifStmt();
				}
				break;
			case 8:
				_localctx = new StmtWhileExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(179);
				whileExpr();
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

	public static class VarDeclContext extends ParserRuleContext {
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	 
		public VarDeclContext() { }
		public void copyFrom(VarDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclPinLiteralContext extends VarDeclContext {
		public PinLiteralContext pinLiteral() {
			return getRuleContext(PinLiteralContext.class,0);
		}
		public VarDeclPinLiteralContext(VarDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterVarDeclPinLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitVarDeclPinLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitVarDeclPinLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclarationContext extends VarDeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(HlmpParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclarationContext(VarDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varDecl);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new VarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				type();
				setState(183);
				id();
				}
				break;
			case 2:
				_localctx = new VarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				type();
				setState(186);
				id();
				setState(187);
				match(ASSIGN);
				setState(188);
				expr();
				}
				break;
			case 3:
				_localctx = new VarDeclPinLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				pinLiteral();
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
	public static class ExprOperandContext extends ExprContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode NEG() { return getToken(HlmpParser.NEG, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(HlmpParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HlmpParser.RPAREN, 0); }
		public ExprOperandContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterExprOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitExprOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitExprOperand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprReadFuncContext extends ExprContext {
		public ReadFuncContext readFunc() {
			return getRuleContext(ReadFuncContext.class,0);
		}
		public TerminalNode NEG() { return getToken(HlmpParser.NEG, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprReadFuncContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterExprReadFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitExprReadFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitExprReadFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		int _la;
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new ExprOperandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEG) {
					{
					setState(193);
					match(NEG);
					}
				}

				setState(196);
				operand();
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RELATIONAL) | (1L << ARITHMETIC) | (1L << LOGICAL))) != 0)) {
					{
					setState(197);
					operator();
					setState(198);
					expr();
					}
				}

				}
				break;
			case 2:
				_localctx = new ExprReadFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEG) {
					{
					setState(202);
					match(NEG);
					}
				}

				setState(205);
				readFunc();
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RELATIONAL) | (1L << ARITHMETIC) | (1L << LOGICAL))) != 0)) {
					{
					setState(206);
					operator();
					setState(207);
					expr();
					}
				}

				}
				break;
			case 3:
				_localctx = new ExprOperandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEG) {
					{
					setState(211);
					match(NEG);
					}
				}

				setState(214);
				match(LPAREN);
				setState(215);
				expr();
				setState(216);
				match(RPAREN);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RELATIONAL) | (1L << ARITHMETIC) | (1L << LOGICAL))) != 0)) {
					{
					setState(217);
					operator();
					setState(218);
					expr();
					}
				}

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

	public static class OperandContext extends ParserRuleContext {
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
	 
		public OperandContext() { }
		public void copyFrom(OperandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperandBoolContext extends OperandContext {
		public TerminalNode BOOL() { return getToken(HlmpParser.BOOL, 0); }
		public OperandBoolContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterOperandBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitOperandBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitOperandBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperandFuncCallContext extends OperandContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public OperandFuncCallContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterOperandFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitOperandFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitOperandFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperandIdContext extends OperandContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public OperandIdContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterOperandId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitOperandId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitOperandId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperandSIntContext extends OperandContext {
		public TerminalNode INT() { return getToken(HlmpParser.INT, 0); }
		public TerminalNode NEGATIVE() { return getToken(HlmpParser.NEGATIVE, 0); }
		public OperandSIntContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterOperandSInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitOperandSInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitOperandSInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operand);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new OperandIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				id();
				}
				break;
			case 2:
				_localctx = new OperandSIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEGATIVE) {
					{
					setState(225);
					match(NEGATIVE);
					}
				}

				setState(228);
				match(INT);
				}
				break;
			case 3:
				_localctx = new OperandBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(BOOL);
				}
				break;
			case 4:
				_localctx = new OperandFuncCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				funcCall();
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

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	 
		public OperatorContext() { }
		public void copyFrom(OperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperatorLogContext extends OperatorContext {
		public TerminalNode LOGICAL() { return getToken(HlmpParser.LOGICAL, 0); }
		public OperatorLogContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterOperatorLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitOperatorLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitOperatorLog(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperatorArithmeticContext extends OperatorContext {
		public TerminalNode ARITHMETIC() { return getToken(HlmpParser.ARITHMETIC, 0); }
		public OperatorArithmeticContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterOperatorArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitOperatorArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitOperatorArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpRelationalContext extends OperatorContext {
		public TerminalNode RELATIONAL() { return getToken(HlmpParser.RELATIONAL, 0); }
		public OpRelationalContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterOpRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitOpRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitOpRelational(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operator);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONAL:
				_localctx = new OpRelationalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(RELATIONAL);
				}
				break;
			case ARITHMETIC:
				_localctx = new OperatorArithmeticContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(ARITHMETIC);
				}
				break;
			case LOGICAL:
				_localctx = new OperatorLogContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(LOGICAL);
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

	public static class ReadFuncContext extends ParserRuleContext {
		public ReadFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readFunc; }
	 
		public ReadFuncContext() { }
		public void copyFrom(ReadFuncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadFuncPWMContext extends ReadFuncContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode READPWM() { return getToken(HlmpParser.READPWM, 0); }
		public TerminalNode LPAREN() { return getToken(HlmpParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HlmpParser.RPAREN, 0); }
		public ReadFuncPWMContext(ReadFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterReadFuncPWM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitReadFuncPWM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitReadFuncPWM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadFuncDigContext extends ReadFuncContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode READD() { return getToken(HlmpParser.READD, 0); }
		public TerminalNode LPAREN() { return getToken(HlmpParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HlmpParser.RPAREN, 0); }
		public ReadFuncDigContext(ReadFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterReadFuncDig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitReadFuncDig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitReadFuncDig(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadFuncAnalContext extends ReadFuncContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode READA() { return getToken(HlmpParser.READA, 0); }
		public TerminalNode LPAREN() { return getToken(HlmpParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HlmpParser.RPAREN, 0); }
		public ReadFuncAnalContext(ReadFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterReadFuncAnal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitReadFuncAnal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitReadFuncAnal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadFuncContext readFunc() throws RecognitionException {
		ReadFuncContext _localctx = new ReadFuncContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_readFunc);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new ReadFuncPWMContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				id();
				setState(239);
				match(READPWM);
				setState(240);
				match(LPAREN);
				setState(241);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new ReadFuncAnalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				id();
				setState(244);
				match(READA);
				setState(245);
				match(LPAREN);
				setState(246);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new ReadFuncDigContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				id();
				setState(249);
				match(READD);
				setState(250);
				match(LPAREN);
				setState(251);
				match(RPAREN);
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

	public static class PinLiteralContext extends ParserRuleContext {
		public PinLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pinLiteral; }
	 
		public PinLiteralContext() { }
		public void copyFrom(PinLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PinLiteralDefContext extends PinLiteralContext {
		public TerminalNode PINTYPE() { return getToken(HlmpParser.PINTYPE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(HlmpParser.LBRACE, 0); }
		public TerminalNode PINNUMBER() { return getToken(HlmpParser.PINNUMBER, 0); }
		public TerminalNode PINMODE() { return getToken(HlmpParser.PINMODE, 0); }
		public TerminalNode RBRACE() { return getToken(HlmpParser.RBRACE, 0); }
		public PinLiteralDefContext(PinLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterPinLiteralDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitPinLiteralDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitPinLiteralDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PinLiteralContext pinLiteral() throws RecognitionException {
		PinLiteralContext _localctx = new PinLiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pinLiteral);
		try {
			_localctx = new PinLiteralDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(PINTYPE);
			setState(256);
			id();
			setState(257);
			match(LBRACE);
			setState(258);
			match(PINNUMBER);
			setState(259);
			match(T__0);
			setState(260);
			match(PINMODE);
			setState(261);
			match(RBRACE);
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

	public static class AssignContext extends ParserRuleContext {
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	 
		public AssignContext() { }
		public void copyFrom(AssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignExprContext extends AssignContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(HlmpParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignExprContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assign);
		try {
			_localctx = new AssignExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			id();
			setState(264);
			match(ASSIGN);
			setState(265);
			expr();
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

	public static class ReturnExprContext extends ParserRuleContext {
		public ReturnExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExpr; }
	 
		public ReturnExprContext() { }
		public void copyFrom(ReturnExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnExpressionContext extends ReturnExprContext {
		public TerminalNode RETURN() { return getToken(HlmpParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnExpressionContext(ReturnExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterReturnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitReturnExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitReturnExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnExprContext returnExpr() throws RecognitionException {
		ReturnExprContext _localctx = new ReturnExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_returnExpr);
		try {
			_localctx = new ReturnExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(RETURN);
			setState(268);
			expr();
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

	public static class FuncCallContext extends ParserRuleContext {
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
	 
		public FuncCallContext() { }
		public void copyFrom(FuncCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallContext extends FuncCallContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HlmpParser.LPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HlmpParser.RPAREN, 0); }
		public FunctionCallContext(FuncCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_funcCall);
		try {
			_localctx = new FunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			id();
			setState(271);
			match(LPAREN);
			setState(272);
			args();
			setState(273);
			match(RPAREN);
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

	public static class ArgsContext extends ParserRuleContext {
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	 
		public ArgsContext() { }
		public void copyFrom(ArgsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgumentsContext extends ArgsContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgumentsContext(ArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_args);
		int _la;
		try {
			_localctx = new ArgumentsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEG) | (1L << LPAREN) | (1L << NEGATIVE) | (1L << BOOL) | (1L << INT) | (1L << ID))) != 0)) {
				{
				setState(275);
				expr();
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(276);
					match(T__0);
					setState(277);
					expr();
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class WriteFuncContext extends ParserRuleContext {
		public WriteFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeFunc; }
	 
		public WriteFuncContext() { }
		public void copyFrom(WriteFuncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WriteFuncDefContext extends WriteFuncContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode WRITE() { return getToken(HlmpParser.WRITE, 0); }
		public TerminalNode LPAREN() { return getToken(HlmpParser.LPAREN, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HlmpParser.RPAREN, 0); }
		public WriteFuncDefContext(WriteFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterWriteFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitWriteFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitWriteFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteFuncContext writeFunc() throws RecognitionException {
		WriteFuncContext _localctx = new WriteFuncContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_writeFunc);
		try {
			_localctx = new WriteFuncDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			id();
			setState(286);
			match(WRITE);
			setState(287);
			match(LPAREN);
			setState(288);
			val();
			setState(289);
			match(RPAREN);
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

	public static class ValContext extends ParserRuleContext {
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
	 
		public ValContext() { }
		public void copyFrom(ValContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueIdContext extends ValContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ValueIdContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterValueId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitValueId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitValueId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueContext extends ValContext {
		public TerminalNode HIGH() { return getToken(HlmpParser.HIGH, 0); }
		public TerminalNode LOW() { return getToken(HlmpParser.LOW, 0); }
		public TerminalNode INT() { return getToken(HlmpParser.INT, 0); }
		public TerminalNode NEGATIVE() { return getToken(HlmpParser.NEGATIVE, 0); }
		public TerminalNode TOGGLE() { return getToken(HlmpParser.TOGGLE, 0); }
		public ValueContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_val);
		int _la;
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HIGH:
				_localctx = new ValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(HIGH);
				}
				break;
			case LOW:
				_localctx = new ValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(LOW);
				}
				break;
			case NEGATIVE:
			case INT:
				_localctx = new ValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEGATIVE) {
					{
					setState(293);
					match(NEGATIVE);
					}
				}

				setState(296);
				match(INT);
				}
				break;
			case ID:
				_localctx = new ValueIdContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				id();
				}
				break;
			case TOGGLE:
				_localctx = new ValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(298);
				match(TOGGLE);
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

	public static class IfStmtContext extends ParserRuleContext {
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	 
		public IfStmtContext() { }
		public void copyFrom(IfStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStmtDefContext extends IfStmtContext {
		public TerminalNode IF() { return getToken(HlmpParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(HlmpParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HlmpParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(HlmpParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HlmpParser.RBRACE, 0); }
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public IfStmtDefContext(IfStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterIfStmtDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitIfStmtDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitIfStmtDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifStmt);
		int _la;
		try {
			_localctx = new IfStmtDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(IF);
			setState(302);
			match(LPAREN);
			setState(303);
			expr();
			setState(304);
			match(RPAREN);
			setState(305);
			match(LBRACE);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << ID) | (1L << COMMENT) | (1L << LINECOMMENT))) != 0)) {
				{
				{
				setState(306);
				body();
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
			match(RBRACE);
			setState(313);
			elseStmt();
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

	public static class ElseStmtContext extends ParserRuleContext {
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
	 
		public ElseStmtContext() { }
		public void copyFrom(ElseStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseIfStmtContext extends ElseStmtContext {
		public TerminalNode ELSE() { return getToken(HlmpParser.ELSE, 0); }
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ElseIfStmtContext(ElseStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterElseIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitElseIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitElseIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElseSTtmtContext extends ElseStmtContext {
		public TerminalNode ELSE() { return getToken(HlmpParser.ELSE, 0); }
		public TerminalNode LBRACE() { return getToken(HlmpParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HlmpParser.RBRACE, 0); }
		public ElseSTtmtContext(ElseStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterElseSTtmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitElseSTtmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitElseSTtmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_elseStmt);
		int _la;
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new ElseSTtmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(315);
					match(ELSE);
					setState(316);
					match(LBRACE);
					setState(317);
					body();
					setState(318);
					match(RBRACE);
					}
				}

				}
				break;
			case 2:
				_localctx = new ElseIfStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(ELSE);
				setState(323);
				ifStmt();
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

	public static class WhileExprContext extends ParserRuleContext {
		public WhileExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExpr; }
	 
		public WhileExprContext() { }
		public void copyFrom(WhileExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileExprDefContext extends WhileExprContext {
		public TerminalNode WHILE() { return getToken(HlmpParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(HlmpParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HlmpParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(HlmpParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HlmpParser.RBRACE, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public WhileExprDefContext(WhileExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterWhileExprDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitWhileExprDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitWhileExprDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileExprContext whileExpr() throws RecognitionException {
		WhileExprContext _localctx = new WhileExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_whileExpr);
		int _la;
		try {
			_localctx = new WhileExprDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(WHILE);
			setState(327);
			match(LPAREN);
			setState(328);
			expr();
			setState(329);
			match(RPAREN);
			setState(330);
			match(LBRACE);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << ID) | (1L << COMMENT) | (1L << LINECOMMENT))) != 0)) {
				{
				{
				setState(331);
				body();
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337);
			match(RBRACE);
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

	public static class SetupDefContext extends ParserRuleContext {
		public SetupDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setupDef; }
	 
		public SetupDefContext() { }
		public void copyFrom(SetupDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetupDefinitionContext extends SetupDefContext {
		public TerminalNode PROC() { return getToken(HlmpParser.PROC, 0); }
		public TerminalNode SETUP() { return getToken(HlmpParser.SETUP, 0); }
		public TerminalNode LPAREN() { return getToken(HlmpParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HlmpParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(HlmpParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HlmpParser.RBRACE, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public SetupDefinitionContext(SetupDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterSetupDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitSetupDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitSetupDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetupDefContext setupDef() throws RecognitionException {
		SetupDefContext _localctx = new SetupDefContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_setupDef);
		int _la;
		try {
			_localctx = new SetupDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(PROC);
			setState(340);
			match(SETUP);
			setState(341);
			match(LPAREN);
			setState(342);
			match(RPAREN);
			setState(343);
			match(LBRACE);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << ID) | (1L << COMMENT) | (1L << LINECOMMENT))) != 0)) {
				{
				{
				setState(344);
				body();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			match(RBRACE);
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

	public static class LoopDefContext extends ParserRuleContext {
		public LoopDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopDef; }
	 
		public LoopDefContext() { }
		public void copyFrom(LoopDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoopDefinitionContext extends LoopDefContext {
		public TerminalNode PROC() { return getToken(HlmpParser.PROC, 0); }
		public TerminalNode LOOP() { return getToken(HlmpParser.LOOP, 0); }
		public TerminalNode LPAREN() { return getToken(HlmpParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HlmpParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(HlmpParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HlmpParser.RBRACE, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public LoopDefinitionContext(LoopDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterLoopDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitLoopDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitLoopDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopDefContext loopDef() throws RecognitionException {
		LoopDefContext _localctx = new LoopDefContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_loopDef);
		int _la;
		try {
			_localctx = new LoopDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(PROC);
			setState(353);
			match(LOOP);
			setState(354);
			match(LPAREN);
			setState(355);
			match(RPAREN);
			setState(356);
			match(LBRACE);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << ID) | (1L << COMMENT) | (1L << LINECOMMENT))) != 0)) {
				{
				{
				setState(357);
				body();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			match(RBRACE);
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

	public static class CommentContext extends ParserRuleContext {
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	 
		public CommentContext() { }
		public void copyFrom(CommentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommentDelContext extends CommentContext {
		public TerminalNode COMMENT() { return getToken(HlmpParser.COMMENT, 0); }
		public TerminalNode LINECOMMENT() { return getToken(HlmpParser.LINECOMMENT, 0); }
		public CommentDelContext(CommentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterCommentDel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitCommentDel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitCommentDel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_comment);
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
				_localctx = new CommentDelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(COMMENT);
				}
				break;
			case LINECOMMENT:
				_localctx = new CommentDelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(LINECOMMENT);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u0174\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\3\4\7\4O\n\4\f\4"+
		"\16\4R\13\4\3\4\3\4\3\4\3\4\3\4\7\4Y\n\4\f\4\16\4\\\13\4\3\4\3\4\5\4`"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5o\n\5\f\5"+
		"\16\5r\13\5\5\5t\n\5\3\5\3\5\5\5x\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6\u0085\n\6\f\6\16\6\u0088\13\6\5\6\u008a\n\6\3\6\3\6\5"+
		"\6\u008e\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u0097\n\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\13\5\13\u00a1\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b7\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c2\n\r\3\16\5\16\u00c5\n\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00cb\n\16\3\16\5\16\u00ce\n\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00d4\n\16\3\16\5\16\u00d7\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00df\n\16\5\16\u00e1\n\16\3\17\3\17\5\17\u00e5\n\17\3\17\3\17\3\17\5"+
		"\17\u00ea\n\17\3\20\3\20\3\20\5\20\u00ef\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0100\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u0119\n\26\f\26\16\26\u011c"+
		"\13\26\5\26\u011e\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\5"+
		"\30\u0129\n\30\3\30\3\30\3\30\5\30\u012e\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\7\31\u0136\n\31\f\31\16\31\u0139\13\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0143\n\32\3\32\3\32\5\32\u0147\n\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\7\33\u014f\n\33\f\33\16\33\u0152\13\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\7\34\u015c\n\34\f\34\16\34\u015f\13\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0169\n\35\f\35\16\35\u016c"+
		"\13\35\3\35\3\35\3\36\3\36\5\36\u0172\n\36\3\36\2\2\37\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\3\3\2\4\7\2\u018e\2"+
		"?\3\2\2\2\4I\3\2\2\2\6_\3\2\2\2\bw\3\2\2\2\n\u008d\3\2\2\2\f\u008f\3\2"+
		"\2\2\16\u0096\3\2\2\2\20\u0098\3\2\2\2\22\u009b\3\2\2\2\24\u00a0\3\2\2"+
		"\2\26\u00b6\3\2\2\2\30\u00c1\3\2\2\2\32\u00e0\3\2\2\2\34\u00e9\3\2\2\2"+
		"\36\u00ee\3\2\2\2 \u00ff\3\2\2\2\"\u0101\3\2\2\2$\u0109\3\2\2\2&\u010d"+
		"\3\2\2\2(\u0110\3\2\2\2*\u011d\3\2\2\2,\u011f\3\2\2\2.\u012d\3\2\2\2\60"+
		"\u012f\3\2\2\2\62\u0146\3\2\2\2\64\u0148\3\2\2\2\66\u0155\3\2\2\28\u0162"+
		"\3\2\2\2:\u0171\3\2\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2"+
		"\2\2@\3\3\2\2\2A?\3\2\2\2BJ\5\6\4\2CJ\5\66\34\2DJ\58\35\2EF\5\30\r\2F"+
		"G\7#\2\2GJ\3\2\2\2HJ\5:\36\2IB\3\2\2\2IC\3\2\2\2ID\3\2\2\2IE\3\2\2\2I"+
		"H\3\2\2\2J\5\3\2\2\2KL\5\b\5\2LP\7!\2\2MO\5\24\13\2NM\3\2\2\2OR\3\2\2"+
		"\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\"\2\2T`\3\2\2\2UV\5\n\6"+
		"\2VZ\7!\2\2WY\5\24\13\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2"+
		"\2\2\\Z\3\2\2\2]^\7\"\2\2^`\3\2\2\2_K\3\2\2\2_U\3\2\2\2`\7\3\2\2\2ab\7"+
		"\31\2\2bc\5\22\n\2cd\5\f\7\2de\7\37\2\2ef\7 \2\2fx\3\2\2\2gh\7\31\2\2"+
		"hi\5\22\n\2ij\5\f\7\2js\7\37\2\2kp\5\20\t\2lm\7\3\2\2mo\5\20\t\2nl\3\2"+
		"\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qt\3\2\2\2rp\3\2\2\2sk\3\2\2\2st\3\2"+
		"\2\2tu\3\2\2\2uv\7 \2\2vx\3\2\2\2wa\3\2\2\2wg\3\2\2\2x\t\3\2\2\2yz\7\32"+
		"\2\2z{\5\f\7\2{|\7\37\2\2|}\7 \2\2}\u008e\3\2\2\2~\177\7\32\2\2\177\u0080"+
		"\5\f\7\2\u0080\u0089\7\37\2\2\u0081\u0086\5\20\t\2\u0082\u0083\7\3\2\2"+
		"\u0083\u0085\5\20\t\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u0081\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7 "+
		"\2\2\u008c\u008e\3\2\2\2\u008dy\3\2\2\2\u008d~\3\2\2\2\u008e\13\3\2\2"+
		"\2\u008f\u0090\7\61\2\2\u0090\r\3\2\2\2\u0091\u0097\5\20\t\2\u0092\u0093"+
		"\5\20\t\2\u0093\u0094\7\3\2\2\u0094\u0095\5\16\b\2\u0095\u0097\3\2\2\2"+
		"\u0096\u0091\3\2\2\2\u0096\u0092\3\2\2\2\u0097\17\3\2\2\2\u0098\u0099"+
		"\5\22\n\2\u0099\u009a\5\f\7\2\u009a\21\3\2\2\2\u009b\u009c\t\2\2\2\u009c"+
		"\23\3\2\2\2\u009d\u00a1\5\6\4\2\u009e\u00a1\5\26\f\2\u009f\u00a1\5:\36"+
		"\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\25"+
		"\3\2\2\2\u00a2\u00a3\5\30\r\2\u00a3\u00a4\7#\2\2\u00a4\u00b7\3\2\2\2\u00a5"+
		"\u00a6\5$\23\2\u00a6\u00a7\7#\2\2\u00a7\u00b7\3\2\2\2\u00a8\u00a9\5&\24"+
		"\2\u00a9\u00aa\7#\2\2\u00aa\u00b7\3\2\2\2\u00ab\u00ac\5(\25\2\u00ac\u00ad"+
		"\7#\2\2\u00ad\u00b7\3\2\2\2\u00ae\u00af\5,\27\2\u00af\u00b0\7#\2\2\u00b0"+
		"\u00b7\3\2\2\2\u00b1\u00b2\5 \21\2\u00b2\u00b3\7#\2\2\u00b3\u00b7\3\2"+
		"\2\2\u00b4\u00b7\5\60\31\2\u00b5\u00b7\5\64\33\2\u00b6\u00a2\3\2\2\2\u00b6"+
		"\u00a5\3\2\2\2\u00b6\u00a8\3\2\2\2\u00b6\u00ab\3\2\2\2\u00b6\u00ae\3\2"+
		"\2\2\u00b6\u00b1\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\27\3\2\2\2\u00b8\u00b9\5\22\n\2\u00b9\u00ba\5\f\7\2\u00ba\u00c2\3\2\2"+
		"\2\u00bb\u00bc\5\22\n\2\u00bc\u00bd\5\f\7\2\u00bd\u00be\7$\2\2\u00be\u00bf"+
		"\5\32\16\2\u00bf\u00c2\3\2\2\2\u00c0\u00c2\5\"\22\2\u00c1\u00b8\3\2\2"+
		"\2\u00c1\u00bb\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\31\3\2\2\2\u00c3\u00c5"+
		"\7\13\2\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2"+
		"\u00c6\u00ca\5\34\17\2\u00c7\u00c8\5\36\20\2\u00c8\u00c9\5\32\16\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00e1\3\2"+
		"\2\2\u00cc\u00ce\7\13\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d3\5 \21\2\u00d0\u00d1\5\36\20\2\u00d1\u00d2\5"+
		"\32\16\2\u00d2\u00d4\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00e1\3\2\2\2\u00d5\u00d7\7\13\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3"+
		"\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7\37\2\2\u00d9\u00da\5\32\16\2"+
		"\u00da\u00de\7 \2\2\u00db\u00dc\5\36\20\2\u00dc\u00dd\5\32\16\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00db\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2"+
		"\2\2\u00e0\u00c4\3\2\2\2\u00e0\u00cd\3\2\2\2\u00e0\u00d6\3\2\2\2\u00e1"+
		"\33\3\2\2\2\u00e2\u00ea\5\f\7\2\u00e3\u00e5\7%\2\2\u00e4\u00e3\3\2\2\2"+
		"\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00ea\7\60\2\2\u00e7\u00ea"+
		"\7*\2\2\u00e8\u00ea\5(\25\2\u00e9\u00e2\3\2\2\2\u00e9\u00e4\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\35\3\2\2\2\u00eb\u00ef\7\b\2"+
		"\2\u00ec\u00ef\7\t\2\2\u00ed\u00ef\7\n\2\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec"+
		"\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\37\3\2\2\2\u00f0\u00f1\5\f\7\2\u00f1"+
		"\u00f2\7\34\2\2\u00f2\u00f3\7\37\2\2\u00f3\u00f4\7 \2\2\u00f4\u0100\3"+
		"\2\2\2\u00f5\u00f6\5\f\7\2\u00f6\u00f7\7\35\2\2\u00f7\u00f8\7\37\2\2\u00f8"+
		"\u00f9\7 \2\2\u00f9\u0100\3\2\2\2\u00fa\u00fb\5\f\7\2\u00fb\u00fc\7\36"+
		"\2\2\u00fc\u00fd\7\37\2\2\u00fd\u00fe\7 \2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00f0\3\2\2\2\u00ff\u00f5\3\2\2\2\u00ff\u00fa\3\2\2\2\u0100!\3\2\2\2"+
		"\u0101\u0102\7\7\2\2\u0102\u0103\5\f\7\2\u0103\u0104\7!\2\2\u0104\u0105"+
		"\7/\2\2\u0105\u0106\7\3\2\2\u0106\u0107\7(\2\2\u0107\u0108\7\"\2\2\u0108"+
		"#\3\2\2\2\u0109\u010a\5\f\7\2\u010a\u010b\7$\2\2\u010b\u010c\5\32\16\2"+
		"\u010c%\3\2\2\2\u010d\u010e\7-\2\2\u010e\u010f\5\32\16\2\u010f\'\3\2\2"+
		"\2\u0110\u0111\5\f\7\2\u0111\u0112\7\37\2\2\u0112\u0113\5*\26\2\u0113"+
		"\u0114\7 \2\2\u0114)\3\2\2\2\u0115\u011a\5\32\16\2\u0116\u0117\7\3\2\2"+
		"\u0117\u0119\5\32\16\2\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011d"+
		"\u0115\3\2\2\2\u011d\u011e\3\2\2\2\u011e+\3\2\2\2\u011f\u0120\5\f\7\2"+
		"\u0120\u0121\7\33\2\2\u0121\u0122\7\37\2\2\u0122\u0123\5.\30\2\u0123\u0124"+
		"\7 \2\2\u0124-\3\2\2\2\u0125\u012e\7&\2\2\u0126\u012e\7\'\2\2\u0127\u0129"+
		"\7%\2\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012e\7\60\2\2\u012b\u012e\5\f\7\2\u012c\u012e\7)\2\2\u012d\u0125\3\2"+
		"\2\2\u012d\u0126\3\2\2\2\u012d\u0128\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012c\3\2\2\2\u012e/\3\2\2\2\u012f\u0130\7+\2\2\u0130\u0131\7\37\2\2"+
		"\u0131\u0132\5\32\16\2\u0132\u0133\7 \2\2\u0133\u0137\7!\2\2\u0134\u0136"+
		"\5\24\13\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2"+
		"\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b"+
		"\7\"\2\2\u013b\u013c\5\62\32\2\u013c\61\3\2\2\2\u013d\u013e\7,\2\2\u013e"+
		"\u013f\7!\2\2\u013f\u0140\5\24\13\2\u0140\u0141\7\"\2\2\u0141\u0143\3"+
		"\2\2\2\u0142\u013d\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0147\3\2\2\2\u0144"+
		"\u0145\7,\2\2\u0145\u0147\5\60\31\2\u0146\u0142\3\2\2\2\u0146\u0144\3"+
		"\2\2\2\u0147\63\3\2\2\2\u0148\u0149\7.\2\2\u0149\u014a\7\37\2\2\u014a"+
		"\u014b\5\32\16\2\u014b\u014c\7 \2\2\u014c\u0150\7!\2\2\u014d\u014f\5\24"+
		"\13\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7\""+
		"\2\2\u0154\65\3\2\2\2\u0155\u0156\7\32\2\2\u0156\u0157\7\27\2\2\u0157"+
		"\u0158\7\37\2\2\u0158\u0159\7 \2\2\u0159\u015d\7!\2\2\u015a\u015c\5\24"+
		"\13\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7\""+
		"\2\2\u0161\67\3\2\2\2\u0162\u0163\7\32\2\2\u0163\u0164\7\30\2\2\u0164"+
		"\u0165\7\37\2\2\u0165\u0166\7 \2\2\u0166\u016a\7!\2\2\u0167\u0169\5\24"+
		"\13\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\7\""+
		"\2\2\u016e9\3\2\2\2\u016f\u0172\7\62\2\2\u0170\u0172\7\63\2\2\u0171\u016f"+
		"\3\2\2\2\u0171\u0170\3\2\2\2\u0172;\3\2\2\2\'?IPZ_psw\u0086\u0089\u008d"+
		"\u0096\u00a0\u00b6\u00c1\u00c4\u00ca\u00cd\u00d3\u00d6\u00de\u00e0\u00e4"+
		"\u00e9\u00ee\u00ff\u011a\u011d\u0128\u012d\u0137\u0142\u0146\u0150\u015d"+
		"\u016a\u0171";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}