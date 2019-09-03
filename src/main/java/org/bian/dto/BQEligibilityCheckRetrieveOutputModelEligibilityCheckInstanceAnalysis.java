package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEligibilityCheckRetrieveOutputModelEligibilityCheckInstanceAnalysis
 */
public class BQEligibilityCheckRetrieveOutputModelEligibilityCheckInstanceAnalysis   {
  private Object eligibilityCheckInstanceAnalysisRecord = null;

  private String eligibilityCheckInstanceAnalysisReportType = null;

  private String eligibilityCheckInstanceAnalysisParameters = null;

  private Object eligibilityCheckInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return eligibilityCheckInstanceAnalysisRecord
  **/

  public Object getEligibilityCheckInstanceAnalysisRecord() {
    return eligibilityCheckInstanceAnalysisRecord;
  }

  public void setEligibilityCheckInstanceAnalysisRecord(Object eligibilityCheckInstanceAnalysisRecord) {
    this.eligibilityCheckInstanceAnalysisRecord = eligibilityCheckInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return eligibilityCheckInstanceAnalysisReportType
  **/

  public String getEligibilityCheckInstanceAnalysisReportType() {
    return eligibilityCheckInstanceAnalysisReportType;
  }

  public void setEligibilityCheckInstanceAnalysisReportType(String eligibilityCheckInstanceAnalysisReportType) {
    this.eligibilityCheckInstanceAnalysisReportType = eligibilityCheckInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return eligibilityCheckInstanceAnalysisParameters
  **/

  public String getEligibilityCheckInstanceAnalysisParameters() {
    return eligibilityCheckInstanceAnalysisParameters;
  }

  public void setEligibilityCheckInstanceAnalysisParameters(String eligibilityCheckInstanceAnalysisParameters) {
    this.eligibilityCheckInstanceAnalysisParameters = eligibilityCheckInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return eligibilityCheckInstanceAnalysisReport
  **/

  public Object getEligibilityCheckInstanceAnalysisReport() {
    return eligibilityCheckInstanceAnalysisReport;
  }

  public void setEligibilityCheckInstanceAnalysisReport(Object eligibilityCheckInstanceAnalysisReport) {
    this.eligibilityCheckInstanceAnalysisReport = eligibilityCheckInstanceAnalysisReport;
  }


}

