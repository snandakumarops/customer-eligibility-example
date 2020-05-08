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
 * BQPaymentsRetrieveInputModelPaymentsInstanceAnalysis1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class BQPaymentsRetrieveInputModelPaymentsInstanceAnalysis1   {
  @JsonProperty("paymentsInstanceAnalysisReference")
  private String paymentsInstanceAnalysisReference;

  public BQPaymentsRetrieveInputModelPaymentsInstanceAnalysis1 paymentsInstanceAnalysisReference(String paymentsInstanceAnalysisReference) {
    this.paymentsInstanceAnalysisReference = paymentsInstanceAnalysisReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return paymentsInstanceAnalysisReference
  */
  @ApiModelProperty(example = "751043", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view ")


  public String getPaymentsInstanceAnalysisReference() {
    return paymentsInstanceAnalysisReference;
  }

  public void setPaymentsInstanceAnalysisReference(String paymentsInstanceAnalysisReference) {
    this.paymentsInstanceAnalysisReference = paymentsInstanceAnalysisReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQPaymentsRetrieveInputModelPaymentsInstanceAnalysis1 bqPaymentsRetrieveInputModelPaymentsInstanceAnalysis1 = (BQPaymentsRetrieveInputModelPaymentsInstanceAnalysis1) o;
    return Objects.equals(this.paymentsInstanceAnalysisReference, bqPaymentsRetrieveInputModelPaymentsInstanceAnalysis1.paymentsInstanceAnalysisReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentsInstanceAnalysisReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQPaymentsRetrieveInputModelPaymentsInstanceAnalysis1 {\n");
    
    sb.append("    paymentsInstanceAnalysisReference: ").append(toIndentedString(paymentsInstanceAnalysisReference)).append("\n");
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

