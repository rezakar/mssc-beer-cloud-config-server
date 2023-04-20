package com.mssccloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MsscCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsscCloudConfigServerApplication.class, args);
	}

}
