package models.dao;

import models.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() { // macete pra não expor a implementação, apenas a interface
		return new SellerDaoJDBC();
	}
	
}
