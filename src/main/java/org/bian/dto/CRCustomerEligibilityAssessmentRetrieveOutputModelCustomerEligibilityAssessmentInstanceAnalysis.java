package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerEligibilityAssessmentRetrieveOutputModelCustomerEligibilityAssessmentInstanceAnalysis
 */
public class CRCustomerEligibilityAssessmentRetrieveOutputModelCustomerEligibilityAssessmentInstanceAnalysis   {
  private String customerEligibilityAssessmentInstanceAnalysisData = null;

  private String customerEligibilityAssessmentInstanceAnalysisReportType = null;

  private Object customerEligibilityAssessmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerEligibilityAssessmentInstanceAnalysisData
  **/

  public String getCustomerEligibilityAssessmentInstanceAnalysisData() {
    return customerEligibilityAssessmentInstanceAnalysisData;
  }

  public void setCustomerEligibilityAssessmentInstanceAnalysisData(String customerEligibilityAssessmentInstanceAnalysisData) {
    this.customerEligibilityAssessmentInstanceAnalysisData = customerEligibilityAssessmentInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerEligibilityAssessmentInstanceAnalysisReportType
  **/

  public String getCustomerEligibilityAssessmentInstanceAnalysisReportType() {
    return customerEligibilityAssessmentInstanceAnalysisReportType;
  }

  public void setCustomerEligibilityAssessmentInstanceAnalysisReportType(String customerEligibilityAssessmentInstanceAnalysisReportType) {
    this.customerEligibilityAssessmentInstanceAnalysisReportType = customerEligibilityAssessmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerEligibilityAssessmentInstanceAnalysisReport
  **/

  public Object getCustomerEligibilityAssessmentInstanceAnalysisReport() {
    return customerEligibilityAssessmentInstanceAnalysisReport;
  }

  public void setCustomerEligibilityAssessmentInstanceAnalysisReport(Object customerEligibilityAssessmentInstanceAnalysisReport) {
    this.customerEligibilityAssessmentInstanceAnalysisReport = customerEligibilityAssessmentInstanceAnalysisReport;
  }


}

