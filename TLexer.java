// $ANTLR 3.5.2 T.g 2021-04-10 18:45:42

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class TLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public TLexer() {} 
	public TLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public TLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "T.g"; }

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:7:7: ( '(' )
			// T.g:7:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:8:7: ( ')' )
			// T.g:8:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:9:7: ( '+' )
			// T.g:9:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:10:7: ( ',' )
			// T.g:10:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:11:7: ( ':' )
			// T.g:11:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:12:7: ( '=' )
			// T.g:12:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:13:7: ( '[' )
			// T.g:13:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:14:7: ( ']' )
			// T.g:14:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:15:7: ( 'print' )
			// T.g:15:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:16:7: ( 'tuturkeykey' )
			// T.g:16:9: 'tuturkeykey'
			{
			match("tuturkeykey"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "Digit"
	public final void mDigit() throws RecognitionException {
		try {
			// T.g:91:16: ( '0' .. '9' )
			// T.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Digit"

	// $ANTLR start "Integer"
	public final void mInteger() throws RecognitionException {
		try {
			int _type = Integer;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:92:9: ( ( '-' )? ( Digit )+ )
			// T.g:92:11: ( '-' )? ( Digit )+
			{
			// T.g:92:11: ( '-' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// T.g:92:11: '-'
					{
					match('-'); 
					}
					break;

			}

			// T.g:92:16: ( Digit )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// T.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Integer"

	// $ANTLR start "String"
	public final void mString() throws RecognitionException {
		try {
			int _type = String;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:93:8: ( '\"' ( Digit | ( 'a' .. 'z' | 'A' .. 'Z' | '-' ) | ' ' )* '\"' )
			// T.g:93:10: '\"' ( Digit | ( 'a' .. 'z' | 'A' .. 'Z' | '-' ) | ' ' )* '\"'
			{
			match('\"'); 
			// T.g:93:14: ( Digit | ( 'a' .. 'z' | 'A' .. 'Z' | '-' ) | ' ' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==' '||LA3_0=='-'||(LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// T.g:
					{
					if ( input.LA(1)==' '||input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "String"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:94:4: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( Digit | ( 'a' .. 'z' | 'A' .. 'Z' ) )* )
			// T.g:94:6: ( 'a' .. 'z' | 'A' .. 'Z' ) ( Digit | ( 'a' .. 'z' | 'A' .. 'Z' ) )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// T.g:94:26: ( Digit | ( 'a' .. 'z' | 'A' .. 'Z' ) )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// T.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:95:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// T.g:95:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// T.g:95:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// T.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "Comments"
	public final void mComments() throws RecognitionException {
		try {
			int _type = Comments;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:96:10: ( ( '#' ) (~ ( '\\n' | '\\r' ) )* )
			// T.g:96:12: ( '#' ) (~ ( '\\n' | '\\r' ) )*
			{
			// T.g:96:12: ( '#' )
			// T.g:96:13: '#'
			{
			match('#'); 
			}

			// T.g:96:17: (~ ( '\\n' | '\\r' ) )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// T.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Comments"

	@Override
	public void mTokens() throws RecognitionException {
		// T.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | Integer | String | ID | WS | Comments )
		int alt7=15;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt7=1;
			}
			break;
		case ')':
			{
			alt7=2;
			}
			break;
		case '+':
			{
			alt7=3;
			}
			break;
		case ',':
			{
			alt7=4;
			}
			break;
		case ':':
			{
			alt7=5;
			}
			break;
		case '=':
			{
			alt7=6;
			}
			break;
		case '[':
			{
			alt7=7;
			}
			break;
		case ']':
			{
			alt7=8;
			}
			break;
		case 'p':
			{
			int LA7_9 = input.LA(2);
			if ( (LA7_9=='r') ) {
				int LA7_16 = input.LA(3);
				if ( (LA7_16=='i') ) {
					int LA7_18 = input.LA(4);
					if ( (LA7_18=='n') ) {
						int LA7_20 = input.LA(5);
						if ( (LA7_20=='t') ) {
							int LA7_22 = input.LA(6);
							if ( ((LA7_22 >= '0' && LA7_22 <= '9')||(LA7_22 >= 'A' && LA7_22 <= 'Z')||(LA7_22 >= 'a' && LA7_22 <= 'z')) ) {
								alt7=13;
							}

							else {
								alt7=9;
							}

						}

						else {
							alt7=13;
						}

					}

					else {
						alt7=13;
					}

				}

				else {
					alt7=13;
				}

			}

			else {
				alt7=13;
			}

			}
			break;
		case 't':
			{
			int LA7_10 = input.LA(2);
			if ( (LA7_10=='u') ) {
				int LA7_17 = input.LA(3);
				if ( (LA7_17=='t') ) {
					int LA7_19 = input.LA(4);
					if ( (LA7_19=='u') ) {
						int LA7_21 = input.LA(5);
						if ( (LA7_21=='r') ) {
							int LA7_23 = input.LA(6);
							if ( (LA7_23=='k') ) {
								int LA7_25 = input.LA(7);
								if ( (LA7_25=='e') ) {
									int LA7_26 = input.LA(8);
									if ( (LA7_26=='y') ) {
										int LA7_27 = input.LA(9);
										if ( (LA7_27=='k') ) {
											int LA7_28 = input.LA(10);
											if ( (LA7_28=='e') ) {
												int LA7_29 = input.LA(11);
												if ( (LA7_29=='y') ) {
													int LA7_30 = input.LA(12);
													if ( ((LA7_30 >= '0' && LA7_30 <= '9')||(LA7_30 >= 'A' && LA7_30 <= 'Z')||(LA7_30 >= 'a' && LA7_30 <= 'z')) ) {
														alt7=13;
													}

													else {
														alt7=10;
													}

												}

												else {
													alt7=13;
												}

											}

											else {
												alt7=13;
											}

										}

										else {
											alt7=13;
										}

									}

									else {
										alt7=13;
									}

								}

								else {
									alt7=13;
								}

							}

							else {
								alt7=13;
							}

						}

						else {
							alt7=13;
						}

					}

					else {
						alt7=13;
					}

				}

				else {
					alt7=13;
				}

			}

			else {
				alt7=13;
			}

			}
			break;
		case '-':
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt7=11;
			}
			break;
		case '\"':
			{
			alt7=12;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'q':
		case 'r':
		case 's':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt7=13;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt7=14;
			}
			break;
		case '#':
			{
			alt7=15;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 7, 0, input);
			throw nvae;
		}
		switch (alt7) {
			case 1 :
				// T.g:1:10: T__10
				{
				mT__10(); 

				}
				break;
			case 2 :
				// T.g:1:16: T__11
				{
				mT__11(); 

				}
				break;
			case 3 :
				// T.g:1:22: T__12
				{
				mT__12(); 

				}
				break;
			case 4 :
				// T.g:1:28: T__13
				{
				mT__13(); 

				}
				break;
			case 5 :
				// T.g:1:34: T__14
				{
				mT__14(); 

				}
				break;
			case 6 :
				// T.g:1:40: T__15
				{
				mT__15(); 

				}
				break;
			case 7 :
				// T.g:1:46: T__16
				{
				mT__16(); 

				}
				break;
			case 8 :
				// T.g:1:52: T__17
				{
				mT__17(); 

				}
				break;
			case 9 :
				// T.g:1:58: T__18
				{
				mT__18(); 

				}
				break;
			case 10 :
				// T.g:1:64: T__19
				{
				mT__19(); 

				}
				break;
			case 11 :
				// T.g:1:70: Integer
				{
				mInteger(); 

				}
				break;
			case 12 :
				// T.g:1:78: String
				{
				mString(); 

				}
				break;
			case 13 :
				// T.g:1:85: ID
				{
				mID(); 

				}
				break;
			case 14 :
				// T.g:1:88: WS
				{
				mWS(); 

				}
				break;
			case 15 :
				// T.g:1:91: Comments
				{
				mComments(); 

				}
				break;

		}
	}



}
