package application;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Scanner sc = new Scanner(System.in);
		
		Department depart = departmentDao.findById(3);
		System.out.println(depart);
		
		
		
		Department dep = new Department(null, "Comics");
		departmentDao.insert(dep);
		System.out.println("Insert! New id = " + dep.getId());
		
		
		Department depa = departmentDao.findById(6);
		depa.setName("D3");
		departmentDao.update(depa);
		System.out.println("Update executed: ");
		
		
		List<Department> list = departmentDao.findAll();
		for(Department bb : list) {
			System.out.println(bb);
		}
		
		
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Deleted");

	}

}
