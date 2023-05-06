
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para verificar_usuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="verificar_usuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombre_usu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contra_usu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificar_usuario", propOrder = {
    "nombreUsu",
    "contraUsu"
})
public class VerificarUsuario {

    @XmlElement(name = "nombre_usu")
    protected String nombreUsu;
    @XmlElement(name = "contra_usu")
    protected String contraUsu;

    /**
     * Obtiene el valor de la propiedad nombreUsu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreUsu() {
        return nombreUsu;
    }

    /**
     * Define el valor de la propiedad nombreUsu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreUsu(String value) {
        this.nombreUsu = value;
    }

    /**
     * Obtiene el valor de la propiedad contraUsu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContraUsu() {
        return contraUsu;
    }

    /**
     * Define el valor de la propiedad contraUsu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContraUsu(String value) {
        this.contraUsu = value;
    }

}
