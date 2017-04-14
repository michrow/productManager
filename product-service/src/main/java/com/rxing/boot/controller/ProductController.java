package com.rxing.boot.controller;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rxing.boot.dao.IProductDao;
import com.rxing.boot.entity.Product;

@RestController
public class ProductController {
	private static final Logger LOGGER=LogManager.getLogger(ProductController.class);
	
	@Autowired
	private IProductDao productDao;
	
	@Autowired
	private DiscoveryClient client;
	
	@RequestMapping(value="/getAllProducts",method=RequestMethod.GET)
	public List<Product> getAllProduct(){
		ServiceInstance instance=client.getLocalServiceInstance();
		List<Product> products=productDao.getAllProduct();
		LOGGER.info("/getAll,host:"+instance.getHost()+",service_id:"+instance.getServiceId()+",result:"+products.size());
		return products;
	}
	
	@RequestMapping(value="/getProductByName",method=RequestMethod.GET)
	public Product getProductByName(@RequestParam String productName){
		ServiceInstance instance=client.getLocalServiceInstance();
		Product product=productDao.getProductByName(productName);
		LOGGER.info("/getProductByName,host:"+instance.getHost()+",service_id:"+instance.getServiceId()+",result:"+productName.toString());
		return product;
	}
}
