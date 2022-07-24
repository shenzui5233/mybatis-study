package work.jimmmy.mybatis.study.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeBo extends Employee {
    private List<Salary> salaries = new ArrayList<>();

    public List<Salary> getSalaries() {
        return salaries;
    }

    public void setSalaries(List<Salary> salaries) {
        this.salaries = salaries;
    }

    @Override
    public String toString() {
        return "EmployeeBo{" +
                "salaries=" + salaries +
                "} " + super.toString();
    }
}
