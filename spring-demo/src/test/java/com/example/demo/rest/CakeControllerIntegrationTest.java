package com.example.demo.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import com.example.demo.Cake;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
@Sql(scripts = { "classpath:cake-schema.sql", "classpath:cake-data.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
public class CakeControllerIntegrationTest {

	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private ObjectMapper mapper;
	
	// Create	
	@Test
	void testCreate() throws Exception {
		this.mvc.perform(
					post("/create")
						.content(this.mapper.writeValueAsString(new Cake("Chocolate", 4, 4.0)))
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isCreated())
				.andExpect(content().json(this.mapper.writeValueAsString(new Cake(3, "Chocolate", 4, 4.0))));
	}
	
	// Read
	@Test
	void testReadAll() throws Exception {
		List<Cake> cakes = List.of(new Cake(1, "Chocolate", 4, 4.0), new Cake(2, "Sponge", 12, 6.0));
		
		ResultMatcher checkBody = content().json(this.mapper.writeValueAsString(cakes));
		
		this.mvc.perform(
					get("/getAll"))
				.andExpect(status().isOk())
				.andExpect(checkBody);
	}
	
	@Test
	void testReadById() throws Exception {
		
		ResultMatcher checkBody = content().json(this.mapper.writeValueAsString(new Cake(1, "Chocolate", 4, 4.0)));
		
		this.mvc.perform(
					get("/getById/1"))
				.andExpect(status().isOk())
				.andExpect(checkBody);
	}
	
	// Update
	@Test
	void testUpdate() throws Exception {
		
		ResultMatcher checkBody = content().json(this.mapper.writeValueAsString(new Cake(1, "Lemon", 4, 4.0)));
		
		this.mvc.perform(
					patch("/update/1?flavour=Lemon"))
			.andExpect(status().isOk())
			.andExpect(checkBody);
		
	}
	
	// Delete
	@Test
	void testDelete() throws Exception {
		
		this.mvc.perform(
					delete("/delete/1"))
				.andExpect(status().isOk());
	}
	
	
}
