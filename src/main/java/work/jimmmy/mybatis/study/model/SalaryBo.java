package work.jimmmy.mybatis.study.model;

public class SalaryBo extends Salary {
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "SalaryBo{" +
                "employee=" + employee +
                '}';
    }
}
