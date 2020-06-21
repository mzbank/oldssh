package com.ccv.mzbank.dao;

import com.ccv.mzbank.domain.GzfSqb;

public interface GzfSqbDao {
	
	boolean saveGzfsqb(GzfSqb gzfSqb);
	
	GzfSqb findGzfSqb(String id);

}
