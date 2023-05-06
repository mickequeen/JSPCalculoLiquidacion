
package service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "LiquidacionSueldo", targetNamespace = "http://service/", wsdlLocation = "http://localhost:8080/WSLiquidacionSueldo/LiquidacionSueldo?wsdl")
public class LiquidacionSueldo_Service
    extends Service
{

    private final static URL LIQUIDACIONSUELDO_WSDL_LOCATION;
    private final static WebServiceException LIQUIDACIONSUELDO_EXCEPTION;
    private final static QName LIQUIDACIONSUELDO_QNAME = new QName("http://service/", "LiquidacionSueldo");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WSLiquidacionSueldo/LiquidacionSueldo?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LIQUIDACIONSUELDO_WSDL_LOCATION = url;
        LIQUIDACIONSUELDO_EXCEPTION = e;
    }

    public LiquidacionSueldo_Service() {
        super(__getWsdlLocation(), LIQUIDACIONSUELDO_QNAME);
    }

    public LiquidacionSueldo_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), LIQUIDACIONSUELDO_QNAME, features);
    }

    public LiquidacionSueldo_Service(URL wsdlLocation) {
        super(wsdlLocation, LIQUIDACIONSUELDO_QNAME);
    }

    public LiquidacionSueldo_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LIQUIDACIONSUELDO_QNAME, features);
    }

    public LiquidacionSueldo_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LiquidacionSueldo_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LiquidacionSueldo
     */
    @WebEndpoint(name = "LiquidacionSueldoPort")
    public LiquidacionSueldo getLiquidacionSueldoPort() {
        return super.getPort(new QName("http://service/", "LiquidacionSueldoPort"), LiquidacionSueldo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LiquidacionSueldo
     */
    @WebEndpoint(name = "LiquidacionSueldoPort")
    public LiquidacionSueldo getLiquidacionSueldoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service/", "LiquidacionSueldoPort"), LiquidacionSueldo.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LIQUIDACIONSUELDO_EXCEPTION!= null) {
            throw LIQUIDACIONSUELDO_EXCEPTION;
        }
        return LIQUIDACIONSUELDO_WSDL_LOCATION;
    }

}
