// Generated from C:/Users/Jakob/Documents/GitHub/Arduino-high-level-languageP4AAU/src/com/compiler\Hlmp.g4 by ANTLR 4.9.2
package com.compiler;
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
		T__0=1, T__1=2, NUMTYPE=3, BOOLTYPE=4, PWMTYPE=5, PINTYPE=6, RELATIONAL=7, 
		ARITHMETIC=8, LOGICAL=9, NEG=10, PLUS=11, MINUS=12, DIVIDE=13, MULT=14, 
		MODULU=15, LESSTHAN=16, GREATERTHAN=17, EQUAL=18, NOTEQUAL=19, LOGAND=20, 
		LOGOR=21, SETUP=22, LOOP=23, FUNC=24, PROC=25, WRITE=26, READPWM=27, READA=28, 
		READD=29, LPAREN=30, RPAREN=31, LBRACE=32, RBRACE=33, END=34, ASSIGN=35, 
		NEGATIVE=36, HIGH=37, LOW=38, PINMODE=39, TOGGLE=40, BOOL=41, IF=42, ELSE=43, 
		RETURN=44, WHILE=45, PINNUMBER=46, INT=47, ID=48, COMMENT=49, LINECOMMENT=50, 
		WS=51, NEWLINE=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "NUMTYPE", "BOOLTYPE", "PWMTYPE", "PINTYPE", "RELATIONAL", 
			"ARITHMETIC", "LOGICAL", "NEG", "PLUS", "MINUS", "DIVIDE", "MULT", "MODULU", 
			"LESSTHAN", "GREATERTHAN", "EQUAL", "NOTEQUAL", "LOGAND", "LOGOR", "SETUP", 
			"LOOP", "FUNC", "PROC", "WRITE", "READPWM", "READA", "READD", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "END", "ASSIGN", "NEGATIVE", "HIGH", "LOW", 
			"PINMODE", "TOGGLE", "BOOL", "IF", "ELSE", "RETURN", "WHILE", "PINNUMBER", 
			"INT", "ID", "COMMENT", "LINECOMMENT", "WS", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'.'", "'Num '", "'Bool '", "'Pwm '", "'Pin '", null, null, 
			null, "'!'", "'+'", "'-'", "'/'", "'*'", "'%'", "'<'", "'>'", "'=='", 
			"'!='", "'&&'", "'||'", "'setup'", "'loop'", "'func '", "'proc '", "'.Write'", 
			"'.ReadPwm'", "'.ReadAnalog'", "'.ReadDigital'", "'('", "')'", "'{'", 
			"'}'", "';'", "'='", "'~'", "'HIGH'", "'LOW'", null, "'TOGGLE'", null, 
			"'if'", "'else'", "'return'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NUMTYPE", "BOOLTYPE", "PWMTYPE", "PINTYPE", "RELATIONAL", 
			"ARITHMETIC", "LOGICAL", "NEG", "PLUS", "MINUS", "DIVIDE", "MULT", "MODULU", 
			"LESSTHAN", "GREATERTHAN", "EQUAL", "NOTEQUAL", "LOGAND", "LOGOR", "SETUP", 
			"LOOP", "FUNC", "PROC", "WRITE", "READPWM", "READA", "READD", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "END", "ASSIGN", "NEGATIVE", "HIGH", "LOW", 
			"PINMODE", "TOGGLE", "BOOL", "IF", "ELSE", "RETURN", "WHILE", "PINNUMBER", 
			"INT", "ID", "COMMENT", "LINECOMMENT", "WS", "NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u0176\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0089"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u0090\n\t\3\n\3\n\5\n\u0094\n\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u010e\n(\3)\3)\3"+
		")\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0120\n*\3+\3+\3+\3,\3,\3"+
		",\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\6/\u0139\n/\r/\16"+
		"/\u013a\3/\3/\6/\u013f\n/\r/\16/\u0140\5/\u0143\n/\3\60\6\60\u0146\n\60"+
		"\r\60\16\60\u0147\3\61\3\61\7\61\u014c\n\61\f\61\16\61\u014f\13\61\3\62"+
		"\3\62\3\62\3\62\7\62\u0155\n\62\f\62\16\62\u0158\13\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u0163\n\63\f\63\16\63\u0166\13\63"+
		"\3\63\3\63\3\64\3\64\6\64\u016c\n\64\r\64\16\64\u016d\3\64\3\64\3\65\3"+
		"\65\3\65\5\65\u0175\n\65\3\u0156\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|"+
		"\4\2\f\f\17\17\4\2\13\13\"\"\2\u0189\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\3k\3\2\2\2\5m\3\2\2\2\7o\3\2\2\2\tt\3\2\2\2\13z\3\2\2"+
		"\2\r\177\3\2\2\2\17\u0088\3\2\2\2\21\u008f\3\2\2\2\23\u0093\3\2\2\2\25"+
		"\u0095\3\2\2\2\27\u0097\3\2\2\2\31\u0099\3\2\2\2\33\u009b\3\2\2\2\35\u009d"+
		"\3\2\2\2\37\u009f\3\2\2\2!\u00a1\3\2\2\2#\u00a3\3\2\2\2%\u00a5\3\2\2\2"+
		"\'\u00a8\3\2\2\2)\u00ab\3\2\2\2+\u00ae\3\2\2\2-\u00b1\3\2\2\2/\u00b7\3"+
		"\2\2\2\61\u00bc\3\2\2\2\63\u00c2\3\2\2\2\65\u00c8\3\2\2\2\67\u00cf\3\2"+
		"\2\29\u00d8\3\2\2\2;\u00e4\3\2\2\2=\u00f1\3\2\2\2?\u00f3\3\2\2\2A\u00f5"+
		"\3\2\2\2C\u00f7\3\2\2\2E\u00f9\3\2\2\2G\u00fb\3\2\2\2I\u00fd\3\2\2\2K"+
		"\u00ff\3\2\2\2M\u0104\3\2\2\2O\u010d\3\2\2\2Q\u010f\3\2\2\2S\u011f\3\2"+
		"\2\2U\u0121\3\2\2\2W\u0124\3\2\2\2Y\u0129\3\2\2\2[\u0130\3\2\2\2]\u0142"+
		"\3\2\2\2_\u0145\3\2\2\2a\u0149\3\2\2\2c\u0150\3\2\2\2e\u015e\3\2\2\2g"+
		"\u016b\3\2\2\2i\u0174\3\2\2\2kl\7.\2\2l\4\3\2\2\2mn\7\60\2\2n\6\3\2\2"+
		"\2op\7P\2\2pq\7w\2\2qr\7o\2\2rs\7\"\2\2s\b\3\2\2\2tu\7D\2\2uv\7q\2\2v"+
		"w\7q\2\2wx\7n\2\2xy\7\"\2\2y\n\3\2\2\2z{\7R\2\2{|\7y\2\2|}\7o\2\2}~\7"+
		"\"\2\2~\f\3\2\2\2\177\u0080\7R\2\2\u0080\u0081\7k\2\2\u0081\u0082\7p\2"+
		"\2\u0082\u0083\7\"\2\2\u0083\16\3\2\2\2\u0084\u0089\5!\21\2\u0085\u0089"+
		"\5#\22\2\u0086\u0089\5%\23\2\u0087\u0089\5\'\24\2\u0088\u0084\3\2\2\2"+
		"\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\20"+
		"\3\2\2\2\u008a\u0090\5\27\f\2\u008b\u0090\5\31\r\2\u008c\u0090\5\33\16"+
		"\2\u008d\u0090\5\35\17\2\u008e\u0090\5\37\20\2\u008f\u008a\3\2\2\2\u008f"+
		"\u008b\3\2\2\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2"+
		"\2\2\u0090\22\3\2\2\2\u0091\u0094\5)\25\2\u0092\u0094\5+\26\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0092\3\2\2\2\u0094\24\3\2\2\2\u0095\u0096\7#\2\2\u0096"+
		"\26\3\2\2\2\u0097\u0098\7-\2\2\u0098\30\3\2\2\2\u0099\u009a\7/\2\2\u009a"+
		"\32\3\2\2\2\u009b\u009c\7\61\2\2\u009c\34\3\2\2\2\u009d\u009e\7,\2\2\u009e"+
		"\36\3\2\2\2\u009f\u00a0\7\'\2\2\u00a0 \3\2\2\2\u00a1\u00a2\7>\2\2\u00a2"+
		"\"\3\2\2\2\u00a3\u00a4\7@\2\2\u00a4$\3\2\2\2\u00a5\u00a6\7?\2\2\u00a6"+
		"\u00a7\7?\2\2\u00a7&\3\2\2\2\u00a8\u00a9\7#\2\2\u00a9\u00aa\7?\2\2\u00aa"+
		"(\3\2\2\2\u00ab\u00ac\7(\2\2\u00ac\u00ad\7(\2\2\u00ad*\3\2\2\2\u00ae\u00af"+
		"\7~\2\2\u00af\u00b0\7~\2\2\u00b0,\3\2\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3"+
		"\7g\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6\7r\2\2\u00b6"+
		".\3\2\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7q\2\2\u00ba"+
		"\u00bb\7r\2\2\u00bb\60\3\2\2\2\u00bc\u00bd\7h\2\2\u00bd\u00be\7w\2\2\u00be"+
		"\u00bf\7p\2\2\u00bf\u00c0\7e\2\2\u00c0\u00c1\7\"\2\2\u00c1\62\3\2\2\2"+
		"\u00c2\u00c3\7r\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6"+
		"\7e\2\2\u00c6\u00c7\7\"\2\2\u00c7\64\3\2\2\2\u00c8\u00c9\7\60\2\2\u00c9"+
		"\u00ca\7Y\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7v\2\2"+
		"\u00cd\u00ce\7g\2\2\u00ce\66\3\2\2\2\u00cf\u00d0\7\60\2\2\u00d0\u00d1"+
		"\7T\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7f\2\2\u00d4"+
		"\u00d5\7R\2\2\u00d5\u00d6\7y\2\2\u00d6\u00d7\7o\2\2\u00d78\3\2\2\2\u00d8"+
		"\u00d9\7\60\2\2\u00d9\u00da\7T\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7c\2"+
		"\2\u00dc\u00dd\7f\2\2\u00dd\u00de\7C\2\2\u00de\u00df\7p\2\2\u00df\u00e0"+
		"\7c\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7i\2\2\u00e3"+
		":\3\2\2\2\u00e4\u00e5\7\60\2\2\u00e5\u00e6\7T\2\2\u00e6\u00e7\7g\2\2\u00e7"+
		"\u00e8\7c\2\2\u00e8\u00e9\7f\2\2\u00e9\u00ea\7F\2\2\u00ea\u00eb\7k\2\2"+
		"\u00eb\u00ec\7i\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef"+
		"\7c\2\2\u00ef\u00f0\7n\2\2\u00f0<\3\2\2\2\u00f1\u00f2\7*\2\2\u00f2>\3"+
		"\2\2\2\u00f3\u00f4\7+\2\2\u00f4@\3\2\2\2\u00f5\u00f6\7}\2\2\u00f6B\3\2"+
		"\2\2\u00f7\u00f8\7\177\2\2\u00f8D\3\2\2\2\u00f9\u00fa\7=\2\2\u00faF\3"+
		"\2\2\2\u00fb\u00fc\7?\2\2\u00fcH\3\2\2\2\u00fd\u00fe\7\u0080\2\2\u00fe"+
		"J\3\2\2\2\u00ff\u0100\7J\2\2\u0100\u0101\7K\2\2\u0101\u0102\7I\2\2\u0102"+
		"\u0103\7J\2\2\u0103L\3\2\2\2\u0104\u0105\7N\2\2\u0105\u0106\7Q\2\2\u0106"+
		"\u0107\7Y\2\2\u0107N\3\2\2\2\u0108\u0109\7q\2\2\u0109\u010a\7w\2\2\u010a"+
		"\u010e\7v\2\2\u010b\u010c\7k\2\2\u010c\u010e\7p\2\2\u010d\u0108\3\2\2"+
		"\2\u010d\u010b\3\2\2\2\u010eP\3\2\2\2\u010f\u0110\7V\2\2\u0110\u0111\7"+
		"Q\2\2\u0111\u0112\7I\2\2\u0112\u0113\7I\2\2\u0113\u0114\7N\2\2\u0114\u0115"+
		"\7G\2\2\u0115R\3\2\2\2\u0116\u0117\7v\2\2\u0117\u0118\7t\2\2\u0118\u0119"+
		"\7w\2\2\u0119\u0120\7g\2\2\u011a\u011b\7h\2\2\u011b\u011c\7c\2\2\u011c"+
		"\u011d\7n\2\2\u011d\u011e\7u\2\2\u011e\u0120\7g\2\2\u011f\u0116\3\2\2"+
		"\2\u011f\u011a\3\2\2\2\u0120T\3\2\2\2\u0121\u0122\7k\2\2\u0122\u0123\7"+
		"h\2\2\u0123V\3\2\2\2\u0124\u0125\7g\2\2\u0125\u0126\7n\2\2\u0126\u0127"+
		"\7u\2\2\u0127\u0128\7g\2\2\u0128X\3\2\2\2\u0129\u012a\7t\2\2\u012a\u012b"+
		"\7g\2\2\u012b\u012c\7v\2\2\u012c\u012d\7w\2\2\u012d\u012e\7t\2\2\u012e"+
		"\u012f\7p\2\2\u012fZ\3\2\2\2\u0130\u0131\7y\2\2\u0131\u0132\7j\2\2\u0132"+
		"\u0133\7k\2\2\u0133\u0134\7n\2\2\u0134\u0135\7g\2\2\u0135\\\3\2\2\2\u0136"+
		"\u0138\7F\2\2\u0137\u0139\t\2\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0143\3\2\2\2\u013c"+
		"\u013e\7C\2\2\u013d\u013f\t\2\2\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u0136\3\2\2\2\u0142\u013c\3\2\2\2\u0143^\3\2\2\2\u0144\u0146\t\2\2\2"+
		"\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148`\3\2\2\2\u0149\u014d\t\3\2\2\u014a\u014c\t\4\2\2\u014b"+
		"\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014eb\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7\61\2\2\u0151\u0152"+
		"\7,\2\2\u0152\u0156\3\2\2\2\u0153\u0155\13\2\2\2\u0154\u0153\3\2\2\2\u0155"+
		"\u0158\3\2\2\2\u0156\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0159\3\2"+
		"\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7,\2\2\u015a\u015b\7\61\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015d\b\62\2\2\u015dd\3\2\2\2\u015e\u015f\7\61\2"+
		"\2\u015f\u0160\7\61\2\2\u0160\u0164\3\2\2\2\u0161\u0163\n\5\2\2\u0162"+
		"\u0161\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2"+
		"\2\2\u0165\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168\b\63\2\2\u0168"+
		"f\3\2\2\2\u0169\u016c\t\6\2\2\u016a\u016c\5i\65\2\u016b\u0169\3\2\2\2"+
		"\u016b\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\b\64\2\2\u0170h\3\2\2\2\u0171"+
		"\u0172\7\17\2\2\u0172\u0175\7\f\2\2\u0173\u0175\t\5\2\2\u0174\u0171\3"+
		"\2\2\2\u0174\u0173\3\2\2\2\u0175j\3\2\2\2\22\2\u0088\u008f\u0093\u010d"+
		"\u011f\u013a\u0140\u0142\u0147\u014d\u0156\u0164\u016b\u016d\u0174\3\b"+
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