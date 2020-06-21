package com.ccv.mzbank.action;

import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.ccv.mzbank.domain.GzfSqb;
import com.ccv.mzbank.service.IGzfSqbService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.org.apache.regexp.internal.recompile;


public class GzfSqbAction extends ActionSupport implements ModelDriven<GzfSqb>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IGzfSqbService gzfSqbService;
	
	private static Logger logger = Logger.getLogger(GzfSqbAction.class);
	private GzfSqb gzfSqb = new GzfSqb();
	@Override
	public GzfSqb getModel() {
		// TODO Auto-generated method stub
		return gzfSqb;
	}
	public void saveGzfSqb() throws IOException {
		HttpServletResponse response = ServletActionContext.getResponse();
		logger.info("--------------->接收的domain："+ gzfSqb);
		gzfSqb.setBusinessId(UUID.randomUUID().toString().replace("-", ""));
		gzfSqb.setStartDate(new Date());
		gzfSqbService.saveGzfSqb(gzfSqb);
		logger.info("调用service保存申请数据");
		response.getWriter().write("恭喜你，申请成功");
		/* return "恭喜你，申请成功"; */
	}
	
	public GzfSqb name() {
		String queryString = "select * from gzfsqb";
		GzfSqb sqb = gzfSqbService.finSqb(queryString);
		logger.info("-------------------->"+ sqb);
		return sqb;
	}
	public IGzfSqbService getGzfSqbService() {
		return gzfSqbService;
	}
	public void setGzfSqbService(IGzfSqbService gzfSqbService) {
		this.gzfSqbService = gzfSqbService;
	}
}