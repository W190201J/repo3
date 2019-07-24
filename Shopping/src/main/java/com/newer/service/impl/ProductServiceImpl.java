package com.newer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.newer.dao.ProductMapper;
import com.newer.pojo.Product;
import com.newer.service.ProductService;

@Service("pro")
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	@Autowired
	private ProductMapper pm;

	@Override
	public List<Product> selAll() {
		List<Product>	list=null;
		ListOperations<String,Object> clist=redisTemplate.opsForList();
		list=(List<Product>) clist.index("pro", 0);
		if(list==null) {
				list=pm.selAll();
				clist.leftPush("pro", list);
				return list;
		}else {
			return list;
		}
	}


}
