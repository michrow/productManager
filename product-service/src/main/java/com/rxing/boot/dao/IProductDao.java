package com.rxing.boot.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.rxing.boot.entity.Product;

public interface IProductDao extends CrudRepository<Product, Long> {
	 @Transactional
	    @Modifying
	
	@Query("select t from Product t where t.productName=:product_name")
	Product getProductByName(@Param("product_name") String productName);
	
	@Query("select t from Product t")
	List<Product> getAllProduct();
	
}
