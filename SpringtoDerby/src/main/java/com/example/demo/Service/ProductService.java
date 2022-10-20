package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;
	
	//getting products and returning to controller
	public List<Product> getAllProducts(){		
		List<Product> productList=new ArrayList<>();
		repo.findAll().forEach(productList::add);
		return productList;
	}
	
	//adding product to DB
	public String addProduct(Product p1) {
		repo.save(p1);
		return "successfully added!....";
	}
	
	//Adding Multiple Products
	public String addallProducts(List<Product> pl)
	{
		repo.saveAll(pl);
		return "successfully added";
	}
	
	//Deleting an elements
    public String deleteProduct(int id) {
		
		repo.deleteById(id);
		return "Deleted Successfully";
	}
    
    //getting product if id is available
  	public Optional<Product> getProduct(int id) {
  		return repo.findById(id);
  	}
  	
  	//getting products by its name
  	public Product getProductByName(String productName) {
		return repo.findByProductName(productName);
	}
	
  	//Getting products by its price
	public List<Product> getProductsByPrice(int productPrice){
		return repo.findByProductPrice(productPrice);
	}
}

