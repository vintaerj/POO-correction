package tp32;

public class StudentAbs {
	
	private Student student;
	private int nbAbsences ;
	

	
	public StudentAbs(Student student, int nbAbsences) {
		super();
		this.student = student;
		this.nbAbsences = nbAbsences;
	}

	public Student getStudent() {
		return student;
	}

	public int getNbAbsences() {
		return nbAbsences;
	}


	public void setNbAbsences(int nbAbsences) {
		this.nbAbsences = nbAbsences;
	}
	
	public Boolean warning(int thresholdAbs,double thresholdAvg) {
		return this.nbAbsences >= thresholdAbs && this.getStudent().getAverage() <= thresholdAvg;
	}
	
	public Boolean validation(int thresholdAbs,double thresholdAvg) {
		return this.nbAbsences <= thresholdAbs && this.getStudent().getAverage() >= thresholdAvg;
	}


	@Override
	public String toString() {
		return "StudentAbs [student=" + student + ", nbAbsences=" + nbAbsences + "]";
	}

	public boolean equals(StudentAbs studentAbs) {
		return this.getStudent().equals(studentAbs.getStudent()) && this.nbAbsences == studentAbs.getNbAbsences();
	}


	
	
	

}
