// Generated from C:/Users/Jakob/Documents/GitHub/Arduino-high-level-languageP4AAU/src/main/java\Ahll.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AhllParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, TYPE=3, PIN=4, RELATIONAL=5, ARITHMETIC=6, LOGICAL=7, 
		NEG=8, PLUS=9, MINUS=10, DIVIDE=11, MULT=12, MODULU=13, SETUP=14, LOOP=15, 
		FUNC=16, WRITE=17, READPWM=18, READA=19, READD=20, LPAREN=21, RPAREN=22, 
		LBRACE=23, RBRACE=24, LBRACKET=25, RBRACKET=26, END=27, EQUAL=28, NEGATIVE=29, 
		HIGH=30, LOW=31, PINMODE=32, TOGGLE=33, BOOL=34, IF=35, ELSE=36, RETURN=37, 
		WHILE=38, PINNUMBER=39, ID=40, INT=41, COMMENT=42, LINECOMMENT=43, WS=44, 
		NEWLINE=45;
	public static final int
		RULE_program = 0, RULE_content = 1, RULE_funcDef = 2, RULE_head = 3, RULE_parameters = 4, 
		RULE_parameter = 5, RULE_body = 6, RULE_stmt = 7, RULE_varDecl = 8, RULE_expr = 9, 
		RULE_operand = 10, RULE_operator = 11, RULE_readFunc = 12, RULE_arrayStmt = 13, 
		RULE_value = 14, RULE_pinLiteral = 15, RULE_arrayDef = 16, RULE_assign = 17, 
		RULE_returnExpr = 18, RULE_funcCall = 19, RULE_call = 20, RULE_args = 21, 
		RULE_writeFunc = 22, RULE_val = 23, RULE_ifStmt = 24, RULE_elseStmt = 25, 
		RULE_whileExpr = 26, RULE_setupDef = 27, RULE_loopDef = 28, RULE_comment = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "content", "funcDef", "head", "parameters", "parameter", "body", 
			"stmt", "varDecl", "expr", "operand", "operator", "readFunc", "arrayStmt", 
			"value", "pinLiteral", "arrayDef", "assign", "returnExpr", "funcCall", 
			"call", "args", "writeFunc", "val", "ifStmt", "elseStmt", "whileExpr", 
			"setupDef", "loopDef", "comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'.'", null, "'Pin '", null, null, null, "'!'", "'+'", "'-'", 
			"'/'", "'*'", "'%'", "'setup'", "'loop'", "'func '", "'.Write'", "'.ReadPwm'", 
			"'.ReadAnalog'", "'.ReadDigital'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "';'", "'='", "'~'", "'HIGH'", "'LOW'", null, "'TOGGLE'", null, 
			"'if'", "'else'", "'return'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "TYPE", "PIN", "RELATIONAL", "ARITHMETIC", "LOGICAL", 
			"NEG", "PLUS", "MINUS", "DIVIDE", "MULT", "MODULU", "SETUP", "LOOP", 
			"FUNC", "WRITE", "READPWM", "READA", "READD", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "LBRACKET", "RBRACKET", "END", "EQUAL", "NEGATIVE", "HIGH", 
			"LOW", "PINMODE", "TOGGLE", "BOOL", "IF", "ELSE", "RETURN", "WHILE", 
			"PINNUMBER", "ID", "INT", "COMMENT", "LINECOMMENT", "WS", "NEWLINE"
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
	public String getGrammarFileName() { return "Ahll.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AhllParser(TokenStream input) {
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
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitProgram(this);
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
		public TerminalNode END() { return getToken(AhllParser.END, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitContent(this);
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
		public TerminalNode LBRACE() { return getToken(AhllParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AhllParser.RBRACE, 0); }
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitFuncDef(this);
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
		public TerminalNode FUNC() { return getToken(AhllParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(AhllParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(AhllParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AhllParser.RPAREN, 0); }
		public TerminalNode TYPE() { return getToken(AhllParser.TYPE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_head);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(FUNC);
				setState(91);
				match(ID);
				setState(92);
				match(LPAREN);
				setState(93);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(FUNC);
				setState(95);
				match(TYPE);
				setState(96);
				match(ID);
				setState(97);
				match(LPAREN);
				setState(98);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(FUNC);
				setState(100);
				match(ID);
				setState(101);
				match(LPAREN);
				setState(102);
				parameters();
				setState(103);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(FUNC);
				setState(106);
				match(TYPE);
				setState(107);
				match(ID);
				setState(108);
				match(LPAREN);
				setState(109);
				parameters();
				setState(110);
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
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameters);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				parameter();
				setState(116);
				match(T__0);
				setState(117);
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
		public TerminalNode TYPE() { return getToken(AhllParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(AhllParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(TYPE);
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
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		int _la;
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << PIN) | (1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					setState(124);
					stmt();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				stmt();
				setState(128);
				body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				funcDef();
				setState(131);
				body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				comment();
				setState(134);
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
		public TerminalNode END() { return getToken(AhllParser.END, 0); }
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
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				varDecl();
				setState(139);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				assign();
				setState(142);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				returnExpr();
				setState(145);
				match(END);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				funcCall();
				setState(148);
				match(END);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				writeFunc();
				setState(151);
				match(END);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(153);
				readFunc();
				setState(154);
				match(END);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(156);
				ifStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(157);
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
		public TerminalNode TYPE() { return getToken(AhllParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(AhllParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(AhllParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PinLiteralContext pinLiteral() {
			return getRuleContext(PinLiteralContext.class,0);
		}
		public ArrayDefContext arrayDef() {
			return getRuleContext(ArrayDefContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varDecl);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(TYPE);
				setState(161);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(TYPE);
				setState(163);
				match(ID);
				setState(164);
				match(EQUAL);
				setState(165);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				pinLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				arrayDef();
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
	public static class ParensOpExprContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(AhllParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(AhllParser.RPAREN, 0); }
		public TerminalNode NEG() { return getToken(AhllParser.NEG, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ParensOpExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterParensOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitParensOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitParensOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExprContext extends ExprContext {
		public ArrayStmtContext arrayStmt() {
			return getRuleContext(ArrayStmtContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadFuncExprContext extends ExprContext {
		public ReadFuncContext readFunc() {
			return getRuleContext(ReadFuncContext.class,0);
		}
		public TerminalNode NEG() { return getToken(AhllParser.NEG, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReadFuncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterReadFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitReadFuncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitReadFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperandExprContext extends ExprContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode NEG() { return getToken(AhllParser.NEG, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OperandExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterOperandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitOperandExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitOperandExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new OperandExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEG) {
					{
					setState(170);
					match(NEG);
					}
				}

				setState(173);
				operand();
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RELATIONAL) | (1L << ARITHMETIC) | (1L << LOGICAL))) != 0)) {
					{
					setState(174);
					operator();
					setState(175);
					expr();
					}
				}

				}
				break;
			case 2:
				_localctx = new ReadFuncExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEG) {
					{
					setState(179);
					match(NEG);
					}
				}

				setState(182);
				readFunc();
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RELATIONAL) | (1L << ARITHMETIC) | (1L << LOGICAL))) != 0)) {
					{
					setState(183);
					operator();
					setState(184);
					expr();
					}
				}

				}
				break;
			case 3:
				_localctx = new ParensOpExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEG) {
					{
					setState(188);
					match(NEG);
					}
				}

				setState(191);
				match(LPAREN);
				setState(192);
				expr();
				setState(193);
				match(RPAREN);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RELATIONAL) | (1L << ARITHMETIC) | (1L << LOGICAL))) != 0)) {
					{
					setState(194);
					operator();
					setState(195);
					expr();
					}
				}

				}
				break;
			case 4:
				_localctx = new ArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				arrayStmt();
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RELATIONAL) | (1L << ARITHMETIC) | (1L << LOGICAL))) != 0)) {
					{
					setState(200);
					operator();
					setState(201);
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
		public TerminalNode ID() { return getToken(AhllParser.ID, 0); }
		public TerminalNode INT() { return getToken(AhllParser.INT, 0); }
		public TerminalNode NEGATIVE() { return getToken(AhllParser.NEGATIVE, 0); }
		public TerminalNode BOOL() { return getToken(AhllParser.BOOL, 0); }
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operand);
		int _la;
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEGATIVE) {
					{
					setState(208);
					match(NEGATIVE);
					}
				}

				setState(211);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
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
		public TerminalNode RELATIONAL() { return getToken(AhllParser.RELATIONAL, 0); }
		public TerminalNode ARITHMETIC() { return getToken(AhllParser.ARITHMETIC, 0); }
		public TerminalNode LOGICAL() { return getToken(AhllParser.LOGICAL, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RELATIONAL) | (1L << ARITHMETIC) | (1L << LOGICAL))) != 0)) ) {
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

	public static class ReadFuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AhllParser.ID, 0); }
		public TerminalNode READPWM() { return getToken(AhllParser.READPWM, 0); }
		public TerminalNode LPAREN() { return getToken(AhllParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AhllParser.RPAREN, 0); }
		public TerminalNode READA() { return getToken(AhllParser.READA, 0); }
		public TerminalNode READD() { return getToken(AhllParser.READD, 0); }
		public ReadFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterReadFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitReadFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitReadFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadFuncContext readFunc() throws RecognitionException {
		ReadFuncContext _localctx = new ReadFuncContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_readFunc);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(ID);
				setState(219);
				match(READPWM);
				setState(220);
				match(LPAREN);
				setState(221);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(ID);
				setState(223);
				match(READA);
				setState(224);
				match(LPAREN);
				setState(225);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				match(ID);
				setState(227);
				match(READD);
				setState(228);
				match(LPAREN);
				setState(229);
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

	public static class ArrayStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AhllParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(AhllParser.LBRACKET, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(AhllParser.RBRACKET, 0); }
		public ArrayStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterArrayStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitArrayStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitArrayStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayStmtContext arrayStmt() throws RecognitionException {
		ArrayStmtContext _localctx = new ArrayStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(ID);
			setState(233);
			match(LBRACKET);
			setState(234);
			value();
			setState(235);
			match(RBRACKET);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AhllParser.INT, 0); }
		public TerminalNode ID() { return getToken(AhllParser.ID, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
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

	public static class PinLiteralContext extends ParserRuleContext {
		public TerminalNode PIN() { return getToken(AhllParser.PIN, 0); }
		public TerminalNode ID() { return getToken(AhllParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(AhllParser.LBRACE, 0); }
		public TerminalNode PINNUMBER() { return getToken(AhllParser.PINNUMBER, 0); }
		public TerminalNode PINMODE() { return getToken(AhllParser.PINMODE, 0); }
		public TerminalNode RBRACE() { return getToken(AhllParser.RBRACE, 0); }
		public PinLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pinLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterPinLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitPinLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitPinLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PinLiteralContext pinLiteral() throws RecognitionException {
		PinLiteralContext _localctx = new PinLiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pinLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(PIN);
			setState(240);
			match(ID);
			setState(241);
			match(LBRACE);
			setState(242);
			match(PINNUMBER);
			setState(243);
			match(T__0);
			setState(244);
			match(PINMODE);
			setState(245);
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

	public static class ArrayDefContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(AhllParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(AhllParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(AhllParser.LBRACKET, 0); }
		public TerminalNode INT() { return getToken(AhllParser.INT, 0); }
		public TerminalNode RBRACKET() { return getToken(AhllParser.RBRACKET, 0); }
		public ArrayDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterArrayDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitArrayDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitArrayDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDefContext arrayDef() throws RecognitionException {
		ArrayDefContext _localctx = new ArrayDefContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(TYPE);
			setState(248);
			match(ID);
			setState(249);
			match(LBRACKET);
			setState(250);
			match(INT);
			setState(251);
			match(RBRACKET);
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
		public TerminalNode ID() { return getToken(AhllParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(AhllParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(ID);
			setState(254);
			match(EQUAL);
			setState(255);
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
		public TerminalNode RETURN() { return getToken(AhllParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterReturnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitReturnExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitReturnExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnExprContext returnExpr() throws RecognitionException {
		ReturnExprContext _localctx = new ReturnExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_returnExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(RETURN);
			setState(258);
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
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_funcCall);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				call();
				setState(262);
				match(T__1);
				setState(263);
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
		public TerminalNode ID() { return getToken(AhllParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(AhllParser.LPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AhllParser.RPAREN, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(ID);
			setState(268);
			match(LPAREN);
			setState(269);
			args();
			setState(270);
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
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitArgs(this);
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
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEG) | (1L << LPAREN) | (1L << NEGATIVE) | (1L << BOOL) | (1L << ID) | (1L << INT))) != 0)) {
				{
				setState(272);
				expr();
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(273);
					match(T__0);
					setState(274);
					expr();
					}
					}
					setState(279);
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
		public TerminalNode ID() { return getToken(AhllParser.ID, 0); }
		public TerminalNode WRITE() { return getToken(AhllParser.WRITE, 0); }
		public TerminalNode LPAREN() { return getToken(AhllParser.LPAREN, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AhllParser.RPAREN, 0); }
		public WriteFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterWriteFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitWriteFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitWriteFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteFuncContext writeFunc() throws RecognitionException {
		WriteFuncContext _localctx = new WriteFuncContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_writeFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(ID);
			setState(283);
			match(WRITE);
			setState(284);
			match(LPAREN);
			setState(285);
			val();
			setState(286);
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
		public TerminalNode HIGH() { return getToken(AhllParser.HIGH, 0); }
		public TerminalNode LOW() { return getToken(AhllParser.LOW, 0); }
		public TerminalNode INT() { return getToken(AhllParser.INT, 0); }
		public TerminalNode NEGATIVE() { return getToken(AhllParser.NEGATIVE, 0); }
		public TerminalNode ID() { return getToken(AhllParser.ID, 0); }
		public TerminalNode TOGGLE() { return getToken(AhllParser.TOGGLE, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_val);
		int _la;
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HIGH:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(HIGH);
				}
				break;
			case LOW:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(LOW);
				}
				break;
			case NEGATIVE:
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEGATIVE) {
					{
					setState(290);
					match(NEGATIVE);
					}
				}

				setState(293);
				match(INT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				match(ID);
				}
				break;
			case TOGGLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
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
		public TerminalNode IF() { return getToken(AhllParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(AhllParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AhllParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(AhllParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AhllParser.RBRACE, 0); }
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(IF);
			setState(299);
			match(LPAREN);
			setState(300);
			expr();
			setState(301);
			match(RPAREN);
			setState(302);
			match(LBRACE);
			setState(303);
			body();
			setState(304);
			match(RBRACE);
			setState(305);
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
		public TerminalNode ELSE() { return getToken(AhllParser.ELSE, 0); }
		public TerminalNode LBRACE() { return getToken(AhllParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AhllParser.RBRACE, 0); }
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_elseStmt);
		int _la;
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(307);
					match(ELSE);
					setState(308);
					match(LBRACE);
					setState(309);
					body();
					setState(310);
					match(RBRACE);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(ELSE);
				setState(315);
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
		public TerminalNode WHILE() { return getToken(AhllParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AhllParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AhllParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(AhllParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AhllParser.RBRACE, 0); }
		public WhileExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterWhileExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitWhileExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitWhileExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileExprContext whileExpr() throws RecognitionException {
		WhileExprContext _localctx = new WhileExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_whileExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(WHILE);
			setState(319);
			match(LPAREN);
			setState(320);
			expr();
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

	public static class SetupDefContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(AhllParser.FUNC, 0); }
		public TerminalNode SETUP() { return getToken(AhllParser.SETUP, 0); }
		public TerminalNode LPAREN() { return getToken(AhllParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AhllParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(AhllParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AhllParser.RBRACE, 0); }
		public SetupDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setupDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterSetupDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitSetupDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitSetupDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetupDefContext setupDef() throws RecognitionException {
		SetupDefContext _localctx = new SetupDefContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_setupDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(FUNC);
			setState(327);
			match(SETUP);
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

	public static class LoopDefContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(AhllParser.FUNC, 0); }
		public TerminalNode LOOP() { return getToken(AhllParser.LOOP, 0); }
		public TerminalNode LPAREN() { return getToken(AhllParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AhllParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(AhllParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AhllParser.RBRACE, 0); }
		public LoopDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterLoopDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitLoopDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitLoopDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopDefContext loopDef() throws RecognitionException {
		LoopDefContext _localctx = new LoopDefContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_loopDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(FUNC);
			setState(335);
			match(LOOP);
			setState(336);
			match(LPAREN);
			setState(337);
			match(RPAREN);
			setState(338);
			match(LBRACE);
			setState(339);
			body();
			setState(340);
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
		public TerminalNode COMMENT() { return getToken(AhllParser.COMMENT, 0); }
		public TerminalNode LINECOMMENT() { return getToken(AhllParser.LINECOMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AhllListener ) ((AhllListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AhllVisitor ) return ((AhllVisitor<? extends T>)visitor).visitComment(this);
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
			setState(342);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u015b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\5\3B\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3V\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5s\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\5\6z\n\6\3\7\3\7\3\7\3\b\5\b\u0080\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008b\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a1\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ab\n\n\3\13\5\13\u00ae\n\13\3\13\3"+
		"\13\3\13\3\13\5\13\u00b4\n\13\3\13\5\13\u00b7\n\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00bd\n\13\3\13\5\13\u00c0\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u00c8\n\13\3\13\3\13\3\13\3\13\5\13\u00ce\n\13\5\13\u00d0\n\13\3\f"+
		"\3\f\5\f\u00d4\n\f\3\f\3\f\3\f\5\f\u00d9\n\f\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e9\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u010c\n\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\7\27\u0116\n\27\f\27\16\27\u0119\13\27\5\27\u011b\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\5\31\u0126\n\31\3\31\3\31\3\31\5\31\u012b"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u013b\n\33\3\33\3\33\5\33\u013f\n\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\2\2 \2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\5\3\2\7\t\3\2*+\3\2,-\2\u016e"+
		"\2>\3\2\2\2\4U\3\2\2\2\6W\3\2\2\2\br\3\2\2\2\ny\3\2\2\2\f{\3\2\2\2\16"+
		"\u008a\3\2\2\2\20\u00a0\3\2\2\2\22\u00aa\3\2\2\2\24\u00cf\3\2\2\2\26\u00d8"+
		"\3\2\2\2\30\u00da\3\2\2\2\32\u00e8\3\2\2\2\34\u00ea\3\2\2\2\36\u00ef\3"+
		"\2\2\2 \u00f1\3\2\2\2\"\u00f9\3\2\2\2$\u00ff\3\2\2\2&\u0103\3\2\2\2(\u010b"+
		"\3\2\2\2*\u010d\3\2\2\2,\u011a\3\2\2\2.\u011c\3\2\2\2\60\u012a\3\2\2\2"+
		"\62\u012c\3\2\2\2\64\u013e\3\2\2\2\66\u0140\3\2\2\28\u0148\3\2\2\2:\u0150"+
		"\3\2\2\2<\u0158\3\2\2\2>?\5\4\3\2?\3\3\2\2\2@B\5\6\4\2A@\3\2\2\2AB\3\2"+
		"\2\2BV\3\2\2\2CD\5\6\4\2DE\5\4\3\2EV\3\2\2\2FG\58\35\2GH\5:\36\2HI\5\4"+
		"\3\2IV\3\2\2\2JK\5:\36\2KL\58\35\2LM\5\4\3\2MV\3\2\2\2NO\5\22\n\2OP\7"+
		"\35\2\2PQ\5\4\3\2QV\3\2\2\2RS\5<\37\2ST\5\4\3\2TV\3\2\2\2UA\3\2\2\2UC"+
		"\3\2\2\2UF\3\2\2\2UJ\3\2\2\2UN\3\2\2\2UR\3\2\2\2V\5\3\2\2\2WX\5\b\5\2"+
		"XY\7\31\2\2YZ\5\16\b\2Z[\7\32\2\2[\7\3\2\2\2\\]\7\22\2\2]^\7*\2\2^_\7"+
		"\27\2\2_s\7\30\2\2`a\7\22\2\2ab\7\5\2\2bc\7*\2\2cd\7\27\2\2ds\7\30\2\2"+
		"ef\7\22\2\2fg\7*\2\2gh\7\27\2\2hi\5\n\6\2ij\7\30\2\2js\3\2\2\2kl\7\22"+
		"\2\2lm\7\5\2\2mn\7*\2\2no\7\27\2\2op\5\n\6\2pq\7\30\2\2qs\3\2\2\2r\\\3"+
		"\2\2\2r`\3\2\2\2re\3\2\2\2rk\3\2\2\2s\t\3\2\2\2tz\5\f\7\2uv\5\f\7\2vw"+
		"\7\3\2\2wx\5\n\6\2xz\3\2\2\2yt\3\2\2\2yu\3\2\2\2z\13\3\2\2\2{|\7\5\2\2"+
		"|}\7*\2\2}\r\3\2\2\2~\u0080\5\20\t\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u008b\3\2\2\2\u0081\u0082\5\20\t\2\u0082\u0083\5\16\b\2\u0083\u008b\3"+
		"\2\2\2\u0084\u0085\5\6\4\2\u0085\u0086\5\16\b\2\u0086\u008b\3\2\2\2\u0087"+
		"\u0088\5<\37\2\u0088\u0089\5\16\b\2\u0089\u008b\3\2\2\2\u008a\177\3\2"+
		"\2\2\u008a\u0081\3\2\2\2\u008a\u0084\3\2\2\2\u008a\u0087\3\2\2\2\u008b"+
		"\17\3\2\2\2\u008c\u008d\5\22\n\2\u008d\u008e\7\35\2\2\u008e\u00a1\3\2"+
		"\2\2\u008f\u0090\5$\23\2\u0090\u0091\7\35\2\2\u0091\u00a1\3\2\2\2\u0092"+
		"\u0093\5&\24\2\u0093\u0094\7\35\2\2\u0094\u00a1\3\2\2\2\u0095\u0096\5"+
		"(\25\2\u0096\u0097\7\35\2\2\u0097\u00a1\3\2\2\2\u0098\u0099\5.\30\2\u0099"+
		"\u009a\7\35\2\2\u009a\u00a1\3\2\2\2\u009b\u009c\5\32\16\2\u009c\u009d"+
		"\7\35\2\2\u009d\u00a1\3\2\2\2\u009e\u00a1\5\62\32\2\u009f\u00a1\5\66\34"+
		"\2\u00a0\u008c\3\2\2\2\u00a0\u008f\3\2\2\2\u00a0\u0092\3\2\2\2\u00a0\u0095"+
		"\3\2\2\2\u00a0\u0098\3\2\2\2\u00a0\u009b\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\21\3\2\2\2\u00a2\u00a3\7\5\2\2\u00a3\u00ab\7*\2\2"+
		"\u00a4\u00a5\7\5\2\2\u00a5\u00a6\7*\2\2\u00a6\u00a7\7\36\2\2\u00a7\u00ab"+
		"\5\24\13\2\u00a8\u00ab\5 \21\2\u00a9\u00ab\5\"\22\2\u00aa\u00a2\3\2\2"+
		"\2\u00aa\u00a4\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\23"+
		"\3\2\2\2\u00ac\u00ae\7\n\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b3\5\26\f\2\u00b0\u00b1\5\30\r\2\u00b1\u00b2\5"+
		"\24\13\2\u00b2\u00b4\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00d0\3\2\2\2\u00b5\u00b7\7\n\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bc\5\32\16\2\u00b9\u00ba\5\30\r\2\u00ba"+
		"\u00bb\5\24\13\2\u00bb\u00bd\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00bd\3"+
		"\2\2\2\u00bd\u00d0\3\2\2\2\u00be\u00c0\7\n\2\2\u00bf\u00be\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\27\2\2\u00c2\u00c3\5"+
		"\24\13\2\u00c3\u00c7\7\30\2\2\u00c4\u00c5\5\30\r\2\u00c5\u00c6\5\24\13"+
		"\2\u00c6\u00c8\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00d0"+
		"\3\2\2\2\u00c9\u00cd\5\34\17\2\u00ca\u00cb\5\30\r\2\u00cb\u00cc\5\24\13"+
		"\2\u00cc\u00ce\3\2\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0"+
		"\3\2\2\2\u00cf\u00ad\3\2\2\2\u00cf\u00b6\3\2\2\2\u00cf\u00bf\3\2\2\2\u00cf"+
		"\u00c9\3\2\2\2\u00d0\25\3\2\2\2\u00d1\u00d9\7*\2\2\u00d2\u00d4\7\37\2"+
		"\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d9"+
		"\7+\2\2\u00d6\u00d9\7$\2\2\u00d7\u00d9\5(\25\2\u00d8\u00d1\3\2\2\2\u00d8"+
		"\u00d3\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\27\3\2\2"+
		"\2\u00da\u00db\t\2\2\2\u00db\31\3\2\2\2\u00dc\u00dd\7*\2\2\u00dd\u00de"+
		"\7\24\2\2\u00de\u00df\7\27\2\2\u00df\u00e9\7\30\2\2\u00e0\u00e1\7*\2\2"+
		"\u00e1\u00e2\7\25\2\2\u00e2\u00e3\7\27\2\2\u00e3\u00e9\7\30\2\2\u00e4"+
		"\u00e5\7*\2\2\u00e5\u00e6\7\26\2\2\u00e6\u00e7\7\27\2\2\u00e7\u00e9\7"+
		"\30\2\2\u00e8\u00dc\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e9"+
		"\33\3\2\2\2\u00ea\u00eb\7*\2\2\u00eb\u00ec\7\33\2\2\u00ec\u00ed\5\36\20"+
		"\2\u00ed\u00ee\7\34\2\2\u00ee\35\3\2\2\2\u00ef\u00f0\t\3\2\2\u00f0\37"+
		"\3\2\2\2\u00f1\u00f2\7\6\2\2\u00f2\u00f3\7*\2\2\u00f3\u00f4\7\31\2\2\u00f4"+
		"\u00f5\7)\2\2\u00f5\u00f6\7\3\2\2\u00f6\u00f7\7\"\2\2\u00f7\u00f8\7\32"+
		"\2\2\u00f8!\3\2\2\2\u00f9\u00fa\7\5\2\2\u00fa\u00fb\7*\2\2\u00fb\u00fc"+
		"\7\33\2\2\u00fc\u00fd\7+\2\2\u00fd\u00fe\7\34\2\2\u00fe#\3\2\2\2\u00ff"+
		"\u0100\7*\2\2\u0100\u0101\7\36\2\2\u0101\u0102\5\24\13\2\u0102%\3\2\2"+
		"\2\u0103\u0104\7\'\2\2\u0104\u0105\5\24\13\2\u0105\'\3\2\2\2\u0106\u010c"+
		"\5*\26\2\u0107\u0108\5*\26\2\u0108\u0109\7\4\2\2\u0109\u010a\5(\25\2\u010a"+
		"\u010c\3\2\2\2\u010b\u0106\3\2\2\2\u010b\u0107\3\2\2\2\u010c)\3\2\2\2"+
		"\u010d\u010e\7*\2\2\u010e\u010f\7\27\2\2\u010f\u0110\5,\27\2\u0110\u0111"+
		"\7\30\2\2\u0111+\3\2\2\2\u0112\u0117\5\24\13\2\u0113\u0114\7\3\2\2\u0114"+
		"\u0116\5\24\13\2\u0115\u0113\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3"+
		"\2\2\2\u0117\u0118\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\u0112\3\2\2\2\u011a\u011b\3\2\2\2\u011b-\3\2\2\2\u011c\u011d\7*\2\2\u011d"+
		"\u011e\7\23\2\2\u011e\u011f\7\27\2\2\u011f\u0120\5\60\31\2\u0120\u0121"+
		"\7\30\2\2\u0121/\3\2\2\2\u0122\u012b\7 \2\2\u0123\u012b\7!\2\2\u0124\u0126"+
		"\7\37\2\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2"+
		"\u0127\u012b\7+\2\2\u0128\u012b\7*\2\2\u0129\u012b\7#\2\2\u012a\u0122"+
		"\3\2\2\2\u012a\u0123\3\2\2\2\u012a\u0125\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u0129\3\2\2\2\u012b\61\3\2\2\2\u012c\u012d\7%\2\2\u012d\u012e\7\27\2"+
		"\2\u012e\u012f\5\24\13\2\u012f\u0130\7\30\2\2\u0130\u0131\7\31\2\2\u0131"+
		"\u0132\5\16\b\2\u0132\u0133\7\32\2\2\u0133\u0134\5\64\33\2\u0134\63\3"+
		"\2\2\2\u0135\u0136\7&\2\2\u0136\u0137\7\31\2\2\u0137\u0138\5\16\b\2\u0138"+
		"\u0139\7\32\2\2\u0139\u013b\3\2\2\2\u013a\u0135\3\2\2\2\u013a\u013b\3"+
		"\2\2\2\u013b\u013f\3\2\2\2\u013c\u013d\7&\2\2\u013d\u013f\5\62\32\2\u013e"+
		"\u013a\3\2\2\2\u013e\u013c\3\2\2\2\u013f\65\3\2\2\2\u0140\u0141\7(\2\2"+
		"\u0141\u0142\7\27\2\2\u0142\u0143\5\24\13\2\u0143\u0144\7\30\2\2\u0144"+
		"\u0145\7\31\2\2\u0145\u0146\5\16\b\2\u0146\u0147\7\32\2\2\u0147\67\3\2"+
		"\2\2\u0148\u0149\7\22\2\2\u0149\u014a\7\20\2\2\u014a\u014b\7\27\2\2\u014b"+
		"\u014c\7\30\2\2\u014c\u014d\7\31\2\2\u014d\u014e\5\16\b\2\u014e\u014f"+
		"\7\32\2\2\u014f9\3\2\2\2\u0150\u0151\7\22\2\2\u0151\u0152\7\21\2\2\u0152"+
		"\u0153\7\27\2\2\u0153\u0154\7\30\2\2\u0154\u0155\7\31\2\2\u0155\u0156"+
		"\5\16\b\2\u0156\u0157\7\32\2\2\u0157;\3\2\2\2\u0158\u0159\t\4\2\2\u0159"+
		"=\3\2\2\2\34AUry\177\u008a\u00a0\u00aa\u00ad\u00b3\u00b6\u00bc\u00bf\u00c7"+
		"\u00cd\u00cf\u00d3\u00d8\u00e8\u010b\u0117\u011a\u0125\u012a\u013a\u013e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}