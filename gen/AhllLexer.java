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
		T__0=1, T__1=2, TYPE=3, RELATIONAL=4, ARITHMETIC=5, LOGICAL=6, SETUP=7, 
		LOOP=8, FUNC=9, LPAREN=10, RPAREN=11, LBRACE=12, RBRACE=13, LBRACKET=14, 
		RBRACKET=15, END=16, EQUAL=17, PIN=18, WRITE=19, READPWM=20, READA=21, 
		READD=22, ELSE=23, HIGH=24, LOW=25, TOGGLE=26, RETURN=27, IF=28, WHILE=29, 
		NEG=30, NEGATIVE=31, PINMODE=32, PINNUMBER=33, ID=34, INT=35, BOOL=36, 
		COMMENT=37, LINECOMMENT=38, WS=39, NEWLINE=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "TYPE", "RELATIONAL", "ARITHMETIC", "LOGICAL", "SETUP", 
			"LOOP", "FUNC", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", 
			"END", "EQUAL", "PIN", "WRITE", "READPWM", "READA", "READD", "ELSE", 
			"HIGH", "LOW", "TOGGLE", "RETURN", "IF", "WHILE", "NEG", "NEGATIVE", 
			"PINMODE", "PINNUMBER", "ID", "INT", "BOOL", "COMMENT", "LINECOMMENT", 
			"WS", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'.'", null, null, null, null, "'setup'", "'loop'", "'func '", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "'='", "'Pin '", "'.Write'", 
			"'.ReadPwm'", "'.ReadAnalog'", "'.ReadDigital'", "'else'", "'HIGH'", 
			"'LOW'", "'TOGGLE'", "'return'", "'if'", "'while'", "'!'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "TYPE", "RELATIONAL", "ARITHMETIC", "LOGICAL", "SETUP", 
			"LOOP", "FUNC", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", 
			"END", "EQUAL", "PIN", "WRITE", "READPWM", "READA", "READD", "ELSE", 
			"HIGH", "LOW", "TOGGLE", "RETURN", "IF", "WHILE", "NEG", "NEGATIVE", 
			"PINMODE", "PINNUMBER", "ID", "INT", "BOOL", "COMMENT", "LINECOMMENT", 
			"WS", "NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0140\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4e\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5m\n\5\3\6\3\6\3\7\3\7\3\7\3\7\5\7u\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3!\3!\3!\5!\u00f4\n!\3\"\3\"\6\"\u00f8\n\"\r\"\16\"\u00f9"+
		"\3\"\3\"\6\"\u00fe\n\"\r\"\16\"\u00ff\5\"\u0102\n\"\3#\3#\7#\u0106\n#"+
		"\f#\16#\u0109\13#\3$\6$\u010c\n$\r$\16$\u010d\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\5%\u0119\n%\3&\3&\3&\3&\7&\u011f\n&\f&\16&\u0122\13&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\7\'\u012d\n\'\f\'\16\'\u0130\13\'\3\'\3\'\3(\3(\6(\u0136"+
		"\n(\r(\16(\u0137\3(\3(\3)\3)\3)\5)\u013f\n)\3\u0120\2*\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*\3\2\t\4\2>>@@\6\2\'\',-//\61\61\3\2\62;\5\2C\\aac|\6\2\62;C\\"+
		"aac|\4\2\f\f\17\17\4\2\13\13\"\"\2\u0151\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7d\3\2\2\2\tl\3\2\2"+
		"\2\13n\3\2\2\2\rt\3\2\2\2\17v\3\2\2\2\21|\3\2\2\2\23\u0081\3\2\2\2\25"+
		"\u0087\3\2\2\2\27\u0089\3\2\2\2\31\u008b\3\2\2\2\33\u008d\3\2\2\2\35\u008f"+
		"\3\2\2\2\37\u0091\3\2\2\2!\u0093\3\2\2\2#\u0095\3\2\2\2%\u0097\3\2\2\2"+
		"\'\u009c\3\2\2\2)\u00a3\3\2\2\2+\u00ac\3\2\2\2-\u00b8\3\2\2\2/\u00c5\3"+
		"\2\2\2\61\u00ca\3\2\2\2\63\u00cf\3\2\2\2\65\u00d3\3\2\2\2\67\u00da\3\2"+
		"\2\29\u00e1\3\2\2\2;\u00e4\3\2\2\2=\u00ea\3\2\2\2?\u00ec\3\2\2\2A\u00f3"+
		"\3\2\2\2C\u0101\3\2\2\2E\u0103\3\2\2\2G\u010b\3\2\2\2I\u0118\3\2\2\2K"+
		"\u011a\3\2\2\2M\u0128\3\2\2\2O\u0135\3\2\2\2Q\u013e\3\2\2\2ST\7.\2\2T"+
		"\4\3\2\2\2UV\7\60\2\2V\6\3\2\2\2WX\7P\2\2XY\7w\2\2YZ\7o\2\2Ze\7\"\2\2"+
		"[\\\7D\2\2\\]\7q\2\2]^\7q\2\2^_\7n\2\2_e\7\"\2\2`a\7R\2\2ab\7y\2\2bc\7"+
		"o\2\2ce\7\"\2\2dW\3\2\2\2d[\3\2\2\2d`\3\2\2\2e\b\3\2\2\2fm\3\2\2\2gm\t"+
		"\2\2\2hi\7?\2\2im\7?\2\2jk\7#\2\2km\7?\2\2lf\3\2\2\2lg\3\2\2\2lh\3\2\2"+
		"\2lj\3\2\2\2m\n\3\2\2\2no\t\3\2\2o\f\3\2\2\2pq\7(\2\2qu\7(\2\2rs\7~\2"+
		"\2su\7~\2\2tp\3\2\2\2tr\3\2\2\2u\16\3\2\2\2vw\7u\2\2wx\7g\2\2xy\7v\2\2"+
		"yz\7w\2\2z{\7r\2\2{\20\3\2\2\2|}\7n\2\2}~\7q\2\2~\177\7q\2\2\177\u0080"+
		"\7r\2\2\u0080\22\3\2\2\2\u0081\u0082\7h\2\2\u0082\u0083\7w\2\2\u0083\u0084"+
		"\7p\2\2\u0084\u0085\7e\2\2\u0085\u0086\7\"\2\2\u0086\24\3\2\2\2\u0087"+
		"\u0088\7*\2\2\u0088\26\3\2\2\2\u0089\u008a\7+\2\2\u008a\30\3\2\2\2\u008b"+
		"\u008c\7}\2\2\u008c\32\3\2\2\2\u008d\u008e\7\177\2\2\u008e\34\3\2\2\2"+
		"\u008f\u0090\7]\2\2\u0090\36\3\2\2\2\u0091\u0092\7_\2\2\u0092 \3\2\2\2"+
		"\u0093\u0094\7=\2\2\u0094\"\3\2\2\2\u0095\u0096\7?\2\2\u0096$\3\2\2\2"+
		"\u0097\u0098\7R\2\2\u0098\u0099\7k\2\2\u0099\u009a\7p\2\2\u009a\u009b"+
		"\7\"\2\2\u009b&\3\2\2\2\u009c\u009d\7\60\2\2\u009d\u009e\7Y\2\2\u009e"+
		"\u009f\7t\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7g\2\2"+
		"\u00a2(\3\2\2\2\u00a3\u00a4\7\60\2\2\u00a4\u00a5\7T\2\2\u00a5\u00a6\7"+
		"g\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7f\2\2\u00a8\u00a9\7R\2\2\u00a9\u00aa"+
		"\7y\2\2\u00aa\u00ab\7o\2\2\u00ab*\3\2\2\2\u00ac\u00ad\7\60\2\2\u00ad\u00ae"+
		"\7T\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7f\2\2\u00b1"+
		"\u00b2\7C\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7n\2\2"+
		"\u00b5\u00b6\7q\2\2\u00b6\u00b7\7i\2\2\u00b7,\3\2\2\2\u00b8\u00b9\7\60"+
		"\2\2\u00b9\u00ba\7T\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd"+
		"\7f\2\2\u00bd\u00be\7F\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7i\2\2\u00c0"+
		"\u00c1\7k\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7n\2\2"+
		"\u00c4.\3\2\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7u\2"+
		"\2\u00c8\u00c9\7g\2\2\u00c9\60\3\2\2\2\u00ca\u00cb\7J\2\2\u00cb\u00cc"+
		"\7K\2\2\u00cc\u00cd\7I\2\2\u00cd\u00ce\7J\2\2\u00ce\62\3\2\2\2\u00cf\u00d0"+
		"\7N\2\2\u00d0\u00d1\7Q\2\2\u00d1\u00d2\7Y\2\2\u00d2\64\3\2\2\2\u00d3\u00d4"+
		"\7V\2\2\u00d4\u00d5\7Q\2\2\u00d5\u00d6\7I\2\2\u00d6\u00d7\7I\2\2\u00d7"+
		"\u00d8\7N\2\2\u00d8\u00d9\7G\2\2\u00d9\66\3\2\2\2\u00da\u00db\7t\2\2\u00db"+
		"\u00dc\7g\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7t\2\2"+
		"\u00df\u00e0\7p\2\2\u00e08\3\2\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7h\2"+
		"\2\u00e3:\3\2\2\2\u00e4\u00e5\7y\2\2\u00e5\u00e6\7j\2\2\u00e6\u00e7\7"+
		"k\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7g\2\2\u00e9<\3\2\2\2\u00ea\u00eb"+
		"\7#\2\2\u00eb>\3\2\2\2\u00ec\u00ed\7/\2\2\u00ed@\3\2\2\2\u00ee\u00ef\7"+
		"q\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f4\7v\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f4"+
		"\7p\2\2\u00f3\u00ee\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4B\3\2\2\2\u00f5\u00f7"+
		"\7F\2\2\u00f6\u00f8\t\4\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0102\3\2\2\2\u00fb\u00fd\7C"+
		"\2\2\u00fc\u00fe\t\4\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00f5\3\2"+
		"\2\2\u0101\u00fb\3\2\2\2\u0102D\3\2\2\2\u0103\u0107\t\5\2\2\u0104\u0106"+
		"\t\6\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108F\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010c\t\4\2\2"+
		"\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010eH\3\2\2\2\u010f\u0110\7v\2\2\u0110\u0111\7t\2\2\u0111\u0112"+
		"\7w\2\2\u0112\u0119\7g\2\2\u0113\u0114\7h\2\2\u0114\u0115\7c\2\2\u0115"+
		"\u0116\7n\2\2\u0116\u0117\7u\2\2\u0117\u0119\7g\2\2\u0118\u010f\3\2\2"+
		"\2\u0118\u0113\3\2\2\2\u0119J\3\2\2\2\u011a\u011b\7\61\2\2\u011b\u011c"+
		"\7,\2\2\u011c\u0120\3\2\2\2\u011d\u011f\13\2\2\2\u011e\u011d\3\2\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0123\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7,\2\2\u0124\u0125\7\61\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0127\b&\2\2\u0127L\3\2\2\2\u0128\u0129\7\61\2\2"+
		"\u0129\u012a\7\61\2\2\u012a\u012e\3\2\2\2\u012b\u012d\n\7\2\2\u012c\u012b"+
		"\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\b\'\2\2\u0132N\3\2\2\2"+
		"\u0133\u0136\t\b\2\2\u0134\u0136\5Q)\2\u0135\u0133\3\2\2\2\u0135\u0134"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013a\b(\2\2\u013aP\3\2\2\2\u013b\u013c\7\17\2\2"+
		"\u013c\u013f\7\f\2\2\u013d\u013f\t\7\2\2\u013e\u013b\3\2\2\2\u013e\u013d"+
		"\3\2\2\2\u013fR\3\2\2\2\22\2dlt\u00f3\u00f9\u00ff\u0101\u0107\u010d\u0118"+
		"\u0120\u012e\u0135\u0137\u013e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}