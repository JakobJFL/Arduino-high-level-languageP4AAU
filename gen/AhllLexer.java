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
		T__0=1, T__1=2, TYPE=3, SETUP=4, LOOP=5, FUNC=6, LPAREN=7, RPAREN=8, LBRACE=9, 
		RBRACE=10, LBRACKET=11, RBRACKET=12, END=13, EQUAL=14, PIN=15, WRITE=16, 
		READPWM=17, READA=18, READD=19, ELSE=20, HIGH=21, LOW=22, RETURN=23, PINMODE=24, 
		IF=25, WHILE=26, PINNUMBER=27, ID=28, INT=29, BOOL=30, RELATIONAL=31, 
		ARITHMETIC=32, LOGICAL=33, NEG=34, COMMENT=35, LINECOMMENT=36, WS=37, 
		NEWLINE=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "TYPE", "SETUP", "LOOP", "FUNC", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "END", "EQUAL", "PIN", "WRITE", 
			"READPWM", "READA", "READD", "ELSE", "HIGH", "LOW", "RETURN", "PINMODE", 
			"IF", "WHILE", "PINNUMBER", "ID", "INT", "BOOL", "RELATIONAL", "ARITHMETIC", 
			"LOGICAL", "NEG", "COMMENT", "LINECOMMENT", "WS", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'.'", null, "'setup'", "'loop'", "'func '", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "';'", "'='", "'Pin '", "'.Write'", "'.ReadPwm'", 
			"'.ReadAnalog'", "'.ReadDigital'", "'else'", "'HIGH'", "'LOW'", "'return'", 
			null, "'if'", "'while'", null, null, null, null, null, null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "TYPE", "SETUP", "LOOP", "FUNC", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "END", "EQUAL", "PIN", "WRITE", 
			"READPWM", "READA", "READD", "ELSE", "HIGH", "LOW", "RETURN", "PINMODE", 
			"IF", "WHILE", "PINNUMBER", "ID", "INT", "BOOL", "RELATIONAL", "ARITHMETIC", 
			"LOGICAL", "NEG", "COMMENT", "LINECOMMENT", "WS", "NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0142\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4h\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\5\31\u00d3\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\6\34\u00e0\n\34\r\34\16\34\u00e1\3\34\3\34\6\34\u00e6"+
		"\n\34\r\34\16\34\u00e7\5\34\u00ea\n\34\3\35\3\35\7\35\u00ee\n\35\f\35"+
		"\16\35\u00f1\13\35\3\36\3\36\6\36\u00f5\n\36\r\36\16\36\u00f6\3\36\6\36"+
		"\u00fa\n\36\r\36\16\36\u00fb\5\36\u00fe\n\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u0109\n\37\3 \3 \3 \3 \3 \3 \5 \u0111\n \3!"+
		"\3!\3\"\3\"\3\"\3\"\5\"\u0119\n\"\3#\3#\3$\3$\3$\3$\7$\u0121\n$\f$\16"+
		"$\u0124\13$\3$\3$\3$\3$\3$\3%\3%\3%\3%\7%\u012f\n%\f%\16%\u0132\13%\3"+
		"%\3%\3&\3&\6&\u0138\n&\r&\16&\u0139\3&\3&\3\'\3\'\3\'\5\'\u0141\n\'\3"+
		"\u0122\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\t\3\2\62;\5\2C\\aac|\6\2\62;C\\aa"+
		"c|\4\2>>@@\6\2\'\',-//\61\61\4\2\f\f\17\17\4\2\13\13\"\"\2\u0156\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7g\3\2\2\2\ti\3\2"+
		"\2\2\13o\3\2\2\2\rt\3\2\2\2\17z\3\2\2\2\21|\3\2\2\2\23~\3\2\2\2\25\u0080"+
		"\3\2\2\2\27\u0082\3\2\2\2\31\u0084\3\2\2\2\33\u0086\3\2\2\2\35\u0088\3"+
		"\2\2\2\37\u008a\3\2\2\2!\u008f\3\2\2\2#\u0096\3\2\2\2%\u009f\3\2\2\2\'"+
		"\u00ab\3\2\2\2)\u00b8\3\2\2\2+\u00bd\3\2\2\2-\u00c2\3\2\2\2/\u00c6\3\2"+
		"\2\2\61\u00d2\3\2\2\2\63\u00d4\3\2\2\2\65\u00d7\3\2\2\2\67\u00e9\3\2\2"+
		"\29\u00eb\3\2\2\2;\u00fd\3\2\2\2=\u0108\3\2\2\2?\u0110\3\2\2\2A\u0112"+
		"\3\2\2\2C\u0118\3\2\2\2E\u011a\3\2\2\2G\u011c\3\2\2\2I\u012a\3\2\2\2K"+
		"\u0137\3\2\2\2M\u0140\3\2\2\2OP\7.\2\2P\4\3\2\2\2QR\7\60\2\2R\6\3\2\2"+
		"\2ST\7P\2\2TU\7w\2\2UV\7o\2\2Vh\7\"\2\2WX\7D\2\2XY\7q\2\2YZ\7q\2\2Z[\7"+
		"n\2\2[h\7\"\2\2\\]\7U\2\2]^\7v\2\2^_\7t\2\2_`\7k\2\2`a\7p\2\2ab\7i\2\2"+
		"bh\7\"\2\2cd\7R\2\2de\7y\2\2ef\7o\2\2fh\7\"\2\2gS\3\2\2\2gW\3\2\2\2g\\"+
		"\3\2\2\2gc\3\2\2\2h\b\3\2\2\2ij\7u\2\2jk\7g\2\2kl\7v\2\2lm\7w\2\2mn\7"+
		"r\2\2n\n\3\2\2\2op\7n\2\2pq\7q\2\2qr\7q\2\2rs\7r\2\2s\f\3\2\2\2tu\7h\2"+
		"\2uv\7w\2\2vw\7p\2\2wx\7e\2\2xy\7\"\2\2y\16\3\2\2\2z{\7*\2\2{\20\3\2\2"+
		"\2|}\7+\2\2}\22\3\2\2\2~\177\7}\2\2\177\24\3\2\2\2\u0080\u0081\7\177\2"+
		"\2\u0081\26\3\2\2\2\u0082\u0083\7]\2\2\u0083\30\3\2\2\2\u0084\u0085\7"+
		"_\2\2\u0085\32\3\2\2\2\u0086\u0087\7=\2\2\u0087\34\3\2\2\2\u0088\u0089"+
		"\7?\2\2\u0089\36\3\2\2\2\u008a\u008b\7R\2\2\u008b\u008c\7k\2\2\u008c\u008d"+
		"\7p\2\2\u008d\u008e\7\"\2\2\u008e \3\2\2\2\u008f\u0090\7\60\2\2\u0090"+
		"\u0091\7Y\2\2\u0091\u0092\7t\2\2\u0092\u0093\7k\2\2\u0093\u0094\7v\2\2"+
		"\u0094\u0095\7g\2\2\u0095\"\3\2\2\2\u0096\u0097\7\60\2\2\u0097\u0098\7"+
		"T\2\2\u0098\u0099\7g\2\2\u0099\u009a\7c\2\2\u009a\u009b\7f\2\2\u009b\u009c"+
		"\7R\2\2\u009c\u009d\7y\2\2\u009d\u009e\7o\2\2\u009e$\3\2\2\2\u009f\u00a0"+
		"\7\60\2\2\u00a0\u00a1\7T\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7c\2\2\u00a3"+
		"\u00a4\7f\2\2\u00a4\u00a5\7C\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7c\2\2"+
		"\u00a7\u00a8\7n\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7i\2\2\u00aa&\3\2\2"+
		"\2\u00ab\u00ac\7\60\2\2\u00ac\u00ad\7T\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af"+
		"\7c\2\2\u00af\u00b0\7f\2\2\u00b0\u00b1\7F\2\2\u00b1\u00b2\7k\2\2\u00b2"+
		"\u00b3\7i\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7c\2\2"+
		"\u00b6\u00b7\7n\2\2\u00b7(\3\2\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7n\2"+
		"\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7g\2\2\u00bc*\3\2\2\2\u00bd\u00be\7"+
		"J\2\2\u00be\u00bf\7K\2\2\u00bf\u00c0\7I\2\2\u00c0\u00c1\7J\2\2\u00c1,"+
		"\3\2\2\2\u00c2\u00c3\7N\2\2\u00c3\u00c4\7Q\2\2\u00c4\u00c5\7Y\2\2\u00c5"+
		".\3\2\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7v\2\2\u00c9"+
		"\u00ca\7w\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7p\2\2\u00cc\60\3\2\2\2\u00cd"+
		"\u00ce\7q\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d3\7v\2\2\u00d0\u00d1\7k\2\2"+
		"\u00d1\u00d3\7p\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\62\3"+
		"\2\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7h\2\2\u00d6\64\3\2\2\2\u00d7\u00d8"+
		"\7y\2\2\u00d8\u00d9\7j\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7n\2\2\u00db"+
		"\u00dc\7g\2\2\u00dc\66\3\2\2\2\u00dd\u00df\7F\2\2\u00de\u00e0\t\2\2\2"+
		"\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00ea\3\2\2\2\u00e3\u00e5\7C\2\2\u00e4\u00e6\t\2\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00dd\3\2\2\2\u00e9\u00e3\3\2\2\2\u00ea"+
		"8\3\2\2\2\u00eb\u00ef\t\3\2\2\u00ec\u00ee\t\4\2\2\u00ed\u00ec\3\2\2\2"+
		"\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0:\3"+
		"\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f4\7/\2\2\u00f3\u00f5\t\2\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00fe\3\2\2\2\u00f8\u00fa\t\2\2\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2"+
		"\2\2\u00fd\u00f2\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fe<\3\2\2\2\u00ff\u0100"+
		"\7v\2\2\u0100\u0101\7t\2\2\u0101\u0102\7w\2\2\u0102\u0109\7g\2\2\u0103"+
		"\u0104\7h\2\2\u0104\u0105\7c\2\2\u0105\u0106\7n\2\2\u0106\u0107\7u\2\2"+
		"\u0107\u0109\7g\2\2\u0108\u00ff\3\2\2\2\u0108\u0103\3\2\2\2\u0109>\3\2"+
		"\2\2\u010a\u0111\3\2\2\2\u010b\u0111\t\5\2\2\u010c\u010d\7?\2\2\u010d"+
		"\u0111\7?\2\2\u010e\u010f\7#\2\2\u010f\u0111\7?\2\2\u0110\u010a\3\2\2"+
		"\2\u0110\u010b\3\2\2\2\u0110\u010c\3\2\2\2\u0110\u010e\3\2\2\2\u0111@"+
		"\3\2\2\2\u0112\u0113\t\6\2\2\u0113B\3\2\2\2\u0114\u0115\7(\2\2\u0115\u0119"+
		"\7(\2\2\u0116\u0117\7~\2\2\u0117\u0119\7~\2\2\u0118\u0114\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119D\3\2\2\2\u011a\u011b\7#\2\2\u011bF\3\2\2\2\u011c"+
		"\u011d\7\61\2\2\u011d\u011e\7,\2\2\u011e\u0122\3\2\2\2\u011f\u0121\13"+
		"\2\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0123\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7,"+
		"\2\2\u0126\u0127\7\61\2\2\u0127\u0128\3\2\2\2\u0128\u0129\b$\2\2\u0129"+
		"H\3\2\2\2\u012a\u012b\7\61\2\2\u012b\u012c\7\61\2\2\u012c\u0130\3\2\2"+
		"\2\u012d\u012f\n\7\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133"+
		"\u0134\b%\2\2\u0134J\3\2\2\2\u0135\u0138\t\b\2\2\u0136\u0138\5M\'\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0137\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\b&\2\2\u013c"+
		"L\3\2\2\2\u013d\u013e\7\17\2\2\u013e\u0141\7\f\2\2\u013f\u0141\t\7\2\2"+
		"\u0140\u013d\3\2\2\2\u0140\u013f\3\2\2\2\u0141N\3\2\2\2\24\2g\u00d2\u00e1"+
		"\u00e7\u00e9\u00ef\u00f6\u00fb\u00fd\u0108\u0110\u0118\u0122\u0130\u0137"+
		"\u0139\u0140\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}