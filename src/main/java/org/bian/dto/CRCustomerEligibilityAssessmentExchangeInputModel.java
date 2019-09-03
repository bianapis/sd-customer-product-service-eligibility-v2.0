package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerEligibilityAssessmentExchangeInputModelCustomerEligibilityAssessmentExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerEligibilityAssessmentExchangeInputModel
 */
public class CRCustomerEligibilityAssessmentExchangeInputModel   {
  private String customerProductServiceEligibilityServicingSessionReference = null;

  private String customerEligibilityAssessmentInstanceReference = null;

  private Object customerEligibilityAssessmentExchangeActionTaskRecord = null;

  private CRCustomerEligibilityAssessmentExchangeInputModelCustomerEligibilityAssessmentExchangeActionRequest customerEligibilityAssessmentExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerProductServiceEligibilityServicingSessionReference
  **/

  public String getCustomerProductServiceEligibilityServicingSessionReference() {
    return customerProductServiceEligibilityServicingSessionReference;
  }

  public void setCustomerProductServiceEligibilityServicingSessionReference(String customerProductServiceEligibilityServicingSessionReference) {
    this.customerProductServiceEligibilityServicingSessionReference = customerProductServiceEligibilityServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Eligibility Assessment instance 
   * @return customerEligibilityAssessmentInstanceReference
  **/

  public String getCustomerEligibilityAssessmentInstanceReference() {
    return customerEligibilityAssessmentInstanceReference;
  }

  public void setCustomerEligibilityAssessmentInstanceReference(String customerEligibilityAssessmentInstanceReference) {
    this.customerEligibilityAssessmentInstanceReference = customerEligibilityAssessmentInstanceReference;
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
   * Get customerEligibilityAssessmentExchangeActionRequest
   * @return customerEligibilityAssessmentExchangeActionRequest
  **/

  public CRCustomerEligibilityAssessmentExchangeInputModelCustomerEligibilityAssessmentExchangeActionRequest getCustomerEligibilityAssessmentExchangeActionRequest() {
    return customerEligibilityAssessmentExchangeActionRequest;
  }

  public void setCustomerEligibilityAssessmentExchangeActionRequest(CRCustomerEligibilityAssessmentExchangeInputModelCustomerEligibilityAssessmentExchangeActionRequest customerEligibilityAssessmentExchangeActionRequest) {
    this.customerEligibilityAssessmentExchangeActionRequest = customerEligibilityAssessmentExchangeActionRequest;
  }


}

