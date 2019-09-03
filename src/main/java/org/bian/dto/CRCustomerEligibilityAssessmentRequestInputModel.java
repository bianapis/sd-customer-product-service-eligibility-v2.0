package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerEligibilityAssessmentRequestInputModelCustomerEligibilityAssessmentInstanceRecord;
import org.bian.dto.CRCustomerEligibilityAssessmentRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerEligibilityAssessmentRequestInputModel
 */
public class CRCustomerEligibilityAssessmentRequestInputModel   {
  private String customerProductServiceEligibilityServicingSessionReference = null;

  private String customerEligibilityAssessmentInstanceReference = null;

  private CRCustomerEligibilityAssessmentRequestInputModelCustomerEligibilityAssessmentInstanceRecord customerEligibilityAssessmentInstanceRecord = null;

  private String date = null;

  private Object customerEligibilityAssessmentRequestActionTaskRecord = null;

  private CRCustomerEligibilityAssessmentRequestInputModelRequestRecordType requestRecordType = null;


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
   * Get customerEligibilityAssessmentInstanceRecord
   * @return customerEligibilityAssessmentInstanceRecord
  **/

  public CRCustomerEligibilityAssessmentRequestInputModelCustomerEligibilityAssessmentInstanceRecord getCustomerEligibilityAssessmentInstanceRecord() {
    return customerEligibilityAssessmentInstanceRecord;
  }

  public void setCustomerEligibilityAssessmentInstanceRecord(CRCustomerEligibilityAssessmentRequestInputModelCustomerEligibilityAssessmentInstanceRecord customerEligibilityAssessmentInstanceRecord) {
    this.customerEligibilityAssessmentInstanceRecord = customerEligibilityAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date time of the assessment 
   * @return date
  **/

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerEligibilityAssessmentRequestActionTaskRecord
  **/

  public Object getCustomerEligibilityAssessmentRequestActionTaskRecord() {
    return customerEligibilityAssessmentRequestActionTaskRecord;
  }

  public void setCustomerEligibilityAssessmentRequestActionTaskRecord(Object customerEligibilityAssessmentRequestActionTaskRecord) {
    this.customerEligibilityAssessmentRequestActionTaskRecord = customerEligibilityAssessmentRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCustomerEligibilityAssessmentRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCustomerEligibilityAssessmentRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

