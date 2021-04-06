import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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
		System.out.println("-----------------------------------------------");
		System.out.println("hashMap values as of now: " + Arrays.asList(map));
		System.out.println("-----------------------------------------------");
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
		System.out.println("-----------------------------------------------");
		System.out.println("hashMap values as of now: " + Arrays.asList(map));
		System.out.println("-----------------------------------------------");
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
				// ( (123, 2,"Hello") , "he" , 23)
				// i
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
				// i=i+2;
			}

		}
		// System.out.println("!!!");
		map.put(ID, newArr);
		System.out.println("-----------------------------------------------");
		System.out.println("hashMap values as of now: " + Arrays.asList(map));
		System.out.println("-----------------------------------------------");
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

		for (int i = 1; i < tupStr.length(); i++) {// 0123456789abcdefghij tupstrlen=19 , last index = 18
													// k1=((1,2,"Hello"),1,2)
													// i
													// j
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
				// ( (123, 2,"Hello") , "he" , 23)
				// i
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
				// i=i+2;
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
		ArrayList<Object> newArr = new ArrayList<>();
		Object str = map.get(id2).get(0);
		newArr.add(str);
		map.put(id1, newArr);
		System.out.println("-----------------------------------------------");
		System.out.println("hashMap values as of now: " + Arrays.asList(map));
		System.out.println("-----------------------------------------------");
	}

	/**
	 * Converts input a and b, which are strings, into Integers and adds them.
	 * Stores result in HashMap tied with given ID.
	 * 
	 * @param a  Integer a as a string
	 * @param b  Integer b as a string
	 * @param ID Variable Name
	 * @return Integer c = a + b
	 */
	public Integer addInteger(String ID, String a, String b) {

		ArrayList<Object> newArr = new ArrayList<>();
		Integer c = Integer.valueOf(a);
		Integer d = Integer.valueOf(b);

		Integer x = c + d;
		newArr.add(x);
		map.put(ID, newArr);
		System.out.println("-----------------------------------------------");
		System.out.println("hashMap values as of now: " + Arrays.asList(map));
		System.out.println("-----------------------------------------------");
		// System.out.println("from addInteger : " + x);
		return x;
	}

	/**
	 * Concatenates two strings, places them into the variable ID through the
	 * HashMap.
	 * 
	 * @param ID variable in which the concatenation will reside
	 * @param a  first string
	 * @param b  second string
	 * @return ID, the concatenation of both a and b
	 */
	public String addString(String ID, String a, String b) {
		ArrayList<Object> newArr = new ArrayList<>();
		// String[] arr = {a,b};
		String str = a.substring(1, a.length() - 1) + b.substring(1, a.length() - 1);
		newArr.add(str);
		map.put(ID, newArr);
		// initMapStr(ID, str);
		System.out.println("-----------------------------------------------");
		System.out.println("hashMap values as of now: " + Arrays.asList(map));
		System.out.println("-----------------------------------------------");
		// System.out.println("from addInteger : " + x);
		return str;
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
	 * Converts the two tuples into ArrayLists of Objects, concatenates them, then
	 * stores them in a variable through the HashMap.
	 * 
	 * @param ID   variable in which the concatenation will reside
	 * @param tup1 first tuple
	 * @param tup2 second tuple
	 * @return an ArrayList of Objects which represents the concatenation of the two
	 *         tuples. tup1 followed by tup2.
	 */
	public ArrayList<Object> addTuple(String ID, String tup1, String tup2) {
		ArrayList<Object> arr1 = createArr(tup1);
		ArrayList<Object> arr2 = createArr(tup2);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ " + tup1);
		arr1.addAll(arr2);
		map.put(ID, arr1);
		System.out.println("-----------------------------------------------");
		System.out.println("hashMap values as of now: " + Arrays.asList(map));
		System.out.println("-----------------------------------------------");
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
		// System.out.println("INDEXING:");
		System.out.println(tuple + '[' + index + ']' + '=' + get(tuple, index));
	}

	/**
	 * Replaces a value inside a tuple by either a string or a integer, at the given
	 * index value
	 * 
	 * @param ID    tuple ID
	 * @param index index of tuple element to be replaced
	 * @param value string or integer that will replace element. (If integer, will
	 *              be converted to Integer object)
	 */
	public void replaceIntStr(String ID, String index, String value) { // ID[index]=value
		// System.out.println("BEFORE REPLACING, k1 = " + map.get(ID));
		ArrayList<Object> arr = map.get(ID);
		arr.remove(index);
		// System.out.println(value + " will be inserted at index " + index);
		arr.add(Integer.valueOf(index), value);
		// System.out.println("AFTER REPLACING, k1 = " + map.get(ID));
	}

	/**
	 * Replaces a value inside a tuple by a tuple at the given index value. Converts
	 * tuple passed as a String (value paramater) to an ArrayList, then inserts it
	 * into the HashMap.
	 * 
	 * @param ID    tuple ID
	 * @param index index of tuple element to be replaced
	 * @param value tuple (as String)
	 */
	public void replaceTup(String ID, String index, String value) {
		ArrayList<Object> arr = createArr(value);
		ArrayList<Object> arr2 = map.get(ID);
		arr2.remove(index);
		arr2.add(Integer.valueOf(index), arr);
	}

	/**
	 * the elements of tuple T are extracted back into variables in varargs.
	 * 
	 * @param tuple The tuple to be extracted, as a String
	 * @param s     Variables to which the tuple will be unpacked
	 */
	public void unpack(String tuple, String... s) {
		System.out.println("unpack was detected");

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
		// System.out.println("SLICE1 CALLED");

		int int1 = Integer.valueOf(index1);
		int int2 = Integer.valueOf(index2);

		if (int1 >= 0 && int2 >= 0) {
			List<Object> arr = map.get(id2).subList(int1, int2);

			ArrayList<Object> arr2 = new ArrayList<>(arr);
			map.put(id1, arr2);
			System.out.println("-----------------------------------------------");
			System.out.println("hashMap values as of now: " + Arrays.asList(map));
			System.out.println("-----------------------------------------------");
			return arr2;
		}

		else if (int1 >= 0 && int2 <= 0) {
			List<Object> arr = map.get(id2).subList(int1, map.get(id2).size() + int2);

			ArrayList<Object> arr2 = new ArrayList<>(arr);
			map.put(id1, arr2);
			System.out.println("-----------------------------------------------");
			System.out.println("hashMap values as of now: " + Arrays.asList(map));
			System.out.println("-----------------------------------------------");
			return arr2;
		} else if (int1 <= 0 && int2 >= 0) {
			List<Object> arr = map.get(id2).subList(map.get(id2).size() + int1, int2);

			ArrayList<Object> arr2 = new ArrayList<>(arr);
			map.put(id1, arr2);
			System.out.println("-----------------------------------------------");
			System.out.println("hashMap values as of now: " + Arrays.asList(map));
			System.out.println("-----------------------------------------------");
			return arr2;
		} else {
			List<Object> arr = map.get(id2).subList(map.get(id2).size() + int1, map.get(id2).size() + int2);

			ArrayList<Object> arr2 = new ArrayList<>(arr);
			map.put(id1, arr2);
			System.out.println("-----------------------------------------------");
			System.out.println("hashMap values as of now: " + Arrays.asList(map));
			System.out.println("-----------------------------------------------");
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
			System.out.println("-----------------------------------------------");
			System.out.println("hashMap values as of now: " + Arrays.asList(map));
			System.out.println("-----------------------------------------------");
			return arr2;
		}

		else {
			List<Object> arr = map.get(id2).subList(map.get(id2).size() + int1, map.get(id2).size());

			ArrayList<Object> arr2 = new ArrayList<>(arr);
			map.put(id1, arr2);
			System.out.println("-----------------------------------------------");
			System.out.println("hashMap values as of now: " + Arrays.asList(map));
			System.out.println("-----------------------------------------------");
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
			System.out.println("-----------------------------------------------");
			System.out.println("hashMap values as of now: " + Arrays.asList(map));
			System.out.println("-----------------------------------------------");
			return arr2;
		}

		else {
			List<Object> arr = map.get(id2).subList(0, map.get(id2).size() - int1);

			ArrayList<Object> arr2 = new ArrayList<>(arr);
			map.put(id1, arr2);
			System.out.println("-----------------------------------------------");
			System.out.println("hashMap values as of now: " + Arrays.asList(map));
			System.out.println("-----------------------------------------------");
			return arr2;
		}
	}

}
