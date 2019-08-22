package com.trgis.sb2sc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableDiscoveryClient
@SpringBootApplication
@EnableTurbine
@EnableHystrixDashboard
@Qualifier("consulRegistration")
public class Sb2scDashboardApplication {
	public static void main(String[] args) {
		SpringApplication.run(Sb2scDashboardApplication.class, args);
	}
}
