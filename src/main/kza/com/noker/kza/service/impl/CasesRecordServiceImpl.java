package com.noker.kza.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noker.kza.bean.BizQuery;
import com.noker.kza.dao.ArticleMapper;
import com.noker.kza.dao.CaseRecordMapper;
import com.noker.kza.model.Article;
import com.noker.kza.model.CaseRecord;
import com.noker.kza.service.ArticlesService;
import com.noker.kza.service.CaseRecordService;

@Service("casesService")
public class CasesRecordServiceImpl implements CaseRecordService {
	@Autowired
	private CaseRecordMapper caseRecordMapper;

	@Override
	public List<CaseRecord> selectAllCaseRcord(CaseRecord caseRecordInfo) {
		return caseRecordMapper.selectAllCaseRecord(caseRecordInfo);
	}

	@Override
	public List<BizQuery> getByMagazine(BizQuery record) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BizQuery getByMagazineId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countC(CaseRecord caseInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
