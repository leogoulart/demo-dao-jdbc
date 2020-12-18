package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("=== Test 1: FindById ===");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n\n=== Test 2: FindByDepartment ===");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		
		for(Seller selle : list) {
			System.out.println(selle);
		}
		
		System.out.println("\n\n=== Test 3: FindAll ===");
		list = sellerDao.findAll();
		for(Seller sellerAll : list) {
			System.out.println(sellerAll);
		}
		
	}
	
}
