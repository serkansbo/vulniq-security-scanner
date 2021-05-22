


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="group" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="user" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="subgroup" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
    "group",
    "user",
    "subgroup"
})
public class GroupState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType group;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType user;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType subgroup;

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setGroup(EntityStateStringType value) {
        this.group = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setUser(EntityStateStringType value) {
        this.user = value;
    }

    /**
     * Gets the value of the subgroup property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSubgroup() {
        return subgroup;
    }

    /**
     * Sets the value of the subgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSubgroup(EntityStateStringType value) {
        this.subgroup = value;
    }

}
