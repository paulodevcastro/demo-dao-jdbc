package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.dao.DaoFactory;
import models.dao.DepartmentDao;
import models.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("=== TEST 1: Department findById ===");
		Department department = departmentDao.findByById(3);
		System.out.println(department);

		
		System.out.println("\n=== TEST 2: Department findAll ===");
		List<Department> departments = new ArrayList<>();
		departments = departmentDao.findAll();
		for(Department dep : departments) {
			System.out.println(dep);
		}
		
		// line commented because will create a new Department always run the application
		System.out.println("\n=== TEST 3: Department insert ===");
		/*
		Department newDep = new Department(null, "Jurico");
		departmentDao.insert(newDep);
		System.out.println("Inserted! new id: " + newDep.getId());
		*/
		
		System.out.println("\n=== TEST 4: Department update ===");
		department = departmentDao.findByById(7);
		department.setName("Infrastructure");
		departmentDao.update(department);
		System.out.println("Updated! check id " + department.getId());
		
		System.out.println("\n=== TEST 5: Department deleteById ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Department deleted!");
		
		sc.close();
	}

}
