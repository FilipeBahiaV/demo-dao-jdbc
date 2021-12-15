package application;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		
		Department depart = departmentDao.findById(3);
		System.out.println(depart);
		
		
		
		Department dep = new Department(null, "Food");
		departmentDao.insert(dep);
		System.out.println("Insert! New id = " + dep.getId());
		
		
		Department depa = departmentDao.findById(9);
		depa.setName("health");
		departmentDao.update(depa);
		System.out.println("Update executed: ");
		
		
		List<Department> list = departmentDao.findAll();
		for(Department bb : list) {
			System.out.println(bb);
		}

	}

}
