package com.skooch.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.skooch.controller", "com.skooch.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
