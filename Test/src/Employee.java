public class Employee extends Person
{
	String office;
	double salary;
	
	public Employee() {}
	
	public Employee(String office, double salary) {
		super();
		this.office = office;
		this.salary = salary;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Employee [office=" + office + ", salary=" + salary + "]";
	}
}