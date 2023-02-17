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
import com.ptvgroup.developer.client.routeoptimization.model.PositionInTrip;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Attributes for a location of type CUSTOMER.
 */
@ApiModel(description = "Attributes for a location of type CUSTOMER.")
@JsonPropertyOrder({
  CustomerLocationAttributes.JSON_PROPERTY_SERVICE_TIME_PER_TRANSPORT_STOP,
  CustomerLocationAttributes.JSON_PROPERTY_CUSTOMER_ID,
  CustomerLocationAttributes.JSON_PROPERTY_POSITION_IN_TRIP,
  CustomerLocationAttributes.JSON_PROPERTY_TRIP_SECTION_NUMBER
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-14T18:00:22.453541900+01:00[Europe/Berlin]")
public class CustomerLocationAttributes {
  public static final String JSON_PROPERTY_SERVICE_TIME_PER_TRANSPORT_STOP = "serviceTimePerTransportStop";
  private Integer serviceTimePerTransportStop = 0;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  private String customerId;

  public static final String JSON_PROPERTY_POSITION_IN_TRIP = "positionInTrip";
  private JsonNullable<PositionInTrip> positionInTrip = JsonNullable.<PositionInTrip>undefined();

  public static final String JSON_PROPERTY_TRIP_SECTION_NUMBER = "tripSectionNumber";
  private JsonNullable<Integer> tripSectionNumber = JsonNullable.<Integer>undefined();

  public CustomerLocationAttributes() { 
  }

  public CustomerLocationAttributes serviceTimePerTransportStop(Integer serviceTimePerTransportStop) {
    this.serviceTimePerTransportStop = serviceTimePerTransportStop;
    return this;
  }

   /**
   * The service time [s] that is required each time this location is visited in order to pick goods up or to deliver them. The location-dependent service time represents, for example, the time to enter the premises or to register at a customer. Besides a location-dependent service time, the user may specify additional vehicle-dependent and transport-dependent service times at the vehicles and the transports respectively.
   * minimum: 0
   * @return serviceTimePerTransportStop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The service time [s] that is required each time this location is visited in order to pick goods up or to deliver them. The location-dependent service time represents, for example, the time to enter the premises or to register at a customer. Besides a location-dependent service time, the user may specify additional vehicle-dependent and transport-dependent service times at the vehicles and the transports respectively.")
  @JsonProperty(JSON_PROPERTY_SERVICE_TIME_PER_TRANSPORT_STOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getServiceTimePerTransportStop() {
    return serviceTimePerTransportStop;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_TIME_PER_TRANSPORT_STOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceTimePerTransportStop(Integer serviceTimePerTransportStop) {
    this.serviceTimePerTransportStop = serviceTimePerTransportStop;
  }


  public CustomerLocationAttributes customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * ID of the customer that can be set to link several customer locations with different opening intervals. Customer locations with the same customer ID may only differ in the location ID and in the opening intervals. If successive stops at customer locations share the same customer ID, the service time per transport stop of the location and of the vehicle are only considered at the first stop of the sequence.
   * @return customerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the customer that can be set to link several customer locations with different opening intervals. Customer locations with the same customer ID may only differ in the location ID and in the opening intervals. If successive stops at customer locations share the same customer ID, the service time per transport stop of the location and of the vehicle are only considered at the first stop of the sequence.")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerId() {
    return customerId;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public CustomerLocationAttributes positionInTrip(PositionInTrip positionInTrip) {
    this.positionInTrip = JsonNullable.<PositionInTrip>of(positionInTrip);
    return this;
  }

   /**
   * Get positionInTrip
   * @return positionInTrip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public PositionInTrip getPositionInTrip() {
        return positionInTrip.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_POSITION_IN_TRIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<PositionInTrip> getPositionInTrip_JsonNullable() {
    return positionInTrip;
  }
  
  @JsonProperty(JSON_PROPERTY_POSITION_IN_TRIP)
  public void setPositionInTrip_JsonNullable(JsonNullable<PositionInTrip> positionInTrip) {
    this.positionInTrip = positionInTrip;
  }

  public void setPositionInTrip(PositionInTrip positionInTrip) {
    this.positionInTrip = JsonNullable.<PositionInTrip>of(positionInTrip);
  }


  public CustomerLocationAttributes tripSectionNumber(Integer tripSectionNumber) {
    this.tripSectionNumber = JsonNullable.<Integer>of(tripSectionNumber);
    return this;
  }

   /**
   * If tripSectionNumber is specified, a stop at this customer location will be visited after stops (within the same trip) at customer locations with specified lower tripSectionNumber and before stops (within the same trip) at customer locations with specified higher tripSectionNumber. Consequently, the trip section numbers of stops at customer locations must be non-decreasing within each trip.   If specified, positionInTrip must not be set for the same location.  See [here](./concepts/trip-sections-and-position-trips) for more information.
   * minimum: 1
   * @return tripSectionNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If tripSectionNumber is specified, a stop at this customer location will be visited after stops (within the same trip) at customer locations with specified lower tripSectionNumber and before stops (within the same trip) at customer locations with specified higher tripSectionNumber. Consequently, the trip section numbers of stops at customer locations must be non-decreasing within each trip.   If specified, positionInTrip must not be set for the same location.  See [here](./concepts/trip-sections-and-position-trips) for more information.")
  @JsonIgnore

  public Integer getTripSectionNumber() {
        return tripSectionNumber.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRIP_SECTION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getTripSectionNumber_JsonNullable() {
    return tripSectionNumber;
  }
  
  @JsonProperty(JSON_PROPERTY_TRIP_SECTION_NUMBER)
  public void setTripSectionNumber_JsonNullable(JsonNullable<Integer> tripSectionNumber) {
    this.tripSectionNumber = tripSectionNumber;
  }

  public void setTripSectionNumber(Integer tripSectionNumber) {
    this.tripSectionNumber = JsonNullable.<Integer>of(tripSectionNumber);
  }


  /**
   * Return true if this CustomerLocationAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerLocationAttributes customerLocationAttributes = (CustomerLocationAttributes) o;
    return Objects.equals(this.serviceTimePerTransportStop, customerLocationAttributes.serviceTimePerTransportStop) &&
        Objects.equals(this.customerId, customerLocationAttributes.customerId) &&
        equalsNullable(this.positionInTrip, customerLocationAttributes.positionInTrip) &&
        equalsNullable(this.tripSectionNumber, customerLocationAttributes.tripSectionNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceTimePerTransportStop, customerId, hashCodeNullable(positionInTrip), hashCodeNullable(tripSectionNumber));
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
    sb.append("class CustomerLocationAttributes {\n");
    sb.append("    serviceTimePerTransportStop: ").append(toIndentedString(serviceTimePerTransportStop)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    positionInTrip: ").append(toIndentedString(positionInTrip)).append("\n");
    sb.append("    tripSectionNumber: ").append(toIndentedString(tripSectionNumber)).append("\n");
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

