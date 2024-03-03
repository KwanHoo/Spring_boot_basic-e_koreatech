package com.mycompany.service;

import org.springframework.stereotype.Service;

@Service
public class BoardService {
	
	@Autowired
	private MyDataSource dataSource;
	
	public BoardService() {
		System.out.println("===> BoardService 생성");
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(dataSource.getUrl() + "DB 연결 성공");
	}
	
}
