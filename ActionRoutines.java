import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import jdk.jshell.Snippet;

/**
 * @author David Abboud
 *
 */
public class ActionRoutines {

	static HashMap<String, ArrayList<Object>> map = new HashMap<>();

	/**
	 * Assigns an integer value to a variable by binding them through the HashMap.
	 * 
	 * @param ID   variable ID
	 * @param int1 integer value
	 */
	public void initMapInt(String ID, String int1) {
		ArrayList<Object> newArr = new ArrayList<>();
		newArr.add(Integer.valueOf(int1));
		map.put(ID, newArr);

	}

	/**
	 * Assigns a string value to a variable by binding them through the HashMap.
	 * 
	 * @param ID  variable ID
	 * @param str string value
	 */
	public void initMapStr(String ID, String str) {
		ArrayList<Object> newArr = new ArrayList<>();
		newArr.add(str.substring(1, str.length() - 1));
		map.put(ID, newArr);

	}

	/**
	 * iterates through the tuple string, and creates an ArrayList of Objects
	 * containing the values inside that string (tuple, string or integer) that are
	 * separated by commas. Stores this Arraylist inside the HashMap, bound to a
	 * variable ID.
	 * 
	 * @param ID     variable ID
	 * @param tupStr tuple string
	 * @return an ArrayList of Objects representing the tuple string
	 */
	public ArrayList<Object> initMapTup(String ID, String tupStr) {

		ArrayList<Object> newArr = new ArrayList<>();

		if (tupStr.length() == 2) {
			String emptyStr = "";
			newArr.add(emptyStr);
			map.put(ID, newArr);
			return newArr;
		}

		for (int i = 1; i < tupStr.length(); i++) {

			if (tupStr.charAt(i) == ')') {
				break;
			}

			if (tupStr.charAt(i) == '(') { // tuple

				ArrayList<Object> lowLvl = new ArrayList<>();

				int j = i + 1;
				while (tupStr.charAt(j) != ')') {

					String str = "";
					while (tupStr.charAt(j) != ',') {

						if (tupStr.charAt(j) == '"' && tupStr.charAt(j + 1) != ')') {
							j++;
						}

						if (tupStr.charAt(j) == '"' && tupStr.charAt(j + 1) == ')') {
							break;
						}

						if (tupStr.charAt(j) != ')') {
							str = str + tupStr.charAt(j);
							j++;
						}

					}

					lowLvl.add(str);
					j = j + 1;
					i = j - 1;
				}

				newArr.add(lowLvl); // add the tuple that is inside the big tuple, to the big tuple.
				// what follows is ',' followed by the next object.
				i = i + 2; // go past the ','
			}

			else if (tupStr.charAt(i) == '"') { // string
				String str2 = "";
				i++;

				while (tupStr.charAt(i) != '"') {
					str2 = str2 + tupStr.charAt(i);
					i++;
				}
				newArr.add(str2);
				i = i + 1;

			}

			else { // integer
				String str3 = "";

				while (tupStr.charAt(i) != ',') {
					if (tupStr.charAt(i + 1) == ')') {
						str3 = str3 + tupStr.charAt(i);
						break;
					}
					str3 = str3 + tupStr.charAt(i);
					i++;
				}
				newArr.add(str3);

			}

		}

		map.put(ID, newArr);

		return newArr;
	}

	/**
	 * Same function as initMapTup, but without modifying the HashMap (without the
	 * "map.put()" statements). Creates an ArrayList out of a tuple.
	 * 
	 * @param tupStr tuple string to be converted into an ArrayList of Objects
	 * @return an ArrayList of Objects representing the tuple string
	 */
	public ArrayList<Object> createArr(String tupStr) {
		ArrayList<Object> newArr = new ArrayList<>();

		for (int i = 1; i < tupStr.length(); i++) {

			if (tupStr.charAt(i) == ')') {
				break;
			}

			if (tupStr.charAt(i) == '(') { // tuple

				ArrayList<Object> lowLvl = new ArrayList<>();

				int j = i + 1;
				while (tupStr.charAt(j) != ')') {

					String str = "";
					while (tupStr.charAt(j) != ',') {

						if (tupStr.charAt(j) == '"' && tupStr.charAt(j + 1) != ')') {
							j++;
						}

						if (tupStr.charAt(j) == '"' && tupStr.charAt(j + 1) == ')') {
							break;
						}

						if (tupStr.charAt(j) != ')') {
							str = str + tupStr.charAt(j);
							j++;
						}

					}

					lowLvl.add(str);
					j = j + 1;
					i = j - 1;
				}
				System.out.println("lowlvl : " + lowLvl);
				newArr.add(lowLvl); // add the tuple that is inside the big tuple, to the big tuple.
				// what follows is ',' followed by the next object.
				i = i + 2; // go past the ','
			}

			else if (tupStr.charAt(i) == '"') { // string
				String str2 = "";
				i++;

				while (tupStr.charAt(i) != '"') {
					str2 = str2 + tupStr.charAt(i);
					i++;
				}
				newArr.add(str2);
				i = i + 1;

			}

			else { // integer
				String str3 = "";
				while (tupStr.charAt(i) != ',') {
					if (tupStr.charAt(i + 1) == ')') {
						str3 = str3 + tupStr.charAt(i);
						break;
					}
					str3 = str3 + tupStr.charAt(i);
					i++;
				}
				newArr.add(str3);

			}

		}

		return newArr;
	}

	/**
	 * Sets an ID equal to another. Stores it inside the HashMap.
	 * 
	 * @param id1 ID being modified or created, left-hand side
	 * @param id2 ID on the right-hand side
	 */
	public void initMapID(String id1, String id2) { // id1=id2
		try {
			Integer i = Integer.valueOf(map.get(id2).toString().substring(1, map.get(id2).toString().length() - 1));
			ArrayList<Object> newArr = new ArrayList<>();
			Object str = map.get(id2).get(0);
			newArr.add(str);
			map.put(id1, newArr);
		} catch (Exception E) {
			if (map.get(id2).toString().indexOf(',') != -1) {
				ArrayList<Object> str = map.get(id2);
				map.put(id1, str);

			} else {
				ArrayList<Object> newArr = new ArrayList<>();
				Object str = map.get(id2).get(0);
				newArr.add(str);
				map.put(id1, newArr);
			}

		}

	}

	/**
	 * Applied recursively. Increments the value in the hashmap whose key is ID with
	 * an increment equal to the Integer value of i1.
	 * 
	 * @param ID Hashmap key
	 * @param i1 Increment amount
	 * @return The addition of the value whose key is ID in the HashMap and i1
	 */
	public Integer addInteger(String ID, String i1) {
		ArrayList<Object> newArr = new ArrayList<>();
		Object obj = map.get(ID).get(0);
		Object obj2 = Integer.valueOf(obj.toString()) + Integer.valueOf(i1);
		newArr.add(obj2);
		map.replace(ID, newArr);
		return Integer.valueOf(obj2.toString());
	}

	/**
	 * Applied recursively. Appends i1 to the String in the hashmap whose key is ID.
	 * 
	 * @param ID Hashmap key
	 * @param i1 String that will be appende
	 * @return The concatenation of the String whose key is ID in the HashMap and i1
	 */
	public String addString(String ID, String i1) {
		ArrayList<Object> newArr = new ArrayList<>();
		Object obj = map.get(ID).get(0);

		String str = obj.toString().substring(0, obj.toString().length()) + i1.substring(1, i1.length() - 1);
		newArr.add(str);
		map.replace(ID, newArr);
		return str;
	}

	/**
	 * Used for printing only.
	 * 
	 * @param a First Integer
	 * @param b Second Integer
	 * @return The addition of both Integers, to be printed.
	 */
	public Integer addIntegerPrint(String a, String b) {
		return Integer.valueOf(a) + Integer.valueOf(b);
	}

	/**
	 * Used for printing only.
	 * 
	 * @param a First String
	 * @param b First String
	 * @return The concatenation of both strings, to be printed.s
	 */
	public String addStringPrint(String a, String b) {
		return a.substring(1, a.length() - 1) + b.substring(1, a.length() - 1);
	}

	/**
	 * Used recursively. Determines type of Object stored in the HashMap with key b,
	 * and adds it to the object with key ID in the Hashmap accordingly.
	 * 
	 * @param ID HashMap Key
	 * @param b  Object to be added
	 * @return The addition of both. Concatenation if String or tuple, and binary
	 *         addition if Integer.
	 */
	public Object addID(String ID, String b) {

		try {
			Integer i = Integer.valueOf(map.get(b).toString().substring(1, map.get(b).toString().length() - 1)); // integer
			String c = map.get(b).toString().substring(1, map.get(b).toString().length() - 1);
			return addInteger(ID, c);
		} catch (Exception E) {
			if (map.get(b).toString().indexOf(',') != -1) { // tuple

				String c = map.get(b).toString().substring(1, map.get(b).toString().length() - 1);

				return addTuple2(ID, c);
			} else { // string
				String c = map.get(b).toString();
				return addString(ID, c);
			}
		}

	}

	/**
	 * Used for printing. Determines the type of both operands and adds them
	 * accordingly.
	 * 
	 * @param a First operand, as a String. Must be of the same type as b.
	 * @param b Second operand, as a String. Must be of the same type as b.
	 * @return Returns the addition of both accordingly. Binary addition if
	 *         Integers, and concatenation if tuple or String.
	 */
	public Object addIDPrint(String a, String b) {
		if (a.charAt(0) == '(' && b.charAt(0) == '(') {
			String c;
			c = map.get(a).toString().substring(1, map.get(a).toString().length() - 1); // remove the [ ]
			String d;
			d = map.get(b).toString().substring(1, map.get(b).toString().length() - 1);
			return addTuplePrint(c, d);
		} else if (a.charAt(0) == '"' && b.charAt(0) == '"') {
			String c;
			c = map.get(a).toString().substring(1, map.get(a).toString().length() - 1);
			String d;
			d = map.get(b).toString().substring(1, map.get(b).toString().length() - 1);
			return addStringPrint(c, d);
		} else {
			String c;
			c = map.get(a).toString().substring(1, map.get(a).toString().length() - 1);
			String d;
			d = map.get(b).toString().substring(1, map.get(b).toString().length() - 1);
			return addIntegerPrint(c, d);
		}
	}

	/**
	 * Prints a variable by extracting its value from the hashMap.
	 * 
	 * @param x The variable that has to be printed (its ID)
	 */
	public void printID(String x) {
		if (map.get(x).size() > 1) { // tuple
			System.out.println(map.get(x));
		} else { // string/integer
			System.out.println(map.get(x).get(0));
		}
	}

	/**
	 * Prints a string (i.e. a sequence of digits or letters starting and enging
	 * with '"'. Omits the '"' symbols.') prints an empty string if given string is
	 * empty.
	 * 
	 * @param str string to be printed
	 */
	public void printString(String str) {

		if (str.length() > 1) {
			System.out.println(str.substring(1, str.length() - 1));
		} else {
			System.out.println(""); // empty string
		}

	}

	/**
	 * Prints nothing if empty. Else, print tuple.
	 * 
	 * @param tuple
	 */
	public void printTuple(String tuple) {
		if (tuple.length() == 2) {
			System.out.println("");
		} else
			System.out.println(tuple);
	}

	/**
	 * Converts the two tuples into ArrayLists of Objects, concatenates them, then
	 * stores them in a variable through the HashMap.
	 * 
	 * @param ID   variable in which the concatenation will reside
	 * @param tup1 first tuple
	 * @param tup2 second tuple
	 * @return an ArrayList of Objects which represents the concatenation of the two
	 *         tuples. tup1 followed by tup2.
	 */
	public ArrayList<Object> addTuple2(String ID, String tup1) {

		ArrayList<Object> arr1 = map.get(ID);

		ArrayList<Object> arr2 = createArr('(' + tup1 + ')');

		arr1.addAll(arr2);

		map.replace(ID, arr1);

		return arr1;

	}

	/**
	 * Concatenated two tuples.
	 * 
	 * @param tup1 First tuple
	 * @param tup2 Second tuple
	 * @return the concatenation of both Strings as a String.
	 */
	public String addTuple(String tup1, String tup2) {

		if (tup1.length() > 2 && tup2.length() > 2) {
			String s1 = tup1.substring(1, tup1.length() - 1);
			String s2 = tup2.substring(5, tup2.length() - 1); // handles "null" tuple in grammar's base case

			String sNew1 = '(' + s1 + "," + s2 + ')';

			return sNew1;
		}

		else {

			return tup1;
		}

	}

	/**
	 * Appends two tuples for printing.
	 * 
	 * @param tup1 First tuple, as a String
	 * @param tup2 Second tuple, as a String
	 * @return an ArrayList of Objects that is the union of both tuples.
	 */
	public ArrayList<Object> addTuplePrint(String tup1, String tup2) {
		ArrayList<Object> arr1 = createArr(tup1);
		ArrayList<Object> arr2 = createArr(tup2);
		arr1.addAll(arr2);
		return arr1;
	}

	/**
	 * Accesses a certain index from a tuple inside the HashMap.
	 * 
	 * @param tuple ID of the tuple
	 * @param index index of the element inside the tuple. Can be negative :
	 *              indexing would be relative to the last element.
	 * @return the Object at given index of given tuple
	 */

	public Object get(String tuple, String index) { // ID = tuple[index]

		if (Integer.valueOf(index) >= 0) {
			return map.get(tuple).get(Integer.valueOf(index));
		} else {
			return map.get(tuple).get(map.get(tuple).size() + Integer.valueOf(index));
		}
	}

	/**
	 * Assigns to a variable the Object at the given index of a given tuple
	 * 
	 * @param ID    bariable ID
	 * @param ID2   tuple ID
	 * @param index tuple ID Can be negative : indexing would be relative to the
	 *              last element.
	 */
	public void indexAssign(String ID, String ID2, String index) { // ID = ID2[index]
		ArrayList<Object> arr1 = map.get(ID2);
		ArrayList<Object> arr2 = new ArrayList<>();
		arr2.add(arr1.get(Integer.valueOf(index)));
		map.put(ID, arr2);

	}

	/**
	 * Prints the Object at the given index of a given tuple
	 * 
	 * @param tuple tuple
	 * @param index index of the tuple
	 */
	public void printGet(String tuple, String index) { // ID = tuple[index]

		System.out.println(get(tuple, index));
	}

	/**
	 * Replaces a value inside a tuple by either a string or a integer, at the given
	 * index value python tuples are immutable. uncomment if assumed mutable.
	 * 
	 * @param ID    tuple ID
	 * @param index index of tuple element to be replaced
	 * @param value string or integer that will replace element. (If integer, will
	 *              be converted to Integer object)
	 */
	// public void replaceIntStr(String ID, String index, String value) { //
	// ID[index]=value
	// ArrayList<Object> arr = map.get(ID);
	// arr.remove(index);
	// arr.add(Integer.valueOf(index), value);
	// }

	/**
	 * Replaces a value inside a tuple by a tuple at the given index value. Converts
	 * tuple passed as a String (value paramater) to an ArrayList, then inserts it
	 * into the HashMap. python tuples are immutable. uncomment if assumed mutable.
	 * 
	 * @param ID    tuple ID
	 * @param index index of tuple element to be replaced
	 * @param value tuple (as String)
	 */
	// public void replaceTup(String ID, String index, String value) {
	// ArrayList<Object> arr = createArr(value);
	// ArrayList<Object> arr2 = map.get(ID);
	// arr2.remove(index);
	// arr2.add(Integer.valueOf(index), arr);
	// }

	/**
	 * Extracts each element of a tuple into a variable. Variable at index i in the
	 * tuple of variables will be assigned the value at index i of the tuple of
	 * values.
	 * 
	 * @param tuple A tuple of variables.
	 * @param ID    Hashmap key : ID of a tuple containing values to be extracted.
	 */
	public void unpack(String tuple, String ID) {
		ArrayList<Object> tempIDNames = createArr(tuple);
		ArrayList<Object> arr2 = map.get(ID);

		if (tempIDNames.size() != arr2.size()) {
			System.out.println("Unpack unsupported : tuples are of different sizes"); // no Exception with try/catch
		}

		for (int i = 0; i < arr2.size(); i++) {
			ArrayList<Object> temp = new ArrayList<>();
			temp.add(arr2.get(i));
			map.put(tempIDNames.get(i).toString(), temp);
		}
	}

	/**
	 * Extracts each element of a tuple into a variable. Variable at index i in the
	 * tuple of variables will be assigned the value at index i of the tuple of
	 * values.
	 * 
	 * @param IDtuple A tuple of variables.
	 * @param tuple   Tuple containing values to be extracted.
	 */
	public void unpack2(String IDtuple, String tuple) {
		ArrayList<Object> tempIDNames = createArr(IDtuple);
		ArrayList<Object> arr2 = createArr(tuple);

		if (tempIDNames.size() != arr2.size()) {
			System.out.println("Unpack unsupported : tuples are of different sizes");
			return;
		}

		for (int i = 0; i < arr2.size(); i++) {// (ID4,ID5,ID6)=(1,"HELLO",4))
			ArrayList<Object> temp = new ArrayList<>();
			temp.add(arr2.get(i));
			map.put(tempIDNames.get(i).toString(), temp);
		}
	}

	/**
	 * Returns the portion starting at index1 (inclusive) and ending at index2
	 * (exclusive).
	 * 
	 * @param id1    variable to which the portion of the tuple will be extracted to
	 * @param id2    tuple to be sliced
	 * @param index1 Could be negative. Inclusive.
	 * @param index2 Could be negative. Exclusive.
	 * @return an ArrayList of Objects containing the sliced elements
	 */
	public ArrayList<Object> slice1(String id1, String id2, String index1, String index2) { // id1 = id2[index1:index2]

		int int1 = Integer.valueOf(index1);
		int int2 = Integer.valueOf(index2);

		if (int1 >= 0 && int2 >= 0) {
			List<Object> arr = map.get(id2).subList(int1, int2);

			ArrayList<Object> arr2 = new ArrayList<>(arr);
			map.put(id1, arr2);

			return arr2;
		}

		else if (int1 >= 0 && int2 <= 0) {
			List<Object> arr = map.get(id2).subList(int1, map.get(id2).size() + int2);

			ArrayList<Object> arr2 = new ArrayList<>(arr);
			map.put(id1, arr2);

			return arr2;
		} else if (int1 <= 0 && int2 >= 0) {
			List<Object> arr = map.get(id2).subList(map.get(id2).size() + int1, int2);

			ArrayList<Object> arr2 = new ArrayList<>(arr);
			map.put(id1, arr2);

			return arr2;
		} else {
			List<Object> arr = map.get(id2).subList(map.get(id2).size() + int1, map.get(id2).size() + int2);

			ArrayList<Object> arr2 = new ArrayList<>(arr);
			map.put(id1, arr2);

			return arr2;
		}
	}

	/**
	 * Returns the portion from index (inclusive) till the end of the list. The
	 * index could be negative.
	 * 
	 * @param id1   variable to which the portion of the tuple will be extracted to
	 * @param id2   tuple to be sliced
	 * @param index Could be negative. Inclusive.
	 * @return an ArrayList of Objects containing the sliced elements
	 */
	public ArrayList<Object> slice2(String id1, String id2, String index) { // id1=id2[index:]
		int int1 = Integer.valueOf(index);

		if (int1 >= 0) {
			List<Object> arr = map.get(id2).subList(int1, map.get(id2).size());

			ArrayList<Object> arr2 = new ArrayList<>(arr);
			map.put(id1, arr2);

			return arr2;
		}

		else {
			List<Object> arr = map.get(id2).subList(map.get(id2).size() + int1, map.get(id2).size());

			ArrayList<Object> arr2 = new ArrayList<>(arr);
			map.put(id1, arr2);

			return arr2;
		}
	}

	/**
	 * returns the portion from the beginning of the list till index (exclusive).
	 * The index could be negative.
	 * 
	 * @param id1   variable to which the portion of the tuple will be extracted to
	 * @param id2   tuple to be sliced
	 * @param index Could be negative. Exclusive.
	 * @return an ArrayList of Objects containing the sliced elements
	 */
	public ArrayList<Object> slice3(String id1, String id2, String index) { // id1=id2[:index]
		int int1 = Integer.valueOf(index);

		if (int1 >= 0) {
			List<Object> arr = map.get(id2).subList(0, int1);

			ArrayList<Object> arr2 = new ArrayList<>(arr);
			map.put(id1, arr2);

			return arr2;
		}

		else {
			List<Object> arr = map.get(id2).subList(0, map.get(id2).size() + int1);

			ArrayList<Object> arr2 = new ArrayList<>(arr);
			map.put(id1, arr2);

			return arr2;
		}
	}

	/**
	 * prints the HashMap containing all variables and their respective values.
	 */
	public void printHashmap() {
		System.out.println("HashMap values :" + Arrays.asList(map));
	}
}
