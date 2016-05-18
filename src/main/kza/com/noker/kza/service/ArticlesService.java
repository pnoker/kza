package com.noker.kza.service;

import java.util.List;

import com.noker.kza.bean.Articles;
import com.noker.kza.bean.BizQuery;
import com.noker.kza.bean.Page;
import com.noker.kza.model.Article;

public interface ArticlesService {

	List<BizQuery> getByMagazine(BizQuery record);

	BizQuery getByMagazineId(String id);

	List<Article> selectAllArticle();

	List<Article> selectAllMetting();

	List<Article> selectAllMaganize();

	List<Articles> selectArticleByDoctorName();

	int deleteArticle(Integer id);

	int addArticle(Article addArt);

	Article detailArticle(Integer id);

	int maxId();

	int count();

	List<Article> pageArticl(Page pageinfo);


}
