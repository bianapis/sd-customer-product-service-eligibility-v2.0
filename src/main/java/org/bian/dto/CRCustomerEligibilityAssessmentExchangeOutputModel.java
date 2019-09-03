package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerEligibilityAssessmentExchangeOutputModel
 */
public class CRCustomerEligibilityAssessmentExchangeOutputModel   {
  private String customerEligibilityAssessmentExchangeActionTaskReference = null;

  private Object customerEligibilityAssessmentExchangeActionTaskRecord = null;

  private String customerEligibilityAssessmentExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Eligibility Assessment instance exchange service call 
   * @return customerEligibilityAssessmentExchangeActionTaskReference
  **/

  public String getCustomerEligibilityAssessmentExchangeActionTaskReference() {
    return customerEligibilityAssessmentExchangeActionTaskReference;
  }

  public void setCustomerEligibilityAssessmentExchangeActionTaskReference(String customerEligibilityAssessmentExchangeActionTaskReference) {
    this.customerEligibilityAssessmentExchangeActionTaskReference = customerEligibilityAssessmentExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return customerEligibilityAssessmentExchangeActionTaskRecord
  **/

  public Object getCustomerEligibilityAssessmentExchangeActionTaskRecord() {
    return customerEligibilityAssessmentExchangeActionTaskRecord;
  }

  public void setCustomerEligibilityAssessmentExchangeActionTaskRecord(Object customerEligibilityAssessmentExchangeActionTaskRecord) {
    this.customerEligibilityAssessmentExchangeActionTaskRecord = customerEligibilityAssessmentExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return customerEligibilityAssessmentExchangeActionResponse
  **/

  public String getCustomerEligibilityAssessmentExchangeActionResponse() {
    return customerEligibilityAssessmentExchangeActionResponse;
  }

  public void setCustomerEligibilityAssessmentExchangeActionResponse(String customerEligibilityAssessmentExchangeActionResponse) {
    this.customerEligibilityAssessmentExchangeActionResponse = customerEligibilityAssessmentExchangeActionResponse;
  }


}

