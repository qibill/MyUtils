package com.qibill.test;

import java.util.Map;

import org.junit.Test;

import com.biosan.pojo.Msms;

public class MsmsTest {

	@Test
	public void creat() {
		Map<String, Double> creatMsms = Msms.creatMsms();
		System.out.println(creatMsms.toString());
	}
}
