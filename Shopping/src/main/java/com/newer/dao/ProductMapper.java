package com.newer.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.newer.pojo.Product;

@Repository
public interface ProductMapper {
	
		public List<Product> selAll();
		
}
