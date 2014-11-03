
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
 *         &lt;element name="receivePolicyQuote" type="{http://www.example.org/policyQuote}ReceivePolicyQuoteReplyType"/>
 *         &lt;element name="createPolicyQuote" type="{http://www.example.org/policyQuote}CreatePolicyQuoteReplyType"/>
 *         &lt;element name="deletePolicyQuote" type="{http://www.example.org/policyQuote}DeletePolicyQuoteReplyType"/>
 *         &lt;element name="getPolicyQuote" type="{http://www.example.org/policyQuote}GetPolicyQuoteReplyType"/>
 *         &lt;element name="calculatePolicyQuote" type="{http://www.example.org/policyQuote}CalculatePolicyQuoteReplyType"/>
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
@XmlRootElement(name = "policyQuoteReply")
public class PolicyQuoteReply {

    protected CalculatePolicyQuoteReplyType calculatePolicyQuote;
    protected GetPolicyQuoteReplyType getPolicyQuote;
    protected DeletePolicyQuoteReplyType deletePolicyQuote;
    protected CreatePolicyQuoteReplyType createPolicyQuote;
    protected ReceivePolicyQuoteReplyType receivePolicyQuote;

    /**
     * Gets the value of the calculatePolicyQuote property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatePolicyQuoteReplyType }
     *     
     */
    public CalculatePolicyQuoteReplyType getCalculatePolicyQuote() {
        return calculatePolicyQuote;
    }

    /**
     * Sets the value of the calculatePolicyQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatePolicyQuoteReplyType }
     *     
     */
    public void setCalculatePolicyQuote(CalculatePolicyQuoteReplyType value) {
        this.calculatePolicyQuote = value;
    }

    /**
     * Gets the value of the getPolicyQuote property.
     * 
     * @return
     *     possible object is
     *     {@link GetPolicyQuoteReplyType }
     *     
     */
    public GetPolicyQuoteReplyType getGetPolicyQuote() {
        return getPolicyQuote;
    }

    /**
     * Sets the value of the getPolicyQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPolicyQuoteReplyType }
     *     
     */
    public void setGetPolicyQuote(GetPolicyQuoteReplyType value) {
        this.getPolicyQuote = value;
    }

    /**
     * Gets the value of the deletePolicyQuote property.
     * 
     * @return
     *     possible object is
     *     {@link DeletePolicyQuoteReplyType }
     *     
     */
    public DeletePolicyQuoteReplyType getDeletePolicyQuote() {
        return deletePolicyQuote;
    }

    /**
     * Sets the value of the deletePolicyQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeletePolicyQuoteReplyType }
     *     
     */
    public void setDeletePolicyQuote(DeletePolicyQuoteReplyType value) {
        this.deletePolicyQuote = value;
    }

    /**
     * Gets the value of the createPolicyQuote property.
     * 
     * @return
     *     possible object is
     *     {@link CreatePolicyQuoteReplyType }
     *     
     */
    public CreatePolicyQuoteReplyType getCreatePolicyQuote() {
        return createPolicyQuote;
    }

    /**
     * Sets the value of the createPolicyQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreatePolicyQuoteReplyType }
     *     
     */
    public void setCreatePolicyQuote(CreatePolicyQuoteReplyType value) {
        this.createPolicyQuote = value;
    }

    /**
     * Gets the value of the receivePolicyQuote property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivePolicyQuoteReplyType }
     *     
     */
    public ReceivePolicyQuoteReplyType getReceivePolicyQuote() {
        return receivePolicyQuote;
    }

    /**
     * Sets the value of the receivePolicyQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivePolicyQuoteReplyType }
     *     
     */
    public void setReceivePolicyQuote(ReceivePolicyQuoteReplyType value) {
        this.receivePolicyQuote = value;
    }

}
