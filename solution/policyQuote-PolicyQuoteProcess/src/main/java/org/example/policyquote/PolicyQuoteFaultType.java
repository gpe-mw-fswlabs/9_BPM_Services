
package org.example.policyquote;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyQuoteFaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyQuoteFaultType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.org/policyQuote}PolicyQuoteType">
 *       &lt;sequence>
 *         &lt;element name="task">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.example.org/policyQuote}TaskType">
 *               &lt;enumeration value="receivePolicyQuote"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="policyQuoteInfo" type="{http://www.example.org/policyQuote}PolicyQuoteInfoType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyQuoteFaultType", propOrder = {
    "task",
    "code",
    "reason",
    "policyQuoteInfo"
})
public class PolicyQuoteFaultType
    extends PolicyQuoteType
{

    @XmlElement(required = true)
    protected TaskType task;
    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String reason;
    @XmlElement(required = true)
    protected PolicyQuoteInfoType policyQuoteInfo;

    /**
     * Gets the value of the task property.
     * 
     * @return
     *     possible object is
     *     {@link TaskType }
     *     
     */
    public TaskType getTask() {
        return task;
    }

    /**
     * Sets the value of the task property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskType }
     *     
     */
    public void setTask(TaskType value) {
        this.task = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the policyQuoteInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyQuoteInfoType }
     *     
     */
    public PolicyQuoteInfoType getPolicyQuoteInfo() {
        return policyQuoteInfo;
    }

    /**
     * Sets the value of the policyQuoteInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyQuoteInfoType }
     *     
     */
    public void setPolicyQuoteInfo(PolicyQuoteInfoType value) {
        this.policyQuoteInfo = value;
    }

}
