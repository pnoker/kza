package com.noker.kza.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noker.kza.bean.BizQuery;
import com.noker.kza.dao.ArticleMapper;
import com.noker.kza.dao.MpUserMapper;
import com.noker.kza.model.Article;
import com.noker.kza.model.MpUser;
import com.noker.kza.model.MpUserKey;
import com.noker.kza.service.ArticlesService;
import com.noker.kza.service.MpUserService;
import com.noker.kza.service.VideosService;

@Service("mpUserService")
public class MpUserServiceImpl implements MpUserService {
	@Autowired
	private MpUserMapper mpUserMapper;

	@Override
	public int deleteByPrimaryKey(MpUserKey key) {
		return mpUserMapper.deleteByPrimaryKey(key);
	}

	@Override
	public MpUser selectByAppId(String appId) {
		return mpUserMapper.selectByAppId(appId);
	}

}
