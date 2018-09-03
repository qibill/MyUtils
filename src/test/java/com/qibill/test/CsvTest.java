package com.qibill.test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.biosan.pojo.Msmspojo;
import com.qibill.csvreader.CsvWriter;
import com.qibill.utils.ExcelUtil;

public class CsvTest {
	@Test
	public void creatcsv() throws IOException {
		String pathname = "D:\\git\\MyUtils\\src\\test\\resources\\xlsx\\csv2.xlsx";

//		List<Map<String, Object>> list = ExcelUtil.readExcel(pathname);
		String filePath = "D:\\1.csv";
		CsvWriter csvWriter = new CsvWriter(filePath, '\t', Charset.forName("utf-8"));
		csvWriter.setForceQualifier(false);

		String[] headName = ExcelUtil.getHeadName(pathname);
		for (int i = 0; i < headName.length; i++) {
			headName[i] = headName[i] == null ? "" : "\"" + headName[i] + "\"";
		}
		csvWriter.writeRecord(headName);
		List<Msmspojo> test = ExpressionTest.test();
		
		long sampleid = 20180526023L;
		for (Msmspojo stringObjectMap : test) {
			String[] strs = new String[headName.length];
			for (int i = 0; i < headName.length; i++) {
				if (stringObjectMap.getMap().containsKey(headName[i].replaceAll("\"", ""))) {
					strs[i] = "\"" + String.valueOf(stringObjectMap.getMap().get(headName[i].replaceAll("\"", ""))) + "\"";
				}else {
					strs[i] = "";
				}
			}
			sampleid += 1;
			strs[0] = "\"" + String.valueOf(sampleid) + "\"";
			
			csvWriter.writeRecord((String[]) strs);
		}
		csvWriter.close();
	}
}
