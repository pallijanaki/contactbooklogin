package com.iberry.bean;

public class contactbook {
	
	private int id;
	private int qid;
	private String name;
	private String address;
	private String dob;
	private String telno;
	private String landlineno;
	private String website;
	private String companyname;
	
	
	public contactbook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public contactbook(String name, String address, String dob, String telno, String landlineno,
			String website, String companyname) {
		super();
		//this.id = id;
		//this.qid = qid;
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.telno = telno;
		this.landlineno = landlineno;
		this.website = website;
		this.companyname = companyname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getTelno() {
		return telno;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	public String getLandlineno() {
		return landlineno;
	}
	public void setLandlineno(String landlineno) {
		this.landlineno = landlineno;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
}
