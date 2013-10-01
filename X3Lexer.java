// Generated from X3Lexer.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class X3Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, LANGLE=3, RANGLE=4, LSQBRACKET=5, RSQBRACKET=6, LCURLY=7, 
		RCURLY=8, COMMA=9, DOT=10, ASSIGN=11, SEMICOLON=12, COLON=13, BANG=14, 
		ONWARDS=15, NONWARDS=16, THROUGH=17, NTHROUGH=18, THROUGHN=19, NTHROUGHN=20, 
		APPEND=21, LEQ=22, GEQ=23, EQ=24, NEQ=25, AND=26, OR=27, MOD=28, TIMES=29, 
		PLUS=30, MINUS=31, DIVIDE=32, TRUE=33, FALSE=34, IF=35, ELSE=36, WHILE=37, 
		FOR=38, RETURN=39, IN=40, INTERFACE=41, EXTENDS=42, FUN=43, SUPER=44, 
		THING=45, NOTHING=46, CLASS=47, INT=48, STRING=49, S_COMMENT=50, M_COMMENT=51, 
		TVAR=52, TNAME=53, VNAME=54, WS=55;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'('", "')'", "'<'", "'>'", "'['", "']'", "'{'", "'}'", "','", "'.'", 
		"':='", "';'", "':'", "'!'", "'...'", "'<..'", "'..'", "'<.'", "'.<'", 
		"'<<'", "'++'", "'<='", "'>='", "'=='", "'!='", "'&'", "'|'", "'%'", "'*'", 
		"'+'", "'-'", "'/'", "'true'", "'false'", "'if'", "'else'", "'while'", 
		"'for'", "'return'", "'in'", "'interface'", "'extends'", "'fun'", "'super'", 
		"'Thing'", "'Nothing'", "'class'", "INT", "STRING", "S_COMMENT", "M_COMMENT", 
		"TVAR", "TNAME", "VNAME", "WS"
	};
	public static final String[] ruleNames = {
		"LPAREN", "RPAREN", "LANGLE", "RANGLE", "LSQBRACKET", "RSQBRACKET", "LCURLY", 
		"RCURLY", "COMMA", "DOT", "ASSIGN", "SEMICOLON", "COLON", "BANG", "ONWARDS", 
		"NONWARDS", "THROUGH", "NTHROUGH", "THROUGHN", "NTHROUGHN", "APPEND", 
		"LEQ", "GEQ", "EQ", "NEQ", "AND", "OR", "MOD", "TIMES", "PLUS", "MINUS", 
		"DIVIDE", "TRUE", "FALSE", "IF", "ELSE", "WHILE", "FOR", "RETURN", "IN", 
		"INTERFACE", "EXTENDS", "FUN", "SUPER", "THING", "NOTHING", "CLASS", "INT", 
		"STRING", "S_COMMENT", "M_COMMENT", "TVAR", "TNAME", "VNAME", "WS"
	};


	public X3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "X3Lexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 49: S_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 50: M_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 54: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void M_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void S_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\29\u015a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3."+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\6\61\u0118"+
		"\n\61\r\61\16\61\u0119\3\62\3\62\7\62\u011e\n\62\f\62\16\62\u0121\13\62"+
		"\3\62\3\62\3\63\3\63\7\63\u0127\n\63\f\63\16\63\u012a\13\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\7\64\u0132\n\64\f\64\16\64\u0135\13\64\3\64\3\64"+
		"\7\64\u0139\n\64\f\64\16\64\u013c\13\64\7\64\u013e\n\64\f\64\16\64\u0141"+
		"\13\64\3\64\3\64\3\64\3\64\3\65\3\65\3\66\3\66\7\66\u014b\n\66\f\66\16"+
		"\66\u014e\13\66\3\67\3\67\7\67\u0152\n\67\f\67\16\67\u0155\13\67\38\3"+
		"8\38\38\4\u011f\u01289\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21"+
		"\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1"+
		"%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\1"+
		"9\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1"+
		"Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\2g\65\3i\66\1k\67\1m8\1o9\4\3\2\n"+
		"\3\2\62;\4\2\13\f\17\17\4\2\f\f\17\17\4\2))bb\3\2C\\\7\2\62;C\\^^aac|"+
		"\3\2c|\5\2\13\f\17\17\"\"\u0161\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5s\3\2\2\2\7u"+
		"\3\2\2\2\tw\3\2\2\2\13y\3\2\2\2\r{\3\2\2\2\17}\3\2\2\2\21\177\3\2\2\2"+
		"\23\u0081\3\2\2\2\25\u0083\3\2\2\2\27\u0085\3\2\2\2\31\u0088\3\2\2\2\33"+
		"\u008a\3\2\2\2\35\u008c\3\2\2\2\37\u008e\3\2\2\2!\u0092\3\2\2\2#\u0096"+
		"\3\2\2\2%\u0099\3\2\2\2\'\u009c\3\2\2\2)\u009f\3\2\2\2+\u00a2\3\2\2\2"+
		"-\u00a5\3\2\2\2/\u00a8\3\2\2\2\61\u00ab\3\2\2\2\63\u00ae\3\2\2\2\65\u00b1"+
		"\3\2\2\2\67\u00b3\3\2\2\29\u00b5\3\2\2\2;\u00b7\3\2\2\2=\u00b9\3\2\2\2"+
		"?\u00bb\3\2\2\2A\u00bd\3\2\2\2C\u00bf\3\2\2\2E\u00c4\3\2\2\2G\u00ca\3"+
		"\2\2\2I\u00cd\3\2\2\2K\u00d2\3\2\2\2M\u00d8\3\2\2\2O\u00dc\3\2\2\2Q\u00e3"+
		"\3\2\2\2S\u00e6\3\2\2\2U\u00f0\3\2\2\2W\u00f8\3\2\2\2Y\u00fc\3\2\2\2["+
		"\u0102\3\2\2\2]\u0108\3\2\2\2_\u0110\3\2\2\2a\u0117\3\2\2\2c\u011b\3\2"+
		"\2\2e\u0124\3\2\2\2g\u012f\3\2\2\2i\u0146\3\2\2\2k\u0148\3\2\2\2m\u014f"+
		"\3\2\2\2o\u0156\3\2\2\2qr\7*\2\2r\4\3\2\2\2st\7+\2\2t\6\3\2\2\2uv\7>\2"+
		"\2v\b\3\2\2\2wx\7@\2\2x\n\3\2\2\2yz\7]\2\2z\f\3\2\2\2{|\7_\2\2|\16\3\2"+
		"\2\2}~\7}\2\2~\20\3\2\2\2\177\u0080\7\177\2\2\u0080\22\3\2\2\2\u0081\u0082"+
		"\7.\2\2\u0082\24\3\2\2\2\u0083\u0084\7\60\2\2\u0084\26\3\2\2\2\u0085\u0086"+
		"\7<\2\2\u0086\u0087\7?\2\2\u0087\30\3\2\2\2\u0088\u0089\7=\2\2\u0089\32"+
		"\3\2\2\2\u008a\u008b\7<\2\2\u008b\34\3\2\2\2\u008c\u008d\7#\2\2\u008d"+
		"\36\3\2\2\2\u008e\u008f\7\60\2\2\u008f\u0090\7\60\2\2\u0090\u0091\7\60"+
		"\2\2\u0091 \3\2\2\2\u0092\u0093\7>\2\2\u0093\u0094\7\60\2\2\u0094\u0095"+
		"\7\60\2\2\u0095\"\3\2\2\2\u0096\u0097\7\60\2\2\u0097\u0098\7\60\2\2\u0098"+
		"$\3\2\2\2\u0099\u009a\7>\2\2\u009a\u009b\7\60\2\2\u009b&\3\2\2\2\u009c"+
		"\u009d\7\60\2\2\u009d\u009e\7>\2\2\u009e(\3\2\2\2\u009f\u00a0\7>\2\2\u00a0"+
		"\u00a1\7>\2\2\u00a1*\3\2\2\2\u00a2\u00a3\7-\2\2\u00a3\u00a4\7-\2\2\u00a4"+
		",\3\2\2\2\u00a5\u00a6\7>\2\2\u00a6\u00a7\7?\2\2\u00a7.\3\2\2\2\u00a8\u00a9"+
		"\7@\2\2\u00a9\u00aa\7?\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\7?\2\2\u00ac\u00ad"+
		"\7?\2\2\u00ad\62\3\2\2\2\u00ae\u00af\7#\2\2\u00af\u00b0\7?\2\2\u00b0\64"+
		"\3\2\2\2\u00b1\u00b2\7(\2\2\u00b2\66\3\2\2\2\u00b3\u00b4\7~\2\2\u00b4"+
		"8\3\2\2\2\u00b5\u00b6\7\'\2\2\u00b6:\3\2\2\2\u00b7\u00b8\7,\2\2\u00b8"+
		"<\3\2\2\2\u00b9\u00ba\7-\2\2\u00ba>\3\2\2\2\u00bb\u00bc\7/\2\2\u00bc@"+
		"\3\2\2\2\u00bd\u00be\7\61\2\2\u00beB\3\2\2\2\u00bf\u00c0\7v\2\2\u00c0"+
		"\u00c1\7t\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7g\2\2\u00c3D\3\2\2\2\u00c4"+
		"\u00c5\7h\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7u\2\2"+
		"\u00c8\u00c9\7g\2\2\u00c9F\3\2\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7h\2"+
		"\2\u00ccH\3\2\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7"+
		"u\2\2\u00d0\u00d1\7g\2\2\u00d1J\3\2\2\2\u00d2\u00d3\7y\2\2\u00d3\u00d4"+
		"\7j\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7g\2\2\u00d7"+
		"L\3\2\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7t\2\2\u00db"+
		"N\3\2\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7v\2\2\u00df"+
		"\u00e0\7w\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7p\2\2\u00e2P\3\2\2\2\u00e3"+
		"\u00e4\7k\2\2\u00e4\u00e5\7p\2\2\u00e5R\3\2\2\2\u00e6\u00e7\7k\2\2\u00e7"+
		"\u00e8\7p\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7t\2\2"+
		"\u00eb\u00ec\7h\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7e\2\2\u00ee\u00ef"+
		"\7g\2\2\u00efT\3\2\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7z\2\2\u00f2\u00f3"+
		"\7v\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7f\2\2\u00f6"+
		"\u00f7\7u\2\2\u00f7V\3\2\2\2\u00f8\u00f9\7h\2\2\u00f9\u00fa\7w\2\2\u00fa"+
		"\u00fb\7p\2\2\u00fbX\3\2\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7w\2\2\u00fe"+
		"\u00ff\7r\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7t\2\2\u0101Z\3\2\2\2\u0102"+
		"\u0103\7V\2\2\u0103\u0104\7j\2\2\u0104\u0105\7k\2\2\u0105\u0106\7p\2\2"+
		"\u0106\u0107\7i\2\2\u0107\\\3\2\2\2\u0108\u0109\7P\2\2\u0109\u010a\7q"+
		"\2\2\u010a\u010b\7v\2\2\u010b\u010c\7j\2\2\u010c\u010d\7k\2\2\u010d\u010e"+
		"\7p\2\2\u010e\u010f\7i\2\2\u010f^\3\2\2\2\u0110\u0111\7e\2\2\u0111\u0112"+
		"\7n\2\2\u0112\u0113\7c\2\2\u0113\u0114\7u\2\2\u0114\u0115\7u\2\2\u0115"+
		"`\3\2\2\2\u0116\u0118\t\2\2\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2"+
		"\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011ab\3\2\2\2\u011b\u011f\7"+
		"$\2\2\u011c\u011e\n\3\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0122\u0123\7$\2\2\u0123d\3\2\2\2\u0124\u0128\7%\2\2\u0125\u0127"+
		"\13\2\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0129\3\2\2\2"+
		"\u0128\u0126\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c"+
		"\t\4\2\2\u012c\u012d\3\2\2\2\u012d\u012e\b\63\2\2\u012ef\3\2\2\2\u012f"+
		"\u0133\7b\2\2\u0130\u0132\n\5\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u013f\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0136\u013a\5g\64\2\u0137\u0139\n\5\2\2\u0138\u0137\3\2"+
		"\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u0136\3\2\2\2\u013e\u0141\3\2"+
		"\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0142\u0143\7)\2\2\u0143\u0144\3\2\2\2\u0144\u0145\b\64"+
		"\3\2\u0145h\3\2\2\2\u0146\u0147\t\6\2\2\u0147j\3\2\2\2\u0148\u014c\t\6"+
		"\2\2\u0149\u014b\t\7\2\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014dl\3\2\2\2\u014e\u014c\3\2\2\2"+
		"\u014f\u0153\t\b\2\2\u0150\u0152\t\7\2\2\u0151\u0150\3\2\2\2\u0152\u0155"+
		"\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154n\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0156\u0157\t\t\2\2\u0157\u0158\3\2\2\2\u0158\u0159\b8"+
		"\4\2\u0159p\3\2\2\2\13\2\u0119\u011f\u0128\u0133\u013a\u013f\u014c\u0153";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
