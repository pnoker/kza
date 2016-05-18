package com.noker.kza.service;

import java.util.List;

import com.noker.kza.bean.BizQuery;
import com.noker.kza.model.CaseRecord;

public interface CaseRecordService {

	List<BizQuery> getByMagazine(BizQuery record);

	

	BizQuery getByMagazineId(String id);



	List<CaseRecord> selectAllCaseRcord(CaseRecord caseRecordInfo);



	int countC(CaseRecord caseInfo);


}
