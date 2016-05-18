package com.noker.kza.bean;

import java.io.Serializable;

public class Page implements Serializable{
	private Integer pre;
	private Integer nex;
	private Integer page;
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPre() {
		return pre;
	}
	public void setPre(Integer pre) {
		this.pre = pre;
	}
	public Integer getNex() {
		return nex;
	}
	public void setNex(Integer nex) {
		this.nex = nex;
	}

}
