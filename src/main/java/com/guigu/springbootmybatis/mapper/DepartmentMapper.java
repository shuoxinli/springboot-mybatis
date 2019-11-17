package com.guigu.springbootmybatis.mapper;

import com.guigu.springbootmybatis.bean.Department;
import org.apache.ibatis.annotations.*;

//@Mapper //指定这是一个操作数据库的mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delect from department where id=#{id}")
    public int delectDeptById(Integer id);

    //设置id主键返回，插入原来对象
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
