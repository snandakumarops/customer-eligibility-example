package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceReport   {
  @JsonProperty("depositsAndWithdrawalsInstanceReportRecord")
  private Object depositsAndWithdrawalsInstanceReportRecord;

  @JsonProperty("depositsAndWithdrawalsInstanceReportType")
  private String depositsAndWithdrawalsInstanceReportType;

  @JsonProperty("depositsAndWithdrawalsInstanceReportParameters")
  private String depositsAndWithdrawalsInstanceReportParameters;

  @JsonProperty("depositsAndWithdrawalsInstanceReport")
  private Object depositsAndWithdrawalsInstanceReport;

  public BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceReport depositsAndWithdrawalsInstanceReportRecord(Object depositsAndWithdrawalsInstanceReportRecord) {
    this.depositsAndWithdrawalsInstanceReportRecord = depositsAndWithdrawalsInstanceReportRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return depositsAndWithdrawalsInstanceReportRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected ")

  @Valid

  public Object getDepositsAndWithdrawalsInstanceReportRecord() {
    return depositsAndWithdrawalsInstanceReportRecord;
  }

  public void setDepositsAndWithdrawalsInstanceReportRecord(Object depositsAndWithdrawalsInstanceReportRecord) {
    this.depositsAndWithdrawalsInstanceReportRecord = depositsAndWithdrawalsInstanceReportRecord;
  }

  public BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceReport depositsAndWithdrawalsInstanceReportType(String depositsAndWithdrawalsInstanceReportType) {
    this.depositsAndWithdrawalsInstanceReportType = depositsAndWithdrawalsInstanceReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return depositsAndWithdrawalsInstanceReportType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available ")


  public String getDepositsAndWithdrawalsInstanceReportType() {
    return depositsAndWithdrawalsInstanceReportType;
  }

  public void setDepositsAndWithdrawalsInstanceReportType(String depositsAndWithdrawalsInstanceReportType) {
    this.depositsAndWithdrawalsInstanceReportType = depositsAndWithdrawalsInstanceReportType;
  }

  public BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceReport depositsAndWithdrawalsInstanceReportParameters(String depositsAndWithdrawalsInstanceReportParameters) {
    this.depositsAndWithdrawalsInstanceReportParameters = depositsAndWithdrawalsInstanceReportParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return depositsAndWithdrawalsInstanceReportParameters
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) ")


  public String getDepositsAndWithdrawalsInstanceReportParameters() {
    return depositsAndWithdrawalsInstanceReportParameters;
  }

  public void setDepositsAndWithdrawalsInstanceReportParameters(String depositsAndWithdrawalsInstanceReportParameters) {
    this.depositsAndWithdrawalsInstanceReportParameters = depositsAndWithdrawalsInstanceReportParameters;
  }

  public BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceReport depositsAndWithdrawalsInstanceReport(Object depositsAndWithdrawalsInstanceReport) {
    this.depositsAndWithdrawalsInstanceReport = depositsAndWithdrawalsInstanceReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return depositsAndWithdrawalsInstanceReport
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate ")

  @Valid

  public Object getDepositsAndWithdrawalsInstanceReport() {
    return depositsAndWithdrawalsInstanceReport;
  }

  public void setDepositsAndWithdrawalsInstanceReport(Object depositsAndWithdrawalsInstanceReport) {
    this.depositsAndWithdrawalsInstanceReport = depositsAndWithdrawalsInstanceReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceReport bqDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceReport = (BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceReport) o;
    return Objects.equals(this.depositsAndWithdrawalsInstanceReportRecord, bqDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceReport.depositsAndWithdrawalsInstanceReportRecord) &&
        Objects.equals(this.depositsAndWithdrawalsInstanceReportType, bqDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceReport.depositsAndWithdrawalsInstanceReportType) &&
        Objects.equals(this.depositsAndWithdrawalsInstanceReportParameters, bqDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceReport.depositsAndWithdrawalsInstanceReportParameters) &&
        Objects.equals(this.depositsAndWithdrawalsInstanceReport, bqDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceReport.depositsAndWithdrawalsInstanceReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositsAndWithdrawalsInstanceReportRecord, depositsAndWithdrawalsInstanceReportType, depositsAndWithdrawalsInstanceReportParameters, depositsAndWithdrawalsInstanceReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceReport {\n");
    
    sb.append("    depositsAndWithdrawalsInstanceReportRecord: ").append(toIndentedString(depositsAndWithdrawalsInstanceReportRecord)).append("\n");
    sb.append("    depositsAndWithdrawalsInstanceReportType: ").append(toIndentedString(depositsAndWithdrawalsInstanceReportType)).append("\n");
    sb.append("    depositsAndWithdrawalsInstanceReportParameters: ").append(toIndentedString(depositsAndWithdrawalsInstanceReportParameters)).append("\n");
    sb.append("    depositsAndWithdrawalsInstanceReport: ").append(toIndentedString(depositsAndWithdrawalsInstanceReport)).append("\n");
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

