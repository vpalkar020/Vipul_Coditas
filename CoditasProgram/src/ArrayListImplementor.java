import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ArrayListImplementor {
	
	private static List<Student> students=new ArrayList<Student>();
	public static void main(String[] args) 
	{
		Student temp=null;
		addStudent();
		System.out.println("before update");
		printList();
		
		updateStudentName(101,"Vipul");
		System.out.println("after update");
		printList();
		
//		sortListByname();
//		System.out.println("after sort");		
//		printList();
		
		sortListByRollNo();
		System.out.println("after sort");		
		printList();
//		if((deleteStudent(101))) System.out.println("students deleted of provided rollNumber");
//		else System.out.println("No such student");
//		if((temp=findStudent(101))!=null)
//			{
//			System.out.println("students details of provided rollNumber");
//			System.out.println(temp);
//			}
//		else
//		{
//			System.out.println("No such student");
//		}
	}
	
	
	public static boolean addStudent()
	{
		try 
		{
		Scanner input=new Scanner(System.in);
		System.out.println("How many students you want to enter");
		int limit=input.nextInt();
		for(int i=0;i<limit;i++)
		{
		System.out.println("Enter rollNo");
		int rollNo=input.nextInt();
		System.out.println("Enter name");
		String name=input.next();
		students.add(new Student(rollNo,name));
		}
		return true;
		}catch (InputMismatchException e) {
			System.out.println("Enter again");
		}
		return false;
	}
	public static boolean deleteStudent(int rollNo)
	{
		boolean[] isDeleted=new boolean[] {false};
		students.forEach((student) -> {
			if(student.getRollNo()==rollNo) {students.remove(student);isDeleted[0]=true;}
		});
		return isDeleted[0];
	}
	public static boolean updateStudentName(int rollNo,String name)
	{
		boolean isUpdated=false;;
		for(int i=0;i<students.size();i++)
		{
			if(students.get(i).getRollNo()==rollNo)
			{
				students.get(i).setName(name);
				isUpdated=true;
			}
		}
		return isUpdated;
	}
	private static Student findStudent(int rollNo) 
	{	
		final Student[] temp=new Student[]{new Student()};
		students.forEach((student)->{
			if(student.getRollNo()==rollNo) temp[0]=student;
		});
		return temp[0];
	}

	private static void sortListByRollNo() {
		Collections.sort(students,(
		(student1,student2) -> { return student1.getRollNo()-student1.getRollNo();}));
	}
	
	private static void sortListByname() {
		Collections.sort(students,new Comparator<Student>() {

			@Override
			public int compare(Student student1, Student student2) {
				return student1.getName().compareTo(student2.getName());
			}
		});
	}
	
	private static void printList() 
	{
		students.forEach((student) -> {
			System.out.println(student);
		});
	}
}