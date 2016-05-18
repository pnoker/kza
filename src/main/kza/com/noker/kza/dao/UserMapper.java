package com.noker.kza.dao;

import java.util.List;

import com.noker.kza.bean.Doctor;
import com.noker.kza.bean.Page;
import com.noker.kza.bean.Patient;
import com.noker.kza.model.MpUserKey;
import com.noker.kza.model.User;

public interface UserMapper {
	/**
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String userId);

	/**
	 * @mbggenerated
	 */
	int insert(User record);

	/**
	 * @mbggenerated
	 */
	int insertSelective(User record);

	/**
	 * @mbggenerated
	 */
	User selectByPrimaryKey(String username);

	/**
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(User record);

	/**
	 * @mbggenerated
	 */
	int updateByPrimaryKey(User record);

	User selectByMpUserKey(MpUserKey key);

	Doctor selectDoctor(String userId);

	List<Patient> selectPatient(Patient patientInfo);

	List<Doctor> pageDoctor(Page pageinfo);

	int countDoctor();
}