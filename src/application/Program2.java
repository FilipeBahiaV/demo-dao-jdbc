package application;
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
		

	}

}
