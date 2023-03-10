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
import com.ptvgroup.developer.client.routeoptimization.model.CustomerLocationAttributes;
import com.ptvgroup.developer.client.routeoptimization.model.DepotLocationAttributes;
import com.ptvgroup.developer.client.routeoptimization.model.LocationType;
import com.ptvgroup.developer.client.routeoptimization.model.TimeInterval;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A specific location where goods have to be picked up or delivered, or where vehicles are located. A location is either a depot location or a customer location. Depot locations act as trip delimiters.  See [here](./concepts/locations-transports-and-stops) for more information.
 */
@ApiModel(description = "A specific location where goods have to be picked up or delivered, or where vehicles are located. A location is either a depot location or a customer location. Depot locations act as trip delimiters.  See [here](./concepts/locations-transports-and-stops) for more information.")
@JsonPropertyOrder({
  Location.JSON_PROPERTY_ID,
  Location.JSON_PROPERTY_TYPE,
  Location.JSON_PROPERTY_LATITUDE,
  Location.JSON_PROPERTY_LONGITUDE,
  Location.JSON_PROPERTY_APPLY_VEHICLE_DEPENDENT_SERVICE_TIME_FACTOR,
  Location.JSON_PROPERTY_OPENING_INTERVALS,
  Location.JSON_PROPERTY_DEPOT_LOCATION_ATTRIBUTES,
  Location.JSON_PROPERTY_CUSTOMER_LOCATION_ATTRIBUTES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-14T18:00:22.453541900+01:00[Europe/Berlin]")
public class Location {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LocationType type = LocationType.CUSTOMER;

  public static final String JSON_PROPERTY_LATITUDE = "latitude";
  private Double latitude;

  public static final String JSON_PROPERTY_LONGITUDE = "longitude";
  private Double longitude;

  public static final String JSON_PROPERTY_APPLY_VEHICLE_DEPENDENT_SERVICE_TIME_FACTOR = "applyVehicleDependentServiceTimeFactor";
  private Boolean applyVehicleDependentServiceTimeFactor = true;

  public static final String JSON_PROPERTY_OPENING_INTERVALS = "openingIntervals";
  private List<TimeInterval> openingIntervals = null;

  public static final String JSON_PROPERTY_DEPOT_LOCATION_ATTRIBUTES = "depotLocationAttributes";
  private DepotLocationAttributes depotLocationAttributes;

  public static final String JSON_PROPERTY_CUSTOMER_LOCATION_ATTRIBUTES = "customerLocationAttributes";
  private CustomerLocationAttributes customerLocationAttributes;

  public Location() { 
  }

  public Location id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique ID for this location. This ID can be used to reference the location from other elements, for example from transports or vehicles. The ID does not influence the result.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique ID for this location. This ID can be used to reference the location from other elements, for example from transports or vehicles. The ID does not influence the result.")
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


  public Location type(LocationType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocationType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(LocationType type) {
    this.type = type;
  }


  public Location latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * The latitude value of the location in degrees (WGS84/EPSG:4326) from south to north.
   * minimum: -90
   * maximum: 90
   * @return latitude
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The latitude value of the location in degrees (WGS84/EPSG:4326) from south to north.")
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getLatitude() {
    return latitude;
  }


  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  public Location longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * The longitude value of the location in degrees (WGS84/EPSG:4326) from west to east.
   * minimum: -180
   * maximum: 180
   * @return longitude
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The longitude value of the location in degrees (WGS84/EPSG:4326) from west to east.")
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getLongitude() {
    return longitude;
  }


  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  public Location applyVehicleDependentServiceTimeFactor(Boolean applyVehicleDependentServiceTimeFactor) {
    this.applyVehicleDependentServiceTimeFactor = applyVehicleDependentServiceTimeFactor;
    return this;
  }

   /**
   * Indicates if vehicle-dependent service time factors are relevant for this location. The factors are typically relevant when the vehicles are (un)loaded by the drivers and may be irrelevant when the vehicles are (un)loaded by the location&#39;s staff. If this parameter is set to false, no vehicle-dependent service time factors are taken into account for this location when processing transports.
   * @return applyVehicleDependentServiceTimeFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if vehicle-dependent service time factors are relevant for this location. The factors are typically relevant when the vehicles are (un)loaded by the drivers and may be irrelevant when the vehicles are (un)loaded by the location's staff. If this parameter is set to false, no vehicle-dependent service time factors are taken into account for this location when processing transports.")
  @JsonProperty(JSON_PROPERTY_APPLY_VEHICLE_DEPENDENT_SERVICE_TIME_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getApplyVehicleDependentServiceTimeFactor() {
    return applyVehicleDependentServiceTimeFactor;
  }


  @JsonProperty(JSON_PROPERTY_APPLY_VEHICLE_DEPENDENT_SERVICE_TIME_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplyVehicleDependentServiceTimeFactor(Boolean applyVehicleDependentServiceTimeFactor) {
    this.applyVehicleDependentServiceTimeFactor = applyVehicleDependentServiceTimeFactor;
  }


  public Location openingIntervals(List<TimeInterval> openingIntervals) {
    this.openingIntervals = openingIntervals;
    return this;
  }

  public Location addOpeningIntervalsItem(TimeInterval openingIntervalsItem) {
    if (this.openingIntervals == null) {
      this.openingIntervals = new ArrayList<>();
    }
    this.openingIntervals.add(openingIntervalsItem);
    return this;
  }

   /**
   * The opening intervals at this location, each specified by two points in time - the beginning and the end of the interval. Leaving this parameter empty means that the location is always open. Service (pickup or delivery) can only start within one of the opening intervals. If a planning horizon is defined for the request, all opening intervals outside of this horizon are not considered during the route optimization process. If no planning horizon is defined, it is required that the opening intervals of all locations do not span a horizon longer than two weeks.
   * @return openingIntervals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The opening intervals at this location, each specified by two points in time - the beginning and the end of the interval. Leaving this parameter empty means that the location is always open. Service (pickup or delivery) can only start within one of the opening intervals. If a planning horizon is defined for the request, all opening intervals outside of this horizon are not considered during the route optimization process. If no planning horizon is defined, it is required that the opening intervals of all locations do not span a horizon longer than two weeks.")
  @JsonProperty(JSON_PROPERTY_OPENING_INTERVALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TimeInterval> getOpeningIntervals() {
    return openingIntervals;
  }


  @JsonProperty(JSON_PROPERTY_OPENING_INTERVALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpeningIntervals(List<TimeInterval> openingIntervals) {
    this.openingIntervals = openingIntervals;
  }


  public Location depotLocationAttributes(DepotLocationAttributes depotLocationAttributes) {
    this.depotLocationAttributes = depotLocationAttributes;
    return this;
  }

   /**
   * Get depotLocationAttributes
   * @return depotLocationAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEPOT_LOCATION_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DepotLocationAttributes getDepotLocationAttributes() {
    return depotLocationAttributes;
  }


  @JsonProperty(JSON_PROPERTY_DEPOT_LOCATION_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepotLocationAttributes(DepotLocationAttributes depotLocationAttributes) {
    this.depotLocationAttributes = depotLocationAttributes;
  }


  public Location customerLocationAttributes(CustomerLocationAttributes customerLocationAttributes) {
    this.customerLocationAttributes = customerLocationAttributes;
    return this;
  }

   /**
   * Get customerLocationAttributes
   * @return customerLocationAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_LOCATION_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerLocationAttributes getCustomerLocationAttributes() {
    return customerLocationAttributes;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_LOCATION_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerLocationAttributes(CustomerLocationAttributes customerLocationAttributes) {
    this.customerLocationAttributes = customerLocationAttributes;
  }


  /**
   * Return true if this Location object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.id, location.id) &&
        Objects.equals(this.type, location.type) &&
        Objects.equals(this.latitude, location.latitude) &&
        Objects.equals(this.longitude, location.longitude) &&
        Objects.equals(this.applyVehicleDependentServiceTimeFactor, location.applyVehicleDependentServiceTimeFactor) &&
        Objects.equals(this.openingIntervals, location.openingIntervals) &&
        Objects.equals(this.depotLocationAttributes, location.depotLocationAttributes) &&
        Objects.equals(this.customerLocationAttributes, location.customerLocationAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, latitude, longitude, applyVehicleDependentServiceTimeFactor, openingIntervals, depotLocationAttributes, customerLocationAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    applyVehicleDependentServiceTimeFactor: ").append(toIndentedString(applyVehicleDependentServiceTimeFactor)).append("\n");
    sb.append("    openingIntervals: ").append(toIndentedString(openingIntervals)).append("\n");
    sb.append("    depotLocationAttributes: ").append(toIndentedString(depotLocationAttributes)).append("\n");
    sb.append("    customerLocationAttributes: ").append(toIndentedString(customerLocationAttributes)).append("\n");
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

