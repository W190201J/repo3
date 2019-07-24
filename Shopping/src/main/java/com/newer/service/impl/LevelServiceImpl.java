package com.newer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.newer.dao.LevelMapper;
import com.newer.pojo.Level;
import com.newer.service.LevelService;

@Service("level")
public class LevelServiceImpl implements LevelService {

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	@Autowired
	private LevelMapper lm;

	@Override
	public List<Level> selAll() {
		List<Level>	list=null;
		ListOperations<String,Object> clist=redisTemplate.opsForList();
		list=(List<Level>) clist.index("level", 0);
		if(list==null) {
				list=lm.selAll();
				clist.leftPush("level", list);
				return list;
		}else {
			return list;
		}
		
	}

}
