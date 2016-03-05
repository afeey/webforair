package com.gl.webforair.core.service;

import java.util.List;

import com.gl.webforair.core.po.RealHourAQI;

/**
 * AQI数据服务层接口
 * 
 * @author afeey
 *
 */
public interface IRealHourAQIService {
	
	/**
	 * 添加数据
	 * @param datalist
	 */
	void add(List<RealHourAQI> datalist);
	
	/**
	 * 删除所有记录
	 */
	void deleteAll();
	
	/**
	 * 查询所有数据
	 * @return 数据集合
	 */
	List<RealHourAQI> listAll();
	
	/**
	 * 同步数据
	 * @param datalist 数据列表
	 */
	void syncData(List<RealHourAQI> datalist);
}