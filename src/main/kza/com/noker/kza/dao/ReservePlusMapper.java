package com.noker.kza.dao;

import com.noker.kza.model.ReservePlus;

public interface ReservePlusMapper {

	/**
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String appId);

	/**
	 * @mbggenerated
	 */
	int insert(ReservePlus record);

	/**
	 * @mbggenerated
	 */
	int insertSelective(ReservePlus record);

	/**
	 * @mbggenerated
	 */
	ReservePlus selectByPrimaryKey(String appId);

	/**
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(ReservePlus record);

	/**
	 * @mbggenerated
	 */
	int updateByPrimaryKey(ReservePlus record);
}