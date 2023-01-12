package complexInterviewQue;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SalaryWiseTest_Inc_Dec {
	static List<Employee> list=new ArrayList<>();
	public static void main(String[] args) {
		
				list.add(new Employee("Ajay", "Washim", "SD", 27, 550000));
				list.add(new Employee("Vijay", "Pune", "DS", 25, 800000));
				list.add(new Employee("Akshay", "Solapur", "BD", 29, 500000));
				list.add(new Employee("Shivaji", "Aurangabad", "SD", 28, 600000));
				list.add(new Employee("Poonam", "Pune", "SD", 26, 900000));
				list.add(new Employee("Mangesh", "Washim", "QA", 27, 700000));
				list.add(new Employee("Rathod", "Washim", "QA", 32, 850000));
				
		//increase the salary who is from washim by 5% having age is greater than
		// or equal to 26
				
		method1();
		System.out.println("\n");
		//group by dep and sorted by salary
		method2();
		System.out.println("\n");
		method3();
	}
	private static void method3() {
		Object collect = list.stream().filter(x->(x.getAge()>35 && (x.getCity()
	.equals("Washim")))).map(x->x.getSalary()+5000).collect(null, null, null);
		
		System.out.println(collect);
		
	}
	private static void method2() {
//		Map<String,Employee> collect = list
//		.stream().sorted().
//		collect(Collectors.groupingBy((e->e.getDept()),
//				Collectors
//				.collectingAndThen(Collectors
//				.maxBy(Comparator
//				.comparingDouble(e->e.getSalary())),
//				Optional::get)));
//		collect.forEach((x,y)->System.out.println(x+y.toString()));
		}
	private static void method1() {
		 list.stream().filter(x->{
				if ((x.getAge()>26 && (x.getCity().equals("Washim")))) {
					x.setSalary(x.getSalary()*1.05);
					return true;
				}
				else {
					return false;
		}
				
			}).forEach(x->System.out.println(x));;
		}
	}
