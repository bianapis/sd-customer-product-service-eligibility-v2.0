package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEligibilityCheckRetrieveOutputModelCustomerEligibilityAssessmentInstanceRecord;
import org.bian.dto.BQEligibilityCheckRetrieveOutputModelEligibilityCheckInstanceAnalysis;
import org.bian.dto.BQEligibilityCheckRetrieveOutputModelEligibilityCheckInstanceRecord;
import org.bian.dto.BQEligibilityCheckRetrieveOutputModelEligibilityCheckInstanceReport;

import javax.validation.Valid;
  
/**
 * BQEligibilityCheckRetrieveOutputModel
 */
public class BQEligibilityCheckRetrieveOutputModel   {
  private BQEligibilityCheckRetrieveOutputModelCustomerEligibilityAssessmentInstanceRecord customerEligibilityAssessmentInstanceRecord = null;

  private String date = null;

  private BQEligibilityCheckRetrieveOutputModelEligibilityCheckInstanceRecord eligibilityCheckInstanceRecord = null;

  private String eligibilityCheckRetrieveActionTaskReference = null;

  private Object eligibilityCheckRetrieveActionTaskRecord = null;

  private String eligibilityCheckRetrieveActionResponse = null;

  private BQEligibilityCheckRetrieveOutputModelEligibilityCheckInstanceReport eligibilityCheckInstanceReport = null;

  private BQEligibilityCheckRetrieveOutputModelEligibilityCheckInstanceAnalysis eligibilityCheckInstanceAnalysis = null;


  /**
   * Get customerEligibilityAssessmentInstanceRecord
   * @return customerEligibilityAssessmentInstanceRecord
  **/

  public BQEligibilityCheckRetrieveOutputModelCustomerEligibilityAssessmentInstanceRecord getCustomerEligibilityAssessmentInstanceRecord() {
    return customerEligibilityAssessmentInstanceRecord;
  }

  public void setCustomerEligibilityAssessmentInstanceRecord(BQEligibilityCheckRetrieveOutputModelCustomerEligibilityAssessmentInstanceRecord customerEligibilityAssessmentInstanceRecord) {
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
   * Get eligibilityCheckInstanceRecord
   * @return eligibilityCheckInstanceRecord
  **/

  public BQEligibilityCheckRetrieveOutputModelEligibilityCheckInstanceRecord getEligibilityCheckInstanceRecord() {
    return eligibilityCheckInstanceRecord;
  }

  public void setEligibilityCheckInstanceRecord(BQEligibilityCheckRetrieveOutputModelEligibilityCheckInstanceRecord eligibilityCheckInstanceRecord) {
    this.eligibilityCheckInstanceRecord = eligibilityCheckInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Eligibility Check instance retrieve service call 
   * @return eligibilityCheckRetrieveActionTaskReference
  **/

  public String getEligibilityCheckRetrieveActionTaskReference() {
    return eligibilityCheckRetrieveActionTaskReference;
  }

  public void setEligibilityCheckRetrieveActionTaskReference(String eligibilityCheckRetrieveActionTaskReference) {
    this.eligibilityCheckRetrieveActionTaskReference = eligibilityCheckRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return eligibilityCheckRetrieveActionTaskRecord
  **/

  public Object getEligibilityCheckRetrieveActionTaskRecord() {
    return eligibilityCheckRetrieveActionTaskRecord;
  }

  public void setEligibilityCheckRetrieveActionTaskRecord(Object eligibilityCheckRetrieveActionTaskRecord) {
    this.eligibilityCheckRetrieveActionTaskRecord = eligibilityCheckRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return eligibilityCheckRetrieveActionResponse
  **/

  public String getEligibilityCheckRetrieveActionResponse() {
    return eligibilityCheckRetrieveActionResponse;
  }

  public void setEligibilityCheckRetrieveActionResponse(String eligibilityCheckRetrieveActionResponse) {
    this.eligibilityCheckRetrieveActionResponse = eligibilityCheckRetrieveActionResponse;
  }


  /**
   * Get eligibilityCheckInstanceReport
   * @return eligibilityCheckInstanceReport
  **/

  public BQEligibilityCheckRetrieveOutputModelEligibilityCheckInstanceReport getEligibilityCheckInstanceReport() {
    return eligibilityCheckInstanceReport;
  }

  public void setEligibilityCheckInstanceReport(BQEligibilityCheckRetrieveOutputModelEligibilityCheckInstanceReport eligibilityCheckInstanceReport) {
    this.eligibilityCheckInstanceReport = eligibilityCheckInstanceReport;
  }


  /**
   * Get eligibilityCheckInstanceAnalysis
   * @return eligibilityCheckInstanceAnalysis
  **/

  public BQEligibilityCheckRetrieveOutputModelEligibilityCheckInstanceAnalysis getEligibilityCheckInstanceAnalysis() {
    return eligibilityCheckInstanceAnalysis;
  }

  public void setEligibilityCheckInstanceAnalysis(BQEligibilityCheckRetrieveOutputModelEligibilityCheckInstanceAnalysis eligibilityCheckInstanceAnalysis) {
    this.eligibilityCheckInstanceAnalysis = eligibilityCheckInstanceAnalysis;
  }


}

