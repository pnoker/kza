package com.noker.kza.dao;

import java.util.List;

import com.noker.kza.bean.Articles;
import com.noker.kza.bean.BizQuery;
import com.noker.kza.bean.Page;
import com.noker.kza.model.Article;

public interface ArticleMapper {
	/**
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * @mbggenerated
	 */
	int insert(Article record);/*增添文章*/

	/**
	 * @mbggenerated
	 */
	int insertSelective(Article record);

	/**
	 * @mbggenerated
	 */
	Article selectByPrimaryKey(Integer id);

	/**
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Article record);

	/**
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Article record);

	List<Article> selectAllArticle(Article record); /*查找全部文章按时间顺序*/

	List<Article> selectAllMetting(Article articleInfo); /*查找全部会议按时间顺序*/

	List<Article> selectAllMaganize(Article articleInfo); /*查找全部杂志按时间顺序*/

	List<Articles> selectArticleByDoctorName(Articles articlesInfo); /*查找文章按照医生的姓名*/

	int maxId();/* 查找当前列表中文章的最大id */

	int count();/*查询当前文章Type=4 是数量*/

	List<Article> pageArticl(Page pageinfo);/*分页功能查找文章列表*/

	Article detailArticle(Integer id);
}