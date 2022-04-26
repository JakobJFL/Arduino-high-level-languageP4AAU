// Generated from /Users/PBR/Documents/Arduino-high-level-languageP4AAU/src/com/compiler/Hlmp.g4 by ANTLR 4.10.1
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NUMTYPE=2, BOOLTYPE=3, PWMTYPE=4, PINTYPE=5, RELATIONAL=6, ARITHMETIC=7, 
		LOGICAL=8, NEG=9, PLUS=10, MINUS=11, DIVIDE=12, MULT=13, MODULU=14, LESSTHAN=15, 
		GREATERTHAN=16, EQUAL=17, NOTEQUAL=18, LOGAND=19, LOGOR=20, SETUP=21, 
		LOOP=22, FUNC=23, PROC=24, WRITE=25, READPWM=26, READA=27, READD=28, LPAREN=29, 
		RPAREN=30, LBRACE=31, RBRACE=32, END=33, ASSIGN=34, NEGATIVE=35, HIGH=36, 
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
			"T__0", "NUMTYPE", "BOOLTYPE", "PWMTYPE", "PINTYPE", "RELATIONAL", "ARITHMETIC", 
			"LOGICAL", "NEG", "PLUS", "MINUS", "DIVIDE", "MULT", "MODULU", "LESSTHAN", 
			"GREATERTHAN", "EQUAL", "NOTEQUAL", "LOGAND", "LOGOR", "SETUP", "LOOP", 
			"FUNC", "PROC", "WRITE", "READPWM", "READA", "READD", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "END", "ASSIGN", "NEGATIVE", "HIGH", "LOW", "PINMODE", 
			"TOGGLE", "BOOL", "IF", "ELSE", "RETURN", "WHILE", "PINNUMBER", "INT", 
			"ID", "COMMENT", "LINECOMMENT", "WS", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'Num '", "'Bool '", "'Pwm '", "'Pin '", null, null, null, 
			"'!'", "'+'", "'-'", "'/'", "'*'", "'%'", "'<'", "'>'", "'=='", "'!='", 
			"'&&'", "'||'", "'setup'", "'loop'", "'func '", "'proc '", "'.Write'", 
			"'.ReadPwm'", "'.ReadAnalog'", "'.ReadDigital'", "'('", "')'", "'{'", 
			"'}'", "';'", "'='", "'~'", "'HIGH'", "'LOW'", null, "'TOGGLE'", null, 
			"'if'", "'else'", "'return'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NUMTYPE", "BOOLTYPE", "PWMTYPE", "PINTYPE", "RELATIONAL", 
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
		"\u0004\u00003\u0170\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0083\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u008a\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u008e"+
		"\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0003%\u0108\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u011a\b\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0004,\u0133\b,\u000b"+
		",\f,\u0134\u0001,\u0001,\u0004,\u0139\b,\u000b,\f,\u013a\u0003,\u013d"+
		"\b,\u0001-\u0004-\u0140\b-\u000b-\f-\u0141\u0001.\u0001.\u0005.\u0146"+
		"\b.\n.\f.\u0149\t.\u0001/\u0001/\u0001/\u0001/\u0005/\u014f\b/\n/\f/\u0152"+
		"\t/\u0001/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u0005"+
		"0\u015d\b0\n0\f0\u0160\t0\u00010\u00010\u00011\u00011\u00041\u0166\b1"+
		"\u000b1\f1\u0167\u00011\u00011\u00012\u00012\u00012\u00032\u016f\b2\u0001"+
		"\u0150\u00003\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f"+
		"? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3\u0001\u0000\u0005\u0001\u0000"+
		"09\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002\u0000\n\n\r\r\u0002\u0000"+
		"\t\t  \u0183\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"+
		"\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000"+
		"\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000"+
		"O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001"+
		"\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000"+
		"\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000"+
		"]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001"+
		"\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000"+
		"\u0000\u0001g\u0001\u0000\u0000\u0000\u0003i\u0001\u0000\u0000\u0000\u0005"+
		"n\u0001\u0000\u0000\u0000\u0007t\u0001\u0000\u0000\u0000\ty\u0001\u0000"+
		"\u0000\u0000\u000b\u0082\u0001\u0000\u0000\u0000\r\u0089\u0001\u0000\u0000"+
		"\u0000\u000f\u008d\u0001\u0000\u0000\u0000\u0011\u008f\u0001\u0000\u0000"+
		"\u0000\u0013\u0091\u0001\u0000\u0000\u0000\u0015\u0093\u0001\u0000\u0000"+
		"\u0000\u0017\u0095\u0001\u0000\u0000\u0000\u0019\u0097\u0001\u0000\u0000"+
		"\u0000\u001b\u0099\u0001\u0000\u0000\u0000\u001d\u009b\u0001\u0000\u0000"+
		"\u0000\u001f\u009d\u0001\u0000\u0000\u0000!\u009f\u0001\u0000\u0000\u0000"+
		"#\u00a2\u0001\u0000\u0000\u0000%\u00a5\u0001\u0000\u0000\u0000\'\u00a8"+
		"\u0001\u0000\u0000\u0000)\u00ab\u0001\u0000\u0000\u0000+\u00b1\u0001\u0000"+
		"\u0000\u0000-\u00b6\u0001\u0000\u0000\u0000/\u00bc\u0001\u0000\u0000\u0000"+
		"1\u00c2\u0001\u0000\u0000\u00003\u00c9\u0001\u0000\u0000\u00005\u00d2"+
		"\u0001\u0000\u0000\u00007\u00de\u0001\u0000\u0000\u00009\u00eb\u0001\u0000"+
		"\u0000\u0000;\u00ed\u0001\u0000\u0000\u0000=\u00ef\u0001\u0000\u0000\u0000"+
		"?\u00f1\u0001\u0000\u0000\u0000A\u00f3\u0001\u0000\u0000\u0000C\u00f5"+
		"\u0001\u0000\u0000\u0000E\u00f7\u0001\u0000\u0000\u0000G\u00f9\u0001\u0000"+
		"\u0000\u0000I\u00fe\u0001\u0000\u0000\u0000K\u0107\u0001\u0000\u0000\u0000"+
		"M\u0109\u0001\u0000\u0000\u0000O\u0119\u0001\u0000\u0000\u0000Q\u011b"+
		"\u0001\u0000\u0000\u0000S\u011e\u0001\u0000\u0000\u0000U\u0123\u0001\u0000"+
		"\u0000\u0000W\u012a\u0001\u0000\u0000\u0000Y\u013c\u0001\u0000\u0000\u0000"+
		"[\u013f\u0001\u0000\u0000\u0000]\u0143\u0001\u0000\u0000\u0000_\u014a"+
		"\u0001\u0000\u0000\u0000a\u0158\u0001\u0000\u0000\u0000c\u0165\u0001\u0000"+
		"\u0000\u0000e\u016e\u0001\u0000\u0000\u0000gh\u0005,\u0000\u0000h\u0002"+
		"\u0001\u0000\u0000\u0000ij\u0005N\u0000\u0000jk\u0005u\u0000\u0000kl\u0005"+
		"m\u0000\u0000lm\u0005 \u0000\u0000m\u0004\u0001\u0000\u0000\u0000no\u0005"+
		"B\u0000\u0000op\u0005o\u0000\u0000pq\u0005o\u0000\u0000qr\u0005l\u0000"+
		"\u0000rs\u0005 \u0000\u0000s\u0006\u0001\u0000\u0000\u0000tu\u0005P\u0000"+
		"\u0000uv\u0005w\u0000\u0000vw\u0005m\u0000\u0000wx\u0005 \u0000\u0000"+
		"x\b\u0001\u0000\u0000\u0000yz\u0005P\u0000\u0000z{\u0005i\u0000\u0000"+
		"{|\u0005n\u0000\u0000|}\u0005 \u0000\u0000}\n\u0001\u0000\u0000\u0000"+
		"~\u0083\u0003\u001d\u000e\u0000\u007f\u0083\u0003\u001f\u000f\u0000\u0080"+
		"\u0083\u0003!\u0010\u0000\u0081\u0083\u0003#\u0011\u0000\u0082~\u0001"+
		"\u0000\u0000\u0000\u0082\u007f\u0001\u0000\u0000\u0000\u0082\u0080\u0001"+
		"\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\f\u0001\u0000"+
		"\u0000\u0000\u0084\u008a\u0003\u0013\t\u0000\u0085\u008a\u0003\u0015\n"+
		"\u0000\u0086\u008a\u0003\u0017\u000b\u0000\u0087\u008a\u0003\u0019\f\u0000"+
		"\u0088\u008a\u0003\u001b\r\u0000\u0089\u0084\u0001\u0000\u0000\u0000\u0089"+
		"\u0085\u0001\u0000\u0000\u0000\u0089\u0086\u0001\u0000\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u000e\u0001\u0000\u0000\u0000\u008b\u008e\u0003%\u0012\u0000\u008c\u008e"+
		"\u0003\'\u0013\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008c\u0001"+
		"\u0000\u0000\u0000\u008e\u0010\u0001\u0000\u0000\u0000\u008f\u0090\u0005"+
		"!\u0000\u0000\u0090\u0012\u0001\u0000\u0000\u0000\u0091\u0092\u0005+\u0000"+
		"\u0000\u0092\u0014\u0001\u0000\u0000\u0000\u0093\u0094\u0005-\u0000\u0000"+
		"\u0094\u0016\u0001\u0000\u0000\u0000\u0095\u0096\u0005/\u0000\u0000\u0096"+
		"\u0018\u0001\u0000\u0000\u0000\u0097\u0098\u0005*\u0000\u0000\u0098\u001a"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0005%\u0000\u0000\u009a\u001c\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0005<\u0000\u0000\u009c\u001e\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0005>\u0000\u0000\u009e \u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0005=\u0000\u0000\u00a0\u00a1\u0005=\u0000\u0000\u00a1\""+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005!\u0000\u0000\u00a3\u00a4\u0005"+
		"=\u0000\u0000\u00a4$\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005&\u0000"+
		"\u0000\u00a6\u00a7\u0005&\u0000\u0000\u00a7&\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0005|\u0000\u0000\u00a9\u00aa\u0005|\u0000\u0000\u00aa(\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0005s\u0000\u0000\u00ac\u00ad\u0005e\u0000"+
		"\u0000\u00ad\u00ae\u0005t\u0000\u0000\u00ae\u00af\u0005u\u0000\u0000\u00af"+
		"\u00b0\u0005p\u0000\u0000\u00b0*\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005"+
		"l\u0000\u0000\u00b2\u00b3\u0005o\u0000\u0000\u00b3\u00b4\u0005o\u0000"+
		"\u0000\u00b4\u00b5\u0005p\u0000\u0000\u00b5,\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0005f\u0000\u0000\u00b7\u00b8\u0005u\u0000\u0000\u00b8\u00b9\u0005"+
		"n\u0000\u0000\u00b9\u00ba\u0005c\u0000\u0000\u00ba\u00bb\u0005 \u0000"+
		"\u0000\u00bb.\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005p\u0000\u0000\u00bd"+
		"\u00be\u0005r\u0000\u0000\u00be\u00bf\u0005o\u0000\u0000\u00bf\u00c0\u0005"+
		"c\u0000\u0000\u00c0\u00c1\u0005 \u0000\u0000\u00c10\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0005.\u0000\u0000\u00c3\u00c4\u0005W\u0000\u0000\u00c4"+
		"\u00c5\u0005r\u0000\u0000\u00c5\u00c6\u0005i\u0000\u0000\u00c6\u00c7\u0005"+
		"t\u0000\u0000\u00c7\u00c8\u0005e\u0000\u0000\u00c82\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0005.\u0000\u0000\u00ca\u00cb\u0005R\u0000\u0000\u00cb"+
		"\u00cc\u0005e\u0000\u0000\u00cc\u00cd\u0005a\u0000\u0000\u00cd\u00ce\u0005"+
		"d\u0000\u0000\u00ce\u00cf\u0005P\u0000\u0000\u00cf\u00d0\u0005w\u0000"+
		"\u0000\u00d0\u00d1\u0005m\u0000\u0000\u00d14\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0005.\u0000\u0000\u00d3\u00d4\u0005R\u0000\u0000\u00d4\u00d5\u0005"+
		"e\u0000\u0000\u00d5\u00d6\u0005a\u0000\u0000\u00d6\u00d7\u0005d\u0000"+
		"\u0000\u00d7\u00d8\u0005A\u0000\u0000\u00d8\u00d9\u0005n\u0000\u0000\u00d9"+
		"\u00da\u0005a\u0000\u0000\u00da\u00db\u0005l\u0000\u0000\u00db\u00dc\u0005"+
		"o\u0000\u0000\u00dc\u00dd\u0005g\u0000\u0000\u00dd6\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0005.\u0000\u0000\u00df\u00e0\u0005R\u0000\u0000\u00e0"+
		"\u00e1\u0005e\u0000\u0000\u00e1\u00e2\u0005a\u0000\u0000\u00e2\u00e3\u0005"+
		"d\u0000\u0000\u00e3\u00e4\u0005D\u0000\u0000\u00e4\u00e5\u0005i\u0000"+
		"\u0000\u00e5\u00e6\u0005g\u0000\u0000\u00e6\u00e7\u0005i\u0000\u0000\u00e7"+
		"\u00e8\u0005t\u0000\u0000\u00e8\u00e9\u0005a\u0000\u0000\u00e9\u00ea\u0005"+
		"l\u0000\u0000\u00ea8\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005(\u0000"+
		"\u0000\u00ec:\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005)\u0000\u0000\u00ee"+
		"<\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005{\u0000\u0000\u00f0>\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0005}\u0000\u0000\u00f2@\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\u0005;\u0000\u0000\u00f4B\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0005=\u0000\u0000\u00f6D\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005"+
		"~\u0000\u0000\u00f8F\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005H\u0000"+
		"\u0000\u00fa\u00fb\u0005I\u0000\u0000\u00fb\u00fc\u0005G\u0000\u0000\u00fc"+
		"\u00fd\u0005H\u0000\u0000\u00fdH\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005"+
		"L\u0000\u0000\u00ff\u0100\u0005O\u0000\u0000\u0100\u0101\u0005W\u0000"+
		"\u0000\u0101J\u0001\u0000\u0000\u0000\u0102\u0103\u0005o\u0000\u0000\u0103"+
		"\u0104\u0005u\u0000\u0000\u0104\u0108\u0005t\u0000\u0000\u0105\u0106\u0005"+
		"i\u0000\u0000\u0106\u0108\u0005n\u0000\u0000\u0107\u0102\u0001\u0000\u0000"+
		"\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108L\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0005T\u0000\u0000\u010a\u010b\u0005O\u0000\u0000\u010b\u010c"+
		"\u0005G\u0000\u0000\u010c\u010d\u0005G\u0000\u0000\u010d\u010e\u0005L"+
		"\u0000\u0000\u010e\u010f\u0005E\u0000\u0000\u010fN\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0005t\u0000\u0000\u0111\u0112\u0005r\u0000\u0000\u0112\u0113"+
		"\u0005u\u0000\u0000\u0113\u011a\u0005e\u0000\u0000\u0114\u0115\u0005f"+
		"\u0000\u0000\u0115\u0116\u0005a\u0000\u0000\u0116\u0117\u0005l\u0000\u0000"+
		"\u0117\u0118\u0005s\u0000\u0000\u0118\u011a\u0005e\u0000\u0000\u0119\u0110"+
		"\u0001\u0000\u0000\u0000\u0119\u0114\u0001\u0000\u0000\u0000\u011aP\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\u0005i\u0000\u0000\u011c\u011d\u0005f\u0000"+
		"\u0000\u011dR\u0001\u0000\u0000\u0000\u011e\u011f\u0005e\u0000\u0000\u011f"+
		"\u0120\u0005l\u0000\u0000\u0120\u0121\u0005s\u0000\u0000\u0121\u0122\u0005"+
		"e\u0000\u0000\u0122T\u0001\u0000\u0000\u0000\u0123\u0124\u0005r\u0000"+
		"\u0000\u0124\u0125\u0005e\u0000\u0000\u0125\u0126\u0005t\u0000\u0000\u0126"+
		"\u0127\u0005u\u0000\u0000\u0127\u0128\u0005r\u0000\u0000\u0128\u0129\u0005"+
		"n\u0000\u0000\u0129V\u0001\u0000\u0000\u0000\u012a\u012b\u0005w\u0000"+
		"\u0000\u012b\u012c\u0005h\u0000\u0000\u012c\u012d\u0005i\u0000\u0000\u012d"+
		"\u012e\u0005l\u0000\u0000\u012e\u012f\u0005e\u0000\u0000\u012fX\u0001"+
		"\u0000\u0000\u0000\u0130\u0132\u0005D\u0000\u0000\u0131\u0133\u0007\u0000"+
		"\u0000\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000"+
		"\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000"+
		"\u0000\u0000\u0135\u013d\u0001\u0000\u0000\u0000\u0136\u0138\u0005A\u0000"+
		"\u0000\u0137\u0139\u0007\u0000\u0000\u0000\u0138\u0137\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013d\u0001\u0000\u0000"+
		"\u0000\u013c\u0130\u0001\u0000\u0000\u0000\u013c\u0136\u0001\u0000\u0000"+
		"\u0000\u013dZ\u0001\u0000\u0000\u0000\u013e\u0140\u0007\u0000\u0000\u0000"+
		"\u013f\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000"+
		"\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000"+
		"\u0142\\\u0001\u0000\u0000\u0000\u0143\u0147\u0007\u0001\u0000\u0000\u0144"+
		"\u0146\u0007\u0002\u0000\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146"+
		"\u0149\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u0001\u0000\u0000\u0000\u0148^\u0001\u0000\u0000\u0000\u0149\u0147"+
		"\u0001\u0000\u0000\u0000\u014a\u014b\u0005/\u0000\u0000\u014b\u014c\u0005"+
		"*\u0000\u0000\u014c\u0150\u0001\u0000\u0000\u0000\u014d\u014f\t\u0000"+
		"\u0000\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014f\u0152\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000"+
		"\u0000\u0000\u0151\u0153\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u0005*\u0000\u0000\u0154\u0155\u0005/\u0000\u0000"+
		"\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u0006/\u0000\u0000\u0157"+
		"`\u0001\u0000\u0000\u0000\u0158\u0159\u0005/\u0000\u0000\u0159\u015a\u0005"+
		"/\u0000\u0000\u015a\u015e\u0001\u0000\u0000\u0000\u015b\u015d\b\u0003"+
		"\u0000\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015d\u0160\u0001\u0000"+
		"\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000"+
		"\u0000\u0000\u015f\u0161\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000"+
		"\u0000\u0000\u0161\u0162\u00060\u0000\u0000\u0162b\u0001\u0000\u0000\u0000"+
		"\u0163\u0166\u0007\u0004\u0000\u0000\u0164\u0166\u0003e2\u0000\u0165\u0163"+
		"\u0001\u0000\u0000\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0166\u0167"+
		"\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0168"+
		"\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a"+
		"\u00061\u0000\u0000\u016ad\u0001\u0000\u0000\u0000\u016b\u016c\u0005\r"+
		"\u0000\u0000\u016c\u016f\u0005\n\u0000\u0000\u016d\u016f\u0007\u0003\u0000"+
		"\u0000\u016e\u016b\u0001\u0000\u0000\u0000\u016e\u016d\u0001\u0000\u0000"+
		"\u0000\u016ff\u0001\u0000\u0000\u0000\u0010\u0000\u0082\u0089\u008d\u0107"+
		"\u0119\u0134\u013a\u013c\u0141\u0147\u0150\u015e\u0165\u0167\u016e\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}