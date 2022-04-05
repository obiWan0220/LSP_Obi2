package org.howard.edu.lsp.assignment6.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.howard.edu.lsp.hw5.implementation.IntegerSet;
import org.howard.edu.lsp.hw5.implementation.IntegerSetException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class IntegerSetTest {

	@Test
	@DisplayName("Test cases for clear")
	void testClear() {
		IntegerSet testArray = new IntegerSet();
		testArray.add(1);
		int value = testArray.length();
		//test array before cleared
		assertEquals(1, value);
		testArray.clear();
		value = testArray.length();
		//test array after cleared
		assertEquals(0, value);
	}

	@Test
	@DisplayName("Test cases for length")
	void testLength() {
		IntegerSet testArray = new IntegerSet();
		testArray.add(1);
		testArray.add(2);
		testArray.add(3);
		int value = testArray.length();
		//test array with 3 elements
		assertEquals(3, value);
	}

	@Test
	@DisplayName("Test cases for equals")
	void testEqualsIntegerSet() {
		IntegerSet testArray = new IntegerSet();
		testArray.add(1);
		testArray.add(2);
		testArray.add(3);
		testArray.add(4);
		IntegerSet testArray2 = new IntegerSet();
		testArray2.add(1);
		testArray2.add(2);
		testArray2.add(3);
		testArray2.add(4);
		//test if two equal arrays are equal
		boolean value = testArray.equals(testArray2);
		assertEquals(true, value);
		testArray.add(5);
		value = testArray.equals(testArray2);
		//test if two unequal arrays are not equal
		assertEquals(false, value);
	}

	@Test
	@DisplayName("Test cases for contains")
	void testContains() {
		IntegerSet testArray = new IntegerSet();
		testArray.add(1);
		testArray.add(2);
		testArray.add(3);
		boolean value = testArray.contains(3);
		//test if 3 is in an array that contains 3
		assertEquals(true, value);
		value = testArray.contains(0);
		//test if 0 is in an array that does no contain 0
		assertEquals(false, value);
	}

	@Test
	@DisplayName("Test cases for largest")
	void testLargest() {
		IntegerSet testArray = new IntegerSet();
		testArray.add(1);
		testArray.add(2);
		testArray.add(3);
		int value = -1;
		try {
			value = testArray.largest();
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Empty Array");
		}
		//test if 3 is the largest in an array in which 3 is the largest 
		assertEquals(3, value);
	}

	@Test
	@DisplayName("Test cases for smallest")
	void testSmallest() {
		IntegerSet testArray = new IntegerSet();
		testArray.add(1);
		testArray.add(2);
		testArray.add(3);
		int value = -1;
		try {
			value = testArray.smallest();
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Empty Array");
		}
		//test if 3 is the largest in an array in which 3 is the largest 
		assertEquals(1, value);
	}

	@Test
	@DisplayName("Test cases for add")
	void testAdd() {
		IntegerSet testArray = new IntegerSet();
		testArray.add(1);
		testArray.add(2);
		testArray.add(3);
		testArray.add(4);
		testArray.add(2);
		testArray.add(3);
		testArray.add(4);
		IntegerSet value = testArray;
		IntegerSet expected_value = new IntegerSet();
		expected_value.add(1);
		expected_value.add(2);
		expected_value.add(3);
		expected_value.add(4);
		//test if 1234 is added to the array without duplicates
		assertTrue(expected_value.equals(value));
		
	}

	@Test
	@DisplayName("Test cases for remove")
	void testRemove() {
		IntegerSet testArray = new IntegerSet();
		testArray.add(1);
		testArray.add(2);
		testArray.add(3);
		testArray.add(4);
		testArray.remove(4);
		IntegerSet value = testArray;
		IntegerSet expected_value = new IntegerSet();
		expected_value.add(1);
		expected_value.add(2);
		expected_value.add(3);
		//test if 4 is removed from the array
		assertTrue(expected_value.equals(value));
	}

	@Test
	@DisplayName("Test cases for union")
	void testUnion() {
		IntegerSet testArray = new IntegerSet();
		testArray.add(1);
		testArray.add(2);
		testArray.add(3);
		IntegerSet testArray2 = new IntegerSet();
		testArray2.add(4);
		testArray2.add(5);
		testArray2.add(6);
		testArray.union(testArray2);
		IntegerSet value = testArray;
		IntegerSet expected_value = new IntegerSet();
		expected_value.add(1);
		expected_value.add(2);
		expected_value.add(3);
		expected_value.add(4);
		expected_value.add(5);
		expected_value.add(6);
		//Test if union of 123 and 456 = 123456
		assertTrue(expected_value.equals(value));
	}

	@Test
	@DisplayName("Test cases for intersect")
	void testIntersect() {
		IntegerSet testArray = new IntegerSet();
		testArray.add(1);
		testArray.add(2);
		testArray.add(3);
		IntegerSet testArray2 = new IntegerSet();
		testArray2.add(2);
		testArray2.add(3);
		testArray.intersect(testArray2);
		IntegerSet value = testArray;
		IntegerSet expected_value = new IntegerSet();
		expected_value.add(2);
		expected_value.add(3);
		//test if intersection of 123 and 23 = 23
		assertTrue(expected_value.equals(value));
	}

	@Test
	@DisplayName("Test cases for diff")
	void testDiff() {
		IntegerSet testArray = new IntegerSet();
		testArray.add(1);
		testArray.add(2);
		testArray.add(3);
		IntegerSet testArray2 = new IntegerSet();
		testArray2.add(2);
		testArray2.add(3);
		testArray.diff(testArray2);
		IntegerSet value = testArray;
		IntegerSet expected_value = new IntegerSet();
		expected_value.add(1);
		//test if difference between 123 and 23 = 1
		assertTrue(expected_value.equals(value));
	}

	@Test
	@DisplayName("Test cases for empty")
	void testIsEmpty() {
		IntegerSet testArray = new IntegerSet();
		boolean value = testArray.isEmpty();
		//test if empty array is empty
		assertEquals(true, value);
		testArray.add(1);
		value = testArray.isEmpty();
		//test if non empty array is not empty
		assertEquals(false, value);
	}

	@Test
	@DisplayName("Test cases for toString")
	void testToString() {
		IntegerSet testArray = new IntegerSet();
		testArray.add(1);
		testArray.add(2);
		testArray.add(3);
		String value = testArray.toString();
		assertEquals("[1, 2, 3]",value);
	}


}

