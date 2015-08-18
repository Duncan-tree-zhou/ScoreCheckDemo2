package com.dk.scorecheckdemo.po;

import java.util.Date;

public class LoginlogPo {
    private String llid;

    private String uid;

    private String uip;

    private Date logindate;

    public String getLlid() {
        return llid;
    }

    public void setLlid(String llid) {
        this.llid = llid == null ? null : llid.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getUip() {
        return uip;
    }

    public void setUip(String uip) {
        this.uip = uip == null ? null : uip.trim();
    }

    public Date getLogindate() {
        return logindate;
    }

    public void setLogindate(Date logindate) {
        this.logindate = logindate;
    }
}