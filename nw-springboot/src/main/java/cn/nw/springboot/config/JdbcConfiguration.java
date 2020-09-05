package cn.nw.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfiguration {

    /*@Autowired
    private JdbcProperties jdbcProperties;*/

    //构造方法注入
    /*public JdbcConfiguration(JdbcProperties jdbcProperties){
        this.jdbcProperties=jdbcProperties;
    }*/

    //@ConfigurationProperties(prefix = "jdbc")
    @Bean //把方法的返回值注入spring容器
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }

}
