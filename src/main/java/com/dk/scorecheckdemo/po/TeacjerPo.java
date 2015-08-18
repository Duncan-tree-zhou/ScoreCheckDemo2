package com.dk.scorecheckdemo.po;

public class TeacjerPo {
    private String tchId;

    private String tchName;

    private String tchGender;

    private String tchGroup;

    private String tchContact;

    private String tchImage;

    public String getTchId() {
        return tchId;
    }

    public void setTchId(String tchId) {
        this.tchId = tchId == null ? null : tchId.trim();
    }

    public String getTchName() {
        return tchName;
    }

    public void setTchName(String tchName) {
        this.tchName = tchName == null ? null : tchName.trim();
    }

    public String getTchGender() {
        return tchGender;
    }

    public void setTchGender(String tchGender) {
        this.tchGender = tchGender == null ? null : tchGender.trim();
    }

    public String getTchGroup() {
        return tchGroup;
    }

    public void setTchGroup(String tchGroup) {
        this.tchGroup = tchGroup == null ? null : tchGroup.trim();
    }

    public String getTchContact() {
        return tchContact;
    }

    public void setTchContact(String tchContact) {
        this.tchContact = tchContact == null ? null : tchContact.trim();
    }

    public String getTchImage() {
        return tchImage;
    }

    public void setTchImage(String tchImage) {
        this.tchImage = tchImage == null ? null : tchImage.trim();
    }
}