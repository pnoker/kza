package com.noker.kza.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noker.kza.bean.BizQuery;
import com.noker.kza.dao.ArticleMapper;
import com.noker.kza.model.Article;
import com.noker.kza.service.ArticlesService;
import com.noker.kza.service.RadiosService;

@Service("radiosService")
public class RadiosServiceImpl implements RadiosService {
	@Autowired
	private ArticleMapper articleMapper;


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

}
