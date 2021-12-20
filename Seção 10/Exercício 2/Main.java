import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		List<Employees> list = new ArrayList<Employees>();
		Employees employees = null;

		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {

			System.out.println("Employee #" + (i+1) + ":");

			System.out.print("ID: ");
			int ID = sc.nextInt();

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			employees = new Employees(ID, name, salary);
			list.add(employees);

		}

		System.out.println("Enter the employee id that will have salary increase: ");
		int op = sc.nextInt();
		employees = list.stream().filter(x -> x.getId() == op).findFirst().orElse(null);
		if(employees != null) {

			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();

			employees.aumentarSalary(percentage);


		}else {
			System.out.println("This id does not exist!");

		}

		System.out.println("List of employees: ");
		for(Employees l : list) {
			System.out.println(l);
		}

		sc.close();
	}

}