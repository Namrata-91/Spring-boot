package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class MathOperationTest {

	private MathOperation mathOperation;
	
	@BeforeAll
	static void beforeAllInt() {
		System.out.println("This need to run before all");
	}

	@AfterEach
	void cleanUp() {
		System.out.println("Cleaning up code....");
	}

	@BeforeEach
	void initEach() {
		mathOperation = new MathOperation();
	}

	@Test
	void addTwoPossitives() {
		assertEquals(2, mathOperation.add(1, 1), "Add Method should return sum of two number");
	}

	@Test
	void addTwoNegatives() {
		assertEquals(2, mathOperation.sub(4, 2));
	}

	@Test
	void multiplyTwoNumber() {
		assertAll(() -> assertEquals(8, mathOperation.multiply(4, 2)),
				() -> assertEquals(4, mathOperation.multiply(2, 2)));
	}

	@Test
	void circleArea() {
		assertEquals(314.1592653589793, mathOperation.circleArea(10));
	}

	//@RepeatedTest(2)
	void divide() {
		assertThrows(ArithmeticException.class, () -> mathOperation.divide(1, 0));
	}
}
