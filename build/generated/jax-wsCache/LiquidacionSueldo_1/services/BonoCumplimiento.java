
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para bono_cumplimiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bono_cumplimiento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sueldo_bruto" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bono_cumplimiento", propOrder = {
    "sueldoBruto"
})
public class BonoCumplimiento {

    @XmlElement(name = "sueldo_bruto")
    protected double sueldoBruto;

    /**
     * Obtiene el valor de la propiedad sueldoBruto.
     * 
     */
    public double getSueldoBruto() {
        return sueldoBruto;
    }

    /**
     * Define el valor de la propiedad sueldoBruto.
     * 
     */
    public void setSueldoBruto(double value) {
        this.sueldoBruto = value;
    }

}
