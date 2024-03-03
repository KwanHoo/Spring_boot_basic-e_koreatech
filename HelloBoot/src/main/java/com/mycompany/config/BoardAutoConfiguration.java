package com.mycompany.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties(MyDataSourceProperties.class)
public class BoardAutoConfiguration {
	@Autowired
	private MyDataSoruceProperties properties;
	
	@Bean
	public MyDataSource getMyDataSoruce() {
		MyDataSource dataSource = new MyDataSource();
		dataSource.setDriverClass("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("hr");
		dataSource.setPassword("hr");
		return dataSource;
	}
	
}
