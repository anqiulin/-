package com.vvs.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vvs.pojo.ExpressionImpl;
import com.vvs.pojo.RandomNumber;

class TestExpressionTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testMain1() {
		char arr[] = {'+','-','*','/'};
		RandomNumber randomNumber = new RandomNumber(arr, 20);
		ExpressionImpl bTree;
		for(int i = 0; i < 8; i++){
			bTree = new ExpressionImpl(2, true, true);
			bTree.createDoubleBTree(randomNumber);
			System.out.println(bTree.toString()+"="+bTree.CalAndVal(randomNumber));
		}
	}
	@Test
	void testMain2() {
		char arr[] = {'+','-','*','/'};
		RandomNumber randomNumber = new RandomNumber(arr, 20);
		ExpressionImpl bTree;
		for(int i = 0; i < 8; i++){
			bTree = new ExpressionImpl(2, false, true);
			bTree.createBTree(randomNumber);
			System.out.println(bTree.toString()+"="+bTree.CalAndVal(randomNumber));
		}
	}
	@Test
	void testMain3() {
		char arr[] = {'+','-','*','/'};
		RandomNumber randomNumber = new RandomNumber(arr, 20);
		ExpressionImpl bTree;
		for(int i = 0; i < 8; i++){
			bTree = new ExpressionImpl(2, true, false);
			bTree.createDoubleBTree(randomNumber);
			System.out.println(bTree.toString()+"="+bTree.CalAndVal(randomNumber));
		}
	}
	@Test
	void testMain4() {
		char arr[] = {'+','-','*','/'};
		RandomNumber randomNumber = new RandomNumber(arr, 20);
		ExpressionImpl bTree;
		for(int i = 0; i < 8; i++){
			bTree = new ExpressionImpl(2, false, false);
			bTree.createBTree(randomNumber);
			System.out.println(bTree.toString()+"="+bTree.CalAndVal(randomNumber));
		}
	}

}
