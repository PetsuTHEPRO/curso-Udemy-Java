
public class Employees {
	
	private int id;
	private String name;
	private double salary;
	
	public Employees(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

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

	public void aumentarSalary(double percentage) {
		this.salary += percentage/100*salary;
	}

	public String toString() {
		return this.id 
				+ ", "
				+ this.name
				+ ", "
				+ this.salary;
	}
}
