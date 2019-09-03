package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerEligibilityAssessmentExecuteInputModelCustomerEligibilityAssessmentInstanceRecord;
import org.bian.dto.CRCustomerEligibilityAssessmentExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerEligibilityAssessmentExecuteInputModel
 */
public class CRCustomerEligibilityAssessmentExecuteInputModel   {
  private String customerProductServiceEligibilityServicingSessionReference = null;

  private String customerEligibilityAssessmentInstanceReference = null;

  private CRCustomerEligibilityAssessmentExecuteInputModelCustomerEligibilityAssessmentInstanceRecord customerEligibilityAssessmentInstanceRecord = null;

  private String date = null;

  private Object customerEligibilityAssessmentExecuteActionTaskRecord = null;

  private CRCustomerEligibilityAssessmentExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public CRCustomerEligibilityAssessmentExecuteInputModelCustomerEligibilityAssessmentInstanceRecord getCustomerEligibilityAssessmentInstanceRecord() {
    return customerEligibilityAssessmentInstanceRecord;
  }

  public void setCustomerEligibilityAssessmentInstanceRecord(CRCustomerEligibilityAssessmentExecuteInputModelCustomerEligibilityAssessmentInstanceRecord customerEligibilityAssessmentInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return customerEligibilityAssessmentExecuteActionTaskRecord
  **/

  public Object getCustomerEligibilityAssessmentExecuteActionTaskRecord() {
    return customerEligibilityAssessmentExecuteActionTaskRecord;
  }

  public void setCustomerEligibilityAssessmentExecuteActionTaskRecord(Object customerEligibilityAssessmentExecuteActionTaskRecord) {
    this.customerEligibilityAssessmentExecuteActionTaskRecord = customerEligibilityAssessmentExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRCustomerEligibilityAssessmentExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRCustomerEligibilityAssessmentExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

