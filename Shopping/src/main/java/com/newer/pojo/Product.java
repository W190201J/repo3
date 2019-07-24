package com.newer.pojo;

import java.io.Serializable;

public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer pid;
	
	private String pname;
	
	private String describe;
	
	private Integer levelone;
	
	private Integer leveltwo;
	
	public Integer getLevelone() {
		return levelone;
	}

	public void setLevelone(Integer levelone) {
		this.levelone = levelone;
	}

	public Integer getLeveltwo() {
		return leveltwo;
	}

	public void setLeveltwo(Integer leveltwo) {
		this.leveltwo = leveltwo;
	}

	private Double price;
	
	private String pic;
	
	private Integer sales;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}


	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
