package com.skooch.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//创建SpingMvc配置文件
@Configuration
//加载controller对应的bean
@ComponentScan("com.skooch.controller")
public class SpringMvcConfig {
}
