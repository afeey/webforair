package com.gl.webforair.core.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-03-06T20:23:18.921+08:00
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "WebServiceForAir", 
                  wsdlLocation = "http://221.230.54.245:9090/WebServiceForGis/WebServiceForAir.asmx?wsdl",
                  targetNamespace = "http://tempuri.org/") 
public class WebServiceForAir extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "WebServiceForAir");
    public final static QName WebServiceForAirSoap = new QName("http://tempuri.org/", "WebServiceForAirSoap");
    public final static QName WebServiceForAirSoap12 = new QName("http://tempuri.org/", "WebServiceForAirSoap12");
    public final static QName WebServiceForAirHttpGet = new QName("http://tempuri.org/", "WebServiceForAirHttpGet");
    public final static QName WebServiceForAirHttpPost = new QName("http://tempuri.org/", "WebServiceForAirHttpPost");
    static {
        URL url = null;
        try {
            url = new URL("http://221.230.54.245:9090/WebServiceForGis/WebServiceForAir.asmx?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WebServiceForAir.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://221.230.54.245:9090/WebServiceForGis/WebServiceForAir.asmx?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WebServiceForAir(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WebServiceForAir(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebServiceForAir() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns WebServiceForAirSoap
     */
    @WebEndpoint(name = "WebServiceForAirSoap")
    public WebServiceForAirSoap getWebServiceForAirSoap() {
        return super.getPort(WebServiceForAirSoap, WebServiceForAirSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceForAirSoap
     */
    @WebEndpoint(name = "WebServiceForAirSoap")
    public WebServiceForAirSoap getWebServiceForAirSoap(WebServiceFeature... features) {
        return super.getPort(WebServiceForAirSoap, WebServiceForAirSoap.class, features);
    }
    /**
     *
     * @return
     *     returns WebServiceForAirSoap
     */
    @WebEndpoint(name = "WebServiceForAirSoap12")
    public WebServiceForAirSoap getWebServiceForAirSoap12() {
        return super.getPort(WebServiceForAirSoap12, WebServiceForAirSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceForAirSoap
     */
    @WebEndpoint(name = "WebServiceForAirSoap12")
    public WebServiceForAirSoap getWebServiceForAirSoap12(WebServiceFeature... features) {
        return super.getPort(WebServiceForAirSoap12, WebServiceForAirSoap.class, features);
    }
    /**
     *
     * @return
     *     returns WebServiceForAirHttpGet
     */
    @WebEndpoint(name = "WebServiceForAirHttpGet")
    public WebServiceForAirHttpGet getWebServiceForAirHttpGet() {
        return super.getPort(WebServiceForAirHttpGet, WebServiceForAirHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceForAirHttpGet
     */
    @WebEndpoint(name = "WebServiceForAirHttpGet")
    public WebServiceForAirHttpGet getWebServiceForAirHttpGet(WebServiceFeature... features) {
        return super.getPort(WebServiceForAirHttpGet, WebServiceForAirHttpGet.class, features);
    }
    /**
     *
     * @return
     *     returns WebServiceForAirHttpPost
     */
    @WebEndpoint(name = "WebServiceForAirHttpPost")
    public WebServiceForAirHttpPost getWebServiceForAirHttpPost() {
        return super.getPort(WebServiceForAirHttpPost, WebServiceForAirHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceForAirHttpPost
     */
    @WebEndpoint(name = "WebServiceForAirHttpPost")
    public WebServiceForAirHttpPost getWebServiceForAirHttpPost(WebServiceFeature... features) {
        return super.getPort(WebServiceForAirHttpPost, WebServiceForAirHttpPost.class, features);
    }

}
