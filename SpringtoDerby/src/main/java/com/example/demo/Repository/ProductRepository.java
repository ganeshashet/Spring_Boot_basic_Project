package com.example.demo.Repository;

import java.util.List;

import com.example.demo.Model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository

public interface ProductRepository extends JpaRepository<Product,Integer>{
	Product findByProductName(String productName);
	//productPrice
		//findByProductPrice
		@Query(value="select * from product where product_price < ?1",nativeQuery=true)
		List<Product> findByProductPrice(int productPrice);

}
