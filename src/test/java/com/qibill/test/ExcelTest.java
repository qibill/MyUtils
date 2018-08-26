package com.qibill.test;

import com.biosan.mapper.GroundTbDepartmentCompareMapper;
import com.biosan.mapper.GroundTbDepartmentMapper;
import com.biosan.pojo.GroundTbDepartment;
import com.biosan.pojo.GroundTbDepartmentCompare;
import com.csvreader.CsvWriter;
import com.qibill.utils.ExcelUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:spring/applicationContext-*.xml")
public class ExcelTest {

	@Autowired
	private GroundTbDepartmentCompareMapper groundTbDepartmentCompareMapper;
	@Autowired
	private GroundTbDepartmentMapper groundTbDepartmentMapper;
	
	@Test
	public void originalDepartmentTest() {
		String pathname = "G:\\IdeaProjects\\MyUtils\\src\\test\\resources\\xlsx\\shengfuyou1.xlsx";

		String[] headName = {"hoscodeOld", "hosnameOld", "hoscodeNew", "hosnameNew"};
		List<Map<String, Object>> list = ExcelUtil.readExcel(pathname, headName, 1,0);
		List<GroundTbDepartmentCompare> list2 = new ArrayList<>();
		for (Map<String, Object> map : list) {
			GroundTbDepartmentCompare compare = new GroundTbDepartmentCompare();
			compare.setHosnameOld((String) map.get("hosnameOld"));
			compare.setHoscodeOld(((String) map.get("hoscodeOld")));
			compare.setHosnameNew((String) map.get("hosnameNew"));
			compare.setHoscodeNew( ((String) map.get("hoscodeNew")));
			compare.setAdddate(new Date());
			list2.add(compare);
		}
		
		for (GroundTbDepartmentCompare groundTbDepartmentCompare : list2) {
//			groundTbDepartmentCompareMapper.insertSelective(groundTbDepartmentCompare);
			System.out.println("insert into GROUND_TB_DEPARTMENT_COMPARE "
					+ "(id, hoscode_old, hosname_old, hoscode_new, hosname_new, adddate)"
					+ "values (GROUND_SEQ_DEPARTMENT_COMPARE.nextval, '" + groundTbDepartmentCompare.getHoscodeOld()
					+ "', '" + groundTbDepartmentCompare.getHosnameOld() 
					+ "', '" + groundTbDepartmentCompare.getHoscodeNew()
					+ "', '" + groundTbDepartmentCompare.getHosnameNew()
					+ "+', to_date('13-07-2018', 'dd-mm-yyyy'));");
		}
	}
	
	@Test
	public void newDepartmentTest() {
		String pathname = "D:/git/MyUtils/src/test/resources/xlsx/liuyang2.xlsx";

		String[] headName = {"hoscodeOld", "hosnameOld", "hoscodeNew", "hosnameNew"};
		List<Map<String, Object>> list = ExcelUtil.readExcel(pathname, headName, 1);
		List<GroundTbDepartmentCompare> list2 = new ArrayList<>();
		List<GroundTbDepartment> list3 = new ArrayList<>();
		for (Map<String, Object> map : list) {
			GroundTbDepartmentCompare compare = new GroundTbDepartmentCompare();
			compare.setHosnameOld((String) map.get("hosnameOld"));
			compare.setHoscodeOld(((String) map.get("hoscodeOld")));
			compare.setHosnameNew((String) map.get("hosnameNew"));
			compare.setHoscodeNew(((String) map.get("hoscodeNew")));
			compare.setAdddate(new Date());
			list2.add(compare);
			
			GroundTbDepartment department = new GroundTbDepartment();
			department.setDepartmentname((String) map.get("hosnameNew"));
			department.setCode((String) map.get("hoscodeNew"));
			department.setState(new BigDecimal(1));
			department.setDepartmentpid(new BigDecimal(1));
			department.setDepartmenttype("hos");
			list3.add(department);
		}
	
/*		for (GroundTbDepartmentCompare groundTbDepartmentCompare : list2) {
			groundTbDepartmentCompareMapper.insertSelective(groundTbDepartmentCompare);
		}*/
		
		for (GroundTbDepartment groundTbDepartment : list3) {
//			groundTbDepartmentMapper.insertSelective(groundTbDepartment);
			System.out.println("insert into GROUND_TB_DEPARTMENT "
					+ "(DEPARTMENTID, AREAID, departmentname, code, state, departmentpid, departmenttype)"
					+ "values (GROUND_SEQ_DEPARTMENT.nextval, "
					+ "(select AREAID from GROUND_TB_AREA where code =substr('" 
					+ groundTbDepartment.getCode() + "', 0, 2)),'"
					+ groundTbDepartment.getDepartmentname()
					+ "', '" + groundTbDepartment.getCode()
					+ "', 1, 1, 'hos');");
		}
	}

	@Test
	public void creatcsv() throws IOException {
		String pathname = "G:\\IdeaProjects\\MyUtils\\src\\test\\resources\\xlsx\\csv.xlsx";

		List<Map<String, Object>> list = ExcelUtil.readExcel(pathname);
		String filePath = "D:\\1.csv";
		CsvWriter csvWriter = new CsvWriter(filePath,'\t', Charset.forName("utf-8"));
		for (Map<String, Object> stringObjectMap : list) {
			Object[] content = stringObjectMap.values().toArray();
			String[] strs = new String[content.length];
			if (content.length == 0) {
				csvWriter.writeRecord(new String[]{});
				continue;
			}
			for (int i = 0; i < content.length; i++) {
				strs[i] = content[i]==null ? "": '"' + content[i].toString();
				System.out.print (strs[i] + "   ");
			}
			csvWriter.writeRecord((String[]) strs);
			/*for (String s : stringObjectMap.keySet()) {
				System.out.println(s + "=====" + stringObjectMap.get(s));
			}*/
		}
		csvWriter.close();
	}
}
