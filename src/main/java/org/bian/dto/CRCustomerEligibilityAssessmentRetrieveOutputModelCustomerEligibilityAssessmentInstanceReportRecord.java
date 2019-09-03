package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerEligibilityAssessmentRetrieveOutputModelCustomerEligibilityAssessmentInstanceReportRecord
 */
public class CRCustomerEligibilityAssessmentRetrieveOutputModelCustomerEligibilityAssessmentInstanceReportRecord   {
  private String customerEligibilityAssessmentInstanceReportData = null;

  private String customerEligibilityAssessmentInstanceReportType = null;

  private Object customerEligibilityAssessmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerEligibilityAssessmentInstanceReportData
  **/

  public String getCustomerEligibilityAssessmentInstanceReportData() {
    return customerEligibilityAssessmentInstanceReportData;
  }

  public void setCustomerEligibilityAssessmentInstanceReportData(String customerEligibilityAssessmentInstanceReportData) {
    this.customerEligibilityAssessmentInstanceReportData = customerEligibilityAssessmentInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerEligibilityAssessmentInstanceReport
  **/

  public Object getCustomerEligibilityAssessmentInstanceReport() {
    return customerEligibilityAssessmentInstanceReport;
  }

  public void setCustomerEligibilityAssessmentInstanceReport(Object customerEligibilityAssessmentInstanceReport) {
    this.customerEligibilityAssessmentInstanceReport = customerEligibilityAssessmentInstanceReport;
  }


}

