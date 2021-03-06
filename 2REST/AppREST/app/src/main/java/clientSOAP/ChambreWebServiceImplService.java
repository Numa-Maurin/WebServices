
package clientSOAP;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;



@WebServiceClient(name = "ChambreWebServiceImplService", targetNamespace = "http://localhost:10000/ReservationVoyage", wsdlLocation = "http://localhost:10000/ReservationVoyage?wsdl")
public class ChambreWebServiceImplService
    extends Service
{

    private final static URL CHAMBREWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CHAMBREWEBSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName CHAMBREWEBSERVICEIMPLSERVICE_QNAME = new QName("http://localhost:10000/ReservationVoyage", "ChambreWebServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:10000/ReservationVoyage?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CHAMBREWEBSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        CHAMBREWEBSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public ChambreWebServiceImplService() {
        super(__getWsdlLocation(), CHAMBREWEBSERVICEIMPLSERVICE_QNAME);
    }

    public ChambreWebServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CHAMBREWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public ChambreWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, CHAMBREWEBSERVICEIMPLSERVICE_QNAME);
    }

    public ChambreWebServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CHAMBREWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public ChambreWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ChambreWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ChambreWebService
     */
    @WebEndpoint(name = "ChambreWebServiceImplPort")
    public ChambreWebService getChambreWebServiceImplPort() {
        return super.getPort(new QName("http://localhost:10000/ReservationVoyage", "ChambreWebServiceImplPort"), ChambreWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ChambreWebService
     */
    @WebEndpoint(name = "ChambreWebServiceImplPort")
    public ChambreWebService getChambreWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://localhost:10000/ReservationVoyage", "ChambreWebServiceImplPort"), ChambreWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CHAMBREWEBSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw CHAMBREWEBSERVICEIMPLSERVICE_EXCEPTION;
        }
        return CHAMBREWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
