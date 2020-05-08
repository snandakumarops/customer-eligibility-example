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
 * InlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class InlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction   {
  @JsonProperty("transactionDescription")
  private String transactionDescription;

  @JsonProperty("transactionFeeType")
  private String transactionFeeType;

  @JsonProperty("transactionFeeCharge")
  private String transactionFeeCharge;

  public InlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction transactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: General description of the fee or penalty transaction 
   * @return transactionDescription
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: General description of the fee or penalty transaction ")


  public String getTransactionDescription() {
    return transactionDescription;
  }

  public void setTransactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
  }

  public InlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction transactionFeeType(String transactionFeeType) {
    this.transactionFeeType = transactionFeeType;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816  bian-reference: FeeTransaction.AppliedFeeType  general-info: The fee or penalty type applied 
   * @return transactionFeeType
  */
  @ApiModelProperty(value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816  bian-reference: FeeTransaction.AppliedFeeType  general-info: The fee or penalty type applied ")


  public String getTransactionFeeType() {
    return transactionFeeType;
  }

  public void setTransactionFeeType(String transactionFeeType) {
    this.transactionFeeType = transactionFeeType;
  }

  public InlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction transactionFeeCharge(String transactionFeeCharge) {
    this.transactionFeeCharge = transactionFeeCharge;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_FMBK98TGEeChad0JzLk7QA_-1487452687  bian-reference: FeeTransaction.AppliedFeeAmount  general-info: The derived fee or penalty amount applied 
   * @return transactionFeeCharge
  */
  @ApiModelProperty(example = "USD 250", value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_FMBK98TGEeChad0JzLk7QA_-1487452687  bian-reference: FeeTransaction.AppliedFeeAmount  general-info: The derived fee or penalty amount applied ")


  public String getTransactionFeeCharge() {
    return transactionFeeCharge;
  }

  public void setTransactionFeeCharge(String transactionFeeCharge) {
    this.transactionFeeCharge = transactionFeeCharge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction inlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction = (InlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction) o;
    return Objects.equals(this.transactionDescription, inlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction.transactionDescription) &&
        Objects.equals(this.transactionFeeType, inlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction.transactionFeeType) &&
        Objects.equals(this.transactionFeeCharge, inlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction.transactionFeeCharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionDescription, transactionFeeType, transactionFeeCharge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction {\n");
    
    sb.append("    transactionDescription: ").append(toIndentedString(transactionDescription)).append("\n");
    sb.append("    transactionFeeType: ").append(toIndentedString(transactionFeeType)).append("\n");
    sb.append("    transactionFeeCharge: ").append(toIndentedString(transactionFeeCharge)).append("\n");
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

