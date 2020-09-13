package cn.nw.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("cn.nw.service.mapper")  //Mapper接口的扫描
public class NwServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(NwServiceProviderApplication.class, args);
	}

}
