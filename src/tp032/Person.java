package tp032;

public class Person {

	private String id;
	private String name;
	private String forename;
	
	
	public Person(String id, String name, String forename) {
		this.id = id;
		this.name = name;
		this.forename = forename;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getForename() {
		return forename;
	}


	public void setForename(String forename) {
		this.forename = forename;
	}


	public String getId() {
		return id;
	}

	
	public boolean equals(Person person) {
		return this.id == person.id;
	}


	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", forename=" + forename + "]";
	}
	
	
}
