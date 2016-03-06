package com.gl.webforair.core.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gl.webforair.core.dao.IHourAQIDao;
import com.gl.webforair.core.po.HourAQI;
import com.gl.webforair.core.service.IHourAQIService;

@Service
public class HourAQIServiceImpl implements IHourAQIService {

	@Autowired
	private IHourAQIDao hourAQIDao;
	
	@Override
	@Transactional
	public void add(List<HourAQI> datalist) {
		for (HourAQI hourAQI : datalist) {
			hourAQIDao.insert(hourAQI);
		}
	}

	@Override
	public void deleteAll() {
		hourAQIDao.deleteAll();
	}

	@Override
	public List<HourAQI> listAll() {
		return hourAQIDao.selectAll();
	}

	@Override
	@Transactional
	public void syncData(List<HourAQI> datalist) {
		hourAQIDao.deleteAll();
		for (HourAQI hourAQI : datalist) {
			hourAQIDao.insert(hourAQI);
		}
	}

}
