package com.ccv.mzbank.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccv.mzbank.dao.GzfSqbDao;
import com.ccv.mzbank.dao.GzfSqbDaoImpl;
import com.ccv.mzbank.domain.GzfSqb;

@Service
@Transactional
public class GzfSqbServiceImpl implements IGzfSqbService{

	private GzfSqbDaoImpl gzfSqbDao;
	
	@Override
	public boolean saveGzfSqb(GzfSqb gzfSqb) {
		
		gzfSqbDao.saveGzfsqb(gzfSqb);
		return true;
	}

	@Override
	public GzfSqb finSqb(String id) {
		GzfSqb gzfSqb = gzfSqbDao.findGzfSqb(id);
		return gzfSqb;
	}

	public GzfSqbDao getGzfSqbDao() {
		return gzfSqbDao;
	}

	public void setGzfSqbDao(GzfSqbDaoImpl gzfSqbDao) {
		this.gzfSqbDao = gzfSqbDao;
	}

}
