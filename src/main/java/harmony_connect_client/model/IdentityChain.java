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
import harmony_connect_client.model.IdentityKeyShort;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IdentityChain
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-03T22:54:40.268681300Z[UTC]")
public class IdentityChain {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_STAGE = "stage";
  @SerializedName(SERIALIZED_NAME_STAGE)
  private String stage;

  public static final String SERIALIZED_NAME_CREATED_HEIGHT = "created_height";
  @SerializedName(SERIALIZED_NAME_CREATED_HEIGHT)
  private Integer createdHeight;

  public static final String SERIALIZED_NAME_CHAIN_ID = "chain_id";
  @SerializedName(SERIALIZED_NAME_CHAIN_ID)
  private String chainId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private List<String> name = new ArrayList<String>();

  public static final String SERIALIZED_NAME_ACTIVE_KEYS = "active_keys";
  @SerializedName(SERIALIZED_NAME_ACTIVE_KEYS)
  private List<IdentityKeyShort> activeKeys = new ArrayList<IdentityKeyShort>();

  public static final String SERIALIZED_NAME_ALL_KEYS_HREF = "all_keys_href";
  @SerializedName(SERIALIZED_NAME_ALL_KEYS_HREF)
  private String allKeysHref;

  public IdentityChain version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The Identity Chain’s schema version. This details the format of this digital identity. More information about Factom Identity Chain schemas can be seen [here]().
   * @return version
  **/
  @ApiModelProperty(required = true, value = "The Identity Chain’s schema version. This details the format of this digital identity. More information about Factom Identity Chain schemas can be seen [here]().")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public IdentityChain stage(String stage) {
    this.stage = stage;
    return this;
  }

   /**
   * The immutability stage that this chain has reached. The identity can be considered in use once it reaches the &#x60;factom&#x60; stage.
   * @return stage
  **/
  @ApiModelProperty(required = true, value = "The immutability stage that this chain has reached. The identity can be considered in use once it reaches the `factom` stage.")
  public String getStage() {
    return stage;
  }

  public void setStage(String stage) {
    this.stage = stage;
  }

  public IdentityChain createdHeight(Integer createdHeight) {
    this.createdHeight = createdHeight;
    return this;
  }

   /**
   * The block height at which this chain was written into the Factom blockchain. This is &#x60;null&#x60; if the chain has not reached the &#x60;factom&#x60; stage.
   * @return createdHeight
  **/
  @ApiModelProperty(value = "The block height at which this chain was written into the Factom blockchain. This is `null` if the chain has not reached the `factom` stage.")
  public Integer getCreatedHeight() {
    return createdHeight;
  }

  public void setCreatedHeight(Integer createdHeight) {
    this.createdHeight = createdHeight;
  }

  public IdentityChain chainId(String chainId) {
    this.chainId = chainId;
    return this;
  }

   /**
   * The Chain ID for this identity chain.
   * @return chainId
  **/
  @ApiModelProperty(required = true, value = "The Chain ID for this identity chain.")
  public String getChainId() {
    return chainId;
  }

  public void setChainId(String chainId) {
    this.chainId = chainId;
  }

  public IdentityChain name(List<String> name) {
    this.name = name;
    return this;
  }

  public IdentityChain addNameItem(String nameItem) {
    this.name.add(nameItem);
    return this;
  }

   /**
   * A unique array of strings that are associated with this identity.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A unique array of strings that are associated with this identity.")
  public List<String> getName() {
    return name;
  }

  public void setName(List<String> name) {
    this.name = name;
  }

  public IdentityChain activeKeys(List<IdentityKeyShort> activeKeys) {
    this.activeKeys = activeKeys;
    return this;
  }

  public IdentityChain addActiveKeysItem(IdentityKeyShort activeKeysItem) {
    this.activeKeys.add(activeKeysItem);
    return this;
  }

   /**
   * Contains the currently active public keys for this identity.
   * @return activeKeys
  **/
  @ApiModelProperty(required = true, value = "Contains the currently active public keys for this identity.")
  public List<IdentityKeyShort> getActiveKeys() {
    return activeKeys;
  }

  public void setActiveKeys(List<IdentityKeyShort> activeKeys) {
    this.activeKeys = activeKeys;
  }

  public IdentityChain allKeysHref(String allKeysHref) {
    this.allKeysHref = allKeysHref;
    return this;
  }

   /**
   * An API link to retrieve the keys for this identity.
   * @return allKeysHref
  **/
  @ApiModelProperty(required = true, value = "An API link to retrieve the keys for this identity.")
  public String getAllKeysHref() {
    return allKeysHref;
  }

  public void setAllKeysHref(String allKeysHref) {
    this.allKeysHref = allKeysHref;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityChain identityChain = (IdentityChain) o;
    return Objects.equals(this.version, identityChain.version) &&
        Objects.equals(this.stage, identityChain.stage) &&
        Objects.equals(this.createdHeight, identityChain.createdHeight) &&
        Objects.equals(this.chainId, identityChain.chainId) &&
        Objects.equals(this.name, identityChain.name) &&
        Objects.equals(this.activeKeys, identityChain.activeKeys) &&
        Objects.equals(this.allKeysHref, identityChain.allKeysHref);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, stage, createdHeight, chainId, name, activeKeys, allKeysHref);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityChain {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
    sb.append("    createdHeight: ").append(toIndentedString(createdHeight)).append("\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    activeKeys: ").append(toIndentedString(activeKeys)).append("\n");
    sb.append("    allKeysHref: ").append(toIndentedString(allKeysHref)).append("\n");
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
