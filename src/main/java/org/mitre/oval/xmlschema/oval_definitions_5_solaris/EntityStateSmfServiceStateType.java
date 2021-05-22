


package org.mitre.oval.xmlschema.oval_definitions_5_solaris;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;


/**
 * The EntityStateSmfServiceStateType complex type defines the different values that are valid for the service_state entity of a smf_state. The empty string is also allowed as a valid value to support an empty element that is found when a variable reference is used within the type entity.
 * 
 * <p>Java class for EntityStateSmfServiceStateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityStateSmfServiceStateType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateStringType">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityStateSmfServiceStateType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
public class EntityStateSmfServiceStateType
    extends EntityStateStringType
{


}
