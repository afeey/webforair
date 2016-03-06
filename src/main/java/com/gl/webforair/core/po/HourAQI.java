package com.gl.webforair.core.po;

import java.util.Date;

/**
 * HourAQI数据实体
 * 
 * @author afeey
 *
 */
public class HourAQI {
	private Integer m_Id;
	private String m_Portname;
	private Date m_DateTime;
	private String m_SO2;
	private String m_SO2_IAQI;
	private String m_NO2;
	private String m_NO2_IAQI;
	private String m_NOX;
	private String m_PM10;
	private String m_PM10_IAQI;
	private String m_PM10_Avg24;
	private String m_PM10_Avg24_IAQI;
	private String m_CO;
	private String m_CO_IAQI;
	private String m_O3;
	private String m_O3_IAQI;
	private String m_O3_Avg8;
	private String m_O3_Avg8_IAQI;
	private String m_PM2d5;
	private String m_PM2d5_IAQI;
	private String m_PM2d5_Avg24;
	private String m_PM2d5_Avg24_IAQI;
	private String m_AQIValue;
	private String m_PrimaryPollutant;
	private String m_DClass;
	private String m_Grade;
	private String m_HealthEffect;
	private String m_TakeStep;

	/**
	 * 构造函数
	 */
	public HourAQI() {
		this.m_Id = 0;
		this.m_DateTime = new Date();
		this.m_SO2 = "";
		this.m_SO2_IAQI = "";
		this.m_NO2 = "";
		this.m_NO2_IAQI = "";
		this.m_NOX = "";
		this.m_PM10 = "";
		this.m_PM10_IAQI = "";
		this.m_PM10_Avg24 = "";
		this.m_PM10_Avg24_IAQI = "";
		this.m_CO = "";
		this.m_CO_IAQI = "";
		this.m_O3 = "";
		this.m_O3_IAQI = "";
		this.m_O3_Avg8 = "";
		this.m_O3_Avg8_IAQI = "";
		this.m_PM2d5 = "";
		this.m_PM2d5_IAQI = "";
		this.m_PM2d5_Avg24 = "";
		this.m_PM2d5_Avg24_IAQI = "";
		this.m_AQIValue = "";
		this.m_PrimaryPollutant = "";
		this.m_DClass = "";
		this.m_Grade = "";
		this.m_HealthEffect = "";
		this.m_TakeStep = "";
	}

	public Integer getId() {
		return m_Id;
	}

	public void setId(Integer m_Id) {
		this.m_Id = m_Id;
	}

	public String getPortname() {
		return m_Portname;
	}

	public void setPortname(String m_Portname) {
		this.m_Portname = m_Portname;
	}

	public Date getDateTime() {
		return m_DateTime;
	}

	public void setDateTime(Date m_DateTime) {
		this.m_DateTime = m_DateTime;
	}

	public String getSO2() {
		return m_SO2;
	}

	public void setSO2(String m_SO2) {
		this.m_SO2 = m_SO2;
	}

	public String getSO2_IAQI() {
		return m_SO2_IAQI;
	}

	public void setSO2_IAQI(String m_SO2_IAQI) {
		this.m_SO2_IAQI = m_SO2_IAQI;
	}

	public String getNO2() {
		return m_NO2;
	}

	public void setNO2(String m_NO2) {
		this.m_NO2 = m_NO2;
	}

	public String getNO2_IAQI() {
		return m_NO2_IAQI;
	}

	public void setNO2_IAQI(String m_NO2_IAQI) {
		this.m_NO2_IAQI = m_NO2_IAQI;
	}

	public String getNOX() {
		return m_NOX;
	}

	public void setNOX(String m_NOX) {
		this.m_NOX = m_NOX;
	}

	public String getPM10() {
		return m_PM10;
	}

	public void setPM10(String m_PM10) {
		this.m_PM10 = m_PM10;
	}

	public String getPM10_IAQI() {
		return m_PM10_IAQI;
	}

	public void setPM10_IAQI(String m_PM10_IAQI) {
		this.m_PM10_IAQI = m_PM10_IAQI;
	}

	public String getPM10_Avg24() {
		return m_PM10_Avg24;
	}

	public void setPM10_Avg24(String m_PM10_Avg24) {
		this.m_PM10_Avg24 = m_PM10_Avg24;
	}

	public String getPM10_Avg24_IAQI() {
		return m_PM10_Avg24_IAQI;
	}

	public void setPM10_Avg24_IAQI(String m_PM10_Avg24_IAQI) {
		this.m_PM10_Avg24_IAQI = m_PM10_Avg24_IAQI;
	}

	public String getCO() {
		return m_CO;
	}

	public void setCO(String m_CO) {
		this.m_CO = m_CO;
	}

	public String getCO_IAQI() {
		return m_CO_IAQI;
	}

	public void setCO_IAQI(String m_CO_IAQI) {
		this.m_CO_IAQI = m_CO_IAQI;
	}

	public String getO3() {
		return m_O3;
	}

	public void setO3(String m_O3) {
		this.m_O3 = m_O3;
	}

	public String getO3_IAQI() {
		return m_O3_IAQI;
	}

	public void setO3_IAQI(String m_O3_IAQI) {
		this.m_O3_IAQI = m_O3_IAQI;
	}

	public String getO3_Avg8() {
		return m_O3_Avg8;
	}

	public void setO3_Avg8(String m_O3_Avg8) {
		this.m_O3_Avg8 = m_O3_Avg8;
	}

	public String getO3_Avg8_IAQI() {
		return m_O3_Avg8_IAQI;
	}

	public void setO3_Avg8_IAQI(String m_O3_Avg8_IAQI) {
		this.m_O3_Avg8_IAQI = m_O3_Avg8_IAQI;
	}

	public String getPM2d5() {
		return m_PM2d5;
	}

	public void setPM2d5(String m_PM2d5) {
		this.m_PM2d5 = m_PM2d5;
	}

	public String getPM2d5_IAQI() {
		return m_PM2d5_IAQI;
	}

	public void setPM2d5_IAQI(String m_PM2d5_IAQI) {
		this.m_PM2d5_IAQI = m_PM2d5_IAQI;
	}

	public String getPM2d5_Avg24() {
		return m_PM2d5_Avg24;
	}

	public void setPM2d5_Avg24(String m_PM2d5_Avg24) {
		this.m_PM2d5_Avg24 = m_PM2d5_Avg24;
	}

	public String getPM2d5_Avg24_IAQI() {
		return m_PM2d5_Avg24_IAQI;
	}

	public void setPM2d5_Avg24_IAQI(String m_PM2d5_Avg24_IAQI) {
		this.m_PM2d5_Avg24_IAQI = m_PM2d5_Avg24_IAQI;
	}

	public String getAQIValue() {
		return m_AQIValue;
	}

	public void setAQIValue(String m_AQIValue) {
		this.m_AQIValue = m_AQIValue;
	}

	public String getPrimaryPollutant() {
		return m_PrimaryPollutant;
	}

	public void setPrimaryPollutant(String m_PrimaryPollutant) {
		this.m_PrimaryPollutant = m_PrimaryPollutant;
	}

	public String getDClass() {
		return m_DClass;
	}

	public void setDClass(String m_DClass) {
		this.m_DClass = m_DClass;
	}

	public String getGrade() {
		return m_Grade;
	}

	public void setGrade(String m_Grade) {
		this.m_Grade = m_Grade;
	}

	public String getHealthEffect() {
		return m_HealthEffect;
	}

	public void setHealthEffect(String m_HealthEffect) {
		this.m_HealthEffect = m_HealthEffect;
	}

	public String getTakeStep() {
		return m_TakeStep;
	}

	public void setTakeStep(String m_TakeStep) {
		this.m_TakeStep = m_TakeStep;
	}

}
