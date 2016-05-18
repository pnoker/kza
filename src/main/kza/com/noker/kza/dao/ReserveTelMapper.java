package com.noker.kza.dao;

import com.noker.kza.model.ReserveTel;

public interface ReserveTelMapper {

	/**
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String appId);

	/**
	 * @mbggenerated
	 */
	int insert(ReserveTel record);

	/**
	 * @mbggenerated
	 */
	int insertSelective(ReserveTel record);

	/**
	 * @mbggenerated
	 */
	ReserveTel selectByPrimaryKey(String appId);

	/**
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(ReserveTel record);

	/**
	 * @mbggenerated
	 */
	int updateByPrimaryKey(ReserveTel record);
}