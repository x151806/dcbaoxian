package com.dc.pro.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ProProduct implements Serializable{
	
	private static final long serialVersionUID = 5000968872821564934L;
	
	
	private String productId;	
	private String insurance;	
	private String status;	
	private String underwrite;	
	private String cooperator;	
	private Integer agentCharge;	
	private Integer dCCharge;	
	private Date putawayTime;	
	private Date soldOutTime;	
	private Date updateTime;	
	private String updateContent;	
	private String insurancePlan;	
	private String amendsDemand;	
	private String demand;	
	private String remarks;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUnderwrite() {
		return underwrite;
	}
	public void setUnderwrite(String underwrite) {
		this.underwrite = underwrite;
	}
	public String getCooperator() {
		return cooperator;
	}
	public void setCooperator(String cooperator) {
		this.cooperator = cooperator;
	}
	public Integer getAgentCharge() {
		return agentCharge;
	}
	public void setAgentCharge(Integer agentCharge) {
		this.agentCharge = agentCharge;
	}
	public Integer getdCCharge() {
		return dCCharge;
	}
	public void setdCCharge(Integer dCCharge) {
		this.dCCharge = dCCharge;
	}
	public Date getPutawayTime() {
		return putawayTime;
	}
	public void setPutawayTime(Date putawayTime) {
		this.putawayTime = putawayTime;
	}
	public Date getSoldOutTime() {
		return soldOutTime;
	}
	public void setSoldOutTime(Date soldOutTime) {
		this.soldOutTime = soldOutTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getUpdateContent() {
		return updateContent;
	}
	public void setUpdateContent(String updateContent) {
		this.updateContent = updateContent;
	}
	public String getInsurancePlan() {
		return insurancePlan;
	}
	public void setInsurancePlan(String insurancePlan) {
		this.insurancePlan = insurancePlan;
	}
	public String getAmendsDemand() {
		return amendsDemand;
	}
	public void setAmendsDemand(String amendsDemand) {
		this.amendsDemand = amendsDemand;
	}
	public String getDemand() {
		return demand;
	}
	public void setDemand(String demand) {
		this.demand = demand;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}	
	
	
	

	
}
