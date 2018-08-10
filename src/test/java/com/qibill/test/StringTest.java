package com.qibill.test;

import org.junit.Test;

public class StringTest {

	@Test
	public void UpperCase() {
		System.out.println("Insufficient feeding".toUpperCase());
	}
	
	@Test
	public void toLowerCase() {
		System.out.println("PPROM".toLowerCase());
	}
	
	@Test
	public void split() {
		System.out.println("0509|长沙市妇幼保健医院".split("\\|")[1]);
	}
	
	
	@Test
	public void length() {
		System.out.println("999999999999999999".length());
	}
	
	
}
