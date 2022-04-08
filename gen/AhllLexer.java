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
		T__0=1, T__1=2, TYPE=3, PIN=4, RELATIONAL=5, ARITHMETIC=6, LOGICAL=7, 
		NEG=8, PLUS=9, MINUS=10, DIVIDE=11, MULT=12, MODULU=13, SETUP=14, LOOP=15, 
		FUNC=16, WRITE=17, READPWM=18, READA=19, READD=20, LPAREN=21, RPAREN=22, 
		LBRACE=23, RBRACE=24, LBRACKET=25, RBRACKET=26, END=27, EQUAL=28, NEGATIVE=29, 
		HIGH=30, LOW=31, PINMODE=32, TOGGLE=33, BOOL=34, IF=35, ELSE=36, RETURN=37, 
		WHILE=38, PINNUMBER=39, ID=40, INT=41, COMMENT=42, LINECOMMENT=43, WS=44, 
		NEWLINE=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "TYPE", "PIN", "RELATIONAL", "ARITHMETIC", "LOGICAL", 
			"NEG", "PLUS", "MINUS", "DIVIDE", "MULT", "MODULU", "SETUP", "LOOP", 
			"FUNC", "WRITE", "READPWM", "READA", "READD", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "LBRACKET", "RBRACKET", "END", "EQUAL", "NEGATIVE", "HIGH", 
			"LOW", "PINMODE", "TOGGLE", "BOOL", "IF", "ELSE", "RETURN", "WHILE", 
			"PINNUMBER", "ID", "INT", "COMMENT", "LINECOMMENT", "WS", "NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0158\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4o\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6{\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\5\7\u0082\n\7\3\b\3\b\3\b\3\b\5\b\u0088\n\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\5!\u00f0"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0102\n"+
		"#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\6(\u011b\n(\r(\16(\u011c\3(\3(\6(\u0121\n(\r(\16(\u0122\5(\u0125"+
		"\n(\3)\3)\7)\u0129\n)\f)\16)\u012c\13)\3*\6*\u012f\n*\r*\16*\u0130\3+"+
		"\3+\3+\3+\7+\u0137\n+\f+\16+\u013a\13+\3+\3+\3+\3+\3+\3,\3,\3,\3,\7,\u0145"+
		"\n,\f,\16,\u0148\13,\3,\3,\3-\3-\6-\u014e\n-\r-\16-\u014f\3-\3-\3.\3."+
		"\3.\5.\u0157\n.\3\u0138\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\b\4\2"+
		">>@@\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\4\2\13\13\"\"\2\u016c"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7n\3"+
		"\2\2\2\tp\3\2\2\2\13z\3\2\2\2\r\u0081\3\2\2\2\17\u0087\3\2\2\2\21\u0089"+
		"\3\2\2\2\23\u008b\3\2\2\2\25\u008d\3\2\2\2\27\u008f\3\2\2\2\31\u0091\3"+
		"\2\2\2\33\u0093\3\2\2\2\35\u0095\3\2\2\2\37\u009b\3\2\2\2!\u00a0\3\2\2"+
		"\2#\u00a6\3\2\2\2%\u00ad\3\2\2\2\'\u00b6\3\2\2\2)\u00c2\3\2\2\2+\u00cf"+
		"\3\2\2\2-\u00d1\3\2\2\2/\u00d3\3\2\2\2\61\u00d5\3\2\2\2\63\u00d7\3\2\2"+
		"\2\65\u00d9\3\2\2\2\67\u00db\3\2\2\29\u00dd\3\2\2\2;\u00df\3\2\2\2=\u00e1"+
		"\3\2\2\2?\u00e6\3\2\2\2A\u00ef\3\2\2\2C\u00f1\3\2\2\2E\u0101\3\2\2\2G"+
		"\u0103\3\2\2\2I\u0106\3\2\2\2K\u010b\3\2\2\2M\u0112\3\2\2\2O\u0124\3\2"+
		"\2\2Q\u0126\3\2\2\2S\u012e\3\2\2\2U\u0132\3\2\2\2W\u0140\3\2\2\2Y\u014d"+
		"\3\2\2\2[\u0156\3\2\2\2]^\7.\2\2^\4\3\2\2\2_`\7\60\2\2`\6\3\2\2\2ab\7"+
		"P\2\2bc\7w\2\2cd\7o\2\2do\7\"\2\2ef\7D\2\2fg\7q\2\2gh\7q\2\2hi\7n\2\2"+
		"io\7\"\2\2jk\7R\2\2kl\7y\2\2lm\7o\2\2mo\7\"\2\2na\3\2\2\2ne\3\2\2\2nj"+
		"\3\2\2\2o\b\3\2\2\2pq\7R\2\2qr\7k\2\2rs\7p\2\2st\7\"\2\2t\n\3\2\2\2u{"+
		"\t\2\2\2vw\7?\2\2w{\7?\2\2xy\7#\2\2y{\7?\2\2zu\3\2\2\2zv\3\2\2\2zx\3\2"+
		"\2\2{\f\3\2\2\2|\u0082\5\23\n\2}\u0082\5\25\13\2~\u0082\5\27\f\2\177\u0082"+
		"\5\31\r\2\u0080\u0082\5\33\16\2\u0081|\3\2\2\2\u0081}\3\2\2\2\u0081~\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\16\3\2\2\2\u0083\u0084"+
		"\7(\2\2\u0084\u0088\7(\2\2\u0085\u0086\7~\2\2\u0086\u0088\7~\2\2\u0087"+
		"\u0083\3\2\2\2\u0087\u0085\3\2\2\2\u0088\20\3\2\2\2\u0089\u008a\7#\2\2"+
		"\u008a\22\3\2\2\2\u008b\u008c\7-\2\2\u008c\24\3\2\2\2\u008d\u008e\7/\2"+
		"\2\u008e\26\3\2\2\2\u008f\u0090\7\61\2\2\u0090\30\3\2\2\2\u0091\u0092"+
		"\7,\2\2\u0092\32\3\2\2\2\u0093\u0094\7\'\2\2\u0094\34\3\2\2\2\u0095\u0096"+
		"\7u\2\2\u0096\u0097\7g\2\2\u0097\u0098\7v\2\2\u0098\u0099\7w\2\2\u0099"+
		"\u009a\7r\2\2\u009a\36\3\2\2\2\u009b\u009c\7n\2\2\u009c\u009d\7q\2\2\u009d"+
		"\u009e\7q\2\2\u009e\u009f\7r\2\2\u009f \3\2\2\2\u00a0\u00a1\7h\2\2\u00a1"+
		"\u00a2\7w\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5\7\"\2"+
		"\2\u00a5\"\3\2\2\2\u00a6\u00a7\7\60\2\2\u00a7\u00a8\7Y\2\2\u00a8\u00a9"+
		"\7t\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"$\3\2\2\2\u00ad\u00ae\7\60\2\2\u00ae\u00af\7T\2\2\u00af\u00b0\7g\2\2\u00b0"+
		"\u00b1\7c\2\2\u00b1\u00b2\7f\2\2\u00b2\u00b3\7R\2\2\u00b3\u00b4\7y\2\2"+
		"\u00b4\u00b5\7o\2\2\u00b5&\3\2\2\2\u00b6\u00b7\7\60\2\2\u00b7\u00b8\7"+
		"T\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7f\2\2\u00bb\u00bc"+
		"\7C\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7n\2\2\u00bf"+
		"\u00c0\7q\2\2\u00c0\u00c1\7i\2\2\u00c1(\3\2\2\2\u00c2\u00c3\7\60\2\2\u00c3"+
		"\u00c4\7T\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7f\2\2"+
		"\u00c7\u00c8\7F\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7i\2\2\u00ca\u00cb"+
		"\7k\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7n\2\2\u00ce"+
		"*\3\2\2\2\u00cf\u00d0\7*\2\2\u00d0,\3\2\2\2\u00d1\u00d2\7+\2\2\u00d2."+
		"\3\2\2\2\u00d3\u00d4\7}\2\2\u00d4\60\3\2\2\2\u00d5\u00d6\7\177\2\2\u00d6"+
		"\62\3\2\2\2\u00d7\u00d8\7]\2\2\u00d8\64\3\2\2\2\u00d9\u00da\7_\2\2\u00da"+
		"\66\3\2\2\2\u00db\u00dc\7=\2\2\u00dc8\3\2\2\2\u00dd\u00de\7?\2\2\u00de"+
		":\3\2\2\2\u00df\u00e0\7\u0080\2\2\u00e0<\3\2\2\2\u00e1\u00e2\7J\2\2\u00e2"+
		"\u00e3\7K\2\2\u00e3\u00e4\7I\2\2\u00e4\u00e5\7J\2\2\u00e5>\3\2\2\2\u00e6"+
		"\u00e7\7N\2\2\u00e7\u00e8\7Q\2\2\u00e8\u00e9\7Y\2\2\u00e9@\3\2\2\2\u00ea"+
		"\u00eb\7q\2\2\u00eb\u00ec\7w\2\2\u00ec\u00f0\7v\2\2\u00ed\u00ee\7k\2\2"+
		"\u00ee\u00f0\7p\2\2\u00ef\u00ea\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0B\3\2"+
		"\2\2\u00f1\u00f2\7V\2\2\u00f2\u00f3\7Q\2\2\u00f3\u00f4\7I\2\2\u00f4\u00f5"+
		"\7I\2\2\u00f5\u00f6\7N\2\2\u00f6\u00f7\7G\2\2\u00f7D\3\2\2\2\u00f8\u00f9"+
		"\7v\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7w\2\2\u00fb\u0102\7g\2\2\u00fc"+
		"\u00fd\7h\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7u\2\2"+
		"\u0100\u0102\7g\2\2\u0101\u00f8\3\2\2\2\u0101\u00fc\3\2\2\2\u0102F\3\2"+
		"\2\2\u0103\u0104\7k\2\2\u0104\u0105\7h\2\2\u0105H\3\2\2\2\u0106\u0107"+
		"\7g\2\2\u0107\u0108\7n\2\2\u0108\u0109\7u\2\2\u0109\u010a\7g\2\2\u010a"+
		"J\3\2\2\2\u010b\u010c\7t\2\2\u010c\u010d\7g\2\2\u010d\u010e\7v\2\2\u010e"+
		"\u010f\7w\2\2\u010f\u0110\7t\2\2\u0110\u0111\7p\2\2\u0111L\3\2\2\2\u0112"+
		"\u0113\7y\2\2\u0113\u0114\7j\2\2\u0114\u0115\7k\2\2\u0115\u0116\7n\2\2"+
		"\u0116\u0117\7g\2\2\u0117N\3\2\2\2\u0118\u011a\7F\2\2\u0119\u011b\t\3"+
		"\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u0125\3\2\2\2\u011e\u0120\7C\2\2\u011f\u0121\t\3"+
		"\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0118\3\2\2\2\u0124\u011e\3\2"+
		"\2\2\u0125P\3\2\2\2\u0126\u012a\t\4\2\2\u0127\u0129\t\5\2\2\u0128\u0127"+
		"\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"R\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012f\t\3\2\2\u012e\u012d\3\2\2\2"+
		"\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131T\3"+
		"\2\2\2\u0132\u0133\7\61\2\2\u0133\u0134\7,\2\2\u0134\u0138\3\2\2\2\u0135"+
		"\u0137\13\2\2\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0139\3"+
		"\2\2\2\u0138\u0136\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b"+
		"\u013c\7,\2\2\u013c\u013d\7\61\2\2\u013d\u013e\3\2\2\2\u013e\u013f\b+"+
		"\2\2\u013fV\3\2\2\2\u0140\u0141\7\61\2\2\u0141\u0142\7\61\2\2\u0142\u0146"+
		"\3\2\2\2\u0143\u0145\n\6\2\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2"+
		"\2\2\u0149\u014a\b,\2\2\u014aX\3\2\2\2\u014b\u014e\t\7\2\2\u014c\u014e"+
		"\5[.\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\b-"+
		"\2\2\u0152Z\3\2\2\2\u0153\u0154\7\17\2\2\u0154\u0157\7\f\2\2\u0155\u0157"+
		"\t\6\2\2\u0156\u0153\3\2\2\2\u0156\u0155\3\2\2\2\u0157\\\3\2\2\2\23\2"+
		"nz\u0081\u0087\u00ef\u0101\u011c\u0122\u0124\u012a\u0130\u0138\u0146\u014d"+
		"\u014f\u0156\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}