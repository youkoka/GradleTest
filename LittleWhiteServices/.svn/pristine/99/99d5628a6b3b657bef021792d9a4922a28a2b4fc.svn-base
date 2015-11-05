package com.mitake.build.configure;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

        // Create the dispatcher servlet's Spring application context
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(AppPropertyPlaceholderConfigurer.class);
        rootContext.register(AppConfigure.class);
        rootContext.register(DispatcherServlet.class);
        rootContext.setServletContext(servletContext);
        
        //Adding the listener for the rootContext
        servletContext.addListener(new ContextLoaderListener(rootContext));

        //Registering the dispatcher servlet mappings.
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(rootContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
        
	}
}
