package com.learning.dispatcher;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.learning.configr.SpringConfigr;

public class MyServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[0];
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {SpringConfigr.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
