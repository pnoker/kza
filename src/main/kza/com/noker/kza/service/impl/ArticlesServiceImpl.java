package com.noker.kza.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noker.kza.bean.Articles;
import com.noker.kza.bean.BizQuery;
import com.noker.kza.bean.Page;
import com.noker.kza.dao.ArticleMapper;
import com.noker.kza.model.Article;
import com.noker.kza.service.ArticlesService;

@Service("articlesService")
public class ArticlesServiceImpl implements ArticlesService {
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


	@Override
	public List<Article> selectAllArticle() {
		return articleMapper.selectAllArticle(null);
	}


	@Override
	public List<Article> selectAllMetting() {
		return articleMapper.selectAllMetting(null);
	}


	@Override
	public List<Article> selectAllMaganize() {
		return articleMapper.selectAllMaganize(null);
	}


	@Override
	public List<Articles> selectArticleByDoctorName() {
		return articleMapper.selectArticleByDoctorName(null);
	}


	@Override
	public int deleteArticle(Integer id) {
		return articleMapper.deleteByPrimaryKey(id);
	}


	@Override
	public int addArticle(Article addArt) {
		return articleMapper.insert(addArt);
	}


	@Override
	public Article detailArticle(Integer id) {
		return articleMapper.detailArticle(id);
	}


	@Override
	public int maxId() {
		return articleMapper.maxId();
	}


	@Override
	public int count() {
		return articleMapper.count();
	}


	@Override
	public List<Article> pageArticl(Page pageinfo) {
		return articleMapper.pageArticl(pageinfo);
	}

}
