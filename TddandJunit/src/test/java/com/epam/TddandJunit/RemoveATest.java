package com.epam.TddandJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveATest {

	/*ToDo List
	 *if 'A' is present at first char of string:"ABCD"=>"BCD"
	 *if 'A' is present at second char of string:"BACD"=>"BCD"
	 *if 'A' is present at n char of string:"BCDAAH"=>"BCDAAH"
	 * if 'A' is present at first two characters of string:"AACD"=>"CD"
	 * if 'A' is present at first two characters of string and nth characters of a string:"AABAA"=>"BAA" 
	 * if string contain single char 'A' i.e:"A"=>""
	 * if string contain single char other than 'A' i.e:"B"=>"B"
	 * if string  is empty:""=>""
	 */
	RemoveA removeA;
	@BeforeEach
	void setup() {
		removeA=new RemoveA();
	}
	@Test
	void test1() {
		assertEquals("BCD",removeA.delete("ABCD"));
	}
	@Test
	void test2() {
		assertEquals("BCD",removeA.delete("BACD"));
	}
	@Test
	void test3() {
		
		assertEquals("BCDAAH", removeA.delete("BCDAAH"));
	}
	@Test
	void test4() {
		assertEquals("CD",removeA.delete("AACD"));
	}
	@Test
	void test5() {
		assertEquals("BAA",removeA.delete("AABAA"));
	}
	@Test
	void test6() {
		assertEquals("",removeA.delete("A"));
		
	}
	@Test
	void test7() {
		assertEquals("", removeA.delete(""));
	}
	@Test
	void test8() {
		assertEquals("B", removeA.delete("B"));
	}

}
