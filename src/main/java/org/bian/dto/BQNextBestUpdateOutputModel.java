package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQNextBestUpdateInputModelNextBestInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQNextBestUpdateOutputModel
 */
public class BQNextBestUpdateOutputModel   {
  private BQNextBestUpdateInputModelNextBestInstanceRecord nextBestInstanceRecord = null;

  private String nextBestUpdateActionTaskReference = null;

  private Object nextBestUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get nextBestInstanceRecord
   * @return nextBestInstanceRecord
  **/

  public BQNextBestUpdateInputModelNextBestInstanceRecord getNextBestInstanceRecord() {
    return nextBestInstanceRecord;
  }

  public void setNextBestInstanceRecord(BQNextBestUpdateInputModelNextBestInstanceRecord nextBestInstanceRecord) {
    this.nextBestInstanceRecord = nextBestInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return nextBestUpdateActionTaskReference
  **/

  public String getNextBestUpdateActionTaskReference() {
    return nextBestUpdateActionTaskReference;
  }

  public void setNextBestUpdateActionTaskReference(String nextBestUpdateActionTaskReference) {
    this.nextBestUpdateActionTaskReference = nextBestUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return nextBestUpdateActionTaskRecord
  **/

  public Object getNextBestUpdateActionTaskRecord() {
    return nextBestUpdateActionTaskRecord;
  }

  public void setNextBestUpdateActionTaskRecord(Object nextBestUpdateActionTaskRecord) {
    this.nextBestUpdateActionTaskRecord = nextBestUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

