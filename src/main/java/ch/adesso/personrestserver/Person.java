package ch.adesso.personrestserver;

public class Person {

	private int id;
	private String name;
	private String vorname;

	public Person(int id, String name, String vorname) {
		this.id = id;
		this.name = name;
		this.vorname = vorname;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

}
