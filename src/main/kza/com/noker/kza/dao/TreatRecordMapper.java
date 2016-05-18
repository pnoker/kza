package com.noker.kza.dao;

import com.noker.kza.model.TreatRecord;

public interface TreatRecordMapper {

	/**
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * @mbggenerated
	 */
	int insert(TreatRecord record);

	/**
	 * @mbggenerated
	 */
	int insertSelective(TreatRecord record);

	/**
	 * @mbggenerated
	 */
	TreatRecord selectByPrimaryKey(Integer id);

	/**
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(TreatRecord record);

	/**
	 * @mbggenerated
	 */
	int updateByPrimaryKey(TreatRecord record);
}