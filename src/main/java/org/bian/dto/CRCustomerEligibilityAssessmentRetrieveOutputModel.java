package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerEligibilityAssessmentRetrieveOutputModelCustomerEligibilityAssessmentInstanceAnalysis;
import org.bian.dto.CRCustomerEligibilityAssessmentRetrieveOutputModelCustomerEligibilityAssessmentInstanceRecord;
import org.bian.dto.CRCustomerEligibilityAssessmentRetrieveOutputModelCustomerEligibilityAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerEligibilityAssessmentRetrieveOutputModel
 */
public class CRCustomerEligibilityAssessmentRetrieveOutputModel   {
  private CRCustomerEligibilityAssessmentRetrieveOutputModelCustomerEligibilityAssessmentInstanceRecord customerEligibilityAssessmentInstanceRecord = null;

  private String date = null;

  private String customerEligibilityAssessmentRetrieveActionTaskReference = null;

  private Object customerEligibilityAssessmentRetrieveActionTaskRecord = null;

  private String customerEligibilityAssessmentRetrieveActionResponse = null;

  private CRCustomerEligibilityAssessmentRetrieveOutputModelCustomerEligibilityAssessmentInstanceReportRecord customerEligibilityAssessmentInstanceReportRecord = null;

  private CRCustomerEligibilityAssessmentRetrieveOutputModelCustomerEligibilityAssessmentInstanceAnalysis customerEligibilityAssessmentInstanceAnalysis = null;


  /**
   * Get customerEligibilityAssessmentInstanceRecord
   * @return customerEligibilityAssessmentInstanceRecord
  **/

  public CRCustomerEligibilityAssessmentRetrieveOutputModelCustomerEligibilityAssessmentInstanceRecord getCustomerEligibilityAssessmentInstanceRecord() {
    return customerEligibilityAssessmentInstanceRecord;
  }

  public void setCustomerEligibilityAssessmentInstanceRecord(CRCustomerEligibilityAssessmentRetrieveOutputModelCustomerEligibilityAssessmentInstanceRecord customerEligibilityAssessmentInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Eligibility Assessment instance retrieve service call 
   * @return customerEligibilityAssessmentRetrieveActionTaskReference
  **/

  public String getCustomerEligibilityAssessmentRetrieveActionTaskReference() {
    return customerEligibilityAssessmentRetrieveActionTaskReference;
  }

  public void setCustomerEligibilityAssessmentRetrieveActionTaskReference(String customerEligibilityAssessmentRetrieveActionTaskReference) {
    this.customerEligibilityAssessmentRetrieveActionTaskReference = customerEligibilityAssessmentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerEligibilityAssessmentRetrieveActionTaskRecord
  **/

  public Object getCustomerEligibilityAssessmentRetrieveActionTaskRecord() {
    return customerEligibilityAssessmentRetrieveActionTaskRecord;
  }

  public void setCustomerEligibilityAssessmentRetrieveActionTaskRecord(Object customerEligibilityAssessmentRetrieveActionTaskRecord) {
    this.customerEligibilityAssessmentRetrieveActionTaskRecord = customerEligibilityAssessmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerEligibilityAssessmentRetrieveActionResponse
  **/

  public String getCustomerEligibilityAssessmentRetrieveActionResponse() {
    return customerEligibilityAssessmentRetrieveActionResponse;
  }

  public void setCustomerEligibilityAssessmentRetrieveActionResponse(String customerEligibilityAssessmentRetrieveActionResponse) {
    this.customerEligibilityAssessmentRetrieveActionResponse = customerEligibilityAssessmentRetrieveActionResponse;
  }


  /**
   * Get customerEligibilityAssessmentInstanceReportRecord
   * @return customerEligibilityAssessmentInstanceReportRecord
  **/

  public CRCustomerEligibilityAssessmentRetrieveOutputModelCustomerEligibilityAssessmentInstanceReportRecord getCustomerEligibilityAssessmentInstanceReportRecord() {
    return customerEligibilityAssessmentInstanceReportRecord;
  }

  public void setCustomerEligibilityAssessmentInstanceReportRecord(CRCustomerEligibilityAssessmentRetrieveOutputModelCustomerEligibilityAssessmentInstanceReportRecord customerEligibilityAssessmentInstanceReportRecord) {
    this.customerEligibilityAssessmentInstanceReportRecord = customerEligibilityAssessmentInstanceReportRecord;
  }


  /**
   * Get customerEligibilityAssessmentInstanceAnalysis
   * @return customerEligibilityAssessmentInstanceAnalysis
  **/

  public CRCustomerEligibilityAssessmentRetrieveOutputModelCustomerEligibilityAssessmentInstanceAnalysis getCustomerEligibilityAssessmentInstanceAnalysis() {
    return customerEligibilityAssessmentInstanceAnalysis;
  }

  public void setCustomerEligibilityAssessmentInstanceAnalysis(CRCustomerEligibilityAssessmentRetrieveOutputModelCustomerEligibilityAssessmentInstanceAnalysis customerEligibilityAssessmentInstanceAnalysis) {
    this.customerEligibilityAssessmentInstanceAnalysis = customerEligibilityAssessmentInstanceAnalysis;
  }


}

