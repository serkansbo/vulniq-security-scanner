


package org.mitre.oval.xmlschema.oval_definitions_5_macos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
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
 *         &lt;element name="enabled" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="unlabeled" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
    "enabled",
    "unlabeled"
})
public class GatekeeperState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateBoolType enabled;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateStringType unlabeled;

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setEnabled(EntityStateBoolType value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the unlabeled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getUnlabeled() {
        return unlabeled;
    }

    /**
     * Sets the value of the unlabeled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setUnlabeled(EntityStateStringType value) {
        this.unlabeled = value;
    }

}
