
package org.example.policyquote;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceivePolicyQuoteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceivePolicyQuoteType">
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
@XmlType(name = "ReceivePolicyQuoteType", propOrder = {
    "task",
    "policyQuoteInfo"
})
public class ReceivePolicyQuoteType
    extends PolicyQuoteType
{

    @XmlElement(required = true)
    protected TaskType task;
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
