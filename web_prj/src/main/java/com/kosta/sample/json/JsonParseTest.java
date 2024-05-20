package com.kosta.sample.json;

import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;

public class JsonParseTest {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {

		String jsonStr = "{\r\n" + "  \"elements\":[\r\n" + "    {\"profile_nickname\":\"사랑하는 아내♥️\",\r\n"
				+ "    \"profile_thumbnail_image\":\"\",\r\n" + "    \"id\":149,\r\n"
				+ "    \"uuid\":\"Q3JAcU..xxxxxx.Up6T3sd\",\r\n" + "    \"favorite\":true}\r\n" + "  ],\r\n" + "\r\n"
				+ "  \"total_count\":1,\r\n"
				+ "  \"after_url\":null,\"result_id\":\"zbnYtN-...xxxxx...pdPgCA\",\"favorite_count\":1\r\n" + "}";


		ObjectMapper mapper = new ObjectMapper();


		HashMap map = new HashMap();
		map = mapper.readValue(jsonStr, HashMap.class);
 		System.out.println(map.get("elements").getClass());
//		System.out.println(map);
		
		ArrayList<HashMap> elements = (ArrayList<HashMap>) map.get("elements");
		System.out.println(elements.get(0).get("profile_nickname"));
		System.out.println(elements.get(0).get("id"));
		System.out.println(elements.get(0).get("uuid"));
		
	}

	class TestData {
		public String profile_nickname;
		public String id;
		public String uuid;
		public String total_count;

		public void Print() {
			System.out.println(this.profile_nickname);
			System.out.println(this.id);
			System.out.println(this.uuid);
			System.out.println(this.total_count);
		}
	}

}
