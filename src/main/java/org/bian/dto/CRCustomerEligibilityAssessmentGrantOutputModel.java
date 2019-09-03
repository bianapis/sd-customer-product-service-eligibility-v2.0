package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerEligibilityAssessmentGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerEligibilityAssessmentGrantOutputModel
 */
public class CRCustomerEligibilityAssessmentGrantOutputModel   {
  private String customerEligibilityAssessmentGrantActionTaskReference = null;

  private Object customerEligibilityAssessmentGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRCustomerEligibilityAssessmentGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Eligibility Assessment instance grant service call 
   * @return customerEligibilityAssessmentGrantActionTaskReference
  **/

  public String getCustomerEligibilityAssessmentGrantActionTaskReference() {
    return customerEligibilityAssessmentGrantActionTaskReference;
  }

  public void setCustomerEligibilityAssessmentGrantActionTaskReference(String customerEligibilityAssessmentGrantActionTaskReference) {
    this.customerEligibilityAssessmentGrantActionTaskReference = customerEligibilityAssessmentGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return customerEligibilityAssessmentGrantActionTaskRecord
  **/

  public Object getCustomerEligibilityAssessmentGrantActionTaskRecord() {
    return customerEligibilityAssessmentGrantActionTaskRecord;
  }

  public void setCustomerEligibilityAssessmentGrantActionTaskRecord(Object customerEligibilityAssessmentGrantActionTaskRecord) {
    this.customerEligibilityAssessmentGrantActionTaskRecord = customerEligibilityAssessmentGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRCustomerEligibilityAssessmentGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRCustomerEligibilityAssessmentGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

