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
 * Java class for SupplementaryData1 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SupplementaryData1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlcAndNm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.06}Max350Text" minOccurs="0"/>
 *         &lt;element name="Envlp" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.06}SupplementaryDataEnvelope1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementaryData1", propOrder = { "plcAndNm", "envlp" })
public class SupplementaryData1 {

	@XmlElement(name = "PlcAndNm")
	protected String plcAndNm;
	@XmlElement(name = "Envlp", required = true)
	protected SupplementaryDataEnvelope1 envlp;

	/**
	 * Gets the value of the plcAndNm property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPlcAndNm() {
		return plcAndNm;
	}

	/**
	 * Sets the value of the plcAndNm property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPlcAndNm(String value) {
		this.plcAndNm = value;
	}

	/**
	 * Gets the value of the envlp property.
	 * 
	 * @return possible object is {@link SupplementaryDataEnvelope1 }
	 * 
	 */
	public SupplementaryDataEnvelope1 getEnvlp() {
		return envlp;
	}

	/**
	 * Sets the value of the envlp property.
	 * 
	 * @param value allowed object is {@link SupplementaryDataEnvelope1 }
	 * 
	 */
	public void setEnvlp(SupplementaryDataEnvelope1 value) {
		this.envlp = value;
	}

	@Override
	public String toString() {
		return "SupplementaryData1 [plcAndNm=" + plcAndNm + ", envlp=" + envlp + "]";
	}

}
