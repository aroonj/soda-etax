//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.14 at 02:43:46 PM ICT 
//


package etda.uncefact.data.standard.receipt_reusableaggregatebusinessinformationentity._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import etda.uncefact.data.standard.qualifieddatatype._1.Max16CodeType;
import etda.uncefact.data.standard.qualifieddatatype._1.Max256TextType;


/**
 * <p>Java class for DesignatedProductClassificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesignatedProductClassificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClassCode" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}Max16CodeType" minOccurs="0"/>
 *         &lt;element name="ClassName" type="{urn:etda:uncefact:data:standard:QualifiedDataType:1}Max256TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DesignatedProductClassificationType", propOrder = {
    "classCode",
    "className"
})
public class DesignatedProductClassificationType {

    @XmlElement(name = "ClassCode")
    protected Max16CodeType classCode;
    @XmlElement(name = "ClassName")
    protected Max256TextType className;

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link Max16CodeType }
     *     
     */
    public Max16CodeType getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max16CodeType }
     *     
     */
    public void setClassCode(Max16CodeType value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link Max256TextType }
     *     
     */
    public Max256TextType getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max256TextType }
     *     
     */
    public void setClassName(Max256TextType value) {
        this.className = value;
    }

}