package serviceimpl;

import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ProductServiceImpl {

	List<Product> productList = new ArrayList<Product>();
	
	
	public void addProduct(Product product){
		productList.add(product);
	}
	
	public List<Product> getAllProduct(){
		return productList;
	}
}
