package work.jimmmy.mybatis.study;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import work.jimmmy.mybatis.study.mapper.EmployeesMapper;
import work.jimmmy.mybatis.study.model.Employee;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class BasicTest {
    @Test
    public void test() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        EmployeesMapper mapper = session.getMapper(EmployeesMapper.class);
        List<Employee> employees = mapper.queryAll();
        System.out.println(employees);
    }
}