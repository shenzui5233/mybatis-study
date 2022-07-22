package work.jimmmy.mybatis.study.model;

import java.util.Date;

public class Salary {
    // emp_no
    private Integer employeeNumber;

    // salary
    private Integer salary;

    // from_date
    private Date fromDate;

    // to_date
    private Date toDate;

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "employeeNumber=" + employeeNumber +
                ", salary=" + salary +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                '}';
    }
}
