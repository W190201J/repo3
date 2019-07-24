package com.newer.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.newer.pojo.Level;

@Repository
public interface LevelMapper {
	
	public List<Level> selAll();
	
}
