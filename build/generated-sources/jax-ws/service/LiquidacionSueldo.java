
package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LiquidacionSueldo", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LiquidacionSueldo {


    /**
     * 
     * @param pass
     * @param name
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://service/", className = "service.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://service/", className = "service.HelloResponse")
    @Action(input = "http://service/LiquidacionSueldo/helloRequest", output = "http://service/LiquidacionSueldo/helloResponse")
    public Boolean hello(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "pass", targetNamespace = "")
        String pass);

    /**
     * 
     * @param sueldoBruto
     * @return
     *     returns double
     */
    @WebMethod(operationName = "bono_movilizacion")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bono_movilizacion", targetNamespace = "http://service/", className = "service.BonoMovilizacion")
    @ResponseWrapper(localName = "bono_movilizacionResponse", targetNamespace = "http://service/", className = "service.BonoMovilizacionResponse")
    @Action(input = "http://service/LiquidacionSueldo/bono_movilizacionRequest", output = "http://service/LiquidacionSueldo/bono_movilizacionResponse")
    public double bonoMovilizacion(
        @WebParam(name = "sueldo_bruto", targetNamespace = "")
        double sueldoBruto);

    /**
     * 
     * @param sueldoBruto
     * @return
     *     returns double
     */
    @WebMethod(operationName = "calcular_sueldo_liquido")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "calcular_sueldo_liquido", targetNamespace = "http://service/", className = "service.CalcularSueldoLiquido")
    @ResponseWrapper(localName = "calcular_sueldo_liquidoResponse", targetNamespace = "http://service/", className = "service.CalcularSueldoLiquidoResponse")
    @Action(input = "http://service/LiquidacionSueldo/calcular_sueldo_liquidoRequest", output = "http://service/LiquidacionSueldo/calcular_sueldo_liquidoResponse")
    public double calcularSueldoLiquido(
        @WebParam(name = "sueldo_bruto", targetNamespace = "")
        double sueldoBruto);

    /**
     * 
     * @param sueldoBruto
     * @return
     *     returns double
     */
    @WebMethod(operationName = "dcto_salud")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dcto_salud", targetNamespace = "http://service/", className = "service.DctoSalud")
    @ResponseWrapper(localName = "dcto_saludResponse", targetNamespace = "http://service/", className = "service.DctoSaludResponse")
    @Action(input = "http://service/LiquidacionSueldo/dcto_saludRequest", output = "http://service/LiquidacionSueldo/dcto_saludResponse")
    public double dctoSalud(
        @WebParam(name = "sueldo_bruto", targetNamespace = "")
        double sueldoBruto);

    /**
     * 
     * @param sueldoBruto
     * @return
     *     returns double
     */
    @WebMethod(operationName = "dcto_afp")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dcto_afp", targetNamespace = "http://service/", className = "service.DctoAfp")
    @ResponseWrapper(localName = "dcto_afpResponse", targetNamespace = "http://service/", className = "service.DctoAfpResponse")
    @Action(input = "http://service/LiquidacionSueldo/dcto_afpRequest", output = "http://service/LiquidacionSueldo/dcto_afpResponse")
    public double dctoAfp(
        @WebParam(name = "sueldo_bruto", targetNamespace = "")
        double sueldoBruto);

    /**
     * 
     * @param contraUsu
     * @param nombreUsu
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "verificar_usuario")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "verificar_usuario", targetNamespace = "http://service/", className = "service.VerificarUsuario")
    @ResponseWrapper(localName = "verificar_usuarioResponse", targetNamespace = "http://service/", className = "service.VerificarUsuarioResponse")
    @Action(input = "http://service/LiquidacionSueldo/verificar_usuarioRequest", output = "http://service/LiquidacionSueldo/verificar_usuarioResponse")
    public Boolean verificarUsuario(
        @WebParam(name = "nombre_usu", targetNamespace = "")
        String nombreUsu,
        @WebParam(name = "contra_usu", targetNamespace = "")
        String contraUsu);

    /**
     * 
     * @param sueldoBruto
     * @return
     *     returns double
     */
    @WebMethod(operationName = "bono_cumplimiento")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bono_cumplimiento", targetNamespace = "http://service/", className = "service.BonoCumplimiento")
    @ResponseWrapper(localName = "bono_cumplimientoResponse", targetNamespace = "http://service/", className = "service.BonoCumplimientoResponse")
    @Action(input = "http://service/LiquidacionSueldo/bono_cumplimientoRequest", output = "http://service/LiquidacionSueldo/bono_cumplimientoResponse")
    public double bonoCumplimiento(
        @WebParam(name = "sueldo_bruto", targetNamespace = "")
        double sueldoBruto);

}