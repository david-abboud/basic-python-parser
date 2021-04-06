// $ANTLR 3.5.2 T.g 2021-04-03 18:57:54

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class TParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Digit", "ID", "Integer", "String", 
		"WS", "'('", "')'", "'+'", "','", "':'", "'='", "'['", "']'", "'print('"
	};
	public static final int EOF=-1;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int Digit=4;
	public static final int ID=5;
	public static final int Integer=6;
	public static final int String=7;
	public static final int WS=8;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public TParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public TParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return TParser.tokenNames; }
	@Override public String getGrammarFileName() { return "T.g"; }


	        ActionRoutines h = new ActionRoutines();
	 


	// $ANTLR start "prog"
	// T.g:12:1: prog returns [String s] : ( statement )+ ;
	public final String prog() throws RecognitionException {
		String s = null;


		try {
			// T.g:12:26: ( ( statement )+ )
			// T.g:12:28: ( statement )+
			{
			// T.g:12:28: ( statement )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==9||LA1_0==17) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// T.g:12:29: statement
					{
					pushFollow(FOLLOW_statement_in_prog55);
					statement();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "prog"



	// $ANTLR start "statement"
	// T.g:14:1: statement : ( assignment | print | unpacking | indexing | slicing | addInt1 | addStr1 );
	public final void statement() throws RecognitionException {
		try {
			// T.g:14:11: ( assignment | print | unpacking | indexing | slicing | addInt1 | addStr1 )
			int alt2=7;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA2_1 = input.LA(2);
				if ( (LA2_1==14) ) {
					switch ( input.LA(3) ) {
					case Integer:
						{
						int LA2_6 = input.LA(4);
						if ( (LA2_6==11) ) {
							alt2=6;
						}
						else if ( (LA2_6==EOF||LA2_6==ID||LA2_6==9||LA2_6==17) ) {
							alt2=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 2, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case String:
						{
						int LA2_7 = input.LA(4);
						if ( (LA2_7==11) ) {
							alt2=7;
						}
						else if ( (LA2_7==EOF||LA2_7==ID||LA2_7==9||LA2_7==17) ) {
							alt2=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 2, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case ID:
						{
						int LA2_8 = input.LA(4);
						if ( (LA2_8==15) ) {
							int LA2_12 = input.LA(5);
							if ( (LA2_12==Integer) ) {
								int LA2_13 = input.LA(6);
								if ( (LA2_13==16) ) {
									alt2=4;
								}
								else if ( (LA2_13==13) ) {
									alt2=5;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 2, 13, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA2_12==13) ) {
								alt2=5;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 2, 12, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA2_8==EOF||LA2_8==ID||LA2_8==9||LA2_8==17) ) {
							alt2=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 2, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 9:
						{
						alt2=1;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA2_1==15) ) {
					alt2=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 17:
				{
				alt2=2;
				}
				break;
			case 9:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// T.g:14:19: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement72);
					assignment();
					state._fsp--;

					}
					break;
				case 2 :
					// T.g:15:19: print
					{
					pushFollow(FOLLOW_print_in_statement92);
					print();
					state._fsp--;

					}
					break;
				case 3 :
					// T.g:16:19: unpacking
					{
					pushFollow(FOLLOW_unpacking_in_statement112);
					unpacking();
					state._fsp--;

					}
					break;
				case 4 :
					// T.g:17:19: indexing
					{
					pushFollow(FOLLOW_indexing_in_statement132);
					indexing();
					state._fsp--;

					}
					break;
				case 5 :
					// T.g:18:19: slicing
					{
					pushFollow(FOLLOW_slicing_in_statement152);
					slicing();
					state._fsp--;

					}
					break;
				case 6 :
					// T.g:19:19: addInt1
					{
					pushFollow(FOLLOW_addInt1_in_statement174);
					addInt1();
					state._fsp--;

					}
					break;
				case 7 :
					// T.g:20:19: addStr1
					{
					pushFollow(FOLLOW_addStr1_in_statement195);
					addStr1();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"


	public static class tuple_return extends ParserRuleReturnScope {
		public String s;
	};


	// $ANTLR start "tuple"
	// T.g:25:1: tuple returns [String s] : '(' value tail ')' ;
	public final TParser.tuple_return tuple() throws RecognitionException {
		TParser.tuple_return retval = new TParser.tuple_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope value1 =null;
		ParserRuleReturnScope tail2 =null;

		try {
			// T.g:25:26: ( '(' value tail ')' )
			// T.g:25:28: '(' value tail ')'
			{
			match(input,9,FOLLOW_9_in_tuple250); 
			pushFollow(FOLLOW_value_in_tuple252);
			value1=value();
			state._fsp--;

			pushFollow(FOLLOW_tail_in_tuple254);
			tail2=tail();
			state._fsp--;

			match(input,10,FOLLOW_10_in_tuple256); 
			retval.s = (value1!=null?input.toString(value1.start,value1.stop):null) + (tail2!=null?input.toString(tail2.start,tail2.stop):null);
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tuple"


	public static class tail_return extends ParserRuleReturnScope {
		public String s;
	};


	// $ANTLR start "tail"
	// T.g:28:1: tail returns [String s] : ( ',' value tail |);
	public final TParser.tail_return tail() throws RecognitionException {
		TParser.tail_return retval = new TParser.tail_return();
		retval.start = input.LT(1);

		try {
			// T.g:28:25: ( ',' value tail |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==12) ) {
				alt3=1;
			}
			else if ( (LA3_0==10) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// T.g:28:27: ',' value tail
					{
					match(input,12,FOLLOW_12_in_tail311); 
					pushFollow(FOLLOW_value_in_tail313);
					value();
					state._fsp--;

					pushFollow(FOLLOW_tail_in_tail315);
					tail();
					state._fsp--;

					}
					break;
				case 2 :
					// T.g:28:44: 
					{
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tail"


	public static class value_return extends ParserRuleReturnScope {
		public String s;
	};


	// $ANTLR start "value"
	// T.g:30:1: value returns [String s] : ( Integer | String | tuple | ID );
	public final TParser.value_return value() throws RecognitionException {
		TParser.value_return retval = new TParser.value_return();
		retval.start = input.LT(1);

		Token Integer3=null;
		Token String4=null;
		Token ID6=null;
		ParserRuleReturnScope tuple5 =null;

		try {
			// T.g:30:26: ( Integer | String | tuple | ID )
			int alt4=4;
			switch ( input.LA(1) ) {
			case Integer:
				{
				alt4=1;
				}
				break;
			case String:
				{
				alt4=2;
				}
				break;
			case 9:
				{
				alt4=3;
				}
				break;
			case ID:
				{
				alt4=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// T.g:30:33: Integer
					{
					Integer3=(Token)match(input,Integer,FOLLOW_Integer_in_value335); 
					retval.s = (Integer3!=null?Integer3.getText():null);
					}
					break;
				case 2 :
					// T.g:31:35: String
					{
					String4=(Token)match(input,String,FOLLOW_String_in_value380); 
					retval.s = (String4!=null?String4.getText():null);
					}
					break;
				case 3 :
					// T.g:32:35: tuple
					{
					pushFollow(FOLLOW_tuple_in_value425);
					tuple5=tuple();
					state._fsp--;

					retval.s = (tuple5!=null?input.toString(tuple5.start,tuple5.stop):null);
					}
					break;
				case 4 :
					// T.g:33:35: ID
					{
					ID6=(Token)match(input,ID,FOLLOW_ID_in_value471); 
					retval.s = (ID6!=null?ID6.getText():null);
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value"



	// $ANTLR start "assignment"
	// T.g:40:1: assignment returns [String s] : (i1= ID '=' Integer |i2= ID '=' String |i3= ID '=' tuple |i4= ID '=' i5= ID );
	public final String assignment() throws RecognitionException {
		String s = null;


		Token i1=null;
		Token i2=null;
		Token i3=null;
		Token i4=null;
		Token i5=null;
		Token Integer7=null;
		Token String8=null;
		ParserRuleReturnScope tuple9 =null;

		try {
			// T.g:40:31: (i1= ID '=' Integer |i2= ID '=' String |i3= ID '=' tuple |i4= ID '=' i5= ID )
			int alt5=4;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ID) ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1==14) ) {
					switch ( input.LA(3) ) {
					case Integer:
						{
						alt5=1;
						}
						break;
					case String:
						{
						alt5=2;
						}
						break;
					case ID:
						{
						alt5=4;
						}
						break;
					case 9:
						{
						alt5=3;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// T.g:40:35: i1= ID '=' Integer
					{
					i1=(Token)match(input,ID,FOLLOW_ID_in_assignment569); 
					match(input,14,FOLLOW_14_in_assignment571); 
					Integer7=(Token)match(input,Integer,FOLLOW_Integer_in_assignment573); 
					h.initMapInt((i1!=null?i1.getText():null), (Integer7!=null?Integer7.getText():null));
					}
					break;
				case 2 :
					// T.g:41:35: i2= ID '=' String
					{
					i2=(Token)match(input,ID,FOLLOW_ID_in_assignment613); 
					match(input,14,FOLLOW_14_in_assignment615); 
					String8=(Token)match(input,String,FOLLOW_String_in_assignment617); 
					h.initMapStr((i2!=null?i2.getText():null), (String8!=null?String8.getText():null));
					}
					break;
				case 3 :
					// T.g:42:35: i3= ID '=' tuple
					{
					i3=(Token)match(input,ID,FOLLOW_ID_in_assignment658); 
					match(input,14,FOLLOW_14_in_assignment660); 
					pushFollow(FOLLOW_tuple_in_assignment662);
					tuple9=tuple();
					state._fsp--;

					h.initMapTup((i3!=null?i3.getText():null), (tuple9!=null?input.toString(tuple9.start,tuple9.stop):null));
					}
					break;
				case 4 :
					// T.g:43:35: i4= ID '=' i5= ID
					{
					i4=(Token)match(input,ID,FOLLOW_ID_in_assignment703); 
					match(input,14,FOLLOW_14_in_assignment705); 
					i5=(Token)match(input,ID,FOLLOW_ID_in_assignment709); 
					h.initMapID((i4!=null?i4.getText():null), (i5!=null?i5.getText():null));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "assignment"



	// $ANTLR start "print"
	// T.g:46:1: print returns [String s] : ( 'print(' ID ')' | 'print(' String ')' | 'print(' Integer ')' | 'print(' tuple ')' | 'print(' id2= ID '[' Integer ']' ')' );
	public final String print() throws RecognitionException {
		String s = null;


		Token id2=null;
		Token ID10=null;
		Token String11=null;
		Token Integer12=null;
		Token Integer14=null;
		ParserRuleReturnScope tuple13 =null;

		try {
			// T.g:46:26: ( 'print(' ID ')' | 'print(' String ')' | 'print(' Integer ')' | 'print(' tuple ')' | 'print(' id2= ID '[' Integer ']' ')' )
			int alt6=5;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==17) ) {
				switch ( input.LA(2) ) {
				case ID:
					{
					int LA6_2 = input.LA(3);
					if ( (LA6_2==10) ) {
						alt6=1;
					}
					else if ( (LA6_2==15) ) {
						alt6=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case String:
					{
					alt6=2;
					}
					break;
				case Integer:
					{
					alt6=3;
					}
					break;
				case 9:
					{
					alt6=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// T.g:46:28: 'print(' ID ')'
					{
					match(input,17,FOLLOW_17_in_print756); 
					ID10=(Token)match(input,ID,FOLLOW_ID_in_print758); 
					match(input,10,FOLLOW_10_in_print760); 
					h.printID((ID10!=null?ID10.getText():null));
					}
					break;
				case 2 :
					// T.g:47:29: 'print(' String ')'
					{
					match(input,17,FOLLOW_17_in_print792); 
					String11=(Token)match(input,String,FOLLOW_String_in_print794); 
					match(input,10,FOLLOW_10_in_print796); 
					h.printString((String11!=null?String11.getText():null));
					}
					break;
				case 3 :
					// T.g:48:29: 'print(' Integer ')'
					{
					match(input,17,FOLLOW_17_in_print828); 
					Integer12=(Token)match(input,Integer,FOLLOW_Integer_in_print830); 
					match(input,10,FOLLOW_10_in_print832); 
					System.out.println((Integer12!=null?Integer12.getText():null));
					}
					break;
				case 4 :
					// T.g:49:29: 'print(' tuple ')'
					{
					match(input,17,FOLLOW_17_in_print864); 
					pushFollow(FOLLOW_tuple_in_print866);
					tuple13=tuple();
					state._fsp--;

					match(input,10,FOLLOW_10_in_print868); 
					System.out.println((tuple13!=null?input.toString(tuple13.start,tuple13.stop):null));
					}
					break;
				case 5 :
					// T.g:50:29: 'print(' id2= ID '[' Integer ']' ')'
					{
					match(input,17,FOLLOW_17_in_print900); 
					id2=(Token)match(input,ID,FOLLOW_ID_in_print903); 
					match(input,15,FOLLOW_15_in_print905); 
					Integer14=(Token)match(input,Integer,FOLLOW_Integer_in_print907); 
					match(input,16,FOLLOW_16_in_print909); 
					match(input,10,FOLLOW_10_in_print911); 
					h.printGet((id2!=null?id2.getText():null),(Integer14!=null?Integer14.getText():null));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "print"



	// $ANTLR start "addInt1"
	// T.g:53:1: addInt1 : ID '=' i1= Integer '+' addInt2 ;
	public final void addInt1() throws RecognitionException {
		Token i1=null;
		Token ID15=null;
		String addInt216 =null;

		try {
			// T.g:53:9: ( ID '=' i1= Integer '+' addInt2 )
			// T.g:53:11: ID '=' i1= Integer '+' addInt2
			{
			ID15=(Token)match(input,ID,FOLLOW_ID_in_addInt1959); 
			match(input,14,FOLLOW_14_in_addInt1961); 
			i1=(Token)match(input,Integer,FOLLOW_Integer_in_addInt1965); 
			match(input,11,FOLLOW_11_in_addInt1967); 
			pushFollow(FOLLOW_addInt2_in_addInt1969);
			addInt216=addInt2();
			state._fsp--;

			h.addInteger((ID15!=null?ID15.getText():null), (i1!=null?i1.getText():null), addInt216); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "addInt1"



	// $ANTLR start "addInt2"
	// T.g:54:1: addInt2 returns [String i] : (i2= Integer |i2= Integer '+' ) ;
	public final String addInt2() throws RecognitionException {
		String i = null;


		Token i2=null;

		try {
			// T.g:54:29: ( (i2= Integer |i2= Integer '+' ) )
			// T.g:54:31: (i2= Integer |i2= Integer '+' )
			{
			// T.g:54:31: (i2= Integer |i2= Integer '+' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==Integer) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==11) ) {
					alt7=2;
				}
				else if ( (LA7_1==EOF||LA7_1==ID||LA7_1==9||LA7_1==17) ) {
					alt7=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// T.g:54:32: i2= Integer
					{
					i2=(Token)match(input,Integer,FOLLOW_Integer_in_addInt2989); 
					}
					break;
				case 2 :
					// T.g:54:45: i2= Integer '+'
					{
					i2=(Token)match(input,Integer,FOLLOW_Integer_in_addInt2995); 
					match(input,11,FOLLOW_11_in_addInt2997); 
					}
					break;

			}

			i =(i2!=null?i2.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return i;
	}
	// $ANTLR end "addInt2"



	// $ANTLR start "addStr1"
	// T.g:56:1: addStr1 : ID '=' i1= String '+' i2= addStr2 ;
	public final void addStr1() throws RecognitionException {
		Token i1=null;
		Token ID17=null;
		String i2 =null;

		try {
			// T.g:56:9: ( ID '=' i1= String '+' i2= addStr2 )
			// T.g:56:11: ID '=' i1= String '+' i2= addStr2
			{
			ID17=(Token)match(input,ID,FOLLOW_ID_in_addStr11008); 
			match(input,14,FOLLOW_14_in_addStr11010); 
			i1=(Token)match(input,String,FOLLOW_String_in_addStr11014); 
			match(input,11,FOLLOW_11_in_addStr11016); 
			pushFollow(FOLLOW_addStr2_in_addStr11020);
			i2=addStr2();
			state._fsp--;

			h.addString((ID17!=null?ID17.getText():null), (i1!=null?i1.getText():null), i2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "addStr1"



	// $ANTLR start "addStr2"
	// T.g:57:1: addStr2 returns [String i] : (i2= String |i2= String '+' ) ;
	public final String addStr2() throws RecognitionException {
		String i = null;


		Token i2=null;

		try {
			// T.g:57:29: ( (i2= String |i2= String '+' ) )
			// T.g:57:30: (i2= String |i2= String '+' )
			{
			// T.g:57:30: (i2= String |i2= String '+' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==String) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==11) ) {
					alt8=2;
				}
				else if ( (LA8_1==EOF||LA8_1==ID||LA8_1==9||LA8_1==17) ) {
					alt8=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// T.g:57:32: i2= String
					{
					i2=(Token)match(input,String,FOLLOW_String_in_addStr21038); 
					}
					break;
				case 2 :
					// T.g:57:44: i2= String '+'
					{
					i2=(Token)match(input,String,FOLLOW_String_in_addStr21044); 
					match(input,11,FOLLOW_11_in_addStr21046); 
					}
					break;

			}

			i =(i2!=null?i2.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return i;
	}
	// $ANTLR end "addStr2"



	// $ANTLR start "unpacking"
	// T.g:71:1: unpacking returns [String s] : '(' unpacking2 '=' ID ;
	public final String unpacking() throws RecognitionException {
		String s = null;


		try {
			// T.g:71:31: ( '(' unpacking2 '=' ID )
			// T.g:71:33: '(' unpacking2 '=' ID
			{
			match(input,9,FOLLOW_9_in_unpacking1077); 
			pushFollow(FOLLOW_unpacking2_in_unpacking1079);
			unpacking2();
			state._fsp--;

			match(input,14,FOLLOW_14_in_unpacking1081); 
			match(input,ID,FOLLOW_ID_in_unpacking1083); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "unpacking"



	// $ANTLR start "unpacking2"
	// T.g:72:1: unpacking2 returns [String s] : ( ( ID ',' unpacking2 ) | ( ID ')' | ')' ) );
	public final String unpacking2() throws RecognitionException {
		String s = null;


		try {
			// T.g:72:31: ( ( ID ',' unpacking2 ) | ( ID ')' | ')' ) )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ID) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==12) ) {
					alt10=1;
				}
				else if ( (LA10_1==10) ) {
					alt10=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA10_0==10) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// T.g:72:33: ( ID ',' unpacking2 )
					{
					// T.g:72:33: ( ID ',' unpacking2 )
					// T.g:72:34: ID ',' unpacking2
					{
					match(input,ID,FOLLOW_ID_in_unpacking21096); 
					match(input,12,FOLLOW_12_in_unpacking21098); 
					pushFollow(FOLLOW_unpacking2_in_unpacking21100);
					unpacking2();
					state._fsp--;

					}

					}
					break;
				case 2 :
					// T.g:72:55: ( ID ')' | ')' )
					{
					// T.g:72:55: ( ID ')' | ')' )
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==ID) ) {
						alt9=1;
					}
					else if ( (LA9_0==10) ) {
						alt9=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}

					switch (alt9) {
						case 1 :
							// T.g:72:56: ID ')'
							{
							match(input,ID,FOLLOW_ID_in_unpacking21106); 
							match(input,10,FOLLOW_10_in_unpacking21108); 
							}
							break;
						case 2 :
							// T.g:72:64: ')'
							{
							match(input,10,FOLLOW_10_in_unpacking21111); 
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "unpacking2"



	// $ANTLR start "slicing"
	// T.g:74:1: slicing returns [String s] : (id1= ID '=' id2= ID '[' i1= Integer ':' i2= Integer ']' |id1= ID '=' id2= ID '[' Integer ':' ']' |id1= ID '=' id2= ID '[' ':' Integer ']' );
	public final String slicing() throws RecognitionException {
		String s = null;


		Token id1=null;
		Token id2=null;
		Token i1=null;
		Token i2=null;
		Token Integer18=null;
		Token Integer19=null;

		try {
			// T.g:74:28: (id1= ID '=' id2= ID '[' i1= Integer ':' i2= Integer ']' |id1= ID '=' id2= ID '[' Integer ':' ']' |id1= ID '=' id2= ID '[' ':' Integer ']' )
			int alt11=3;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ID) ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1==14) ) {
					int LA11_2 = input.LA(3);
					if ( (LA11_2==ID) ) {
						int LA11_3 = input.LA(4);
						if ( (LA11_3==15) ) {
							int LA11_4 = input.LA(5);
							if ( (LA11_4==Integer) ) {
								int LA11_5 = input.LA(6);
								if ( (LA11_5==13) ) {
									int LA11_7 = input.LA(7);
									if ( (LA11_7==Integer) ) {
										alt11=1;
									}
									else if ( (LA11_7==16) ) {
										alt11=2;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 11, 7, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 11, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA11_4==13) ) {
								alt11=3;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 11, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// T.g:74:36: id1= ID '=' id2= ID '[' i1= Integer ':' i2= Integer ']'
					{
					id1=(Token)match(input,ID,FOLLOW_ID_in_slicing1132); 
					match(input,14,FOLLOW_14_in_slicing1134); 
					id2=(Token)match(input,ID,FOLLOW_ID_in_slicing1138); 
					match(input,15,FOLLOW_15_in_slicing1140); 
					i1=(Token)match(input,Integer,FOLLOW_Integer_in_slicing1144); 
					match(input,13,FOLLOW_13_in_slicing1146); 
					i2=(Token)match(input,Integer,FOLLOW_Integer_in_slicing1150); 
					match(input,16,FOLLOW_16_in_slicing1152); 
					h.slice1((id1!=null?id1.getText():null), (id2!=null?id2.getText():null), (i1!=null?i1.getText():null), (i2!=null?i2.getText():null));
					}
					break;
				case 2 :
					// T.g:75:36: id1= ID '=' id2= ID '[' Integer ':' ']'
					{
					id1=(Token)match(input,ID,FOLLOW_ID_in_slicing1196); 
					match(input,14,FOLLOW_14_in_slicing1198); 
					id2=(Token)match(input,ID,FOLLOW_ID_in_slicing1202); 
					match(input,15,FOLLOW_15_in_slicing1204); 
					Integer18=(Token)match(input,Integer,FOLLOW_Integer_in_slicing1206); 
					match(input,13,FOLLOW_13_in_slicing1208); 
					match(input,16,FOLLOW_16_in_slicing1210); 
					h.slice2((id1!=null?id1.getText():null),(id2!=null?id2.getText():null),(Integer18!=null?Integer18.getText():null));
					}
					break;
				case 3 :
					// T.g:76:36: id1= ID '=' id2= ID '[' ':' Integer ']'
					{
					id1=(Token)match(input,ID,FOLLOW_ID_in_slicing1293); 
					match(input,14,FOLLOW_14_in_slicing1295); 
					id2=(Token)match(input,ID,FOLLOW_ID_in_slicing1299); 
					match(input,15,FOLLOW_15_in_slicing1301); 
					match(input,13,FOLLOW_13_in_slicing1303); 
					Integer19=(Token)match(input,Integer,FOLLOW_Integer_in_slicing1305); 
					match(input,16,FOLLOW_16_in_slicing1307); 
					h.slice3((id1!=null?id1.getText():null),(id2!=null?id2.getText():null),(Integer19!=null?Integer19.getText():null));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "slicing"



	// $ANTLR start "indexing"
	// T.g:78:1: indexing returns [String s] : (id1= ID '=' id2= ID '[' Integer ']' |id1= ID '[' id2= Integer ']' '=' id3= Integer |id1= ID '[' id2= Integer ']' '=' id3= String |id1= ID '[' id2= Integer ']' '=' id5= tuple );
	public final String indexing() throws RecognitionException {
		String s = null;


		Token id1=null;
		Token id2=null;
		Token id3=null;
		Token Integer20=null;
		ParserRuleReturnScope id5 =null;

		try {
			// T.g:78:29: (id1= ID '=' id2= ID '[' Integer ']' |id1= ID '[' id2= Integer ']' '=' id3= Integer |id1= ID '[' id2= Integer ']' '=' id3= String |id1= ID '[' id2= Integer ']' '=' id5= tuple )
			int alt12=4;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ID) ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1==14) ) {
					alt12=1;
				}
				else if ( (LA12_1==15) ) {
					int LA12_3 = input.LA(3);
					if ( (LA12_3==Integer) ) {
						int LA12_4 = input.LA(4);
						if ( (LA12_4==16) ) {
							int LA12_5 = input.LA(5);
							if ( (LA12_5==14) ) {
								switch ( input.LA(6) ) {
								case Integer:
									{
									alt12=2;
									}
									break;
								case String:
									{
									alt12=3;
									}
									break;
								case 9:
									{
									alt12=4;
									}
									break;
								default:
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 12, 6, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 12, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 12, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// T.g:78:36: id1= ID '=' id2= ID '[' Integer ']'
					{
					id1=(Token)match(input,ID,FOLLOW_ID_in_indexing1402); 
					match(input,14,FOLLOW_14_in_indexing1404); 
					id2=(Token)match(input,ID,FOLLOW_ID_in_indexing1408); 
					match(input,15,FOLLOW_15_in_indexing1410); 
					Integer20=(Token)match(input,Integer,FOLLOW_Integer_in_indexing1412); 
					match(input,16,FOLLOW_16_in_indexing1414); 
					h.indexAssign((id1!=null?id1.getText():null),(id2!=null?id2.getText():null),(Integer20!=null?Integer20.getText():null));
					}
					break;
				case 2 :
					// T.g:79:36: id1= ID '[' id2= Integer ']' '=' id3= Integer
					{
					id1=(Token)match(input,ID,FOLLOW_ID_in_indexing1456); 
					match(input,15,FOLLOW_15_in_indexing1458); 
					id2=(Token)match(input,Integer,FOLLOW_Integer_in_indexing1462); 
					match(input,16,FOLLOW_16_in_indexing1464); 
					match(input,14,FOLLOW_14_in_indexing1466); 
					id3=(Token)match(input,Integer,FOLLOW_Integer_in_indexing1470); 
					h.replaceIntStr((id1!=null?id1.getText():null),(id2!=null?id2.getText():null),(id3!=null?id3.getText():null));
					}
					break;
				case 3 :
					// T.g:80:36: id1= ID '[' id2= Integer ']' '=' id3= String
					{
					id1=(Token)match(input,ID,FOLLOW_ID_in_indexing1511); 
					match(input,15,FOLLOW_15_in_indexing1513); 
					id2=(Token)match(input,Integer,FOLLOW_Integer_in_indexing1517); 
					match(input,16,FOLLOW_16_in_indexing1519); 
					match(input,14,FOLLOW_14_in_indexing1521); 
					id3=(Token)match(input,String,FOLLOW_String_in_indexing1525); 
					h.replaceIntStr((id1!=null?id1.getText():null),(id2!=null?id2.getText():null),(id3!=null?id3.getText():null));
					}
					break;
				case 4 :
					// T.g:81:36: id1= ID '[' id2= Integer ']' '=' id5= tuple
					{
					id1=(Token)match(input,ID,FOLLOW_ID_in_indexing1566); 
					match(input,15,FOLLOW_15_in_indexing1568); 
					id2=(Token)match(input,Integer,FOLLOW_Integer_in_indexing1572); 
					match(input,16,FOLLOW_16_in_indexing1574); 
					match(input,14,FOLLOW_14_in_indexing1576); 
					pushFollow(FOLLOW_tuple_in_indexing1580);
					id5=tuple();
					state._fsp--;

					h.replaceTup((id1!=null?id1.getText():null),(id2!=null?id2.getText():null),(id5!=null?input.toString(id5.start,id5.stop):null));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "indexing"

	// Delegated rules



	public static final BitSet FOLLOW_statement_in_prog55 = new BitSet(new long[]{0x0000000000020222L});
	public static final BitSet FOLLOW_assignment_in_statement72 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_statement92 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unpacking_in_statement112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_indexing_in_statement132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_slicing_in_statement152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addInt1_in_statement174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addStr1_in_statement195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_tuple250 = new BitSet(new long[]{0x00000000000002E0L});
	public static final BitSet FOLLOW_value_in_tuple252 = new BitSet(new long[]{0x0000000000001400L});
	public static final BitSet FOLLOW_tail_in_tuple254 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_tuple256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_tail311 = new BitSet(new long[]{0x00000000000002E0L});
	public static final BitSet FOLLOW_value_in_tail313 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_tail_in_tail315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_in_value335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_value380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tuple_in_value425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_value471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment569 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_assignment571 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Integer_in_assignment573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment613 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_assignment615 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_String_in_assignment617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment658 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_assignment660 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_tuple_in_assignment662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment703 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_assignment705 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_assignment709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_print756 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_print758 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_print760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_print792 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_String_in_print794 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_print796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_print828 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Integer_in_print830 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_print832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_print864 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_tuple_in_print866 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_print868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_print900 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_print903 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_print905 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Integer_in_print907 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_print909 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_print911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_addInt1959 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_addInt1961 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Integer_in_addInt1965 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_addInt1967 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_addInt2_in_addInt1969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_in_addInt2989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_in_addInt2995 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_addInt2997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_addStr11008 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_addStr11010 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_String_in_addStr11014 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_addStr11016 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_addStr2_in_addStr11020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_addStr21038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_addStr21044 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_addStr21046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_unpacking1077 = new BitSet(new long[]{0x0000000000000420L});
	public static final BitSet FOLLOW_unpacking2_in_unpacking1079 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_unpacking1081 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_unpacking1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_unpacking21096 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_unpacking21098 = new BitSet(new long[]{0x0000000000000420L});
	public static final BitSet FOLLOW_unpacking2_in_unpacking21100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_unpacking21106 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_unpacking21108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_unpacking21111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_slicing1132 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_slicing1134 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_slicing1138 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_slicing1140 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Integer_in_slicing1144 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_slicing1146 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Integer_in_slicing1150 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_slicing1152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_slicing1196 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_slicing1198 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_slicing1202 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_slicing1204 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Integer_in_slicing1206 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_slicing1208 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_slicing1210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_slicing1293 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_slicing1295 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_slicing1299 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_slicing1301 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_slicing1303 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Integer_in_slicing1305 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_slicing1307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_indexing1402 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_indexing1404 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_indexing1408 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_indexing1410 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Integer_in_indexing1412 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_indexing1414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_indexing1456 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_indexing1458 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Integer_in_indexing1462 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_indexing1464 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_indexing1466 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Integer_in_indexing1470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_indexing1511 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_indexing1513 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Integer_in_indexing1517 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_indexing1519 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_indexing1521 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_String_in_indexing1525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_indexing1566 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_indexing1568 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_Integer_in_indexing1572 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_indexing1574 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_indexing1576 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_tuple_in_indexing1580 = new BitSet(new long[]{0x0000000000000002L});
}
