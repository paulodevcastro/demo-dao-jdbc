package models.dao;

import db.DB;
import models.dao.impl.DepartmentDaoJDBC;
import models.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() { // macete pra não expor a implementação, apenas a interface
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
	
}
