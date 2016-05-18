package com.noker.kza.dao;

import com.noker.kza.model.Fund;

public interface FundMapper {

	/**
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * @mbggenerated
	 */
	int insert(Fund record);

	/**
	 * @mbggenerated
	 */
	int insertSelective(Fund record);

	/**
	 * @mbggenerated
	 */
	Fund selectByPrimaryKey(Integer id);

	/**
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Fund record);

	/**
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Fund record);
}