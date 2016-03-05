package com.gl.webforair.core.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gl.webforair.core.dao.IRealHourAQIDao;
import com.gl.webforair.core.po.RealHourAQI;
import com.gl.webforair.core.service.IRealHourAQIService;

@Service
public class RealHourAQIServiceImpl implements IRealHourAQIService {

	@Autowired
	private IRealHourAQIDao aqiDataDao;
	
	@Override
	@Transactional
	public void add(List<RealHourAQI> datalist) {
		for (RealHourAQI aqiData : datalist) {
			aqiDataDao.insert(aqiData);
		}
	}

	@Override
	public void deleteAll() {
		aqiDataDao.deleteAll();
	}

	@Override
	public List<RealHourAQI> listAll() {
		return aqiDataDao.selectAll();
	}

	@Override
	@Transactional
	public void syncData(List<RealHourAQI> datalist) {
		aqiDataDao.deleteAll();
		for (RealHourAQI aqiData : datalist) {
			aqiDataDao.insert(aqiData);
		}
	}

}
