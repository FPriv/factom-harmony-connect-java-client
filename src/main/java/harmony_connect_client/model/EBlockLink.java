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
 * A link to the entry block.
 */
@ApiModel(description = "A link to the entry block.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-03T22:54:40.268681300Z[UTC]")
public class EBlockLink {
  public static final String SERIALIZED_NAME_KEYMR = "keymr";
  @SerializedName(SERIALIZED_NAME_KEYMR)
  private String keymr;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public EBlockLink keymr(String keymr) {
    this.keymr = keymr;
    return this;
  }

   /**
   * The Key Merkle Root for this entry block.
   * @return keymr
  **/
  @ApiModelProperty(value = "The Key Merkle Root for this entry block.")
  public String getKeymr() {
    return keymr;
  }

  public void setKeymr(String keymr) {
    this.keymr = keymr;
  }

  public EBlockLink href(String href) {
    this.href = href;
    return this;
  }

   /**
   * An API link to retrieve all information about this entry block.
   * @return href
  **/
  @ApiModelProperty(value = "An API link to retrieve all information about this entry block.")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EBlockLink eblockLink = (EBlockLink) o;
    return Objects.equals(this.keymr, eblockLink.keymr) &&
        Objects.equals(this.href, eblockLink.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keymr, href);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EBlockLink {\n");
    sb.append("    keymr: ").append(toIndentedString(keymr)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

