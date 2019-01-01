package tester;

import java.util.Scanner;
import constants.ConstantVariables;
import model.Product;

public class ProductTester {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input price: ");
		double price = scanner.nextDouble();
		
		System.out.println("Input product name: ");
		String productName = scanner.next();
		
		System.out.println("Input product weight: ");
		double productWeight = scanner.nextDouble();
		
		System.out.println("Input product color: ");
		String productColor =  scanner.next();
		
		System.out.println("Input product manufacturer: ");
		String productManufacturer = scanner.next();
		
		Product product = new Product(price, productColor, productWeight, productManufacturer, productName);
		
		product.setPrice(price);
		product.setProductName(productName);
		product.setProductWeight(productWeight);
		product.setProductColor(productColor);
		product.setProductManufacturer(productManufacturer);
		
		
		price = product.getPrice();
		productName = product.getProductName();
		productWeight = product.getProductWeight();
		productManufacturer =  product.getProductManufacturer();
		productColor = product.getProductColor();
		
		
		
		System.out.println("The price is " + price);
		System.out.println("The product name is " + productName);
		System.out.println("The weight of the product is " + productWeight);
		System.out.println("The manufacturer of the product " + productName + " is " + productManufacturer);
		System.out.println("The color of " + productName + " is " +  productColor);
		
		
		
		

		
		
		
	}
}
