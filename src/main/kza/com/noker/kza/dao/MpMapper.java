package com.noker.kza.dao;

import com.noker.kza.model.Mp;

public interface MpMapper {

	/**
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String appId);

	/**
	 * @mbggenerated
	 */
	int insert(Mp record);

	/**
	 * @mbggenerated
	 */
	int insertSelective(Mp record);

	/**
	 * @mbggenerated
	 */
	Mp selectByPrimaryKey(String appId);

	/**
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Mp record);

	/**
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Mp record);
}