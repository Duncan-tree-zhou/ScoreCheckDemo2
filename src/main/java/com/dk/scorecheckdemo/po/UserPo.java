package com.dk.scorecheckdemo.po;

import java.util.Date;

public class UserPo {
    private String uid;

    private String uname;

    private String upassword;

    private Integer uprivilege;

    private String uFnId;

    private Integer logCount;

    private Date lastVisit;

    private String lastIp;
    

    public UserPo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserPo(String uid, String uname, String upassword,
			Integer uprivilege, String uFnId, Integer logCount, Date lastVisit,
			String lastIp) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upassword = upassword;
		this.uprivilege = uprivilege;
		this.uFnId = uFnId;
		this.logCount = logCount;
		this.lastVisit = lastVisit;
		this.lastIp = lastIp;
	}

	public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public Integer getUprivilege() {
        return uprivilege;
    }

    public void setUprivilege(Integer uprivilege) {
        this.uprivilege = uprivilege;
    }

    public String getuFnId() {
        return uFnId;
    }

    public void setuFnId(String uFnId) {
        this.uFnId = uFnId == null ? null : uFnId.trim();
    }

    public Integer getLogCount() {
        return null==logCount?0:logCount;
    }

    public void setLogCount(Integer logCount) {
        this.logCount = logCount;
    }

    public Date getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }
}