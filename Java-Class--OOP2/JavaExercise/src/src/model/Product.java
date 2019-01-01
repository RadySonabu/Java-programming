package model;

public class Product {
	
	public double price;
	public String productName;
	public double productWeight;
	public String productColor;
	public String productManufacturer;
	
	
	
	
	
	public Product(double price, String productName, double productWeight, String productColor,
			String productManufacturer) {
	
		this.price = price;
		this.productName = productName;
		this.productWeight = productWeight;
		this.productColor = productColor;
		this.productManufacturer = productManufacturer;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductWeight() {
		return productWeight;
	}
	public void setProductWeight(double productWeight) {
		this.productWeight = productWeight;
	}
	public String getProductColor() {
		return productColor;
	}
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	public String getProductManufacturer() {
		return productManufacturer;
	}
	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}
	
	
	
	
}
