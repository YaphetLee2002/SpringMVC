package com.skooch.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class ServletContainerInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}



////定义Servlet容器启动的配置类，加载Spring配置
//public class ServletContainerInitConfig extends AbstractDispatcherServletInitializer {
//
//    //加载SpringMvc容器配置
//    protected WebApplicationContext createServletApplicationContext() {
//        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
//        applicationContext.register(SpringMvcConfig.class);
//
//        return applicationContext;
//    }
//
//    //设置哪些请求归属SpringMvc处理
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//
//    //加载Spring容器配置
//    protected WebApplicationContext createRootApplicationContext() {
//        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
//        applicationContext.register(SpringConfig.class);
//
//        return applicationContext;
//    }
//}
