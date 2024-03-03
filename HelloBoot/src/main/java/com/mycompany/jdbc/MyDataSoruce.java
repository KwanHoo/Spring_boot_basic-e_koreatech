package com.mycompany.jdbc;

import lombok.Data;

@Data
public class MyDataSoruce {
	private String driverClass;
	private String url;
	private String username;
	private String password;
	
	public MyDataSource() {
		System.out.println("===> MyData Source 생성");
	}

}
