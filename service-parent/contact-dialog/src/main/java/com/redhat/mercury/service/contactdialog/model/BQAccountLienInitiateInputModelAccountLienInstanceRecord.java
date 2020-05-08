package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQAccountLienInitiateInputModelAccountLienInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class BQAccountLienInitiateInputModelAccountLienInstanceRecord   {
  @JsonProperty("lienType")
  private String lienType;

  @JsonProperty("lienDefinition")
  private String lienDefinition;

  @JsonProperty("lienProcessingOption")
  private String lienProcessingOption;

  @JsonProperty("lienRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord lienRecord;

  public BQAccountLienInitiateInputModelAccountLienInstanceRecord lienType(String lienType) {
    this.lienType = lienType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of lien (e.g. final, pending) 
   * @return lienType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of lien (e.g. final, pending) ")


  public String getLienType() {
    return lienType;
  }

  public void setLienType(String lienType) {
    this.lienType = lienType;
  }

  public BQAccountLienInitiateInputModelAccountLienInstanceRecord lienDefinition(String lienDefinition) {
    this.lienDefinition = lienDefinition;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the type of lien including processing guidelines 
   * @return lienDefinition
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the type of lien including processing guidelines ")


  public String getLienDefinition() {
    return lienDefinition;
  }

  public void setLienDefinition(String lienDefinition) {
    this.lienDefinition = lienDefinition;
  }

  public BQAccountLienInitiateInputModelAccountLienInstanceRecord lienProcessingOption(String lienProcessingOption) {
    this.lienProcessingOption = lienProcessingOption;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The processing option applied to the lien 
   * @return lienProcessingOption
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The processing option applied to the lien ")


  public String getLienProcessingOption() {
    return lienProcessingOption;
  }

  public void setLienProcessingOption(String lienProcessingOption) {
    this.lienProcessingOption = lienProcessingOption;
  }

  public BQAccountLienInitiateInputModelAccountLienInstanceRecord lienRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord lienRecord) {
    this.lienRecord = lienRecord;
    return this;
  }

  /**
   * Get lienRecord
   * @return lienRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord getLienRecord() {
    return lienRecord;
  }

  public void setLienRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord lienRecord) {
    this.lienRecord = lienRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAccountLienInitiateInputModelAccountLienInstanceRecord bqAccountLienInitiateInputModelAccountLienInstanceRecord = (BQAccountLienInitiateInputModelAccountLienInstanceRecord) o;
    return Objects.equals(this.lienType, bqAccountLienInitiateInputModelAccountLienInstanceRecord.lienType) &&
        Objects.equals(this.lienDefinition, bqAccountLienInitiateInputModelAccountLienInstanceRecord.lienDefinition) &&
        Objects.equals(this.lienProcessingOption, bqAccountLienInitiateInputModelAccountLienInstanceRecord.lienProcessingOption) &&
        Objects.equals(this.lienRecord, bqAccountLienInitiateInputModelAccountLienInstanceRecord.lienRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lienType, lienDefinition, lienProcessingOption, lienRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountLienInitiateInputModelAccountLienInstanceRecord {\n");
    
    sb.append("    lienType: ").append(toIndentedString(lienType)).append("\n");
    sb.append("    lienDefinition: ").append(toIndentedString(lienDefinition)).append("\n");
    sb.append("    lienProcessingOption: ").append(toIndentedString(lienProcessingOption)).append("\n");
    sb.append("    lienRecord: ").append(toIndentedString(lienRecord)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

