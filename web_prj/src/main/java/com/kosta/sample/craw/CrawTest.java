package com.kosta.sample.craw;
import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawTest {
	
	public ArrayList<NewsVO> getNaverNews() {
		String url = "https://news.naver.com/section/101";
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
			//System.out.println(doc.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Elements liList = doc.select("#newsct > div.section_latest > div > div.section_latest_article._CONTENT_LIST._PERSIST_META > div:nth-child(1) > ul > li");
		//System.out.println(el.toString());
		
		ArrayList<NewsVO> list = new ArrayList<NewsVO>();
		for(Element li : liList)  {
			String href = li.select("div > div > div.sa_thumb._LAZY_LOADING_ERROR_HIDE > div > a").attr("href");
			//Elements e = li.select("div > div > div.sa_thumb._LAZY_LOADING_ERROR_HIDE > div > a > img"); //.attr("src");
			String img = li.select("div > div > div.sa_thumb._LAZY_LOADING_ERROR_HIDE > div > a > img").attr("data-src");
			String title = li.select("div > div > div.sa_text > a > strong").text();
			String ref = li.select("div > div > div.sa_text > div.sa_text_info > div.sa_text_info_left > div.sa_text_press").text();
			
			NewsVO nvo = new NewsVO();
			nvo.setHref(href);
			nvo.setImg(img);
			nvo.setTitle(title);
			nvo.setRef(ref);
			list.add(nvo);
			//System.out.println(title + "," + ref);	
		}
		return list;
	}
	
//	public static void main(String[] args) {
//		CrawTest ct = new CrawTest();
//		ArrayList<NewsVO> list = ct.getNaverNews();
//		System.out.println(list.size());
//		for(NewsVO nvo : list) {
//			System.out.println(nvo.getTitle());
//		}
//	}

}
