package Java8_shortCut;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrepTest {
	
	
	static List<User_Prep> l1=new ArrayList<>();
	
	public static void main(String[] args) {
			l1.add(new User_Prep(1, "Tom", 200000, 2));
			l1.add(new User_Prep(2, "John", 300000, 4));
			l1.add(new User_Prep(3, "Sauhn", 250000, 2));
			l1.add(new User_Prep(4, "Rober", 500000, null));
			
		
		//1. Total Expenses of company for employee salary
		method1();
		System.out.println("\n");
		//2 Employee having second highest salary
		method2();
		System.out.println("\n");
		//3 Print Manager Name for given employee name
		method3();
		System.out.println("\n");
		//4 Sort employee name based on Salary in ascending order
		method4();
		System.out.println("\n");
		
		//Sort employee name based on alphabetical order in descending order.
		method5();
		System.out.println("\n");
		
		//sort the list from second highest salary
		method6();
		System.out.println("\n");
	}

	private static void method6() {
		 Stream<User_Prep> s1 = l1.stream()
		.collect(Collectors
		.toMap(User_Prep::getSalary,Function.identity(),(a, b) -> a,()->new TreeMap<>(Comparator
		.comparing(Double::doubleValue).reversed())))
		.values()
		.stream();
		 s1.forEach(x->System.out.println(x));
//		.skip(1)
//		.findFirst()
//		.orElse(null);
		
		//System.out.println(user_Prep);
	}

	private static void method5() {
		List<User_Prep> collect = l1.
				stream()
				.sorted(Comparator.comparing(User_Prep::getName).reversed())
				.collect(Collectors.toList());
		collect.forEach(System.out::println);	
	}
	
	private static void method4() {
	List<User_Prep> collect = l1.stream()
	  .sorted(Comparator.comparingDouble(User_Prep::getSalary).reversed())
	.collect(Collectors.toList());
	collect.forEach(System.out::println);
	}


	private static void method3() {
		l1.stream()
		.filter(manager->manager.getName()
		.equals("John"))
		.forEach(System.out::println);
	}


	private static void method2() {
		Optional<User_Prep> findSecondHighestSalary = l1.stream()
		.sorted(Comparator.comparingDouble(User_Prep::getSalary).reversed())
		
		.skip(2)
		.findFirst();
		System.out.println(findSecondHighestSalary.get());
		}

	private static void method1() {
		DoubleSummaryStatistics getTotalSalary = l1.stream()
				.collect(Collectors.summarizingDouble(User_Prep::getSalary));
		System.out.println("get Total Expenses of company for employee salary::"+getTotalSalary.getSum());
		}
	}
