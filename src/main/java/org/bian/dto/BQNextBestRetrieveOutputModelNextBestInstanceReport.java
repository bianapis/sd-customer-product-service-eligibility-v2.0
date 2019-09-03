package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQNextBestRetrieveOutputModelNextBestInstanceReport
 */
public class BQNextBestRetrieveOutputModelNextBestInstanceReport   {
  private Object nextBestInstanceReportRecord = null;

  private String nextBestInstanceReportType = null;

  private String nextBestInstanceReportParameters = null;

  private Object nextBestInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return nextBestInstanceReportRecord
  **/

  public Object getNextBestInstanceReportRecord() {
    return nextBestInstanceReportRecord;
  }

  public void setNextBestInstanceReportRecord(Object nextBestInstanceReportRecord) {
    this.nextBestInstanceReportRecord = nextBestInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return nextBestInstanceReportType
  **/

  public String getNextBestInstanceReportType() {
    return nextBestInstanceReportType;
  }

  public void setNextBestInstanceReportType(String nextBestInstanceReportType) {
    this.nextBestInstanceReportType = nextBestInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return nextBestInstanceReportParameters
  **/

  public String getNextBestInstanceReportParameters() {
    return nextBestInstanceReportParameters;
  }

  public void setNextBestInstanceReportParameters(String nextBestInstanceReportParameters) {
    this.nextBestInstanceReportParameters = nextBestInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return nextBestInstanceReport
  **/

  public Object getNextBestInstanceReport() {
    return nextBestInstanceReport;
  }

  public void setNextBestInstanceReport(Object nextBestInstanceReport) {
    this.nextBestInstanceReport = nextBestInstanceReport;
  }


}

