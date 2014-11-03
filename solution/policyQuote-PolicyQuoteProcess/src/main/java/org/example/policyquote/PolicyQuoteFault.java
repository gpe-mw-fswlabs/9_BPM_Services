
package org.example.policyquote;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="policyQuoteFault" type="{http://www.example.org/policyQuote}PolicyQuoteFaultType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "policyQuoteFault"
})
@XmlRootElement(name = "policyQuoteFault")
public class PolicyQuoteFault {

    protected PolicyQuoteFaultType policyQuoteFault;

    /**
     * Gets the value of the policyQuoteFault property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyQuoteFaultType }
     *     
     */
    public PolicyQuoteFaultType getPolicyQuoteFault() {
        return policyQuoteFault;
    }

    /**
     * Sets the value of the policyQuoteFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyQuoteFaultType }
     *     
     */
    public void setPolicyQuoteFault(PolicyQuoteFaultType value) {
        this.policyQuoteFault = value;
    }

}
