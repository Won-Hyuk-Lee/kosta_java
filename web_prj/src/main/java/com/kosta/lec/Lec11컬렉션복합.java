package com.kosta.lec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lec11컬렉션복합 {

	
	
	public static void main(String[] args) {
		
		ArrayList<Map<String,String[][]>> list2 = new ArrayList<>();
		Map<String, String[][]> map2 = new HashMap<String, String[][]>();
		String[][] arr = { {"1","kim"},{"2","park"}};
		map2.put("mykey", arr);
		list2.add(map2);
		System.out.println(list2.size());
		System.out.println(list2.get(0).getClass());
		
		
		
/**		
//		---------------------------------------
//		ArrayList(HashMap)
//		---------------------------------------
//		{seq="1", title="제목1", rdate="2024-01-01", regid="kim"}
//	    {seq="2", title="제목2", rdate="2024-01-01", regid="kim2"}
 */
		
		final int DATA_ROWS = 5;
		
		//이후에 DB에서 데이터를 가져오는 형태로 변경
		ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
		for(int i=0; i<  DATA_ROWS  ; i++) {
			HashMap<String,String> map = new HashMap<String,String>();
			map.put("seq", ""+i);
			map.put("title", "제목"+i);
			map.put("rdate", "2024-01-01");
			map.put("userIdByDailtPointIn", "kim"+i);
			//ORM --> MyBatis(iBatis) --> Hibernate --> JPA
			//user_daily_point_by_
			//userDailyPointBy_
			list.add(map);
		}
		
		System.out.println("총:" + list.size());
		for(int i=0; i<list.size(); i++) {
			String seq   = list.get(i).get("seq");
			String title = list.get(i).get("title");
			String rdate = list.get(i).get("rdate");
			String regid = list.get(i).get("regid");
			System.out.println(seq + "\t" + title + "\t" + rdate + "\t" + regid);
		}
		
		
/**		
//		---------------------------------------
//		ArrayList(ArrayList)
//		---------------------------------------
//		{"1", "제목1", "2024-01-01","kim"}
//		{"2", "제목2", "2024-02-02","kim2"}
   
        ArrayList<    ArrayList<String>   > list = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> arr = new  ArrayList<String>();
		arr.add("1");      //{"1", "제목1", "2024-01-01","kim", }
		arr.add("제목1");
		arr.add("2024-01-01");
		arr.add("kim");
		list.add(arr);
		
		ArrayList<String> arr2 = new  ArrayList<String>();
		arr2.add("2");      //{"1", "제목1", "2024-01-01","kim"}
		arr2.add("제목2");
		arr2.add("2024-02-02");
		arr2.add("kim2");
		list.add(arr2);
*/
//		ArrayList<    ArrayList<String>   > list = new ArrayList<ArrayList<String>>();
//		//이후에 DB에서 데이터를 가져오는 형태로 변경
//		for (int i=0; i<4; i++) {
//			ArrayList<String> arr = new  ArrayList<String>();
//			arr.add(""+i);      //{"1", "제목1", "2024-01-01","kim", }
//			arr.add("제목"+i);
//			arr.add("2024-01-01");
//			arr.add("kim"+i);
//			list.add(arr);
//		}
		
		
		
		
		
		
//		System.out.println("총:" + list.size());
//		for(int i=0; i<list.size(); i++) {
//			String seq   = list.get(i).get(0);
//			String title = list.get(i).get(1);
//			String rdate = list.get(i).get(2);
//			String regid = list.get(i).get(3);
//			System.out.println(seq + "\t" + title + "\t" + rdate + "\t" + regid);
//		}
		
		
/**		
//		---------------------------------------
//		ArrayList(String[])
//		--------------------------------------- 
 */
//		String[] arr = {"1", "제목1", "2024-01-01","kim"};
//		ArrayList list = new ArrayList();
//		list.add(arr);
//		System.out.println(list);
//		String[] res = (String[])list.get(0);
//		System.out.println(res[1]);
		
//		String[] arr = {"1", "제목1", "2024-01-01","kim"};
//		ArrayList<String[]> list = new ArrayList<String[]>();
//		list.add(arr);
//		System.out.println( list.get(0)[1]  );
//		
//		//ArrayList list = new ArrayList();
//		//System.out.println( ( (String[])list.get(0) )[1]  ); //제네릭을 안할경우 가독성 떨어짐
		
	}

}
