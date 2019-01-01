package tester;

import java.util.List;
import java.util.Scanner;

import model.Product;
import serviceimpl.ProductServiceImpl;

class ProductTester_assignment {

	  public static void main(String[] args) {
		
		  double price;
		  String productName;
		  double productWeight;
		  String productColor;
		  String productManufacturer;
		  
		  
		  Scanner scanner = new Scanner(System.in);
		  
		  ProductServiceImpl psi = new ProductServiceImpl();
		  
		  System.out.println("Enter how many products you want to add! ");
		  int numberOfProduct = scanner.nextInt();
		  
		  for(int x = 0; x < numberOfProduct; x++){
			  
			  System.out.println("Enter product name: ");
			  productName = scanner.next();
			  
			  System.out.println("Enter product weight: ");
			  productWeight = scanner.nextDouble();
			  
			  System.out.println("Enter product color: ");
			  productColor = scanner.next();
			  
			  System.out.println("Enter product manufacturer: ");
			  productManufacturer = scanner.next();
			  
			  System.out.println("Enter product price: ");
			  price = scanner.nextDouble();
			  
			  
			  Product product = new Product();
			  
			  product.setPrice(price);
			  product.setProductColor(productColor);
			  product.setProductManufacturer(productManufacturer);
			  product.setProductName(productName);
			  product.setProductWeight(productWeight);
			  
			  
			  psi.addProduct(product);
		  
		  }
		  
		  List<Product> productList = psi.getAllProduct();
		  
		  for (Product productFromList : productList) {
			  
			  System.out.println("\nPrice: " + productFromList.getPrice());
			  System.out.println("Product color: " + productFromList.getProductColor());
			  System.out.println("Product Manufacturer: " + productFromList.getProductManufacturer());
			  System.out.println("Product Name: " + productFromList.getProductName());
			  System.out.println("Product weight: " + productFromList.getProductWeight());
			
		}
		  
		  
		  

	}

}
