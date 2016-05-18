package com.noker.kza.service;

import java.util.List;

import com.noker.kza.bean.BizQuery;
import com.noker.kza.model.Article;

public interface VideosService {

	List<BizQuery> getByMagazine(BizQuery record);

	

	BizQuery getByMagazineId(String id);


}
