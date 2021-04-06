// $ANTLR 3.5.2 T.g 2021-04-03 18:57:54

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class TLexer extends Lexer {
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

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:7:6: ( '(' )
			// T.g:7:8: '('
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
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
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
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
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
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
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
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:15:7: ( 'print(' )
			// T.g:15:9: 'print('
			{
			match("print("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "Digit"
	public final void mDigit() throws RecognitionException {
		try {
			// T.g:83:16: ( '0' .. '9' )
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
			// T.g:84:9: ( ( '-' )? ( Digit )+ )
			// T.g:84:11: ( '-' )? ( Digit )+
			{
			// T.g:84:11: ( '-' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// T.g:84:11: '-'
					{
					match('-'); 
					}
					break;

			}

			// T.g:84:16: ( Digit )+
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
			// T.g:85:8: ( '\"' ( Digit | ( 'a' .. 'z' | 'A' .. 'Z' ) | ' ' )* '\"' )
			// T.g:85:10: '\"' ( Digit | ( 'a' .. 'z' | 'A' .. 'Z' ) | ' ' )* '\"'
			{
			match('\"'); 
			// T.g:85:14: ( Digit | ( 'a' .. 'z' | 'A' .. 'Z' ) | ' ' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==' '||(LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// T.g:
					{
					if ( input.LA(1)==' '||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
			// T.g:86:4: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( Digit | ( 'a' .. 'z' | 'A' .. 'Z' ) )* )
			// T.g:86:6: ( 'a' .. 'z' | 'A' .. 'Z' ) ( Digit | ( 'a' .. 'z' | 'A' .. 'Z' ) )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// T.g:86:26: ( Digit | ( 'a' .. 'z' | 'A' .. 'Z' ) )*
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
			// T.g:87:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// T.g:87:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// T.g:87:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
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

	@Override
	public void mTokens() throws RecognitionException {
		// T.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | Integer | String | ID | WS )
		int alt6=13;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt6=1;
			}
			break;
		case ')':
			{
			alt6=2;
			}
			break;
		case '+':
			{
			alt6=3;
			}
			break;
		case ',':
			{
			alt6=4;
			}
			break;
		case ':':
			{
			alt6=5;
			}
			break;
		case '=':
			{
			alt6=6;
			}
			break;
		case '[':
			{
			alt6=7;
			}
			break;
		case ']':
			{
			alt6=8;
			}
			break;
		case 'p':
			{
			int LA6_9 = input.LA(2);
			if ( (LA6_9=='r') ) {
				int LA6_14 = input.LA(3);
				if ( (LA6_14=='i') ) {
					int LA6_15 = input.LA(4);
					if ( (LA6_15=='n') ) {
						int LA6_16 = input.LA(5);
						if ( (LA6_16=='t') ) {
							int LA6_17 = input.LA(6);
							if ( (LA6_17=='(') ) {
								alt6=9;
							}

							else {
								alt6=12;
							}

						}

						else {
							alt6=12;
						}

					}

					else {
						alt6=12;
					}

				}

				else {
					alt6=12;
				}

			}

			else {
				alt6=12;
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
			alt6=10;
			}
			break;
		case '\"':
			{
			alt6=11;
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
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt6=12;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt6=13;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 6, 0, input);
			throw nvae;
		}
		switch (alt6) {
			case 1 :
				// T.g:1:10: T__9
				{
				mT__9(); 

				}
				break;
			case 2 :
				// T.g:1:15: T__10
				{
				mT__10(); 

				}
				break;
			case 3 :
				// T.g:1:21: T__11
				{
				mT__11(); 

				}
				break;
			case 4 :
				// T.g:1:27: T__12
				{
				mT__12(); 

				}
				break;
			case 5 :
				// T.g:1:33: T__13
				{
				mT__13(); 

				}
				break;
			case 6 :
				// T.g:1:39: T__14
				{
				mT__14(); 

				}
				break;
			case 7 :
				// T.g:1:45: T__15
				{
				mT__15(); 

				}
				break;
			case 8 :
				// T.g:1:51: T__16
				{
				mT__16(); 

				}
				break;
			case 9 :
				// T.g:1:57: T__17
				{
				mT__17(); 

				}
				break;
			case 10 :
				// T.g:1:63: Integer
				{
				mInteger(); 

				}
				break;
			case 11 :
				// T.g:1:71: String
				{
				mString(); 

				}
				break;
			case 12 :
				// T.g:1:78: ID
				{
				mID(); 

				}
				break;
			case 13 :
				// T.g:1:81: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
