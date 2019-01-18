package com.atguigu.springboot.mapper;

import com.atguigu.springboot.bean.Employee;

/**
 * @author zhangge
 * @date 2019/1/18 - 23:05
 */
//@Mapper或者@MapperScan将接口扫描装配到容器在中
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
