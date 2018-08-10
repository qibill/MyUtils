package com.qibill.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.biosan.mapper.GroundTbDepartmentCompareMapper;
import com.biosan.mapper.GroundTbDepartmentMapper;
import com.biosan.pojo.GroundTbDepartment;
import com.biosan.pojo.GroundTbDepartmentCompare;
import com.biosan.utils.ExcelUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-*.xml")
public class ExcelTest {

	@Autowired
	private GroundTbDepartmentCompareMapper groundTbDepartmentCompareMapper;
	@Autowired
	private GroundTbDepartmentMapper groundTbDepartmentMapper;
	
	@Test
	public void originalDepartmentTest() {
		String pathname = "D:/git/MyUtils/src/test/resources/xlsx/shengfuyou1.xlsx";

		String[] headName = {"hoscodeOld", "hosnameOld", "hoscodeNew", "hosnameNew"};
		List<Map<String, Object>> list = ExcelUtil.readExcel(pathname, headName, 1);
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
}
