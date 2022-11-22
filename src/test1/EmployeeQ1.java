package test1;

import java.time.LocalDate;
import java.util.HashSet;

import ch15_collection.sec03_hashSet.Member;

public class EmployeeQ1 {
			HashSet<Employee> set2;
	public static void main(String[] args) {
		
			HashSet<Employee> set = new HashSet<>();
			
			set.add(new Employee(133,"강자바","부장",LocalDate.of(2000, 8, 01)));
			set.add(new Employee(143,"은전기","차장",LocalDate.of(2003, 1, 01)));
			set.add(new Employee(163,"노전자","과장",LocalDate.of(2018, 8, 01)));
			set.add(new Employee(173,"권표준","대리",LocalDate.of(2022, 1, 01)));
			set.add(new Employee(213,"홍정부","사원",LocalDate.of(2019, 1, 01)));
			set.forEach(s -> System.out.println(s));
			System.out.println();
			
			set.add(new Employee(123,"권표준","대리",LocalDate.of(1998, 1, 01)));
			set.add(new Employee(163,"노전자","사원",LocalDate.of(2008, 8, 01)));
			
			set.forEach(s -> System.out.println(s));
			System.out.println();
	}
	
	
}
