/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerProductServiceEligibilityApiService {

	SDCustomerProductServiceEligibilityActivateOutputModel activate(SDCustomerProductServiceEligibilityActivateInputModel request);
	
	SDCustomerProductServiceEligibilityConfigureOutputModel configure(String sdReferenceId, SDCustomerProductServiceEligibilityConfigureInputModel request);
	
	CRCustomerEligibilityAssessmentEvaluateOutputModel evaluate(String sdReferenceId, CRCustomerEligibilityAssessmentEvaluateInputModel request);
	
	CRCustomerEligibilityAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerEligibilityAssessmentExchangeInputModel request);
	
	CRCustomerEligibilityAssessmentExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerEligibilityAssessmentExecuteInputModel request);
	
	SDCustomerProductServiceEligibilityFeedbackOutputModel feedback(String sdReferenceId, SDCustomerProductServiceEligibilityFeedbackInputModel request);
	
	CRCustomerEligibilityAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRCustomerEligibilityAssessmentGrantInputModel request);
	
	CRCustomerEligibilityAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerEligibilityAssessmentRequestInputModel request);
	
	BQEligibilityCheckRetrieveOutputModel retrieveEligibilitycheck(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQNextBestRetrieveOutputModel retrieveNextbest(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRCustomerEligibilityAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCustomerProductServiceEligibilityRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCustomerEligibilityAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerEligibilityAssessmentUpdateInputModel request);
	
	BQNextBestUpdateOutputModel updateNextbest(String sdReferenceId, String crReferenceId, String bqReferenceId, BQNextBestUpdateInputModel request);
	
}
