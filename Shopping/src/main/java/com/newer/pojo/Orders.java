package com.newer.pojo;

import java.io.Serializable;
import java.util.List;

public class Orders implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer oid;
	
	private String onum;
	
	private Integer uid;
	
	private Double totalprices;
	
	private List<Orders_Items>  olist;

	public List<Orders_Items> getOlist() {
		return olist;
	}

	public void setOlist(List<Orders_Items> olist) {
		this.olist = olist;
	}

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public String getOnum() {
		return onum;
	}

	public void setOnum(String onum) {
		this.onum = onum;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Double getTotalprices() {
		return totalprices;
	}

	public void setTotalprices(Double totalprices) {
		this.totalprices = totalprices;
	}
	
	

}
