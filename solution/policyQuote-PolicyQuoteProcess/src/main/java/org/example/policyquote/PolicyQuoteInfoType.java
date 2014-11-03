
package org.example.policyquote;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyQuoteInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyQuoteInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="policyType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vehicleYear" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="driverName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ssn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dlNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfAccidents" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfTickets" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="creditScore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyQuoteInfoType", propOrder = {
    "policyType",
    "vehicleYear",
    "driverName",
    "ssn",
    "dlNumber",
    "age",
    "numberOfAccidents",
    "numberOfTickets",
    "creditScore",
    "price"
})
public class PolicyQuoteInfoType {

    @XmlElement(required = true)
    protected String policyType;
    @XmlElement(required = true)
    protected String vehicleYear;
    @XmlElement(required = true)
    protected String driverName;
    @XmlElement(required = true)
    protected String ssn;
    @XmlElement(required = true)
    protected String dlNumber;
    protected int age;
    protected int numberOfAccidents;
    protected int numberOfTickets;
    protected int creditScore;
    protected int price;

    /**
     * Gets the value of the policyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyType() {
        return policyType;
    }

    /**
     * Sets the value of the policyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyType(String value) {
        this.policyType = value;
    }

    /**
     * Gets the value of the vehicleYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleYear() {
        return vehicleYear;
    }

    /**
     * Sets the value of the vehicleYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleYear(String value) {
        this.vehicleYear = value;
    }

    /**
     * Gets the value of the driverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * Sets the value of the driverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverName(String value) {
        this.driverName = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsn(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the dlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlNumber() {
        return dlNumber;
    }

    /**
     * Sets the value of the dlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlNumber(String value) {
        this.dlNumber = value;
    }

    /**
     * Gets the value of the age property.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Gets the value of the numberOfAccidents property.
     * 
     */
    public int getNumberOfAccidents() {
        return numberOfAccidents;
    }

    /**
     * Sets the value of the numberOfAccidents property.
     * 
     */
    public void setNumberOfAccidents(int value) {
        this.numberOfAccidents = value;
    }

    /**
     * Gets the value of the numberOfTickets property.
     * 
     */
    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    /**
     * Sets the value of the numberOfTickets property.
     * 
     */
    public void setNumberOfTickets(int value) {
        this.numberOfTickets = value;
    }

    /**
     * Gets the value of the creditScore property.
     * 
     */
    public int getCreditScore() {
        return creditScore;
    }

    /**
     * Sets the value of the creditScore property.
     * 
     */
    public void setCreditScore(int value) {
        this.creditScore = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(int value) {
        this.price = value;
    }

}
