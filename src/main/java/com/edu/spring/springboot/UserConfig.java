package com.edu.spring.springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 两种获取配置的方法
 * 配置文件默认的文件名字为application.properties，默认的位置在classoath根目录，
 * 或者classpath:/config，file:/,file:config/
 * 
 * 默认的配置文件名字可以使用--spring.config.name来指定，只需要指定文件的名字，文件扩展名可以省略
 * 默认的配置文件路径可以使用--spring.config.location来指定，配置文件是要指定全路径，包括目录和文件名，还可以指定多个，多个用逗号隔开
 * 文件的指定方式有2种：1：classpath： 2：file：
 * @author YJ
 */
@Component  //spring容器管理
public class UserConfig {
	
	@Value("${local.port}")
	private String localPort;
	
	@Value("${local.port}")
	private Integer localPort2;
	
	/**
	 * 默认必须有配置项，配置项可以为空。如果没有配置项，则可以给默认值
	 */
	@Value("${tomcat.port:9090}")
	private String tomcatPort;
	
	@Autowired
	private Environment evn;
	
	
	public void show(){
		System.out.println("local.ip="+evn.getProperty("local.ip"));
		System.out.println("local.ip="+evn.getProperty("local.port",Integer.class)); //转成整数
		System.out.println("tomcat.port="+tomcatPort);
		System.out.println("local.port="+localPort);
		System.out.println("local.port2="+localPort2);
		
		System.out.println("name="+evn.getProperty("name"));
		System.out.println("app.name="+evn.getProperty("app.name"));
	}

}
