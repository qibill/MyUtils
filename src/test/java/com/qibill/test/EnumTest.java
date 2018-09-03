package com.qibill.test;

import org.junit.Test;

import com.qibill.calculate.OperatorsEnum;

public class EnumTest {

	@Test
	public void valueOf() {
		OperatorsEnum valueOf = OperatorsEnum.valueOf("PLUS");
		System.out.println(valueOf.toString());
	}

}
