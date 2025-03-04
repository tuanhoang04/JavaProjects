package PR2.TUT5.EX1;

import PR2.TUT5.EX1.Person;

public class Staff extends Person {
	private String school;
	private double pay;
	
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.address = address;
		this.school = school;
		this.pay = pay;
	}
	
	protected String getSchool() {
		return this.school;
	}
	
	protected void setSchool(String newschool) {
		this.school = newschool;
	}
	
	protected double getPay() {
		return this.pay;
	}
	
	protected void setPay(double newpay) {
		this.pay = newpay;
	}

	//@Override
	public String toString(){
		return "Staff[Person[name="+this.name+",address="+this.address+"],school="+this.school+",pay="+this.pay+"]";
	}
	
	public static void main(String[] args) {
		Staff Tuan = new Staff("Tuan","35 street", "school",15);
		Tuan.setSchool("Trung vuong");
		System.out.println(Tuan.getSchool());
		System.out.println(Tuan);
	}

}
