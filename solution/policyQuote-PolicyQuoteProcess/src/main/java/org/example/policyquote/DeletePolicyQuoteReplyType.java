
package org.example.policyquote;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeletePolicyQuoteReplyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeletePolicyQuoteReplyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.org/policyQuote}PolicyQuoteType">
 *       &lt;sequence>
 *         &lt;element name="task">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.example.org/policyQuote}TaskType">
 *               &lt;enumeration value="deletePolicyQuote"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="policyQuoteID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeletePolicyQuoteReplyType", propOrder = {
    "task",
    "policyQuoteID"
})
public class DeletePolicyQuoteReplyType
    extends PolicyQuoteType
{

    @XmlElement(required = true)
    protected TaskType task;
    @XmlElement(required = true)
    protected BigInteger policyQuoteID;

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
     * Gets the value of the policyQuoteID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPolicyQuoteID() {
        return policyQuoteID;
    }

    /**
     * Sets the value of the policyQuoteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPolicyQuoteID(BigInteger value) {
        this.policyQuoteID = value;
    }

}
