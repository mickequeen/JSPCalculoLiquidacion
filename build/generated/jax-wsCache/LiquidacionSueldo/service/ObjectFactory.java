
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BonoCumplimiento_QNAME = new QName("http://service/", "bono_cumplimiento");
    private final static QName _BonoCumplimientoResponse_QNAME = new QName("http://service/", "bono_cumplimientoResponse");
    private final static QName _BonoMovilizacion_QNAME = new QName("http://service/", "bono_movilizacion");
    private final static QName _BonoMovilizacionResponse_QNAME = new QName("http://service/", "bono_movilizacionResponse");
    private final static QName _CalcularSueldoLiquido_QNAME = new QName("http://service/", "calcular_sueldo_liquido");
    private final static QName _CalcularSueldoLiquidoResponse_QNAME = new QName("http://service/", "calcular_sueldo_liquidoResponse");
    private final static QName _DctoAfp_QNAME = new QName("http://service/", "dcto_afp");
    private final static QName _DctoAfpResponse_QNAME = new QName("http://service/", "dcto_afpResponse");
    private final static QName _DctoSalud_QNAME = new QName("http://service/", "dcto_salud");
    private final static QName _DctoSaludResponse_QNAME = new QName("http://service/", "dcto_saludResponse");
    private final static QName _Hello_QNAME = new QName("http://service/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://service/", "helloResponse");
    private final static QName _VerificarUsuario_QNAME = new QName("http://service/", "verificar_usuario");
    private final static QName _VerificarUsuarioResponse_QNAME = new QName("http://service/", "verificar_usuarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BonoCumplimiento }
     * 
     */
    public BonoCumplimiento createBonoCumplimiento() {
        return new BonoCumplimiento();
    }

    /**
     * Create an instance of {@link BonoCumplimientoResponse }
     * 
     */
    public BonoCumplimientoResponse createBonoCumplimientoResponse() {
        return new BonoCumplimientoResponse();
    }

    /**
     * Create an instance of {@link BonoMovilizacion }
     * 
     */
    public BonoMovilizacion createBonoMovilizacion() {
        return new BonoMovilizacion();
    }

    /**
     * Create an instance of {@link BonoMovilizacionResponse }
     * 
     */
    public BonoMovilizacionResponse createBonoMovilizacionResponse() {
        return new BonoMovilizacionResponse();
    }

    /**
     * Create an instance of {@link CalcularSueldoLiquido }
     * 
     */
    public CalcularSueldoLiquido createCalcularSueldoLiquido() {
        return new CalcularSueldoLiquido();
    }

    /**
     * Create an instance of {@link CalcularSueldoLiquidoResponse }
     * 
     */
    public CalcularSueldoLiquidoResponse createCalcularSueldoLiquidoResponse() {
        return new CalcularSueldoLiquidoResponse();
    }

    /**
     * Create an instance of {@link DctoAfp }
     * 
     */
    public DctoAfp createDctoAfp() {
        return new DctoAfp();
    }

    /**
     * Create an instance of {@link DctoAfpResponse }
     * 
     */
    public DctoAfpResponse createDctoAfpResponse() {
        return new DctoAfpResponse();
    }

    /**
     * Create an instance of {@link DctoSalud }
     * 
     */
    public DctoSalud createDctoSalud() {
        return new DctoSalud();
    }

    /**
     * Create an instance of {@link DctoSaludResponse }
     * 
     */
    public DctoSaludResponse createDctoSaludResponse() {
        return new DctoSaludResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link VerificarUsuario }
     * 
     */
    public VerificarUsuario createVerificarUsuario() {
        return new VerificarUsuario();
    }

    /**
     * Create an instance of {@link VerificarUsuarioResponse }
     * 
     */
    public VerificarUsuarioResponse createVerificarUsuarioResponse() {
        return new VerificarUsuarioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BonoCumplimiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "bono_cumplimiento")
    public JAXBElement<BonoCumplimiento> createBonoCumplimiento(BonoCumplimiento value) {
        return new JAXBElement<BonoCumplimiento>(_BonoCumplimiento_QNAME, BonoCumplimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BonoCumplimientoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "bono_cumplimientoResponse")
    public JAXBElement<BonoCumplimientoResponse> createBonoCumplimientoResponse(BonoCumplimientoResponse value) {
        return new JAXBElement<BonoCumplimientoResponse>(_BonoCumplimientoResponse_QNAME, BonoCumplimientoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BonoMovilizacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "bono_movilizacion")
    public JAXBElement<BonoMovilizacion> createBonoMovilizacion(BonoMovilizacion value) {
        return new JAXBElement<BonoMovilizacion>(_BonoMovilizacion_QNAME, BonoMovilizacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BonoMovilizacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "bono_movilizacionResponse")
    public JAXBElement<BonoMovilizacionResponse> createBonoMovilizacionResponse(BonoMovilizacionResponse value) {
        return new JAXBElement<BonoMovilizacionResponse>(_BonoMovilizacionResponse_QNAME, BonoMovilizacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularSueldoLiquido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "calcular_sueldo_liquido")
    public JAXBElement<CalcularSueldoLiquido> createCalcularSueldoLiquido(CalcularSueldoLiquido value) {
        return new JAXBElement<CalcularSueldoLiquido>(_CalcularSueldoLiquido_QNAME, CalcularSueldoLiquido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularSueldoLiquidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "calcular_sueldo_liquidoResponse")
    public JAXBElement<CalcularSueldoLiquidoResponse> createCalcularSueldoLiquidoResponse(CalcularSueldoLiquidoResponse value) {
        return new JAXBElement<CalcularSueldoLiquidoResponse>(_CalcularSueldoLiquidoResponse_QNAME, CalcularSueldoLiquidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DctoAfp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "dcto_afp")
    public JAXBElement<DctoAfp> createDctoAfp(DctoAfp value) {
        return new JAXBElement<DctoAfp>(_DctoAfp_QNAME, DctoAfp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DctoAfpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "dcto_afpResponse")
    public JAXBElement<DctoAfpResponse> createDctoAfpResponse(DctoAfpResponse value) {
        return new JAXBElement<DctoAfpResponse>(_DctoAfpResponse_QNAME, DctoAfpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DctoSalud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "dcto_salud")
    public JAXBElement<DctoSalud> createDctoSalud(DctoSalud value) {
        return new JAXBElement<DctoSalud>(_DctoSalud_QNAME, DctoSalud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DctoSaludResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "dcto_saludResponse")
    public JAXBElement<DctoSaludResponse> createDctoSaludResponse(DctoSaludResponse value) {
        return new JAXBElement<DctoSaludResponse>(_DctoSaludResponse_QNAME, DctoSaludResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "verificar_usuario")
    public JAXBElement<VerificarUsuario> createVerificarUsuario(VerificarUsuario value) {
        return new JAXBElement<VerificarUsuario>(_VerificarUsuario_QNAME, VerificarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "verificar_usuarioResponse")
    public JAXBElement<VerificarUsuarioResponse> createVerificarUsuarioResponse(VerificarUsuarioResponse value) {
        return new JAXBElement<VerificarUsuarioResponse>(_VerificarUsuarioResponse_QNAME, VerificarUsuarioResponse.class, null, value);
    }

}
