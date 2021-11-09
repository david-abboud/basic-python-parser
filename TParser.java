// $ANTLR 3.5.2 T.g 2021-04-10 18:45:42

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class TParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Comments", "Digit", "ID", "Integer", 
		"String", "WS", "'('", "')'", "'+'", "','", "':'", "'='", "'['", "']'", 
		"'print'", "'tuturkeykey'"
	};
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int Comments=4;
	public static final int Digit=5;
	public static final int ID=6;
	public static final int Integer=7;
	public static final int String=8;
	public static final int WS=9;

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
				if ( (LA1_0==ID||LA1_0==10||(LA1_0 >= 18 && LA1_0 <= 19)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// T.g:12:29: statement
					{
					pushFollow(FOLLOW_statement_in_prog65);
					statement();
					state._fsp--;
					if (state.failed) return s;
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return s;}
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
	// T.g:14:1: statement : ( assignment | print | unpacking | indexing | slicing | addInt1 | addStr1 | tupAssg | addID1 | printHashmap );
	public final void statement() throws RecognitionException {
		try {
			// T.g:14:11: ( assignment | print | unpacking | indexing | slicing | addInt1 | addStr1 | tupAssg | addID1 | printHashmap )
			int alt2=10;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA2_1 = input.LA(2);
				if ( (LA2_1==15) ) {
					switch ( input.LA(3) ) {
					case Integer:
						{
						int LA2_6 = input.LA(4);
						if ( (LA2_6==EOF||LA2_6==ID||LA2_6==10||(LA2_6 >= 18 && LA2_6 <= 19)) ) {
							alt2=1;
						}
						else if ( (LA2_6==12) ) {
							alt2=6;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
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
						if ( (LA2_7==EOF||LA2_7==ID||LA2_7==10||(LA2_7 >= 18 && LA2_7 <= 19)) ) {
							alt2=1;
						}
						else if ( (LA2_7==12) ) {
							alt2=7;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
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
						switch ( input.LA(4) ) {
						case 16:
							{
							int LA2_13 = input.LA(5);
							if ( (LA2_13==Integer) ) {
								int LA2_15 = input.LA(6);
								if ( (LA2_15==17) ) {
									alt2=4;
								}
								else if ( (LA2_15==14) ) {
									alt2=5;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 2, 15, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA2_13==14) ) {
								alt2=5;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
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
							break;
						case EOF:
						case ID:
						case 10:
						case 18:
						case 19:
							{
							alt2=1;
							}
							break;
						case 12:
							{
							alt2=9;
							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return;}
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
					case 10:
						{
						alt2=8;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
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
			case 18:
				{
				alt2=2;
				}
				break;
			case 10:
				{
				alt2=3;
				}
				break;
			case 19:
				{
				alt2=10;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// T.g:14:19: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement82);
					assignment();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// T.g:15:19: print
					{
					pushFollow(FOLLOW_print_in_statement102);
					print();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// T.g:16:19: unpacking
					{
					pushFollow(FOLLOW_unpacking_in_statement122);
					unpacking();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// T.g:17:19: indexing
					{
					pushFollow(FOLLOW_indexing_in_statement142);
					indexing();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// T.g:18:19: slicing
					{
					pushFollow(FOLLOW_slicing_in_statement162);
					slicing();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// T.g:19:19: addInt1
					{
					pushFollow(FOLLOW_addInt1_in_statement184);
					addInt1();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// T.g:20:19: addStr1
					{
					pushFollow(FOLLOW_addStr1_in_statement205);
					addStr1();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// T.g:21:19: tupAssg
					{
					pushFollow(FOLLOW_tupAssg_in_statement225);
					tupAssg();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					// T.g:22:19: addID1
					{
					pushFollow(FOLLOW_addID1_in_statement245);
					addID1();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					// T.g:23:19: printHashmap
					{
					pushFollow(FOLLOW_printHashmap_in_statement265);
					printHashmap();
					state._fsp--;
					if (state.failed) return;
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
	// T.g:27:1: tuple returns [String s] : '(' value tail ')' ;
	public final TParser.tuple_return tuple() throws RecognitionException {
		TParser.tuple_return retval = new TParser.tuple_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope value1 =null;
		ParserRuleReturnScope tail2 =null;

		try {
			// T.g:27:26: ( '(' value tail ')' )
			// T.g:27:28: '(' value tail ')'
			{
			match(input,10,FOLLOW_10_in_tuple303); if (state.failed) return retval;
			pushFollow(FOLLOW_value_in_tuple305);
			value1=value();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_tail_in_tuple307);
			tail2=tail();
			state._fsp--;
			if (state.failed) return retval;
			match(input,11,FOLLOW_11_in_tuple309); if (state.failed) return retval;
			if ( state.backtracking==0 ) {retval.s = (value1!=null?input.toString(value1.start,value1.stop):null) + (tail2!=null?input.toString(tail2.start,tail2.stop):null);}
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
	// T.g:30:1: tail returns [String s] : ( ',' value tail |);
	public final TParser.tail_return tail() throws RecognitionException {
		TParser.tail_return retval = new TParser.tail_return();
		retval.start = input.LT(1);

		try {
			// T.g:30:25: ( ',' value tail |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==13) ) {
				alt3=1;
			}
			else if ( (LA3_0==EOF||LA3_0==11) ) {
				alt3=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// T.g:30:27: ',' value tail
					{
					match(input,13,FOLLOW_13_in_tail364); if (state.failed) return retval;
					pushFollow(FOLLOW_value_in_tail366);
					value();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_tail_in_tail368);
					tail();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// T.g:30:44: 
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



	// $ANTLR start "tupAssg"
	// T.g:32:1: tupAssg : ID '=' tuple i1= addTup ;
	public final void tupAssg() throws RecognitionException {
		Token ID3=null;
		String i1 =null;
		ParserRuleReturnScope tuple4 =null;

		try {
			// T.g:32:9: ( ID '=' tuple i1= addTup )
			// T.g:32:11: ID '=' tuple i1= addTup
			{
			ID3=(Token)match(input,ID,FOLLOW_ID_in_tupAssg389); if (state.failed) return;
			match(input,15,FOLLOW_15_in_tupAssg391); if (state.failed) return;
			pushFollow(FOLLOW_tuple_in_tupAssg393);
			tuple4=tuple();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_addTup_in_tupAssg397);
			i1=addTup();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {h.initMapTup((ID3!=null?ID3.getText():null),h.addTuple((tuple4!=null?input.toString(tuple4.start,tuple4.stop):null),i1));}
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
	// $ANTLR end "tupAssg"



	// $ANTLR start "addTup"
	// T.g:34:1: addTup returns [String s] : ( ( '+' tuple i2= addTup ) |);
	public final String addTup() throws RecognitionException {
		String s = null;


		String i2 =null;
		ParserRuleReturnScope tuple5 =null;

		try {
			// T.g:34:27: ( ( '+' tuple i2= addTup ) |)
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==12) ) {
				alt4=1;
			}
			else if ( (LA4_0==EOF||LA4_0==ID||LA4_0==10||(LA4_0 >= 18 && LA4_0 <= 19)) ) {
				alt4=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return s;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// T.g:34:29: ( '+' tuple i2= addTup )
					{
					// T.g:34:29: ( '+' tuple i2= addTup )
					// T.g:34:30: '+' tuple i2= addTup
					{
					match(input,12,FOLLOW_12_in_addTup412); if (state.failed) return s;
					pushFollow(FOLLOW_tuple_in_addTup414);
					tuple5=tuple();
					state._fsp--;
					if (state.failed) return s;
					pushFollow(FOLLOW_addTup_in_addTup418);
					i2=addTup();
					state._fsp--;
					if (state.failed) return s;
					}

					if ( state.backtracking==0 ) {s = s + h.addTuple((tuple5!=null?input.toString(tuple5.start,tuple5.stop):null),i2);}
					}
					break;
				case 2 :
					// T.g:34:96: 
					{
					if ( state.backtracking==0 ) {s ="";}
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
	// $ANTLR end "addTup"


	public static class value_return extends ParserRuleReturnScope {
		public String s;
	};


	// $ANTLR start "value"
	// T.g:36:1: value returns [String s] : ( Integer | String | tuple | ID |);
	public final TParser.value_return value() throws RecognitionException {
		TParser.value_return retval = new TParser.value_return();
		retval.start = input.LT(1);

		Token Integer6=null;
		Token String7=null;
		Token ID9=null;
		ParserRuleReturnScope tuple8 =null;

		try {
			// T.g:36:26: ( Integer | String | tuple | ID |)
			int alt5=5;
			switch ( input.LA(1) ) {
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
			case 10:
				{
				alt5=3;
				}
				break;
			case ID:
				{
				alt5=4;
				}
				break;
			case EOF:
			case 11:
			case 13:
				{
				alt5=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// T.g:36:33: Integer
					{
					Integer6=(Token)match(input,Integer,FOLLOW_Integer_in_value442); if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.s = (Integer6!=null?Integer6.getText():null);}
					}
					break;
				case 2 :
					// T.g:37:35: String
					{
					String7=(Token)match(input,String,FOLLOW_String_in_value487); if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.s = (String7!=null?String7.getText():null);}
					}
					break;
				case 3 :
					// T.g:38:35: tuple
					{
					pushFollow(FOLLOW_tuple_in_value532);
					tuple8=tuple();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.s = (tuple8!=null?input.toString(tuple8.start,tuple8.stop):null);}
					}
					break;
				case 4 :
					// T.g:39:35: ID
					{
					ID9=(Token)match(input,ID,FOLLOW_ID_in_value578); if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.s = (ID9!=null?ID9.getText():null);}
					}
					break;
				case 5 :
					// T.g:41:33: 
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
	// $ANTLR end "value"


	public static class idTuple_return extends ParserRuleReturnScope {
		public String s;
	};


	// $ANTLR start "idTuple"
	// T.g:43:1: idTuple returns [String s] : '(' ID idTail ')' ;
	public final TParser.idTuple_return idTuple() throws RecognitionException {
		TParser.idTuple_return retval = new TParser.idTuple_return();
		retval.start = input.LT(1);

		Token ID10=null;
		ParserRuleReturnScope idTail11 =null;

		try {
			// T.g:43:28: ( '(' ID idTail ')' )
			// T.g:43:30: '(' ID idTail ')'
			{
			match(input,10,FOLLOW_10_in_idTuple670); if (state.failed) return retval;
			ID10=(Token)match(input,ID,FOLLOW_ID_in_idTuple672); if (state.failed) return retval;
			pushFollow(FOLLOW_idTail_in_idTuple674);
			idTail11=idTail();
			state._fsp--;
			if (state.failed) return retval;
			match(input,11,FOLLOW_11_in_idTuple676); if (state.failed) return retval;
			if ( state.backtracking==0 ) {retval.s = (ID10!=null?ID10.getText():null) + (idTail11!=null?input.toString(idTail11.start,idTail11.stop):null);}
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
	// $ANTLR end "idTuple"


	public static class idTail_return extends ParserRuleReturnScope {
		public String s;
	};


	// $ANTLR start "idTail"
	// T.g:46:1: idTail returns [String s] : ( ',' ID idTail |);
	public final TParser.idTail_return idTail() throws RecognitionException {
		TParser.idTail_return retval = new TParser.idTail_return();
		retval.start = input.LT(1);

		try {
			// T.g:46:27: ( ',' ID idTail |)
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==13) ) {
				alt6=1;
			}
			else if ( (LA6_0==EOF||LA6_0==11) ) {
				alt6=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// T.g:46:29: ',' ID idTail
					{
					match(input,13,FOLLOW_13_in_idTail731); if (state.failed) return retval;
					match(input,ID,FOLLOW_ID_in_idTail733); if (state.failed) return retval;
					pushFollow(FOLLOW_idTail_in_idTail735);
					idTail();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// T.g:46:45: 
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
	// $ANTLR end "idTail"



	// $ANTLR start "assignment"
	// T.g:48:1: assignment returns [String s] : (i1= ID '=' Integer |i2= ID '=' String |i4= ID '=' i5= ID );
	public final String assignment() throws RecognitionException {
		String s = null;


		Token i1=null;
		Token i2=null;
		Token i4=null;
		Token i5=null;
		Token Integer12=null;
		Token String13=null;

		try {
			// T.g:48:31: (i1= ID '=' Integer |i2= ID '=' String |i4= ID '=' i5= ID )
			int alt7=3;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ID) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==15) ) {
					switch ( input.LA(3) ) {
					case Integer:
						{
						alt7=1;
						}
						break;
					case String:
						{
						alt7=2;
						}
						break;
					case ID:
						{
						alt7=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return s;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					if (state.backtracking>0) {state.failed=true; return s;}
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
				if (state.backtracking>0) {state.failed=true; return s;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// T.g:48:35: i1= ID '=' Integer
					{
					i1=(Token)match(input,ID,FOLLOW_ID_in_assignment755); if (state.failed) return s;
					match(input,15,FOLLOW_15_in_assignment757); if (state.failed) return s;
					Integer12=(Token)match(input,Integer,FOLLOW_Integer_in_assignment759); if (state.failed) return s;
					if ( state.backtracking==0 ) {h.initMapInt((i1!=null?i1.getText():null), (Integer12!=null?Integer12.getText():null));}
					}
					break;
				case 2 :
					// T.g:49:35: i2= ID '=' String
					{
					i2=(Token)match(input,ID,FOLLOW_ID_in_assignment799); if (state.failed) return s;
					match(input,15,FOLLOW_15_in_assignment801); if (state.failed) return s;
					String13=(Token)match(input,String,FOLLOW_String_in_assignment803); if (state.failed) return s;
					if ( state.backtracking==0 ) {h.initMapStr((i2!=null?i2.getText():null), (String13!=null?String13.getText():null));}
					}
					break;
				case 3 :
					// T.g:50:35: i4= ID '=' i5= ID
					{
					i4=(Token)match(input,ID,FOLLOW_ID_in_assignment844); if (state.failed) return s;
					match(input,15,FOLLOW_15_in_assignment846); if (state.failed) return s;
					i5=(Token)match(input,ID,FOLLOW_ID_in_assignment850); if (state.failed) return s;
					if ( state.backtracking==0 ) {h.initMapID((i4!=null?i4.getText():null), (i5!=null?i5.getText():null));}
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
	// T.g:53:1: print returns [String s] : ( 'print' '(' ID ')' | 'print' '(' String ')' | 'print' '(' Integer ')' | 'print' '(' tuple ')' | 'print' '(' id2= ID '[' Integer ']' ')' | 'print' '(' ')' | 'print' '(' WS ')' | 'print' '(' (id3= tuple )+ addTup | 'print' '(' i1= ID '+' i2= addIDPrint ')' | 'print' '(' i1= Integer '+' addIntPrint ')' | 'print' '(' i1= String '+' addStrPrint ')' );
	public final String print() throws RecognitionException {
		String s = null;


		Token id2=null;
		Token i1=null;
		Token ID14=null;
		Token String15=null;
		Token Integer16=null;
		Token Integer18=null;
		ParserRuleReturnScope id3 =null;
		String i2 =null;
		ParserRuleReturnScope tuple17 =null;
		String addTup19 =null;
		String addIntPrint20 =null;
		String addStrPrint21 =null;

		try {
			// T.g:53:26: ( 'print' '(' ID ')' | 'print' '(' String ')' | 'print' '(' Integer ')' | 'print' '(' tuple ')' | 'print' '(' id2= ID '[' Integer ']' ')' | 'print' '(' ')' | 'print' '(' WS ')' | 'print' '(' (id3= tuple )+ addTup | 'print' '(' i1= ID '+' i2= addIDPrint ')' | 'print' '(' i1= Integer '+' addIntPrint ')' | 'print' '(' i1= String '+' addStrPrint ')' )
			int alt9=11;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==18) ) {
				int LA9_1 = input.LA(2);
				if ( (synpred20_T()) ) {
					alt9=1;
				}
				else if ( (synpred21_T()) ) {
					alt9=2;
				}
				else if ( (synpred22_T()) ) {
					alt9=3;
				}
				else if ( (synpred23_T()) ) {
					alt9=4;
				}
				else if ( (synpred24_T()) ) {
					alt9=5;
				}
				else if ( (synpred25_T()) ) {
					alt9=6;
				}
				else if ( (synpred26_T()) ) {
					alt9=7;
				}
				else if ( (synpred28_T()) ) {
					alt9=8;
				}
				else if ( (synpred29_T()) ) {
					alt9=9;
				}
				else if ( (synpred30_T()) ) {
					alt9=10;
				}
				else if ( (true) ) {
					alt9=11;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return s;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// T.g:53:28: 'print' '(' ID ')'
					{
					match(input,18,FOLLOW_18_in_print897); if (state.failed) return s;
					match(input,10,FOLLOW_10_in_print899); if (state.failed) return s;
					ID14=(Token)match(input,ID,FOLLOW_ID_in_print901); if (state.failed) return s;
					match(input,11,FOLLOW_11_in_print903); if (state.failed) return s;
					if ( state.backtracking==0 ) {h.printID((ID14!=null?ID14.getText():null));}
					}
					break;
				case 2 :
					// T.g:54:27: 'print' '(' String ')'
					{
					match(input,18,FOLLOW_18_in_print933); if (state.failed) return s;
					match(input,10,FOLLOW_10_in_print935); if (state.failed) return s;
					String15=(Token)match(input,String,FOLLOW_String_in_print937); if (state.failed) return s;
					match(input,11,FOLLOW_11_in_print939); if (state.failed) return s;
					if ( state.backtracking==0 ) {h.printString((String15!=null?String15.getText():null));}
					}
					break;
				case 3 :
					// T.g:55:27: 'print' '(' Integer ')'
					{
					match(input,18,FOLLOW_18_in_print969); if (state.failed) return s;
					match(input,10,FOLLOW_10_in_print971); if (state.failed) return s;
					Integer16=(Token)match(input,Integer,FOLLOW_Integer_in_print973); if (state.failed) return s;
					match(input,11,FOLLOW_11_in_print975); if (state.failed) return s;
					if ( state.backtracking==0 ) {System.out.println((Integer16!=null?Integer16.getText():null));}
					}
					break;
				case 4 :
					// T.g:56:27: 'print' '(' tuple ')'
					{
					match(input,18,FOLLOW_18_in_print1005); if (state.failed) return s;
					match(input,10,FOLLOW_10_in_print1007); if (state.failed) return s;
					pushFollow(FOLLOW_tuple_in_print1009);
					tuple17=tuple();
					state._fsp--;
					if (state.failed) return s;
					match(input,11,FOLLOW_11_in_print1011); if (state.failed) return s;
					if ( state.backtracking==0 ) {System.out.println('[' + (tuple17!=null?input.toString(tuple17.start,tuple17.stop):null).substring(1, (tuple17!=null?input.toString(tuple17.start,tuple17.stop):null).length()-1) + ']');}
					}
					break;
				case 5 :
					// T.g:57:27: 'print' '(' id2= ID '[' Integer ']' ')'
					{
					match(input,18,FOLLOW_18_in_print1041); if (state.failed) return s;
					match(input,10,FOLLOW_10_in_print1043); if (state.failed) return s;
					id2=(Token)match(input,ID,FOLLOW_ID_in_print1046); if (state.failed) return s;
					match(input,16,FOLLOW_16_in_print1048); if (state.failed) return s;
					Integer18=(Token)match(input,Integer,FOLLOW_Integer_in_print1050); if (state.failed) return s;
					match(input,17,FOLLOW_17_in_print1052); if (state.failed) return s;
					match(input,11,FOLLOW_11_in_print1054); if (state.failed) return s;
					if ( state.backtracking==0 ) {h.printGet((id2!=null?id2.getText():null),(Integer18!=null?Integer18.getText():null));}
					}
					break;
				case 6 :
					// T.g:58:27: 'print' '(' ')'
					{
					match(input,18,FOLLOW_18_in_print1084); if (state.failed) return s;
					match(input,10,FOLLOW_10_in_print1086); if (state.failed) return s;
					match(input,11,FOLLOW_11_in_print1087); if (state.failed) return s;
					if ( state.backtracking==0 ) {System.out.print("");}
					}
					break;
				case 7 :
					// T.g:59:27: 'print' '(' WS ')'
					{
					match(input,18,FOLLOW_18_in_print1117); if (state.failed) return s;
					match(input,10,FOLLOW_10_in_print1119); if (state.failed) return s;
					match(input,WS,FOLLOW_WS_in_print1121); if (state.failed) return s;
					match(input,11,FOLLOW_11_in_print1123); if (state.failed) return s;
					if ( state.backtracking==0 ) {System.out.print("");}
					}
					break;
				case 8 :
					// T.g:60:27: 'print' '(' (id3= tuple )+ addTup
					{
					match(input,18,FOLLOW_18_in_print1152); if (state.failed) return s;
					match(input,10,FOLLOW_10_in_print1154); if (state.failed) return s;
					// T.g:60:42: (id3= tuple )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==10) ) {
							int LA8_5 = input.LA(2);
							if ( (synpred27_T()) ) {
								alt8=1;
							}

						}

						switch (alt8) {
						case 1 :
							// T.g:60:42: id3= tuple
							{
							pushFollow(FOLLOW_tuple_in_print1158);
							id3=tuple();
							state._fsp--;
							if (state.failed) return s;
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							if (state.backtracking>0) {state.failed=true; return s;}
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					pushFollow(FOLLOW_addTup_in_print1162);
					addTup19=addTup();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) {System.out.println(h.addTuple((id3!=null?input.toString(id3.start,id3.stop):null), addTup19));}
					}
					break;
				case 9 :
					// T.g:61:27: 'print' '(' i1= ID '+' i2= addIDPrint ')'
					{
					match(input,18,FOLLOW_18_in_print1192); if (state.failed) return s;
					match(input,10,FOLLOW_10_in_print1194); if (state.failed) return s;
					i1=(Token)match(input,ID,FOLLOW_ID_in_print1198); if (state.failed) return s;
					match(input,12,FOLLOW_12_in_print1200); if (state.failed) return s;
					pushFollow(FOLLOW_addIDPrint_in_print1204);
					i2=addIDPrint();
					state._fsp--;
					if (state.failed) return s;
					match(input,11,FOLLOW_11_in_print1206); if (state.failed) return s;
					if ( state.backtracking==0 ) {System.out.println(h.addIDPrint((i1!=null?i1.getText():null),i2).toString());}
					}
					break;
				case 10 :
					// T.g:62:27: 'print' '(' i1= Integer '+' addIntPrint ')'
					{
					match(input,18,FOLLOW_18_in_print1236); if (state.failed) return s;
					match(input,10,FOLLOW_10_in_print1238); if (state.failed) return s;
					i1=(Token)match(input,Integer,FOLLOW_Integer_in_print1242); if (state.failed) return s;
					match(input,12,FOLLOW_12_in_print1244); if (state.failed) return s;
					pushFollow(FOLLOW_addIntPrint_in_print1246);
					addIntPrint20=addIntPrint();
					state._fsp--;
					if (state.failed) return s;
					match(input,11,FOLLOW_11_in_print1248); if (state.failed) return s;
					if ( state.backtracking==0 ) {System.out.println(h.addIntegerPrint((i1!=null?i1.getText():null),addIntPrint20).toString());}
					}
					break;
				case 11 :
					// T.g:63:27: 'print' '(' i1= String '+' addStrPrint ')'
					{
					match(input,18,FOLLOW_18_in_print1278); if (state.failed) return s;
					match(input,10,FOLLOW_10_in_print1280); if (state.failed) return s;
					i1=(Token)match(input,String,FOLLOW_String_in_print1284); if (state.failed) return s;
					match(input,12,FOLLOW_12_in_print1286); if (state.failed) return s;
					pushFollow(FOLLOW_addStrPrint_in_print1288);
					addStrPrint21=addStrPrint();
					state._fsp--;
					if (state.failed) return s;
					match(input,11,FOLLOW_11_in_print1290); if (state.failed) return s;
					if ( state.backtracking==0 ) {System.out.println(h.addStringPrint((i1!=null?i1.getText():null),addStrPrint21).toString());}
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
	// T.g:67:1: addInt1 : ID '=' i1= Integer addInt2[$ID.text] ;
	public final void addInt1() throws RecognitionException {
		Token i1=null;
		Token ID22=null;

		try {
			// T.g:67:9: ( ID '=' i1= Integer addInt2[$ID.text] )
			// T.g:67:11: ID '=' i1= Integer addInt2[$ID.text]
			{
			ID22=(Token)match(input,ID,FOLLOW_ID_in_addInt11362); if (state.failed) return;
			match(input,15,FOLLOW_15_in_addInt11364); if (state.failed) return;
			i1=(Token)match(input,Integer,FOLLOW_Integer_in_addInt11368); if (state.failed) return;
			if ( state.backtracking==0 ) {h.initMapInt((ID22!=null?ID22.getText():null), (i1!=null?i1.getText():null));}
			pushFollow(FOLLOW_addInt2_in_addInt11372);
			addInt2((ID22!=null?ID22.getText():null));
			state._fsp--;
			if (state.failed) return;
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
	// T.g:68:1: addInt2[String I3] : ( ( ( '+' i2= Integer ) addInt2[I3] ) | ( '+' i2= Integer ) );
	public final void addInt2(String I3) throws RecognitionException {
		Token i2=null;

		try {
			// T.g:68:22: ( ( ( '+' i2= Integer ) addInt2[I3] ) | ( '+' i2= Integer ) )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==12) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==Integer) ) {
					int LA10_2 = input.LA(3);
					if ( (LA10_2==12) ) {
						alt10=1;
					}
					else if ( (LA10_2==EOF||LA10_2==ID||LA10_2==10||(LA10_2 >= 18 && LA10_2 <= 19)) ) {
						alt10=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
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

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// T.g:68:24: ( ( '+' i2= Integer ) addInt2[I3] )
					{
					// T.g:68:24: ( ( '+' i2= Integer ) addInt2[I3] )
					// T.g:68:26: ( '+' i2= Integer ) addInt2[I3]
					{
					// T.g:68:26: ( '+' i2= Integer )
					// T.g:68:27: '+' i2= Integer
					{
					match(input,12,FOLLOW_12_in_addInt21388); if (state.failed) return;
					i2=(Token)match(input,Integer,FOLLOW_Integer_in_addInt21392); if (state.failed) return;
					if ( state.backtracking==0 ) {h.addInteger(I3, (i2!=null?i2.getText():null));}
					}

					pushFollow(FOLLOW_addInt2_in_addInt21397);
					addInt2(I3);
					state._fsp--;
					if (state.failed) return;
					}

					}
					break;
				case 2 :
					// T.g:68:90: ( '+' i2= Integer )
					{
					// T.g:68:90: ( '+' i2= Integer )
					// T.g:68:91: '+' i2= Integer
					{
					match(input,12,FOLLOW_12_in_addInt21405); if (state.failed) return;
					i2=(Token)match(input,Integer,FOLLOW_Integer_in_addInt21409); if (state.failed) return;
					if ( state.backtracking==0 ) {h.addInteger(I3, (i2!=null?i2.getText():null));}
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
	}
	// $ANTLR end "addInt2"



	// $ANTLR start "addStr1"
	// T.g:70:1: addStr1 : ID '=' i1= String addStr2[$ID.text] ;
	public final void addStr1() throws RecognitionException {
		Token i1=null;
		Token ID23=null;

		try {
			// T.g:70:9: ( ID '=' i1= String addStr2[$ID.text] )
			// T.g:70:11: ID '=' i1= String addStr2[$ID.text]
			{
			ID23=(Token)match(input,ID,FOLLOW_ID_in_addStr11420); if (state.failed) return;
			match(input,15,FOLLOW_15_in_addStr11422); if (state.failed) return;
			i1=(Token)match(input,String,FOLLOW_String_in_addStr11426); if (state.failed) return;
			if ( state.backtracking==0 ) {h.initMapStr((ID23!=null?ID23.getText():null), (i1!=null?i1.getText():null));}
			pushFollow(FOLLOW_addStr2_in_addStr11430);
			addStr2((ID23!=null?ID23.getText():null));
			state._fsp--;
			if (state.failed) return;
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
	// T.g:71:1: addStr2[String I3] returns [String i] : ( ( ( '+' i2= String ) addStr2[I3] ) | ( '+' i2= String ) );
	public final String addStr2(String I3) throws RecognitionException {
		String i = null;


		Token i2=null;

		try {
			// T.g:71:40: ( ( ( '+' i2= String ) addStr2[I3] ) | ( '+' i2= String ) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==12) ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1==String) ) {
					int LA11_2 = input.LA(3);
					if ( (LA11_2==12) ) {
						alt11=1;
					}
					else if ( (LA11_2==EOF||LA11_2==ID||LA11_2==10||(LA11_2 >= 18 && LA11_2 <= 19)) ) {
						alt11=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return i;}
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
					if (state.backtracking>0) {state.failed=true; return i;}
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
				if (state.backtracking>0) {state.failed=true; return i;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// T.g:71:42: ( ( '+' i2= String ) addStr2[I3] )
					{
					// T.g:71:42: ( ( '+' i2= String ) addStr2[I3] )
					// T.g:71:44: ( '+' i2= String ) addStr2[I3]
					{
					// T.g:71:44: ( '+' i2= String )
					// T.g:71:45: '+' i2= String
					{
					match(input,12,FOLLOW_12_in_addStr21449); if (state.failed) return i;
					i2=(Token)match(input,String,FOLLOW_String_in_addStr21453); if (state.failed) return i;
					if ( state.backtracking==0 ) {h.addString(I3, (i2!=null?i2.getText():null));}
					}

					pushFollow(FOLLOW_addStr2_in_addStr21458);
					addStr2(I3);
					state._fsp--;
					if (state.failed) return i;
					}

					}
					break;
				case 2 :
					// T.g:71:106: ( '+' i2= String )
					{
					// T.g:71:106: ( '+' i2= String )
					// T.g:71:107: '+' i2= String
					{
					match(input,12,FOLLOW_12_in_addStr21466); if (state.failed) return i;
					i2=(Token)match(input,String,FOLLOW_String_in_addStr21470); if (state.failed) return i;
					if ( state.backtracking==0 ) {h.addString(I3, (i2!=null?i2.getText():null));}
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
		return i;
	}
	// $ANTLR end "addStr2"



	// $ANTLR start "addID1"
	// T.g:73:1: addID1 : i2= ID '=' i1= ID addID2[$i2.text] ;
	public final void addID1() throws RecognitionException {
		Token i2=null;
		Token i1=null;

		try {
			// T.g:73:8: (i2= ID '=' i1= ID addID2[$i2.text] )
			// T.g:73:10: i2= ID '=' i1= ID addID2[$i2.text]
			{
			i2=(Token)match(input,ID,FOLLOW_ID_in_addID11483); if (state.failed) return;
			match(input,15,FOLLOW_15_in_addID11485); if (state.failed) return;
			i1=(Token)match(input,ID,FOLLOW_ID_in_addID11489); if (state.failed) return;
			if ( state.backtracking==0 ) {h.initMapID((i2!=null?i2.getText():null), (i1!=null?i1.getText():null));}
			pushFollow(FOLLOW_addID2_in_addID11493);
			addID2((i2!=null?i2.getText():null));
			state._fsp--;
			if (state.failed) return;
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
	// $ANTLR end "addID1"



	// $ANTLR start "addID2"
	// T.g:74:1: addID2[String I3] returns [String i] : ( ( ( '+' i3= ID ) addID2[I3] ) | ( '+' i3= ID ) );
	public final String addID2(String I3) throws RecognitionException {
		String i = null;


		Token i3=null;

		try {
			// T.g:74:39: ( ( ( '+' i3= ID ) addID2[I3] ) | ( '+' i3= ID ) )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==12) ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1==ID) ) {
					int LA12_2 = input.LA(3);
					if ( (LA12_2==12) ) {
						alt12=1;
					}
					else if ( (LA12_2==EOF||LA12_2==ID||LA12_2==10||(LA12_2 >= 18 && LA12_2 <= 19)) ) {
						alt12=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return i;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return i;}
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
				if (state.backtracking>0) {state.failed=true; return i;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// T.g:74:41: ( ( '+' i3= ID ) addID2[I3] )
					{
					// T.g:74:41: ( ( '+' i3= ID ) addID2[I3] )
					// T.g:74:43: ( '+' i3= ID ) addID2[I3]
					{
					// T.g:74:43: ( '+' i3= ID )
					// T.g:74:44: '+' i3= ID
					{
					match(input,12,FOLLOW_12_in_addID21512); if (state.failed) return i;
					i3=(Token)match(input,ID,FOLLOW_ID_in_addID21516); if (state.failed) return i;
					if ( state.backtracking==0 ) {h.addID(I3, (i3!=null?i3.getText():null));}
					}

					pushFollow(FOLLOW_addID2_in_addID21521);
					addID2(I3);
					state._fsp--;
					if (state.failed) return i;
					}

					}
					break;
				case 2 :
					// T.g:74:96: ( '+' i3= ID )
					{
					// T.g:74:96: ( '+' i3= ID )
					// T.g:74:97: '+' i3= ID
					{
					match(input,12,FOLLOW_12_in_addID21529); if (state.failed) return i;
					i3=(Token)match(input,ID,FOLLOW_ID_in_addID21533); if (state.failed) return i;
					if ( state.backtracking==0 ) {h.addID(I3, (i3!=null?i3.getText():null));}
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
		return i;
	}
	// $ANTLR end "addID2"



	// $ANTLR start "addIDPrint"
	// T.g:76:1: addIDPrint returns [String i] : (i2= ID |i2= ID '+' ) ;
	public final String addIDPrint() throws RecognitionException {
		String i = null;


		Token i2=null;

		try {
			// T.g:76:32: ( (i2= ID |i2= ID '+' ) )
			// T.g:76:33: (i2= ID |i2= ID '+' )
			{
			// T.g:76:33: (i2= ID |i2= ID '+' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==ID) ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1==12) ) {
					alt13=2;
				}
				else if ( (LA13_1==11) ) {
					alt13=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return i;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return i;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// T.g:76:35: i2= ID
					{
					i2=(Token)match(input,ID,FOLLOW_ID_in_addIDPrint1552); if (state.failed) return i;
					}
					break;
				case 2 :
					// T.g:76:43: i2= ID '+'
					{
					i2=(Token)match(input,ID,FOLLOW_ID_in_addIDPrint1558); if (state.failed) return i;
					match(input,12,FOLLOW_12_in_addIDPrint1560); if (state.failed) return i;
					}
					break;

			}

			if ( state.backtracking==0 ) {i =(i2!=null?i2.getText():null);}
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
	// $ANTLR end "addIDPrint"



	// $ANTLR start "addStrPrint"
	// T.g:78:1: addStrPrint returns [String i] : (i2= String |i2= String '+' ) ;
	public final String addStrPrint() throws RecognitionException {
		String i = null;


		Token i2=null;

		try {
			// T.g:78:33: ( (i2= String |i2= String '+' ) )
			// T.g:78:34: (i2= String |i2= String '+' )
			{
			// T.g:78:34: (i2= String |i2= String '+' )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==String) ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1==12) ) {
					alt14=2;
				}
				else if ( (LA14_1==11) ) {
					alt14=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return i;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return i;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// T.g:78:36: i2= String
					{
					i2=(Token)match(input,String,FOLLOW_String_in_addStrPrint1582); if (state.failed) return i;
					}
					break;
				case 2 :
					// T.g:78:48: i2= String '+'
					{
					i2=(Token)match(input,String,FOLLOW_String_in_addStrPrint1588); if (state.failed) return i;
					match(input,12,FOLLOW_12_in_addStrPrint1590); if (state.failed) return i;
					}
					break;

			}

			if ( state.backtracking==0 ) {i =(i2!=null?i2.getText():null);}
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
	// $ANTLR end "addStrPrint"



	// $ANTLR start "addIntPrint"
	// T.g:80:1: addIntPrint returns [String i] : (i2= Integer |i2= Integer '+' ) ;
	public final String addIntPrint() throws RecognitionException {
		String i = null;


		Token i2=null;

		try {
			// T.g:80:33: ( (i2= Integer |i2= Integer '+' ) )
			// T.g:80:34: (i2= Integer |i2= Integer '+' )
			{
			// T.g:80:34: (i2= Integer |i2= Integer '+' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Integer) ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1==12) ) {
					alt15=2;
				}
				else if ( (LA15_1==11) ) {
					alt15=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return i;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return i;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// T.g:80:36: i2= Integer
					{
					i2=(Token)match(input,Integer,FOLLOW_Integer_in_addIntPrint1612); if (state.failed) return i;
					}
					break;
				case 2 :
					// T.g:80:49: i2= Integer '+'
					{
					i2=(Token)match(input,Integer,FOLLOW_Integer_in_addIntPrint1618); if (state.failed) return i;
					match(input,12,FOLLOW_12_in_addIntPrint1620); if (state.failed) return i;
					}
					break;

			}

			if ( state.backtracking==0 ) {i =(i2!=null?i2.getText():null);}
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
	// $ANTLR end "addIntPrint"



	// $ANTLR start "unpacking"
	// T.g:82:1: unpacking returns [String s] : ( idTuple '=' ID | idTuple '=' tuple );
	public final String unpacking() throws RecognitionException {
		String s = null;


		Token ID25=null;
		ParserRuleReturnScope idTuple24 =null;
		ParserRuleReturnScope idTuple26 =null;
		ParserRuleReturnScope tuple27 =null;

		try {
			// T.g:82:31: ( idTuple '=' ID | idTuple '=' tuple )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==10) ) {
				int LA16_1 = input.LA(2);
				if ( (synpred37_T()) ) {
					alt16=1;
				}
				else if ( (true) ) {
					alt16=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return s;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// T.g:82:33: idTuple '=' ID
					{
					pushFollow(FOLLOW_idTuple_in_unpacking1639);
					idTuple24=idTuple();
					state._fsp--;
					if (state.failed) return s;
					match(input,15,FOLLOW_15_in_unpacking1641); if (state.failed) return s;
					ID25=(Token)match(input,ID,FOLLOW_ID_in_unpacking1643); if (state.failed) return s;
					if ( state.backtracking==0 ) {h.unpack((idTuple24!=null?input.toString(idTuple24.start,idTuple24.stop):null),(ID25!=null?ID25.getText():null));}
					}
					break;
				case 2 :
					// T.g:83:33: idTuple '=' tuple
					{
					pushFollow(FOLLOW_idTuple_in_unpacking1679);
					idTuple26=idTuple();
					state._fsp--;
					if (state.failed) return s;
					match(input,15,FOLLOW_15_in_unpacking1681); if (state.failed) return s;
					pushFollow(FOLLOW_tuple_in_unpacking1683);
					tuple27=tuple();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) {h.unpack2((idTuple26!=null?input.toString(idTuple26.start,idTuple26.stop):null),(tuple27!=null?input.toString(tuple27.start,tuple27.stop):null));}
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
	// $ANTLR end "unpacking"



	// $ANTLR start "slicing"
	// T.g:85:1: slicing returns [String s] : (id1= ID '=' id2= ID '[' i1= Integer ':' i2= Integer ']' |id1= ID '=' id2= ID '[' Integer ':' ']' |id1= ID '=' id2= ID '[' ':' Integer ']' );
	public final String slicing() throws RecognitionException {
		String s = null;


		Token id1=null;
		Token id2=null;
		Token i1=null;
		Token i2=null;
		Token Integer28=null;
		Token Integer29=null;

		try {
			// T.g:85:28: (id1= ID '=' id2= ID '[' i1= Integer ':' i2= Integer ']' |id1= ID '=' id2= ID '[' Integer ':' ']' |id1= ID '=' id2= ID '[' ':' Integer ']' )
			int alt17=3;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==ID) ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1==15) ) {
					int LA17_2 = input.LA(3);
					if ( (LA17_2==ID) ) {
						int LA17_3 = input.LA(4);
						if ( (LA17_3==16) ) {
							int LA17_4 = input.LA(5);
							if ( (LA17_4==Integer) ) {
								int LA17_5 = input.LA(6);
								if ( (LA17_5==14) ) {
									int LA17_7 = input.LA(7);
									if ( (LA17_7==Integer) ) {
										alt17=1;
									}
									else if ( (LA17_7==17) ) {
										alt17=2;
									}

									else {
										if (state.backtracking>0) {state.failed=true; return s;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 17, 7, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return s;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 17, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA17_4==14) ) {
								alt17=3;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return s;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 17, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return s;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 17, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return s;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 17, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return s;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return s;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// T.g:85:36: id1= ID '=' id2= ID '[' i1= Integer ':' i2= Integer ']'
					{
					id1=(Token)match(input,ID,FOLLOW_ID_in_slicing1706); if (state.failed) return s;
					match(input,15,FOLLOW_15_in_slicing1708); if (state.failed) return s;
					id2=(Token)match(input,ID,FOLLOW_ID_in_slicing1712); if (state.failed) return s;
					match(input,16,FOLLOW_16_in_slicing1714); if (state.failed) return s;
					i1=(Token)match(input,Integer,FOLLOW_Integer_in_slicing1718); if (state.failed) return s;
					match(input,14,FOLLOW_14_in_slicing1720); if (state.failed) return s;
					i2=(Token)match(input,Integer,FOLLOW_Integer_in_slicing1724); if (state.failed) return s;
					match(input,17,FOLLOW_17_in_slicing1726); if (state.failed) return s;
					if ( state.backtracking==0 ) {h.slice1((id1!=null?id1.getText():null), (id2!=null?id2.getText():null), (i1!=null?i1.getText():null), (i2!=null?i2.getText():null));}
					}
					break;
				case 2 :
					// T.g:86:36: id1= ID '=' id2= ID '[' Integer ':' ']'
					{
					id1=(Token)match(input,ID,FOLLOW_ID_in_slicing1770); if (state.failed) return s;
					match(input,15,FOLLOW_15_in_slicing1772); if (state.failed) return s;
					id2=(Token)match(input,ID,FOLLOW_ID_in_slicing1776); if (state.failed) return s;
					match(input,16,FOLLOW_16_in_slicing1778); if (state.failed) return s;
					Integer28=(Token)match(input,Integer,FOLLOW_Integer_in_slicing1780); if (state.failed) return s;
					match(input,14,FOLLOW_14_in_slicing1782); if (state.failed) return s;
					match(input,17,FOLLOW_17_in_slicing1784); if (state.failed) return s;
					if ( state.backtracking==0 ) {h.slice2((id1!=null?id1.getText():null),(id2!=null?id2.getText():null),(Integer28!=null?Integer28.getText():null));}
					}
					break;
				case 3 :
					// T.g:87:36: id1= ID '=' id2= ID '[' ':' Integer ']'
					{
					id1=(Token)match(input,ID,FOLLOW_ID_in_slicing1867); if (state.failed) return s;
					match(input,15,FOLLOW_15_in_slicing1869); if (state.failed) return s;
					id2=(Token)match(input,ID,FOLLOW_ID_in_slicing1873); if (state.failed) return s;
					match(input,16,FOLLOW_16_in_slicing1875); if (state.failed) return s;
					match(input,14,FOLLOW_14_in_slicing1877); if (state.failed) return s;
					Integer29=(Token)match(input,Integer,FOLLOW_Integer_in_slicing1879); if (state.failed) return s;
					match(input,17,FOLLOW_17_in_slicing1881); if (state.failed) return s;
					if ( state.backtracking==0 ) {h.slice3((id1!=null?id1.getText():null),(id2!=null?id2.getText():null),(Integer29!=null?Integer29.getText():null));}
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
	// T.g:89:1: indexing returns [String s] : id1= ID '=' id2= ID '[' Integer ']' ;
	public final String indexing() throws RecognitionException {
		String s = null;


		Token id1=null;
		Token id2=null;
		Token Integer30=null;

		try {
			// T.g:89:29: (id1= ID '=' id2= ID '[' Integer ']' )
			// T.g:89:36: id1= ID '=' id2= ID '[' Integer ']'
			{
			id1=(Token)match(input,ID,FOLLOW_ID_in_indexing1976); if (state.failed) return s;
			match(input,15,FOLLOW_15_in_indexing1978); if (state.failed) return s;
			id2=(Token)match(input,ID,FOLLOW_ID_in_indexing1982); if (state.failed) return s;
			match(input,16,FOLLOW_16_in_indexing1984); if (state.failed) return s;
			Integer30=(Token)match(input,Integer,FOLLOW_Integer_in_indexing1986); if (state.failed) return s;
			match(input,17,FOLLOW_17_in_indexing1988); if (state.failed) return s;
			if ( state.backtracking==0 ) {h.indexAssign((id1!=null?id1.getText():null),(id2!=null?id2.getText():null),(Integer30!=null?Integer30.getText():null));}
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



	// $ANTLR start "printHashmap"
	// T.g:99:1: printHashmap : 'tuturkeykey' ;
	public final void printHashmap() throws RecognitionException {
		try {
			// T.g:99:14: ( 'tuturkeykey' )
			// T.g:99:16: 'tuturkeykey'
			{
			match(input,19,FOLLOW_19_in_printHashmap2166); if (state.failed) return;
			if ( state.backtracking==0 ) {h.printHashmap();}
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
	// $ANTLR end "printHashmap"

	// $ANTLR start synpred20_T
	public final void synpred20_T_fragment() throws RecognitionException {
		// T.g:53:28: ( 'print' '(' ID ')' )
		// T.g:53:28: 'print' '(' ID ')'
		{
		match(input,18,FOLLOW_18_in_synpred20_T897); if (state.failed) return;
		match(input,10,FOLLOW_10_in_synpred20_T899); if (state.failed) return;
		match(input,ID,FOLLOW_ID_in_synpred20_T901); if (state.failed) return;
		match(input,11,FOLLOW_11_in_synpred20_T903); if (state.failed) return;
		}

	}
	// $ANTLR end synpred20_T

	// $ANTLR start synpred21_T
	public final void synpred21_T_fragment() throws RecognitionException {
		// T.g:54:27: ( 'print' '(' String ')' )
		// T.g:54:27: 'print' '(' String ')'
		{
		match(input,18,FOLLOW_18_in_synpred21_T933); if (state.failed) return;
		match(input,10,FOLLOW_10_in_synpred21_T935); if (state.failed) return;
		match(input,String,FOLLOW_String_in_synpred21_T937); if (state.failed) return;
		match(input,11,FOLLOW_11_in_synpred21_T939); if (state.failed) return;
		}

	}
	// $ANTLR end synpred21_T

	// $ANTLR start synpred22_T
	public final void synpred22_T_fragment() throws RecognitionException {
		// T.g:55:27: ( 'print' '(' Integer ')' )
		// T.g:55:27: 'print' '(' Integer ')'
		{
		match(input,18,FOLLOW_18_in_synpred22_T969); if (state.failed) return;
		match(input,10,FOLLOW_10_in_synpred22_T971); if (state.failed) return;
		match(input,Integer,FOLLOW_Integer_in_synpred22_T973); if (state.failed) return;
		match(input,11,FOLLOW_11_in_synpred22_T975); if (state.failed) return;
		}

	}
	// $ANTLR end synpred22_T

	// $ANTLR start synpred23_T
	public final void synpred23_T_fragment() throws RecognitionException {
		// T.g:56:27: ( 'print' '(' tuple ')' )
		// T.g:56:27: 'print' '(' tuple ')'
		{
		match(input,18,FOLLOW_18_in_synpred23_T1005); if (state.failed) return;
		match(input,10,FOLLOW_10_in_synpred23_T1007); if (state.failed) return;
		pushFollow(FOLLOW_tuple_in_synpred23_T1009);
		tuple();
		state._fsp--;
		if (state.failed) return;
		match(input,11,FOLLOW_11_in_synpred23_T1011); if (state.failed) return;
		}

	}
	// $ANTLR end synpred23_T

	// $ANTLR start synpred24_T
	public final void synpred24_T_fragment() throws RecognitionException {
		Token id2=null;

		// T.g:57:27: ( 'print' '(' id2= ID '[' Integer ']' ')' )
		// T.g:57:27: 'print' '(' id2= ID '[' Integer ']' ')'
		{
		match(input,18,FOLLOW_18_in_synpred24_T1041); if (state.failed) return;
		match(input,10,FOLLOW_10_in_synpred24_T1043); if (state.failed) return;
		id2=(Token)match(input,ID,FOLLOW_ID_in_synpred24_T1046); if (state.failed) return;
		match(input,16,FOLLOW_16_in_synpred24_T1048); if (state.failed) return;
		match(input,Integer,FOLLOW_Integer_in_synpred24_T1050); if (state.failed) return;
		match(input,17,FOLLOW_17_in_synpred24_T1052); if (state.failed) return;
		match(input,11,FOLLOW_11_in_synpred24_T1054); if (state.failed) return;
		}

	}
	// $ANTLR end synpred24_T

	// $ANTLR start synpred25_T
	public final void synpred25_T_fragment() throws RecognitionException {
		// T.g:58:27: ( 'print' '(' ')' )
		// T.g:58:27: 'print' '(' ')'
		{
		match(input,18,FOLLOW_18_in_synpred25_T1084); if (state.failed) return;
		match(input,10,FOLLOW_10_in_synpred25_T1086); if (state.failed) return;
		match(input,11,FOLLOW_11_in_synpred25_T1087); if (state.failed) return;
		}

	}
	// $ANTLR end synpred25_T

	// $ANTLR start synpred26_T
	public final void synpred26_T_fragment() throws RecognitionException {
		// T.g:59:27: ( 'print' '(' WS ')' )
		// T.g:59:27: 'print' '(' WS ')'
		{
		match(input,18,FOLLOW_18_in_synpred26_T1117); if (state.failed) return;
		match(input,10,FOLLOW_10_in_synpred26_T1119); if (state.failed) return;
		match(input,WS,FOLLOW_WS_in_synpred26_T1121); if (state.failed) return;
		match(input,11,FOLLOW_11_in_synpred26_T1123); if (state.failed) return;
		}

	}
	// $ANTLR end synpred26_T

	// $ANTLR start synpred27_T
	public final void synpred27_T_fragment() throws RecognitionException {
		ParserRuleReturnScope id3 =null;

		// T.g:60:42: (id3= tuple )
		// T.g:60:42: id3= tuple
		{
		pushFollow(FOLLOW_tuple_in_synpred27_T1158);
		id3=tuple();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred27_T

	// $ANTLR start synpred28_T
	public final void synpred28_T_fragment() throws RecognitionException {
		ParserRuleReturnScope id3 =null;

		// T.g:60:27: ( 'print' '(' (id3= tuple )+ addTup )
		// T.g:60:27: 'print' '(' (id3= tuple )+ addTup
		{
		match(input,18,FOLLOW_18_in_synpred28_T1152); if (state.failed) return;
		match(input,10,FOLLOW_10_in_synpred28_T1154); if (state.failed) return;
		// T.g:60:42: (id3= tuple )+
		int cnt18=0;
		loop18:
		while (true) {
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==10) ) {
				alt18=1;
			}

			switch (alt18) {
			case 1 :
				// T.g:60:42: id3= tuple
				{
				pushFollow(FOLLOW_tuple_in_synpred28_T1158);
				id3=tuple();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				if ( cnt18 >= 1 ) break loop18;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(18, input);
				throw eee;
			}
			cnt18++;
		}

		pushFollow(FOLLOW_addTup_in_synpred28_T1162);
		addTup();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred28_T

	// $ANTLR start synpred29_T
	public final void synpred29_T_fragment() throws RecognitionException {
		Token i1=null;
		String i2 =null;

		// T.g:61:27: ( 'print' '(' i1= ID '+' i2= addIDPrint ')' )
		// T.g:61:27: 'print' '(' i1= ID '+' i2= addIDPrint ')'
		{
		match(input,18,FOLLOW_18_in_synpred29_T1192); if (state.failed) return;
		match(input,10,FOLLOW_10_in_synpred29_T1194); if (state.failed) return;
		i1=(Token)match(input,ID,FOLLOW_ID_in_synpred29_T1198); if (state.failed) return;
		match(input,12,FOLLOW_12_in_synpred29_T1200); if (state.failed) return;
		pushFollow(FOLLOW_addIDPrint_in_synpred29_T1204);
		i2=addIDPrint();
		state._fsp--;
		if (state.failed) return;
		match(input,11,FOLLOW_11_in_synpred29_T1206); if (state.failed) return;
		}

	}
	// $ANTLR end synpred29_T

	// $ANTLR start synpred30_T
	public final void synpred30_T_fragment() throws RecognitionException {
		Token i1=null;

		// T.g:62:27: ( 'print' '(' i1= Integer '+' addIntPrint ')' )
		// T.g:62:27: 'print' '(' i1= Integer '+' addIntPrint ')'
		{
		match(input,18,FOLLOW_18_in_synpred30_T1236); if (state.failed) return;
		match(input,10,FOLLOW_10_in_synpred30_T1238); if (state.failed) return;
		i1=(Token)match(input,Integer,FOLLOW_Integer_in_synpred30_T1242); if (state.failed) return;
		match(input,12,FOLLOW_12_in_synpred30_T1244); if (state.failed) return;
		pushFollow(FOLLOW_addIntPrint_in_synpred30_T1246);
		addIntPrint();
		state._fsp--;
		if (state.failed) return;
		match(input,11,FOLLOW_11_in_synpred30_T1248); if (state.failed) return;
		}

	}
	// $ANTLR end synpred30_T

	// $ANTLR start synpred37_T
	public final void synpred37_T_fragment() throws RecognitionException {
		// T.g:82:33: ( idTuple '=' ID )
		// T.g:82:33: idTuple '=' ID
		{
		pushFollow(FOLLOW_idTuple_in_synpred37_T1639);
		idTuple();
		state._fsp--;
		if (state.failed) return;
		match(input,15,FOLLOW_15_in_synpred37_T1641); if (state.failed) return;
		match(input,ID,FOLLOW_ID_in_synpred37_T1643); if (state.failed) return;
		}

	}
	// $ANTLR end synpred37_T

	// Delegated rules

	public final boolean synpred28_T() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred28_T_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred29_T() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred29_T_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred26_T() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred26_T_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred27_T() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred27_T_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred37_T() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred37_T_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred24_T() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred24_T_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred25_T() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred25_T_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred22_T() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred22_T_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred23_T() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred23_T_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred20_T() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred20_T_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred21_T() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred21_T_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred30_T() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred30_T_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_statement_in_prog65 = new BitSet(new long[]{0x00000000000C0442L});
	public static final BitSet FOLLOW_assignment_in_statement82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_statement102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unpacking_in_statement122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_indexing_in_statement142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_slicing_in_statement162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addInt1_in_statement184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addStr1_in_statement205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupAssg_in_statement225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addID1_in_statement245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printHashmap_in_statement265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_tuple303 = new BitSet(new long[]{0x0000000000002DC0L});
	public static final BitSet FOLLOW_value_in_tuple305 = new BitSet(new long[]{0x0000000000002800L});
	public static final BitSet FOLLOW_tail_in_tuple307 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_tuple309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_tail364 = new BitSet(new long[]{0x00000000000025C0L});
	public static final BitSet FOLLOW_value_in_tail366 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_tail_in_tail368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_tupAssg389 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_tupAssg391 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_tuple_in_tupAssg393 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_addTup_in_tupAssg397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_addTup412 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_tuple_in_addTup414 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_addTup_in_addTup418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_in_value442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_value487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tuple_in_value532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_value578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_idTuple670 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_idTuple672 = new BitSet(new long[]{0x0000000000002800L});
	public static final BitSet FOLLOW_idTail_in_idTuple674 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_idTuple676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_idTail731 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_idTail733 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_idTail_in_idTail735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment755 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_assignment757 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Integer_in_assignment759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment799 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_assignment801 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_String_in_assignment803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment844 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_assignment846 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_assignment850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_print897 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_print899 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_print901 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_print903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_print933 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_print935 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_String_in_print937 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_print939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_print969 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_print971 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Integer_in_print973 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_print975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_print1005 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_print1007 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_tuple_in_print1009 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_print1011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_print1041 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_print1043 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_print1046 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_print1048 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Integer_in_print1050 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_print1052 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_print1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_print1084 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_print1086 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_print1087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_print1117 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_print1119 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_WS_in_print1121 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_print1123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_print1152 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_print1154 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_tuple_in_print1158 = new BitSet(new long[]{0x0000000000001400L});
	public static final BitSet FOLLOW_addTup_in_print1162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_print1192 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_print1194 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_print1198 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_print1200 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_addIDPrint_in_print1204 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_print1206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_print1236 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_print1238 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Integer_in_print1242 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_print1244 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_addIntPrint_in_print1246 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_print1248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_print1278 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_print1280 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_String_in_print1284 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_print1286 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_addStrPrint_in_print1288 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_print1290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_addInt11362 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_addInt11364 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Integer_in_addInt11368 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_addInt2_in_addInt11372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_addInt21388 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Integer_in_addInt21392 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_addInt2_in_addInt21397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_addInt21405 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Integer_in_addInt21409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_addStr11420 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_addStr11422 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_String_in_addStr11426 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_addStr2_in_addStr11430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_addStr21449 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_String_in_addStr21453 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_addStr2_in_addStr21458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_addStr21466 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_String_in_addStr21470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_addID11483 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_addID11485 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_addID11489 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_addID2_in_addID11493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_addID21512 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_addID21516 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_addID2_in_addID21521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_addID21529 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_addID21533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_addIDPrint1552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_addIDPrint1558 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_addIDPrint1560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_addStrPrint1582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_addStrPrint1588 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_addStrPrint1590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_in_addIntPrint1612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_in_addIntPrint1618 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_addIntPrint1620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idTuple_in_unpacking1639 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_unpacking1641 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_unpacking1643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idTuple_in_unpacking1679 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_unpacking1681 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_tuple_in_unpacking1683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_slicing1706 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_slicing1708 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_slicing1712 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_slicing1714 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Integer_in_slicing1718 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_slicing1720 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Integer_in_slicing1724 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_slicing1726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_slicing1770 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_slicing1772 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_slicing1776 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_slicing1778 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Integer_in_slicing1780 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_slicing1782 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_slicing1784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_slicing1867 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_slicing1869 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_slicing1873 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_slicing1875 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_slicing1877 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Integer_in_slicing1879 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_slicing1881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_indexing1976 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_indexing1978 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_indexing1982 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_indexing1984 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Integer_in_indexing1986 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_indexing1988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_printHashmap2166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_synpred20_T897 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_synpred20_T899 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_synpred20_T901 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_synpred20_T903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_synpred21_T933 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_synpred21_T935 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_String_in_synpred21_T937 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_synpred21_T939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_synpred22_T969 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_synpred22_T971 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Integer_in_synpred22_T973 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_synpred22_T975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_synpred23_T1005 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_synpred23_T1007 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_tuple_in_synpred23_T1009 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_synpred23_T1011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_synpred24_T1041 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_synpred24_T1043 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_synpred24_T1046 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_synpred24_T1048 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Integer_in_synpred24_T1050 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_synpred24_T1052 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_synpred24_T1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_synpred25_T1084 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_synpred25_T1086 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_synpred25_T1087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_synpred26_T1117 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_synpred26_T1119 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_WS_in_synpred26_T1121 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_synpred26_T1123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tuple_in_synpred27_T1158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_synpred28_T1152 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_synpred28_T1154 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_tuple_in_synpred28_T1158 = new BitSet(new long[]{0x0000000000001400L});
	public static final BitSet FOLLOW_addTup_in_synpred28_T1162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_synpred29_T1192 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_synpred29_T1194 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_synpred29_T1198 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_synpred29_T1200 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_addIDPrint_in_synpred29_T1204 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_synpred29_T1206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_synpred30_T1236 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_synpred30_T1238 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Integer_in_synpred30_T1242 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_synpred30_T1244 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_addIntPrint_in_synpred30_T1246 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_synpred30_T1248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idTuple_in_synpred37_T1639 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_synpred37_T1641 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_synpred37_T1643 = new BitSet(new long[]{0x0000000000000002L});
}
