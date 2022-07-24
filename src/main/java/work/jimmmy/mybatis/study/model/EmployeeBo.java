package work.jimmmy.mybatis.study.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeBo extends Employee {
    private List<Salary> salaries = new ArrayList<>();

    private List<String> deptNames;

    public List<Salary> getSalaries() {
        return salaries;
    }

    public void setSalaries(List<Salary> salaries) {
        this.salaries = salaries;
    }

    public List<String> getDeptNames() {
        return deptNames;
    }

    public void setDeptNames(List<String> deptName) {
        this.deptNames = deptName;
    }

    @Override
    public String toString() {
        return "EmployeeBo{" +
                "salaries=" + salaries +
                ", deptName=" + deptNames +
                "} " + super.toString();
    }
}
