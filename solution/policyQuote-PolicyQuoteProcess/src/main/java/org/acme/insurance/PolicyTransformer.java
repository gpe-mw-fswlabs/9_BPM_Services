package org.acme.insurance;


import org.example.policyquote.PolicyQuoteInfoType;

public final class PolicyTransformer {

	public static PolicyQuoteInfoType transformPolicyToPolicyQuote(Policy policy) {
		PolicyQuoteInfoType policyQuote = new PolicyQuoteInfoType();		
		Driver driver = policy.getDriver();
		policyQuote.setDriverName(driver.getDriverName());
		policyQuote.setAge(driver.getAge());
		policyQuote.setSsn(driver.getSsn());
		policyQuote.setDlNumber(driver.getDlNumber());
		policyQuote.setNumberOfAccidents(driver.getNumberOfAccidents());
		policyQuote.setNumberOfTickets(driver.getNumberOfTickets());
		policyQuote.setCreditScore(driver.getCreditScore());
		Integer year = new Integer(policy.getVehicleYear());
		String vYear= year.toString();
		policyQuote.setVehicleYear(vYear);
		policyQuote.setPrice(policy.getPrice());
		
		return policyQuote;
	}
	
	public static Policy transformPolicyQuoteToPolicy(PolicyQuoteInfoType policyQuote) {
		System.out.println("Trasnforming PolicyQuote with SSN = " + policyQuote.getSsn());
		Policy policy = new Policy();
		Driver driver = new Driver();
		driver.setAge(policyQuote.getAge());
		driver.setCreditScore(policyQuote.getCreditScore());
		driver.setDlNumber(policyQuote.getDlNumber());
		driver.setNumberOfAccidents(policyQuote.getNumberOfAccidents());
		driver.setNumberOfTickets(policyQuote.getNumberOfTickets());
		driver.setSsn(policyQuote.getSsn());

		policy.setDriver(driver);
		policy.setPolicyType(policyQuote.getPolicyType());
		policy.setPrice(policyQuote.getPrice());
		String vYear = policyQuote.getVehicleYear();
		int year = new Integer(vYear);
		policy.setVehicleYear(year);
		
		return policy;
	}
	

}
