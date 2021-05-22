


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;


/**
 * The EntityObjectUserRightType restricts a string value to a specific set of values that describe the different user rights/privileges. The empty string is also allowed to support empty element associated with variable references. Note that when using pattern matches and variables care must be taken to ensure that the regular expression and variable values align with the specified pattern restriction.
 * 
 * <p>Java class for EntityObjectUserRightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityObjectUserRightType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityObjectStringType">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityObjectUserRightType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
public class EntityObjectUserRightType
    extends EntityObjectStringType
{


}
