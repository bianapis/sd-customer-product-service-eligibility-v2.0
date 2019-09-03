/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerProductServiceEligibilityApiServiceImpl implements CustomerProductServiceEligibilityApiService {

	public SDCustomerProductServiceEligibilityActivateOutputModel activate(SDCustomerProductServiceEligibilityActivateInputModel request){
		return JsonReader.read("activate-SDCustomerProductServiceEligibilityActivateOutputModel.json",new TypeReference<SDCustomerProductServiceEligibilityActivateOutputModel>(){});
	}
	
	public SDCustomerProductServiceEligibilityConfigureOutputModel configure(String sdReferenceId, SDCustomerProductServiceEligibilityConfigureInputModel request){
		return JsonReader.read("configure-SDCustomerProductServiceEligibilityConfigureOutputModel.json",new TypeReference<SDCustomerProductServiceEligibilityConfigureOutputModel>(){});
	}
	
	public CRCustomerEligibilityAssessmentEvaluateOutputModel evaluate(String sdReferenceId, CRCustomerEligibilityAssessmentEvaluateInputModel request){
		return JsonReader.read("evaluate-CRCustomerEligibilityAssessmentEvaluateOutputModel.json",new TypeReference<CRCustomerEligibilityAssessmentEvaluateOutputModel>(){});
	}
	
	public CRCustomerEligibilityAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerEligibilityAssessmentExchangeInputModel request){
		return JsonReader.read("exchange-CRCustomerEligibilityAssessmentExchangeOutputModel.json",new TypeReference<CRCustomerEligibilityAssessmentExchangeOutputModel>(){});
	}
	
	public CRCustomerEligibilityAssessmentExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerEligibilityAssessmentExecuteInputModel request){
		return JsonReader.read("execute-CRCustomerEligibilityAssessmentExecuteOutputModel.json",new TypeReference<CRCustomerEligibilityAssessmentExecuteOutputModel>(){});
	}
	
	public SDCustomerProductServiceEligibilityFeedbackOutputModel feedback(String sdReferenceId, SDCustomerProductServiceEligibilityFeedbackInputModel request){
		return JsonReader.read("feedback-SDCustomerProductServiceEligibilityFeedbackOutputModel.json",new TypeReference<SDCustomerProductServiceEligibilityFeedbackOutputModel>(){});
	}
	
	public CRCustomerEligibilityAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRCustomerEligibilityAssessmentGrantInputModel request){
		return JsonReader.read("grant-CRCustomerEligibilityAssessmentGrantOutputModel.json",new TypeReference<CRCustomerEligibilityAssessmentGrantOutputModel>(){});
	}
	
	public CRCustomerEligibilityAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerEligibilityAssessmentRequestInputModel request){
		return JsonReader.read("request-CRCustomerEligibilityAssessmentRequestOutputModel.json",new TypeReference<CRCustomerEligibilityAssessmentRequestOutputModel>(){});
	}
	
	public BQEligibilityCheckRetrieveOutputModel retrieveEligibilitycheck(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQEligibilityCheckRetrieveOutputModel.json",new TypeReference<BQEligibilityCheckRetrieveOutputModel>(){});
	}
	
	public BQNextBestRetrieveOutputModel retrieveNextbest(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQNextBestRetrieveOutputModel.json",new TypeReference<BQNextBestRetrieveOutputModel>(){});
	}
	
	public CRCustomerEligibilityAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerEligibilityAssessmentRetrieveOutputModel.json",new TypeReference<CRCustomerEligibilityAssessmentRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCustomerProductServiceEligibilityRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCustomerProductServiceEligibilityRetrieveOutputModel.json",new TypeReference<SDCustomerProductServiceEligibilityRetrieveOutputModel>(){});
	}
	
	public CRCustomerEligibilityAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerEligibilityAssessmentUpdateInputModel request){
		return JsonReader.read("update-CRCustomerEligibilityAssessmentUpdateOutputModel.json",new TypeReference<CRCustomerEligibilityAssessmentUpdateOutputModel>(){});
	}
	
	public BQNextBestUpdateOutputModel updateNextbest(String sdReferenceId, String crReferenceId, String bqReferenceId, BQNextBestUpdateInputModel request){
		return JsonReader.read("update-BQNextBestUpdateOutputModel.json",new TypeReference<BQNextBestUpdateOutputModel>(){});
	}
	
}
