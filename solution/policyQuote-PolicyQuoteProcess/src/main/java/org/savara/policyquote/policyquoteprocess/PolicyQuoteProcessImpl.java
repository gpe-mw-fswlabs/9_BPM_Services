
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.savara.policyquote.policyquoteprocess;

import org.acme.insurance.Policy;
import org.acme.insurance.PolicyTransformer;
import org.example.policyquote.PolicyQuote;
import org.example.policyquote.PolicyQuoteReply;
import org.example.policyquote.PolicyQuoteInfoType;
import org.example.policyquote.ReceivePolicyQuoteReplyType;

import com.dmv.drivingrecord.DrivingRecordRequest;
import com.dmv.drivingrecord.DrivingRecordResponse;
import com.creditagency.creditcheck.CreditCheckRequest;
import com.creditagency.creditcheck.CreditCheckResponse;

import java.util.logging.Logger;

@org.switchyard.component.bean.Service(PolicyQuoteProcess.class)
public class PolicyQuoteProcessImpl implements PolicyQuoteProcess {

    @javax.inject.Inject @org.switchyard.component.bean.Reference
    org.savara.policyquote.creditcheckservice.CreditCheckService _creditCheckService;

    @javax.inject.Inject @org.switchyard.component.bean.Reference
    org.savara.policyquote.drivingrecordservice.DrivingRecordService _drivingRecordService;

    @javax.inject.Inject @org.switchyard.component.bean.Reference
    org.acme.insurance.PolicyQuoteCalculationService _policyQuoteCalculationService;

    private static final Logger LOG = Logger.getLogger(PolicyQuoteProcessImpl.class.getName());

    /* (non-Javadoc)
     * @see org.savara.policyquote.policyquoteprocess.PolicyQuoteProcess#policyQuote(org.example.policyquote.PolicyQuote  content )*
     */
    public org.example.policyquote.PolicyQuoteReply policyQuote(org.example.policyquote.PolicyQuote content) throws TooManyAccidentsFault    {
        PolicyQuoteReply ret=null;

        // TODO: Add code here to handle request (in variable 'content')
        PolicyQuoteInfoType policyQuoteInfo = content.getReceivePolicyQuote().getPolicyQuoteInfo();

        // TODO: Add code here to initialize request
        DrivingRecordRequest drivingRecordReq=null;
        drivingRecordReq = new DrivingRecordRequest();
        drivingRecordReq.setAge(policyQuoteInfo.getAge());
        drivingRecordReq.setName(policyQuoteInfo.getDriverName());
        drivingRecordReq.setDlNumber(policyQuoteInfo.getDlNumber());
        drivingRecordReq.setSsn(policyQuoteInfo.getSsn());
               
        DrivingRecordResponse drivingRecordResult = _drivingRecordService.drivingRecord(drivingRecordReq);
        policyQuoteInfo.setNumberOfAccidents(drivingRecordResult.getNumberOfAccidents());
        policyQuoteInfo.setNumberOfTickets(drivingRecordResult.getNumberOfTickets());

        if (drivingRecordResult.getNumberOfAccidents() < 5) { // TODO: Set expression
            // TODO: Add code here to initialize request
            CreditCheckRequest creditCheckReq=null;
            creditCheckReq = new CreditCheckRequest();
            creditCheckReq.setSsn(policyQuoteInfo.getSsn());
            CreditCheckResponse creditCheckResult = _creditCheckService.creditCheck(creditCheckReq);

            policyQuoteInfo.setCreditScore(creditCheckResult.getScore());

            Policy policy = PolicyTransformer.transformPolicyQuoteToPolicy(policyQuoteInfo);
            System.out.println("policy has ssn: " + policy.getDriver().getSsn());
            policy = _policyQuoteCalculationService.calculatePolicyQuote(policy);

            policyQuoteInfo.setPrice(policy.getPrice());

                        
            // TODO: Add code here to return response
            ret = new PolicyQuoteReply();
            ReceivePolicyQuoteReplyType reply = new ReceivePolicyQuoteReplyType();
            reply.setPolicyQuoteInfo(policyQuoteInfo);
            reply.setRequestDate(content.getReceivePolicyQuote().getRequestDate());
            reply.setTask(content.getReceivePolicyQuote().getTask());
            ret.setReceivePolicyQuote(reply);
            	
        } else {
            throw new TooManyAccidentsFault();
        }

        return (ret);
    }

}
