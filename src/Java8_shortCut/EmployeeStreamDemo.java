package Java8_shortCut;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeStreamDemo {
	static List<Employee> employeeList=new ArrayList<>();
	public static void main(String[] args) {
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Female", "Account And Finance", 2010, 27000.0));
		
		//query
		//how many male and female employee are there
		Method1();
		System.out.println("\n");
		
		// Query 2 : Print the name of all departments in the organization?
		method2();
		System.out.println("\n");
		
		// Query 3 : What is the average age of male and female employees?
		method3();
		System.out.println("\n");
		
		// Query 4 : Get the details of highest paid employee in the organization?
		method4();
		System.out.println("\n");
		
		// Query 5 : Get the names of all employees who have joined after 2015?
		method5();
		System.out.println("\n");
		// Query 13 : What is the average salary and total salary of the whole
		// organization?
		method13();
		System.out.println("\n");
		// Query 14 : Separate the employees who are younger or equal to 25 years from
		// those employees who are older than 25 years.
		method14();
		System.out.println("\n");
		// Query 15 : Who is the oldest employee in the organization? What is his age
		// and which department he belongs to?
		method15();

	}
	
	private static void method15() {
		Optional<Employee> max = employeeList.stream()
		.max(Comparator.
		comparingInt(Employee::getAge));
	System.out.println("Name of employee::"+max.get().getName());
		
	}

	private static void method14() {
		Map<Boolean, List<Employee>> collect =
				employeeList
				.stream()
				.collect(Collectors
				.partitioningBy(x->x.getAge()>25));
		Set<Entry<Boolean,List<Employee>>> entrySet = collect.entrySet();
		
		for(Entry<Boolean,List<Employee>> entry:entrySet) {
			System.out.println("-*************-");
			
			if (entry.getKey()) {
				System.out.println("employee are older than 25");
			}
			else {
				System.out.println("employee are younger than 25 or equal");
			}
			
			List<Employee> list = entry.getValue();
			
			for(Employee emp:list) {
				System.out.println(emp.getName());
			}
		}
	}
	private static void method13() {
		DoubleSummaryStatistics collect = 
		employeeList.
		stream()
		.collect(Collectors.summarizingDouble(Employee::getSalary));
		
		System.out.println("avg salary::"+collect.getAverage());
		System.out.println("total sum salary::"+collect.getSum());
		
		
	}

	private static void Method1() {
		Map<String,Long> collect = employeeList.stream().
				
	collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		
		System.out.println(collect);
		
	}
	
	private static void method2() {
		employeeList.stream().map(Employee::getDepartment).
		distinct().forEachOrdered(System.out::println);
	}
	
	private static void method3() {
		Map<String,Double> collect = employeeList
		.stream()
		.collect(Collectors
		.groupingBy(Employee::getGender,Collectors
		.averagingInt(Employee::getAge)));
		System.out.println(collect);
	}
	
	private static void method4() {
		Optional<Employee> collect = employeeList.stream()
		.collect(Collectors
		.maxBy(Comparator
		.comparingDouble(Employee::getSalary)));
		System.out.println(collect.get().getName());
	}
	
	private static void method5() {
		 employeeList
				.stream()
				.filter(x->x.getYearOfJoining()>2015)
				.map(Employee::getYearOfJoining)
				.forEach(System.out::println);
		}
}
