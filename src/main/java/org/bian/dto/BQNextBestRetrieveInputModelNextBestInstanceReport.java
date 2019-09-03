package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQNextBestRetrieveInputModelNextBestInstanceReport
 */
public class BQNextBestRetrieveInputModelNextBestInstanceReport   {
  private String nextBestInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return nextBestInstanceReportReference
  **/

  public String getNextBestInstanceReportReference() {
    return nextBestInstanceReportReference;
  }

  public void setNextBestInstanceReportReference(String nextBestInstanceReportReference) {
    this.nextBestInstanceReportReference = nextBestInstanceReportReference;
  }


}

