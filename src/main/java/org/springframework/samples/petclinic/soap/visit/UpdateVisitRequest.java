//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.29 at 02:40:16 PM CEST 
//


package org.springframework.samples.petclinic.soap.visit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="visit" type="{http://petclinic.samples.springframework.org/soap/visit}Visit"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "visit"
})
@XmlRootElement(name = "updateVisitRequest")
public class UpdateVisitRequest {

    @XmlElement(required = true)
    protected Visit visit;

    /**
     * Gets the value of the visit property.
     * 
     * @return
     *     possible object is
     *     {@link Visit }
     *     
     */
    public Visit getVisit() {
        return visit;
    }

    /**
     * Sets the value of the visit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Visit }
     *     
     */
    public void setVisit(Visit value) {
        this.visit = value;
    }

}
