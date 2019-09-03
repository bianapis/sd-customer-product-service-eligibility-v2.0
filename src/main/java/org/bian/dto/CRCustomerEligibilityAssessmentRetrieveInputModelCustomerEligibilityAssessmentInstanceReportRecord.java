package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerEligibilityAssessmentRetrieveInputModelCustomerEligibilityAssessmentInstanceReportRecord
 */
public class CRCustomerEligibilityAssessmentRetrieveInputModelCustomerEligibilityAssessmentInstanceReportRecord   {
  private String customerEligibilityAssessmentInstanceReportReference = null;

  private String customerEligibilityAssessmentInstanceReportType = null;

  private String customerEligibilityAssessmentInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerEligibilityAssessmentInstanceReportReference
  **/

  public String getCustomerEligibilityAssessmentInstanceReportReference() {
    return customerEligibilityAssessmentInstanceReportReference;
  }

  public void setCustomerEligibilityAssessmentInstanceReportReference(String customerEligibilityAssessmentInstanceReportReference) {
    this.customerEligibilityAssessmentInstanceReportReference = customerEligibilityAssessmentInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerEligibilityAssessmentInstanceReportType
  **/

  public String getCustomerEligibilityAssessmentInstanceReportType() {
    return customerEligibilityAssessmentInstanceReportType;
  }

  public void setCustomerEligibilityAssessmentInstanceReportType(String customerEligibilityAssessmentInstanceReportType) {
    this.customerEligibilityAssessmentInstanceReportType = customerEligibilityAssessmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerEligibilityAssessmentInstanceReportParameters
  **/

  public String getCustomerEligibilityAssessmentInstanceReportParameters() {
    return customerEligibilityAssessmentInstanceReportParameters;
  }

  public void setCustomerEligibilityAssessmentInstanceReportParameters(String customerEligibilityAssessmentInstanceReportParameters) {
    this.customerEligibilityAssessmentInstanceReportParameters = customerEligibilityAssessmentInstanceReportParameters;
  }


}

