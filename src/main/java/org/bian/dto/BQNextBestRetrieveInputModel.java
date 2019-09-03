package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQNextBestRetrieveInputModelNextBestInstanceAnalysis;
import org.bian.dto.BQNextBestRetrieveInputModelNextBestInstanceReport;

import javax.validation.Valid;
  
/**
 * BQNextBestRetrieveInputModel
 */
public class BQNextBestRetrieveInputModel   {
  private Object nextBestRetrieveActionTaskRecord = null;

  private String nextBestRetrieveActionRequest = null;

  private BQNextBestRetrieveInputModelNextBestInstanceReport nextBestInstanceReport = null;

  private BQNextBestRetrieveInputModelNextBestInstanceAnalysis nextBestInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return nextBestRetrieveActionTaskRecord
  **/

  public Object getNextBestRetrieveActionTaskRecord() {
    return nextBestRetrieveActionTaskRecord;
  }

  public void setNextBestRetrieveActionTaskRecord(Object nextBestRetrieveActionTaskRecord) {
    this.nextBestRetrieveActionTaskRecord = nextBestRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return nextBestRetrieveActionRequest
  **/

  public String getNextBestRetrieveActionRequest() {
    return nextBestRetrieveActionRequest;
  }

  public void setNextBestRetrieveActionRequest(String nextBestRetrieveActionRequest) {
    this.nextBestRetrieveActionRequest = nextBestRetrieveActionRequest;
  }


  /**
   * Get nextBestInstanceReport
   * @return nextBestInstanceReport
  **/

  public BQNextBestRetrieveInputModelNextBestInstanceReport getNextBestInstanceReport() {
    return nextBestInstanceReport;
  }

  public void setNextBestInstanceReport(BQNextBestRetrieveInputModelNextBestInstanceReport nextBestInstanceReport) {
    this.nextBestInstanceReport = nextBestInstanceReport;
  }


  /**
   * Get nextBestInstanceAnalysis
   * @return nextBestInstanceAnalysis
  **/

  public BQNextBestRetrieveInputModelNextBestInstanceAnalysis getNextBestInstanceAnalysis() {
    return nextBestInstanceAnalysis;
  }

  public void setNextBestInstanceAnalysis(BQNextBestRetrieveInputModelNextBestInstanceAnalysis nextBestInstanceAnalysis) {
    this.nextBestInstanceAnalysis = nextBestInstanceAnalysis;
  }


}

