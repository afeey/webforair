package com.gl.webforair.core.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-03-06T20:23:18.885+08:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "WebServiceForAirHttpGet")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface WebServiceForAirHttpGet {

    /**
     * 获取每小时站点审核AQI数据<br/>
     *             portId:4(新区办事处)
     */
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "GetHourAQI")
    public java.lang.String getHourAQI(
        @WebParam(partName = "portId", name = "portId", targetNamespace = "http://tempuri.org/")
        java.lang.String portId,
        @WebParam(partName = "beginTime", name = "beginTime", targetNamespace = "http://tempuri.org/")
        java.lang.String beginTime,
        @WebParam(partName = "endTime", name = "endTime", targetNamespace = "http://tempuri.org/")
        java.lang.String endTime
    );

    /**
     * 获取每小时站点实时AQI数据<br/>
     *             portId:4(新区办事处)
     */
    @WebResult(name = "string", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "GetRealHourAQI")
    public java.lang.String getRealHourAQI(
        @WebParam(partName = "portId", name = "portId", targetNamespace = "http://tempuri.org/")
        java.lang.String portId,
        @WebParam(partName = "beginTime", name = "beginTime", targetNamespace = "http://tempuri.org/")
        java.lang.String beginTime,
        @WebParam(partName = "endTime", name = "endTime", targetNamespace = "http://tempuri.org/")
        java.lang.String endTime
    );
}
