package com.dk.scorecheckdemo.po;

public class PositionPo {
    private String psnId;

    private String psnName;

    private String psnDesc;

    public String getPsnId() {
        return psnId;
    }

    public void setPsnId(String psnId) {
        this.psnId = psnId == null ? null : psnId.trim();
    }

    public String getPsnName() {
        return psnName;
    }

    public void setPsnName(String psnName) {
        this.psnName = psnName == null ? null : psnName.trim();
    }

    public String getPsnDesc() {
        return psnDesc;
    }

    public void setPsnDesc(String psnDesc) {
        this.psnDesc = psnDesc == null ? null : psnDesc.trim();
    }
}