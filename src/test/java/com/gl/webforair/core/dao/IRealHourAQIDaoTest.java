package com.gl.webforair.core.dao;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gl.webforair.BaseTest;
import com.gl.webforair.core.po.RealHourAQI;


public class IRealHourAQIDaoTest extends BaseTest{

	@Autowired
	private IRealHourAQIDao aqiDataDao;
	
	@Test
	public void testInsert() {
		
		for (int i = 0; i < 10; i++) {
			RealHourAQI aqiData = new RealHourAQI();
			aqiData.setPortname("test" + i);
			aqiDataDao.insert(aqiData);
		}
		//assertNotEquals(0, aqiData);
	}

	@Test
	public void testDeleteAll() {
		aqiDataDao.deleteAll();
		
		List<RealHourAQI> list = aqiDataDao.selectAll();
		
		assertTrue(list.size()==0);
	}

	@Test
	public void testSelectByParams() {
		
		List<RealHourAQI> list = aqiDataDao.selectAll();
		
		System.out.println(list.size());
		assertTrue(list.size()>1000);
	}
	
	@Test
	public void testConnect(){
		try {
		    Class.forName("com.hxtt.sql.access.AccessDriver");
		    String url = "jdbc:access:/D:/Git/webforair/doc/air.accdb";
		    Connection con = DriverManager.getConnection(url);
		    System.out.println("Connected!");
		    con.close();
		} catch (SQLException e) {
		    System.out.println("SQL Exception: "+ e.toString());
		} catch (ClassNotFoundException cE) {
		    System.out.println("Class Not Found Exception: "+ cE.toString());
		}
	}

}
