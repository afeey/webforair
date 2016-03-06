package com.gl.webforair.core.service.imp;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gl.webforair.core.po.HourAQI;
import com.gl.webforair.core.po.RealHourAQI;
import com.gl.webforair.core.service.IHourAQIService;
import com.gl.webforair.core.service.IRealHourAQIService;
import com.gl.webforair.core.service.IWebService;

/**
 * 同步任务
 * @author afeey
 *
 */
public class SyncJobImpl {
	
	private static final Logger log = LoggerFactory.getLogger(SyncJobImpl.class);
	
	@Autowired
	private IWebService webService;
	@Autowired
	private IHourAQIService hourAQIService;
	@Autowired
	private IRealHourAQIService realHourAQIService;
	
	/**
	 * 任务执行方法
	 */
	public void execute(){
		log.info("开始执行同步");
		
		try {

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			// 获取结束日期
			Date end = sdf.parse(sdf.format(new Date()));
			// 计算起始日期
			Calendar cal = Calendar.getInstance();
			cal.setTime(end);
			cal.add(Calendar.DAY_OF_MONTH, -1);
			Date start = sdf.parse(sdf.format(cal.getTime()));

			log.info("同步HourAQI数据...");
			String json = webService.getHourAQI(4, end, end);
			List<HourAQI> hourAQIList = jsonToHourAQIList(json);
			hourAQIService.syncData(hourAQIList);
			
			log.info("同步RealHourAQI数据...");
			json = webService.getRealHourAQI(4, start, end);
			List<RealHourAQI> realHourAQIList = jsonToRealHourAQIList(json);
			realHourAQIService.syncData(realHourAQIList);
			
			log.debug(json);
			
		} catch (ParseException e) {
			log.error(e.getStackTrace().toString());
		}
		
		log.info("同步执行完成");
	}
	
	/**
	 * HourAQI数据json转数据列表
	 * @return
	 */
	private List<HourAQI> jsonToHourAQIList(String json){
		
		List<HourAQI> list = new ArrayList<HourAQI>();
		try {
			ObjectMapper mapper = new ObjectMapper();  
            JsonNode rootNode = mapper.readTree(json);
            JsonNode dataNode = rootNode.get(0).get("HourAQIData");
			
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            for(int i=0;i<dataNode.size();i++){
            	JsonNode data = dataNode.get(i);
            	
            	HourAQI aqiData = new HourAQI();
            	aqiData.setPortname(data.get("portname").asText());
            	aqiData.setDateTime(sdf.parse(data.get("DataTime").asText()));
            	aqiData.setSO2(data.get("SO2").asText());
            	aqiData.setSO2_IAQI(data.get("SO2_IAQI").asText());
            	aqiData.setNO2(data.get("NO2").asText());
            	aqiData.setNO2_IAQI(data.get("NO2_IAQI").asText());
            	aqiData.setNOX(data.get("NOX").asText());
            	aqiData.setPM10(data.get("PM10").asText());
            	aqiData.setPM10_IAQI(data.get("PM10_IAQI").asText());
            	aqiData.setPM10_Avg24(data.get("PM10_Avg24").asText());
            	aqiData.setPM10_Avg24_IAQI(data.get("PM10_Avg24_IAQI").asText());
            	aqiData.setCO(data.get("CO").asText());
            	aqiData.setCO_IAQI(data.get("CO_IAQI").asText());
            	aqiData.setO3(data.get("O3").asText());
            	aqiData.setO3_IAQI(data.get("O3_IAQI").asText());
            	aqiData.setO3_Avg8(data.get("O3_Avg8").asText());
            	aqiData.setO3_Avg8_IAQI(data.get("O3_Avg8_IAQI").asText());
            	aqiData.setPM2d5(data.get("PM2d5").asText());
            	aqiData.setPM2d5_IAQI(data.get("PM2d5_IAQI").asText());
            	aqiData.setPM2d5_Avg24(data.get("PM2d5_Avg24").asText());
            	aqiData.setPM2d5_Avg24_IAQI(data.get("PM2d5_Avg24_IAQI").asText());
            	aqiData.setAQIValue(data.get("AQIValue").asText());
            	aqiData.setPrimaryPollutant(data.get("PrimaryPollutant").asText());
            	aqiData.setDClass(data.get("Class").asText());
            	aqiData.setGrade(data.get("Grade").asText());
            	aqiData.setHealthEffect(data.get("HealthEffect").asText());
            	aqiData.setTakeStep(data.get("TakeStep").asText());
            	
            	list.add(aqiData);
            }
			log.debug("抓取记HourAQI录数：" + list.size());
			
		} catch (ParseException e) {
			log.debug(e.getStackTrace().toString());
		}catch (JsonParseException e) {
			log.debug(e.getStackTrace().toString());
		} catch (JsonMappingException e) {
			log.debug(e.getStackTrace().toString());
		} catch (IOException e) {
			log.debug(e.getStackTrace().toString());
		}
		
		return list;
	}
	
	/**
	 * RealHourAQI数据json转数据列表
	 * @return
	 */
	private List<RealHourAQI> jsonToRealHourAQIList(String json){
		
		List<RealHourAQI> list = new ArrayList<RealHourAQI>();
		try {
			ObjectMapper mapper = new ObjectMapper();  
            JsonNode rootNode = mapper.readTree(json);
            JsonNode dataNode = rootNode.get(0).get("HourAQIData");
			
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            for(int i=0;i<dataNode.size();i++){
            	JsonNode data = dataNode.get(i);
            	
            	RealHourAQI aqiData = new RealHourAQI();
            	aqiData.setPortname(data.get("portname").asText());
            	aqiData.setDateTime(sdf.parse(data.get("dateTime").asText()));
            	aqiData.setSO2(data.get("SO2").asText());
            	aqiData.setSO2_IAQI(data.get("SO2_IAQI").asText());
            	aqiData.setNO2(data.get("NO2").asText());
            	aqiData.setNO2_IAQI(data.get("NO2_IAQI").asText());
            	aqiData.setPM10(data.get("PM10").asText());
            	aqiData.setPM10_IAQI(data.get("PM10_IAQI").asText());
            	aqiData.setCO(data.get("CO").asText());
            	aqiData.setCO_IAQI(data.get("CO_IAQI").asText());
            	aqiData.setO3(data.get("O3").asText());
            	aqiData.setO3_IAQI(data.get("O3_IAQI").asText());
            	aqiData.setRecent8HoursO3(data.get("Recent8HoursO3").asText());
            	aqiData.setRecent8HoursO3_IAQI(data.get("Recent8HoursO3_IAQI").asText());
            	aqiData.setPM25(data.get("PM2.5").asText());
            	aqiData.setPM25_IAQI(data.get("PM2.5_IAQI").asText());
            	aqiData.setAQIValue(data.get("AQIValue").asText());
            	aqiData.setPrimaryPollutant(data.get("PrimaryPollutant").asText());
            	aqiData.setDClass(data.get("Class").asText());
            	aqiData.setGrade(data.get("Grade").asText());
            	aqiData.setHealthEffect(data.get("HealthEffect").asText());
            	aqiData.setTakeStep(data.get("TakeStep").asText());
            	
            	list.add(aqiData);
            }
			log.debug("抓取记RealHourAQI录数：" + list.size());
			
		} catch (ParseException e) {
			log.debug(e.getStackTrace().toString());
		}catch (JsonParseException e) {
			log.debug(e.getStackTrace().toString());
		} catch (JsonMappingException e) {
			log.debug(e.getStackTrace().toString());
		} catch (IOException e) {
			log.debug(e.getStackTrace().toString());
		}
		
		return list;
	}
}
