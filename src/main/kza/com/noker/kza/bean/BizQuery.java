package com.noker.kza.bean;

import java.io.Serializable;
import java.util.Date;

public class BizQuery implements Serializable {

	private String title;
	private String upperOrg;
	private String organizer;
	private String logo;
	private Date atTime;
	private String metDate;
	private String metAddr;
	private String summary;
	private String description;
	private String memo;
	private String name;
	private String skill;
	private String magWay;
	private String id;
	private String content;
	
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMagWay(){
		return magWay;
	}
	
	public void setMagWay(String magWay){
		this.magWay = magWay;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSummary() {
		return summary;
	}

	public void getSummary(String summary) {
		this.summary = summary;
	}

	public String getMetDate() {
		return metDate;
	}

	public void getMetDate(String metDate) {
		this.metDate = metDate;
	}

	public String getMetAddr() {
		return metAddr;
	}

	public void setMetAddr(String metAddr) {
		this.metAddr = metAddr;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getOrganizer() {
		return organizer;
	}

	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}

	public String getUpperOrg() {
		return upperOrg;
	}

	public void setUpperOrg(String upperOrg) {
		this.upperOrg = upperOrg;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getAtTime() {
		return atTime;
	}

	public void setAtTime(Date atTime) {
		this.atTime = atTime;
	}

}
