


package org.mitre.oval.xmlschema.oval_definitions_5_independent;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-definitions-5}ObjectType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://oval.mitre.org/XMLSchema/oval-definitions-5}set"/>
 *           &lt;sequence>
 *             &lt;element name="engine" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#independent}EntityObjectEngineType"/>
 *             &lt;element name="version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectStringType"/>
 *             &lt;element name="connection_string" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectStringType"/>
 *             &lt;element name="sql" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectStringType"/>
 *           &lt;/sequence>
 *         &lt;/choice>
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
    "rest"
})
public class SqlObject
    extends ObjectType
{

    @XmlElementRefs({
        @XmlElementRef(name = "sql", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "set", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = Set.class, required = false),
        @XmlElementRef(name = "version", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "connection_string", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "engine", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent", type = JAXBElement.class, required = false)
    })
    protected List<Object> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Version" is used by two different parts of a schema. See: 
     * line 1054 of file:/Users/serkanozkan/Downloads/Language-5.11.2/schemas/independent-definitions-schema.xsd
     * line 420 of file:/Users/serkanozkan/Downloads/Language-5.11.2/schemas/oval-definitions-schema.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}
     * {@link Set }
     * {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityObjectEngineType }{@code >}
     * 
     * 
     */
    public List<Object> getRest() {
        if (rest == null) {
            rest = new ArrayList<Object>();
        }
        return this.rest;
    }

}
