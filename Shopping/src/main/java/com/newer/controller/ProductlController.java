package com.newer.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.newer.pojo.Product;
import com.newer.service.ProductService;

@RestController
public class ProductlController {
	
	@Resource(name="pro")
	private ProductService ps;
	
	
	
	
	@RequestMapping(value = "selpro",method = RequestMethod.GET)
	public List<Product> selAll(){
		return ps.selAll();
	}
	


}
