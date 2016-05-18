package com.noker.kza.service;

import java.util.List;

import com.noker.kza.bean.BizQuery;
import com.noker.kza.bean.Doctor;
import com.noker.kza.bean.Page;
import com.noker.kza.model.Article;

public interface DoctorsService {

	List<BizQuery> getByMagazine(BizQuery record);

	

	BizQuery getByMagazineId(String id);



	Doctor selectDoctor(String userId);



	List<Doctor> pageDoctor(Page pageinfo);



	int countDoctor();


}
