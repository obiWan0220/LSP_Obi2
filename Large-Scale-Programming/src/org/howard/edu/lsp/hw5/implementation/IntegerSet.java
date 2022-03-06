package org.howard.edu.lsp.hw5.implementation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;




/**
 * 
 * @author Michael Obi<br>
 * Class IntegerSet defines multiple  methods to manipulate the content of the given ArrayLists.
 * The methods are described below.
 * <p>
 * Given an array 
 */
public class IntegerSet {
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * getter methods call equal(), union(), intersect(), and diff() methods.
	 * @return set includes the values of each ArrayList  when called by a method.
	 */
	public List<Integer> getSet() {
		return set;
	}

	/**
	 * Method clears array list.
	 * Method is void, but set is printed for visual purposes.
	 */
	public void clear(){
		set.clear();
		System.out.println("Cleared Set: " + set);
	}
	
	/**
	 * Method determines the length of the set, then returns this value.
	 * @return length, an integer used to obtain the length of the set.
	 */
	public int length() {
		int length = set.size();
		return length;
	}
	
	/**
	 * Compares two sets to see if they have the same values. 
	 * @param b, the set being compared to another set for the same values.
	 * @return equal if two sets have the same values, false if values are different .
	 */
	
	public boolean equals(IntegerSet b) {	
		boolean equal = true;
		List<Integer> Set2 = b.getSet();
		for (int i=0; i<set.size(); i++) {
			int set1val = set.get(i);
			for (int j=0; j<Set2.size(); j++) {
				int set2val = Set2.get(i);
				if (set1val == set2val) {
					equal = true;
				}
				else {
					equal = false;
				}
			}
		}
		return equal;
	}

	/**
	 * Searches set for a specific value in set. Returns true if value exists in set.
	 * @param value, the item which this method searches the set for.
	 * @return contained, a boolean set to true by default. 
	 * Kept as true if value is found in set, otherwise is false. 
	 */
	public boolean contains(int value) {
		boolean contained = true;
		if (set.contains(value)) {
			contained = true;
		}
		else {
			contained = false;
		}
		return contained;
	}    

	/**
	 * If set has no length, throws an IntegerSetException error.
	 * @return max and min values in set, if set has a length of 1 or greater.
	 * @throws IntegerSetException exception class for empty sets.
	 */
	public int largest() throws IntegerSetException {
		int max = 0;
		if (set.size() <= 0) {
			throw new IntegerSetException("ArrayList has no length, and therefore no largest item.");
		}
		else if (set.size() > 0) {
			max = Collections.max(set);
		}
		return max;
	}
	
	/**
	 * If set has no length, throws a custom IntegerSetException error.
	 * @return min, minimum value in set, if set has a length of 1 or greater.
	 * @throws IntegerSetException custom exception class for empty sets.
	 */
	public int smallest() throws IntegerSetException {
		int min = 0;
		if (set.size() <= 0) {
			throw new IntegerSetException("ArrayList has no length, and therefore no smallest item.");
		}
		else if (set.size() > 0) {
			min = Collections.min(set);
		}
		return min;
	} 
	
	/**
	 * Examines a set for a specific item.
	 * If item does not already exist in set, method adds item in set.
	 * @param item denotes the value to be added to the set by this method.
	 */
	public void add(int item) {
		if (set.contains(item) == false) {
			set.add(item);
		}
	}
	
	/**
	 * Examines a set for a specific item. If item exists, method removes item.
	 * @param item denotes the value to be removed from the set by this method.
	 */
	public void remove(int item) {
		if (set.contains(item) == true) {
			set.removeAll(Arrays.asList(item));
		}
	} 
	
	/**
	 * Combines two sets together while deleting any duplicates.
	 * @param intSetb, is the set to be compared to another set.
	 */
	public void union(IntegerSet intSetb) {
		List<Integer> Set2 = intSetb.getSet();
		for (int i=0; i<Set2.size(); i++) {
			add(Set2.get(i));	
		}
		set.toString();
	}
	
	/**
	 * Examines two sets and prints the elements shared by the two sets.
	 * @param intSetb, intSetb is the set compared to another set.
	 */
	public void intersect(IntegerSet intSetb) {
		List<Integer> Set2 = intSetb.getSet();
		for (int i=0; i<Set2.size(); i++) {
			set.retainAll(Set2);
		}
		set.toString();
	}
	
	/**
	 * Examines two sets and prints elements not contained in one of the sets.
	 * @param intSetb, intSetb is the set compared to another set.
	 */
	public void diff(IntegerSet intSetb) {
		List<Integer> Set2 = intSetb.getSet();
		for (int i=0; i<Set2.size(); i++) {
			set.removeAll(Set2);
		}
		set.toString();
	}	
	
	/**
	 * Examines whether or not a set is empty.
	 * @return boolean empty, default true. 
	 * If set has no values, returns true. If set has values, returns false.
	 */
	public boolean isEmpty() {
		boolean empty = true;
		int length = set.size();
		if (length > 0) {
			empty = false;
		}
		else if (length == 0){
			empty = true;
		}
		return empty;
	}

	/**
	 * Converts Integer Set to a String, and prints that String.
	 * @return String setasstring, converted set to a String.
	 */
	public String toString() {
		String setasstring = set.toString();
		return setasstring;	
	}
}