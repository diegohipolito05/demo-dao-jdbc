package application;

import java.util.List;

import model.dao.DaoFactore;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactore.createSellerDao();
		
		System.out.println("=== TEST 1: finfById ======");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: finfByDepartment ======");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartmentId(department);
		list.forEach(System.out::println);

	}

}
