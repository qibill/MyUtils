package com.biosan.mapper;

import com.biosan.pojo.GroundTbDepartment;
import com.biosan.pojo.GroundTbDepartmentExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroundTbDepartmentMapper {
    int countByExample(GroundTbDepartmentExample example);

    int deleteByExample(GroundTbDepartmentExample example);

    int deleteByPrimaryKey(BigDecimal departmentid);

    int insert(GroundTbDepartment record);

    int insertSelective(GroundTbDepartment record);

    List<GroundTbDepartment> selectByExample(GroundTbDepartmentExample example);

    GroundTbDepartment selectByPrimaryKey(BigDecimal departmentid);

    int updateByExampleSelective(@Param("record") GroundTbDepartment record, @Param("example") GroundTbDepartmentExample example);

    int updateByExample(@Param("record") GroundTbDepartment record, @Param("example") GroundTbDepartmentExample example);

    int updateByPrimaryKeySelective(GroundTbDepartment record);

    int updateByPrimaryKey(GroundTbDepartment record);
}