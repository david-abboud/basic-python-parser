// Generated from d:\u005Cuni\EECE 334\Assignment 1\T.g by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		Integer=10, String=11, ID=12, WS=13;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_tuple = 2, RULE_tail = 3, RULE_value = 4, 
		RULE_assignment = 5, RULE_print = 6, RULE_addInt1 = 7, RULE_addInt2 = 8, 
		RULE_addStr1 = 9, RULE_addStr2 = 10, RULE_addTuple1 = 11, RULE_addTuple2 = 12, 
		RULE_unpacking = 13, RULE_unpacking2 = 14, RULE_slicing = 15, RULE_indexing = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "statement", "tuple", "tail", "value", "assignment", "print", 
			"addInt1", "addInt2", "addStr1", "addStr2", "addTuple1", "addTuple2", 
			"unpacking", "unpacking2", "slicing", "indexing"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'='", "'print('", "'['", "']'", "'+'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "Integer", 
			"String", "ID", "WS"
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

	@Override
	public String getGrammarFileName() { return "T.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	        ActionRoutines h = new ActionRoutines();
	 
	public TParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public String s;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				statement();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << ID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public UnpackingContext unpacking() {
			return getRuleContext(UnpackingContext.class,0);
		}
		public IndexingContext indexing() {
			return getRuleContext(IndexingContext.class,0);
		}
		public SlicingContext slicing() {
			return getRuleContext(SlicingContext.class,0);
		}
		public AddInt1Context addInt1() {
			return getRuleContext(AddInt1Context.class,0);
		}
		public AddStr1Context addStr1() {
			return getRuleContext(AddStr1Context.class,0);
		}
		public AddTuple1Context addTuple1() {
			return getRuleContext(AddTuple1Context.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				print();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				unpacking();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				indexing();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				slicing();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(44);
				addInt1();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(45);
				addStr1();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(46);
				addTuple1();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleContext extends ParserRuleContext {
		public String s;
		public ValueContext value;
		public TailContext tail;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TailContext tail() {
			return getRuleContext(TailContext.class,0);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__0);
			setState(50);
			((TupleContext)_localctx).value = value();
			setState(51);
			((TupleContext)_localctx).tail = tail();
			setState(52);
			match(T__1);
			((TupleContext)_localctx).s =  (((TupleContext)_localctx).value!=null?_input.getText(((TupleContext)_localctx).value.start,((TupleContext)_localctx).value.stop):null) + (((TupleContext)_localctx).tail!=null?_input.getText(((TupleContext)_localctx).tail.start,((TupleContext)_localctx).tail.stop):null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TailContext extends ParserRuleContext {
		public String s;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TailContext tail() {
			return getRuleContext(TailContext.class,0);
		}
		public TailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tail; }
	}

	public final TailContext tail() throws RecognitionException {
		TailContext _localctx = new TailContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tail);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(T__2);
				setState(56);
				value();
				setState(57);
				tail();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public String s;
		public Token Integer;
		public Token String;
		public TupleContext tuple;
		public Token ID;
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public TerminalNode String() { return getToken(TParser.String, 0); }
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public TerminalNode ID() { return getToken(TParser.ID, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				((ValueContext)_localctx).Integer = match(Integer);
				((ValueContext)_localctx).s =  (((ValueContext)_localctx).Integer!=null?((ValueContext)_localctx).Integer.getText():null);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				((ValueContext)_localctx).String = match(String);
				((ValueContext)_localctx).s =  (((ValueContext)_localctx).String!=null?((ValueContext)_localctx).String.getText():null);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				((ValueContext)_localctx).tuple = tuple();
				((ValueContext)_localctx).s =  (((ValueContext)_localctx).tuple!=null?_input.getText(((ValueContext)_localctx).tuple.start,((ValueContext)_localctx).tuple.stop):null);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				((ValueContext)_localctx).ID = match(ID);
				((ValueContext)_localctx).s =  (((ValueContext)_localctx).ID!=null?((ValueContext)_localctx).ID.getText():null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public String s;
		public Token i1;
		public Token Integer;
		public Token i2;
		public Token String;
		public Token i3;
		public TupleContext tuple;
		public Token i4;
		public Token i5;
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public List<TerminalNode> ID() { return getTokens(TParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TParser.ID, i);
		}
		public TerminalNode String() { return getToken(TParser.String, 0); }
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				((AssignmentContext)_localctx).i1 = match(ID);
				setState(74);
				match(T__3);
				setState(75);
				((AssignmentContext)_localctx).Integer = match(Integer);
				h.initMapInt((((AssignmentContext)_localctx).i1!=null?((AssignmentContext)_localctx).i1.getText():null), (((AssignmentContext)_localctx).Integer!=null?((AssignmentContext)_localctx).Integer.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				((AssignmentContext)_localctx).i2 = match(ID);
				setState(78);
				match(T__3);
				setState(79);
				((AssignmentContext)_localctx).String = match(String);
				h.initMapStr((((AssignmentContext)_localctx).i2!=null?((AssignmentContext)_localctx).i2.getText():null), (((AssignmentContext)_localctx).String!=null?((AssignmentContext)_localctx).String.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				((AssignmentContext)_localctx).i3 = match(ID);
				setState(82);
				match(T__3);
				setState(83);
				((AssignmentContext)_localctx).tuple = tuple();
				h.initMapTup((((AssignmentContext)_localctx).i3!=null?((AssignmentContext)_localctx).i3.getText():null), (((AssignmentContext)_localctx).tuple!=null?_input.getText(((AssignmentContext)_localctx).tuple.start,((AssignmentContext)_localctx).tuple.stop):null));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				((AssignmentContext)_localctx).i4 = match(ID);
				setState(87);
				match(T__3);
				setState(88);
				((AssignmentContext)_localctx).i5 = match(ID);
				h.initMapID((((AssignmentContext)_localctx).i4!=null?((AssignmentContext)_localctx).i4.getText():null), (((AssignmentContext)_localctx).i5!=null?((AssignmentContext)_localctx).i5.getText():null));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public String s;
		public Token ID;
		public Token String;
		public Token Integer;
		public TupleContext tuple;
		public Token id2;
		public TerminalNode ID() { return getToken(TParser.ID, 0); }
		public TerminalNode String() { return getToken(TParser.String, 0); }
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(T__4);
				setState(93);
				((PrintContext)_localctx).ID = match(ID);
				setState(94);
				match(T__1);
				h.printID((((PrintContext)_localctx).ID!=null?((PrintContext)_localctx).ID.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(T__4);
				setState(97);
				((PrintContext)_localctx).String = match(String);
				setState(98);
				match(T__1);
				h.printString((((PrintContext)_localctx).String!=null?((PrintContext)_localctx).String.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(T__4);
				setState(101);
				((PrintContext)_localctx).Integer = match(Integer);
				setState(102);
				match(T__1);
				System.out.println((((PrintContext)_localctx).Integer!=null?((PrintContext)_localctx).Integer.getText():null));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(T__4);
				setState(105);
				((PrintContext)_localctx).tuple = tuple();
				setState(106);
				match(T__1);
				System.out.println((((PrintContext)_localctx).tuple!=null?_input.getText(((PrintContext)_localctx).tuple.start,((PrintContext)_localctx).tuple.stop):null));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				match(T__4);
				setState(110);
				((PrintContext)_localctx).id2 = match(ID);
				setState(111);
				match(T__5);
				setState(112);
				((PrintContext)_localctx).Integer = match(Integer);
				setState(113);
				match(T__6);
				setState(114);
				match(T__1);
				h.printGet((((PrintContext)_localctx).id2!=null?((PrintContext)_localctx).id2.getText():null),(((PrintContext)_localctx).Integer!=null?((PrintContext)_localctx).Integer.getText():null));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddInt1Context extends ParserRuleContext {
		public Token ID;
		public Token i1;
		public AddInt2Context addInt2;
		public TerminalNode ID() { return getToken(TParser.ID, 0); }
		public AddInt2Context addInt2() {
			return getRuleContext(AddInt2Context.class,0);
		}
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public AddInt1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addInt1; }
	}

	public final AddInt1Context addInt1() throws RecognitionException {
		AddInt1Context _localctx = new AddInt1Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_addInt1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			((AddInt1Context)_localctx).ID = match(ID);
			setState(119);
			match(T__3);
			setState(120);
			((AddInt1Context)_localctx).i1 = match(Integer);
			setState(121);
			match(T__7);
			setState(122);
			((AddInt1Context)_localctx).addInt2 = addInt2();
			h.addInteger((((AddInt1Context)_localctx).ID!=null?((AddInt1Context)_localctx).ID.getText():null), (((AddInt1Context)_localctx).i1!=null?((AddInt1Context)_localctx).i1.getText():null), ((AddInt1Context)_localctx).addInt2.i); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddInt2Context extends ParserRuleContext {
		public String i;
		public Token i2;
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public AddInt2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addInt2; }
	}

	public final AddInt2Context addInt2() throws RecognitionException {
		AddInt2Context _localctx = new AddInt2Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_addInt2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(125);
				((AddInt2Context)_localctx).i2 = match(Integer);
				}
				break;
			case 2:
				{
				setState(126);
				((AddInt2Context)_localctx).i2 = match(Integer);
				setState(127);
				match(T__7);
				}
				break;
			}
			((AddInt2Context)_localctx).i = (((AddInt2Context)_localctx).i2!=null?((AddInt2Context)_localctx).i2.getText():null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddStr1Context extends ParserRuleContext {
		public Token ID;
		public Token i1;
		public AddStr2Context i2;
		public AddStr2Context addStr2;
		public TerminalNode ID() { return getToken(TParser.ID, 0); }
		public TerminalNode String() { return getToken(TParser.String, 0); }
		public AddStr2Context addStr2() {
			return getRuleContext(AddStr2Context.class,0);
		}
		public AddStr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addStr1; }
	}

	public final AddStr1Context addStr1() throws RecognitionException {
		AddStr1Context _localctx = new AddStr1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_addStr1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			((AddStr1Context)_localctx).ID = match(ID);
			setState(133);
			match(T__3);
			setState(134);
			((AddStr1Context)_localctx).i1 = match(String);
			setState(135);
			match(T__7);
			setState(136);
			((AddStr1Context)_localctx).i2 = ((AddStr1Context)_localctx).addStr2 = addStr2();
			h.addString((((AddStr1Context)_localctx).ID!=null?((AddStr1Context)_localctx).ID.getText():null), (((AddStr1Context)_localctx).i1!=null?((AddStr1Context)_localctx).i1.getText():null), ((AddStr1Context)_localctx).addStr2.i); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddStr2Context extends ParserRuleContext {
		public String i;
		public Token i2;
		public TerminalNode String() { return getToken(TParser.String, 0); }
		public AddStr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addStr2; }
	}

	public final AddStr2Context addStr2() throws RecognitionException {
		AddStr2Context _localctx = new AddStr2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_addStr2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(139);
				((AddStr2Context)_localctx).i2 = match(String);
				}
				break;
			case 2:
				{
				setState(140);
				((AddStr2Context)_localctx).i2 = match(String);
				setState(141);
				match(T__7);
				}
				break;
			}
			((AddStr2Context)_localctx).i = (((AddStr2Context)_localctx).i2!=null?((AddStr2Context)_localctx).i2.getText():null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddTuple1Context extends ParserRuleContext {
		public Token ID;
		public TupleContext i1;
		public AddTuple2Context i2;
		public TerminalNode ID() { return getToken(TParser.ID, 0); }
		public List<TupleContext> tuple() {
			return getRuleContexts(TupleContext.class);
		}
		public TupleContext tuple(int i) {
			return getRuleContext(TupleContext.class,i);
		}
		public AddTuple2Context addTuple2() {
			return getRuleContext(AddTuple2Context.class,0);
		}
		public AddTuple1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addTuple1; }
	}

	public final AddTuple1Context addTuple1() throws RecognitionException {
		AddTuple1Context _localctx = new AddTuple1Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_addTuple1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			((AddTuple1Context)_localctx).ID = match(ID);
			setState(147);
			match(T__3);
			setState(148);
			((AddTuple1Context)_localctx).i1 = tuple();
			setState(149);
			match(T__7);
			setState(150);
			tuple();
			setState(151);
			((AddTuple1Context)_localctx).i2 = addTuple2();
			h.addTuple((((AddTuple1Context)_localctx).ID!=null?((AddTuple1Context)_localctx).ID.getText():null), (((AddTuple1Context)_localctx).i1!=null?_input.getText(((AddTuple1Context)_localctx).i1.start,((AddTuple1Context)_localctx).i1.stop):null), ((AddTuple1Context)_localctx).i2.s);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddTuple2Context extends ParserRuleContext {
		public String s;
		public TupleContext tuple;
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public AddTuple2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addTuple2; }
	}

	public final AddTuple2Context addTuple2() throws RecognitionException {
		AddTuple2Context _localctx = new AddTuple2Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_addTuple2);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				((AddTuple2Context)_localctx).tuple = tuple();
				((AddTuple2Context)_localctx).s = (((AddTuple2Context)_localctx).tuple!=null?_input.getText(((AddTuple2Context)_localctx).tuple.start,((AddTuple2Context)_localctx).tuple.stop):null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				((AddTuple2Context)_localctx).tuple = tuple();
				setState(158);
				match(T__7);
				((AddTuple2Context)_localctx).s = (((AddTuple2Context)_localctx).tuple!=null?_input.getText(((AddTuple2Context)_localctx).tuple.start,((AddTuple2Context)_localctx).tuple.stop):null);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnpackingContext extends ParserRuleContext {
		public String s;
		public Unpacking2Context unpacking2() {
			return getRuleContext(Unpacking2Context.class,0);
		}
		public TerminalNode ID() { return getToken(TParser.ID, 0); }
		public UnpackingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpacking; }
	}

	public final UnpackingContext unpacking() throws RecognitionException {
		UnpackingContext _localctx = new UnpackingContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unpacking);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__0);
			setState(164);
			unpacking2();
			setState(165);
			match(T__3);
			setState(166);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unpacking2Context extends ParserRuleContext {
		public String s;
		public TerminalNode ID() { return getToken(TParser.ID, 0); }
		public Unpacking2Context unpacking2() {
			return getRuleContext(Unpacking2Context.class,0);
		}
		public Unpacking2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpacking2; }
	}

	public final Unpacking2Context unpacking2() throws RecognitionException {
		Unpacking2Context _localctx = new Unpacking2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_unpacking2);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(168);
				match(ID);
				setState(169);
				match(T__2);
				setState(170);
				unpacking2();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(171);
					match(ID);
					setState(172);
					match(T__1);
					}
					break;
				case T__1:
					{
					setState(173);
					match(T__1);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SlicingContext extends ParserRuleContext {
		public String s;
		public Token id1;
		public Token id2;
		public Token i1;
		public Token i2;
		public Token Integer;
		public List<TerminalNode> ID() { return getTokens(TParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TParser.ID, i);
		}
		public List<TerminalNode> Integer() { return getTokens(TParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(TParser.Integer, i);
		}
		public SlicingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slicing; }
	}

	public final SlicingContext slicing() throws RecognitionException {
		SlicingContext _localctx = new SlicingContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_slicing);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				((SlicingContext)_localctx).id1 = match(ID);
				setState(179);
				match(T__3);
				setState(180);
				((SlicingContext)_localctx).id2 = match(ID);
				setState(181);
				match(T__5);
				setState(182);
				((SlicingContext)_localctx).i1 = match(Integer);
				setState(183);
				match(T__8);
				setState(184);
				((SlicingContext)_localctx).i2 = match(Integer);
				setState(185);
				match(T__6);
				h.slice1((((SlicingContext)_localctx).id1!=null?((SlicingContext)_localctx).id1.getText():null), (((SlicingContext)_localctx).id2!=null?((SlicingContext)_localctx).id2.getText():null), (((SlicingContext)_localctx).i1!=null?((SlicingContext)_localctx).i1.getText():null), (((SlicingContext)_localctx).i2!=null?((SlicingContext)_localctx).i2.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				((SlicingContext)_localctx).id1 = match(ID);
				setState(188);
				match(T__3);
				setState(189);
				((SlicingContext)_localctx).id2 = match(ID);
				setState(190);
				match(T__5);
				setState(191);
				((SlicingContext)_localctx).Integer = match(Integer);
				setState(192);
				match(T__8);
				setState(193);
				match(T__6);
				h.slice2((((SlicingContext)_localctx).id1!=null?((SlicingContext)_localctx).id1.getText():null),(((SlicingContext)_localctx).id2!=null?((SlicingContext)_localctx).id2.getText():null),(((SlicingContext)_localctx).Integer!=null?((SlicingContext)_localctx).Integer.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				((SlicingContext)_localctx).id1 = match(ID);
				setState(196);
				match(T__3);
				setState(197);
				((SlicingContext)_localctx).id2 = match(ID);
				setState(198);
				match(T__5);
				setState(199);
				match(T__8);
				setState(200);
				((SlicingContext)_localctx).Integer = match(Integer);
				setState(201);
				match(T__6);
				h.slice3((((SlicingContext)_localctx).id1!=null?((SlicingContext)_localctx).id1.getText():null),(((SlicingContext)_localctx).id2!=null?((SlicingContext)_localctx).id2.getText():null),(((SlicingContext)_localctx).Integer!=null?((SlicingContext)_localctx).Integer.getText():null));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexingContext extends ParserRuleContext {
		public String s;
		public Token id1;
		public Token id2;
		public Token Integer;
		public Token id3;
		public TupleContext id5;
		public List<TerminalNode> Integer() { return getTokens(TParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(TParser.Integer, i);
		}
		public List<TerminalNode> ID() { return getTokens(TParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TParser.ID, i);
		}
		public TerminalNode String() { return getToken(TParser.String, 0); }
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public IndexingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexing; }
	}

	public final IndexingContext indexing() throws RecognitionException {
		IndexingContext _localctx = new IndexingContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_indexing);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				((IndexingContext)_localctx).id1 = match(ID);
				setState(206);
				match(T__3);
				setState(207);
				((IndexingContext)_localctx).id2 = match(ID);
				setState(208);
				match(T__5);
				setState(209);
				((IndexingContext)_localctx).Integer = match(Integer);
				setState(210);
				match(T__6);
				h.indexAssign((((IndexingContext)_localctx).id1!=null?((IndexingContext)_localctx).id1.getText():null),(((IndexingContext)_localctx).id2!=null?((IndexingContext)_localctx).id2.getText():null),(((IndexingContext)_localctx).Integer!=null?((IndexingContext)_localctx).Integer.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				((IndexingContext)_localctx).id1 = match(ID);
				setState(213);
				match(T__5);
				setState(214);
				((IndexingContext)_localctx).id2 = match(Integer);
				setState(215);
				match(T__6);
				setState(216);
				match(T__3);
				setState(217);
				((IndexingContext)_localctx).id3 = match(Integer);
				h.replaceIntStr((((IndexingContext)_localctx).id1!=null?((IndexingContext)_localctx).id1.getText():null),(((IndexingContext)_localctx).id2!=null?((IndexingContext)_localctx).id2.getText():null),(((IndexingContext)_localctx).id3!=null?((IndexingContext)_localctx).id3.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				((IndexingContext)_localctx).id1 = match(ID);
				setState(220);
				match(T__5);
				setState(221);
				((IndexingContext)_localctx).id2 = match(Integer);
				setState(222);
				match(T__6);
				setState(223);
				match(T__3);
				setState(224);
				((IndexingContext)_localctx).id3 = match(String);
				h.replaceIntStr((((IndexingContext)_localctx).id1!=null?((IndexingContext)_localctx).id1.getText():null),(((IndexingContext)_localctx).id2!=null?((IndexingContext)_localctx).id2.getText():null),(((IndexingContext)_localctx).id3!=null?((IndexingContext)_localctx).id3.getText():null));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				((IndexingContext)_localctx).id1 = match(ID);
				setState(227);
				match(T__5);
				setState(228);
				((IndexingContext)_localctx).id2 = match(Integer);
				setState(229);
				match(T__6);
				setState(230);
				match(T__3);
				setState(231);
				((IndexingContext)_localctx).id5 = tuple();
				h.replaceTup((((IndexingContext)_localctx).id1!=null?((IndexingContext)_localctx).id1.getText():null),(((IndexingContext)_localctx).id2!=null?((IndexingContext)_localctx).id2.getText():null),(((IndexingContext)_localctx).id5!=null?_input.getText(((IndexingContext)_localctx).id5.start,((IndexingContext)_localctx).id5.stop):null));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17\u00ef\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6J\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7]\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bw\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u0083\n\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u0091\n\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a4"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b1"+
		"\n\20\5\20\u00b3\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00ce\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00ed\n\22\3\22\2\2\23\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"\2\2\2\u00fa\2%\3\2\2\2\4\61\3\2\2\2\6\63\3\2"+
		"\2\2\b>\3\2\2\2\nI\3\2\2\2\f\\\3\2\2\2\16v\3\2\2\2\20x\3\2\2\2\22\u0082"+
		"\3\2\2\2\24\u0086\3\2\2\2\26\u0090\3\2\2\2\30\u0094\3\2\2\2\32\u00a3\3"+
		"\2\2\2\34\u00a5\3\2\2\2\36\u00b2\3\2\2\2 \u00cd\3\2\2\2\"\u00ec\3\2\2"+
		"\2$&\5\4\3\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\3\3\2\2\2)\62"+
		"\5\f\7\2*\62\5\16\b\2+\62\5\34\17\2,\62\5\"\22\2-\62\5 \21\2.\62\5\20"+
		"\t\2/\62\5\24\13\2\60\62\5\30\r\2\61)\3\2\2\2\61*\3\2\2\2\61+\3\2\2\2"+
		"\61,\3\2\2\2\61-\3\2\2\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\5\3"+
		"\2\2\2\63\64\7\3\2\2\64\65\5\n\6\2\65\66\5\b\5\2\66\67\7\4\2\2\678\b\4"+
		"\1\28\7\3\2\2\29:\7\5\2\2:;\5\n\6\2;<\5\b\5\2<?\3\2\2\2=?\3\2\2\2>9\3"+
		"\2\2\2>=\3\2\2\2?\t\3\2\2\2@A\7\f\2\2AJ\b\6\1\2BC\7\r\2\2CJ\b\6\1\2DE"+
		"\5\6\4\2EF\b\6\1\2FJ\3\2\2\2GH\7\16\2\2HJ\b\6\1\2I@\3\2\2\2IB\3\2\2\2"+
		"ID\3\2\2\2IG\3\2\2\2J\13\3\2\2\2KL\7\16\2\2LM\7\6\2\2MN\7\f\2\2N]\b\7"+
		"\1\2OP\7\16\2\2PQ\7\6\2\2QR\7\r\2\2R]\b\7\1\2ST\7\16\2\2TU\7\6\2\2UV\5"+
		"\6\4\2VW\b\7\1\2W]\3\2\2\2XY\7\16\2\2YZ\7\6\2\2Z[\7\16\2\2[]\b\7\1\2\\"+
		"K\3\2\2\2\\O\3\2\2\2\\S\3\2\2\2\\X\3\2\2\2]\r\3\2\2\2^_\7\7\2\2_`\7\16"+
		"\2\2`a\7\4\2\2aw\b\b\1\2bc\7\7\2\2cd\7\r\2\2de\7\4\2\2ew\b\b\1\2fg\7\7"+
		"\2\2gh\7\f\2\2hi\7\4\2\2iw\b\b\1\2jk\7\7\2\2kl\5\6\4\2lm\7\4\2\2mn\b\b"+
		"\1\2nw\3\2\2\2op\7\7\2\2pq\7\16\2\2qr\7\b\2\2rs\7\f\2\2st\7\t\2\2tu\7"+
		"\4\2\2uw\b\b\1\2v^\3\2\2\2vb\3\2\2\2vf\3\2\2\2vj\3\2\2\2vo\3\2\2\2w\17"+
		"\3\2\2\2xy\7\16\2\2yz\7\6\2\2z{\7\f\2\2{|\7\n\2\2|}\5\22\n\2}~\b\t\1\2"+
		"~\21\3\2\2\2\177\u0083\7\f\2\2\u0080\u0081\7\f\2\2\u0081\u0083\7\n\2\2"+
		"\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085"+
		"\b\n\1\2\u0085\23\3\2\2\2\u0086\u0087\7\16\2\2\u0087\u0088\7\6\2\2\u0088"+
		"\u0089\7\r\2\2\u0089\u008a\7\n\2\2\u008a\u008b\5\26\f\2\u008b\u008c\b"+
		"\13\1\2\u008c\25\3\2\2\2\u008d\u0091\7\r\2\2\u008e\u008f\7\r\2\2\u008f"+
		"\u0091\7\n\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0093\b\f\1\2\u0093\27\3\2\2\2\u0094\u0095\7\16\2\2\u0095\u0096"+
		"\7\6\2\2\u0096\u0097\5\6\4\2\u0097\u0098\7\n\2\2\u0098\u0099\5\6\4\2\u0099"+
		"\u009a\5\32\16\2\u009a\u009b\b\r\1\2\u009b\31\3\2\2\2\u009c\u009d\5\6"+
		"\4\2\u009d\u009e\b\16\1\2\u009e\u00a4\3\2\2\2\u009f\u00a0\5\6\4\2\u00a0"+
		"\u00a1\7\n\2\2\u00a1\u00a2\b\16\1\2\u00a2\u00a4\3\2\2\2\u00a3\u009c\3"+
		"\2\2\2\u00a3\u009f\3\2\2\2\u00a4\33\3\2\2\2\u00a5\u00a6\7\3\2\2\u00a6"+
		"\u00a7\5\36\20\2\u00a7\u00a8\7\6\2\2\u00a8\u00a9\7\16\2\2\u00a9\35\3\2"+
		"\2\2\u00aa\u00ab\7\16\2\2\u00ab\u00ac\7\5\2\2\u00ac\u00b3\5\36\20\2\u00ad"+
		"\u00ae\7\16\2\2\u00ae\u00b1\7\4\2\2\u00af\u00b1\7\4\2\2\u00b0\u00ad\3"+
		"\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\37\3\2\2\2\u00b4\u00b5\7\16\2\2\u00b5\u00b6\7\6\2"+
		"\2\u00b6\u00b7\7\16\2\2\u00b7\u00b8\7\b\2\2\u00b8\u00b9\7\f\2\2\u00b9"+
		"\u00ba\7\13\2\2\u00ba\u00bb\7\f\2\2\u00bb\u00bc\7\t\2\2\u00bc\u00ce\b"+
		"\21\1\2\u00bd\u00be\7\16\2\2\u00be\u00bf\7\6\2\2\u00bf\u00c0\7\16\2\2"+
		"\u00c0\u00c1\7\b\2\2\u00c1\u00c2\7\f\2\2\u00c2\u00c3\7\13\2\2\u00c3\u00c4"+
		"\7\t\2\2\u00c4\u00ce\b\21\1\2\u00c5\u00c6\7\16\2\2\u00c6\u00c7\7\6\2\2"+
		"\u00c7\u00c8\7\16\2\2\u00c8\u00c9\7\b\2\2\u00c9\u00ca\7\13\2\2\u00ca\u00cb"+
		"\7\f\2\2\u00cb\u00cc\7\t\2\2\u00cc\u00ce\b\21\1\2\u00cd\u00b4\3\2\2\2"+
		"\u00cd\u00bd\3\2\2\2\u00cd\u00c5\3\2\2\2\u00ce!\3\2\2\2\u00cf\u00d0\7"+
		"\16\2\2\u00d0\u00d1\7\6\2\2\u00d1\u00d2\7\16\2\2\u00d2\u00d3\7\b\2\2\u00d3"+
		"\u00d4\7\f\2\2\u00d4\u00d5\7\t\2\2\u00d5\u00ed\b\22\1\2\u00d6\u00d7\7"+
		"\16\2\2\u00d7\u00d8\7\b\2\2\u00d8\u00d9\7\f\2\2\u00d9\u00da\7\t\2\2\u00da"+
		"\u00db\7\6\2\2\u00db\u00dc\7\f\2\2\u00dc\u00ed\b\22\1\2\u00dd\u00de\7"+
		"\16\2\2\u00de\u00df\7\b\2\2\u00df\u00e0\7\f\2\2\u00e0\u00e1\7\t\2\2\u00e1"+
		"\u00e2\7\6\2\2\u00e2\u00e3\7\r\2\2\u00e3\u00ed\b\22\1\2\u00e4\u00e5\7"+
		"\16\2\2\u00e5\u00e6\7\b\2\2\u00e6\u00e7\7\f\2\2\u00e7\u00e8\7\t\2\2\u00e8"+
		"\u00e9\7\6\2\2\u00e9\u00ea\5\6\4\2\u00ea\u00eb\b\22\1\2\u00eb\u00ed\3"+
		"\2\2\2\u00ec\u00cf\3\2\2\2\u00ec\u00d6\3\2\2\2\u00ec\u00dd\3\2\2\2\u00ec"+
		"\u00e4\3\2\2\2\u00ed#\3\2\2\2\17\'\61>I\\v\u0082\u0090\u00a3\u00b0\u00b2"+
		"\u00cd\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}