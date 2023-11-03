package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		Main main = new Main();
		int result = main.add(1, 1);
		assertEquals(2, result);
	}
	@Test
	void test2(){
		Main main = new Main();
		int res = main.add(2, 3);
		assertEquals(5, res);
	}

}
