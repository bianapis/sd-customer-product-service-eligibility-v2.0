package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQNextBestRetrieveOutputModelCustomerEligibilityAssessmentInstanceRecord;
import org.bian.dto.BQNextBestRetrieveOutputModelNextBestInstanceAnalysis;
import org.bian.dto.BQNextBestRetrieveOutputModelNextBestInstanceReport;
import org.bian.dto.BQNextBestUpdateInputModelNextBestInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQNextBestRetrieveOutputModel
 */
public class BQNextBestRetrieveOutputModel   {
  private BQNextBestRetrieveOutputModelCustomerEligibilityAssessmentInstanceRecord customerEligibilityAssessmentInstanceRecord = null;

  private String date = null;

  private BQNextBestUpdateInputModelNextBestInstanceRecord nextBestInstanceRecord = null;

  private String nextBestRetrieveActionTaskReference = null;

  private Object nextBestRetrieveActionTaskRecord = null;

  private String nextBestRetrieveActionResponse = null;

  private BQNextBestRetrieveOutputModelNextBestInstanceReport nextBestInstanceReport = null;

  private BQNextBestRetrieveOutputModelNextBestInstanceAnalysis nextBestInstanceAnalysis = null;


  /**
   * Get customerEligibilityAssessmentInstanceRecord
   * @return customerEligibilityAssessmentInstanceRecord
  **/

  public BQNextBestRetrieveOutputModelCustomerEligibilityAssessmentInstanceRecord getCustomerEligibilityAssessmentInstanceRecord() {
    return customerEligibilityAssessmentInstanceRecord;
  }

  public void setCustomerEligibilityAssessmentInstanceRecord(BQNextBestRetrieveOutputModelCustomerEligibilityAssessmentInstanceRecord customerEligibilityAssessmentInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Next Best instance retrieve service call 
   * @return nextBestRetrieveActionTaskReference
  **/

  public String getNextBestRetrieveActionTaskReference() {
    return nextBestRetrieveActionTaskReference;
  }

  public void setNextBestRetrieveActionTaskReference(String nextBestRetrieveActionTaskReference) {
    this.nextBestRetrieveActionTaskReference = nextBestRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return nextBestRetrieveActionTaskRecord
  **/

  public Object getNextBestRetrieveActionTaskRecord() {
    return nextBestRetrieveActionTaskRecord;
  }

  public void setNextBestRetrieveActionTaskRecord(Object nextBestRetrieveActionTaskRecord) {
    this.nextBestRetrieveActionTaskRecord = nextBestRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return nextBestRetrieveActionResponse
  **/

  public String getNextBestRetrieveActionResponse() {
    return nextBestRetrieveActionResponse;
  }

  public void setNextBestRetrieveActionResponse(String nextBestRetrieveActionResponse) {
    this.nextBestRetrieveActionResponse = nextBestRetrieveActionResponse;
  }


  /**
   * Get nextBestInstanceReport
   * @return nextBestInstanceReport
  **/

  public BQNextBestRetrieveOutputModelNextBestInstanceReport getNextBestInstanceReport() {
    return nextBestInstanceReport;
  }

  public void setNextBestInstanceReport(BQNextBestRetrieveOutputModelNextBestInstanceReport nextBestInstanceReport) {
    this.nextBestInstanceReport = nextBestInstanceReport;
  }


  /**
   * Get nextBestInstanceAnalysis
   * @return nextBestInstanceAnalysis
  **/

  public BQNextBestRetrieveOutputModelNextBestInstanceAnalysis getNextBestInstanceAnalysis() {
    return nextBestInstanceAnalysis;
  }

  public void setNextBestInstanceAnalysis(BQNextBestRetrieveOutputModelNextBestInstanceAnalysis nextBestInstanceAnalysis) {
    this.nextBestInstanceAnalysis = nextBestInstanceAnalysis;
  }


}

