package com.noker.kza.dao;

import java.util.List;

import com.noker.kza.model.CaseRecord;

public interface CaseRecordMapper {

	/**
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * @mbggenerated
	 */
	int insert(CaseRecord record);

	/**
	 * @mbggenerated
	 */
	int insertSelective(CaseRecord record);

	/**
	 * @mbggenerated
	 */
	CaseRecord selectByPrimaryKey(Integer id);

	/**
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(CaseRecord record);

	/**
	 * @mbggenerated
	 */
	int updateByPrimaryKey(CaseRecord record);

	List<CaseRecord> selectAllCaseRecord(CaseRecord caseRecordInfo);/*选择出全部的病人病历包括患者的各种信息*/
}