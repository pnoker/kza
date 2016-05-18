package com.noker.kza.dao;

import com.noker.kza.model.MpBody;

public interface MpBodyMapper {

	/**
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String appId);

	/**
	 * @mbggenerated
	 */
	int insert(MpBody record);

	/**
	 * @mbggenerated
	 */
	int insertSelective(MpBody record);

	/**
	 * @mbggenerated
	 */
	MpBody selectByPrimaryKey(String appId);

	/**
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(MpBody record);

	/**
	 * @mbggenerated
	 */
	int updateByPrimaryKey(MpBody record);
}