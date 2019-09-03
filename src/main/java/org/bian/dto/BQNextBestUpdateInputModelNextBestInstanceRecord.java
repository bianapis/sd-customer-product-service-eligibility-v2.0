package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQNextBestUpdateInputModelNextBestInstanceRecord
 */
public class BQNextBestUpdateInputModelNextBestInstanceRecord   {
  private String requestedProductServiceProperties = null;

  private String productServiceType = null;

  private String customerProductServiceNextBestAssessmentResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Product/service features used to focus the selection 
   * @return requestedProductServiceProperties
  **/

  public String getRequestedProductServiceProperties() {
    return requestedProductServiceProperties;
  }

  public void setRequestedProductServiceProperties(String requestedProductServiceProperties) {
    this.requestedProductServiceProperties = requestedProductServiceProperties;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The general type of product/service for which the best eligible product match is requested (e.g. term deposit, loan) 
   * @return productServiceType
  **/

  public String getProductServiceType() {
    return productServiceType;
  }

  public void setProductServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result is a descending list of matched products with the associated eligibility that are available to the customer 
   * @return customerProductServiceNextBestAssessmentResult
  **/

  public String getCustomerProductServiceNextBestAssessmentResult() {
    return customerProductServiceNextBestAssessmentResult;
  }

  public void setCustomerProductServiceNextBestAssessmentResult(String customerProductServiceNextBestAssessmentResult) {
    this.customerProductServiceNextBestAssessmentResult = customerProductServiceNextBestAssessmentResult;
  }


}

