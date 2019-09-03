package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEligibilityCheckRetrieveOutputModelEligibilityCheckInstanceRecord
 */
public class BQEligibilityCheckRetrieveOutputModelEligibilityCheckInstanceRecord   {
  private String customerProductServiceEligibilityAssessmentResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the eligibility assessment for the requested product/service - details any eligibility considerations or requirements and the applicable terms 
   * @return customerProductServiceEligibilityAssessmentResult
  **/

  public String getCustomerProductServiceEligibilityAssessmentResult() {
    return customerProductServiceEligibilityAssessmentResult;
  }

  public void setCustomerProductServiceEligibilityAssessmentResult(String customerProductServiceEligibilityAssessmentResult) {
    this.customerProductServiceEligibilityAssessmentResult = customerProductServiceEligibilityAssessmentResult;
  }


}

