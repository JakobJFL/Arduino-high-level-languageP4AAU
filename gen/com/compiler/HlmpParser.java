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
		LOGAND=16, LOGOR=17, RELATIONAL=18, ARITHMETIC=19, LOGICAL=20, SINT=21, 
		FLOAT=22, SETUP=23, LOOP=24, FUNC=25, PROC=26, WRITE=27, READPWM=28, READA=29, 
		READD=30, LPAREN=31, RPAREN=32, LBRACE=33, RBRACE=34, END=35, ASSIGN=36, 
		NEGATIVE=37, HIGH=38, LOW=39, PINMODE=40, TOGGLE=41, BOOL=42, TRUE=43, 
		FALSE=44, IF=45, ELSE=46, RETURN=47, WHILE=48, PINNUMBER=49, COMMENT=50, 
		LINECOMMENT=51, WS=52, NEWLINE=53, ID=54;
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
			"'/'", "'*'", "'%'", "'<'", "'>'", "'=='", "'!='", "'&&'", "'||'", null, 
			null, null, null, null, "'setup'", "'loop'", "'func '", "'proc '", "'.Write'", 
			"'.ReadPwm'", "'.ReadAnalog'", "'.ReadDigital'", "'('", "')'", "'{'", 
			"'}'", "';'", "'='", "'~'", "'HIGH'", "'LOW'", null, "'TOGGLE'", null, 
			"'true'", "'false'", "'if'", "'else'", "'return'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NUMTYPE", "BOOLTYPE", "PWMTYPE", "PINTYPE", "NEG", "PLUS", 
			"MINUS", "DIVIDE", "MULT", "MODULU", "LESSTHAN", "GREATERTHAN", "EQUAL", 
			"NOTEQUAL", "LOGAND", "LOGOR", "RELATIONAL", "ARITHMETIC", "LOGICAL", 
			"SINT", "FLOAT", "SETUP", "LOOP", "FUNC", "PROC", "WRITE", "READPWM", 
			"READA", "READD", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "END", "ASSIGN", 
			"NEGATIVE", "HIGH", "LOW", "PINMODE", "TOGGLE", "BOOL", "TRUE", "FALSE", 
			"IF", "ELSE", "RETURN", "WHILE", "PINNUMBER", "COMMENT", "LINECOMMENT", 
			"WS", "NEWLINE", "ID"
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
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				content();
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE) | (1L << FUNC) | (1L << PROC) | (1L << COMMENT) | (1L << LINECOMMENT))) != 0) );
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
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new CntFuncProcContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				funcProc();
				}
				break;
			case 2:
				_localctx = new StandardFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				setupDef();
				}
				break;
			case 3:
				_localctx = new StandardFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				loopDef();
				}
				break;
			case 4:
				_localctx = new CntvarDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				varDecl();
				setState(65);
				match(END);
				}
				break;
			case 5:
				_localctx = new CntCommentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
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
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
				_localctx = new FuncDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				funcHead();
				setState(71);
				match(LBRACE);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << COMMENT) | (1L << LINECOMMENT) | (1L << ID))) != 0)) {
					{
					{
					setState(72);
					body();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(78);
				match(RBRACE);
				}
				break;
			case PROC:
				_localctx = new ProcDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				procHead();
				setState(81);
				match(LBRACE);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << COMMENT) | (1L << LINECOMMENT) | (1L << ID))) != 0)) {
					{
					{
					setState(82);
					body();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88);
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
			setState(92);
			match(FUNC);
			setState(93);
			type();
			setState(94);
			id();
			setState(95);
			match(LPAREN);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE))) != 0)) {
				{
				setState(96);
				parameter();
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(97);
					match(T__0);
					setState(98);
					parameter();
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(106);
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
			setState(108);
			match(PROC);
			setState(109);
			id();
			setState(110);
			match(LPAREN);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE))) != 0)) {
				{
				setState(111);
				parameter();
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(112);
					match(T__0);
					setState(113);
					parameter();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(121);
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
			setState(123);
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
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ParamsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				parameter();
				}
				break;
			case 2:
				_localctx = new ParamsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				parameter();
				setState(127);
				match(T__0);
				setState(128);
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
			setState(132);
			type();
			setState(133);
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
			setState(135);
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
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case PROC:
				_localctx = new BodyStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
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
				setState(138);
				stmt();
				}
				break;
			case COMMENT:
			case LINECOMMENT:
				_localctx = new BodyCommentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new StmtVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				varDecl();
				setState(143);
				match(END);
				}
				break;
			case 2:
				_localctx = new StmtAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				assign();
				setState(146);
				match(END);
				}
				break;
			case 3:
				_localctx = new StmtReturnExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				returnExpr();
				setState(149);
				match(END);
				}
				break;
			case 4:
				_localctx = new StmtFuncCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				funcCall();
				setState(152);
				match(END);
				}
				break;
			case 5:
				_localctx = new StmtWriteFuncContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				writeFunc();
				setState(155);
				match(END);
				}
				break;
			case 6:
				_localctx = new StmtReadFuncContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				readFunc();
				setState(158);
				match(END);
				}
				break;
			case 7:
				_localctx = new StmtIfStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(160);
				ifStmt();
				}
				break;
			case 8:
				_localctx = new StmtWhileExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(161);
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
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new VarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				type();
				setState(165);
				id();
				}
				break;
			case 2:
				_localctx = new VarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				type();
				setState(168);
				id();
				setState(169);
				match(ASSIGN);
				setState(170);
				expr(0);
				}
				break;
			case 3:
				_localctx = new VarDeclPinLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
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
	public static class ExprBinaryOpContext extends ExprContext {
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
		public TerminalNode LESSTHAN() { return getToken(HlmpParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(HlmpParser.GREATERTHAN, 0); }
		public TerminalNode EQUAL() { return getToken(HlmpParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(HlmpParser.NOTEQUAL, 0); }
		public TerminalNode LOGAND() { return getToken(HlmpParser.LOGAND, 0); }
		public TerminalNode LOGOR() { return getToken(HlmpParser.LOGOR, 0); }
		public ExprBinaryOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterExprBinaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitExprBinaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitExprBinaryOp(this);
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
	public static class ExprUnaryOpContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEG() { return getToken(HlmpParser.NEG, 0); }
		public ExprUnaryOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterExprUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitExprUnaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitExprUnaryOp(this);
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
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new ExprOperandContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(176);
				operand();
				}
				break;
			case 2:
				{
				_localctx = new ExprReadFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				readFunc();
				}
				break;
			case 3:
				{
				_localctx = new ExprParenthesisedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(LPAREN);
				setState(179);
				expr(0);
				setState(180);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new ExprUnaryOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				((ExprUnaryOpContext)_localctx).op = match(NEG);
				setState(183);
				expr(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(204);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprBinaryOpContext(new ExprContext(_parentctx, _parentState));
						((ExprBinaryOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(187);
						((ExprBinaryOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIVIDE || _la==MULT) ) {
							((ExprBinaryOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(188);
						((ExprBinaryOpContext)_localctx).right = expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprBinaryOpContext(new ExprContext(_parentctx, _parentState));
						((ExprBinaryOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(190);
						((ExprBinaryOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MODULU))) != 0)) ) {
							((ExprBinaryOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(191);
						((ExprBinaryOpContext)_localctx).right = expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprBinaryOpContext(new ExprContext(_parentctx, _parentState));
						((ExprBinaryOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(193);
						((ExprBinaryOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LESSTHAN || _la==GREATERTHAN) ) {
							((ExprBinaryOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(194);
						((ExprBinaryOpContext)_localctx).right = expr(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprBinaryOpContext(new ExprContext(_parentctx, _parentState));
						((ExprBinaryOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(196);
						((ExprBinaryOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExprBinaryOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(197);
						((ExprBinaryOpContext)_localctx).right = expr(4);
						}
						break;
					case 5:
						{
						_localctx = new ExprBinaryOpContext(new ExprContext(_parentctx, _parentState));
						((ExprBinaryOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(198);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(199);
						((ExprBinaryOpContext)_localctx).op = match(LOGAND);
						setState(200);
						((ExprBinaryOpContext)_localctx).right = expr(3);
						}
						break;
					case 6:
						{
						_localctx = new ExprBinaryOpContext(new ExprContext(_parentctx, _parentState));
						((ExprBinaryOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(201);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(202);
						((ExprBinaryOpContext)_localctx).op = match(LOGOR);
						setState(203);
						((ExprBinaryOpContext)_localctx).right = expr(2);
						}
						break;
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public TerminalNode SINT() { return getToken(HlmpParser.SINT, 0); }
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
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new OperandIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				id();
				}
				break;
			case 2:
				_localctx = new OperandSIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(SINT);
				}
				break;
			case 3:
				_localctx = new OperandBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(BOOL);
				}
				break;
			case 4:
				_localctx = new OperandFuncCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
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
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ReadFuncPWMContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				id();
				setState(216);
				match(READPWM);
				setState(217);
				match(LPAREN);
				setState(218);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new ReadFuncAnalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				id();
				setState(221);
				match(READA);
				setState(222);
				match(LPAREN);
				setState(223);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new ReadFuncDigContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				id();
				setState(226);
				match(READD);
				setState(227);
				match(LPAREN);
				setState(228);
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
			setState(232);
			match(PINTYPE);
			setState(233);
			id();
			setState(234);
			match(LBRACE);
			setState(235);
			match(PINNUMBER);
			setState(236);
			match(T__0);
			setState(237);
			match(PINMODE);
			setState(238);
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
			setState(240);
			id();
			setState(241);
			match(ASSIGN);
			setState(242);
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
			setState(244);
			match(RETURN);
			setState(245);
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
			setState(247);
			id();
			setState(248);
			match(LPAREN);
			setState(249);
			args();
			setState(250);
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
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEG) | (1L << SINT) | (1L << LPAREN) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				setState(252);
				expr(0);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(253);
					match(T__0);
					setState(254);
					expr(0);
					}
					}
					setState(259);
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
			setState(262);
			id();
			setState(263);
			match(WRITE);
			setState(264);
			match(LPAREN);
			setState(265);
			val();
			setState(266);
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
		public TerminalNode SINT() { return getToken(HlmpParser.SINT, 0); }
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
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HIGH:
				_localctx = new ValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(HIGH);
				}
				break;
			case LOW:
				_localctx = new ValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(LOW);
				}
				break;
			case SINT:
				_localctx = new ValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				match(SINT);
				}
				break;
			case ID:
				_localctx = new ValueIdContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				id();
				}
				break;
			case TOGGLE:
				_localctx = new ValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
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
		enterRule(_localctx, 44, RULE_ifStmt);
		int _la;
		try {
			_localctx = new IfStmtDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(IF);
			setState(276);
			match(LPAREN);
			setState(277);
			expr(0);
			setState(278);
			match(RPAREN);
			setState(279);
			match(LBRACE);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << COMMENT) | (1L << LINECOMMENT) | (1L << ID))) != 0)) {
				{
				{
				setState(280);
				body();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
			match(RBRACE);
			setState(287);
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
		public TerminalNode RBRACE() { return getToken(HlmpParser.RBRACE, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
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
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new ElseSTtmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(289);
					match(ELSE);
					setState(290);
					match(LBRACE);
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << COMMENT) | (1L << LINECOMMENT) | (1L << ID))) != 0)) {
						{
						{
						setState(291);
						body();
						}
						}
						setState(296);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(297);
					match(RBRACE);
					}
				}

				}
				break;
			case 2:
				_localctx = new ElseIfStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(ELSE);
				setState(301);
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
		enterRule(_localctx, 48, RULE_whileExpr);
		int _la;
		try {
			_localctx = new WhileExprDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(WHILE);
			setState(305);
			match(LPAREN);
			setState(306);
			expr(0);
			setState(307);
			match(RPAREN);
			setState(308);
			match(LBRACE);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << COMMENT) | (1L << LINECOMMENT) | (1L << ID))) != 0)) {
				{
				{
				setState(309);
				body();
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
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
		enterRule(_localctx, 50, RULE_setupDef);
		int _la;
		try {
			_localctx = new SetupDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(PROC);
			setState(318);
			match(SETUP);
			setState(319);
			match(LPAREN);
			setState(320);
			match(RPAREN);
			setState(321);
			match(LBRACE);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << COMMENT) | (1L << LINECOMMENT) | (1L << ID))) != 0)) {
				{
				{
				setState(322);
				body();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
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
		enterRule(_localctx, 52, RULE_loopDef);
		int _la;
		try {
			_localctx = new LoopDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(PROC);
			setState(331);
			match(LOOP);
			setState(332);
			match(LPAREN);
			setState(333);
			match(RPAREN);
			setState(334);
			match(LBRACE);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMTYPE) | (1L << BOOLTYPE) | (1L << PWMTYPE) | (1L << PINTYPE) | (1L << FUNC) | (1L << PROC) | (1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << COMMENT) | (1L << LINECOMMENT) | (1L << ID))) != 0)) {
				{
				{
				setState(335);
				body();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
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
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
				_localctx = new CommentDelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(COMMENT);
				}
				break;
			case LINECOMMENT:
				_localctx = new CommentDelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
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
		"\u0004\u00016\u015c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0004\u0000:\b\u0000\u000b\u0000\f\u0000;\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001E\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002J\b\u0002"+
		"\n\u0002\f\u0002M\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002T\b\u0002\n\u0002\f\u0002W\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002[\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003d\b\u0003"+
		"\n\u0003\f\u0003g\t\u0003\u0003\u0003i\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004s\b\u0004\n\u0004\f\u0004v\t\u0004\u0003\u0004x\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0083\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u008d"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00a3\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00ae\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00b9\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00cd\b\f\n\f\f\f\u00d0"+
		"\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00d6\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00e7\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0100\b\u0013\n\u0013\f\u0013"+
		"\u0103\t\u0013\u0003\u0013\u0105\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0112\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u011a"+
		"\b\u0016\n\u0016\f\u0016\u011d\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0125\b\u0017\n\u0017"+
		"\f\u0017\u0128\t\u0017\u0001\u0017\u0003\u0017\u012b\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u012f\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0137\b\u0018\n\u0018"+
		"\f\u0018\u013a\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0144\b\u0019"+
		"\n\u0019\f\u0019\u0147\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0151"+
		"\b\u001a\n\u001a\f\u001a\u0154\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u015a\b\u001b\u0001\u001b\u0000\u0001\u0018\u001c"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.0246\u0000\u0005\u0001\u0000\u0002\u0005\u0001\u0000"+
		"\t\n\u0002\u0000\u0007\b\u000b\u000b\u0001\u0000\f\r\u0001\u0000\u000e"+
		"\u000f\u0173\u00009\u0001\u0000\u0000\u0000\u0002D\u0001\u0000\u0000\u0000"+
		"\u0004Z\u0001\u0000\u0000\u0000\u0006\\\u0001\u0000\u0000\u0000\bl\u0001"+
		"\u0000\u0000\u0000\n{\u0001\u0000\u0000\u0000\f\u0082\u0001\u0000\u0000"+
		"\u0000\u000e\u0084\u0001\u0000\u0000\u0000\u0010\u0087\u0001\u0000\u0000"+
		"\u0000\u0012\u008c\u0001\u0000\u0000\u0000\u0014\u00a2\u0001\u0000\u0000"+
		"\u0000\u0016\u00ad\u0001\u0000\u0000\u0000\u0018\u00b8\u0001\u0000\u0000"+
		"\u0000\u001a\u00d5\u0001\u0000\u0000\u0000\u001c\u00e6\u0001\u0000\u0000"+
		"\u0000\u001e\u00e8\u0001\u0000\u0000\u0000 \u00f0\u0001\u0000\u0000\u0000"+
		"\"\u00f4\u0001\u0000\u0000\u0000$\u00f7\u0001\u0000\u0000\u0000&\u0104"+
		"\u0001\u0000\u0000\u0000(\u0106\u0001\u0000\u0000\u0000*\u0111\u0001\u0000"+
		"\u0000\u0000,\u0113\u0001\u0000\u0000\u0000.\u012e\u0001\u0000\u0000\u0000"+
		"0\u0130\u0001\u0000\u0000\u00002\u013d\u0001\u0000\u0000\u00004\u014a"+
		"\u0001\u0000\u0000\u00006\u0159\u0001\u0000\u0000\u00008:\u0003\u0002"+
		"\u0001\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\u0001\u0001\u0000\u0000"+
		"\u0000=E\u0003\u0004\u0002\u0000>E\u00032\u0019\u0000?E\u00034\u001a\u0000"+
		"@A\u0003\u0016\u000b\u0000AB\u0005#\u0000\u0000BE\u0001\u0000\u0000\u0000"+
		"CE\u00036\u001b\u0000D=\u0001\u0000\u0000\u0000D>\u0001\u0000\u0000\u0000"+
		"D?\u0001\u0000\u0000\u0000D@\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000"+
		"\u0000E\u0003\u0001\u0000\u0000\u0000FG\u0003\u0006\u0003\u0000GK\u0005"+
		"!\u0000\u0000HJ\u0003\u0012\t\u0000IH\u0001\u0000\u0000\u0000JM\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NO\u0005\"\u0000\u0000"+
		"O[\u0001\u0000\u0000\u0000PQ\u0003\b\u0004\u0000QU\u0005!\u0000\u0000"+
		"RT\u0003\u0012\t\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000XY\u0005\"\u0000\u0000Y[\u0001\u0000\u0000"+
		"\u0000ZF\u0001\u0000\u0000\u0000ZP\u0001\u0000\u0000\u0000[\u0005\u0001"+
		"\u0000\u0000\u0000\\]\u0005\u0019\u0000\u0000]^\u0003\u0010\b\u0000^_"+
		"\u0003\n\u0005\u0000_h\u0005\u001f\u0000\u0000`e\u0003\u000e\u0007\u0000"+
		"ab\u0005\u0001\u0000\u0000bd\u0003\u000e\u0007\u0000ca\u0001\u0000\u0000"+
		"\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000h`\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jk\u0005 \u0000\u0000k\u0007\u0001\u0000\u0000\u0000lm\u0005\u001a\u0000"+
		"\u0000mn\u0003\n\u0005\u0000nw\u0005\u001f\u0000\u0000ot\u0003\u000e\u0007"+
		"\u0000pq\u0005\u0001\u0000\u0000qs\u0003\u000e\u0007\u0000rp\u0001\u0000"+
		"\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"wo\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000yz\u0005 \u0000\u0000z\t\u0001\u0000\u0000\u0000{|\u00056\u0000"+
		"\u0000|\u000b\u0001\u0000\u0000\u0000}\u0083\u0003\u000e\u0007\u0000~"+
		"\u007f\u0003\u000e\u0007\u0000\u007f\u0080\u0005\u0001\u0000\u0000\u0080"+
		"\u0081\u0003\f\u0006\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082}"+
		"\u0001\u0000\u0000\u0000\u0082~\u0001\u0000\u0000\u0000\u0083\r\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0003\u0010\b\u0000\u0085\u0086\u0003\n"+
		"\u0005\u0000\u0086\u000f\u0001\u0000\u0000\u0000\u0087\u0088\u0007\u0000"+
		"\u0000\u0000\u0088\u0011\u0001\u0000\u0000\u0000\u0089\u008d\u0003\u0004"+
		"\u0002\u0000\u008a\u008d\u0003\u0014\n\u0000\u008b\u008d\u00036\u001b"+
		"\u0000\u008c\u0089\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000"+
		"\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0013\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0003\u0016\u000b\u0000\u008f\u0090\u0005#\u0000\u0000"+
		"\u0090\u00a3\u0001\u0000\u0000\u0000\u0091\u0092\u0003 \u0010\u0000\u0092"+
		"\u0093\u0005#\u0000\u0000\u0093\u00a3\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0003\"\u0011\u0000\u0095\u0096\u0005#\u0000\u0000\u0096\u00a3\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0003$\u0012\u0000\u0098\u0099\u0005#\u0000"+
		"\u0000\u0099\u00a3\u0001\u0000\u0000\u0000\u009a\u009b\u0003(\u0014\u0000"+
		"\u009b\u009c\u0005#\u0000\u0000\u009c\u00a3\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0003\u001c\u000e\u0000\u009e\u009f\u0005#\u0000\u0000\u009f\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a3\u0003,\u0016\u0000\u00a1\u00a3\u0003"+
		"0\u0018\u0000\u00a2\u008e\u0001\u0000\u0000\u0000\u00a2\u0091\u0001\u0000"+
		"\u0000\u0000\u00a2\u0094\u0001\u0000\u0000\u0000\u00a2\u0097\u0001\u0000"+
		"\u0000\u0000\u00a2\u009a\u0001\u0000\u0000\u0000\u00a2\u009d\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u0015\u0001\u0000\u0000\u0000\u00a4\u00a5\u0003\u0010"+
		"\b\u0000\u00a5\u00a6\u0003\n\u0005\u0000\u00a6\u00ae\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0003\u0010\b\u0000\u00a8\u00a9\u0003\n\u0005\u0000"+
		"\u00a9\u00aa\u0005$\u0000\u0000\u00aa\u00ab\u0003\u0018\f\u0000\u00ab"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ac\u00ae\u0003\u001e\u000f\u0000\u00ad"+
		"\u00a4\u0001\u0000\u0000\u0000\u00ad\u00a7\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ae\u0017\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0006\f\uffff\uffff\u0000\u00b0\u00b9\u0003\u001a\r\u0000\u00b1"+
		"\u00b9\u0003\u001c\u000e\u0000\u00b2\u00b3\u0005\u001f\u0000\u0000\u00b3"+
		"\u00b4\u0003\u0018\f\u0000\u00b4\u00b5\u0005 \u0000\u0000\u00b5\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0006\u0000\u0000\u00b7\u00b9"+
		"\u0003\u0018\f\u0007\u00b8\u00af\u0001\u0000\u0000\u0000\u00b8\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b2\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ce\u0001\u0000\u0000\u0000\u00ba\u00bb\n\u0006"+
		"\u0000\u0000\u00bb\u00bc\u0007\u0001\u0000\u0000\u00bc\u00cd\u0003\u0018"+
		"\f\u0007\u00bd\u00be\n\u0005\u0000\u0000\u00be\u00bf\u0007\u0002\u0000"+
		"\u0000\u00bf\u00cd\u0003\u0018\f\u0006\u00c0\u00c1\n\u0004\u0000\u0000"+
		"\u00c1\u00c2\u0007\u0003\u0000\u0000\u00c2\u00cd\u0003\u0018\f\u0005\u00c3"+
		"\u00c4\n\u0003\u0000\u0000\u00c4\u00c5\u0007\u0004\u0000\u0000\u00c5\u00cd"+
		"\u0003\u0018\f\u0004\u00c6\u00c7\n\u0002\u0000\u0000\u00c7\u00c8\u0005"+
		"\u0010\u0000\u0000\u00c8\u00cd\u0003\u0018\f\u0003\u00c9\u00ca\n\u0001"+
		"\u0000\u0000\u00ca\u00cb\u0005\u0011\u0000\u0000\u00cb\u00cd\u0003\u0018"+
		"\f\u0002\u00cc\u00ba\u0001\u0000\u0000\u0000\u00cc\u00bd\u0001\u0000\u0000"+
		"\u0000\u00cc\u00c0\u0001\u0000\u0000\u0000\u00cc\u00c3\u0001\u0000\u0000"+
		"\u0000\u00cc\u00c6\u0001\u0000\u0000\u0000\u00cc\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u0019\u0001\u0000\u0000"+
		"\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d6\u0003\n\u0005\u0000"+
		"\u00d2\u00d6\u0005\u0015\u0000\u0000\u00d3\u00d6\u0005*\u0000\u0000\u00d4"+
		"\u00d6\u0003$\u0012\u0000\u00d5\u00d1\u0001\u0000\u0000\u0000\u00d5\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d6\u001b\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0003\n\u0005\u0000\u00d8\u00d9\u0005\u001c\u0000\u0000\u00d9\u00da\u0005"+
		"\u001f\u0000\u0000\u00da\u00db\u0005 \u0000\u0000\u00db\u00e7\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0003\n\u0005\u0000\u00dd\u00de\u0005\u001d\u0000"+
		"\u0000\u00de\u00df\u0005\u001f\u0000\u0000\u00df\u00e0\u0005 \u0000\u0000"+
		"\u00e0\u00e7\u0001\u0000\u0000\u0000\u00e1\u00e2\u0003\n\u0005\u0000\u00e2"+
		"\u00e3\u0005\u001e\u0000\u0000\u00e3\u00e4\u0005\u001f\u0000\u0000\u00e4"+
		"\u00e5\u0005 \u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00d7"+
		"\u0001\u0000\u0000\u0000\u00e6\u00dc\u0001\u0000\u0000\u0000\u00e6\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e7\u001d\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0005\u0005\u0000\u0000\u00e9\u00ea\u0003\n\u0005\u0000\u00ea\u00eb\u0005"+
		"!\u0000\u0000\u00eb\u00ec\u00051\u0000\u0000\u00ec\u00ed\u0005\u0001\u0000"+
		"\u0000\u00ed\u00ee\u0005(\u0000\u0000\u00ee\u00ef\u0005\"\u0000\u0000"+
		"\u00ef\u001f\u0001\u0000\u0000\u0000\u00f0\u00f1\u0003\n\u0005\u0000\u00f1"+
		"\u00f2\u0005$\u0000\u0000\u00f2\u00f3\u0003\u0018\f\u0000\u00f3!\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0005/\u0000\u0000\u00f5\u00f6\u0003\u0018"+
		"\f\u0000\u00f6#\u0001\u0000\u0000\u0000\u00f7\u00f8\u0003\n\u0005\u0000"+
		"\u00f8\u00f9\u0005\u001f\u0000\u0000\u00f9\u00fa\u0003&\u0013\u0000\u00fa"+
		"\u00fb\u0005 \u0000\u0000\u00fb%\u0001\u0000\u0000\u0000\u00fc\u0101\u0003"+
		"\u0018\f\u0000\u00fd\u00fe\u0005\u0001\u0000\u0000\u00fe\u0100\u0003\u0018"+
		"\f\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000\u0000"+
		"\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000"+
		"\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000"+
		"\u0000\u0104\u00fc\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000"+
		"\u0000\u0105\'\u0001\u0000\u0000\u0000\u0106\u0107\u0003\n\u0005\u0000"+
		"\u0107\u0108\u0005\u001b\u0000\u0000\u0108\u0109\u0005\u001f\u0000\u0000"+
		"\u0109\u010a\u0003*\u0015\u0000\u010a\u010b\u0005 \u0000\u0000\u010b)"+
		"\u0001\u0000\u0000\u0000\u010c\u0112\u0005&\u0000\u0000\u010d\u0112\u0005"+
		"\'\u0000\u0000\u010e\u0112\u0005\u0015\u0000\u0000\u010f\u0112\u0003\n"+
		"\u0005\u0000\u0110\u0112\u0005)\u0000\u0000\u0111\u010c\u0001\u0000\u0000"+
		"\u0000\u0111\u010d\u0001\u0000\u0000\u0000\u0111\u010e\u0001\u0000\u0000"+
		"\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0110\u0001\u0000\u0000"+
		"\u0000\u0112+\u0001\u0000\u0000\u0000\u0113\u0114\u0005-\u0000\u0000\u0114"+
		"\u0115\u0005\u001f\u0000\u0000\u0115\u0116\u0003\u0018\f\u0000\u0116\u0117"+
		"\u0005 \u0000\u0000\u0117\u011b\u0005!\u0000\u0000\u0118\u011a\u0003\u0012"+
		"\t\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000"+
		"\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000"+
		"\u0000\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000"+
		"\u0000\u011e\u011f\u0005\"\u0000\u0000\u011f\u0120\u0003.\u0017\u0000"+
		"\u0120-\u0001\u0000\u0000\u0000\u0121\u0122\u0005.\u0000\u0000\u0122\u0126"+
		"\u0005!\u0000\u0000\u0123\u0125\u0003\u0012\t\u0000\u0124\u0123\u0001"+
		"\u0000\u0000\u0000\u0125\u0128\u0001\u0000\u0000\u0000\u0126\u0124\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0129\u0001"+
		"\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0129\u012b\u0005"+
		"\"\u0000\u0000\u012a\u0121\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000"+
		"\u0000\u0000\u012b\u012f\u0001\u0000\u0000\u0000\u012c\u012d\u0005.\u0000"+
		"\u0000\u012d\u012f\u0003,\u0016\u0000\u012e\u012a\u0001\u0000\u0000\u0000"+
		"\u012e\u012c\u0001\u0000\u0000\u0000\u012f/\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u00050\u0000\u0000\u0131\u0132\u0005\u001f\u0000\u0000\u0132\u0133"+
		"\u0003\u0018\f\u0000\u0133\u0134\u0005 \u0000\u0000\u0134\u0138\u0005"+
		"!\u0000\u0000\u0135\u0137\u0003\u0012\t\u0000\u0136\u0135\u0001\u0000"+
		"\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013b\u0001\u0000"+
		"\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u013c\u0005\"\u0000"+
		"\u0000\u013c1\u0001\u0000\u0000\u0000\u013d\u013e\u0005\u001a\u0000\u0000"+
		"\u013e\u013f\u0005\u0017\u0000\u0000\u013f\u0140\u0005\u001f\u0000\u0000"+
		"\u0140\u0141\u0005 \u0000\u0000\u0141\u0145\u0005!\u0000\u0000\u0142\u0144"+
		"\u0003\u0012\t\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144\u0147\u0001"+
		"\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001"+
		"\u0000\u0000\u0000\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u0145\u0001"+
		"\u0000\u0000\u0000\u0148\u0149\u0005\"\u0000\u0000\u01493\u0001\u0000"+
		"\u0000\u0000\u014a\u014b\u0005\u001a\u0000\u0000\u014b\u014c\u0005\u0018"+
		"\u0000\u0000\u014c\u014d\u0005\u001f\u0000\u0000\u014d\u014e\u0005 \u0000"+
		"\u0000\u014e\u0152\u0005!\u0000\u0000\u014f\u0151\u0003\u0012\t\u0000"+
		"\u0150\u014f\u0001\u0000\u0000\u0000\u0151\u0154\u0001\u0000\u0000\u0000"+
		"\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000"+
		"\u0153\u0155\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000"+
		"\u0155\u0156\u0005\"\u0000\u0000\u01565\u0001\u0000\u0000\u0000\u0157"+
		"\u015a\u00052\u0000\u0000\u0158\u015a\u00053\u0000\u0000\u0159\u0157\u0001"+
		"\u0000\u0000\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u015a7\u0001\u0000"+
		"\u0000\u0000\u001d;DKUZehtw\u0082\u008c\u00a2\u00ad\u00b8\u00cc\u00ce"+
		"\u00d5\u00e6\u0101\u0104\u0111\u011b\u0126\u012a\u012e\u0138\u0145\u0152"+
		"\u0159";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}