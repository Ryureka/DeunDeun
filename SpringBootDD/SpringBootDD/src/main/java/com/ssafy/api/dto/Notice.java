package com.ssafy.api.dto;

public class Notice {
	private int notice;
	private int member_id;
	private String contents;

	public Notice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNotice() {
		return notice;
	}

	public void setNotice(int notice) {
		this.notice = notice;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return "Notice [notice=" + notice + ", member_id=" + member_id + ", contents=" + contents + "]";
	}

}
