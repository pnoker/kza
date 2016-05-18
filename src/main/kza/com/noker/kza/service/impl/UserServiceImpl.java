package com.noker.kza.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noker.kza.bean.Doctor;
import com.noker.kza.bean.Patient;
import com.noker.kza.dao.UserMapper;
import com.noker.kza.model.User;
import com.noker.kza.service.UserService;;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User selectByPrimaryKey(String username) {
		return userMapper.selectByPrimaryKey(username);
	}

	@Override
	public int deleteByPrimaryKey(String userId) {
		return userMapper.deleteByPrimaryKey(userId);
	}

	@Override
	public Doctor selectDoctor(String userId) {
		return userMapper.selectDoctor(userId);
	}

	@Override
	public int countD(Doctor doctorInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countP(Patient patientInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
