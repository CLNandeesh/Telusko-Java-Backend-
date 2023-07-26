
class School {
	public static String schoolName = "St Joseph";
	int sub1, sub2, sub3, totalMarks;
	float percentage;
	String sName;
	char grade;

	

	static {
		System.out.println("School name is " + schoolName);
	}

	public School(String sName, int sub1, int sub2, int sub3) {
		this.sName = sName;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}

	void computeGrade() {
		totalMarks = sub1 + sub2 + sub3;
		percentage = totalMarks / 3;

		if (percentage >= 35 && percentage < 60) {
			System.out.println(sName + " is C Grade");
		} else if (percentage >= 60 && percentage < 90) {
			System.out.println(sName + " is B Grade");
		} else if (percentage >= 90 && percentage <= 100) {
			System.out.println(sName + " is A Grade");
		} else {
			System.out.println(sName + " is FAIL");
		}

	}
}


public class StaticApplicationSchoolManagement {

	public static void main(String[] args) {

		School s1 = new School("Appu", 44, 36, 77);
		

		School s2 = new School("Shivu", 84, 96, 97);
		s1.computeGrade();
		s2.computeGrade();
	

	}

}
