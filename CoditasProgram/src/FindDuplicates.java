import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(2);
		numbers.add(7);
		numbers.add(8);
		numbers.add(8);
		numbers.add(3);
		boolean isDuplicate=false;
		for(int i=0;i<numbers.size();i++)
		{
			for(int j=i+1;j<numbers.size();j++)
			{
				if(numbers.get(i)==numbers.get(j))
				{
					isDuplicate=true;
					System.out.println(numbers.get(j));
					numbers.remove(j--);
				}
			}
		}
		if(!isDuplicate) System.out.println("No any duplicate number");
	}

}
