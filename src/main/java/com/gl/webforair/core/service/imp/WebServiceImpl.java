package com.gl.webforair.core.service.imp;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.gl.webforair.core.service.IWebService;
import com.gl.webforair.core.webservice.WebServiceForAirSoap;

/**
 * Webservice实现类
 * 
 * @author afeey
 *
 */
@Service
public class WebServiceImpl implements IWebService {

	private static final Logger log = LoggerFactory.getLogger(WebServiceImpl.class);
	
	@Value("${ws.url}")
	private String serviceUrl; // webservice url
	
	private GregorianCalendar gc = new GregorianCalendar();
	private JaxWsProxyFactoryBean factory = null;
	private WebServiceForAirSoap client = null;

	@Override
	public String getHourAQI(Integer portId, Date start, Date end) {
		log.debug("调用getHourAQI");
		
		String data = "";

		try {
			gc.setTime(start);
			XMLGregorianCalendar xgcStart;
			xgcStart = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
			gc.setTime(end);
			XMLGregorianCalendar xgcEnd = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc); 
			
			//创建client
			if(client == null){
				factory = new JaxWsProxyFactoryBean();
				factory.setServiceClass(WebServiceForAirSoap.class);
				factory.setAddress(serviceUrl);
				client = (WebServiceForAirSoap) factory.create();
			}
			
			data = client.getHourAQI(portId, xgcStart, xgcEnd);
			
		} catch (DatatypeConfigurationException e) {
			log.error(e.getStackTrace().toString());
		}
		return data;
	}

	@Override
	public String getRealHourAQI(Integer portId, Date start, Date end) {
		log.debug("调用getRealHourAQI");
		
		String data = "";

		try {
			
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(start);
			XMLGregorianCalendar xgcStart;
			xgcStart = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
			gc.setTime(end);
			XMLGregorianCalendar xgcEnd = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc); 
			
			JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
			factory.setServiceClass(WebServiceForAirSoap.class);
			factory.setAddress(serviceUrl);

			WebServiceForAirSoap client = (WebServiceForAirSoap) factory.create();
			data = client.getRealHourAQI(portId, xgcStart, xgcEnd);
			
		} catch (DatatypeConfigurationException e) {
			log.error(e.getStackTrace().toString());
		}
		return data;
	}

}
