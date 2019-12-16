package com.vd.springcloudconsulservicedescovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker
public class SpringcloudconsulservicedescoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudconsulservicedescoveryApplication.class, args);
	}

}
