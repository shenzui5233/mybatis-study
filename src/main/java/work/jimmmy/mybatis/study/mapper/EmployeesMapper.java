package work.jimmmy.mybatis.study.mapper;

import work.jimmmy.mybatis.study.model.Employee;

import java.util.List;

public interface EmployeesMapper {
    List<Employee> queryAll();
}
