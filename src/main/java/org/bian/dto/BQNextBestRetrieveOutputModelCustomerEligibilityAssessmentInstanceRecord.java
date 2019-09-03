package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQNextBestRetrieveOutputModelCustomerEligibilityAssessmentInstanceRecord
 */
public class BQNextBestRetrieveOutputModelCustomerEligibilityAssessmentInstanceRecord   {
  private String customerReference = null;

  private String customerProductServiceProfile = null;

  private String productServiceType = null;

  private String customerProductServiceTypeEligibility = null;

  private String customerProductServiceTypeUsage = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated customer (can currently be a person or a company) 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: This is the is the eligibility profile including in-force product terms 
   * @return customerProductServiceProfile
  **/

  public String getCustomerProductServiceProfile() {
    return customerProductServiceProfile;
  }

  public void setCustomerProductServiceProfile(String customerProductServiceProfile) {
    this.customerProductServiceProfile = customerProductServiceProfile;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the product/service type - note: the profile will reference all available products/services 
   * @return productServiceType
  **/

  public String getProductServiceType() {
    return productServiceType;
  }

  public void setProductServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines if and under what terms a product/service is available to this customer - this detail is maintained by the service domain and referenced by this evaluation 
   * @return customerProductServiceTypeEligibility
  **/

  public String getCustomerProductServiceTypeEligibility() {
    return customerProductServiceTypeEligibility;
  }

  public void setCustomerProductServiceTypeEligibility(String customerProductServiceTypeEligibility) {
    this.customerProductServiceTypeEligibility = customerProductServiceTypeEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Records the sold/in-force status of a product/service with the customer. Again this detail is maintained by the service domain and referenced by this evaluation 
   * @return customerProductServiceTypeUsage
  **/

  public String getCustomerProductServiceTypeUsage() {
    return customerProductServiceTypeUsage;
  }

  public void setCustomerProductServiceTypeUsage(String customerProductServiceTypeUsage) {
    this.customerProductServiceTypeUsage = customerProductServiceTypeUsage;
  }


}

