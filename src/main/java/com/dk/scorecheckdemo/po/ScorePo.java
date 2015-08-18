package com.dk.scorecheckdemo.po;

import java.util.Date;

public class ScorePo {
    private String scId;

    private String stId;

    private String csId;

    private String scName;

    private Date scDate;

    private Double scScore;

    public String getScId() {
        return scId;
    }

    public void setScId(String scId) {
        this.scId = scId == null ? null : scId.trim();
    }

    public String getStId() {
        return stId;
    }

    public void setStId(String stId) {
        this.stId = stId == null ? null : stId.trim();
    }

    public String getCsId() {
        return csId;
    }

    public void setCsId(String csId) {
        this.csId = csId == null ? null : csId.trim();
    }

    public String getScName() {
        return scName;
    }

    public void setScName(String scName) {
        this.scName = scName == null ? null : scName.trim();
    }

    public Date getScDate() {
        return scDate;
    }

    public void setScDate(Date scDate) {
        this.scDate = scDate;
    }

    public Double getScScore() {
        return scScore;
    }

    public void setScScore(Double scScore) {
        this.scScore = scScore;
    }
}