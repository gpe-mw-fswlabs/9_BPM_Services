
package org.example.policyquote;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaskType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="receivePolicyQuote"/>
 *     &lt;enumeration value="createPolicyQuote"/>
 *     &lt;enumeration value="getPolicyQuote"/>
 *     &lt;enumeration value="deletePolicyQuote"/>
 *     &lt;enumeration value="calculatePolicyQuote"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaskType")
@XmlEnum
public enum TaskType {

    @XmlEnumValue("receivePolicyQuote")
    RECEIVE_POLICY_QUOTE("receivePolicyQuote"),
    @XmlEnumValue("createPolicyQuote")
    CREATE_POLICY_QUOTE("createPolicyQuote"),
    @XmlEnumValue("getPolicyQuote")
    GET_POLICY_QUOTE("getPolicyQuote"),
    @XmlEnumValue("deletePolicyQuote")
    DELETE_POLICY_QUOTE("deletePolicyQuote"),
    @XmlEnumValue("calculatePolicyQuote")
    CALCULATE_POLICY_QUOTE("calculatePolicyQuote");
    private final String value;

    TaskType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaskType fromValue(String v) {
        for (TaskType c: TaskType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
