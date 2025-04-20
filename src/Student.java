
public class Student {

	int id;
	String name;
	String course;
	
	public Student(int id, String name, String course) {
		this.id = id;
		this.name = name;
		this.course = course;
		
	}
	
	public void displayinfo() {
		System.out.println("Id : " + id + "name : " + name + "course : "+ course);
	}
	
}
