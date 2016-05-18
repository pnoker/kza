package com.noker.kza.service;

import com.noker.kza.bean.Doctor;
import com.noker.kza.bean.Patient;
import com.noker.kza.model.User;

public interface UserService {

	User selectByPrimaryKey(String username);

	int deleteByPrimaryKey(String userId);

	Doctor selectDoctor(String userId);

	int countD(Doctor doctorInfo);

	int countP(Patient patientInfo);
}
