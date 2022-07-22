package work.jimmmy.mybatis.study.mapper;

import org.apache.ibatis.annotations.Param;
import work.jimmmy.mybatis.study.model.Salary;
import work.jimmmy.mybatis.study.model.SalaryBo;

import java.util.List;

public interface SalariesMapper {
    List<Salary> queryAll(@Param("limit") Integer limit);
}
