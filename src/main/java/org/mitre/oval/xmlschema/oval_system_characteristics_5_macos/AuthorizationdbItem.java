


package org.mitre.oval.xmlschema.oval_system_characteristics_5_macos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemAnySimpleType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}ItemType">
 *       &lt;sequence>
 *         &lt;element name="right_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="xpath" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="value_of" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemAnySimpleType" maxOccurs="unbounded" minOccurs="0"/>
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
    "rightName",
    "xpath",
    "valueOf"
})
public class AuthorizationdbItem
    extends ItemType
{

    @XmlElement(name = "right_name", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemStringType rightName;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemStringType xpath;
    @XmlElement(name = "value_of", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected List<EntityItemAnySimpleType> valueOf;

    /**
     * Gets the value of the rightName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getRightName() {
        return rightName;
    }

    /**
     * Sets the value of the rightName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setRightName(EntityItemStringType value) {
        this.rightName = value;
    }

    /**
     * Gets the value of the xpath property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getXpath() {
        return xpath;
    }

    /**
     * Sets the value of the xpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setXpath(EntityItemStringType value) {
        this.xpath = value;
    }

    /**
     * Gets the value of the valueOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemAnySimpleType }
     * 
     * 
     */
    public List<EntityItemAnySimpleType> getValueOf() {
        if (valueOf == null) {
            valueOf = new ArrayList<EntityItemAnySimpleType>();
        }
        return this.valueOf;
    }

}
