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
		LOGOR=21, SETUP=22, LOOP=23, FUNC=24, WRITE=25, READPWM=26, READA=27, 
		READD=28, LPAREN=29, RPAREN=30, LBRACE=31, RBRACE=32, END=33, ASSIGN=34, 
		NEGATIVE=35, HIGH=36, LOW=37, PINMODE=38, TOGGLE=39, BOOL=40, IF=41, ELSE=42, 
		RETURN=43, WHILE=44, PINNUMBER=45, INT=46, ID=47, COMMENT=48, LINECOMMENT=49, 
		WS=50, NEWLINE=51;
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
			"LOOP", "FUNC", "WRITE", "READPWM", "READA", "READD", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "END", "ASSIGN", "NEGATIVE", "HIGH", "LOW", "PINMODE", 
			"TOGGLE", "BOOL", "IF", "ELSE", "RETURN", "WHILE", "PINNUMBER", "INT", 
			"ID", "COMMENT", "LINECOMMENT", "WS", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'.'", "'Num '", "'Bool '", "'Pwm '", "'Pin '", null, null, 
			null, "'!'", "'+'", "'-'", "'/'", "'*'", "'%'", "'<'", "'>'", "'=='", 
			"'!='", "'&&'", "'||'", "'setup'", "'loop'", "'func '", "'.Write'", "'.ReadPwm'", 
			"'.ReadAnalog'", "'.ReadDigital'", "'('", "')'", "'{'", "'}'", "';'", 
			"'='", "'~'", "'HIGH'", "'LOW'", null, "'TOGGLE'", null, "'if'", "'else'", 
			"'return'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NUMTYPE", "BOOLTYPE", "PWMTYPE", "PINTYPE", "RELATIONAL", 
			"ARITHMETIC", "LOGICAL", "NEG", "PLUS", "MINUS", "DIVIDE", "MULT", "MODULU", 
			"LESSTHAN", "GREATERTHAN", "EQUAL", "NOTEQUAL", "LOGAND", "LOGOR", "SETUP", 
			"LOOP", "FUNC", "WRITE", "READPWM", "READA", "READD", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "END", "ASSIGN", "NEGATIVE", "HIGH", "LOW", "PINMODE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u016e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0087\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u008e\n\t\3\n\3\n\5\n\u0092\n\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\5\'\u0106\n\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\5)\u0118\n)\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3"+
		"-\3-\3-\3-\3-\3-\3.\3.\6.\u0131\n.\r.\16.\u0132\3.\3.\6.\u0137\n.\r.\16"+
		".\u0138\5.\u013b\n.\3/\6/\u013e\n/\r/\16/\u013f\3\60\3\60\7\60\u0144\n"+
		"\60\f\60\16\60\u0147\13\60\3\61\3\61\3\61\3\61\7\61\u014d\n\61\f\61\16"+
		"\61\u0150\13\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u015b"+
		"\n\62\f\62\16\62\u015e\13\62\3\62\3\62\3\63\3\63\6\63\u0164\n\63\r\63"+
		"\16\63\u0165\3\63\3\63\3\64\3\64\3\64\5\64\u016d\n\64\3\u014e\2\65\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65\3\2\7\3\2\62;\5"+
		"\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\4\2\13\13\"\"\2\u0181\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5k\3\2\2\2\7m\3\2\2\2\tr\3\2\2"+
		"\2\13x\3\2\2\2\r}\3\2\2\2\17\u0086\3\2\2\2\21\u008d\3\2\2\2\23\u0091\3"+
		"\2\2\2\25\u0093\3\2\2\2\27\u0095\3\2\2\2\31\u0097\3\2\2\2\33\u0099\3\2"+
		"\2\2\35\u009b\3\2\2\2\37\u009d\3\2\2\2!\u009f\3\2\2\2#\u00a1\3\2\2\2%"+
		"\u00a3\3\2\2\2\'\u00a6\3\2\2\2)\u00a9\3\2\2\2+\u00ac\3\2\2\2-\u00af\3"+
		"\2\2\2/\u00b5\3\2\2\2\61\u00ba\3\2\2\2\63\u00c0\3\2\2\2\65\u00c7\3\2\2"+
		"\2\67\u00d0\3\2\2\29\u00dc\3\2\2\2;\u00e9\3\2\2\2=\u00eb\3\2\2\2?\u00ed"+
		"\3\2\2\2A\u00ef\3\2\2\2C\u00f1\3\2\2\2E\u00f3\3\2\2\2G\u00f5\3\2\2\2I"+
		"\u00f7\3\2\2\2K\u00fc\3\2\2\2M\u0105\3\2\2\2O\u0107\3\2\2\2Q\u0117\3\2"+
		"\2\2S\u0119\3\2\2\2U\u011c\3\2\2\2W\u0121\3\2\2\2Y\u0128\3\2\2\2[\u013a"+
		"\3\2\2\2]\u013d\3\2\2\2_\u0141\3\2\2\2a\u0148\3\2\2\2c\u0156\3\2\2\2e"+
		"\u0163\3\2\2\2g\u016c\3\2\2\2ij\7.\2\2j\4\3\2\2\2kl\7\60\2\2l\6\3\2\2"+
		"\2mn\7P\2\2no\7w\2\2op\7o\2\2pq\7\"\2\2q\b\3\2\2\2rs\7D\2\2st\7q\2\2t"+
		"u\7q\2\2uv\7n\2\2vw\7\"\2\2w\n\3\2\2\2xy\7R\2\2yz\7y\2\2z{\7o\2\2{|\7"+
		"\"\2\2|\f\3\2\2\2}~\7R\2\2~\177\7k\2\2\177\u0080\7p\2\2\u0080\u0081\7"+
		"\"\2\2\u0081\16\3\2\2\2\u0082\u0087\5!\21\2\u0083\u0087\5#\22\2\u0084"+
		"\u0087\5%\23\2\u0085\u0087\5\'\24\2\u0086\u0082\3\2\2\2\u0086\u0083\3"+
		"\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\20\3\2\2\2\u0088"+
		"\u008e\5\27\f\2\u0089\u008e\5\31\r\2\u008a\u008e\5\33\16\2\u008b\u008e"+
		"\5\35\17\2\u008c\u008e\5\37\20\2\u008d\u0088\3\2\2\2\u008d\u0089\3\2\2"+
		"\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\22"+
		"\3\2\2\2\u008f\u0092\5)\25\2\u0090\u0092\5+\26\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\24\3\2\2\2\u0093\u0094\7#\2\2\u0094\26\3\2\2\2\u0095"+
		"\u0096\7-\2\2\u0096\30\3\2\2\2\u0097\u0098\7/\2\2\u0098\32\3\2\2\2\u0099"+
		"\u009a\7\61\2\2\u009a\34\3\2\2\2\u009b\u009c\7,\2\2\u009c\36\3\2\2\2\u009d"+
		"\u009e\7\'\2\2\u009e \3\2\2\2\u009f\u00a0\7>\2\2\u00a0\"\3\2\2\2\u00a1"+
		"\u00a2\7@\2\2\u00a2$\3\2\2\2\u00a3\u00a4\7?\2\2\u00a4\u00a5\7?\2\2\u00a5"+
		"&\3\2\2\2\u00a6\u00a7\7#\2\2\u00a7\u00a8\7?\2\2\u00a8(\3\2\2\2\u00a9\u00aa"+
		"\7(\2\2\u00aa\u00ab\7(\2\2\u00ab*\3\2\2\2\u00ac\u00ad\7~\2\2\u00ad\u00ae"+
		"\7~\2\2\u00ae,\3\2\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2"+
		"\7v\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7r\2\2\u00b4.\3\2\2\2\u00b5\u00b6"+
		"\7n\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7r\2\2\u00b9"+
		"\60\3\2\2\2\u00ba\u00bb\7h\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7p\2\2\u00bd"+
		"\u00be\7e\2\2\u00be\u00bf\7\"\2\2\u00bf\62\3\2\2\2\u00c0\u00c1\7\60\2"+
		"\2\u00c1\u00c2\7Y\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5"+
		"\7v\2\2\u00c5\u00c6\7g\2\2\u00c6\64\3\2\2\2\u00c7\u00c8\7\60\2\2\u00c8"+
		"\u00c9\7T\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7f\2\2"+
		"\u00cc\u00cd\7R\2\2\u00cd\u00ce\7y\2\2\u00ce\u00cf\7o\2\2\u00cf\66\3\2"+
		"\2\2\u00d0\u00d1\7\60\2\2\u00d1\u00d2\7T\2\2\u00d2\u00d3\7g\2\2\u00d3"+
		"\u00d4\7c\2\2\u00d4\u00d5\7f\2\2\u00d5\u00d6\7C\2\2\u00d6\u00d7\7p\2\2"+
		"\u00d7\u00d8\7c\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7q\2\2\u00da\u00db"+
		"\7i\2\2\u00db8\3\2\2\2\u00dc\u00dd\7\60\2\2\u00dd\u00de\7T\2\2\u00de\u00df"+
		"\7g\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7f\2\2\u00e1\u00e2\7F\2\2\u00e2"+
		"\u00e3\7k\2\2\u00e3\u00e4\7i\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7v\2\2"+
		"\u00e6\u00e7\7c\2\2\u00e7\u00e8\7n\2\2\u00e8:\3\2\2\2\u00e9\u00ea\7*\2"+
		"\2\u00ea<\3\2\2\2\u00eb\u00ec\7+\2\2\u00ec>\3\2\2\2\u00ed\u00ee\7}\2\2"+
		"\u00ee@\3\2\2\2\u00ef\u00f0\7\177\2\2\u00f0B\3\2\2\2\u00f1\u00f2\7=\2"+
		"\2\u00f2D\3\2\2\2\u00f3\u00f4\7?\2\2\u00f4F\3\2\2\2\u00f5\u00f6\7\u0080"+
		"\2\2\u00f6H\3\2\2\2\u00f7\u00f8\7J\2\2\u00f8\u00f9\7K\2\2\u00f9\u00fa"+
		"\7I\2\2\u00fa\u00fb\7J\2\2\u00fbJ\3\2\2\2\u00fc\u00fd\7N\2\2\u00fd\u00fe"+
		"\7Q\2\2\u00fe\u00ff\7Y\2\2\u00ffL\3\2\2\2\u0100\u0101\7q\2\2\u0101\u0102"+
		"\7w\2\2\u0102\u0106\7v\2\2\u0103\u0104\7k\2\2\u0104\u0106\7p\2\2\u0105"+
		"\u0100\3\2\2\2\u0105\u0103\3\2\2\2\u0106N\3\2\2\2\u0107\u0108\7V\2\2\u0108"+
		"\u0109\7Q\2\2\u0109\u010a\7I\2\2\u010a\u010b\7I\2\2\u010b\u010c\7N\2\2"+
		"\u010c\u010d\7G\2\2\u010dP\3\2\2\2\u010e\u010f\7v\2\2\u010f\u0110\7t\2"+
		"\2\u0110\u0111\7w\2\2\u0111\u0118\7g\2\2\u0112\u0113\7h\2\2\u0113\u0114"+
		"\7c\2\2\u0114\u0115\7n\2\2\u0115\u0116\7u\2\2\u0116\u0118\7g\2\2\u0117"+
		"\u010e\3\2\2\2\u0117\u0112\3\2\2\2\u0118R\3\2\2\2\u0119\u011a\7k\2\2\u011a"+
		"\u011b\7h\2\2\u011bT\3\2\2\2\u011c\u011d\7g\2\2\u011d\u011e\7n\2\2\u011e"+
		"\u011f\7u\2\2\u011f\u0120\7g\2\2\u0120V\3\2\2\2\u0121\u0122\7t\2\2\u0122"+
		"\u0123\7g\2\2\u0123\u0124\7v\2\2\u0124\u0125\7w\2\2\u0125\u0126\7t\2\2"+
		"\u0126\u0127\7p\2\2\u0127X\3\2\2\2\u0128\u0129\7y\2\2\u0129\u012a\7j\2"+
		"\2\u012a\u012b\7k\2\2\u012b\u012c\7n\2\2\u012c\u012d\7g\2\2\u012dZ\3\2"+
		"\2\2\u012e\u0130\7F\2\2\u012f\u0131\t\2\2\2\u0130\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u013b\3\2"+
		"\2\2\u0134\u0136\7C\2\2\u0135\u0137\t\2\2\2\u0136\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2"+
		"\2\2\u013a\u012e\3\2\2\2\u013a\u0134\3\2\2\2\u013b\\\3\2\2\2\u013c\u013e"+
		"\t\2\2\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140^\3\2\2\2\u0141\u0145\t\3\2\2\u0142\u0144\t\4\2\2"+
		"\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146`\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\7\61\2\2\u0149"+
		"\u014a\7,\2\2\u014a\u014e\3\2\2\2\u014b\u014d\13\2\2\2\u014c\u014b\3\2"+
		"\2\2\u014d\u0150\3\2\2\2\u014e\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f"+
		"\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\7,\2\2\u0152\u0153\7\61"+
		"\2\2\u0153\u0154\3\2\2\2\u0154\u0155\b\61\2\2\u0155b\3\2\2\2\u0156\u0157"+
		"\7\61\2\2\u0157\u0158\7\61\2\2\u0158\u015c\3\2\2\2\u0159\u015b\n\5\2\2"+
		"\u015a\u0159\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\b\62\2\2"+
		"\u0160d\3\2\2\2\u0161\u0164\t\6\2\2\u0162\u0164\5g\64\2\u0163\u0161\3"+
		"\2\2\2\u0163\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\b\63\2\2\u0168f\3\2\2\2"+
		"\u0169\u016a\7\17\2\2\u016a\u016d\7\f\2\2\u016b\u016d\t\5\2\2\u016c\u0169"+
		"\3\2\2\2\u016c\u016b\3\2\2\2\u016dh\3\2\2\2\22\2\u0086\u008d\u0091\u0105"+
		"\u0117\u0132\u0138\u013a\u013f\u0145\u014e\u015c\u0163\u0165\u016c\3\b"+
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