package PR2.TUT5.EX1;

public class Person {
	String name;
	String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName(Person person) {
		return person.name;
	}
	public String getAddress(Person person) {
		return person.address;
	}
	public void setAddress(String newaddress) {
		this.address = newaddress;
	}
	//@Override
	public String toString() {
		return "Person[name="+ this.name + ",address="+this.address+"]";
	}
}
