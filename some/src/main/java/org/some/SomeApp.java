package org.some;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SomeApp {
	@Value("${my.msg}")
	private String msg="123";
	
	@RequestMapping("/getsome")
	public String getsome(){
		return msg;
	}
	
    public static void main( String[] args ){
        SpringApplication.run(SomeApp.class, args);
    }
}
