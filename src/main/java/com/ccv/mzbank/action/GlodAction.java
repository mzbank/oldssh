package com.ccv.mzbank.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.ccv.mzbank.service.GlodServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class GlodAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6614739958395482605L;

	private GlodServiceImpl glodServiceImpl;
	
	public GlodServiceImpl getGlodServiceImpl() {
		return glodServiceImpl;
	}

	public void setGlodServiceImpl(GlodServiceImpl glodServiceImpl) {
		this.glodServiceImpl = glodServiceImpl;
	}

	@Autowired
	private ApplicationContext applicationContext;
	
	private int i;
	
	public String glod() {
		glodServiceImpl.findGlod("");
		System.out.println("--------��"+GlodAction.class.getSimpleName());
		String[] names = applicationContext.getBeanDefinitionNames();
		for (String string : names) {
			System.out.println("spring�����еĵ�---------->"+ i++ +"��bean name��"+string);
		}
		return SUCCESS;
	}
}
