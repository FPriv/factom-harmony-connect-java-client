/*
 * Harmony Connect
 * An easy to use API that helps you access the Factom blockchain.
 *
 * OpenAPI spec version: 1.0.19
 * Contact: harmony-support@factom.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package harmony_connect_client.model;

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
import java.util.ArrayList;
import java.util.List;

/**
 * Used to create a new chain on Connect.
 */
@ApiModel(description = "Used to create a new chain on Connect.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-03T22:54:40.268681300Z[UTC]")
public class ChainCreate {
  public static final String SERIALIZED_NAME_EXTERNAL_IDS = "external_ids";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IDS)
  private List<String> externalIds = new ArrayList<String>();

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_CALLBACK_URL = "callback_url";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;

  public static final String SERIALIZED_NAME_CALLBACK_STAGES = "callback_stages";
  @SerializedName(SERIALIZED_NAME_CALLBACK_STAGES)
  private List<String> callbackStages = new ArrayList<String>();

  public ChainCreate externalIds(List<String> externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  public ChainCreate addExternalIdsItem(String externalIdsItem) {
    this.externalIds.add(externalIdsItem);
    return this;
  }

   /**
   * Tags that can be used to identify your chain. You can search for records that contain a particular external_id using Connect. You must send External IDs in Base64 format.
   * @return externalIds
  **/
  @ApiModelProperty(required = true, value = "Tags that can be used to identify your chain. You can search for records that contain a particular external_id using Connect. You must send External IDs in Base64 format.")
  public List<String> getExternalIds() {
    return externalIds;
  }

  public void setExternalIds(List<String> externalIds) {
    this.externalIds = externalIds;
  }

  public ChainCreate content(String content) {
    this.content = content;
    return this;
  }

   /**
   * This is the data that will make up the first entry in your new chain. It is customary to use this space to describe the entries that are to follow in the chain. You must send the content field in Base64 format.
   * @return content
  **/
  @ApiModelProperty(required = true, value = "This is the data that will make up the first entry in your new chain. It is customary to use this space to describe the entries that are to follow in the chain. You must send the content field in Base64 format.")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ChainCreate callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * The URL where you would like to receive the callback from Connect. If this is not specified, callbacks will not activate.
   * @return callbackUrl
  **/
  @ApiModelProperty(value = "The URL where you would like to receive the callback from Connect. If this is not specified, callbacks will not activate.")
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  public ChainCreate callbackStages(List<String> callbackStages) {
    this.callbackStages = callbackStages;
    return this;
  }

  public ChainCreate addCallbackStagesItem(String callbackStagesItem) {
    if (this.callbackStages == null) {
      this.callbackStages = new ArrayList<String>();
    }
    this.callbackStages.add(callbackStagesItem);
    return this;
  }

   /**
   * The stages that you would like to trigger a callback from Connect. This list can include any or all of the three stages: &#x60;replicated&#x60;, &#x60;factom&#x60;, and &#x60;anchored&#x60;. If callbacks are activated and this field is not sent, it will default to &#x60;factom&#x60; and &#x60;anchored&#x60;
   * @return callbackStages
  **/
  @ApiModelProperty(value = "The stages that you would like to trigger a callback from Connect. This list can include any or all of the three stages: `replicated`, `factom`, and `anchored`. If callbacks are activated and this field is not sent, it will default to `factom` and `anchored`")
  public List<String> getCallbackStages() {
    return callbackStages;
  }

  public void setCallbackStages(List<String> callbackStages) {
    this.callbackStages = callbackStages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChainCreate chainCreate = (ChainCreate) o;
    return Objects.equals(this.externalIds, chainCreate.externalIds) &&
        Objects.equals(this.content, chainCreate.content) &&
        Objects.equals(this.callbackUrl, chainCreate.callbackUrl) &&
        Objects.equals(this.callbackStages, chainCreate.callbackStages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalIds, content, callbackUrl, callbackStages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChainCreate {\n");
    sb.append("    externalIds: ").append(toIndentedString(externalIds)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    callbackStages: ").append(toIndentedString(callbackStages)).append("\n");
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

