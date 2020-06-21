package com.ccv.mzbank.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ccv.mzbank.domain.GzfSqb;

public class GzfSqbDaoImpl extends org.springframework.orm.hibernate5.support.HibernateDaoSupport implements GzfSqbDao{


	/* private SessionFactory sessionFactory; */
	@Resource	
	public void setSessionFacotry(SessionFactory sessionFacotry) {
		super.setSessionFactory(sessionFacotry);
	}
	
	@Override
	public boolean saveGzfsqb(GzfSqb gzfSqb) {
		// TODO Auto-generated method stub
		org.springframework.orm.hibernate5.HibernateTemplate template = this.getHibernateTemplate();
		/* template.setCheckWriteOperations(false); */
		template.save(gzfSqb);
		return true;
	}

	@Override
	public GzfSqb findGzfSqb(String id) {
		// TODO Auto-generated method stub
		org.springframework.orm.hibernate5.HibernateTemplate template = this.getHibernateTemplate();
		
		List<?> list = template.find(id);
				
		return (GzfSqb)list.get(0);
	}

}
