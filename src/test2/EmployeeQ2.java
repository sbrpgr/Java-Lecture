package test2;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;

import ch15_collection.advanced.EmployeeMain;
import test1.Employee;
import test1.EmployeeQ1;

public class EmployeeQ2 {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
		
		//2-1 테이블 등록
		dao.createTable();
		
		//2-2 삽입
		HashSet<Employee> set = new HashSet<>();
		
		set.add(new Employee(133,"강자바","부장",LocalDate.of(2000, 8, 01)));
		set.add(new Employee(143,"은전기","차장",LocalDate.of(2003, 1, 01)));
		set.add(new Employee(163,"노전자","과장",LocalDate.of(2018, 8, 01)));
		set.add(new Employee(173,"권표준","대리",LocalDate.of(2022, 1, 01)));
		set.add(new Employee(213,"홍정부","사원",LocalDate.of(2019, 1, 01)));
		set.add(new Employee(123,"권표준","대리",LocalDate.of(1998, 1, 01)));
		set.add(new Employee(163,"노전자","사원",LocalDate.of(2008, 8, 01)));
		set.forEach(s -> dao.insertEmployee(s));
		
		
		//2-3 테이블 출력
		dao.printAllEmployee();
	}

}
