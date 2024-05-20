package com.kosta.sample.json;

import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTest {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();

		String jsonStr = "{\"ename\":\"1smith\", \"empno\":\"17733\",\"sal\":\"1600\"}";

		EmpVO empvo = new EmpVO();
		empvo = mapper.readValue(jsonStr, EmpVO.class);
		System.out.println(empvo.toString());

		// hash -> str
		HashMap<String, String> map = new HashMap<String, String>();
		map = mapper.readValue(jsonStr, HashMap.class);
		System.out.println(map);

		// map -> str
		JsonNode root = mapper.readTree(jsonStr);
		System.out.println(root);

	}

}