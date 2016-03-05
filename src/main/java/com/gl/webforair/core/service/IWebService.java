package com.gl.webforair.core.service;

import java.util.Date;

/**
 * webservice接口
 * 
 * @author afeey
 *
 */
public interface IWebService {
	
	/**
	 * 获取每小时站点审核AQI数据
	 * @param portId portId:4(新区办事处)
	 * @param start 起始日期
	 * @param end 结束日期
	 * @return JSON字符串
	 */
	String getHourAQI(Integer portId,Date start,Date end);
	
	
	/**
	 * 获取每小时站点实时AQI数据
	 * @param portId portId:4(新区办事处)
	 * @param start 起始日期
	 * @param end 结束日期
	 * @return JSON字符串
	 */
	String getRealHourAQI(Integer portId,Date start,Date end);
	
}