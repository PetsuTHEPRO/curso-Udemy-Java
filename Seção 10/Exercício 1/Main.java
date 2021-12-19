import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		University[] universityVector = new University[10];
		
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i+1) + ":");
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			universityVector[room-1] = new University(name, email);
		}
		
		System.out.println("Busy rooms:");
		
		for(int i = 0; i < universityVector.length; i++) {
		
			if(universityVector[i] != null) {
				System.out.println((i+1) + ": " 
						+ universityVector[i].getName()
						+ ", "
						+ universityVector[i].getEmail());
			}
		
		}
		
		sc.close();
	}

}
