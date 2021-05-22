


package org.mitre.oval.xmlschema.oval_definitions_5_linux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;


/**
 * The EntityStateProtocolType complex type restricts a string value to the set of
 *                     physical layer protocols used by AF_PACKET sockets. The empty string is also allowed to support the
 *                     empty element associated with variable references. Note that when using pattern matches and
 *                     variables care must be taken to ensure that the regular expression and variable values align with
 *                     the enumerated values.
 *                
 * 
 * <p>Java class for EntityStateProtocolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityStateProtocolType">
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
@XmlType(name = "EntityStateProtocolType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
public class EntityStateProtocolType
    extends EntityStateStringType
{


}
