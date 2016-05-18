package com.noker.kza.dao;

import com.noker.kza.model.MpUser;
import com.noker.kza.model.MpUserKey;

public interface MpUserMapper {

	/**
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(MpUserKey key);

	/**
	 * @mbggenerated
	 */
	int insert(MpUser record);

	/**
	 * @mbggenerated
	 */
	int insertSelective(MpUser record);

	/**
	 * @mbggenerated
	 */
	MpUser selectByPrimaryKey(MpUserKey key);

	/**
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(MpUser record);

	/**
	 * @mbggenerated
	 */
	int updateByPrimaryKey(MpUser record);

	MpUser selectByAppId(String appId);
}