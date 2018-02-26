package com.edu.spring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * 通过启动参数来控制生效的profile
 * --spring.profiles.active=test,dev  //可以有多个
 * ||||||||||||--spring.profiles=test, 接货一个profile，默认的不激活
 * @author YJ
 *
 */
@SpringBootApplication
public class App {
    public static void main( String[] args ){
    	//ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
    	//System.out.println(context.getEnvironment().getProperty("local.ip"));
    	
    	//编程方式指定生效的profile
    	SpringApplication app = new SpringApplication(App.class);
    	app.setAdditionalProfiles("test");
    	ConfigurableApplicationContext context = app.run(args);
//    	context.getBean(UserConfig.class).show();
//    	context.getBean(JdbcConfig.class).show();
//    	context.getBean(DataSourceProperties.class).show();
//    	System.out.println(context.getBean(TomcateProperties.class));
    	System.out.println(context.getEnvironment().getProperty("jdbc.url"));
    	context.close();
    }
}
