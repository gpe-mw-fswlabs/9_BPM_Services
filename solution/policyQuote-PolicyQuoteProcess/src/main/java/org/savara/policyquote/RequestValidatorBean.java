package org.savara.policyquote;

import javax.inject.Named;
import org.switchyard.annotations.Validator;
import org.switchyard.validate.BaseValidator;
import org.switchyard.validate.ValidationResult;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

@Named("RequestValidatorBean")
public class RequestValidatorBean {

    public RequestValidatorBean() {
        // TODO Auto-generated constructor stub
    }
    
    @Validator(name = "{http://www.example.org/policyQuote}policyQuote")
    public ValidationResult validate(Element from)  {
            if (from.getNodeName().equals("pol:policyQuote"))  {
                    NodeList nl = from.getChildNodes();
                    for (int i=0;i<nl.getLength();i++)  {
                            if (nl.item(i).getTextContent() == null || nl.item(i).getTextContent().equals(""))  {
                                    return BaseValidator.invalidResult("Element " + nl.item(i).getNodeName() + " not valid");
                            }
                    }
            }
            // handle validation here.
            if (!from.getElementsByTagName("pol:policyType").item(0).getTextContent().equalsIgnoreCase("AUTO")) {
                    return BaseValidator.invalidResult("Element pol:policyType not valid");

            }
            else
                    return BaseValidator.validResult();
    }


}
