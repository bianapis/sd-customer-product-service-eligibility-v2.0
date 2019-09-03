package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQNextBestUpdateInputModelNextBestInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQNextBestUpdateInputModel
 */
public class BQNextBestUpdateInputModel   {
  private String customerEligibilityAssessmentInstanceReference = null;

  private String nextBestInstanceReference = null;

  private BQNextBestUpdateInputModelNextBestInstanceRecord nextBestInstanceRecord = null;

  private Object nextBestUpdateActionTaskRecord = null;

  private String nextBestUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Eligibility Assessment instance 
   * @return customerEligibilityAssessmentInstanceReference
  **/

  public String getCustomerEligibilityAssessmentInstanceReference() {
    return customerEligibilityAssessmentInstanceReference;
  }

  public void setCustomerEligibilityAssessmentInstanceReference(String customerEligibilityAssessmentInstanceReference) {
    this.customerEligibilityAssessmentInstanceReference = customerEligibilityAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Next Best instance 
   * @return nextBestInstanceReference
  **/

  public String getNextBestInstanceReference() {
    return nextBestInstanceReference;
  }

  public void setNextBestInstanceReference(String nextBestInstanceReference) {
    this.nextBestInstanceReference = nextBestInstanceReference;
  }


  /**
   * Get nextBestInstanceRecord
   * @return nextBestInstanceRecord
  **/

  public BQNextBestUpdateInputModelNextBestInstanceRecord getNextBestInstanceRecord() {
    return nextBestInstanceRecord;
  }

  public void setNextBestInstanceRecord(BQNextBestUpdateInputModelNextBestInstanceRecord nextBestInstanceRecord) {
    this.nextBestInstanceRecord = nextBestInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return nextBestUpdateActionTaskRecord
  **/

  public Object getNextBestUpdateActionTaskRecord() {
    return nextBestUpdateActionTaskRecord;
  }

  public void setNextBestUpdateActionTaskRecord(Object nextBestUpdateActionTaskRecord) {
    this.nextBestUpdateActionTaskRecord = nextBestUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return nextBestUpdateActionRequest
  **/

  public String getNextBestUpdateActionRequest() {
    return nextBestUpdateActionRequest;
  }

  public void setNextBestUpdateActionRequest(String nextBestUpdateActionRequest) {
    this.nextBestUpdateActionRequest = nextBestUpdateActionRequest;
  }


}

