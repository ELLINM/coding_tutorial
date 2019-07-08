package com.test.web.vo;

public class MemberVO {

	private String userid;
	private String userpwd;
	private String username;
	private String phone;
	private String address;
	private String hobby;
	private String marital;
	private String joinpath;
	
	
	public MemberVO() {
		super();
	}

	public MemberVO(String userid, String userpwd, String username, String phone, String address, String hobby,
			String marital, String joinpath) {
		super();
		this.userid = userid;
		this.userpwd = userpwd;
		this.username = username;
		this.phone = phone;
		this.address = address;
		this.hobby = hobby;
		this.marital = marital;
		this.joinpath = joinpath;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getMarital() {
		return marital;
	}

	public void setMarital(String marital) {
		this.marital = marital;
	}

	public String getJoinpath() {
		return joinpath;
	}

	public void setJoinpath(String joinpath) {
		this.joinpath = joinpath;
	}

	@Override
	public String toString() {
		return "MemberVO [userid=" + userid + ", userpwd=" + userpwd + ", username=" + username + ", phone=" + phone
				+ ", address=" + address + ", hobby=" + hobby + ", marital=" + marital + ", joinpath=" + joinpath + "]";
	}
}



package com.test.web.vo;


public class TestVO {

	private String a;
	private int b;
	
	public TestVO() {}
	public TestVO(String a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "TestVO [a=" + a + ", b=" + b + "]";
	}
}
