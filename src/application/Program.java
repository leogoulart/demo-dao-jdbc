package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Hardware");
		
		Seller seller = new Seller(2, "Jack Mack Flack", "homemdepreto@gmail.com", new Date(), 3200.0, obj);
		
		System.out.println(seller);
		
	}
	
}
