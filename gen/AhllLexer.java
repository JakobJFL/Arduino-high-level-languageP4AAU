// Generated from C:/Users/JFL/Documents/GitHub/Arduino-high-level-languageP4AAU/src/main/java\Ahll.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AhllLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, TYPE=3, PIN=4, RELATIONAL=5, ARITHMETIC=6, LOGICAL=7, 
		NEG=8, PLUS=9, MINUS=10, DIVIDE=11, MULT=12, MODULU=13, LESSTHAN=14, GREATERTHAN=15, 
		EQUAL=16, NOTEQUAL=17, LOGAND=18, LOGOR=19, SETUP=20, LOOP=21, FUNC=22, 
		WRITE=23, READPWM=24, READA=25, READD=26, LPAREN=27, RPAREN=28, LBRACE=29, 
		RBRACE=30, LBRACKET=31, RBRACKET=32, END=33, ASSIGN=34, NEGATIVE=35, HIGH=36, 
		LOW=37, PINMODE=38, TOGGLE=39, BOOL=40, IF=41, ELSE=42, RETURN=43, WHILE=44, 
		PINNUMBER=45, INT=46, ID=47, COMMENT=48, LINECOMMENT=49, WS=50, NEWLINE=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "TYPE", "PIN", "RELATIONAL", "ARITHMETIC", "LOGICAL", 
			"NEG", "PLUS", "MINUS", "DIVIDE", "MULT", "MODULU", "LESSTHAN", "GREATERTHAN", 
			"EQUAL", "NOTEQUAL", "LOGAND", "LOGOR", "SETUP", "LOOP", "FUNC", "WRITE", 
			"READPWM", "READA", "READD", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACKET", "RBRACKET", "END", "ASSIGN", "NEGATIVE", "HIGH", "LOW", "PINMODE", 
			"TOGGLE", "BOOL", "IF", "ELSE", "RETURN", "WHILE", "PINNUMBER", "INT", 
			"ID", "COMMENT", "LINECOMMENT", "WS", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'.'", null, "'Pin '", null, null, null, "'!'", "'+'", "'-'", 
			"'/'", "'*'", "'%'", "'<'", "'>'", "'=='", "'!='", "'&&'", "'||'", "'setup'", 
			"'loop'", "'func '", "'.Write'", "'.ReadPwm'", "'.ReadAnalog'", "'.ReadDigital'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "'='", "'~'", "'HIGH'", 
			"'LOW'", null, "'TOGGLE'", null, "'if'", "'else'", "'return'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "TYPE", "PIN", "RELATIONAL", "ARITHMETIC", "LOGICAL", 
			"NEG", "PLUS", "MINUS", "DIVIDE", "MULT", "MODULU", "LESSTHAN", "GREATERTHAN", 
			"EQUAL", "NOTEQUAL", "LOGAND", "LOGOR", "SETUP", "LOOP", "FUNC", "WRITE", 
			"READPWM", "READA", "READD", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACKET", "RBRACKET", "END", "ASSIGN", "NEGATIVE", "HIGH", "LOW", "PINMODE", 
			"TOGGLE", "BOOL", "IF", "ELSE", "RETURN", "WHILE", "PINNUMBER", "INT", 
			"ID", "COMMENT", "LINECOMMENT", "WS", "NEWLINE"
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


	public AhllLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ahll.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0171\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4{\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u0086\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u008d\n\7\3\b\3\b\5\b\u0091\n\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\5\'\u0109\n\'\3(\3(\3(\3(\3(\3(\3(\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\5)\u011b\n)\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3"+
		",\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\6.\u0134\n.\r.\16.\u0135\3.\3.\6.\u013a"+
		"\n.\r.\16.\u013b\5.\u013e\n.\3/\6/\u0141\n/\r/\16/\u0142\3\60\3\60\7\60"+
		"\u0147\n\60\f\60\16\60\u014a\13\60\3\61\3\61\3\61\3\61\7\61\u0150\n\61"+
		"\f\61\16\61\u0153\13\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\7"+
		"\62\u015e\n\62\f\62\16\62\u0161\13\62\3\62\3\62\3\63\3\63\6\63\u0167\n"+
		"\63\r\63\16\63\u0168\3\63\3\63\3\64\3\64\3\64\5\64\u0170\n\64\3\u0151"+
		"\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65\3\2\7\3"+
		"\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\4\2\13\13\"\"\2\u0186\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5k\3\2\2\2\7z\3\2\2\2"+
		"\t|\3\2\2\2\13\u0085\3\2\2\2\r\u008c\3\2\2\2\17\u0090\3\2\2\2\21\u0092"+
		"\3\2\2\2\23\u0094\3\2\2\2\25\u0096\3\2\2\2\27\u0098\3\2\2\2\31\u009a\3"+
		"\2\2\2\33\u009c\3\2\2\2\35\u009e\3\2\2\2\37\u00a0\3\2\2\2!\u00a2\3\2\2"+
		"\2#\u00a5\3\2\2\2%\u00a8\3\2\2\2\'\u00ab\3\2\2\2)\u00ae\3\2\2\2+\u00b4"+
		"\3\2\2\2-\u00b9\3\2\2\2/\u00bf\3\2\2\2\61\u00c6\3\2\2\2\63\u00cf\3\2\2"+
		"\2\65\u00db\3\2\2\2\67\u00e8\3\2\2\29\u00ea\3\2\2\2;\u00ec\3\2\2\2=\u00ee"+
		"\3\2\2\2?\u00f0\3\2\2\2A\u00f2\3\2\2\2C\u00f4\3\2\2\2E\u00f6\3\2\2\2G"+
		"\u00f8\3\2\2\2I\u00fa\3\2\2\2K\u00ff\3\2\2\2M\u0108\3\2\2\2O\u010a\3\2"+
		"\2\2Q\u011a\3\2\2\2S\u011c\3\2\2\2U\u011f\3\2\2\2W\u0124\3\2\2\2Y\u012b"+
		"\3\2\2\2[\u013d\3\2\2\2]\u0140\3\2\2\2_\u0144\3\2\2\2a\u014b\3\2\2\2c"+
		"\u0159\3\2\2\2e\u0166\3\2\2\2g\u016f\3\2\2\2ij\7.\2\2j\4\3\2\2\2kl\7\60"+
		"\2\2l\6\3\2\2\2mn\7P\2\2no\7w\2\2op\7o\2\2p{\7\"\2\2qr\7D\2\2rs\7q\2\2"+
		"st\7q\2\2tu\7n\2\2u{\7\"\2\2vw\7R\2\2wx\7y\2\2xy\7o\2\2y{\7\"\2\2zm\3"+
		"\2\2\2zq\3\2\2\2zv\3\2\2\2{\b\3\2\2\2|}\7R\2\2}~\7k\2\2~\177\7p\2\2\177"+
		"\u0080\7\"\2\2\u0080\n\3\2\2\2\u0081\u0086\5\35\17\2\u0082\u0086\5\37"+
		"\20\2\u0083\u0086\5!\21\2\u0084\u0086\5#\22\2\u0085\u0081\3\2\2\2\u0085"+
		"\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\f\3\2\2\2"+
		"\u0087\u008d\5\23\n\2\u0088\u008d\5\25\13\2\u0089\u008d\5\27\f\2\u008a"+
		"\u008d\5\31\r\2\u008b\u008d\5\33\16\2\u008c\u0087\3\2\2\2\u008c\u0088"+
		"\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\16\3\2\2\2\u008e\u0091\5%\23\2\u008f\u0091\5\'\24\2\u0090\u008e\3\2\2"+
		"\2\u0090\u008f\3\2\2\2\u0091\20\3\2\2\2\u0092\u0093\7#\2\2\u0093\22\3"+
		"\2\2\2\u0094\u0095\7-\2\2\u0095\24\3\2\2\2\u0096\u0097\7/\2\2\u0097\26"+
		"\3\2\2\2\u0098\u0099\7\61\2\2\u0099\30\3\2\2\2\u009a\u009b\7,\2\2\u009b"+
		"\32\3\2\2\2\u009c\u009d\7\'\2\2\u009d\34\3\2\2\2\u009e\u009f\7>\2\2\u009f"+
		"\36\3\2\2\2\u00a0\u00a1\7@\2\2\u00a1 \3\2\2\2\u00a2\u00a3\7?\2\2\u00a3"+
		"\u00a4\7?\2\2\u00a4\"\3\2\2\2\u00a5\u00a6\7#\2\2\u00a6\u00a7\7?\2\2\u00a7"+
		"$\3\2\2\2\u00a8\u00a9\7(\2\2\u00a9\u00aa\7(\2\2\u00aa&\3\2\2\2\u00ab\u00ac"+
		"\7~\2\2\u00ac\u00ad\7~\2\2\u00ad(\3\2\2\2\u00ae\u00af\7u\2\2\u00af\u00b0"+
		"\7g\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7w\2\2\u00b2\u00b3\7r\2\2\u00b3"+
		"*\3\2\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7q\2\2\u00b7"+
		"\u00b8\7r\2\2\u00b8,\3\2\2\2\u00b9\u00ba\7h\2\2\u00ba\u00bb\7w\2\2\u00bb"+
		"\u00bc\7p\2\2\u00bc\u00bd\7e\2\2\u00bd\u00be\7\"\2\2\u00be.\3\2\2\2\u00bf"+
		"\u00c0\7\60\2\2\u00c0\u00c1\7Y\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7k\2"+
		"\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7g\2\2\u00c5\60\3\2\2\2\u00c6\u00c7"+
		"\7\60\2\2\u00c7\u00c8\7T\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7c\2\2\u00ca"+
		"\u00cb\7f\2\2\u00cb\u00cc\7R\2\2\u00cc\u00cd\7y\2\2\u00cd\u00ce\7o\2\2"+
		"\u00ce\62\3\2\2\2\u00cf\u00d0\7\60\2\2\u00d0\u00d1\7T\2\2\u00d1\u00d2"+
		"\7g\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7f\2\2\u00d4\u00d5\7C\2\2\u00d5"+
		"\u00d6\7p\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9\7q\2\2"+
		"\u00d9\u00da\7i\2\2\u00da\64\3\2\2\2\u00db\u00dc\7\60\2\2\u00dc\u00dd"+
		"\7T\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7f\2\2\u00e0"+
		"\u00e1\7F\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7i\2\2\u00e3\u00e4\7k\2\2"+
		"\u00e4\u00e5\7v\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7n\2\2\u00e7\66\3\2"+
		"\2\2\u00e8\u00e9\7*\2\2\u00e98\3\2\2\2\u00ea\u00eb\7+\2\2\u00eb:\3\2\2"+
		"\2\u00ec\u00ed\7}\2\2\u00ed<\3\2\2\2\u00ee\u00ef\7\177\2\2\u00ef>\3\2"+
		"\2\2\u00f0\u00f1\7]\2\2\u00f1@\3\2\2\2\u00f2\u00f3\7_\2\2\u00f3B\3\2\2"+
		"\2\u00f4\u00f5\7=\2\2\u00f5D\3\2\2\2\u00f6\u00f7\7?\2\2\u00f7F\3\2\2\2"+
		"\u00f8\u00f9\7\u0080\2\2\u00f9H\3\2\2\2\u00fa\u00fb\7J\2\2\u00fb\u00fc"+
		"\7K\2\2\u00fc\u00fd\7I\2\2\u00fd\u00fe\7J\2\2\u00feJ\3\2\2\2\u00ff\u0100"+
		"\7N\2\2\u0100\u0101\7Q\2\2\u0101\u0102\7Y\2\2\u0102L\3\2\2\2\u0103\u0104"+
		"\7q\2\2\u0104\u0105\7w\2\2\u0105\u0109\7v\2\2\u0106\u0107\7k\2\2\u0107"+
		"\u0109\7p\2\2\u0108\u0103\3\2\2\2\u0108\u0106\3\2\2\2\u0109N\3\2\2\2\u010a"+
		"\u010b\7V\2\2\u010b\u010c\7Q\2\2\u010c\u010d\7I\2\2\u010d\u010e\7I\2\2"+
		"\u010e\u010f\7N\2\2\u010f\u0110\7G\2\2\u0110P\3\2\2\2\u0111\u0112\7v\2"+
		"\2\u0112\u0113\7t\2\2\u0113\u0114\7w\2\2\u0114\u011b\7g\2\2\u0115\u0116"+
		"\7h\2\2\u0116\u0117\7c\2\2\u0117\u0118\7n\2\2\u0118\u0119\7u\2\2\u0119"+
		"\u011b\7g\2\2\u011a\u0111\3\2\2\2\u011a\u0115\3\2\2\2\u011bR\3\2\2\2\u011c"+
		"\u011d\7k\2\2\u011d\u011e\7h\2\2\u011eT\3\2\2\2\u011f\u0120\7g\2\2\u0120"+
		"\u0121\7n\2\2\u0121\u0122\7u\2\2\u0122\u0123\7g\2\2\u0123V\3\2\2\2\u0124"+
		"\u0125\7t\2\2\u0125\u0126\7g\2\2\u0126\u0127\7v\2\2\u0127\u0128\7w\2\2"+
		"\u0128\u0129\7t\2\2\u0129\u012a\7p\2\2\u012aX\3\2\2\2\u012b\u012c\7y\2"+
		"\2\u012c\u012d\7j\2\2\u012d\u012e\7k\2\2\u012e\u012f\7n\2\2\u012f\u0130"+
		"\7g\2\2\u0130Z\3\2\2\2\u0131\u0133\7F\2\2\u0132\u0134\t\2\2\2\u0133\u0132"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u013e\3\2\2\2\u0137\u0139\7C\2\2\u0138\u013a\t\2\2\2\u0139\u0138\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013e\3\2\2\2\u013d\u0131\3\2\2\2\u013d\u0137\3\2\2\2\u013e\\\3\2\2\2"+
		"\u013f\u0141\t\2\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143^\3\2\2\2\u0144\u0148\t\3\2\2\u0145"+
		"\u0147\t\4\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2"+
		"\2\2\u0148\u0149\3\2\2\2\u0149`\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c"+
		"\7\61\2\2\u014c\u014d\7,\2\2\u014d\u0151\3\2\2\2\u014e\u0150\13\2\2\2"+
		"\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u0152\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7,\2\2\u0155"+
		"\u0156\7\61\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b\61\2\2\u0158b\3\2\2"+
		"\2\u0159\u015a\7\61\2\2\u015a\u015b\7\61\2\2\u015b\u015f\3\2\2\2\u015c"+
		"\u015e\n\5\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162"+
		"\u0163\b\62\2\2\u0163d\3\2\2\2\u0164\u0167\t\6\2\2\u0165\u0167\5g\64\2"+
		"\u0166\u0164\3\2\2\2\u0166\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0166"+
		"\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\b\63\2\2"+
		"\u016bf\3\2\2\2\u016c\u016d\7\17\2\2\u016d\u0170\7\f\2\2\u016e\u0170\t"+
		"\5\2\2\u016f\u016c\3\2\2\2\u016f\u016e\3\2\2\2\u0170h\3\2\2\2\23\2z\u0085"+
		"\u008c\u0090\u0108\u011a\u0135\u013b\u013d\u0142\u0148\u0151\u015f\u0166"+
		"\u0168\u016f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}