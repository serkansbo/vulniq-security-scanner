
package org.mitre.oval.xmlschema.oval_definitions_5_macos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateAnySimpleType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-definitions-5}StateType">
 *       &lt;sequence>
 *         &lt;element name="app_id" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="filepath" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="xpath" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="value_of" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateAnySimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "appId",
    "filepath",
    "xpath",
    "valueOf"
})
public class Plist511State
    extends StateType
{

    @XmlElement(name = "app_id", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateStringType appId;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateStringType filepath;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateStringType xpath;
    @XmlElement(name = "value_of", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateAnySimpleType valueOf;

    /**
     * Gets the value of the appId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setAppId(EntityStateStringType value) {
        this.appId = value;
    }

    /**
     * Gets the value of the filepath property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getFilepath() {
        return filepath;
    }

    /**
     * Sets the value of the filepath property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setFilepath(EntityStateStringType value) {
        this.filepath = value;
    }

    /**
     * Gets the value of the xpath property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getXpath() {
        return xpath;
    }

    /**
     * Sets the value of the xpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setXpath(EntityStateStringType value) {
        this.xpath = value;
    }

    /**
     * Gets the value of the valueOf property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAnySimpleType }
     *     
     */
    public EntityStateAnySimpleType getValueOf() {
        return valueOf;
    }

    /**
     * Sets the value of the valueOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAnySimpleType }
     *     
     */
    public void setValueOf(EntityStateAnySimpleType value) {
        this.valueOf = value;
    }

}
