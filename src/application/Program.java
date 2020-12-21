package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	/*public static int comand;
	public static String setName;
	public static String SetEmail;
	public static double setSalary;
	public static Date setBirthDate;
	public static Department setDep;*/
	
	public Program() {
	}
	
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		
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
		
		System.out.println("\n\n=== Test 4: Insert Value ===");
		Seller sellerInsert = new Seller(null, "Greg", "greg@gmail.com", new Date(), 1200.0, dep);
		sellerDao.insert(sellerInsert);
		System.out.println("Inserted! new seller Id: " + sellerInsert.getId());
		
		System.out.println("\n\n=== Test 5: Update Value ===");
		seller = sellerDao.findById(2);
		seller.setName("Josh Ackerman");
		sellerDao.update(seller);
		System.out.println("Updated! Seller Info Updated");
		
/*		
		System.out.println("\n\n=== Test 4: Insert Value 2 ===");
		System.out.print("Insira o nome do novo funcionario: ");
		setName = sc.next();
		System.out.print("Insira o email do funcionario: ");
		SetEmail = sc.next();
		setBirthDate = new Date();
		System.out.print("Insira o salario do funcionario: ");
		setSalary = sc.nextDouble();
		setDep = dep;
		
		Seller sellerInsert2 = new Seller(null, setName, SetEmail, setBirthDate, setSalary, setDep);
		sellerDao.insert(sellerInsert2);
		System.out.println("Inserted! new seller Id: " + sellerInsert2.getId());
		
		sc.close();
		
		*/
	}
	
}
