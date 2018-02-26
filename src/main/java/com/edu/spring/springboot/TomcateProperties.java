package com.edu.spring.springboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 支持获取数组，集合
 * 配置方法 name[index]=value
 * @author YJ
 *
 */
@Component
@ConfigurationProperties("ds")
public class TomcateProperties {
	
	private List<String> hosts = new ArrayList<>();
	
	private String[] ports;
	
	public String[] getPorts() {
		return ports;
	}

	public void setPorts(String[] ports) {
		this.ports = ports;
	}

	public List<String> getHosts() {
		return hosts;
	}

	public void setHosts(List<String> hosts) {
		this.hosts = hosts;
	}

	@Override
	public String toString() {
		return "TomcateProperties [hosts=" + hosts +",ports="+Arrays.asList(ports)+ "]";
	}
	
	
}
