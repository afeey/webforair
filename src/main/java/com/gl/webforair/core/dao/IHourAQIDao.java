package com.gl.webforair.core.dao;

import java.util.List;

import com.gl.webforair.core.po.HourAQI;

/**
 * HourAQI数据层接口
 * 
 * @author afeey
 *
 */
public interface IHourAQIDao {
	
	/**
	 * 新增数据记录
	 * 
	 * @param aqiData
	 *            数据记录对象
	 * @return 影响的记录数
	 */
	int insert(HourAQI aqiData);

	/**
	 * 删除所有数据记录
	 */
	int deleteAll();
	

	/**
	 * 查询所有数据
	 * @return 数据集合
	 */
	List<HourAQI> selectAll();
}