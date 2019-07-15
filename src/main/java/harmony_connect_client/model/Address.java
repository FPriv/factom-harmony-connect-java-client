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

/**
 * A factoid or entry credit address.
 */
@ApiModel(description = "A factoid or entry credit address.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-03T22:54:40.268681300Z[UTC]")
public class Address {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_USER_ADDRESS = "user_address";
  @SerializedName(SERIALIZED_NAME_USER_ADDRESS)
  private String userAddress;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private String balance;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private Object transactions = null;

  public Address address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The literal address.
   * @return address
  **/
  @ApiModelProperty(value = "The literal address.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Address userAddress(String userAddress) {
    this.userAddress = userAddress;
    return this;
  }

   /**
   * The user address.
   * @return userAddress
  **/
  @ApiModelProperty(value = "The user address.")
  public String getUserAddress() {
    return userAddress;
  }

  public void setUserAddress(String userAddress) {
    this.userAddress = userAddress;
  }

  public Address type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Whether this is an entry credit or factoid address.
   * @return type
  **/
  @ApiModelProperty(value = "Whether this is an entry credit or factoid address.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Address balance(String balance) {
    this.balance = balance;
    return this;
  }

   /**
   * The current entry credit or factoid balance of the address.
   * @return balance
  **/
  @ApiModelProperty(value = "The current entry credit or factoid balance of the address.")
  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public Address transactions(Object transactions) {
    this.transactions = transactions;
    return this;
  }

   /**
   * A list of all transactions that this address has paricipated in.
   * @return transactions
  **/
  @ApiModelProperty(value = "A list of all transactions that this address has paricipated in.")
  public Object getTransactions() {
    return transactions;
  }

  public void setTransactions(Object transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.address, address.address) &&
        Objects.equals(this.userAddress, address.userAddress) &&
        Objects.equals(this.type, address.type) &&
        Objects.equals(this.balance, address.balance) &&
        Objects.equals(this.transactions, address.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, userAddress, type, balance, transactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    userAddress: ").append(toIndentedString(userAddress)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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
