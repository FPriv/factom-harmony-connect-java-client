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
 * IdentityCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-03T22:54:40.268681300Z[UTC]")
public class IdentityCreate {
  public static final String SERIALIZED_NAME_NAMES = "names";
  @SerializedName(SERIALIZED_NAME_NAMES)
  private List<String> names = new ArrayList<String>();

  public static final String SERIALIZED_NAME_KEYS = "keys";
  @SerializedName(SERIALIZED_NAME_KEYS)
  private List<String> keys = new ArrayList<String>();

  public static final String SERIALIZED_NAME_CALLBACK_URL = "callback_url";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;

  public static final String SERIALIZED_NAME_CALLBACK_STAGES = "callback_stages";
  @SerializedName(SERIALIZED_NAME_CALLBACK_STAGES)
  private List<String> callbackStages = new ArrayList<String>();

  public IdentityCreate names(List<String> names) {
    this.names = names;
    return this;
  }

  public IdentityCreate addNamesItem(String namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * A unique array of strings that together constitute the Identity's name. Each string should be in Base64 format.   *Note: It is best to avoid adding personally identifiable information to the blockchain.*
   * @return names
  **/
  @ApiModelProperty(required = true, value = "A unique array of strings that together constitute the Identity's name. Each string should be in Base64 format.   *Note: It is best to avoid adding personally identifiable information to the blockchain.*")
  public List<String> getNames() {
    return names;
  }

  public void setNames(List<String> names) {
    this.names = names;
  }

  public IdentityCreate keys(List<String> keys) {
    this.keys = keys;
    return this;
  }

  public IdentityCreate addKeysItem(String keysItem) {
    this.keys.add(keysItem);
    return this;
  }

   /**
   * A list of public keys that will be used to verify this Indenty’s signatures. You may initiate an identity with as many keys as you like. The array of keys should be sent in order of priority with 0 being the master key. The keys should be sent as Base58 strings in IdPub format.
   * @return keys
  **/
  @ApiModelProperty(required = true, value = "A list of public keys that will be used to verify this Indenty’s signatures. You may initiate an identity with as many keys as you like. The array of keys should be sent in order of priority with 0 being the master key. The keys should be sent as Base58 strings in IdPub format.")
  public List<String> getKeys() {
    return keys;
  }

  public void setKeys(List<String> keys) {
    this.keys = keys;
  }

  public IdentityCreate callbackUrl(String callbackUrl) {
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

  public IdentityCreate callbackStages(List<String> callbackStages) {
    this.callbackStages = callbackStages;
    return this;
  }

  public IdentityCreate addCallbackStagesItem(String callbackStagesItem) {
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
    IdentityCreate identityCreate = (IdentityCreate) o;
    return Objects.equals(this.names, identityCreate.names) &&
        Objects.equals(this.keys, identityCreate.keys) &&
        Objects.equals(this.callbackUrl, identityCreate.callbackUrl) &&
        Objects.equals(this.callbackStages, identityCreate.callbackStages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(names, keys, callbackUrl, callbackStages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityCreate {\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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

