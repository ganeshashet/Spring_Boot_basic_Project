package com.SpringtoRest.Control;

import java.util.List;

import com.SpringtoRest.Model.Product;
import com.SpringtoRest.Service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	//Handling the All the Request
	//Controller to get the all Details
	private ProductService service;
	@RequestMapping(method=RequestMethod.GET,value="/Product")
	//Processing the request to get all Product Details
	public List<Product> getProduct()
	{
		return service.getAllProducts();
	}
	@RequestMapping(method=RequestMethod.GET,value="/Product/{Pid}")
	public Product getproductId(@PathVariable int Pid)
	{
		return service.getProduct( Pid);
	}
	@RequestMapping(method=RequestMethod.POST,value="/Product")
	public void AddProduct(@RequestBody Product p1)
	{
		service.AddProduct(p1);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/Product/{Pid}")
	public void UpdateProduct(@RequestBody Product p2,@PathVariable int Pid)
	{
		service.UpdateProduct(p2, Pid);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/Product/{Pid}")
	public void DeleteProduct(@PathVariable int Pid)
	{
		service.DeleteProduct(Pid);
	}

}
