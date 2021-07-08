public class Student {
	private Integer rollNo;
	private String name;
	public Student(int rollNo, String name) 
	{
		this.rollNo=rollNo;
		this.name=name;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
}
