package com.vd.springcloudconsulservicedescovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudconsulservicedescoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudconsulservicedescoveryApplication.class, args);
	}

}
