package ex07_jdbc;

import java.util.Date;

public class EmployeesDTO {
	private int employee_id;
	private String first_name;
	private Date hire_date;
	private int salary;
	public EmployeesDTO() {}
	public EmployeesDTO(int employee_id, String first_name, Date hire_date, int salary) {
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.hire_date = hire_date;
		this.salary = salary;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public Date getHire_date() {
		return hire_date;
	}
	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employees [employee_id=" + employee_id + ", first_name=" + first_name + ", hire_date=" + hire_date
				+ ", salary=" + salary + "]";
	}
	
}
