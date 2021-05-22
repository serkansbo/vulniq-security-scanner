


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The ServiceEffectiveRightsBehaviors complex type defines a number of behaviors that allow a more detailed definition of the serviceeffectiverights_object being specified.  Note that using these behaviors may result in some unique results.  For example, a double negative type condition might be created where an object entity says include everything except a specific item, but a behavior is used that might then add that item back in.
 * 
 * <p>Java class for ServiceEffectiveRightsBehaviors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceEffectiveRightsBehaviors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="include_group" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="resolve_group" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceEffectiveRightsBehaviors", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
public class ServiceEffectiveRightsBehaviors {

    @XmlAttribute(name = "include_group")
    protected Boolean includeGroup;
    @XmlAttribute(name = "resolve_group")
    protected Boolean resolveGroup;

    /**
     * Gets the value of the includeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludeGroup() {
        if (includeGroup == null) {
            return true;
        } else {
            return includeGroup;
        }
    }

    /**
     * Sets the value of the includeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeGroup(Boolean value) {
        this.includeGroup = value;
    }

    /**
     * Gets the value of the resolveGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isResolveGroup() {
        if (resolveGroup == null) {
            return false;
        } else {
            return resolveGroup;
        }
    }

    /**
     * Sets the value of the resolveGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResolveGroup(Boolean value) {
        this.resolveGroup = value;
    }

}
