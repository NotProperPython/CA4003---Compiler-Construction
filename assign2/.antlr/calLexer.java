// Generated from c:\Users\Umar\Desktop\Computer Applications (DC-121)\Year-4\semester 1\CA4003 - Compiler Construction\Assignments\assign2\cal.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Begin=1, Is=2, Variable=3, Constant=4, Return=5, Integer=6, Boolean=7, 
		Void=8, Main=9, If=10, Else=11, True=12, False=13, While=14, Sskip=15, 
		End=16, COMMA=17, SEMI=18, COLON=19, ASSIGN=20, LBR=21, RBR=22, PLUS=23, 
		MINUS=24, NOT=25, OR=26, AND=27, EQUAL=28, NOT_EQUAL=29, LESS_THAN=30, 
		LESS_THAN_EQUAL_TO=31, GREATER_THAN=32, GREATER_THAN_EQUAL_TO=33, ID=34, 
		NUMBER=35, BOOLEAN=36, WS=37, COMMENT=38, LINE_COMMENT=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ZERO", "DIGIT", "LETTER", "UnderScore", "A", "B", "C", "D", "E", "F", 
			"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
			"U", "V", "W", "X", "Y", "Z", "Begin", "Is", "Variable", "Constant", 
			"Return", "Integer", "Boolean", "Void", "Main", "If", "Else", "True", 
			"False", "While", "Sskip", "End", "COMMA", "SEMI", "COLON", "ASSIGN", 
			"LBR", "RBR", "PLUS", "MINUS", "NOT", "OR", "AND", "EQUAL", "NOT_EQUAL", 
			"LESS_THAN", "LESS_THAN_EQUAL_TO", "GREATER_THAN", "GREATER_THAN_EQUAL_TO", 
			"ID", "NUMBER", "BOOLEAN", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "','", "';'", "':'", "':='", "'('", "')'", 
			"'+'", "'-'", "'~'", "'|'", "'&'", "'='", "'!='", "'<'", "'<='", "'>'", 
			"'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Begin", "Is", "Variable", "Constant", "Return", "Integer", "Boolean", 
			"Void", "Main", "If", "Else", "True", "False", "While", "Sskip", "End", 
			"COMMA", "SEMI", "COLON", "ASSIGN", "LBR", "RBR", "PLUS", "MINUS", "NOT", 
			"OR", "AND", "EQUAL", "NOT_EQUAL", "LESS_THAN", "LESS_THAN_EQUAL_TO", 
			"GREATER_THAN", "GREATER_THAN_EQUAL_TO", "ID", "NUMBER", "BOOLEAN", "WS", 
			"COMMENT", "LINE_COMMENT"
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


	public calLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cal.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u018f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3"+
		" \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+"+
		"\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/"+
		"\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3"+
		"\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3<\3=\3=\3>\3>\3>\3?"+
		"\3?\3@\3@\3@\3A\3A\3A\3A\7A\u0152\nA\fA\16A\u0155\13A\3B\3B\5B\u0159\n"+
		"B\3B\3B\7B\u015d\nB\fB\16B\u0160\13B\5B\u0162\nB\3C\3C\3C\3C\3C\3C\3C"+
		"\3C\3C\5C\u016d\nC\3D\6D\u0170\nD\rD\16D\u0171\3D\3D\3E\3E\3E\3E\3E\7"+
		"E\u017b\nE\fE\16E\u017e\13E\3E\3E\3E\3E\3E\3F\3F\3F\3F\7F\u0189\nF\fF"+
		"\16F\u018c\13F\3F\3F\3\u017c\2G\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23"+
		"\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65"+
		"\2\67\29\2;\2=\2?\3A\4C\5E\6G\7I\bK\tM\nO\13Q\fS\rU\16W\17Y\20[\21]\22"+
		"_\23a\24c\25e\26g\27i\30k\31m\32o\33q\34s\35u\36w\37y {!}\"\177#\u0081"+
		"$\u0083%\u0085&\u0087\'\u0089(\u008b)\3\2\"\3\2\62\62\3\2\62;\4\2C\\c"+
		"|\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2"+
		"KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4"+
		"\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\"+
		"||\3\2\63;\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u017b\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\3\u008d\3\2\2\2\5\u008f\3\2\2\2\7\u0091\3\2\2"+
		"\2\t\u0093\3\2\2\2\13\u0095\3\2\2\2\r\u0097\3\2\2\2\17\u0099\3\2\2\2\21"+
		"\u009b\3\2\2\2\23\u009d\3\2\2\2\25\u009f\3\2\2\2\27\u00a1\3\2\2\2\31\u00a3"+
		"\3\2\2\2\33\u00a5\3\2\2\2\35\u00a7\3\2\2\2\37\u00a9\3\2\2\2!\u00ab\3\2"+
		"\2\2#\u00ad\3\2\2\2%\u00af\3\2\2\2\'\u00b1\3\2\2\2)\u00b3\3\2\2\2+\u00b5"+
		"\3\2\2\2-\u00b7\3\2\2\2/\u00b9\3\2\2\2\61\u00bb\3\2\2\2\63\u00bd\3\2\2"+
		"\2\65\u00bf\3\2\2\2\67\u00c1\3\2\2\29\u00c3\3\2\2\2;\u00c5\3\2\2\2=\u00c7"+
		"\3\2\2\2?\u00c9\3\2\2\2A\u00cf\3\2\2\2C\u00d2\3\2\2\2E\u00db\3\2\2\2G"+
		"\u00e4\3\2\2\2I\u00eb\3\2\2\2K\u00f3\3\2\2\2M\u00fb\3\2\2\2O\u0100\3\2"+
		"\2\2Q\u0105\3\2\2\2S\u0108\3\2\2\2U\u010d\3\2\2\2W\u0112\3\2\2\2Y\u0118"+
		"\3\2\2\2[\u011e\3\2\2\2]\u0123\3\2\2\2_\u0127\3\2\2\2a\u0129\3\2\2\2c"+
		"\u012b\3\2\2\2e\u012d\3\2\2\2g\u0130\3\2\2\2i\u0132\3\2\2\2k\u0134\3\2"+
		"\2\2m\u0136\3\2\2\2o\u0138\3\2\2\2q\u013a\3\2\2\2s\u013c\3\2\2\2u\u013e"+
		"\3\2\2\2w\u0140\3\2\2\2y\u0143\3\2\2\2{\u0145\3\2\2\2}\u0148\3\2\2\2\177"+
		"\u014a\3\2\2\2\u0081\u014d\3\2\2\2\u0083\u0161\3\2\2\2\u0085\u016c\3\2"+
		"\2\2\u0087\u016f\3\2\2\2\u0089\u0175\3\2\2\2\u008b\u0184\3\2\2\2\u008d"+
		"\u008e\t\2\2\2\u008e\4\3\2\2\2\u008f\u0090\t\3\2\2\u0090\6\3\2\2\2\u0091"+
		"\u0092\t\4\2\2\u0092\b\3\2\2\2\u0093\u0094\7a\2\2\u0094\n\3\2\2\2\u0095"+
		"\u0096\t\5\2\2\u0096\f\3\2\2\2\u0097\u0098\t\6\2\2\u0098\16\3\2\2\2\u0099"+
		"\u009a\t\7\2\2\u009a\20\3\2\2\2\u009b\u009c\t\b\2\2\u009c\22\3\2\2\2\u009d"+
		"\u009e\t\t\2\2\u009e\24\3\2\2\2\u009f\u00a0\t\n\2\2\u00a0\26\3\2\2\2\u00a1"+
		"\u00a2\t\13\2\2\u00a2\30\3\2\2\2\u00a3\u00a4\t\f\2\2\u00a4\32\3\2\2\2"+
		"\u00a5\u00a6\t\r\2\2\u00a6\34\3\2\2\2\u00a7\u00a8\t\16\2\2\u00a8\36\3"+
		"\2\2\2\u00a9\u00aa\t\17\2\2\u00aa \3\2\2\2\u00ab\u00ac\t\20\2\2\u00ac"+
		"\"\3\2\2\2\u00ad\u00ae\t\21\2\2\u00ae$\3\2\2\2\u00af\u00b0\t\22\2\2\u00b0"+
		"&\3\2\2\2\u00b1\u00b2\t\23\2\2\u00b2(\3\2\2\2\u00b3\u00b4\t\24\2\2\u00b4"+
		"*\3\2\2\2\u00b5\u00b6\t\25\2\2\u00b6,\3\2\2\2\u00b7\u00b8\t\26\2\2\u00b8"+
		".\3\2\2\2\u00b9\u00ba\t\27\2\2\u00ba\60\3\2\2\2\u00bb\u00bc\t\30\2\2\u00bc"+
		"\62\3\2\2\2\u00bd\u00be\t\31\2\2\u00be\64\3\2\2\2\u00bf\u00c0\t\32\2\2"+
		"\u00c0\66\3\2\2\2\u00c1\u00c2\t\33\2\2\u00c28\3\2\2\2\u00c3\u00c4\t\34"+
		"\2\2\u00c4:\3\2\2\2\u00c5\u00c6\t\35\2\2\u00c6<\3\2\2\2\u00c7\u00c8\t"+
		"\36\2\2\u00c8>\3\2\2\2\u00c9\u00ca\5\r\7\2\u00ca\u00cb\5\23\n\2\u00cb"+
		"\u00cc\5\27\f\2\u00cc\u00cd\5\33\16\2\u00cd\u00ce\5%\23\2\u00ce@\3\2\2"+
		"\2\u00cf\u00d0\5\33\16\2\u00d0\u00d1\5/\30\2\u00d1B\3\2\2\2\u00d2\u00d3"+
		"\5\65\33\2\u00d3\u00d4\5\13\6\2\u00d4\u00d5\5-\27\2\u00d5\u00d6\5\33\16"+
		"\2\u00d6\u00d7\5\13\6\2\u00d7\u00d8\5\r\7\2\u00d8\u00d9\5!\21\2\u00d9"+
		"\u00da\5\23\n\2\u00daD\3\2\2\2\u00db\u00dc\5\17\b\2\u00dc\u00dd\5\'\24"+
		"\2\u00dd\u00de\5%\23\2\u00de\u00df\5/\30\2\u00df\u00e0\5\61\31\2\u00e0"+
		"\u00e1\5\13\6\2\u00e1\u00e2\5%\23\2\u00e2\u00e3\5\61\31\2\u00e3F\3\2\2"+
		"\2\u00e4\u00e5\5-\27\2\u00e5\u00e6\5\23\n\2\u00e6\u00e7\5\61\31\2\u00e7"+
		"\u00e8\5\63\32\2\u00e8\u00e9\5-\27\2\u00e9\u00ea\5%\23\2\u00eaH\3\2\2"+
		"\2\u00eb\u00ec\5\33\16\2\u00ec\u00ed\5%\23\2\u00ed\u00ee\5\61\31\2\u00ee"+
		"\u00ef\5\23\n\2\u00ef\u00f0\5\27\f\2\u00f0\u00f1\5\23\n\2\u00f1\u00f2"+
		"\5-\27\2\u00f2J\3\2\2\2\u00f3\u00f4\5\r\7\2\u00f4\u00f5\5\'\24\2\u00f5"+
		"\u00f6\5\'\24\2\u00f6\u00f7\5!\21\2\u00f7\u00f8\5\23\n\2\u00f8\u00f9\5"+
		"\13\6\2\u00f9\u00fa\5%\23\2\u00faL\3\2\2\2\u00fb\u00fc\5\65\33\2\u00fc"+
		"\u00fd\5\'\24\2\u00fd\u00fe\5\33\16\2\u00fe\u00ff\5\21\t\2\u00ffN\3\2"+
		"\2\2\u0100\u0101\5#\22\2\u0101\u0102\5\13\6\2\u0102\u0103\5\33\16\2\u0103"+
		"\u0104\5%\23\2\u0104P\3\2\2\2\u0105\u0106\5\33\16\2\u0106\u0107\5\25\13"+
		"\2\u0107R\3\2\2\2\u0108\u0109\5\23\n\2\u0109\u010a\5!\21\2\u010a\u010b"+
		"\5/\30\2\u010b\u010c\5\23\n\2\u010cT\3\2\2\2\u010d\u010e\5\61\31\2\u010e"+
		"\u010f\5-\27\2\u010f\u0110\5\63\32\2\u0110\u0111\5\23\n\2\u0111V\3\2\2"+
		"\2\u0112\u0113\5\25\13\2\u0113\u0114\5\13\6\2\u0114\u0115\5!\21\2\u0115"+
		"\u0116\5/\30\2\u0116\u0117\5\23\n\2\u0117X\3\2\2\2\u0118\u0119\5\67\34"+
		"\2\u0119\u011a\5\31\r\2\u011a\u011b\5\33\16\2\u011b\u011c\5!\21\2\u011c"+
		"\u011d\5\23\n\2\u011dZ\3\2\2\2\u011e\u011f\5/\30\2\u011f\u0120\5\37\20"+
		"\2\u0120\u0121\5\33\16\2\u0121\u0122\5)\25\2\u0122\\\3\2\2\2\u0123\u0124"+
		"\5\23\n\2\u0124\u0125\5%\23\2\u0125\u0126\5\21\t\2\u0126^\3\2\2\2\u0127"+
		"\u0128\7.\2\2\u0128`\3\2\2\2\u0129\u012a\7=\2\2\u012ab\3\2\2\2\u012b\u012c"+
		"\7<\2\2\u012cd\3\2\2\2\u012d\u012e\7<\2\2\u012e\u012f\7?\2\2\u012ff\3"+
		"\2\2\2\u0130\u0131\7*\2\2\u0131h\3\2\2\2\u0132\u0133\7+\2\2\u0133j\3\2"+
		"\2\2\u0134\u0135\7-\2\2\u0135l\3\2\2\2\u0136\u0137\7/\2\2\u0137n\3\2\2"+
		"\2\u0138\u0139\7\u0080\2\2\u0139p\3\2\2\2\u013a\u013b\7~\2\2\u013br\3"+
		"\2\2\2\u013c\u013d\7(\2\2\u013dt\3\2\2\2\u013e\u013f\7?\2\2\u013fv\3\2"+
		"\2\2\u0140\u0141\7#\2\2\u0141\u0142\7?\2\2\u0142x\3\2\2\2\u0143\u0144"+
		"\7>\2\2\u0144z\3\2\2\2\u0145\u0146\7>\2\2\u0146\u0147\7?\2\2\u0147|\3"+
		"\2\2\2\u0148\u0149\7@\2\2\u0149~\3\2\2\2\u014a\u014b\7@\2\2\u014b\u014c"+
		"\7?\2\2\u014c\u0080\3\2\2\2\u014d\u0153\5\7\4\2\u014e\u0152\5\7\4\2\u014f"+
		"\u0152\5\5\3\2\u0150\u0152\5\t\5\2\u0151\u014e\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0082\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0162\5\3"+
		"\2\2\u0157\u0159\5m\67\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015e\t\37\2\2\u015b\u015d\5\5\3\2\u015c\u015b\3"+
		"\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0156\3\2\2\2\u0161\u0158\3\2"+
		"\2\2\u0162\u0084\3\2\2\2\u0163\u0164\7v\2\2\u0164\u0165\7t\2\2\u0165\u0166"+
		"\7w\2\2\u0166\u016d\7g\2\2\u0167\u0168\7h\2\2\u0168\u0169\7c\2\2\u0169"+
		"\u016a\7n\2\2\u016a\u016b\7u\2\2\u016b\u016d\7g\2\2\u016c\u0163\3\2\2"+
		"\2\u016c\u0167\3\2\2\2\u016d\u0086\3\2\2\2\u016e\u0170\t \2\2\u016f\u016e"+
		"\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0174\bD\2\2\u0174\u0088\3\2\2\2\u0175\u0176\7\61"+
		"\2\2\u0176\u0177\7,\2\2\u0177\u017c\3\2\2\2\u0178\u017b\5\u0089E\2\u0179"+
		"\u017b\13\2\2\2\u017a\u0178\3\2\2\2\u017a\u0179\3\2\2\2\u017b\u017e\3"+
		"\2\2\2\u017c\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017f\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017f\u0180\7,\2\2\u0180\u0181\7\61\2\2\u0181\u0182\3\2"+
		"\2\2\u0182\u0183\bE\2\2\u0183\u008a\3\2\2\2\u0184\u0185\7\61\2\2\u0185"+
		"\u0186\7\61\2\2\u0186\u018a\3\2\2\2\u0187\u0189\n!\2\2\u0188\u0187\3\2"+
		"\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\bF\2\2\u018e\u008c\3\2"+
		"\2\2\r\2\u0151\u0153\u0158\u015e\u0161\u016c\u0171\u017a\u017c\u018a\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}