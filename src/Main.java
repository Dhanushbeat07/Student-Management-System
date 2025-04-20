import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student> Students = new ArrayList();
		
		while(true) {
			System.out.println("Student Management System ");
			System.out.println("1. Add Student");
			System.out.println("2. Remove Student");
			System.out.println("3. View Student");
			System.out.println("4. Exit");
			System.out.println("Please do select your choice : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1 :
				System.out.println("Enter Id : ");
				int id = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter student name : ");
				String name = sc.nextLine();
				System.out.println("Enter course : ");
				String course = sc.nextLine();
				
				Students.add(new Student(id,name,course));
				System.out.println("Student added Successfully");
				break;
				
			case 2:
				System.out.println("Enter student Id to remove : ");
				int removeId = sc.nextInt();
				boolean removed = false; //this is flag out the student removed or not initially will keep it at false, because we assume no student is removed yet.
				
				for(Student s : Students) {
					if(s.id == removeId) {
						Students.remove(s);
						System.out.println("Student removed successfully");
						removed = true;
						break;
					}
				}
				if(!removed) {
					System.out.println("Student id "+ removeId + "not found");
				}
				break;
				
						
			case 3 :
				System.out.println("View student details");
				
				  for(Student s : Students) {
					s.displayinfo();
						
					}
				break;
				
			case 4 :
				System.out.println("Exit, Thank you");
				System.exit(0);
				break;
				
				default:
					System.out.println("invalid choice, please try again");
				
				}
				
				
				
				
			}
			
			
			
		}
		
	

}

