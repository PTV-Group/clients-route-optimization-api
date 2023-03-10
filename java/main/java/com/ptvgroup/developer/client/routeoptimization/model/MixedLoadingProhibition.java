/*
 * Route Optimization
 * With the Route Optimization service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.routeoptimization.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * There may be some transports that shall not be mixed with some other transports on one trip. For instance, it may be prohibited to load certain dangerous goods together on the same trip, such as flammable solids on the one hand and explosive substances on the other hand. A mixed loading prohibition is a pair of two conflicting load categories that prohibits transports with these load categories to be mixed on the same trip. The load category can be specified for every transport. For a vehicle, there is a flag that lets the vehicle ignore this restriction.  See [here](./concepts/mixed-loading-prohibition) for more information.
 */
@ApiModel(description = "There may be some transports that shall not be mixed with some other transports on one trip. For instance, it may be prohibited to load certain dangerous goods together on the same trip, such as flammable solids on the one hand and explosive substances on the other hand. A mixed loading prohibition is a pair of two conflicting load categories that prohibits transports with these load categories to be mixed on the same trip. The load category can be specified for every transport. For a vehicle, there is a flag that lets the vehicle ignore this restriction.  See [here](./concepts/mixed-loading-prohibition) for more information.")
@JsonPropertyOrder({
  MixedLoadingProhibition.JSON_PROPERTY_CONFLICTING_LOAD_CATEGORY1,
  MixedLoadingProhibition.JSON_PROPERTY_CONFLICTING_LOAD_CATEGORY2
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-14T18:00:22.453541900+01:00[Europe/Berlin]")
public class MixedLoadingProhibition {
  public static final String JSON_PROPERTY_CONFLICTING_LOAD_CATEGORY1 = "conflictingLoadCategory1";
  private String conflictingLoadCategory1;

  public static final String JSON_PROPERTY_CONFLICTING_LOAD_CATEGORY2 = "conflictingLoadCategory2";
  private String conflictingLoadCategory2;

  public MixedLoadingProhibition() { 
  }

  public MixedLoadingProhibition conflictingLoadCategory1(String conflictingLoadCategory1) {
    this.conflictingLoadCategory1 = conflictingLoadCategory1;
    return this;
  }

   /**
   * A transport with this load category is not allowed to be on the same trip as a transport with load category conflictingLoadCategory2. The load category can be any string but it must not be empty and not the same as conflictingLoadCategory2.
   * @return conflictingLoadCategory1
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A transport with this load category is not allowed to be on the same trip as a transport with load category conflictingLoadCategory2. The load category can be any string but it must not be empty and not the same as conflictingLoadCategory2.")
  @JsonProperty(JSON_PROPERTY_CONFLICTING_LOAD_CATEGORY1)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConflictingLoadCategory1() {
    return conflictingLoadCategory1;
  }


  @JsonProperty(JSON_PROPERTY_CONFLICTING_LOAD_CATEGORY1)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConflictingLoadCategory1(String conflictingLoadCategory1) {
    this.conflictingLoadCategory1 = conflictingLoadCategory1;
  }


  public MixedLoadingProhibition conflictingLoadCategory2(String conflictingLoadCategory2) {
    this.conflictingLoadCategory2 = conflictingLoadCategory2;
    return this;
  }

   /**
   * A transport with this load category is not allowed to be on the same trip as a transport with load category conflictingLoadCategory1. The load category can be any string but it must not be empty and not the same as conflictingLoadCategory1.
   * @return conflictingLoadCategory2
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A transport with this load category is not allowed to be on the same trip as a transport with load category conflictingLoadCategory1. The load category can be any string but it must not be empty and not the same as conflictingLoadCategory1.")
  @JsonProperty(JSON_PROPERTY_CONFLICTING_LOAD_CATEGORY2)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConflictingLoadCategory2() {
    return conflictingLoadCategory2;
  }


  @JsonProperty(JSON_PROPERTY_CONFLICTING_LOAD_CATEGORY2)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConflictingLoadCategory2(String conflictingLoadCategory2) {
    this.conflictingLoadCategory2 = conflictingLoadCategory2;
  }


  /**
   * Return true if this MixedLoadingProhibition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MixedLoadingProhibition mixedLoadingProhibition = (MixedLoadingProhibition) o;
    return Objects.equals(this.conflictingLoadCategory1, mixedLoadingProhibition.conflictingLoadCategory1) &&
        Objects.equals(this.conflictingLoadCategory2, mixedLoadingProhibition.conflictingLoadCategory2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conflictingLoadCategory1, conflictingLoadCategory2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MixedLoadingProhibition {\n");
    sb.append("    conflictingLoadCategory1: ").append(toIndentedString(conflictingLoadCategory1)).append("\n");
    sb.append("    conflictingLoadCategory2: ").append(toIndentedString(conflictingLoadCategory2)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

