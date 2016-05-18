package com.noker.kza.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noker.kza.bean.BizQuery;
import com.noker.kza.bean.Doctor;
import com.noker.kza.bean.Page;
import com.noker.kza.dao.ArticleMapper;
import com.noker.kza.dao.UserMapper;
import com.noker.kza.model.Article;
import com.noker.kza.service.ArticlesService;
import com.noker.kza.service.DoctorsService;

@Service("doctorsService")
public class DoctorsServiceImpl implements DoctorsService {
	@Autowired
	private UserMapper userMapper;


	@Override
	public BizQuery getByMagazineId(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<BizQuery> getByMagazine(BizQuery record) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Doctor> pageDoctor(Page pageinfo) {
		return userMapper.pageDoctor(pageinfo);
	}


	@Override
	public int countDoctor() {
		return userMapper.countDoctor();
	}


	@Override
	public Doctor selectDoctor(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
