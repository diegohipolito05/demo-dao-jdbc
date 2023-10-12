package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactore {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
	
}
