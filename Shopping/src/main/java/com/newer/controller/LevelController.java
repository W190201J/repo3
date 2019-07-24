package com.newer.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.newer.pojo.Level;
import com.newer.service.LevelService;

@RestController
public class LevelController {
	
	@Resource(name="level")
	private LevelService ls;
	
	
	
	@RequestMapping(value = "selLevel",method = RequestMethod.GET)
	public List<Level> selAll(){
		return ls.selAll();
	}

}
