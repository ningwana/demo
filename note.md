# demo
springboot demo 项目笔记

什么是springboot？
内置Tomcat，提供了自动配置，搭建spring应用的脚手架(可快速搭建spring应用)
解决了spring复杂的配置和混乱的依赖关系
--------------------------------------------------------------------------------------
<!--所有的springboot应用都要以该工程为父工程-->
<parent>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-parent</artifactId>
<version>2.1.8.RELEASE</version>
</parent>
<!--启动器：每一个启动器都是依赖很多其他依赖，不用关心版本号和冲突问题-->
<dependencies>
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-web</artifactId>
</dependency>
</dependencies>
---------------------------------------------------------------------------------------
Springboot的几个注解：
@RestController注解等于ResponseBody+Controller，被注解的Controller都应该返回json类型的数据
@EnableAutoConfiguration  (开启自动配置) 在classpath中引入什么依赖，此注解会配置相应的配置文件
@ComponentScan (注解扫描) 类似于<context:component-scanbase-package="">扫描该类所在的包，以及它的子包
@SpringbootConfiguration 本质是@Configuration 声明一个类是java配置类 比如说连接池
@SpringBootApplication //使用组合注解已经包含ComponentScan和EnableAutoConfiguration和SpringbootConfiguration 
@ConfigurationProperties(prefix="jdbc")  通过set，get方法从application.properties文件中读取
@EnableConfigurationProperties(JdbcProperties.class) 在配置类上开启这个注解，注入jdbcproperties
---------------------------------------------------------------------------------------
Spring的几个注解：
@Configuration 声明一个类是注解类，相当于xml配置文件，例如：DataSource配置
@PropertySource 读取资源文件，例如：resources目录下的jdbc.properties文件
@Bean 标记在方法上，把方法的返回值注入到spring容器注册bean
@Value("${jdbc.driverClassName}")：从jdbc.properties文件中获取值
---------------------------------------------------------------------------------------
springboot的四种属性注入方式：
1.@Autowired注入
2.构造方法注入
3.@Bean方法形参注入
4.直接在@Bean方法上使用@ConfigurationProperties(prefix = "jdbc")
---------------------------------------------------------------------------------------
Springboot默认配置文件：application.properties  / application.yml
