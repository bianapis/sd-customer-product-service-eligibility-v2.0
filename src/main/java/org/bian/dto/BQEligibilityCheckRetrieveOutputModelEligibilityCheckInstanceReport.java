package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEligibilityCheckRetrieveOutputModelEligibilityCheckInstanceReport
 */
public class BQEligibilityCheckRetrieveOutputModelEligibilityCheckInstanceReport   {
  private Object eligibilityCheckInstanceReportRecord = null;

  private String eligibilityCheckInstanceReportType = null;

  private String eligibilityCheckInstanceReportParameters = null;

  private Object eligibilityCheckInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return eligibilityCheckInstanceReportRecord
  **/

  public Object getEligibilityCheckInstanceReportRecord() {
    return eligibilityCheckInstanceReportRecord;
  }

  public void setEligibilityCheckInstanceReportRecord(Object eligibilityCheckInstanceReportRecord) {
    this.eligibilityCheckInstanceReportRecord = eligibilityCheckInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return eligibilityCheckInstanceReportType
  **/

  public String getEligibilityCheckInstanceReportType() {
    return eligibilityCheckInstanceReportType;
  }

  public void setEligibilityCheckInstanceReportType(String eligibilityCheckInstanceReportType) {
    this.eligibilityCheckInstanceReportType = eligibilityCheckInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return eligibilityCheckInstanceReportParameters
  **/

  public String getEligibilityCheckInstanceReportParameters() {
    return eligibilityCheckInstanceReportParameters;
  }

  public void setEligibilityCheckInstanceReportParameters(String eligibilityCheckInstanceReportParameters) {
    this.eligibilityCheckInstanceReportParameters = eligibilityCheckInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return eligibilityCheckInstanceReport
  **/

  public Object getEligibilityCheckInstanceReport() {
    return eligibilityCheckInstanceReport;
  }

  public void setEligibilityCheckInstanceReport(Object eligibilityCheckInstanceReport) {
    this.eligibilityCheckInstanceReport = eligibilityCheckInstanceReport;
  }


}

