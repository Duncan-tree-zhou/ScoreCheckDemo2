package com.dk.scorecheckdemo.po;

import java.sql.Date;

public class ScorePoCustom extends ScorePo {
	
	private String cosgName;
	private String cosName;
	private String tchName;
	private Date startDate;
	private Date endDate;
	public String getCosgName() {
		return cosgName;
	}
	public void setCosgName(String cosgName) {
		this.cosgName = cosgName;
	}
	public String getCosName() {
		return cosName;
	}
	public void setCosName(String cosName) {
		this.cosName = cosName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getTchName() {
		return tchName;
	}
	public void setTchName(String tchName) {
		this.tchName = tchName;
	}
	
	

}
