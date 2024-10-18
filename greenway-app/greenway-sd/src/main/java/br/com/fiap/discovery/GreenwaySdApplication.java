package br.com.fiap.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GreenwaySdApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreenwaySdApplication.class, args);
	}

}
