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
import com.ptvgroup.developer.client.routeoptimization.model.BreakRule;
import com.ptvgroup.developer.client.routeoptimization.model.DailyRestRule;
import com.ptvgroup.developer.client.routeoptimization.model.TimeInterval;
import com.ptvgroup.developer.client.routeoptimization.model.WorkLogbook;
import com.ptvgroup.developer.client.routeoptimization.model.WorkingHoursPreset;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A driver is always assigned to a specific vehicle and may not always be available to operate it. To be precise, a driver can only operate the corresponding vehicle within given time intervals.
 */
@ApiModel(description = "A driver is always assigned to a specific vehicle and may not always be available to operate it. To be precise, a driver can only operate the corresponding vehicle within given time intervals.")
@JsonPropertyOrder({
  Driver.JSON_PROPERTY_ID,
  Driver.JSON_PROPERTY_VEHICLE_ID,
  Driver.JSON_PROPERTY_AVAILABILITIES,
  Driver.JSON_PROPERTY_WORKING_HOURS_PRESET,
  Driver.JSON_PROPERTY_BREAK_RULE,
  Driver.JSON_PROPERTY_DAILY_REST_RULE,
  Driver.JSON_PROPERTY_WORK_LOGBOOK,
  Driver.JSON_PROPERTY_MAXIMUM_DRIVING_TIME,
  Driver.JSON_PROPERTY_MAXIMUM_TRAVEL_TIME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-14T18:00:22.453541900+01:00[Europe/Berlin]")
public class Driver {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_VEHICLE_ID = "vehicleId";
  private String vehicleId;

  public static final String JSON_PROPERTY_AVAILABILITIES = "availabilities";
  private List<TimeInterval> availabilities = null;

  public static final String JSON_PROPERTY_WORKING_HOURS_PRESET = "workingHoursPreset";
  private JsonNullable<WorkingHoursPreset> workingHoursPreset = JsonNullable.<WorkingHoursPreset>undefined();

  public static final String JSON_PROPERTY_BREAK_RULE = "breakRule";
  private BreakRule breakRule;

  public static final String JSON_PROPERTY_DAILY_REST_RULE = "dailyRestRule";
  private DailyRestRule dailyRestRule;

  public static final String JSON_PROPERTY_WORK_LOGBOOK = "workLogbook";
  private WorkLogbook workLogbook;

  public static final String JSON_PROPERTY_MAXIMUM_DRIVING_TIME = "maximumDrivingTime";
  private JsonNullable<Integer> maximumDrivingTime = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_MAXIMUM_TRAVEL_TIME = "maximumTravelTime";
  private JsonNullable<Integer> maximumTravelTime = JsonNullable.<Integer>undefined();

  public Driver() { 
  }

  public Driver id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the driver.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique ID of the driver.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public Driver vehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * The ID of the driver&#39;s vehicle. This vehicle must not be referenced by another driver.
   * @return vehicleId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the driver's vehicle. This vehicle must not be referenced by another driver.")
  @JsonProperty(JSON_PROPERTY_VEHICLE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVehicleId() {
    return vehicleId;
  }


  @JsonProperty(JSON_PROPERTY_VEHICLE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
  }


  public Driver availabilities(List<TimeInterval> availabilities) {
    this.availabilities = availabilities;
    return this;
  }

  public Driver addAvailabilitiesItem(TimeInterval availabilitiesItem) {
    if (this.availabilities == null) {
      this.availabilities = new ArrayList<>();
    }
    this.availabilities.add(availabilitiesItem);
    return this;
  }

   /**
   * Intervals during which the driver is available, each specified by two points in time - the beginning and the end of the interval. Each trip must lie completely within one of the intervals. The route start and trip start events must lie within one of the intervals. The intervals must have a gap of more than 1 second. Leaving this parameter empty means that the driver is always available.
   * @return availabilities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Intervals during which the driver is available, each specified by two points in time - the beginning and the end of the interval. Each trip must lie completely within one of the intervals. The route start and trip start events must lie within one of the intervals. The intervals must have a gap of more than 1 second. Leaving this parameter empty means that the driver is always available.")
  @JsonProperty(JSON_PROPERTY_AVAILABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TimeInterval> getAvailabilities() {
    return availabilities;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailabilities(List<TimeInterval> availabilities) {
    this.availabilities = availabilities;
  }


  public Driver workingHoursPreset(WorkingHoursPreset workingHoursPreset) {
    this.workingHoursPreset = JsonNullable.<WorkingHoursPreset>of(workingHoursPreset);
    return this;
  }

   /**
   * Get workingHoursPreset
   * @return workingHoursPreset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public WorkingHoursPreset getWorkingHoursPreset() {
        return workingHoursPreset.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WORKING_HOURS_PRESET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<WorkingHoursPreset> getWorkingHoursPreset_JsonNullable() {
    return workingHoursPreset;
  }
  
  @JsonProperty(JSON_PROPERTY_WORKING_HOURS_PRESET)
  public void setWorkingHoursPreset_JsonNullable(JsonNullable<WorkingHoursPreset> workingHoursPreset) {
    this.workingHoursPreset = workingHoursPreset;
  }

  public void setWorkingHoursPreset(WorkingHoursPreset workingHoursPreset) {
    this.workingHoursPreset = JsonNullable.<WorkingHoursPreset>of(workingHoursPreset);
  }


  public Driver breakRule(BreakRule breakRule) {
    this.breakRule = breakRule;
    return this;
  }

   /**
   * Get breakRule
   * @return breakRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BREAK_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BreakRule getBreakRule() {
    return breakRule;
  }


  @JsonProperty(JSON_PROPERTY_BREAK_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBreakRule(BreakRule breakRule) {
    this.breakRule = breakRule;
  }


  public Driver dailyRestRule(DailyRestRule dailyRestRule) {
    this.dailyRestRule = dailyRestRule;
    return this;
  }

   /**
   * Get dailyRestRule
   * @return dailyRestRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAILY_REST_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DailyRestRule getDailyRestRule() {
    return dailyRestRule;
  }


  @JsonProperty(JSON_PROPERTY_DAILY_REST_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDailyRestRule(DailyRestRule dailyRestRule) {
    this.dailyRestRule = dailyRestRule;
  }


  public Driver workLogbook(WorkLogbook workLogbook) {
    this.workLogbook = workLogbook;
    return this;
  }

   /**
   * Get workLogbook
   * @return workLogbook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WORK_LOGBOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WorkLogbook getWorkLogbook() {
    return workLogbook;
  }


  @JsonProperty(JSON_PROPERTY_WORK_LOGBOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorkLogbook(WorkLogbook workLogbook) {
    this.workLogbook = workLogbook;
  }


  public Driver maximumDrivingTime(Integer maximumDrivingTime) {
    this.maximumDrivingTime = JsonNullable.<Integer>of(maximumDrivingTime);
    return this;
  }

   /**
   * The maximum driving time of the driver [s].   This includes the driving time before the start of the route (see **accumulatedDrivingTimeSinceLastDailyRest** in **workLogbook**). The maximum driving time is considered as infinite if it is not set. Currently, each driver must have the same value specified.
   * minimum: 1
   * @return maximumDrivingTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum driving time of the driver [s].   This includes the driving time before the start of the route (see **accumulatedDrivingTimeSinceLastDailyRest** in **workLogbook**). The maximum driving time is considered as infinite if it is not set. Currently, each driver must have the same value specified.")
  @JsonIgnore

  public Integer getMaximumDrivingTime() {
        return maximumDrivingTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAXIMUM_DRIVING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getMaximumDrivingTime_JsonNullable() {
    return maximumDrivingTime;
  }
  
  @JsonProperty(JSON_PROPERTY_MAXIMUM_DRIVING_TIME)
  public void setMaximumDrivingTime_JsonNullable(JsonNullable<Integer> maximumDrivingTime) {
    this.maximumDrivingTime = maximumDrivingTime;
  }

  public void setMaximumDrivingTime(Integer maximumDrivingTime) {
    this.maximumDrivingTime = JsonNullable.<Integer>of(maximumDrivingTime);
  }


  public Driver maximumTravelTime(Integer maximumTravelTime) {
    this.maximumTravelTime = JsonNullable.<Integer>of(maximumTravelTime);
    return this;
  }

   /**
   * The maximum travel time of the driver [s]. The travel time contains all waiting, service and driving times.  This includes the travel time before the start of the route (see **accumulatedTravelTimeSinceLastDailyRest** in **workLogbook**). The maximum travel time is considered as infinite if it is not set. Currently, each driver must have the same value specified.
   * minimum: 1
   * @return maximumTravelTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum travel time of the driver [s]. The travel time contains all waiting, service and driving times.  This includes the travel time before the start of the route (see **accumulatedTravelTimeSinceLastDailyRest** in **workLogbook**). The maximum travel time is considered as infinite if it is not set. Currently, each driver must have the same value specified.")
  @JsonIgnore

  public Integer getMaximumTravelTime() {
        return maximumTravelTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAXIMUM_TRAVEL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getMaximumTravelTime_JsonNullable() {
    return maximumTravelTime;
  }
  
  @JsonProperty(JSON_PROPERTY_MAXIMUM_TRAVEL_TIME)
  public void setMaximumTravelTime_JsonNullable(JsonNullable<Integer> maximumTravelTime) {
    this.maximumTravelTime = maximumTravelTime;
  }

  public void setMaximumTravelTime(Integer maximumTravelTime) {
    this.maximumTravelTime = JsonNullable.<Integer>of(maximumTravelTime);
  }


  /**
   * Return true if this Driver object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Driver driver = (Driver) o;
    return Objects.equals(this.id, driver.id) &&
        Objects.equals(this.vehicleId, driver.vehicleId) &&
        Objects.equals(this.availabilities, driver.availabilities) &&
        equalsNullable(this.workingHoursPreset, driver.workingHoursPreset) &&
        Objects.equals(this.breakRule, driver.breakRule) &&
        Objects.equals(this.dailyRestRule, driver.dailyRestRule) &&
        Objects.equals(this.workLogbook, driver.workLogbook) &&
        equalsNullable(this.maximumDrivingTime, driver.maximumDrivingTime) &&
        equalsNullable(this.maximumTravelTime, driver.maximumTravelTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, vehicleId, availabilities, hashCodeNullable(workingHoursPreset), breakRule, dailyRestRule, workLogbook, hashCodeNullable(maximumDrivingTime), hashCodeNullable(maximumTravelTime));
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
    sb.append("class Driver {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    availabilities: ").append(toIndentedString(availabilities)).append("\n");
    sb.append("    workingHoursPreset: ").append(toIndentedString(workingHoursPreset)).append("\n");
    sb.append("    breakRule: ").append(toIndentedString(breakRule)).append("\n");
    sb.append("    dailyRestRule: ").append(toIndentedString(dailyRestRule)).append("\n");
    sb.append("    workLogbook: ").append(toIndentedString(workLogbook)).append("\n");
    sb.append("    maximumDrivingTime: ").append(toIndentedString(maximumDrivingTime)).append("\n");
    sb.append("    maximumTravelTime: ").append(toIndentedString(maximumTravelTime)).append("\n");
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

