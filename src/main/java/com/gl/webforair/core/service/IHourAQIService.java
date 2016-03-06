package com.gl.webforair.core.service;

import java.util.List;

import com.gl.webforair.core.po.HourAQI;

/**
 * HourAQI数据服务层接口
 * 
 * @author afeey
 *
 */
public interface IHourAQIService {
	
	/**
	 * 添加数据
	 * @param datalist
	 */
	void add(List<HourAQI> datalist);
	
	/**
	 * 删除所有记录
	 */
	void deleteAll();
	
	/**
	 * 查询所有数据
	 * @return 数据集合
	 */
	List<HourAQI> listAll();
	
	/**
	 * 同步数据
	 * @param datalist 数据列表
	 */
	void syncData(List<HourAQI> datalist);
}