import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaMain {

	public static void main(String[] args) {
		Employee vipul=new Employee("S",101);
		Employee j=new Employee("JV",101);
		Employee a=new Employee("A",101);
		Employee p=new Employee("P",101);
		Employee r=new Employee("R",101);
		List<Employee> list=new ArrayList<>();
		list.add(vipul);
		list.add(j);
		list.add(a);
		list.add(p);
		list.add(r);
//		Collections.sort(list,new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee employee1, Employee employee2) {
//				return employee1.getName().compareTo(employee2.getName());
//			}
//		});
		Collections.sort(list,(Employee e1,Employee e2) -> e1.getName().compareTo(e2.getName()));
		for(Employee e:list)
		System.out.println(e.getName());
	}

}
