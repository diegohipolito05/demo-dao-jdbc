package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactore;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactore.createDepartmentDao();
		
		System.out.println("===== Test 1: findById =====");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n===== Test 2: findAll =====");
		List<Department> list = departmentDao.findAll();
		list.forEach(System.out::println);
		
		System.out.println("\n===== Test 3: department insert =====");
		department = new Department(null, "Games");
		departmentDao.insert(department);
		System.out.println("Inserted! New id: " + department.getId());
		
		System.out.println("\n===== Test 4: department update =====");
		department = departmentDao.findById(1);
		department.setName("IT");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n===== Test 4: department update =====");
		System.out.print("Enter Id for delet department: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();

	}

}
