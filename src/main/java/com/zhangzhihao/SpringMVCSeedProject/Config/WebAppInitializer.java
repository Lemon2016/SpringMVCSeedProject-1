/*
package com.zhangzhihao.SpringMVCSeedProject.Config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	*/
/**
	 * Specify {@link Configuration @Configuration}
	 * and/or {@link Component @Component} classes to be
	 * provided to the {@linkplain #createRootApplicationContext() root application context}.
	 *
	 * @return the configuration classes for the root application context, or {@code null}
	 * if creation and registration of a root context is not desired
	 *//*


	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{RootConfig.class};
	}

	*/
/**
	 * Specify {@link Configuration @Configuration}
	 * and/or {@link Component @Component} classes to be
	 * provided to the {@linkplain #createServletApplicationContext() dispatcher servlet
	 * application context}.
	 *
	 * @return the configuration classes for the dispatcher servlet application context or
	 * {@code null} if all configuration is specified through root config classes.
	 *//*


	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{WebConfig.class};
	}

	*/
/**
	 * Specify the servlet mapping(s) for the {@code DispatcherServlet} &mdash;
	 * for example {@code "/"}, {@code "/app"}, etc.
	 *//*


	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
}*/
