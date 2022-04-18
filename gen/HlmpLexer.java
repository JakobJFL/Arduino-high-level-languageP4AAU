// Generated from C:/Users/JFL/Documents/GitHub/Arduino-high-level-languageP4AAU/src/main/java\Hlmp.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HlmpLexer extends Lexer {
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
			"END", "ASSIGN", "NEGATIVE", "HIGH", "LOW", "PINMODE", "TOGGLE", "BOOL", 
			"IF", "ELSE", "RETURN", "WHILE", "PINNUMBER", "INT", "ID", "COMMENT", 
			"LINECOMMENT", "WS", "NEWLINE"
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


	public HlmpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hlmp.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0169\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4w\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u0082\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u0089"+
		"\n\7\3\b\3\b\5\b\u008d\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\5%\u0101"+
		"\n%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0113"+
		"\n\'\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3"+
		",\3,\6,\u012c\n,\r,\16,\u012d\3,\3,\6,\u0132\n,\r,\16,\u0133\5,\u0136"+
		"\n,\3-\6-\u0139\n-\r-\16-\u013a\3.\3.\7.\u013f\n.\f.\16.\u0142\13.\3/"+
		"\3/\3/\3/\7/\u0148\n/\f/\16/\u014b\13/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3"+
		"\60\7\60\u0156\n\60\f\60\16\60\u0159\13\60\3\60\3\60\3\61\3\61\6\61\u015f"+
		"\n\61\r\61\16\61\u0160\3\61\3\61\3\62\3\62\3\62\5\62\u0168\n\62\3\u0149"+
		"\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63\3\2\7\3\2\62;\5"+
		"\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\4\2\13\13\"\"\2\u017e\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\3e\3\2\2\2\5g\3\2\2\2\7v\3\2\2\2\tx\3\2\2\2\13\u0081\3\2\2\2\r"+
		"\u0088\3\2\2\2\17\u008c\3\2\2\2\21\u008e\3\2\2\2\23\u0090\3\2\2\2\25\u0092"+
		"\3\2\2\2\27\u0094\3\2\2\2\31\u0096\3\2\2\2\33\u0098\3\2\2\2\35\u009a\3"+
		"\2\2\2\37\u009c\3\2\2\2!\u009e\3\2\2\2#\u00a1\3\2\2\2%\u00a4\3\2\2\2\'"+
		"\u00a7\3\2\2\2)\u00aa\3\2\2\2+\u00b0\3\2\2\2-\u00b5\3\2\2\2/\u00bb\3\2"+
		"\2\2\61\u00c2\3\2\2\2\63\u00cb\3\2\2\2\65\u00d7\3\2\2\2\67\u00e4\3\2\2"+
		"\29\u00e6\3\2\2\2;\u00e8\3\2\2\2=\u00ea\3\2\2\2?\u00ec\3\2\2\2A\u00ee"+
		"\3\2\2\2C\u00f0\3\2\2\2E\u00f2\3\2\2\2G\u00f7\3\2\2\2I\u0100\3\2\2\2K"+
		"\u0102\3\2\2\2M\u0112\3\2\2\2O\u0114\3\2\2\2Q\u0117\3\2\2\2S\u011c\3\2"+
		"\2\2U\u0123\3\2\2\2W\u0135\3\2\2\2Y\u0138\3\2\2\2[\u013c\3\2\2\2]\u0143"+
		"\3\2\2\2_\u0151\3\2\2\2a\u015e\3\2\2\2c\u0167\3\2\2\2ef\7.\2\2f\4\3\2"+
		"\2\2gh\7\60\2\2h\6\3\2\2\2ij\7P\2\2jk\7w\2\2kl\7o\2\2lw\7\"\2\2mn\7D\2"+
		"\2no\7q\2\2op\7q\2\2pq\7n\2\2qw\7\"\2\2rs\7R\2\2st\7y\2\2tu\7o\2\2uw\7"+
		"\"\2\2vi\3\2\2\2vm\3\2\2\2vr\3\2\2\2w\b\3\2\2\2xy\7R\2\2yz\7k\2\2z{\7"+
		"p\2\2{|\7\"\2\2|\n\3\2\2\2}\u0082\5\35\17\2~\u0082\5\37\20\2\177\u0082"+
		"\5!\21\2\u0080\u0082\5#\22\2\u0081}\3\2\2\2\u0081~\3\2\2\2\u0081\177\3"+
		"\2\2\2\u0081\u0080\3\2\2\2\u0082\f\3\2\2\2\u0083\u0089\5\23\n\2\u0084"+
		"\u0089\5\25\13\2\u0085\u0089\5\27\f\2\u0086\u0089\5\31\r\2\u0087\u0089"+
		"\5\33\16\2\u0088\u0083\3\2\2\2\u0088\u0084\3\2\2\2\u0088\u0085\3\2\2\2"+
		"\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\16\3\2\2\2\u008a\u008d"+
		"\5%\23\2\u008b\u008d\5\'\24\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2"+
		"\u008d\20\3\2\2\2\u008e\u008f\7#\2\2\u008f\22\3\2\2\2\u0090\u0091\7-\2"+
		"\2\u0091\24\3\2\2\2\u0092\u0093\7/\2\2\u0093\26\3\2\2\2\u0094\u0095\7"+
		"\61\2\2\u0095\30\3\2\2\2\u0096\u0097\7,\2\2\u0097\32\3\2\2\2\u0098\u0099"+
		"\7\'\2\2\u0099\34\3\2\2\2\u009a\u009b\7>\2\2\u009b\36\3\2\2\2\u009c\u009d"+
		"\7@\2\2\u009d \3\2\2\2\u009e\u009f\7?\2\2\u009f\u00a0\7?\2\2\u00a0\"\3"+
		"\2\2\2\u00a1\u00a2\7#\2\2\u00a2\u00a3\7?\2\2\u00a3$\3\2\2\2\u00a4\u00a5"+
		"\7(\2\2\u00a5\u00a6\7(\2\2\u00a6&\3\2\2\2\u00a7\u00a8\7~\2\2\u00a8\u00a9"+
		"\7~\2\2\u00a9(\3\2\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad"+
		"\7v\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7r\2\2\u00af*\3\2\2\2\u00b0\u00b1"+
		"\7n\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7r\2\2\u00b4"+
		",\3\2\2\2\u00b5\u00b6\7h\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8\7p\2\2\u00b8"+
		"\u00b9\7e\2\2\u00b9\u00ba\7\"\2\2\u00ba.\3\2\2\2\u00bb\u00bc\7\60\2\2"+
		"\u00bc\u00bd\7Y\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0"+
		"\7v\2\2\u00c0\u00c1\7g\2\2\u00c1\60\3\2\2\2\u00c2\u00c3\7\60\2\2\u00c3"+
		"\u00c4\7T\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7f\2\2"+
		"\u00c7\u00c8\7R\2\2\u00c8\u00c9\7y\2\2\u00c9\u00ca\7o\2\2\u00ca\62\3\2"+
		"\2\2\u00cb\u00cc\7\60\2\2\u00cc\u00cd\7T\2\2\u00cd\u00ce\7g\2\2\u00ce"+
		"\u00cf\7c\2\2\u00cf\u00d0\7f\2\2\u00d0\u00d1\7C\2\2\u00d1\u00d2\7p\2\2"+
		"\u00d2\u00d3\7c\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6"+
		"\7i\2\2\u00d6\64\3\2\2\2\u00d7\u00d8\7\60\2\2\u00d8\u00d9\7T\2\2\u00d9"+
		"\u00da\7g\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7F\2\2"+
		"\u00dd\u00de\7k\2\2\u00de\u00df\7i\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1"+
		"\7v\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7n\2\2\u00e3\66\3\2\2\2\u00e4\u00e5"+
		"\7*\2\2\u00e58\3\2\2\2\u00e6\u00e7\7+\2\2\u00e7:\3\2\2\2\u00e8\u00e9\7"+
		"}\2\2\u00e9<\3\2\2\2\u00ea\u00eb\7\177\2\2\u00eb>\3\2\2\2\u00ec\u00ed"+
		"\7=\2\2\u00ed@\3\2\2\2\u00ee\u00ef\7?\2\2\u00efB\3\2\2\2\u00f0\u00f1\7"+
		"\u0080\2\2\u00f1D\3\2\2\2\u00f2\u00f3\7J\2\2\u00f3\u00f4\7K\2\2\u00f4"+
		"\u00f5\7I\2\2\u00f5\u00f6\7J\2\2\u00f6F\3\2\2\2\u00f7\u00f8\7N\2\2\u00f8"+
		"\u00f9\7Q\2\2\u00f9\u00fa\7Y\2\2\u00faH\3\2\2\2\u00fb\u00fc\7q\2\2\u00fc"+
		"\u00fd\7w\2\2\u00fd\u0101\7v\2\2\u00fe\u00ff\7k\2\2\u00ff\u0101\7p\2\2"+
		"\u0100\u00fb\3\2\2\2\u0100\u00fe\3\2\2\2\u0101J\3\2\2\2\u0102\u0103\7"+
		"V\2\2\u0103\u0104\7Q\2\2\u0104\u0105\7I\2\2\u0105\u0106\7I\2\2\u0106\u0107"+
		"\7N\2\2\u0107\u0108\7G\2\2\u0108L\3\2\2\2\u0109\u010a\7v\2\2\u010a\u010b"+
		"\7t\2\2\u010b\u010c\7w\2\2\u010c\u0113\7g\2\2\u010d\u010e\7h\2\2\u010e"+
		"\u010f\7c\2\2\u010f\u0110\7n\2\2\u0110\u0111\7u\2\2\u0111\u0113\7g\2\2"+
		"\u0112\u0109\3\2\2\2\u0112\u010d\3\2\2\2\u0113N\3\2\2\2\u0114\u0115\7"+
		"k\2\2\u0115\u0116\7h\2\2\u0116P\3\2\2\2\u0117\u0118\7g\2\2\u0118\u0119"+
		"\7n\2\2\u0119\u011a\7u\2\2\u011a\u011b\7g\2\2\u011bR\3\2\2\2\u011c\u011d"+
		"\7t\2\2\u011d\u011e\7g\2\2\u011e\u011f\7v\2\2\u011f\u0120\7w\2\2\u0120"+
		"\u0121\7t\2\2\u0121\u0122\7p\2\2\u0122T\3\2\2\2\u0123\u0124\7y\2\2\u0124"+
		"\u0125\7j\2\2\u0125\u0126\7k\2\2\u0126\u0127\7n\2\2\u0127\u0128\7g\2\2"+
		"\u0128V\3\2\2\2\u0129\u012b\7F\2\2\u012a\u012c\t\2\2\2\u012b\u012a\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u0136\3\2\2\2\u012f\u0131\7C\2\2\u0130\u0132\t\2\2\2\u0131\u0130\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0136\3\2\2\2\u0135\u0129\3\2\2\2\u0135\u012f\3\2\2\2\u0136X\3\2\2\2"+
		"\u0137\u0139\t\2\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013bZ\3\2\2\2\u013c\u0140\t\3\2\2\u013d"+
		"\u013f\t\4\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\\\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144"+
		"\7\61\2\2\u0144\u0145\7,\2\2\u0145\u0149\3\2\2\2\u0146\u0148\13\2\2\2"+
		"\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u014a\3\2\2\2\u0149\u0147"+
		"\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\7,\2\2\u014d"+
		"\u014e\7\61\2\2\u014e\u014f\3\2\2\2\u014f\u0150\b/\2\2\u0150^\3\2\2\2"+
		"\u0151\u0152\7\61\2\2\u0152\u0153\7\61\2\2\u0153\u0157\3\2\2\2\u0154\u0156"+
		"\n\5\2\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\b\60"+
		"\2\2\u015b`\3\2\2\2\u015c\u015f\t\6\2\2\u015d\u015f\5c\62\2\u015e\u015c"+
		"\3\2\2\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\b\61\2\2\u0163b\3\2\2\2"+
		"\u0164\u0165\7\17\2\2\u0165\u0168\7\f\2\2\u0166\u0168\t\5\2\2\u0167\u0164"+
		"\3\2\2\2\u0167\u0166\3\2\2\2\u0168d\3\2\2\2\23\2v\u0081\u0088\u008c\u0100"+
		"\u0112\u012d\u0133\u0135\u013a\u0140\u0149\u0157\u015e\u0160\u0167\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}