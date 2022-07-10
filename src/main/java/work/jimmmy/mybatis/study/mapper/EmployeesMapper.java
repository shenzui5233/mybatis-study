package work.jimmmy.mybatis.study.mapper;

import org.apache.ibatis.annotations.Param;
import work.jimmmy.mybatis.study.model.Employee;

import java.util.List;

public interface EmployeesMapper {
    List<Employee> queryEmployeeByCond(@Param("employee") Employee condition, @Param("limit") Integer limit);

    List<Employee> queryEmployeeByIds(@Param("ids") List<Integer> ids, @Param("limit") Integer limit);

    List<Employee> queryEmployeeByPage();
}
