package com.jamf.now.interview.arithmetic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArithmeticApplicationTests {

	@Test
	void testAddition_Zero() throws Exception {
		Assertions.assertEquals(0D, new ArithmeticOperationFactory().create("+").apply(-10, 10));
	}

	@Test
	void testAddition_Positive() throws Exception {
		Assertions.assertEquals(20D, new ArithmeticOperationFactory().create("+").apply(10, 10));
	}

	@Test
	void testAddition_Negative() throws Exception {
		Assertions.assertEquals(-20D, new ArithmeticOperationFactory().create("+").apply(-10, -10));
	}

	@Test
	void testSubtraction_Zero() throws Exception {
		Assertions.assertEquals(0D, new ArithmeticOperationFactory().create("-").apply(10, 10));
	}

	@Test
	void testSubtraction_Positive() throws Exception {
		Assertions.assertEquals(5D, new ArithmeticOperationFactory().create("-").apply(10, 5));
	}

	@Test
	void testSubtraction_Negative() throws Exception {
		Assertions.assertEquals(-5D, new ArithmeticOperationFactory().create("-").apply(5, 10));
	}

	@Test
	void testMultiplication_Zero() throws Exception {
		Assertions.assertEquals(0D, new ArithmeticOperationFactory().create("*").apply(10, 0));
	}

	@Test
	void testMultiplication_Positive() throws Exception {
		Assertions.assertEquals(100D, new ArithmeticOperationFactory().create("*").apply(10, 10));
	}

	@Test
	void testMultiplication_Negative() throws Exception {
		Assertions.assertEquals(-100D, new ArithmeticOperationFactory().create("*").apply(10, -10));
	}

	@Test
	void testUnknownOperation() throws Exception {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new ArithmeticOperationFactory().create("&").apply(10, 10));
	}

}
