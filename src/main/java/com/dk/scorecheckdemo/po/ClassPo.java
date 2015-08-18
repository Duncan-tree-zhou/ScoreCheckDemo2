package com.dk.scorecheckdemo.po;

import java.util.Date;

public class ClassPo {
    private String clsId;

    private Date clsStart;

    private Date clsEnd;

    private String clsType;

    private String clsDesc;

    public String getClsId() {
        return clsId;
    }

    public void setClsId(String clsId) {
        this.clsId = clsId == null ? null : clsId.trim();
    }

    public Date getClsStart() {
        return clsStart;
    }

    public void setClsStart(Date clsStart) {
        this.clsStart = clsStart;
    }

    public Date getClsEnd() {
        return clsEnd;
    }

    public void setClsEnd(Date clsEnd) {
        this.clsEnd = clsEnd;
    }

    public String getClsType() {
        return clsType;
    }

    public void setClsType(String clsType) {
        this.clsType = clsType == null ? null : clsType.trim();
    }

    public String getClsDesc() {
        return clsDesc;
    }

    public void setClsDesc(String clsDesc) {
        this.clsDesc = clsDesc == null ? null : clsDesc.trim();
    }
}