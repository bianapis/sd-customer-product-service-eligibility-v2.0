package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerEligibilityAssessmentRetrieveInputModelCustomerEligibilityAssessmentInstanceAnalysis;
import org.bian.dto.CRCustomerEligibilityAssessmentRetrieveInputModelCustomerEligibilityAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerEligibilityAssessmentRetrieveInputModel
 */
public class CRCustomerEligibilityAssessmentRetrieveInputModel   {
  private Object customerEligibilityAssessmentRetrieveActionTaskRecord = null;

  private String customerEligibilityAssessmentRetrieveActionRequest = null;

  private CRCustomerEligibilityAssessmentRetrieveInputModelCustomerEligibilityAssessmentInstanceReportRecord customerEligibilityAssessmentInstanceReportRecord = null;

  private CRCustomerEligibilityAssessmentRetrieveInputModelCustomerEligibilityAssessmentInstanceAnalysis customerEligibilityAssessmentInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerEligibilityAssessmentRetrieveActionRequest
  **/

  public String getCustomerEligibilityAssessmentRetrieveActionRequest() {
    return customerEligibilityAssessmentRetrieveActionRequest;
  }

  public void setCustomerEligibilityAssessmentRetrieveActionRequest(String customerEligibilityAssessmentRetrieveActionRequest) {
    this.customerEligibilityAssessmentRetrieveActionRequest = customerEligibilityAssessmentRetrieveActionRequest;
  }


  /**
   * Get customerEligibilityAssessmentInstanceReportRecord
   * @return customerEligibilityAssessmentInstanceReportRecord
  **/

  public CRCustomerEligibilityAssessmentRetrieveInputModelCustomerEligibilityAssessmentInstanceReportRecord getCustomerEligibilityAssessmentInstanceReportRecord() {
    return customerEligibilityAssessmentInstanceReportRecord;
  }

  public void setCustomerEligibilityAssessmentInstanceReportRecord(CRCustomerEligibilityAssessmentRetrieveInputModelCustomerEligibilityAssessmentInstanceReportRecord customerEligibilityAssessmentInstanceReportRecord) {
    this.customerEligibilityAssessmentInstanceReportRecord = customerEligibilityAssessmentInstanceReportRecord;
  }


  /**
   * Get customerEligibilityAssessmentInstanceAnalysis
   * @return customerEligibilityAssessmentInstanceAnalysis
  **/

  public CRCustomerEligibilityAssessmentRetrieveInputModelCustomerEligibilityAssessmentInstanceAnalysis getCustomerEligibilityAssessmentInstanceAnalysis() {
    return customerEligibilityAssessmentInstanceAnalysis;
  }

  public void setCustomerEligibilityAssessmentInstanceAnalysis(CRCustomerEligibilityAssessmentRetrieveInputModelCustomerEligibilityAssessmentInstanceAnalysis customerEligibilityAssessmentInstanceAnalysis) {
    this.customerEligibilityAssessmentInstanceAnalysis = customerEligibilityAssessmentInstanceAnalysis;
  }


}

