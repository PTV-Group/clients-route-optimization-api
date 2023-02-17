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
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Defines the accumulated driving, working and travel times since the last break or daily rest.  See [here](./concepts/drivers-working-hours-break-and-rest-rules) for more information.
 */
@ApiModel(description = "Defines the accumulated driving, working and travel times since the last break or daily rest.  See [here](./concepts/drivers-working-hours-break-and-rest-rules) for more information.")
@JsonPropertyOrder({
  WorkLogbook.JSON_PROPERTY_LAST_TIME_THE_DRIVER_WORKED,
  WorkLogbook.JSON_PROPERTY_ACCUMULATED_DRIVING_TIME_SINCE_LAST_BREAK,
  WorkLogbook.JSON_PROPERTY_ACCUMULATED_WORKING_TIME_SINCE_LAST_BREAK,
  WorkLogbook.JSON_PROPERTY_ACCUMULATED_DRIVING_TIME_SINCE_LAST_DAILY_REST,
  WorkLogbook.JSON_PROPERTY_ACCUMULATED_TRAVEL_TIME_SINCE_LAST_DAILY_REST
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-14T18:00:22.453541900+01:00[Europe/Berlin]")
public class WorkLogbook {
  public static final String JSON_PROPERTY_LAST_TIME_THE_DRIVER_WORKED = "lastTimeTheDriverWorked";
  private OffsetDateTime lastTimeTheDriverWorked;

  public static final String JSON_PROPERTY_ACCUMULATED_DRIVING_TIME_SINCE_LAST_BREAK = "accumulatedDrivingTimeSinceLastBreak";
  private Integer accumulatedDrivingTimeSinceLastBreak = 0;

  public static final String JSON_PROPERTY_ACCUMULATED_WORKING_TIME_SINCE_LAST_BREAK = "accumulatedWorkingTimeSinceLastBreak";
  private JsonNullable<Integer> accumulatedWorkingTimeSinceLastBreak = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_ACCUMULATED_DRIVING_TIME_SINCE_LAST_DAILY_REST = "accumulatedDrivingTimeSinceLastDailyRest";
  private JsonNullable<Integer> accumulatedDrivingTimeSinceLastDailyRest = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_ACCUMULATED_TRAVEL_TIME_SINCE_LAST_DAILY_REST = "accumulatedTravelTimeSinceLastDailyRest";
  private JsonNullable<Integer> accumulatedTravelTimeSinceLastDailyRest = JsonNullable.<Integer>undefined();

  public WorkLogbook() { 
  }

  public WorkLogbook lastTimeTheDriverWorked(OffsetDateTime lastTimeTheDriverWorked) {
    this.lastTimeTheDriverWorked = lastTimeTheDriverWorked;
    return this;
  }

   /**
   * The last time the driver worked formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00. The date must provide an offset to UTC.
   * @return lastTimeTheDriverWorked
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The last time the driver worked formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00. The date must provide an offset to UTC.")
  @JsonProperty(JSON_PROPERTY_LAST_TIME_THE_DRIVER_WORKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getLastTimeTheDriverWorked() {
    return lastTimeTheDriverWorked;
  }


  @JsonProperty(JSON_PROPERTY_LAST_TIME_THE_DRIVER_WORKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastTimeTheDriverWorked(OffsetDateTime lastTimeTheDriverWorked) {
    this.lastTimeTheDriverWorked = lastTimeTheDriverWorked;
  }


  public WorkLogbook accumulatedDrivingTimeSinceLastBreak(Integer accumulatedDrivingTimeSinceLastBreak) {
    this.accumulatedDrivingTimeSinceLastBreak = accumulatedDrivingTimeSinceLastBreak;
    return this;
  }

   /**
   * Accumulated driving time since end of last break [s], this includes all time behind the wheel. Values higher than **maximumDrivingTimeBetweenBreaks** are capped and effectively equal to the value given by **maximumDrivingTimeBetweenBreaks**. 
   * minimum: 0
   * @return accumulatedDrivingTimeSinceLastBreak
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Accumulated driving time since end of last break [s], this includes all time behind the wheel. Values higher than **maximumDrivingTimeBetweenBreaks** are capped and effectively equal to the value given by **maximumDrivingTimeBetweenBreaks**. ")
  @JsonProperty(JSON_PROPERTY_ACCUMULATED_DRIVING_TIME_SINCE_LAST_BREAK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAccumulatedDrivingTimeSinceLastBreak() {
    return accumulatedDrivingTimeSinceLastBreak;
  }


  @JsonProperty(JSON_PROPERTY_ACCUMULATED_DRIVING_TIME_SINCE_LAST_BREAK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccumulatedDrivingTimeSinceLastBreak(Integer accumulatedDrivingTimeSinceLastBreak) {
    this.accumulatedDrivingTimeSinceLastBreak = accumulatedDrivingTimeSinceLastBreak;
  }


  public WorkLogbook accumulatedWorkingTimeSinceLastBreak(Integer accumulatedWorkingTimeSinceLastBreak) {
    this.accumulatedWorkingTimeSinceLastBreak = JsonNullable.<Integer>of(accumulatedWorkingTimeSinceLastBreak);
    return this;
  }

   /**
   * Accumulated working time since end of last break [s], this includes driving time, service time at depot and customers, and idle time if lower than working time threshold. Values higher than **maximumWorkingTimeBetweenBreaks** are capped and effectively equal to the value given by **maximumWorkingTimeBetweenBreaks**. May not be smaller than **accumulatedDrivingTimeSinceLastBreak** if the value is specified. If no other value is specified, the default value is 0.
   * minimum: 0
   * @return accumulatedWorkingTimeSinceLastBreak
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Accumulated working time since end of last break [s], this includes driving time, service time at depot and customers, and idle time if lower than working time threshold. Values higher than **maximumWorkingTimeBetweenBreaks** are capped and effectively equal to the value given by **maximumWorkingTimeBetweenBreaks**. May not be smaller than **accumulatedDrivingTimeSinceLastBreak** if the value is specified. If no other value is specified, the default value is 0.")
  @JsonIgnore

  public Integer getAccumulatedWorkingTimeSinceLastBreak() {
        return accumulatedWorkingTimeSinceLastBreak.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCUMULATED_WORKING_TIME_SINCE_LAST_BREAK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getAccumulatedWorkingTimeSinceLastBreak_JsonNullable() {
    return accumulatedWorkingTimeSinceLastBreak;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCUMULATED_WORKING_TIME_SINCE_LAST_BREAK)
  public void setAccumulatedWorkingTimeSinceLastBreak_JsonNullable(JsonNullable<Integer> accumulatedWorkingTimeSinceLastBreak) {
    this.accumulatedWorkingTimeSinceLastBreak = accumulatedWorkingTimeSinceLastBreak;
  }

  public void setAccumulatedWorkingTimeSinceLastBreak(Integer accumulatedWorkingTimeSinceLastBreak) {
    this.accumulatedWorkingTimeSinceLastBreak = JsonNullable.<Integer>of(accumulatedWorkingTimeSinceLastBreak);
  }


  public WorkLogbook accumulatedDrivingTimeSinceLastDailyRest(Integer accumulatedDrivingTimeSinceLastDailyRest) {
    this.accumulatedDrivingTimeSinceLastDailyRest = JsonNullable.<Integer>of(accumulatedDrivingTimeSinceLastDailyRest);
    return this;
  }

   /**
   * Accumulated driving time since end of last daily rest [s], this includes all time behind the wheel. Values higher than **maximumDrivingTimeBetweenDailyRests** are capped and effectively equal to the value given by **maximumDrivingTimeBetweenDailyRests**. May not be smaller than **accumulatedDrivingTimeSinceLastBreak** if the value is specified. If no other value is specified, the default value is 0.
   * minimum: 0
   * @return accumulatedDrivingTimeSinceLastDailyRest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Accumulated driving time since end of last daily rest [s], this includes all time behind the wheel. Values higher than **maximumDrivingTimeBetweenDailyRests** are capped and effectively equal to the value given by **maximumDrivingTimeBetweenDailyRests**. May not be smaller than **accumulatedDrivingTimeSinceLastBreak** if the value is specified. If no other value is specified, the default value is 0.")
  @JsonIgnore

  public Integer getAccumulatedDrivingTimeSinceLastDailyRest() {
        return accumulatedDrivingTimeSinceLastDailyRest.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCUMULATED_DRIVING_TIME_SINCE_LAST_DAILY_REST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getAccumulatedDrivingTimeSinceLastDailyRest_JsonNullable() {
    return accumulatedDrivingTimeSinceLastDailyRest;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCUMULATED_DRIVING_TIME_SINCE_LAST_DAILY_REST)
  public void setAccumulatedDrivingTimeSinceLastDailyRest_JsonNullable(JsonNullable<Integer> accumulatedDrivingTimeSinceLastDailyRest) {
    this.accumulatedDrivingTimeSinceLastDailyRest = accumulatedDrivingTimeSinceLastDailyRest;
  }

  public void setAccumulatedDrivingTimeSinceLastDailyRest(Integer accumulatedDrivingTimeSinceLastDailyRest) {
    this.accumulatedDrivingTimeSinceLastDailyRest = JsonNullable.<Integer>of(accumulatedDrivingTimeSinceLastDailyRest);
  }


  public WorkLogbook accumulatedTravelTimeSinceLastDailyRest(Integer accumulatedTravelTimeSinceLastDailyRest) {
    this.accumulatedTravelTimeSinceLastDailyRest = JsonNullable.<Integer>of(accumulatedTravelTimeSinceLastDailyRest);
    return this;
  }

   /**
   * Accumulated travel time since end of last daily rest [s], this includes all time since the last daily rest. Values higher than **maximumTravelTimeBetweenDailyRests** are capped and effectively equal to the value given by **maximumTravelTimeBetweenDailyRests**. May not be smaller than **accumulatedWorkingTimeSinceLastBreak** or **accumulatedDrivingTimeSinceLastDailyRest** if the values are specified. If no other value is specified, the default value is 0.
   * minimum: 0
   * @return accumulatedTravelTimeSinceLastDailyRest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Accumulated travel time since end of last daily rest [s], this includes all time since the last daily rest. Values higher than **maximumTravelTimeBetweenDailyRests** are capped and effectively equal to the value given by **maximumTravelTimeBetweenDailyRests**. May not be smaller than **accumulatedWorkingTimeSinceLastBreak** or **accumulatedDrivingTimeSinceLastDailyRest** if the values are specified. If no other value is specified, the default value is 0.")
  @JsonIgnore

  public Integer getAccumulatedTravelTimeSinceLastDailyRest() {
        return accumulatedTravelTimeSinceLastDailyRest.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCUMULATED_TRAVEL_TIME_SINCE_LAST_DAILY_REST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getAccumulatedTravelTimeSinceLastDailyRest_JsonNullable() {
    return accumulatedTravelTimeSinceLastDailyRest;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCUMULATED_TRAVEL_TIME_SINCE_LAST_DAILY_REST)
  public void setAccumulatedTravelTimeSinceLastDailyRest_JsonNullable(JsonNullable<Integer> accumulatedTravelTimeSinceLastDailyRest) {
    this.accumulatedTravelTimeSinceLastDailyRest = accumulatedTravelTimeSinceLastDailyRest;
  }

  public void setAccumulatedTravelTimeSinceLastDailyRest(Integer accumulatedTravelTimeSinceLastDailyRest) {
    this.accumulatedTravelTimeSinceLastDailyRest = JsonNullable.<Integer>of(accumulatedTravelTimeSinceLastDailyRest);
  }


  /**
   * Return true if this WorkLogbook object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkLogbook workLogbook = (WorkLogbook) o;
    return Objects.equals(this.lastTimeTheDriverWorked, workLogbook.lastTimeTheDriverWorked) &&
        Objects.equals(this.accumulatedDrivingTimeSinceLastBreak, workLogbook.accumulatedDrivingTimeSinceLastBreak) &&
        equalsNullable(this.accumulatedWorkingTimeSinceLastBreak, workLogbook.accumulatedWorkingTimeSinceLastBreak) &&
        equalsNullable(this.accumulatedDrivingTimeSinceLastDailyRest, workLogbook.accumulatedDrivingTimeSinceLastDailyRest) &&
        equalsNullable(this.accumulatedTravelTimeSinceLastDailyRest, workLogbook.accumulatedTravelTimeSinceLastDailyRest);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTimeTheDriverWorked, accumulatedDrivingTimeSinceLastBreak, hashCodeNullable(accumulatedWorkingTimeSinceLastBreak), hashCodeNullable(accumulatedDrivingTimeSinceLastDailyRest), hashCodeNullable(accumulatedTravelTimeSinceLastDailyRest));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkLogbook {\n");
    sb.append("    lastTimeTheDriverWorked: ").append(toIndentedString(lastTimeTheDriverWorked)).append("\n");
    sb.append("    accumulatedDrivingTimeSinceLastBreak: ").append(toIndentedString(accumulatedDrivingTimeSinceLastBreak)).append("\n");
    sb.append("    accumulatedWorkingTimeSinceLastBreak: ").append(toIndentedString(accumulatedWorkingTimeSinceLastBreak)).append("\n");
    sb.append("    accumulatedDrivingTimeSinceLastDailyRest: ").append(toIndentedString(accumulatedDrivingTimeSinceLastDailyRest)).append("\n");
    sb.append("    accumulatedTravelTimeSinceLastDailyRest: ").append(toIndentedString(accumulatedTravelTimeSinceLastDailyRest)).append("\n");
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

