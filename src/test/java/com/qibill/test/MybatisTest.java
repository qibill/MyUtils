package com.qibill.test;

import com.biosan.mapper.GroundTbDepartmentCompareMapper;
import com.biosan.mapper.GroundTbDepartmentMapper;
import com.biosan.pojo.GroundTbDepartment;
import com.biosan.pojo.GroundTbDepartmentCompare;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.Date;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-*.xml")
public class MybatisTest {

	@Autowired
	private GroundTbDepartmentCompareMapper groundTbDepartmentCompareMapper;
	@Autowired
	private GroundTbDepartmentMapper groundTbDepartmentMapper;
	
	@Test
	public void GroundTbDepartmentCompareTest() {
		GroundTbDepartmentCompare compare = new GroundTbDepartmentCompare();
		compare.setAdddate(new Date());
		compare.setHoscodeNew("0123");
		compare.setHosnameNew("afads");
		compare.setHoscodeOld("123");
		compare.setHosnameOld("adfaf");
		groundTbDepartmentCompareMapper.insertSelective(compare);
	}
	
	@Test
	public void GroundTbDepartmentTest() {
		GroundTbDepartment department = new GroundTbDepartment();
		department.setDepartmentname("大铁棍子医院");
		department.setState(new BigDecimal(1));
		department.setDepartmentpid(new BigDecimal(6024));
		department.setCode("0199");
		department.setDepartmenttype("hos");
		groundTbDepartmentMapper.insertSelective(department);
	}
}
