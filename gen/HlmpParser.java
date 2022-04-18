// Generated from C:/Users/JFL/Documents/GitHub/Arduino-high-level-languageP4AAU/src/main/java\Hlmp.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HlmpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, TYPE=3, PIN=4, RELATIONAL=5, ARITHMETIC=6, LOGICAL=7, 
		NEG=8, PLUS=9, MINUS=10, DIVIDE=11, MULT=12, MODULU=13, LESSTHAN=14, GREATERTHAN=15, 
		EQUAL=16, NOTEQUAL=17, LOGAND=18, LOGOR=19, SETUP=20, LOOP=21, FUNC=22, 
		WRITE=23, READPWM=24, READA=25, READD=26, LPAREN=27, RPAREN=28, LBRACE=29, 
		RBRACE=30, END=31, ASSIGN=32, NEGATIVE=33, HIGH=34, LOW=35, PINMODE=36, 
		TOGGLE=37, BOOL=38, IF=39, ELSE=40, RETURN=41, WHILE=42, PINNUMBER=43, 
		INT=44, ID=45, COMMENT=46, LINECOMMENT=47, WS=48, NEWLINE=49;
	public static final int
		RULE_program = 0, RULE_content = 1, RULE_funcDef = 2, RULE_head = 3, RULE_id = 4, 
		RULE_parameters = 5, RULE_parameter = 6, RULE_body = 7, RULE_stmt = 8, 
		RULE_varDecl = 9, RULE_expr = 10, RULE_operand = 11, RULE_sInt = 12, RULE_operator = 13, 
		RULE_relational = 14, RULE_readFunc = 15, RULE_pinLiteral = 16, RULE_assign = 17, 
		RULE_returnExpr = 18, RULE_funcCall = 19, RULE_call = 20, RULE_args = 21, 
		RULE_writeFunc = 22, RULE_val = 23, RULE_ifStmt = 24, RULE_elseStmt = 25, 
		RULE_whileExpr = 26, RULE_setupDef = 27, RULE_loopDef = 28, RULE_comment = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "content", "funcDef", "head", "id", "parameters", "parameter", 
			"body", "stmt", "varDecl", "expr", "operand", "sInt", "operator", "relational", 
			"readFunc", "pinLiteral", "assign", "returnExpr", "funcCall", "call", 
			"args", "writeFunc", "val", "ifStmt", "elseStmt", "whileExpr", "setupDef", 
			"loopDef", "comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'.'", null, "'Pin '", null, null, null, "'!'", "'+'", "'-'", 
			"'/'", "'*'", "'%'", "'<'", "'>'", "'=='", "'!='", "'&&'", "'||'", "'setup'", 
			"'loop'", "'func '", "'.Write'", "'.ReadPwm'", "'.ReadAnalog'", "'.ReadDigital'", 
			"'('", "')'", "'{'", "'}'", "';'", "'='", "'~'", "'HIGH'", "'LOW'", null, 
			"'TOGGLE'", null, "'if'", "'else'", "'return'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "TYPE", "PIN", "RELATIONAL", "ARITHMETIC", "LOGICAL", 
			"NEG", "PLUS", "MINUS", "DIVIDE", "MULT", "MODULU", "LESSTHAN", "GREATERTHAN", 
			"EQUAL", "NOTEQUAL", "LOGAND", "LOGOR", "SETUP", "LOOP", "FUNC", "WRITE", 
			"READPWM", "READA", "READD", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"END", "ASSIGN", "NEGATIVE", "HIGH", "LOW", "PINMODE", "TOGGLE", "BOOL", 
			"IF", "ELSE", "RETURN", "WHILE", "PINNUMBER", "INT", "ID", "COMMENT", 
			"LINECOMMENT", "WS", "NEWLINE"
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
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			content();
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
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public SetupDefContext setupDef() {
			return getRuleContext(SetupDefContext.class,0);
		}
		public LoopDefContext loopDef() {
			return getRuleContext(LoopDefContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public TerminalNode END() { return getToken(HlmpParser.END, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_content);
		int _la;
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FUNC) {
					{
					setState(62);
					funcDef();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				funcDef();
				setState(66);
				content();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				setupDef();
				setState(69);
				loopDef();
				setState(70);
				content();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				loopDef();
				setState(73);
				setupDef();
				setState(74);
				content();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				varDecl();
				setState(77);
				match(END);
				setState(78);
				content();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				comment();
				setState(81);
				content();
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

	public static class FuncDefContext extends ParserRuleContext {
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(HlmpParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HlmpParser.RBRACE, 0); }
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			head();
			setState(86);
			match(LBRACE);
			setState(87);
			body();
			setState(88);
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

	public static class HeadContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(HlmpParser.FUNC, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HlmpParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HlmpParser.RPAREN, 0); }
		public TerminalNode TYPE() { return getToken(HlmpParser.TYPE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_head);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(FUNC);
				setState(91);
				id();
				setState(92);
				match(LPAREN);
				setState(93);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(FUNC);
				setState(96);
				match(TYPE);
				setState(97);
				id();
				setState(98);
				match(LPAREN);
				setState(99);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(FUNC);
				setState(102);
				id();
				setState(103);
				match(LPAREN);
				setState(104);
				parameters();
				setState(105);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				match(FUNC);
				setState(108);
				match(TYPE);
				setState(109);
				id();
				setState(110);
				match(LPAREN);
				setState(111);
				parameters();
				setState(112);
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
		public TerminalNode ID() { return getToken(HlmpParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
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
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameters);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				parameter();
				setState(120);
				match(T__0);
				setState(121);
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
		public TerminalNode TYPE() { return getToken(HlmpParser.TYPE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(TYPE);
			setState(126);
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

	public static class BodyContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_body);
		int _la;
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << PIN) | (1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					setState(128);
					stmt();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				stmt();
				setState(132);
				body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				funcDef();
				setState(135);
				body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				comment();
				setState(138);
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
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public TerminalNode END() { return getToken(HlmpParser.END, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ReturnExprContext returnExpr() {
			return getRuleContext(ReturnExprContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public WriteFuncContext writeFunc() {
			return getRuleContext(WriteFuncContext.class,0);
		}
		public ReadFuncContext readFunc() {
			return getRuleContext(ReadFuncContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileExprContext whileExpr() {
			return getRuleContext(WhileExprContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				varDecl();
				setState(143);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				assign();
				setState(146);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				returnExpr();
				setState(149);
				match(END);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				funcCall();
				setState(152);
				match(END);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				writeFunc();
				setState(155);
				match(END);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				readFunc();
				setState(158);
				match(END);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(160);
				ifStmt();
				}
				break;
			case 8:
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
		public TerminalNode TYPE() { return getToken(HlmpParser.TYPE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(HlmpParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PinLiteralContext pinLiteral() {
			return getRuleContext(PinLiteralContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varDecl);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(TYPE);
				setState(165);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(TYPE);
				setState(167);
				id();
				setState(168);
				match(ASSIGN);
				setState(169);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
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
		public ReadFuncContext readFunc() {
			return getRuleContext(ReadFuncContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HlmpParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HlmpParser.RPAREN, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEG) {
					{
					setState(174);
					match(NEG);
					}
				}

				setState(177);
				operand();
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RELATIONAL) | (1L << ARITHMETIC) | (1L << LOGICAL))) != 0)) {
					{
					setState(178);
					operator();
					setState(179);
					expr();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEG) {
					{
					setState(183);
					match(NEG);
					}
				}

				setState(186);
				readFunc();
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RELATIONAL) | (1L << ARITHMETIC) | (1L << LOGICAL))) != 0)) {
					{
					setState(187);
					operator();
					setState(188);
					expr();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEG) {
					{
					setState(192);
					match(NEG);
					}
				}

				setState(195);
				match(LPAREN);
				setState(196);
				expr();
				setState(197);
				match(RPAREN);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RELATIONAL) | (1L << ARITHMETIC) | (1L << LOGICAL))) != 0)) {
					{
					setState(198);
					operator();
					setState(199);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public SIntContext sInt() {
			return getRuleContext(SIntContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(HlmpParser.BOOL, 0); }
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operand);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				sInt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				match(BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
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

	public static class SIntContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(HlmpParser.INT, 0); }
		public TerminalNode NEGATIVE() { return getToken(HlmpParser.NEGATIVE, 0); }
		public SIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterSInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitSInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitSInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SIntContext sInt() throws RecognitionException {
		SIntContext _localctx = new SIntContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGATIVE) {
				{
				setState(211);
				match(NEGATIVE);
				}
			}

			setState(214);
			match(INT);
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
		public RelationalContext relational() {
			return getRuleContext(RelationalContext.class,0);
		}
		public TerminalNode ARITHMETIC() { return getToken(HlmpParser.ARITHMETIC, 0); }
		public TerminalNode LOGICAL() { return getToken(HlmpParser.LOGICAL, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operator);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				relational();
				}
				break;
			case ARITHMETIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(ARITHMETIC);
				}
				break;
			case LOGICAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
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

	public static class RelationalContext extends ParserRuleContext {
		public TerminalNode RELATIONAL() { return getToken(HlmpParser.RELATIONAL, 0); }
		public RelationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitRelational(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalContext relational() throws RecognitionException {
		RelationalContext _localctx = new RelationalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relational);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(RELATIONAL);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode READPWM() { return getToken(HlmpParser.READPWM, 0); }
		public TerminalNode LPAREN() { return getToken(HlmpParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HlmpParser.RPAREN, 0); }
		public TerminalNode READA() { return getToken(HlmpParser.READA, 0); }
		public TerminalNode READD() { return getToken(HlmpParser.READD, 0); }
		public ReadFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterReadFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitReadFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitReadFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadFuncContext readFunc() throws RecognitionException {
		ReadFuncContext _localctx = new ReadFuncContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_readFunc);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
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
		public TerminalNode PIN() { return getToken(HlmpParser.PIN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(HlmpParser.LBRACE, 0); }
		public TerminalNode PINNUMBER() { return getToken(HlmpParser.PINNUMBER, 0); }
		public TerminalNode PINMODE() { return getToken(HlmpParser.PINMODE, 0); }
		public TerminalNode RBRACE() { return getToken(HlmpParser.RBRACE, 0); }
		public PinLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pinLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterPinLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitPinLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitPinLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PinLiteralContext pinLiteral() throws RecognitionException {
		PinLiteralContext _localctx = new PinLiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pinLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(PIN);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(HlmpParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			id();
			setState(249);
			match(ASSIGN);
			setState(250);
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
		public TerminalNode RETURN() { return getToken(HlmpParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterReturnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitReturnExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitReturnExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnExprContext returnExpr() throws RecognitionException {
		ReturnExprContext _localctx = new ReturnExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_returnExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(RETURN);
			setState(253);
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
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_funcCall);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				call();
				setState(257);
				match(T__1);
				setState(258);
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

	public static class CallContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HlmpParser.LPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HlmpParser.RPAREN, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			id();
			setState(263);
			match(LPAREN);
			setState(264);
			args();
			setState(265);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEG) | (1L << LPAREN) | (1L << NEGATIVE) | (1L << BOOL) | (1L << INT) | (1L << ID))) != 0)) {
				{
				setState(267);
				expr();
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(268);
					match(T__0);
					setState(269);
					expr();
					}
					}
					setState(274);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode WRITE() { return getToken(HlmpParser.WRITE, 0); }
		public TerminalNode LPAREN() { return getToken(HlmpParser.LPAREN, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HlmpParser.RPAREN, 0); }
		public WriteFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterWriteFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitWriteFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitWriteFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteFuncContext writeFunc() throws RecognitionException {
		WriteFuncContext _localctx = new WriteFuncContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_writeFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			id();
			setState(278);
			match(WRITE);
			setState(279);
			match(LPAREN);
			setState(280);
			val();
			setState(281);
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
		public TerminalNode HIGH() { return getToken(HlmpParser.HIGH, 0); }
		public TerminalNode LOW() { return getToken(HlmpParser.LOW, 0); }
		public SIntContext sInt() {
			return getRuleContext(SIntContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode TOGGLE() { return getToken(HlmpParser.TOGGLE, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_val);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HIGH:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(HIGH);
				}
				break;
			case LOW:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(LOW);
				}
				break;
			case NEGATIVE:
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				sInt();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				id();
				}
				break;
			case TOGGLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
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
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(IF);
			setState(291);
			match(LPAREN);
			setState(292);
			expr();
			setState(293);
			match(RPAREN);
			setState(294);
			match(LBRACE);
			setState(295);
			body();
			setState(296);
			match(RBRACE);
			setState(297);
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
		public TerminalNode ELSE() { return getToken(HlmpParser.ELSE, 0); }
		public TerminalNode LBRACE() { return getToken(HlmpParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HlmpParser.RBRACE, 0); }
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_elseStmt);
		int _la;
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(299);
					match(ELSE);
					setState(300);
					match(LBRACE);
					setState(301);
					body();
					setState(302);
					match(RBRACE);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(ELSE);
				setState(307);
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
		public WhileExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterWhileExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitWhileExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitWhileExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileExprContext whileExpr() throws RecognitionException {
		WhileExprContext _localctx = new WhileExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_whileExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(WHILE);
			setState(311);
			match(LPAREN);
			setState(312);
			expr();
			setState(313);
			match(RPAREN);
			setState(314);
			match(LBRACE);
			setState(315);
			body();
			setState(316);
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
		public TerminalNode FUNC() { return getToken(HlmpParser.FUNC, 0); }
		public TerminalNode SETUP() { return getToken(HlmpParser.SETUP, 0); }
		public TerminalNode LPAREN() { return getToken(HlmpParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HlmpParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(HlmpParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HlmpParser.RBRACE, 0); }
		public SetupDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setupDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterSetupDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitSetupDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitSetupDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetupDefContext setupDef() throws RecognitionException {
		SetupDefContext _localctx = new SetupDefContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_setupDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(FUNC);
			setState(319);
			match(SETUP);
			setState(320);
			match(LPAREN);
			setState(321);
			match(RPAREN);
			setState(322);
			match(LBRACE);
			setState(323);
			body();
			setState(324);
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
		public TerminalNode FUNC() { return getToken(HlmpParser.FUNC, 0); }
		public TerminalNode LOOP() { return getToken(HlmpParser.LOOP, 0); }
		public TerminalNode LPAREN() { return getToken(HlmpParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HlmpParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(HlmpParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HlmpParser.RBRACE, 0); }
		public LoopDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterLoopDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitLoopDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitLoopDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopDefContext loopDef() throws RecognitionException {
		LoopDefContext _localctx = new LoopDefContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_loopDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(FUNC);
			setState(327);
			match(LOOP);
			setState(328);
			match(LPAREN);
			setState(329);
			match(RPAREN);
			setState(330);
			match(LBRACE);
			setState(331);
			body();
			setState(332);
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
		public TerminalNode COMMENT() { return getToken(HlmpParser.COMMENT, 0); }
		public TerminalNode LINECOMMENT() { return getToken(HlmpParser.LINECOMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HlmpListener ) ((HlmpListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HlmpVisitor ) return ((HlmpVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_la = _input.LA(1);
			if ( !(_la==COMMENT || _la==LINECOMMENT) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0153\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\5\3B\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3V\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5u\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7~\n\7\3\b\3\b\3\b\3\t\5\t\u0084"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008f\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a5"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00af\n\13\3\f\5\f\u00b2"+
		"\n\f\3\f\3\f\3\f\3\f\5\f\u00b8\n\f\3\f\5\f\u00bb\n\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00c1\n\f\3\f\5\f\u00c4\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00cc\n\f\5"+
		"\f\u00ce\n\f\3\r\3\r\3\r\3\r\5\r\u00d4\n\r\3\16\5\16\u00d7\n\16\3\16\3"+
		"\16\3\17\3\17\3\17\5\17\u00de\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00f1\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0107\n\25\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\7\27\u0111\n\27\f\27\16\27\u0114\13\27\5\27\u0116\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u0123\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0133\n\33\3\33\3\33\5\33\u0137\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<\2\3\3\2\60\61\2\u0164\2>\3\2\2\2\4U\3\2"+
		"\2\2\6W\3\2\2\2\bt\3\2\2\2\nv\3\2\2\2\f}\3\2\2\2\16\177\3\2\2\2\20\u008e"+
		"\3\2\2\2\22\u00a4\3\2\2\2\24\u00ae\3\2\2\2\26\u00cd\3\2\2\2\30\u00d3\3"+
		"\2\2\2\32\u00d6\3\2\2\2\34\u00dd\3\2\2\2\36\u00df\3\2\2\2 \u00f0\3\2\2"+
		"\2\"\u00f2\3\2\2\2$\u00fa\3\2\2\2&\u00fe\3\2\2\2(\u0106\3\2\2\2*\u0108"+
		"\3\2\2\2,\u0115\3\2\2\2.\u0117\3\2\2\2\60\u0122\3\2\2\2\62\u0124\3\2\2"+
		"\2\64\u0136\3\2\2\2\66\u0138\3\2\2\28\u0140\3\2\2\2:\u0148\3\2\2\2<\u0150"+
		"\3\2\2\2>?\5\4\3\2?\3\3\2\2\2@B\5\6\4\2A@\3\2\2\2AB\3\2\2\2BV\3\2\2\2"+
		"CD\5\6\4\2DE\5\4\3\2EV\3\2\2\2FG\58\35\2GH\5:\36\2HI\5\4\3\2IV\3\2\2\2"+
		"JK\5:\36\2KL\58\35\2LM\5\4\3\2MV\3\2\2\2NO\5\24\13\2OP\7!\2\2PQ\5\4\3"+
		"\2QV\3\2\2\2RS\5<\37\2ST\5\4\3\2TV\3\2\2\2UA\3\2\2\2UC\3\2\2\2UF\3\2\2"+
		"\2UJ\3\2\2\2UN\3\2\2\2UR\3\2\2\2V\5\3\2\2\2WX\5\b\5\2XY\7\37\2\2YZ\5\20"+
		"\t\2Z[\7 \2\2[\7\3\2\2\2\\]\7\30\2\2]^\5\n\6\2^_\7\35\2\2_`\7\36\2\2`"+
		"u\3\2\2\2ab\7\30\2\2bc\7\5\2\2cd\5\n\6\2de\7\35\2\2ef\7\36\2\2fu\3\2\2"+
		"\2gh\7\30\2\2hi\5\n\6\2ij\7\35\2\2jk\5\f\7\2kl\7\36\2\2lu\3\2\2\2mn\7"+
		"\30\2\2no\7\5\2\2op\5\n\6\2pq\7\35\2\2qr\5\f\7\2rs\7\36\2\2su\3\2\2\2"+
		"t\\\3\2\2\2ta\3\2\2\2tg\3\2\2\2tm\3\2\2\2u\t\3\2\2\2vw\7/\2\2w\13\3\2"+
		"\2\2x~\5\16\b\2yz\5\16\b\2z{\7\3\2\2{|\5\f\7\2|~\3\2\2\2}x\3\2\2\2}y\3"+
		"\2\2\2~\r\3\2\2\2\177\u0080\7\5\2\2\u0080\u0081\5\n\6\2\u0081\17\3\2\2"+
		"\2\u0082\u0084\5\22\n\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u008f\3\2\2\2\u0085\u0086\5\22\n\2\u0086\u0087\5\20\t\2\u0087\u008f\3"+
		"\2\2\2\u0088\u0089\5\6\4\2\u0089\u008a\5\20\t\2\u008a\u008f\3\2\2\2\u008b"+
		"\u008c\5<\37\2\u008c\u008d\5\20\t\2\u008d\u008f\3\2\2\2\u008e\u0083\3"+
		"\2\2\2\u008e\u0085\3\2\2\2\u008e\u0088\3\2\2\2\u008e\u008b\3\2\2\2\u008f"+
		"\21\3\2\2\2\u0090\u0091\5\24\13\2\u0091\u0092\7!\2\2\u0092\u00a5\3\2\2"+
		"\2\u0093\u0094\5$\23\2\u0094\u0095\7!\2\2\u0095\u00a5\3\2\2\2\u0096\u0097"+
		"\5&\24\2\u0097\u0098\7!\2\2\u0098\u00a5\3\2\2\2\u0099\u009a\5(\25\2\u009a"+
		"\u009b\7!\2\2\u009b\u00a5\3\2\2\2\u009c\u009d\5.\30\2\u009d\u009e\7!\2"+
		"\2\u009e\u00a5\3\2\2\2\u009f\u00a0\5 \21\2\u00a0\u00a1\7!\2\2\u00a1\u00a5"+
		"\3\2\2\2\u00a2\u00a5\5\62\32\2\u00a3\u00a5\5\66\34\2\u00a4\u0090\3\2\2"+
		"\2\u00a4\u0093\3\2\2\2\u00a4\u0096\3\2\2\2\u00a4\u0099\3\2\2\2\u00a4\u009c"+
		"\3\2\2\2\u00a4\u009f\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\23\3\2\2\2\u00a6\u00a7\7\5\2\2\u00a7\u00af\5\n\6\2\u00a8\u00a9\7\5\2"+
		"\2\u00a9\u00aa\5\n\6\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac\5\26\f\2\u00ac"+
		"\u00af\3\2\2\2\u00ad\u00af\5\"\22\2\u00ae\u00a6\3\2\2\2\u00ae\u00a8\3"+
		"\2\2\2\u00ae\u00ad\3\2\2\2\u00af\25\3\2\2\2\u00b0\u00b2\7\n\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b7\5\30"+
		"\r\2\u00b4\u00b5\5\34\17\2\u00b5\u00b6\5\26\f\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"\u00b4\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ce\3\2\2\2\u00b9\u00bb\7\n"+
		"\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00c0\5 \21\2\u00bd\u00be\5\34\17\2\u00be\u00bf\5\26\f\2\u00bf\u00c1"+
		"\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00ce\3\2\2\2\u00c2"+
		"\u00c4\7\n\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c6\7\35\2\2\u00c6\u00c7\5\26\f\2\u00c7\u00cb\7\36\2\2\u00c8"+
		"\u00c9\5\34\17\2\u00c9\u00ca\5\26\f\2\u00ca\u00cc\3\2\2\2\u00cb\u00c8"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00b1\3\2\2\2\u00cd"+
		"\u00ba\3\2\2\2\u00cd\u00c3\3\2\2\2\u00ce\27\3\2\2\2\u00cf\u00d4\5\n\6"+
		"\2\u00d0\u00d4\5\32\16\2\u00d1\u00d4\7(\2\2\u00d2\u00d4\5(\25\2\u00d3"+
		"\u00cf\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2"+
		"\2\2\u00d4\31\3\2\2\2\u00d5\u00d7\7#\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7.\2\2\u00d9\33\3\2\2\2\u00da"+
		"\u00de\5\36\20\2\u00db\u00de\7\b\2\2\u00dc\u00de\7\t\2\2\u00dd\u00da\3"+
		"\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\35\3\2\2\2\u00df"+
		"\u00e0\7\7\2\2\u00e0\37\3\2\2\2\u00e1\u00e2\5\n\6\2\u00e2\u00e3\7\32\2"+
		"\2\u00e3\u00e4\7\35\2\2\u00e4\u00e5\7\36\2\2\u00e5\u00f1\3\2\2\2\u00e6"+
		"\u00e7\5\n\6\2\u00e7\u00e8\7\33\2\2\u00e8\u00e9\7\35\2\2\u00e9\u00ea\7"+
		"\36\2\2\u00ea\u00f1\3\2\2\2\u00eb\u00ec\5\n\6\2\u00ec\u00ed\7\34\2\2\u00ed"+
		"\u00ee\7\35\2\2\u00ee\u00ef\7\36\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00e1\3"+
		"\2\2\2\u00f0\u00e6\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f1!\3\2\2\2\u00f2\u00f3"+
		"\7\6\2\2\u00f3\u00f4\5\n\6\2\u00f4\u00f5\7\37\2\2\u00f5\u00f6\7-\2\2\u00f6"+
		"\u00f7\7\3\2\2\u00f7\u00f8\7&\2\2\u00f8\u00f9\7 \2\2\u00f9#\3\2\2\2\u00fa"+
		"\u00fb\5\n\6\2\u00fb\u00fc\7\"\2\2\u00fc\u00fd\5\26\f\2\u00fd%\3\2\2\2"+
		"\u00fe\u00ff\7+\2\2\u00ff\u0100\5\26\f\2\u0100\'\3\2\2\2\u0101\u0107\5"+
		"*\26\2\u0102\u0103\5*\26\2\u0103\u0104\7\4\2\2\u0104\u0105\5(\25\2\u0105"+
		"\u0107\3\2\2\2\u0106\u0101\3\2\2\2\u0106\u0102\3\2\2\2\u0107)\3\2\2\2"+
		"\u0108\u0109\5\n\6\2\u0109\u010a\7\35\2\2\u010a\u010b\5,\27\2\u010b\u010c"+
		"\7\36\2\2\u010c+\3\2\2\2\u010d\u0112\5\26\f\2\u010e\u010f\7\3\2\2\u010f"+
		"\u0111\5\26\f\2\u0110\u010e\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3"+
		"\2\2\2\u0112\u0113\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\u010d\3\2\2\2\u0115\u0116\3\2\2\2\u0116-\3\2\2\2\u0117\u0118\5\n\6\2"+
		"\u0118\u0119\7\31\2\2\u0119\u011a\7\35\2\2\u011a\u011b\5\60\31\2\u011b"+
		"\u011c\7\36\2\2\u011c/\3\2\2\2\u011d\u0123\7$\2\2\u011e\u0123\7%\2\2\u011f"+
		"\u0123\5\32\16\2\u0120\u0123\5\n\6\2\u0121\u0123\7\'\2\2\u0122\u011d\3"+
		"\2\2\2\u0122\u011e\3\2\2\2\u0122\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0121\3\2\2\2\u0123\61\3\2\2\2\u0124\u0125\7)\2\2\u0125\u0126\7\35\2"+
		"\2\u0126\u0127\5\26\f\2\u0127\u0128\7\36\2\2\u0128\u0129\7\37\2\2\u0129"+
		"\u012a\5\20\t\2\u012a\u012b\7 \2\2\u012b\u012c\5\64\33\2\u012c\63\3\2"+
		"\2\2\u012d\u012e\7*\2\2\u012e\u012f\7\37\2\2\u012f\u0130\5\20\t\2\u0130"+
		"\u0131\7 \2\2\u0131\u0133\3\2\2\2\u0132\u012d\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0137\3\2\2\2\u0134\u0135\7*\2\2\u0135\u0137\5\62\32\2\u0136"+
		"\u0132\3\2\2\2\u0136\u0134\3\2\2\2\u0137\65\3\2\2\2\u0138\u0139\7,\2\2"+
		"\u0139\u013a\7\35\2\2\u013a\u013b\5\26\f\2\u013b\u013c\7\36\2\2\u013c"+
		"\u013d\7\37\2\2\u013d\u013e\5\20\t\2\u013e\u013f\7 \2\2\u013f\67\3\2\2"+
		"\2\u0140\u0141\7\30\2\2\u0141\u0142\7\26\2\2\u0142\u0143\7\35\2\2\u0143"+
		"\u0144\7\36\2\2\u0144\u0145\7\37\2\2\u0145\u0146\5\20\t\2\u0146\u0147"+
		"\7 \2\2\u01479\3\2\2\2\u0148\u0149\7\30\2\2\u0149\u014a\7\27\2\2\u014a"+
		"\u014b\7\35\2\2\u014b\u014c\7\36\2\2\u014c\u014d\7\37\2\2\u014d\u014e"+
		"\5\20\t\2\u014e\u014f\7 \2\2\u014f;\3\2\2\2\u0150\u0151\t\2\2\2\u0151"+
		"=\3\2\2\2\33AUt}\u0083\u008e\u00a4\u00ae\u00b1\u00b7\u00ba\u00c0\u00c3"+
		"\u00cb\u00cd\u00d3\u00d6\u00dd\u00f0\u0106\u0112\u0115\u0122\u0132\u0136";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}