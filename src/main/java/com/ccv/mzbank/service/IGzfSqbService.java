package com.ccv.mzbank.service;

import com.ccv.mzbank.domain.GzfSqb;

public interface IGzfSqbService {
	
	boolean saveGzfSqb(GzfSqb gzfSqb);
	
	GzfSqb finSqb(String id);

}
