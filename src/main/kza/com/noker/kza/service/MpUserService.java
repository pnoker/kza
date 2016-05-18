package com.noker.kza.service;

import com.noker.kza.model.MpUser;
import com.noker.kza.model.MpUserKey;

public interface MpUserService {

	int deleteByPrimaryKey(MpUserKey key);

	MpUser selectByAppId(String appId);

}
