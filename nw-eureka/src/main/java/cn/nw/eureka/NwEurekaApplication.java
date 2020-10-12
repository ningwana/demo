package cn.nw.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  // 启用eureka服务端组件
public class NwEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NwEurekaApplication.class, args);
	}

}
