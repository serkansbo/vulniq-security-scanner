


package org.mitre.oval.xmlschema.oval_definitions_5_hpux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The Patch53Behaviors complex type defines a number of behaviors that allow a more detailed definition of the patch53_object being specified.  Note that using these behaviors may result in some unique results.  For example, a double negative type condition might be created where an object entity says include everything except a specific item, but a behavior is used that might then add that item back in.
 * 
 * <p>Java class for Patch53Behaviors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Patch53Behaviors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="supersedence" default="false">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patch53Behaviors", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
public class Patch53Behaviors {

    @XmlAttribute(name = "supersedence")
    protected Boolean supersedence;

    /**
     * Gets the value of the supersedence property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSupersedence() {
        if (supersedence == null) {
            return false;
        } else {
            return supersedence;
        }
    }

    /**
     * Sets the value of the supersedence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupersedence(Boolean value) {
        this.supersedence = value;
    }

}
