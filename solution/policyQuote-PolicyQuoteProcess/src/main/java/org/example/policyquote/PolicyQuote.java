
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
 *         &lt;element name="receivePolicyQuote" type="{http://www.example.org/policyQuote}ReceivePolicyQuoteType"/>
 *         &lt;element name="createPolicyQuote" type="{http://www.example.org/policyQuote}CreatePolicyQuoteType"/>
 *         &lt;element name="deletePolicyQuote" type="{http://www.example.org/policyQuote}DeletePolicyQuoteType"/>
 *         &lt;element name="getPolicyQuote" type="{http://www.example.org/policyQuote}GetPolicyQuoteType"/>
 *         &lt;element name="calculatePolicyQuote" type="{http://www.example.org/policyQuote}CalculatePolicyQuoteType"/>
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
    "calculatePolicyQuote",
    "getPolicyQuote",
    "deletePolicyQuote",
    "createPolicyQuote",
    "receivePolicyQuote"
})
@XmlRootElement(name = "policyQuote")
public class PolicyQuote {

    protected CalculatePolicyQuoteType calculatePolicyQuote;
    protected GetPolicyQuoteType getPolicyQuote;
    protected DeletePolicyQuoteType deletePolicyQuote;
    protected CreatePolicyQuoteType createPolicyQuote;
    protected ReceivePolicyQuoteType receivePolicyQuote;

    /**
     * Gets the value of the calculatePolicyQuote property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatePolicyQuoteType }
     *     
     */
    public CalculatePolicyQuoteType getCalculatePolicyQuote() {
        return calculatePolicyQuote;
    }

    /**
     * Sets the value of the calculatePolicyQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatePolicyQuoteType }
     *     
     */
    public void setCalculatePolicyQuote(CalculatePolicyQuoteType value) {
        this.calculatePolicyQuote = value;
    }

    /**
     * Gets the value of the getPolicyQuote property.
     * 
     * @return
     *     possible object is
     *     {@link GetPolicyQuoteType }
     *     
     */
    public GetPolicyQuoteType getGetPolicyQuote() {
        return getPolicyQuote;
    }

    /**
     * Sets the value of the getPolicyQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPolicyQuoteType }
     *     
     */
    public void setGetPolicyQuote(GetPolicyQuoteType value) {
        this.getPolicyQuote = value;
    }

    /**
     * Gets the value of the deletePolicyQuote property.
     * 
     * @return
     *     possible object is
     *     {@link DeletePolicyQuoteType }
     *     
     */
    public DeletePolicyQuoteType getDeletePolicyQuote() {
        return deletePolicyQuote;
    }

    /**
     * Sets the value of the deletePolicyQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeletePolicyQuoteType }
     *     
     */
    public void setDeletePolicyQuote(DeletePolicyQuoteType value) {
        this.deletePolicyQuote = value;
    }

    /**
     * Gets the value of the createPolicyQuote property.
     * 
     * @return
     *     possible object is
     *     {@link CreatePolicyQuoteType }
     *     
     */
    public CreatePolicyQuoteType getCreatePolicyQuote() {
        return createPolicyQuote;
    }

    /**
     * Sets the value of the createPolicyQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreatePolicyQuoteType }
     *     
     */
    public void setCreatePolicyQuote(CreatePolicyQuoteType value) {
        this.createPolicyQuote = value;
    }

    /**
     * Gets the value of the receivePolicyQuote property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivePolicyQuoteType }
     *     
     */
    public ReceivePolicyQuoteType getReceivePolicyQuote() {
        return receivePolicyQuote;
    }

    /**
     * Sets the value of the receivePolicyQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivePolicyQuoteType }
     *     
     */
    public void setReceivePolicyQuote(ReceivePolicyQuoteType value) {
        this.receivePolicyQuote = value;
    }

}
