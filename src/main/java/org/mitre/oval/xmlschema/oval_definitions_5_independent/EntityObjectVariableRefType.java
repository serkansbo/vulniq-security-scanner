


package org.mitre.oval.xmlschema.oval_definitions_5_independent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;


/**
 * The EntityObjectVariableRefType complex type defines a string object entity that has a valid OVAL variable id as the value. The empty string is also allowed to support empty elements associated with variable references.
 * 
 * <p>Java class for EntityObjectVariableRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityObjectVariableRefType">
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
@XmlType(name = "EntityObjectVariableRefType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent")
public class EntityObjectVariableRefType
    extends EntityObjectStringType
{


}
