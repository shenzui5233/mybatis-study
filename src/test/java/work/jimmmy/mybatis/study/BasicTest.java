package work.jimmmy.mybatis.study;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import work.jimmmy.mybatis.study.mapper.EmployeesMapper;
import work.jimmmy.mybatis.study.model.Employee;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class BasicTest {
    @Test
    public void test() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        EmployeesMapper mapper = session.getMapper(EmployeesMapper.class);
        Employee employee = new Employee();
        employee.setFirstName("Georgi");
        List<Employee> employees = mapper.queryEmployeeByCond(employee, 100);
        System.out.println(employees);
        session.close();
    }

    @Test
    public void testQueryByIds() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        EmployeesMapper mapper = session.getMapper(EmployeesMapper.class);
        // findByIds
        List<Employee> employees = mapper.queryEmployeeByIds(Arrays.asList(10001, 10002, 10003, 10009), 100);
        System.out.println(employees);
        session.close();
    }

    @Test
    public void testQueryByPage() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        EmployeesMapper mapper = session.getMapper(EmployeesMapper.class);
        // pageNum从1开始
        PageHelper.startPage(1, 100);
        // findByIds
        List<Employee> employees = mapper.queryEmployeeByPage();
        System.out.println(employees);

        PageInfo<Employee> pageInfo = new PageInfo<>(employees);

        System.out.println("当前页：" + pageInfo.getPageNum());
        System.out.println("页大小：" + pageInfo.getPageSize());
        System.out.println("总记录数：" + pageInfo.getTotal());
        System.out.println("总页数：" + pageInfo.getPages());
        System.out.println("上一页：" + pageInfo.getPrePage());
        System.out.println("下一页：" + pageInfo.getNextPage());
        System.out.println("是否是第一页：" + pageInfo.isIsFirstPage());
        System.out.println("是否时最后一页：" + pageInfo.isIsLastPage());

        session.close();
    }
}