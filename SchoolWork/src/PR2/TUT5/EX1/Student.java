package PR2.TUT5.EX1;

public class Student extends PR2.TUT5.EX1.Person {
	private String program;
	private int year;
	private double fee;
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.name = name;
		this.address = address;
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	protected String getProgram() {
		return this.program;
	}
	protected void setProgram(String newprogram) {
		this.program = newprogram;
	}
	protected int getYear() {
		return this.year;
	}
	protected void setYear(int newyear) {
		this.year = newyear;
	}
	protected double getFee() {
		return this.fee;
	}
	protected void setFee(double newfee) {
		this.fee = newfee;
	}
	//@Override
	public String toString() {
		return "Student[Person[name="+ this.name+",address="+this.address+"],program="+ this.program+",year="+this.year+",fee="+this.fee+"]";
	}
	
	public static void main(String[] args) {
		Student Tuan = new Student("Tuan","35 street", "Math",2020,200);
		Tuan.setProgram("English");
		System.out.println(Tuan.getFee());
		System.out.println(Tuan.toString());
	}
	
}
