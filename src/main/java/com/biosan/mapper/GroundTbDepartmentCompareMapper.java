package com.biosan.mapper;

import com.biosan.pojo.GroundTbDepartmentCompare;
import com.biosan.pojo.GroundTbDepartmentCompareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroundTbDepartmentCompareMapper {
    int countByExample(GroundTbDepartmentCompareExample example);

    int deleteByExample(GroundTbDepartmentCompareExample example);

    int insert(GroundTbDepartmentCompare record);

    int insertSelective(GroundTbDepartmentCompare record);

    List<GroundTbDepartmentCompare> selectByExample(GroundTbDepartmentCompareExample example);

    int updateByExampleSelective(@Param("record") GroundTbDepartmentCompare record, @Param("example") GroundTbDepartmentCompareExample example);

    int updateByExample(@Param("record") GroundTbDepartmentCompare record, @Param("example") GroundTbDepartmentCompareExample example);
}