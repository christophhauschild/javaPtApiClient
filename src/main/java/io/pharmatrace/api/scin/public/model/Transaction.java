/*
 * PharmaTrace Supply Chain Information Network API
 * The PharmaTrace SCIN API provides network members a resource and process oriented access to the blockchain backed market and inventory information. It represents a layer of abstraction above the Hyperledger network to facilitate a business focused development of clients and integration systems without the need to directly connect to Hyperledger nodes.
 *
 * OpenAPI spec version: 0.0.1
 * Contact: api@pharmatrace.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.pharmatrace.api.scin.public.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Transaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2018-10-25T19:14:50.876+02:00[Europe/Berlin]")
public class Transaction {
  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Long timestamp;

  public static final String SERIALIZED_NAME_TX_UID = "tx_uid";
  @SerializedName(SERIALIZED_NAME_TX_UID)
  private String txUid;

  public static final String SERIALIZED_NAME_TERMS_ID = "terms_id";
  @SerializedName(SERIALIZED_NAME_TERMS_ID)
  private String termsId;

  public static final String SERIALIZED_NAME_TRANSACTION_CHANNEL = "transaction_channel";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_CHANNEL)
  private String transactionChannel;

  public Transaction timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * GMT, Unix Epoch
   * @return timestamp
  **/
  @ApiModelProperty(value = "GMT, Unix Epoch")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public Transaction txUid(String txUid) {
    this.txUid = txUid;
    return this;
  }

   /**
   * unique id hash of the transaction
   * @return txUid
  **/
  @ApiModelProperty(value = "unique id hash of the transaction")
  public String getTxUid() {
    return txUid;
  }

  public void setTxUid(String txUid) {
    this.txUid = txUid;
  }

  public Transaction termsId(String termsId) {
    this.termsId = termsId;
    return this;
  }

   /**
   * id reference to the terms and conditions for this transaction
   * @return termsId
  **/
  @ApiModelProperty(value = "id reference to the terms and conditions for this transaction")
  public String getTermsId() {
    return termsId;
  }

  public void setTermsId(String termsId) {
    this.termsId = termsId;
  }

  public Transaction transactionChannel(String transactionChannel) {
    this.transactionChannel = transactionChannel;
    return this;
  }

   /**
   * hyperledger channel the transaction has been executed in
   * @return transactionChannel
  **/
  @ApiModelProperty(value = "hyperledger channel the transaction has been executed in")
  public String getTransactionChannel() {
    return transactionChannel;
  }

  public void setTransactionChannel(String transactionChannel) {
    this.transactionChannel = transactionChannel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.timestamp, transaction.timestamp) &&
        Objects.equals(this.txUid, transaction.txUid) &&
        Objects.equals(this.termsId, transaction.termsId) &&
        Objects.equals(this.transactionChannel, transaction.transactionChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, txUid, termsId, transactionChannel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    txUid: ").append(toIndentedString(txUid)).append("\n");
    sb.append("    termsId: ").append(toIndentedString(termsId)).append("\n");
    sb.append("    transactionChannel: ").append(toIndentedString(transactionChannel)).append("\n");
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

