package com.kosta.sample.board;

import java.util.List;

public class BoardVO {
	//ctrl + shift + X : 대문자
	//ctrl + shift + Y : 소문자
	private int seq;            //PK sequence
	private String title;
	private String contents;
	private String regid;       //session cookie
	private String regdate;     //default sysdate
	
	//private String tag;
	
	List<ReplyVO> replies;      //1:N
	
	public BoardVO() {}
	
	
	public BoardVO(int seq, String title, String contents, String regid, String regdate) {
		//super();
		this.seq = seq;
		this.title = title;
		this.contents = contents;
		this.regid = regid;
		this.regdate = regdate;
	}

	public BoardVO(int seq, String title, String contents, String regid, 
			String regdate, List<ReplyVO> replies) {
		//super();
		this(seq, title, contents, regid, regdate);
		this.replies = replies;
	}


	public List<ReplyVO> getReplies() {
		return replies;
	}


	public void setReplies(List<ReplyVO> replies) {
		this.replies = replies;
	}


	public int getSeq() {
		return seq;
	}
	public String getTitle() {
		return title;
	}
	public String getContents() {
		return contents;
	}
	public String getRegid() {
		return regid;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public void setRegid(String regid) {
		this.regid = regid;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}


	@Override
	public String toString() {
		return "BoardVO [seq=" + seq + ", title=" + title + ", contents=" + contents + ", regid=" + regid + ", regdate="
				+ regdate + ", replies=" + replies + "]";
	}
	
}
