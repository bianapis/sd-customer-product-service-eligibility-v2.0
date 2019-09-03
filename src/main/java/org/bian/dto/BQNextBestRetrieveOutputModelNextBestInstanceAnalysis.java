package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQNextBestRetrieveOutputModelNextBestInstanceAnalysis
 */
public class BQNextBestRetrieveOutputModelNextBestInstanceAnalysis   {
  private Object nextBestInstanceAnalysisRecord = null;

  private String nextBestInstanceAnalysisReportType = null;

  private String nextBestInstanceAnalysisParameters = null;

  private Object nextBestInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return nextBestInstanceAnalysisRecord
  **/

  public Object getNextBestInstanceAnalysisRecord() {
    return nextBestInstanceAnalysisRecord;
  }

  public void setNextBestInstanceAnalysisRecord(Object nextBestInstanceAnalysisRecord) {
    this.nextBestInstanceAnalysisRecord = nextBestInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return nextBestInstanceAnalysisReportType
  **/

  public String getNextBestInstanceAnalysisReportType() {
    return nextBestInstanceAnalysisReportType;
  }

  public void setNextBestInstanceAnalysisReportType(String nextBestInstanceAnalysisReportType) {
    this.nextBestInstanceAnalysisReportType = nextBestInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return nextBestInstanceAnalysisParameters
  **/

  public String getNextBestInstanceAnalysisParameters() {
    return nextBestInstanceAnalysisParameters;
  }

  public void setNextBestInstanceAnalysisParameters(String nextBestInstanceAnalysisParameters) {
    this.nextBestInstanceAnalysisParameters = nextBestInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return nextBestInstanceAnalysisReport
  **/

  public Object getNextBestInstanceAnalysisReport() {
    return nextBestInstanceAnalysisReport;
  }

  public void setNextBestInstanceAnalysisReport(Object nextBestInstanceAnalysisReport) {
    this.nextBestInstanceAnalysisReport = nextBestInstanceAnalysisReport;
  }


}

