package com.example.demo.Control;

import java.util.List;
import java.util.Optional;

import com.example.demo.Service.ProductService;
import com.example.demo.Model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductControl {
	@Autowired
	private ProductService service;
	
	//Inserting data into database
	@RequestMapping(method=RequestMethod.POST, value="/Products")
	public String addProduct(@RequestBody Product p1){
		return service.addProduct(p1);
	}
	
	//Displaying all the products
	@RequestMapping(method=RequestMethod.GET, value="/Products")
	public List<Product> getallProducts()
	{
	   return service.getAllProducts();
	
	}
	
	//Adding multiple product into database
	@RequestMapping(method=RequestMethod.POST, value="/Addall")
	public String addall(@RequestBody List<Product>  p1)
	{
		return service.addallProducts(p1);
	}
	
	//Deleting product by its Id
	@RequestMapping(method=RequestMethod.DELETE, value="/Product/{id}")
	public String deleteProduct(@PathVariable int id) {
		
		return service.deleteProduct(id);
		
	}
	
	//getting products by name 
	@RequestMapping(method=RequestMethod.GET,value="/ProductName/{name}")
	public Product getProductByName(@PathVariable String name)
	{
		return service.getProductByName(name);
		}
	
	//getting products by price
	@RequestMapping(method=RequestMethod.GET, value="/ProductPrice/{amount}")
	public List<Product> getProductsByPrice(@PathVariable int amount){
		return service.getProductsByPrice(amount);
	}
	
	//getting specific product from DB
	@RequestMapping(method=RequestMethod.GET, value="/Product/{id}")
	public Optional<Product> getProduct(@PathVariable int id) {
		return service.getProduct(id);
	}
	
}
