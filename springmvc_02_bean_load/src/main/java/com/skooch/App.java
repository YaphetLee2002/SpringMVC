package com.skooch;

import com.skooch.config.SpringConfig;
import com.skooch.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(applicationContext.getBean(UserController.class));
    }
}
