package Java8_shortCut;

public class User_Prep {
	
	private int id;
	private String name;
	private double salary;
	private Number managerId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Number getManagerId() {
		return managerId;
	}
	public void setManagerId(Number managerId) {
		this.managerId = managerId;
	}
	public User_Prep(int id, String name, double salary, Number managerId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.managerId = managerId;
	}
	@Override
	public String toString() {
		return "User_Prep [id=" + id + ", name=" + name + ", salary=" + salary + ", managerId=" + managerId + "]";
	}
	
	
}
