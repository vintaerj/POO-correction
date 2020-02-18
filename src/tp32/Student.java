package tp32;

import java.util.Arrays;

public class Student {
	
	private Person person;
	private double[] grades;
	
	public Student(Person person, double[] grades) {
		super();
		this.person = person;
		this.grades = grades;
	}
	
	public Student(String id,String name, String forename, double[] grades) {
		super();
		this.person = new Person(id,name,forename);
		this.grades = grades;
	}

	public String getName() {
		return person.getName();
	}

	public void setName(String name) {
		person.setName(name);
	}

	public String getForename() {
		return person.getForename();
	}

	public void setForename(String forename) {
		person.setForename(forename);
	}

	public String getId() {
		return person.getId();
	}
	
	

	public Person getPerson() {
		return person;
	}

	public double[] getGrades() {
		return grades;
	}

	@Override
	public String toString() {
		return "Student [person=" + person + ", grades=" + Arrays.toString(grades) + "]";
	}

	
	public boolean equals(Student s) {
		return this.person.equals(s.getPerson()) && this.grades.equals(s.getGrades());
	}
	
	public double getAverage() {
		
		double m = 0.0;
		for(Double n : this.grades) {
			m += n;
		}
		return m/this.grades.length;
		
	}
	
	public void addGrade(double aGrade) {
		double[] newgrades = new double[this.grades.length+1];
		for(int i = 0 ; i < this.grades.length; i++) {
			double g = this.grades[i];
			newgrades[i] = g;
		}
		newgrades[this.grades.length+1] = aGrade;
		this.grades = newgrades;	
	}
	
	
	
	
	
	
	

	
}
