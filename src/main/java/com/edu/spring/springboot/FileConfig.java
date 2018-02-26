package com.edu.spring.springboot;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;


/**
 * 加载外部的配置
 * @PropertySource可以加载一个外部的配置（但是可以注解多次）
 * @PropertySources可以加载多个外部的配置
 * @author YJ
 */
@Configuration
//@PropertySource("classpath:jdbc.properties") //或者直接放n个
@PropertySources({@PropertySource("classpath:jdbc.properties")})  //里面放多个
public class FileConfig {

}
