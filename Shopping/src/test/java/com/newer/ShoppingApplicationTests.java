package com.newer;


import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.newer.pojo.Level;
import com.newer.pojo.Product;
import com.newer.service.ProductService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoppingApplicationTests {
	
	@Resource(name="pro")
	private ProductService ls;

	@Test
	public void contextLoads() {
		List<Product> s=ls.selAll();
		for (Product level : s) {
			System.out.println(level.getPname());
		}
	}

}
