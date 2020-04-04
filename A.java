package hello2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class A {

	@Test
	void test1() {
		int n=-2;
		int [] arr= {1,2,3};
		assertEquals(0,hello.F(n, arr));
	}
	@Test
	void test2() {
		int n=5;
		int [] arr= {0,1,2,3,4,5};
		assertEquals(15,hello.F(n, arr));
	}
	@Test
	void test3() {
		int n=5;
		int [] arr= {0,-1,-2,-3,-4,-5};
		assertEquals(0,hello.F(n, arr));
	}
	@Test
	void test4() {
		int n=6;
		int [] arr= {0,1,5,-8,9,-2,3};
		assertEquals(10,hello.F(n, arr));
	}
}
