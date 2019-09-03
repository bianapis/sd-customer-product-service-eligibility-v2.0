package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerEligibilityAssessmentRetrieveInputModelCustomerEligibilityAssessmentInstanceAnalysis
 */
public class CRCustomerEligibilityAssessmentRetrieveInputModelCustomerEligibilityAssessmentInstanceAnalysis   {
  private String customerEligibilityAssessmentInstanceAnalysisReference = null;

  private String customerEligibilityAssessmentInstanceAnalysisReportType = null;

  private String customerEligibilityAssessmentInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerEligibilityAssessmentInstanceAnalysisReference
  **/

  public String getCustomerEligibilityAssessmentInstanceAnalysisReference() {
    return customerEligibilityAssessmentInstanceAnalysisReference;
  }

  public void setCustomerEligibilityAssessmentInstanceAnalysisReference(String customerEligibilityAssessmentInstanceAnalysisReference) {
    this.customerEligibilityAssessmentInstanceAnalysisReference = customerEligibilityAssessmentInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerEligibilityAssessmentInstanceAnalysisParameters
  **/

  public String getCustomerEligibilityAssessmentInstanceAnalysisParameters() {
    return customerEligibilityAssessmentInstanceAnalysisParameters;
  }

  public void setCustomerEligibilityAssessmentInstanceAnalysisParameters(String customerEligibilityAssessmentInstanceAnalysisParameters) {
    this.customerEligibilityAssessmentInstanceAnalysisParameters = customerEligibilityAssessmentInstanceAnalysisParameters;
  }


}

