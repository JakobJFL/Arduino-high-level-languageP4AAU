// Generated from C:/Users/Jakob/Documents/GitHub/Arduino-high-level-languageP4AAU/src/main/java\Ahll.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, TYPE=5, SETUP=6, LOOP=7, FUNC=8, LPAREN=9, 
		RPAREN=10, LBRACE=11, RBRACE=12, LBRACKET=13, RBRACKET=14, END=15, EQUAL=16, 
		PIN=17, WRITE=18, READPWM=19, READA=20, READD=21, ELSE=22, HIGH=23, LOW=24, 
		TOGGLE=25, RETURN=26, QUOTE=27, PINMODE=28, IF=29, WHILE=30, PINNUMBER=31, 
		ID=32, LETTER=33, INT=34, BOOL=35, STRING=36, RELATIONAL=37, ARITHMETIC=38, 
		LOGICAL=39, NEG=40, COMMENT=41, LINECOMMENT=42, WS=43, NEWLINE=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "TYPE", "SETUP", "LOOP", "FUNC", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "END", "EQUAL", 
			"PIN", "WRITE", "READPWM", "READA", "READD", "ELSE", "HIGH", "LOW", "TOGGLE", 
			"RETURN", "QUOTE", "PINMODE", "IF", "WHILE", "PINNUMBER", "ID", "LETTER", 
			"INT", "BOOL", "STRING", "RELATIONAL", "ARITHMETIC", "LOGICAL", "NEG", 
			"COMMENT", "LINECOMMENT", "WS", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'.'", "'+'", "'-'", null, "'setup'", "'loop'", "'func '", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "'='", "'Pin '", "'.Write'", 
			"'.ReadPwm'", "'.ReadAnalog'", "'.ReadDigital'", "'else'", "'HIGH'", 
			"'LOW'", "'TOGGLE'", "'return'", "'\"'", null, "'if'", "'while'", null, 
			null, null, null, null, null, null, null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "TYPE", "SETUP", "LOOP", "FUNC", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "END", "EQUAL", 
			"PIN", "WRITE", "READPWM", "READA", "READD", "ELSE", "HIGH", "LOW", "TOGGLE", 
			"RETURN", "QUOTE", "PINMODE", "IF", "WHILE", "PINNUMBER", "ID", "LETTER", 
			"INT", "BOOL", "STRING", "RELATIONAL", "ARITHMETIC", "LOGICAL", "NEG", 
			"COMMENT", "LINECOMMENT", "WS", "NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0161\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6x\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u00ec\n\35\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \6 \u00f9\n \r \16 \u00fa"+
		"\3 \3 \6 \u00ff\n \r \16 \u0100\5 \u0103\n \3!\3!\7!\u0107\n!\f!\16!\u010a"+
		"\13!\3\"\3\"\3#\6#\u010f\n#\r#\16#\u0110\3$\3$\3$\3$\3$\3$\3$\3$\3$\5"+
		"$\u011c\n$\3%\7%\u011f\n%\f%\16%\u0122\13%\3%\7%\u0125\n%\f%\16%\u0128"+
		"\13%\3&\3&\3&\3&\3&\3&\5&\u0130\n&\3\'\3\'\3(\3(\3(\3(\5(\u0138\n(\3)"+
		"\3)\3*\3*\3*\3*\7*\u0140\n*\f*\16*\u0143\13*\3*\3*\3*\3*\3*\3+\3+\3+\3"+
		"+\7+\u014e\n+\f+\16+\u0151\13+\3+\3+\3,\3,\6,\u0157\n,\r,\16,\u0158\3"+
		",\3,\3-\3-\3-\5-\u0160\n-\4\u0120\u0141\2.\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.\3\2\13\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2C\\c|\3\2$$\4\2>>@"+
		"@\6\2\'\',-//\61\61\4\2\f\f\17\17\4\2\13\13\"\"\2\u0175\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7_\3\2\2\2\ta\3\2\2\2\13w\3\2"+
		"\2\2\ry\3\2\2\2\17\177\3\2\2\2\21\u0084\3\2\2\2\23\u008a\3\2\2\2\25\u008c"+
		"\3\2\2\2\27\u008e\3\2\2\2\31\u0090\3\2\2\2\33\u0092\3\2\2\2\35\u0094\3"+
		"\2\2\2\37\u0096\3\2\2\2!\u0098\3\2\2\2#\u009a\3\2\2\2%\u009f\3\2\2\2\'"+
		"\u00a6\3\2\2\2)\u00af\3\2\2\2+\u00bb\3\2\2\2-\u00c8\3\2\2\2/\u00cd\3\2"+
		"\2\2\61\u00d2\3\2\2\2\63\u00d6\3\2\2\2\65\u00dd\3\2\2\2\67\u00e4\3\2\2"+
		"\29\u00eb\3\2\2\2;\u00ed\3\2\2\2=\u00f0\3\2\2\2?\u0102\3\2\2\2A\u0104"+
		"\3\2\2\2C\u010b\3\2\2\2E\u010e\3\2\2\2G\u011b\3\2\2\2I\u0120\3\2\2\2K"+
		"\u012f\3\2\2\2M\u0131\3\2\2\2O\u0137\3\2\2\2Q\u0139\3\2\2\2S\u013b\3\2"+
		"\2\2U\u0149\3\2\2\2W\u0156\3\2\2\2Y\u015f\3\2\2\2[\\\7.\2\2\\\4\3\2\2"+
		"\2]^\7\60\2\2^\6\3\2\2\2_`\7-\2\2`\b\3\2\2\2ab\7/\2\2b\n\3\2\2\2cd\7P"+
		"\2\2de\7w\2\2ef\7o\2\2fx\7\"\2\2gh\7D\2\2hi\7q\2\2ij\7q\2\2jk\7n\2\2k"+
		"x\7\"\2\2lm\7U\2\2mn\7v\2\2no\7t\2\2op\7k\2\2pq\7p\2\2qr\7i\2\2rx\7\""+
		"\2\2st\7R\2\2tu\7y\2\2uv\7o\2\2vx\7\"\2\2wc\3\2\2\2wg\3\2\2\2wl\3\2\2"+
		"\2ws\3\2\2\2x\f\3\2\2\2yz\7u\2\2z{\7g\2\2{|\7v\2\2|}\7w\2\2}~\7r\2\2~"+
		"\16\3\2\2\2\177\u0080\7n\2\2\u0080\u0081\7q\2\2\u0081\u0082\7q\2\2\u0082"+
		"\u0083\7r\2\2\u0083\20\3\2\2\2\u0084\u0085\7h\2\2\u0085\u0086\7w\2\2\u0086"+
		"\u0087\7p\2\2\u0087\u0088\7e\2\2\u0088\u0089\7\"\2\2\u0089\22\3\2\2\2"+
		"\u008a\u008b\7*\2\2\u008b\24\3\2\2\2\u008c\u008d\7+\2\2\u008d\26\3\2\2"+
		"\2\u008e\u008f\7}\2\2\u008f\30\3\2\2\2\u0090\u0091\7\177\2\2\u0091\32"+
		"\3\2\2\2\u0092\u0093\7]\2\2\u0093\34\3\2\2\2\u0094\u0095\7_\2\2\u0095"+
		"\36\3\2\2\2\u0096\u0097\7=\2\2\u0097 \3\2\2\2\u0098\u0099\7?\2\2\u0099"+
		"\"\3\2\2\2\u009a\u009b\7R\2\2\u009b\u009c\7k\2\2\u009c\u009d\7p\2\2\u009d"+
		"\u009e\7\"\2\2\u009e$\3\2\2\2\u009f\u00a0\7\60\2\2\u00a0\u00a1\7Y\2\2"+
		"\u00a1\u00a2\7t\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5"+
		"\7g\2\2\u00a5&\3\2\2\2\u00a6\u00a7\7\60\2\2\u00a7\u00a8\7T\2\2\u00a8\u00a9"+
		"\7g\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7f\2\2\u00ab\u00ac\7R\2\2\u00ac"+
		"\u00ad\7y\2\2\u00ad\u00ae\7o\2\2\u00ae(\3\2\2\2\u00af\u00b0\7\60\2\2\u00b0"+
		"\u00b1\7T\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7f\2\2"+
		"\u00b4\u00b5\7C\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8"+
		"\7n\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7i\2\2\u00ba*\3\2\2\2\u00bb\u00bc"+
		"\7\60\2\2\u00bc\u00bd\7T\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7c\2\2\u00bf"+
		"\u00c0\7f\2\2\u00c0\u00c1\7F\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7i\2\2"+
		"\u00c3\u00c4\7k\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7"+
		"\7n\2\2\u00c7,\3\2\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb"+
		"\7u\2\2\u00cb\u00cc\7g\2\2\u00cc.\3\2\2\2\u00cd\u00ce\7J\2\2\u00ce\u00cf"+
		"\7K\2\2\u00cf\u00d0\7I\2\2\u00d0\u00d1\7J\2\2\u00d1\60\3\2\2\2\u00d2\u00d3"+
		"\7N\2\2\u00d3\u00d4\7Q\2\2\u00d4\u00d5\7Y\2\2\u00d5\62\3\2\2\2\u00d6\u00d7"+
		"\7V\2\2\u00d7\u00d8\7Q\2\2\u00d8\u00d9\7I\2\2\u00d9\u00da\7I\2\2\u00da"+
		"\u00db\7N\2\2\u00db\u00dc\7G\2\2\u00dc\64\3\2\2\2\u00dd\u00de\7t\2\2\u00de"+
		"\u00df\7g\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7w\2\2\u00e1\u00e2\7t\2\2"+
		"\u00e2\u00e3\7p\2\2\u00e3\66\3\2\2\2\u00e4\u00e5\7$\2\2\u00e58\3\2\2\2"+
		"\u00e6\u00e7\7q\2\2\u00e7\u00e8\7w\2\2\u00e8\u00ec\7v\2\2\u00e9\u00ea"+
		"\7k\2\2\u00ea\u00ec\7p\2\2\u00eb\u00e6\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec"+
		":\3\2\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7h\2\2\u00ef<\3\2\2\2\u00f0\u00f1"+
		"\7y\2\2\u00f1\u00f2\7j\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7n\2\2\u00f4"+
		"\u00f5\7g\2\2\u00f5>\3\2\2\2\u00f6\u00f8\7F\2\2\u00f7\u00f9\t\2\2\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u0103\3\2\2\2\u00fc\u00fe\7C\2\2\u00fd\u00ff\t\2\2\2\u00fe"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0103\3\2\2\2\u0102\u00f6\3\2\2\2\u0102\u00fc\3\2\2\2\u0103"+
		"@\3\2\2\2\u0104\u0108\t\3\2\2\u0105\u0107\t\4\2\2\u0106\u0105\3\2\2\2"+
		"\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109B\3"+
		"\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\t\5\2\2\u010cD\3\2\2\2\u010d\u010f"+
		"\t\2\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111F\3\2\2\2\u0112\u0113\7v\2\2\u0113\u0114\7t\2\2\u0114"+
		"\u0115\7w\2\2\u0115\u011c\7g\2\2\u0116\u0117\7h\2\2\u0117\u0118\7c\2\2"+
		"\u0118\u0119\7n\2\2\u0119\u011a\7u\2\2\u011a\u011c\7g\2\2\u011b\u0112"+
		"\3\2\2\2\u011b\u0116\3\2\2\2\u011cH\3\2\2\2\u011d\u011f\13\2\2\2\u011e"+
		"\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u0121\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0121\u0126\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0125\n\6\2\2\u0124"+
		"\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127J\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u0130\3\2\2\2\u012a\u0130"+
		"\t\7\2\2\u012b\u012c\7?\2\2\u012c\u0130\7?\2\2\u012d\u012e\7#\2\2\u012e"+
		"\u0130\7?\2\2\u012f\u0129\3\2\2\2\u012f\u012a\3\2\2\2\u012f\u012b\3\2"+
		"\2\2\u012f\u012d\3\2\2\2\u0130L\3\2\2\2\u0131\u0132\t\b\2\2\u0132N\3\2"+
		"\2\2\u0133\u0134\7(\2\2\u0134\u0138\7(\2\2\u0135\u0136\7~\2\2\u0136\u0138"+
		"\7~\2\2\u0137\u0133\3\2\2\2\u0137\u0135\3\2\2\2\u0138P\3\2\2\2\u0139\u013a"+
		"\7#\2\2\u013aR\3\2\2\2\u013b\u013c\7\61\2\2\u013c\u013d\7,\2\2\u013d\u0141"+
		"\3\2\2\2\u013e\u0140\13\2\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2"+
		"\u0141\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0144\u0145\7,\2\2\u0145\u0146\7\61\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0148\b*\2\2\u0148T\3\2\2\2\u0149\u014a\7\61\2\2\u014a\u014b\7\61\2\2"+
		"\u014b\u014f\3\2\2\2\u014c\u014e\n\t\2\2\u014d\u014c\3\2\2\2\u014e\u0151"+
		"\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0152\u0153\b+\2\2\u0153V\3\2\2\2\u0154\u0157\t\n\2\2\u0155"+
		"\u0157\5Y-\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2"+
		"\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b"+
		"\b,\2\2\u015bX\3\2\2\2\u015c\u015d\7\17\2\2\u015d\u0160\7\f\2\2\u015e"+
		"\u0160\t\t\2\2\u015f\u015c\3\2\2\2\u015f\u015e\3\2\2\2\u0160Z\3\2\2\2"+
		"\24\2w\u00eb\u00fa\u0100\u0102\u0108\u0110\u011b\u0120\u0126\u012f\u0137"+
		"\u0141\u014f\u0156\u0158\u015f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}