package com.dk.scorecheckdemo.po;

import java.util.Date;

public class CoursePo {
    private String cosId;

    private String cosName;

    private String cosType;

    private String cosgId;

    private Double cosCredit;

    private Date cosStart;

    private Date cosEnd;

    private String tchId;

    private String cosDesc;

    public String getCosId() {
        return cosId;
    }

    public void setCosId(String cosId) {
        this.cosId = cosId == null ? null : cosId.trim();
    }

    public String getCosName() {
        return cosName;
    }

    public void setCosName(String cosName) {
        this.cosName = cosName == null ? null : cosName.trim();
    }

    public String getCosType() {
        return cosType;
    }

    public void setCosType(String cosType) {
        this.cosType = cosType == null ? null : cosType.trim();
    }

    public String getCosgId() {
        return cosgId;
    }

    public void setCosgId(String cosgId) {
        this.cosgId = cosgId == null ? null : cosgId.trim();
    }

    public Double getCosCredit() {
        return cosCredit;
    }

    public void setCosCredit(Double cosCredit) {
        this.cosCredit = cosCredit;
    }

    public Date getCosStart() {
        return cosStart;
    }

    public void setCosStart(Date cosStart) {
        this.cosStart = cosStart;
    }

    public Date getCosEnd() {
        return cosEnd;
    }

    public void setCosEnd(Date cosEnd) {
        this.cosEnd = cosEnd;
    }

    public String getTchId() {
        return tchId;
    }

    public void setTchId(String tchId) {
        this.tchId = tchId == null ? null : tchId.trim();
    }

    public String getCosDesc() {
        return cosDesc;
    }

    public void setCosDesc(String cosDesc) {
        this.cosDesc = cosDesc == null ? null : cosDesc.trim();
    }
}