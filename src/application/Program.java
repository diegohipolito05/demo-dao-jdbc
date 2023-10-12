package application;

import model.dao.DaoFactore;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactore.createSellerDao();
		
		System.out.println("=== TEST 1: finfById(3) ======");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

	}

}
