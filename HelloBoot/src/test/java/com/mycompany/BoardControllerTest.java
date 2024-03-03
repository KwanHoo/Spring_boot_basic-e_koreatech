package com.mycompany;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest
public class BoardControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void TestHello() throws Exception {
		// HTTP 요청
		mockMvc.perform(MockMvcRequestBuilders.get("/hello").param("name", "hwankko"))
		
		// HTTP 응답
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().string("Hello : hwankko"))
		.andDo(MockMvcResultHandlers.print());
	}

}
