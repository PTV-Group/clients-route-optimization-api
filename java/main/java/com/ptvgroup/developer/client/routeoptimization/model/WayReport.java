/*
 * Route Optimization
 * With the Route Optimization service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.5
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
 * A way report contains a summary of the values of the events on the way from the previous stop to the current stop, including the driving time. The very first stop of a route has a way report with empty values.
 */
@ApiModel(description = "A way report contains a summary of the values of the events on the way from the previous stop to the current stop, including the driving time. The very first stop of a route has a way report with empty values.")
@JsonPropertyOrder({
  WayReport.JSON_PROPERTY_DISTANCE,
  WayReport.JSON_PROPERTY_DRIVING_TIME,
  WayReport.JSON_PROPERTY_WAITING_TIME,
  WayReport.JSON_PROPERTY_BREAK_TIME,
  WayReport.JSON_PROPERTY_REST_TIME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-16T11:56:46.561+02:00[Europe/Berlin]")
public class WayReport {
  public static final String JSON_PROPERTY_DISTANCE = "distance";
  private Integer distance;

  public static final String JSON_PROPERTY_DRIVING_TIME = "drivingTime";
  private Integer drivingTime;

  public static final String JSON_PROPERTY_WAITING_TIME = "waitingTime";
  private Integer waitingTime;

  public static final String JSON_PROPERTY_BREAK_TIME = "breakTime";
  private Integer breakTime;

  public static final String JSON_PROPERTY_REST_TIME = "restTime";
  private Integer restTime;

  public WayReport() { 
  }

  public WayReport distance(Integer distance) {
    this.distance = distance;
    return this;
  }

   /**
   * The driving distance from the previous stop to this stop [m].
   * @return distance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The driving distance from the previous stop to this stop [m].")
  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDistance() {
    return distance;
  }


  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDistance(Integer distance) {
    this.distance = distance;
  }


  public WayReport drivingTime(Integer drivingTime) {
    this.drivingTime = drivingTime;
    return this;
  }

   /**
   * The driving time from the previous stop to this stop [s].
   * @return drivingTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The driving time from the previous stop to this stop [s].")
  @JsonProperty(JSON_PROPERTY_DRIVING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDrivingTime() {
    return drivingTime;
  }


  @JsonProperty(JSON_PROPERTY_DRIVING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDrivingTime(Integer drivingTime) {
    this.drivingTime = drivingTime;
  }


  public WayReport waitingTime(Integer waitingTime) {
    this.waitingTime = waitingTime;
    return this;
  }

   /**
   * The sum of waiting times between the departure from the previous stop and the arrival at this stop [s].
   * @return waitingTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The sum of waiting times between the departure from the previous stop and the arrival at this stop [s].")
  @JsonProperty(JSON_PROPERTY_WAITING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getWaitingTime() {
    return waitingTime;
  }


  @JsonProperty(JSON_PROPERTY_WAITING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWaitingTime(Integer waitingTime) {
    this.waitingTime = waitingTime;
  }


  public WayReport breakTime(Integer breakTime) {
    this.breakTime = breakTime;
    return this;
  }

   /**
   * The sum of break times between the departure from the previous stop and the arrival at this stop [s].
   * @return breakTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The sum of break times between the departure from the previous stop and the arrival at this stop [s].")
  @JsonProperty(JSON_PROPERTY_BREAK_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getBreakTime() {
    return breakTime;
  }


  @JsonProperty(JSON_PROPERTY_BREAK_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBreakTime(Integer breakTime) {
    this.breakTime = breakTime;
  }


  public WayReport restTime(Integer restTime) {
    this.restTime = restTime;
    return this;
  }

   /**
   * The sum of rest times between the departure from the previous stop and the arrival at this stop [s].
   * @return restTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The sum of rest times between the departure from the previous stop and the arrival at this stop [s].")
  @JsonProperty(JSON_PROPERTY_REST_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRestTime() {
    return restTime;
  }


  @JsonProperty(JSON_PROPERTY_REST_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRestTime(Integer restTime) {
    this.restTime = restTime;
  }


  /**
   * Return true if this WayReport object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WayReport wayReport = (WayReport) o;
    return Objects.equals(this.distance, wayReport.distance) &&
        Objects.equals(this.drivingTime, wayReport.drivingTime) &&
        Objects.equals(this.waitingTime, wayReport.waitingTime) &&
        Objects.equals(this.breakTime, wayReport.breakTime) &&
        Objects.equals(this.restTime, wayReport.restTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distance, drivingTime, waitingTime, breakTime, restTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WayReport {\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    drivingTime: ").append(toIndentedString(drivingTime)).append("\n");
    sb.append("    waitingTime: ").append(toIndentedString(waitingTime)).append("\n");
    sb.append("    breakTime: ").append(toIndentedString(breakTime)).append("\n");
    sb.append("    restTime: ").append(toIndentedString(restTime)).append("\n");
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

