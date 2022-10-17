package com.SpringtoRest.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.SpringtoRest.Model.Product;

import org.springframework.stereotype.Service;
@Service

public class ProductService {
	private List<Product> ProductList=new ArrayList<>(Arrays.asList(
			new Product(11,"Samsung  Galaxy A7",28000,5),
			new Product(12,"Iphone 14 Pro",150000,8),
			new Product(13,"Samsung s22",120000,3),
			new Product(14,"OnePlus 10 Pro",35000,10),
			new Product(15,"Redmi m2 ",15000,5)
			));
	//returning all products 
		public List<Product> getAllProducts(){
			return ProductList;
		}
		public Product getProduct(int Pid)
		{
			return ProductList.stream().filter(pro->pro.getProductId()==Pid).findFirst().get();
		}
		public void AddProduct(Product p1)
		{
			ProductList.add(p1);
		}
		public void UpdateProduct(Product p2,int Pid)
		{
			for(int i=1;i<ProductList.size();i++)
			{
				Product p1=ProductList.get(i);
				if(p1.getProductId()==Pid)
				{
					ProductList.add(i,p2);
				}
			}
		}
		public void DeleteProduct(int Pid)
		{
			ProductList.removeIf(pro->(pro.getProductId()==Pid));
		}
}
