package homework;

public class Main {

	public static void main(String[] args) {
		// 
		Course course1=new Course();
		course1.id=1;
		course1.courseName="C#";
		course1.teacherName="Engin Demiro�";
		course1.unitPrice="�cretsiz";
		
	     Course course2=new Course();
	     course2.id=2;
	     course2.courseName="JAVA";
	     course2.teacherName="ENG�N DEM�RO�";
	     course2.unitPrice="�cretsiz";
	     
	     Course [] courses=  {course1,course2};
	     for (Course course : courses) {
			System.out.println(course.courseName);
		}
	     
		CourseManager courseManage=new CourseManager();
		courseManage.start(course1);
		courseManage.finish(course2);


	}

}
