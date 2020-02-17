package tp032;

public class YearGroup {
	
	private StudentAbs[] studentsAbs ;

	public YearGroup(StudentAbs[] studentsAbs) {
		super();
		this.studentsAbs = studentsAbs;
	}

	public StudentAbs[] getStudentsAbs() {
		return studentsAbs;
	}

	public void setStudentsAbs(StudentAbs[] studentsAbs) {
		this.studentsAbs = studentsAbs;
	}
	
	
	public void addGrades(double[] aTest) {
		for(int i = 0 ; i < this.studentsAbs.length;i++) {
			StudentAbs s = this.studentsAbs[i];
			s.getStudent().addGrade(aTest[i]);
		}
	}
	
	public void validation(int thresholdAbs,double thresholdAvg) {
		for(StudentAbs s : this.studentsAbs) {
			System.out.println(s + " validé : "+ s.validation(thresholdAbs, thresholdAvg));
		}	
	}
	
	
	
	

}
