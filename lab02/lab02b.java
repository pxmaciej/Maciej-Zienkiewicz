import java.util.ArrayList;
import java.util.Random;



class Parameters{
	public String[] names= new String[] {"Krzysziek","Alan,Kamil","Maciej","Grzesiek","Paweł","Sebastian","Robert","Elrzebieta"};
	public String surnames[]= new String[] {"Rogowski", "Wiśniewski", "Milczek", "Mruczek", "Warkoc", "Lubiszewski", "Wroniec", "Kałabała", "Pierwszy", "Witek"};
	public boolean exist;

}
class Student {
	Parameters p = new Parameters();
	public String studentNo;
	public String studentNames;
	public String studentSurnames;
	public boolean studentExist;
	public String om;

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
		
	public String getStudentNo() {
		return this.studentNo;
	}
	public void setStudentNames(int random){
		this.studentNames=p.names[random];
	}
	public String getStudnetNames(){
		return this.studentNames;
	}
	public void setStudentSurnames(int random){
		this.studentSurnames=p.surnames[random];
	}
	public String getStudentSurnames(){
		return this.studentSurnames;
	}
	public void setStudnetExist(boolean random){
		this.studentExist=p.exist=random;
	}
	public boolean getStudentExist(){
		return this.studentExist;
	}
}

public class lab02b {

	static int students_count = 10;

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		Random r = new Random(); 
		for(int i = 0; i < students_count; i++) {
			Student student = new Student();
			student.setStudentNo(getRandomStudentNumber());
			student.setStudentNames(r.nextInt(8));
			student.setStudentSurnames(r.nextInt(9));
			student.setStudnetExist(r.nextBoolean());
			students.add(student);
		}
		
		System.out.println("Students group have been filled.");
		
		for(int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			if(student.getStudentExist()==true)
			System.out.println(student.getStudentNo()+" "+student.getStudnetNames()+" "+student.getStudentSurnames()+" "+student.getStudentExist());
		}
	}

	protected static String getRandomStudentNumber() {
		Random rand = new Random();
		return String.valueOf(rand.nextInt(2000) + 38000);
	}

}
