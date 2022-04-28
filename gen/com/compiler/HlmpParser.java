// Generated from C:/Users/Jakob/Documents/GitHub/Arduino-high-level-languageP4AAU/src/com/compiler\Hlmp.g4 by ANTLR 4.10.1
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NUMTYPE=2, BOOLTYPE=3, PWMTYPE=4, PINTYPE=5, NEG=6, PLUS=7, MINUS=8, 
		DIVIDE=9, MULT=10, MODULU=11, LESSTHAN=12, GREATERTHAN=13, EQUAL=14, NOTEQUAL=15, 
		LOGAND=16, LOGOR=17, SETUP=18, LOOP=19, FUNC=20, PROC=21, SFLOAT=22, FLOAT=23, 
		WRITE=24, READPWM=25, READA=26, READD=27, LPAREN=28, RPAREN=29, LBRACE=30, 
		RBRACE=31, END=32, ASSIGN=33, NEGATIVE=34, HIGH=35, LOW=36, TOGGLE=37, 
		BOOL=38, TRUE=39, FALSE=40, PINMODE=41, IN=42, OUT=43, IF=44, ELSE=45, 
		RETURN=46, WHILE=47, PINNUMBER=48, COMMENT=49, LINECOMMENT=50, WS=51, 
		NEWLINE=52, ID=53;
	public static final int
		RULE_program = 0, RULE_content = 1, RULE_funcProc = 2, RULE_funcHead = 3, 
		RULE_procHead = 4, RULE_id = 5, RULE_parameters = 6, RULE_parameter = 7, 
		RULE_type = 8, RULE_body = 9, RULE_stmt = 10, RULE_varDecl = 11, RULE_expr = 12, 
		RULE_operand = 13, RULE_readFunc = 14, RULE_pinLiteral = 15, RULE_assign = 16, 
		RULE_returnExpr = 17, RULE_funcCall = 18, RULE_args = 19, RULE_writeFunc = 20, 
		RULE_val = 21, RULE_ifStmt = 22, RULE_elseStmt = 23, RULE_whileExpr = 24, 
		RULE_setupDef = 25, RULE_loopDef = 26, RULE_comment = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "content", "funcProc", "funcHead", "procHead", "id", "parameters", 
			"parameter", "type", "body", "stmt", "varDecl", "expr", "operand", "readFunc", 
			"pinLiteral", "assign", "returnExpr", "funcCall", "args", "writeFunc", 
			"val", "ifStmt", "elseStmt", "whileExpr", "setupDef", "loopDef", "comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'Num '", "'Bool '", "'Pwm '", "'Pin '", "'!'", "'+'", "'-'", 
			"'/'", "'*'", "'%'", "'<'", "'>'", "'=='", "'!='", "'&&'", "'||'", "'setup'", 
			"'loop'", "'func '", "'proc '", null, null, "'.Write'", "'.ReadPwm'", 
			"'.ReadAnalog'", "'.ReadDigital'", "'('", "')'", "'{'", "'}'", "';'", 
			"'='", "'~'", "'HIGH'", "'LOW'", "'TOGGLE'", null, "'true'", "'false'", 
			null, "'in'", "'out'", "'if'", "'else'", "'return'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NUMTYPE", "BOOLTYPE", "PWMTYPE", "PINTYPE", "NEG", "PLUS", 
			"MINUS", "DIVIDE", "MULT", "MODULU", "LESSTHAN", "GREATERTHAN", "EQUAL", 
			"NOTEQUAL", "LOGAND", "LOGOR", "SETUP", "LOOP", "FUNC", "PROC", "SFLOAT", 
			"FLOAT", "WRITE", "READPWM", "READA", "READD", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "END", "ASSIGN", "NEGATIVE", "HIGH", "LOW", "TOGGLE", "BOOL", 
			"TRUE", "FALSE", "PINMODE", "IN", "OUT", "IF", "ELSE", "RETURN", "WHILE", 
			"PINNUMBER", "COMMENT", "LINECOMMENT", "WS", "NEWLINE", "ID"
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
		public SetupDefContext setupDef() {
			return getRuleContext(SetupDefContext.class,0);
		}
		public LoopDefContext loopDef() {
			return getRuleContext(LoopDefContext.class,0);
		}
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
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				setupDef();
				setState(57);
				loopDef();
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(58);
					content();
					}
					}
					setState(61); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE) | (1L << FUNC) | (1L << PROC) | (1L << COMMENT) | (1L << LINECOMMENT))) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				loopDef();
				setState(64);
				setupDef();
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(65);
					content();
					}
					}
					setState(68); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE) | (1L << FUNC) | (1L << PROC) | (1L << COMMENT) | (1L << LINECOMMENT))) != 0) );
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
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case PROC:
				_localctx = new CntFuncProcContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				funcProc();
				}
				break;
			case NUMTYPE:
			case BOOLTYPE:
			case PWMTYPE:
			case PINTYPE:
				_localctx = new CntvarDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				varDecl();
				setState(74);
				match(END);
				}
				break;
			case COMMENT:
			case LINECOMMENT:
				_localctx = new CntCommentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
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
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HlmpParser.RBRACE, 0); }
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
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HlmpParser.RBRACE, 0); }
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
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
				_localctx = new FuncDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				funcHead();
				setState(80);
				match(LBRACE);
				setState(81);
				body();
				setState(82);
				match(RBRACE);
				}
				break;
			case PROC:
				_localctx = new ProcDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				procHead();
				setState(85);
				match(LBRACE);
				setState(86);
				body();
				setState(87);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(FUNC);
			setState(92);
			type();
			setState(93);
			id();
			setState(94);
			match(LPAREN);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE))) != 0)) {
				{
				setState(95);
				parameter();
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(96);
					match(T__0);
					setState(97);
					parameter();
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(105);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(PROC);
			setState(108);
			id();
			setState(109);
			match(LPAREN);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE))) != 0)) {
				{
				setState(110);
				parameter();
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(111);
					match(T__0);
					setState(112);
					parameter();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(120);
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
			setState(122);
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ParamsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				parameter();
				}
				break;
			case 2:
				_localctx = new ParamsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				parameter();
				setState(126);
				match(T__0);
				setState(127);
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
			setState(131);
			type();
			setState(132);
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
			setState(134);
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
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
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
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
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
		int _la;
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new BodyStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FUNC || _la==PROC) {
					{
					setState(136);
					funcProc();
					}
				}

				}
				break;
			case 2:
				_localctx = new BodyStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				funcProc();
				setState(140);
				body();
				}
				break;
			case 3:
				_localctx = new BodyStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				stmt();
				setState(143);
				body();
				}
				break;
			case 4:
				_localctx = new BodyCommentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				comment();
				setState(146);
				body();
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
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new StmtVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				varDecl();
				setState(151);
				match(END);
				}
				break;
			case 2:
				_localctx = new StmtAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				assign();
				setState(154);
				match(END);
				}
				break;
			case 3:
				_localctx = new StmtReturnExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				returnExpr();
				setState(157);
				match(END);
				}
				break;
			case 4:
				_localctx = new StmtFuncCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				funcCall();
				setState(160);
				match(END);
				}
				break;
			case 5:
				_localctx = new StmtWriteFuncContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				writeFunc();
				setState(163);
				match(END);
				}
				break;
			case 6:
				_localctx = new StmtReadFuncContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				readFunc();
				setState(166);
				match(END);
				}
				break;
			case 7:
				_localctx = new StmtIfStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(168);
				ifStmt();
				}
				break;
			case 8:
				_localctx = new StmtWhileExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(169);
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
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new VarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				type();
				setState(173);
				id();
				}
				break;
			case 2:
				_localctx = new VarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				type();
				setState(176);
				id();
				setState(177);
				match(ASSIGN);
				setState(178);
				expr(0);
				}
				break;
			case 3:
				_localctx = new VarDeclPinLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
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
	public static class ExprParenthesisedContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(HlmpParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HlmpParser.RPAREN, 0); }
		public ExprParenthesisedContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterExprParenthesised(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitExprParenthesised(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitExprParenthesised(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBinaryFloatContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(HlmpParser.DIVIDE, 0); }
		public TerminalNode MULT() { return getToken(HlmpParser.MULT, 0); }
		public TerminalNode PLUS() { return getToken(HlmpParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HlmpParser.MINUS, 0); }
		public TerminalNode MODULU() { return getToken(HlmpParser.MODULU, 0); }
		public ExprBinaryFloatContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterExprBinaryFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitExprBinaryFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitExprBinaryFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBinaryLogContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LOGAND() { return getToken(HlmpParser.LOGAND, 0); }
		public TerminalNode LOGOR() { return getToken(HlmpParser.LOGOR, 0); }
		public ExprBinaryLogContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterExprBinaryLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitExprBinaryLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitExprBinaryLog(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprOperandContext extends ExprContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
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
	public static class ExprBinaryBoolContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESSTHAN() { return getToken(HlmpParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(HlmpParser.GREATERTHAN, 0); }
		public TerminalNode EQUAL() { return getToken(HlmpParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(HlmpParser.NOTEQUAL, 0); }
		public ExprBinaryBoolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterExprBinaryBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitExprBinaryBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitExprBinaryBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprReadFuncContext extends ExprContext {
		public ReadFuncContext readFunc() {
			return getRuleContext(ReadFuncContext.class,0);
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
	public static class ExprUnaryNegContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEG() { return getToken(HlmpParser.NEG, 0); }
		public ExprUnaryNegContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterExprUnaryNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitExprUnaryNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitExprUnaryNeg(this);
			else return visitor.visitChildren(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new ExprOperandContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(184);
				operand();
				}
				break;
			case 2:
				{
				_localctx = new ExprReadFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				readFunc();
				}
				break;
			case 3:
				{
				_localctx = new ExprParenthesisedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(LPAREN);
				setState(187);
				expr(0);
				setState(188);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new ExprUnaryNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				((ExprUnaryNegContext)_localctx).op = match(NEG);
				setState(191);
				expr(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(212);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExprBinaryFloatContext(new ExprContext(_parentctx, _parentState));
						((ExprBinaryFloatContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(194);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(195);
						((ExprBinaryFloatContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIVIDE || _la==MULT) ) {
							((ExprBinaryFloatContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(196);
						((ExprBinaryFloatContext)_localctx).right = expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprBinaryFloatContext(new ExprContext(_parentctx, _parentState));
						((ExprBinaryFloatContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(197);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(198);
						((ExprBinaryFloatContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MODULU))) != 0)) ) {
							((ExprBinaryFloatContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(199);
						((ExprBinaryFloatContext)_localctx).right = expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprBinaryBoolContext(new ExprContext(_parentctx, _parentState));
						((ExprBinaryBoolContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(200);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(201);
						((ExprBinaryBoolContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LESSTHAN || _la==GREATERTHAN) ) {
							((ExprBinaryBoolContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(202);
						((ExprBinaryBoolContext)_localctx).right = expr(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprBinaryBoolContext(new ExprContext(_parentctx, _parentState));
						((ExprBinaryBoolContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(203);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(204);
						((ExprBinaryBoolContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExprBinaryBoolContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(205);
						((ExprBinaryBoolContext)_localctx).right = expr(4);
						}
						break;
					case 5:
						{
						_localctx = new ExprBinaryLogContext(new ExprContext(_parentctx, _parentState));
						((ExprBinaryLogContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(206);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(207);
						((ExprBinaryLogContext)_localctx).op = match(LOGAND);
						setState(208);
						((ExprBinaryLogContext)_localctx).right = expr(3);
						}
						break;
					case 6:
						{
						_localctx = new ExprBinaryLogContext(new ExprContext(_parentctx, _parentState));
						((ExprBinaryLogContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(209);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(210);
						((ExprBinaryLogContext)_localctx).op = match(LOGOR);
						setState(211);
						((ExprBinaryLogContext)_localctx).right = expr(2);
						}
						break;
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
	public static class OperandSFloatContext extends OperandContext {
		public TerminalNode SFLOAT() { return getToken(HlmpParser.SFLOAT, 0); }
		public OperandSFloatContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterOperandSFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitOperandSFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitOperandSFloat(this);
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

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operand);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new OperandIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				id();
				}
				break;
			case 2:
				_localctx = new OperandSFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(SFLOAT);
				}
				break;
			case 3:
				_localctx = new OperandBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(BOOL);
				}
				break;
			case 4:
				_localctx = new OperandFuncCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
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
		enterRule(_localctx, 28, RULE_readFunc);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ReadFuncPWMContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				id();
				setState(224);
				match(READPWM);
				setState(225);
				match(LPAREN);
				setState(226);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new ReadFuncAnalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				id();
				setState(229);
				match(READA);
				setState(230);
				match(LPAREN);
				setState(231);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new ReadFuncDigContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				id();
				setState(234);
				match(READD);
				setState(235);
				match(LPAREN);
				setState(236);
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
		enterRule(_localctx, 30, RULE_pinLiteral);
		try {
			_localctx = new PinLiteralDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(PINTYPE);
			setState(241);
			id();
			setState(242);
			match(LBRACE);
			setState(243);
			match(PINNUMBER);
			setState(244);
			match(T__0);
			setState(245);
			match(PINMODE);
			setState(246);
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
		enterRule(_localctx, 32, RULE_assign);
		try {
			_localctx = new AssignExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			id();
			setState(249);
			match(ASSIGN);
			setState(250);
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
		enterRule(_localctx, 34, RULE_returnExpr);
		try {
			_localctx = new ReturnExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(RETURN);
			setState(253);
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
		enterRule(_localctx, 36, RULE_funcCall);
		try {
			_localctx = new FunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			id();
			setState(256);
			match(LPAREN);
			setState(257);
			args();
			setState(258);
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
		enterRule(_localctx, 38, RULE_args);
		int _la;
		try {
			_localctx = new ArgumentsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEG) | (1L << SFLOAT) | (1L << LPAREN) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				setState(260);
				expr(0);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(261);
					match(T__0);
					setState(262);
					expr(0);
					}
					}
					setState(267);
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
		enterRule(_localctx, 40, RULE_writeFunc);
		try {
			_localctx = new WriteFuncDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			id();
			setState(271);
			match(WRITE);
			setState(272);
			match(LPAREN);
			setState(273);
			val();
			setState(274);
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
		public TerminalNode SFLOAT() { return getToken(HlmpParser.SFLOAT, 0); }
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
		enterRule(_localctx, 42, RULE_val);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HIGH:
				_localctx = new ValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(HIGH);
				}
				break;
			case LOW:
				_localctx = new ValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(LOW);
				}
				break;
			case SFLOAT:
				_localctx = new ValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(SFLOAT);
				}
				break;
			case ID:
				_localctx = new ValueIdContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				id();
				}
				break;
			case TOGGLE:
				_localctx = new ValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
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
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HlmpParser.RBRACE, 0); }
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
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
		enterRule(_localctx, 44, RULE_ifStmt);
		try {
			_localctx = new IfStmtDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(IF);
			setState(284);
			match(LPAREN);
			setState(285);
			expr(0);
			setState(286);
			match(RPAREN);
			setState(287);
			match(LBRACE);
			setState(288);
			body();
			setState(289);
			match(RBRACE);
			setState(290);
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
		enterRule(_localctx, 46, RULE_elseStmt);
		int _la;
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new ElseSTtmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(292);
					match(ELSE);
					setState(293);
					match(LBRACE);
					setState(294);
					body();
					setState(295);
					match(RBRACE);
					}
				}

				}
				break;
			case 2:
				_localctx = new ElseIfStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(ELSE);
				setState(300);
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
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HlmpParser.RBRACE, 0); }
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
		enterRule(_localctx, 48, RULE_whileExpr);
		try {
			_localctx = new WhileExprDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(WHILE);
			setState(304);
			match(LPAREN);
			setState(305);
			expr(0);
			setState(306);
			match(RPAREN);
			setState(307);
			match(LBRACE);
			setState(308);
			body();
			setState(309);
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
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HlmpParser.RBRACE, 0); }
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
		enterRule(_localctx, 50, RULE_setupDef);
		try {
			_localctx = new SetupDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(PROC);
			setState(312);
			match(SETUP);
			setState(313);
			match(LPAREN);
			setState(314);
			match(RPAREN);
			setState(315);
			match(LBRACE);
			setState(316);
			body();
			setState(317);
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
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HlmpParser.RBRACE, 0); }
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
		enterRule(_localctx, 52, RULE_loopDef);
		try {
			_localctx = new LoopDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(PROC);
			setState(320);
			match(LOOP);
			setState(321);
			match(LPAREN);
			setState(322);
			match(RPAREN);
			setState(323);
			match(LBRACE);
			setState(324);
			body();
			setState(325);
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
		enterRule(_localctx, 54, RULE_comment);
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
				_localctx = new CommentDelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(COMMENT);
				}
				break;
			case LINECOMMENT:
				_localctx = new CommentDelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00015\u014c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000<\b\u0000\u000b\u0000"+
		"\f\u0000=\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000C\b\u0000\u000b"+
		"\u0000\f\u0000D\u0003\u0000G\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001N\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002Z\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"c\b\u0003\n\u0003\f\u0003f\t\u0003\u0003\u0003h\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004r\b\u0004\n\u0004\f\u0004u\t\u0004\u0003\u0004w\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0082\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0003\t\u008a\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0095\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ab\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00b6\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c1\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00d5\b\f\n"+
		"\f\f\f\u00d8\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00de\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ef\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0108\b\u0013\n"+
		"\u0013\f\u0013\u010b\t\u0013\u0003\u0013\u010d\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u011a\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u012a\b\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u012e\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u014a\b\u001b\u0001"+
		"\u001b\u0000\u0001\u0018\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246\u0000\u0005\u0001"+
		"\u0000\u0002\u0005\u0001\u0000\t\n\u0002\u0000\u0007\b\u000b\u000b\u0001"+
		"\u0000\f\r\u0001\u0000\u000e\u000f\u015e\u0000F\u0001\u0000\u0000\u0000"+
		"\u0002M\u0001\u0000\u0000\u0000\u0004Y\u0001\u0000\u0000\u0000\u0006["+
		"\u0001\u0000\u0000\u0000\bk\u0001\u0000\u0000\u0000\nz\u0001\u0000\u0000"+
		"\u0000\f\u0081\u0001\u0000\u0000\u0000\u000e\u0083\u0001\u0000\u0000\u0000"+
		"\u0010\u0086\u0001\u0000\u0000\u0000\u0012\u0094\u0001\u0000\u0000\u0000"+
		"\u0014\u00aa\u0001\u0000\u0000\u0000\u0016\u00b5\u0001\u0000\u0000\u0000"+
		"\u0018\u00c0\u0001\u0000\u0000\u0000\u001a\u00dd\u0001\u0000\u0000\u0000"+
		"\u001c\u00ee\u0001\u0000\u0000\u0000\u001e\u00f0\u0001\u0000\u0000\u0000"+
		" \u00f8\u0001\u0000\u0000\u0000\"\u00fc\u0001\u0000\u0000\u0000$\u00ff"+
		"\u0001\u0000\u0000\u0000&\u010c\u0001\u0000\u0000\u0000(\u010e\u0001\u0000"+
		"\u0000\u0000*\u0119\u0001\u0000\u0000\u0000,\u011b\u0001\u0000\u0000\u0000"+
		".\u012d\u0001\u0000\u0000\u00000\u012f\u0001\u0000\u0000\u00002\u0137"+
		"\u0001\u0000\u0000\u00004\u013f\u0001\u0000\u0000\u00006\u0149\u0001\u0000"+
		"\u0000\u000089\u00032\u0019\u00009;\u00034\u001a\u0000:<\u0003\u0002\u0001"+
		"\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>G\u0001\u0000\u0000\u0000?@\u0003"+
		"4\u001a\u0000@B\u00032\u0019\u0000AC\u0003\u0002\u0001\u0000BA\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000EG\u0001\u0000\u0000\u0000F8\u0001\u0000\u0000\u0000"+
		"F?\u0001\u0000\u0000\u0000G\u0001\u0001\u0000\u0000\u0000HN\u0003\u0004"+
		"\u0002\u0000IJ\u0003\u0016\u000b\u0000JK\u0005 \u0000\u0000KN\u0001\u0000"+
		"\u0000\u0000LN\u00036\u001b\u0000MH\u0001\u0000\u0000\u0000MI\u0001\u0000"+
		"\u0000\u0000ML\u0001\u0000\u0000\u0000N\u0003\u0001\u0000\u0000\u0000"+
		"OP\u0003\u0006\u0003\u0000PQ\u0005\u001e\u0000\u0000QR\u0003\u0012\t\u0000"+
		"RS\u0005\u001f\u0000\u0000SZ\u0001\u0000\u0000\u0000TU\u0003\b\u0004\u0000"+
		"UV\u0005\u001e\u0000\u0000VW\u0003\u0012\t\u0000WX\u0005\u001f\u0000\u0000"+
		"XZ\u0001\u0000\u0000\u0000YO\u0001\u0000\u0000\u0000YT\u0001\u0000\u0000"+
		"\u0000Z\u0005\u0001\u0000\u0000\u0000[\\\u0005\u0014\u0000\u0000\\]\u0003"+
		"\u0010\b\u0000]^\u0003\n\u0005\u0000^g\u0005\u001c\u0000\u0000_d\u0003"+
		"\u000e\u0007\u0000`a\u0005\u0001\u0000\u0000ac\u0003\u000e\u0007\u0000"+
		"b`\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000g_\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000ij\u0005\u001d\u0000\u0000j\u0007\u0001\u0000\u0000"+
		"\u0000kl\u0005\u0015\u0000\u0000lm\u0003\n\u0005\u0000mv\u0005\u001c\u0000"+
		"\u0000ns\u0003\u000e\u0007\u0000op\u0005\u0001\u0000\u0000pr\u0003\u000e"+
		"\u0007\u0000qo\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000vn\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000xy\u0005\u001d\u0000\u0000y\t\u0001\u0000"+
		"\u0000\u0000z{\u00055\u0000\u0000{\u000b\u0001\u0000\u0000\u0000|\u0082"+
		"\u0003\u000e\u0007\u0000}~\u0003\u000e\u0007\u0000~\u007f\u0005\u0001"+
		"\u0000\u0000\u007f\u0080\u0003\f\u0006\u0000\u0080\u0082\u0001\u0000\u0000"+
		"\u0000\u0081|\u0001\u0000\u0000\u0000\u0081}\u0001\u0000\u0000\u0000\u0082"+
		"\r\u0001\u0000\u0000\u0000\u0083\u0084\u0003\u0010\b\u0000\u0084\u0085"+
		"\u0003\n\u0005\u0000\u0085\u000f\u0001\u0000\u0000\u0000\u0086\u0087\u0007"+
		"\u0000\u0000\u0000\u0087\u0011\u0001\u0000\u0000\u0000\u0088\u008a\u0003"+
		"\u0004\u0002\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u0095\u0001\u0000\u0000\u0000\u008b\u008c\u0003"+
		"\u0004\u0002\u0000\u008c\u008d\u0003\u0012\t\u0000\u008d\u0095\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0003\u0014\n\u0000\u008f\u0090\u0003\u0012\t"+
		"\u0000\u0090\u0095\u0001\u0000\u0000\u0000\u0091\u0092\u00036\u001b\u0000"+
		"\u0092\u0093\u0003\u0012\t\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094"+
		"\u0089\u0001\u0000\u0000\u0000\u0094\u008b\u0001\u0000\u0000\u0000\u0094"+
		"\u008e\u0001\u0000\u0000\u0000\u0094\u0091\u0001\u0000\u0000\u0000\u0095"+
		"\u0013\u0001\u0000\u0000\u0000\u0096\u0097\u0003\u0016\u000b\u0000\u0097"+
		"\u0098\u0005 \u0000\u0000\u0098\u00ab\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0003 \u0010\u0000\u009a\u009b\u0005 \u0000\u0000\u009b\u00ab\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0003\"\u0011\u0000\u009d\u009e\u0005 \u0000"+
		"\u0000\u009e\u00ab\u0001\u0000\u0000\u0000\u009f\u00a0\u0003$\u0012\u0000"+
		"\u00a0\u00a1\u0005 \u0000\u0000\u00a1\u00ab\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0003(\u0014\u0000\u00a3\u00a4\u0005 \u0000\u0000\u00a4\u00ab\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0003\u001c\u000e\u0000\u00a6\u00a7\u0005"+
		" \u0000\u0000\u00a7\u00ab\u0001\u0000\u0000\u0000\u00a8\u00ab\u0003,\u0016"+
		"\u0000\u00a9\u00ab\u00030\u0018\u0000\u00aa\u0096\u0001\u0000\u0000\u0000"+
		"\u00aa\u0099\u0001\u0000\u0000\u0000\u00aa\u009c\u0001\u0000\u0000\u0000"+
		"\u00aa\u009f\u0001\u0000\u0000\u0000\u00aa\u00a2\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a5\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u0015\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0003\u0010\b\u0000\u00ad\u00ae\u0003\n\u0005\u0000\u00ae"+
		"\u00b6\u0001\u0000\u0000\u0000\u00af\u00b0\u0003\u0010\b\u0000\u00b0\u00b1"+
		"\u0003\n\u0005\u0000\u00b1\u00b2\u0005!\u0000\u0000\u00b2\u00b3\u0003"+
		"\u0018\f\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b6\u0003\u001e"+
		"\u000f\u0000\u00b5\u00ac\u0001\u0000\u0000\u0000\u00b5\u00af\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u0017\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0006\f\uffff\uffff\u0000\u00b8\u00c1\u0003\u001a"+
		"\r\u0000\u00b9\u00c1\u0003\u001c\u000e\u0000\u00ba\u00bb\u0005\u001c\u0000"+
		"\u0000\u00bb\u00bc\u0003\u0018\f\u0000\u00bc\u00bd\u0005\u001d\u0000\u0000"+
		"\u00bd\u00c1\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0006\u0000\u0000"+
		"\u00bf\u00c1\u0003\u0018\f\u0007\u00c0\u00b7\u0001\u0000\u0000\u0000\u00c0"+
		"\u00b9\u0001\u0000\u0000\u0000\u00c0\u00ba\u0001\u0000\u0000\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c1\u00d6\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\n\u0006\u0000\u0000\u00c3\u00c4\u0007\u0001\u0000\u0000\u00c4\u00d5"+
		"\u0003\u0018\f\u0007\u00c5\u00c6\n\u0005\u0000\u0000\u00c6\u00c7\u0007"+
		"\u0002\u0000\u0000\u00c7\u00d5\u0003\u0018\f\u0006\u00c8\u00c9\n\u0004"+
		"\u0000\u0000\u00c9\u00ca\u0007\u0003\u0000\u0000\u00ca\u00d5\u0003\u0018"+
		"\f\u0005\u00cb\u00cc\n\u0003\u0000\u0000\u00cc\u00cd\u0007\u0004\u0000"+
		"\u0000\u00cd\u00d5\u0003\u0018\f\u0004\u00ce\u00cf\n\u0002\u0000\u0000"+
		"\u00cf\u00d0\u0005\u0010\u0000\u0000\u00d0\u00d5\u0003\u0018\f\u0003\u00d1"+
		"\u00d2\n\u0001\u0000\u0000\u00d2\u00d3\u0005\u0011\u0000\u0000\u00d3\u00d5"+
		"\u0003\u0018\f\u0002\u00d4\u00c2\u0001\u0000\u0000\u0000\u00d4\u00c5\u0001"+
		"\u0000\u0000\u0000\u00d4\u00c8\u0001\u0000\u0000\u0000\u00d4\u00cb\u0001"+
		"\u0000\u0000\u0000\u00d4\u00ce\u0001\u0000\u0000\u0000\u00d4\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u0019\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00de\u0003"+
		"\n\u0005\u0000\u00da\u00de\u0005\u0016\u0000\u0000\u00db\u00de\u0005&"+
		"\u0000\u0000\u00dc\u00de\u0003$\u0012\u0000\u00dd\u00d9\u0001\u0000\u0000"+
		"\u0000\u00dd\u00da\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000"+
		"\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u001b\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0003\n\u0005\u0000\u00e0\u00e1\u0005\u0019\u0000\u0000"+
		"\u00e1\u00e2\u0005\u001c\u0000\u0000\u00e2\u00e3\u0005\u001d\u0000\u0000"+
		"\u00e3\u00ef\u0001\u0000\u0000\u0000\u00e4\u00e5\u0003\n\u0005\u0000\u00e5"+
		"\u00e6\u0005\u001a\u0000\u0000\u00e6\u00e7\u0005\u001c\u0000\u0000\u00e7"+
		"\u00e8\u0005\u001d\u0000\u0000\u00e8\u00ef\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0003\n\u0005\u0000\u00ea\u00eb\u0005\u001b\u0000\u0000\u00eb\u00ec"+
		"\u0005\u001c\u0000\u0000\u00ec\u00ed\u0005\u001d\u0000\u0000\u00ed\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ee\u00df\u0001\u0000\u0000\u0000\u00ee\u00e4"+
		"\u0001\u0000\u0000\u0000\u00ee\u00e9\u0001\u0000\u0000\u0000\u00ef\u001d"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u0005\u0000\u0000\u00f1\u00f2"+
		"\u0003\n\u0005\u0000\u00f2\u00f3\u0005\u001e\u0000\u0000\u00f3\u00f4\u0005"+
		"0\u0000\u0000\u00f4\u00f5\u0005\u0001\u0000\u0000\u00f5\u00f6\u0005)\u0000"+
		"\u0000\u00f6\u00f7\u0005\u001f\u0000\u0000\u00f7\u001f\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0003\n\u0005\u0000\u00f9\u00fa\u0005!\u0000\u0000"+
		"\u00fa\u00fb\u0003\u0018\f\u0000\u00fb!\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0005.\u0000\u0000\u00fd\u00fe\u0003\u0018\f\u0000\u00fe#\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0003\n\u0005\u0000\u0100\u0101\u0005\u001c"+
		"\u0000\u0000\u0101\u0102\u0003&\u0013\u0000\u0102\u0103\u0005\u001d\u0000"+
		"\u0000\u0103%\u0001\u0000\u0000\u0000\u0104\u0109\u0003\u0018\f\u0000"+
		"\u0105\u0106\u0005\u0001\u0000\u0000\u0106\u0108\u0003\u0018\f\u0000\u0107"+
		"\u0105\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109"+
		"\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a"+
		"\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c"+
		"\u0104\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d"+
		"\'\u0001\u0000\u0000\u0000\u010e\u010f\u0003\n\u0005\u0000\u010f\u0110"+
		"\u0005\u0018\u0000\u0000\u0110\u0111\u0005\u001c\u0000\u0000\u0111\u0112"+
		"\u0003*\u0015\u0000\u0112\u0113\u0005\u001d\u0000\u0000\u0113)\u0001\u0000"+
		"\u0000\u0000\u0114\u011a\u0005#\u0000\u0000\u0115\u011a\u0005$\u0000\u0000"+
		"\u0116\u011a\u0005\u0016\u0000\u0000\u0117\u011a\u0003\n\u0005\u0000\u0118"+
		"\u011a\u0005%\u0000\u0000\u0119\u0114\u0001\u0000\u0000\u0000\u0119\u0115"+
		"\u0001\u0000\u0000\u0000\u0119\u0116\u0001\u0000\u0000\u0000\u0119\u0117"+
		"\u0001\u0000\u0000\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u011a+\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\u0005,\u0000\u0000\u011c\u011d\u0005\u001c"+
		"\u0000\u0000\u011d\u011e\u0003\u0018\f\u0000\u011e\u011f\u0005\u001d\u0000"+
		"\u0000\u011f\u0120\u0005\u001e\u0000\u0000\u0120\u0121\u0003\u0012\t\u0000"+
		"\u0121\u0122\u0005\u001f\u0000\u0000\u0122\u0123\u0003.\u0017\u0000\u0123"+
		"-\u0001\u0000\u0000\u0000\u0124\u0125\u0005-\u0000\u0000\u0125\u0126\u0005"+
		"\u001e\u0000\u0000\u0126\u0127\u0003\u0012\t\u0000\u0127\u0128\u0005\u001f"+
		"\u0000\u0000\u0128\u012a\u0001\u0000\u0000\u0000\u0129\u0124\u0001\u0000"+
		"\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012e\u0001\u0000"+
		"\u0000\u0000\u012b\u012c\u0005-\u0000\u0000\u012c\u012e\u0003,\u0016\u0000"+
		"\u012d\u0129\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000"+
		"\u012e/\u0001\u0000\u0000\u0000\u012f\u0130\u0005/\u0000\u0000\u0130\u0131"+
		"\u0005\u001c\u0000\u0000\u0131\u0132\u0003\u0018\f\u0000\u0132\u0133\u0005"+
		"\u001d\u0000\u0000\u0133\u0134\u0005\u001e\u0000\u0000\u0134\u0135\u0003"+
		"\u0012\t\u0000\u0135\u0136\u0005\u001f\u0000\u0000\u01361\u0001\u0000"+
		"\u0000\u0000\u0137\u0138\u0005\u0015\u0000\u0000\u0138\u0139\u0005\u0012"+
		"\u0000\u0000\u0139\u013a\u0005\u001c\u0000\u0000\u013a\u013b\u0005\u001d"+
		"\u0000\u0000\u013b\u013c\u0005\u001e\u0000\u0000\u013c\u013d\u0003\u0012"+
		"\t\u0000\u013d\u013e\u0005\u001f\u0000\u0000\u013e3\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u0005\u0015\u0000\u0000\u0140\u0141\u0005\u0013\u0000"+
		"\u0000\u0141\u0142\u0005\u001c\u0000\u0000\u0142\u0143\u0005\u001d\u0000"+
		"\u0000\u0143\u0144\u0005\u001e\u0000\u0000\u0144\u0145\u0003\u0012\t\u0000"+
		"\u0145\u0146\u0005\u001f\u0000\u0000\u01465\u0001\u0000\u0000\u0000\u0147"+
		"\u014a\u00051\u0000\u0000\u0148\u014a\u00052\u0000\u0000\u0149\u0147\u0001"+
		"\u0000\u0000\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u014a7\u0001\u0000"+
		"\u0000\u0000\u0019=DFMYdgsv\u0081\u0089\u0094\u00aa\u00b5\u00c0\u00d4"+
		"\u00d6\u00dd\u00ee\u0109\u010c\u0119\u0129\u012d\u0149";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}