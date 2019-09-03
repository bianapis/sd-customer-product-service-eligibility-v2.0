package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEligibilityCheckRetrieveInputModelEligibilityCheckInstanceAnalysis;
import org.bian.dto.BQEligibilityCheckRetrieveInputModelEligibilityCheckInstanceReport;

import javax.validation.Valid;
  
/**
 * BQEligibilityCheckRetrieveInputModel
 */
public class BQEligibilityCheckRetrieveInputModel   {
  private Object eligibilityCheckRetrieveActionTaskRecord = null;

  private String eligibilityCheckRetrieveActionRequest = null;

  private BQEligibilityCheckRetrieveInputModelEligibilityCheckInstanceReport eligibilityCheckInstanceReport = null;

  private BQEligibilityCheckRetrieveInputModelEligibilityCheckInstanceAnalysis eligibilityCheckInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return eligibilityCheckRetrieveActionRequest
  **/

  public String getEligibilityCheckRetrieveActionRequest() {
    return eligibilityCheckRetrieveActionRequest;
  }

  public void setEligibilityCheckRetrieveActionRequest(String eligibilityCheckRetrieveActionRequest) {
    this.eligibilityCheckRetrieveActionRequest = eligibilityCheckRetrieveActionRequest;
  }


  /**
   * Get eligibilityCheckInstanceReport
   * @return eligibilityCheckInstanceReport
  **/

  public BQEligibilityCheckRetrieveInputModelEligibilityCheckInstanceReport getEligibilityCheckInstanceReport() {
    return eligibilityCheckInstanceReport;
  }

  public void setEligibilityCheckInstanceReport(BQEligibilityCheckRetrieveInputModelEligibilityCheckInstanceReport eligibilityCheckInstanceReport) {
    this.eligibilityCheckInstanceReport = eligibilityCheckInstanceReport;
  }


  /**
   * Get eligibilityCheckInstanceAnalysis
   * @return eligibilityCheckInstanceAnalysis
  **/

  public BQEligibilityCheckRetrieveInputModelEligibilityCheckInstanceAnalysis getEligibilityCheckInstanceAnalysis() {
    return eligibilityCheckInstanceAnalysis;
  }

  public void setEligibilityCheckInstanceAnalysis(BQEligibilityCheckRetrieveInputModelEligibilityCheckInstanceAnalysis eligibilityCheckInstanceAnalysis) {
    this.eligibilityCheckInstanceAnalysis = eligibilityCheckInstanceAnalysis;
  }


}

