package com.kosta.sample.craw;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class NewsVO {
	private int seq;
	private String href;
	private String img;
	private String title;
	private String ref;
	private String regdate;
	

	
//	@ToString
//	public String toString() {
//		return "NewsVO [seq=" + seq + ", href=" + href + ", img=" + img + ", title=" + title + ", ref=" + ref
//				+ ", regdate=" + regdate + "]";
//	}
	
//	@AllArgsConstructor
//	public NewsVO(int seq, String href, String img, String title, String ref, String regdate) {
//		super();
//		this.seq = seq;
//		this.href = href;
//		this.img = img;
//		this.title = title;
//		this.ref = ref;
//		this.regdate = regdate;
//	}
	
//	@NoArgsConstructor   
//	public NewsVO() { }
	
	
	
}
