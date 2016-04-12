package A4;

public class Hochschule {

	public static void main(String[] args) {
		
		Semester s1 = new Semester(0);
		Student [] studenten = new Student [40];
		
		
		Student stu1 = new Student(20, 'M', "WI");
		Student stu2 = new Student(21, 'W', "MKI");
		Student stu3 = new Student(22, 'M', "METI");
		
		stu1.setName("Osman");
		stu2.setName("Lisa");
		stu3.setName("Salih");
		
		
		s1.addStudentToSemester(stu1);
		s1.addStudentToSemester(stu2);
		s1.addStudentToSemester(stu3);
		
		s1.getAnzahlStudenten();
		
		
		
	}

}
