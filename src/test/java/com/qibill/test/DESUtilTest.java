package com.qibill.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.biosan.utils.DESUtil;

public class DESUtilTest {

	@Test
	public void decoder() {
		String encrypt = DESUtil.encrypt("biosan#17","Bio-San#17");
		System.out.println(encrypt);
		String decrypt = DESUtil.decrypt("x7H9YTCtBPmfCGE9yl8vSg==","Bio-San#17");
		System.out.println(decrypt);
	}

}
