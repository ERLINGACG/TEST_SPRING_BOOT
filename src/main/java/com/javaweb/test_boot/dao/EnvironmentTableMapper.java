package com.javaweb.test_boot.dao;
import com.javaweb.test_boot.pojo.EnvironmentTable;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EnvironmentTableMapper {  // 接口

    @Select("SELECT * FROM 环境检测")
    List<EnvironmentTable> selectAll();

    @Select("SELECT * FROM 环境检测 WHERE id = #{id}")
    EnvironmentTable selectById(int id);      // 根据id查询

}

