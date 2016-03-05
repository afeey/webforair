package com.gl.webforair.core.po;

import java.util.Date;

/**
 * AQI数据实体
 * 
 * @author afeey
 *
 */
public class RealHourAQI {
	private Integer id;
	private String portname;
	private Date dateTime;
	private String sO2;
	private String sO2_IAQI;
	private String nO2;
	private String nO2_IAQI;
	private String pM10;
	private String pM10_IAQI;
	private String cO;
	private String cO_IAQI;
	private String o3;
	private String o3_IAQI;
	private String recent8HoursO3;
	private String recent8HoursO3_IAQI;
	private String pM25;
	private String pM25_IAQI;
	private String aQIValue;
	private String primaryPollutant;
	private String dClass;
	private String grade;
	private String healthEffect;
	private String takeStep;
	
	/**
	 * 构造函数
	 */
	public RealHourAQI() {
		this.id=0;
		this.dateTime=new Date();
		this.sO2="";
		this.sO2_IAQI="";
		this.nO2="";
		this.nO2_IAQI="";
		this.pM10="";
		this.pM10_IAQI="";
		this.cO="";
		this.cO_IAQI="";
		this.o3="";
		this.o3_IAQI="";
		this.recent8HoursO3="";
		this.recent8HoursO3_IAQI="";
		this.pM25="";
		this.pM25_IAQI="";
		this.aQIValue="";
		this.primaryPollutant="";
		this.dClass="";
		this.grade="";
		this.healthEffect="";
		this.takeStep="";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPortname() {
		return portname;
	}

	public void setPortname(String portname) {
		this.portname = portname;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getSO2() {
		return sO2;
	}

	public void setSO2(String sO2) {
		this.sO2 = sO2;
	}

	public String getSO2_IAQI() {
		return sO2_IAQI;
	}

	public void setSO2_IAQI(String sO2_IAQI) {
		this.sO2_IAQI = sO2_IAQI;
	}

	public String getNO2() {
		return nO2;
	}

	public void setNO2(String nO2) {
		this.nO2 = nO2;
	}

	public String getNO2_IAQI() {
		return nO2_IAQI;
	}

	public void setNO2_IAQI(String nO2_IAQI) {
		this.nO2_IAQI = nO2_IAQI;
	}

	public String getPM10() {
		return pM10;
	}

	public void setPM10(String pM10) {
		this.pM10 = pM10;
	}

	public String getPM10_IAQI() {
		return pM10_IAQI;
	}

	public void setPM10_IAQI(String pM10_IAQI) {
		this.pM10_IAQI = pM10_IAQI;
	}

	public String getCO() {
		return cO;
	}

	public void setCO(String cO) {
		this.cO = cO;
	}

	public String getCO_IAQI() {
		return cO_IAQI;
	}

	public void setCO_IAQI(String cO_IAQI) {
		this.cO_IAQI = cO_IAQI;
	}

	public String getO3() {
		return o3;
	}

	public void setO3(String o3) {
		this.o3 = o3;
	}

	public String getO3_IAQI() {
		return o3_IAQI;
	}

	public void setO3_IAQI(String o3_IAQI) {
		this.o3_IAQI = o3_IAQI;
	}

	public String getRecent8HoursO3() {
		return recent8HoursO3;
	}

	public void setRecent8HoursO3(String recent8HoursO3) {
		this.recent8HoursO3 = recent8HoursO3;
	}

	public String getRecent8HoursO3_IAQI() {
		return recent8HoursO3_IAQI;
	}

	public void setRecent8HoursO3_IAQI(String recent8HoursO3_IAQI) {
		this.recent8HoursO3_IAQI = recent8HoursO3_IAQI;
	}

	public String getPM25() {
		return pM25;
	}

	public void setPM25(String pM25) {
		this.pM25 = pM25;
	}

	public String getPM25_IAQI() {
		return pM25_IAQI;
	}

	public void setPM25_IAQI(String pM25_IAQI) {
		this.pM25_IAQI = pM25_IAQI;
	}

	public String getAQIValue() {
		return aQIValue;
	}

	public void setAQIValue(String aQIValue) {
		this.aQIValue = aQIValue;
	}

	public String getPrimaryPollutant() {
		return primaryPollutant;
	}

	public void setPrimaryPollutant(String primaryPollutant) {
		this.primaryPollutant = primaryPollutant;
	}

	public String getDClass() {
		return dClass;
	}

	public void setDClass(String dClass) {
		this.dClass = dClass;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getHealthEffect() {
		return healthEffect;
	}

	public void setHealthEffect(String healthEffect) {
		this.healthEffect = healthEffect;
	}

	public String getTakeStep() {
		return takeStep;
	}

	public void setTakeStep(String takeStep) {
		this.takeStep = takeStep;
	}


}
