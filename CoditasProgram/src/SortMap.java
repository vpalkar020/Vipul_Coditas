import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {

	public static void main(String[] args) {
		TreeMap<String,Integer> students=new TreeMap<>();
		students.put("Vipul",24);
		students.put("JV",25);
		students.put("A",23);
		students.put("P",21);
		students.put("R",22);
		sortMapByValue(students);
	}

	private static void sortMapByValue(Map<String, Integer> students) 
	{
		for(Map.Entry<String, Integer> entries:students.entrySet())
		{
			
		}
		
	}

}
