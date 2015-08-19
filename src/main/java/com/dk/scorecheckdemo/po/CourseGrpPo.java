package com.dk.scorecheckdemo.po;

import java.util.Date;

public class CourseGrpPo {
    private String cosgId;

    private String cosgName;

    private Date cosStart;

    private Date cosEnd;

    private String cosgDesc;

    public String getCosgId() {
        return cosgId;
    }

    public void setCosgId(String cosgId) {
        this.cosgId = cosgId == null ? null : cosgId.trim();
    }

    public String getCosgName() {
        return cosgName;
    }

    public void setCosgName(String cosgName) {
        this.cosgName = cosgName == null ? null : cosgName.trim();
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

    public String getCosgDesc() {
        return cosgDesc;
    }

    public void setCosgDesc(String cosgDesc) {
        this.cosgDesc = cosgDesc == null ? null : cosgDesc.trim();
    }
}