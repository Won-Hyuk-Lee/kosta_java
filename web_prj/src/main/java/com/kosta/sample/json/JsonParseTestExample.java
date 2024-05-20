package com.kosta.sample.json;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParseTestExample {

	public static void main(String[] args) {
		String jsonStr = "{\"elements\":[{\"profile_nickname\":\"사랑하는 아내♥\",\"profile_thumbnail_image\":\"\",\"id\":\"149..xxx...378\",\"uuid\":\"Q3JAcU..xxxxxx.Up6T3sd\",\"favorite\":true}],\"total_count\":1,\"after_url\":null,\"result_id\":\"zbnYtN-...xxxxx...pdPgCA\",\"favorite_count\":1}";
		JSONObject obj = new JSONObject();
		JSONParser p = new JSONParser(); 
		try {
			HashMap<String,String> map2 = new HashMap<String,String>();
			p.parse(jsonStr);
//			map2 = (HashMap<String,String>)p.parse(jsonStr);
			
			obj = (JSONObject)p.parse(jsonStr);
			JSONArray elementsArray = (JSONArray) obj.get("elements");
            JSONObject elementObject = (JSONObject) elementsArray.get(0);
            String nick = (String) elementObject.get("profile_nickname");
            String id = (String) elementObject.get("id");
            String uuid = (String) elementObject.get("uuid");
            Long total  = (Long)obj.get("total_count");
            System.out.println(nick + "\t" + id + "\t" + uuid + "\t" + total);
              
		} catch (ParseException e) {
			System.err.println("str --> map convert 에러");
			e.printStackTrace();
		}
		
		
		//HashMap : str --> HashMap
		ObjectMapper mapper = new ObjectMapper(); 
		try {
			HashMap map = mapper.readValue(jsonStr, HashMap.class);
			//System.out.println("jackson:" + map);
			ArrayList<HashMap<String, Object>> elementsList = (ArrayList<HashMap<String, Object>>) map.get("elements");
			String nick = (String)elementsList.get(0).get("profile_nickname");
			String id = (String)elementsList.get(0).get("id");
			String uuid = (String)elementsList.get(0).get("uuid");
			Integer total = (Integer)map.get("total_count");
			System.out.println(nick + "\t" + id + "\t" + uuid + "\t" + total);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		
		//HashMap : str --> HashMap
		mapper = new ObjectMapper(); 
		try {
			DataVO dvo = mapper.readValue(jsonStr, DataVO.class);
			Element[] elements = dvo.getElements();
			for(Element e : elements) {
				String nick = e.getProfile_nickname();
				String uuid = e.getUuid();
				String id   = e.getId();
				int total   = dvo.getTotal_count();
				System.out.println(nick + "\t" + id + "\t" + uuid + "\t" + total);
			}
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}

// --------------------------------------------------------------
class DataVO {
    private Element[] elements;
    private int total_count;
    private String after_url;
    private String result_id;
    private int favorite_count;

    public Element[] getElements() {
        return elements;
    }

    public void setElements(Element[] elements) {
        this.elements = elements;
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public String getAfter_url() {
        return after_url;
    }

    public void setAfter_url(String after_url) {
        this.after_url = after_url;
    }

    public String getResult_id() {
        return result_id;
    }

    public void setResult_id(String result_id) {
        this.result_id = result_id;
    }

    public int getFavorite_count() {
        return favorite_count;
    }

    public void setFavorite_count(int favorite_count) {
        this.favorite_count = favorite_count;
    }

}
//--------------------------------------------------------------
class Element {
    private String profile_nickname;
    private String profile_thumbnail_image;
    private String id;
    private String uuid;
    private boolean favorite;

    public String getProfile_nickname() {
        return profile_nickname;
    }

    public void setProfile_nickname(String profile_nickname) {
        this.profile_nickname = profile_nickname;
    }

    public String getProfile_thumbnail_image() {
        return profile_thumbnail_image;
    }

    public void setProfile_thumbnail_image(String profile_thumbnail_image) {
        this.profile_thumbnail_image = profile_thumbnail_image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}


