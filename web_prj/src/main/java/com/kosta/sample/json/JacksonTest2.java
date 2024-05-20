package com.kosta.sample.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTest2 {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		String jsonStr = "{\r\n" + "  \"name\": \"KOSTA\",\r\n" + "  \"id\": \"u0001\",\r\n"
				+ "  \"displayName\": {\r\n" + "  	\"desc\": \"this is kosta\",\r\n" + "  	\"code\": \"g01\"\r\n"
				+ "  },\r\n" + "  \"types\": [\"type1\",\"type2\"],\r\n" + "  \"primaryType\": \"ptype\"\r\n" + "}";

		ObjectMapper mapper = new ObjectMapper();
		// HashMap사용
		HashMap map = new HashMap();
		map = mapper.readValue(jsonStr, HashMap.class);
		HashMap map2 = new HashMap();
		map2 = (HashMap) map.get("displayName");
		ArrayList<HashMap> map3 = (ArrayList<HashMap>) map.get("types");
		System.out.println("code = " + map2.get("code"));
		System.out.println("types = " + map3.get(0));
		System.out.println("id = " + map.get("id"));

		// VO사용해서 출력
		
	}

}

class GmapVO{
	public GmapVO() {}
	private String name;
	private String id;
	private DisplayNameVO displayName;
	private ArrayList<String> types;
	private String primaryType;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public DisplayNameVO getDisplayName() {
		return displayName;
	}
	public void setDisplayName(DisplayNameVO displayName) {
		this.displayName = displayName;
	}
	public ArrayList<String> getTypes() {
		return types;
	}
	public void setTypes(ArrayList<String> types) {
		this.types = types;
	}
	public String getPrimaryType() {
		return primaryType;
	}
	public void setPrimaryType(String primaryType) {
		this.primaryType = primaryType;
	}
	
}

class DisplayNameVO{
	public DisplayNameVO() {}
	private String desc;
	private String code; 
}

