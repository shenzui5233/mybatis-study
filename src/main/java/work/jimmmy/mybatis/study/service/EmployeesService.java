package work.jimmmy.mybatis.study.service;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.jimmmy.mybatis.study.mapper.EmployeesMapper;
import work.jimmmy.mybatis.study.model.Employee;

import java.util.Collections;
import java.util.List;

@Service
public class EmployeesService {
    @Autowired
    private EmployeesMapper mapper;

    public List<Employee> queryEmployeesByPage(int pageNum, int pageSize) {
        if (pageNum <= 0 || pageSize <= 0) {
            return Collections.emptyList();
        }
        PageHelper.startPage(pageNum, pageSize);
        return mapper.queryEmployeeByPage();
    }
}
