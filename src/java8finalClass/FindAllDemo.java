package java8finalClass;

import java.util.List;
import java.util.Optional;
//if not found found it returns ***OPtional Empty***
public class FindAllDemo {
	public static void main(String[] args) {
		List<Person> list = List.of(
				new Person(1, "Ajay", "sw", 27, 5000.50),
				new Person(2, "Vijay", "qa", 28, 6000.00),
				new Person(3, "Lalit", "ps", 29, 7000),
				new Person(4, "Mandeep", "test", 30, 4000));
		
		System.out.println("******Findfirst in********");
		Optional<Person> findAny = list.stream().filter(x->x.getAge()==27).findAny();
		System.out.println(findAny);
		
		System.out.println("******FindfindFirst in********");
		Optional<Person> findFirst = list.stream().filter(per->per.getDept().equalsIgnoreCase("SW")).findFirst();
		System.out.println(findFirst);
	}
}
