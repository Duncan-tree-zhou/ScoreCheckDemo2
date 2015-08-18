package com.dk.scorecheckdemo.po;

public class StudentPo {
    private String stId;

    private String stName;

    private String stGender;

    private String stParentName;

    private String stContact;

    private String stImage;

    public String getStId() {
        return stId;
    }

    public void setStId(String stId) {
        this.stId = stId == null ? null : stId.trim();
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName == null ? null : stName.trim();
    }

    public String getStGender() {
        return stGender;
    }

    public void setStGender(String stGender) {
        this.stGender = stGender == null ? null : stGender.trim();
    }

    public String getStParentName() {
        return stParentName;
    }

    public void setStParentName(String stParentName) {
        this.stParentName = stParentName == null ? null : stParentName.trim();
    }

    public String getStContact() {
        return stContact;
    }

    public void setStContact(String stContact) {
        this.stContact = stContact == null ? null : stContact.trim();
    }

    public String getStImage() {
        return stImage;
    }

    public void setStImage(String stImage) {
        this.stImage = stImage == null ? null : stImage.trim();
    }
}