package A4;

public class Semester {

	
	private Student student;
	private int SemesterNummer;
	private int AnzahlStudenten;
	private Student [] studenten;
	
	
	public Semester(int anzhalStudenten) {
		this.AnzahlStudenten = anzhalStudenten;
	}
	
	public int getAnzahlStudenten(){
		return AnzahlStudenten;
	}
	
	public void addStudentToSemester(Student oStudent){
	 
		Student[] studenten = new Student[40];
		
		for (int i=0; i < 40; i++){
		
				if(studenten[i]== null){
				
					studenten[i] = oStudent;
					AnzahlStudenten ++;
					break;
				}
			}	
		}
	
	public void removeStudentFromSemester(String MNR){
		
		for(int i=0; i < studenten.length; i++){
			
			if ( student != null){
				if(MNR.equals(student.getMNR())){
					student = null;
				}
			}
		}
	}
	
	
	
}
