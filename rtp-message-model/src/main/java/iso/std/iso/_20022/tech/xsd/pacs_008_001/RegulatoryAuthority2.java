//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.07 at 12:45:54 PM EST 
//

package iso.std.iso._20022.tech.xsd.pacs_008_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for RegulatoryAuthority2 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="RegulatoryAuthority2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.06}Max140Text" minOccurs="0"/>
 *         &lt;element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.06}CountryCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryAuthority2", propOrder = { "nm", "ctry" })
public class RegulatoryAuthority2 {

	@XmlElement(name = "Nm")
	protected String nm;
	@XmlElement(name = "Ctry")
	protected String ctry;

	/**
	 * Gets the value of the nm property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNm() {
		return nm;
	}

	/**
	 * Sets the value of the nm property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setNm(String value) {
		this.nm = value;
	}

	/**
	 * Gets the value of the ctry property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCtry() {
		return ctry;
	}

	/**
	 * Sets the value of the ctry property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCtry(String value) {
		this.ctry = value;
	}

	@Override
	public String toString() {
		return "RegulatoryAuthority2 [nm=" + nm + ", ctry=" + ctry + "]";
	}

}
