package work.jimmmy.mybatis.study.mapper;

import org.apache.ibatis.annotations.Param;
import work.jimmmy.mybatis.study.model.Employee;
import work.jimmmy.mybatis.study.model.EmployeeBo;

import java.util.List;

public interface EmployeesMapper {
    /**
     * 条件查询
     *
     * @param condition 查询条件
     * @param limit 查询最大数量
     * @return List
     */
    List<Employee> queryEmployeeByCond(@Param("employee") Employee condition, @Param("limit") Integer limit);

    /**
     * 通过员工id查询
     *
     * @param ids list
     * @param limit 查询最大数量
     * @return List
     */
    List<Employee> queryEmployeeByIds(@Param("ids") List<Integer> ids, @Param("limit") Integer limit);

    /**
     * 分页查询
     *
     * @return List
     */
    List<Employee> queryEmployeeByPage();

    /**
     * 查询包含薪资信息的雇员数据
     *
     * @param limit limit
     * @return list
     */
    List<EmployeeBo> queryEmployeeWithSalaries(@Param("limit") Integer limit);

    /**
     * 查询包含部门信息的雇员数据
     *
     * @param limit limit
     * @return list
     */
    List<EmployeeBo> queryEmployeeWithDepts(@Param("limit") Integer limit);
}
