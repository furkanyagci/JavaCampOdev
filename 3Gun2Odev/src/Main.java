
public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.id=1;
		student.firstName="Furkan";
		student.lastName="Ya?c?";
		student.nationalyId="12345678910";
		student.coursesId=new int[] {1,2,3};
		
		Instructor instructor = new Instructor();
		instructor.id = 1;
		instructor.firstName = "Engin";
		instructor.lastName = "Demiro?";
		instructor.nationalyId= "01987654321";
		instructor.instructorsCoursesId = new int[] {3,2,1};
		
		/*UserManager user1 = new StudentManager();
		user1.add(student);
		UserManager user2 = new InstructorManager();
		user2.add(instructor);
		*/
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		
		
		
	}

}
