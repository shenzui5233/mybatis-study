package work.jimmmy.mybatis.study;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import work.jimmmy.mybatis.study.mapper.EmployeesMapper;
import work.jimmmy.mybatis.study.model.Employee;
import work.jimmmy.mybatis.study.service.EmployeesService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class SpringTest {
    @Autowired
    private EmployeesService service;

    @Test
    public void testSpringXmlContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeesMapper mapper = context.getBean(EmployeesMapper.class);
        PageHelper.startPage(1, 5);
        List<Employee> employees = mapper.queryEmployeeByPage();
        PageInfo<Employee> pageInfo = new PageInfo<>(employees);
        System.out.println(employees);
    }

    @Test
    public void testSpringAnnoContext() {
        System.out.println(service.queryEmployeesByPage(1, 10));
    }
}
