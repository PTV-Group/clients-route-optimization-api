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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CausingError
 */
@JsonPropertyOrder({
  CausingError.JSON_PROPERTY_DESCRIPTION,
  CausingError.JSON_PROPERTY_ERROR_CODE,
  CausingError.JSON_PROPERTY_PARAMETER,
  CausingError.JSON_PROPERTY_DETAILS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-14T18:00:22.453541900+01:00[Europe/Berlin]")
public class CausingError {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  private String errorCode;

  public static final String JSON_PROPERTY_PARAMETER = "parameter";
  private String parameter;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private Map<String, Object> details = null;

  public CausingError() { 
  }

  public CausingError description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A human readable message that describes the error.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A human readable message that describes the error.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public CausingError errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * A constant string that can be used to identify this error class programmatically. An errorCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified. Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.  **Error codes for** &#x60;GENERAL_VALIDATION_ERROR&#x60; * &#x60;GENERAL_INVALID_VALUE&#x60; - A parameter is set to an invalid value.   * &#x60;value&#x60; - The invalid value. * &#x60;GENERAL_UNRECOGNIZED_PARAMETER&#x60; - A parameter is unknown. * &#x60;GENERAL_MISSING_PARAMETER&#x60; - A required parameter is missing. * &#x60;GENERAL_INVALID_INTERVAL&#x60; - A time interval is invalid, i.e. start is greater than end. * &#x60;GENERAL_MINIMUM_LENGTH_VIOLATED&#x60; - The minimum length is violated.   * &#x60;minimumLength&#x60; - The minimum length (integer). * &#x60;GENERAL_MAXIMUM_LENGTH_VIOLATED&#x60; - The maximum length is violated.   * &#x60;maximumLength&#x60; - The maximum length (integer). * &#x60;GENERAL_DUPLICATE_ID&#x60; - Two or more objects of the same type have the same ID.   * &#x60;value&#x60; - The duplicated value.   * &#x60;indexes&#x60; - The list indexes of the objects with the same ID. * &#x60;GENERAL_MINIMUM_VALUE_VIOLATED&#x60; - The minimum value restriction is violated.   * &#x60;minimumValue&#x60; - The minimum value (integer or double). * &#x60;GENERAL_MAXIMUM_VALUE_VIOLATED&#x60; - The maximum value restriction is violated.   * &#x60;maximumValue&#x60; - The maximum value (integer or double). * &#x60;GENERAL_DUPLICATE_PARAMETER&#x60; - A parameter is duplicated. * &#x60;ROUTEOPTIMIZATION_EMPTY_ID&#x60; - The ID is empty or contains only whitespace. * &#x60;ROUTEOPTIMIZATION_LOCATION_CANNOT_BE_MATCHED&#x60; - The location cannot be matched to a street and no airline distance fallback is possible. * &#x60;ROUTEOPTIMIZATION_DUPLICATE_TRIP_ID&#x60; - Two or more trips have the same trip ID.   * &#x60;duplicatedTripId&#x60; - The duplicated trip ID.   * &#x60;routeIndexes&#x60; - The list indexes of the routes with the same trip ID. * &#x60;ROUTEOPTIMIZATION_DUPLICATE_TRANSPORT&#x60; - The transport with ID &#39;&#39; is picked up and/or delivered multiple times.   * &#x60;transportId&#x60; - The duplicated transport ID. * &#x60;ROUTEOPTIMIZATION_SINGLE_TRIP_PER_ROUTE_VIOLATED&#x60; - There is more than one trip in the given route although the restriction &#39;singleTripPerRoute&#39; is activated. * &#x60;ROUTEOPTIMIZATION_SINGLE_DEPOT_PER_ROUTE_VIOLATED&#x60; - There is more than one depot in the given route although the restriction &#39;singleDepotPerRoute&#39; is activated. * &#x60;ROUTEOPTIMIZATION_ILLEGAL_EMPTY_STOP&#x60; - Empty stops without any pickup or delivery are only allowed for the vehicle start/end location or for trip starts/ends at depots. * &#x60;ROUTEOPTIMIZATION_DELIVERY_EXECUTED_BEFORE_PICKUP&#x60; - Delivery of transport with ID &#39;&#39; is executed before the corresponding pickup.   * &#x60;transportId&#x60; - The transport ID. * &#x60;ROUTEOPTIMIZATION_NO_TRANSPORT_IN_ROUTE&#x60; - There is no transport in this route. Please add a transport or remove the whole route. * &#x60;ROUTEOPTIMIZATION_DELIVERY_MISSING_IN_ROUTE&#x60; - Delivery of transport with ID &#39;&#39; is missing in one of the trips in the given route. Pickup and delivery of a transport need to be in the same trip.   * &#x60;transportId&#x60; - The transport ID. * &#x60;ROUTEOPTIMIZATION_PICKUP_MISSING_IN_ROUTE&#x60; - Pickup of transport with ID &#39;&#39; is missing in one of the trips in the given route. Pickup and delivery of a transport need to be in the same trip.   * &#x60;transportId&#x60; - The transport ID. * &#x60;ROUTEOPTIMIZATION_PICKUP_EQUAL_TO_DELIVERY_LOCATION&#x60; - Pickup and delivery of transport with ID &#39;&#39; are at the same location. Pickup and delivery of a transport need to be at different locations.   * &#x60;transportId&#x60; - The transport ID.   * &#x60;locationId&#x60; - The location ID of the transport pickup and delivery. * &#x60;ROUTEOPTIMIZATION_TRIP_STRUCTURE_VIOLATED&#x60; - Trip structure violated. * &#x60;ROUTEOPTIMIZATION_INVALID_OR_INCONSISTENT_TRIP_ID&#x60; - Trip ID is invalid or not all stops of a trip have the same ID. * &#x60;ROUTEOPTIMIZATION_NO_TIME_INTERVAL&#x60; - The planning horizon is required if there is no other time interval given in the plan. * &#x60;ROUTEOPTIMIZATION_CONTIGUOUS_DRIVER_AVAILABILITIES&#x60; - The driver availability given in the parameter field must end at least two seconds before the driver availabilty with list index  starts or the contiguous intervals have to be merged.   * &#x60;contiguousAvailabilityIndex&#x60; - The list index of the driver availability where the start must have a gap of more than one second to the end of the availability given in the parameter field. * &#x60;ROUTEOPTIMIZATION_PICKUP_MISSING_IN_LOCATIONS&#x60; - The locations list does not contain the pickup location with ID &#39;&#39;.   * &#x60;locationId&#x60; - The location ID. * &#x60;ROUTEOPTIMIZATION_DELIVERY_MISSING_IN_LOCATIONS&#x60; - The locations list does not contain the delivery location with ID &#39;&#39;.   * &#x60;locationId&#x60; - The location ID. * &#x60;ROUTEOPTIMIZATION_UNKNOWN_VEHICLE_ID&#x60; - A vehicle with ID &#39;&#39; does not exist in the vehicles list.   * &#x60;vehicleId&#x60; - The vehicle ID. * &#x60;ROUTEOPTIMIZATION_VEHICLE_REFERENCED_BY_MULTIPLE_DRIVERS&#x60; - A vehicle can only be referenced by one driver. Vehicle with ID &#39;&#39; is referenced by multiple drivers.   * &#x60;vehicleId&#x60; - The vehicle ID.   * &#x60;driverIndexes&#x60; - The indexes of the drivers with the same vehicle ID. * &#x60;ROUTEOPTIMIZATION_VEHICLE_REFERENCED_BY_MULTIPLE_ROUTES&#x60; - A vehicle can only be referenced by one route. Vehicle with ID &#39;&#39; is referenced by multiple routes.   * &#x60;vehicleId&#x60; - The vehicle ID.   * &#x60;routeIndexes&#x60; - The indexes of the routes with the same vehicle ID. * &#x60;ROUTEOPTIMIZATION_VEHICLE_START_LOCATION_MISSING_IN_ROUTE&#x60; - Vehicle start location must be the first stop of the vehicle route.   * &#x60;routeIndex&#x60; - The list index of the route with missing start location.   * &#x60;expectedLocationIdOfFirstStop&#x60; - The expected location ID of the first stop of the route which is the given vehicle start location.   * &#x60;actualLocationIdOfFirstStop&#x60; - The actual location ID of the first stop of the route. * &#x60;ROUTEOPTIMIZATION_VEHICLE_END_LOCATION_MISSING_IN_ROUTE&#x60; - Vehicle end location must be the last stop of the vehicle route.   * &#x60;routeIndex&#x60; - The list index of the route with missing end location.   * &#x60;expectedLocationIdOfLastStop&#x60; - The expected location ID of the last stop of the route which is the given vehicle end location.   * &#x60;actualLocationIdOfLastStop&#x60; - The actual location ID of the last stop of the route. * &#x60;ROUTEOPTIMIZATION_INCONSISTENT_NUMBER_OF_QUANTITIES_AND_CAPACITIES&#x60; - The list of the capacities of all vehicles and the list of the quantities of all transports must have the same length. The reference list is given in the parameter field.   * &#x60;expectedLength&#x60; - The expected length of the list.   * &#x60;vehicleIndexes&#x60; - The list indexes of the vehicles with the wrong number of capacities.   * &#x60;transportIndexes&#x60; - The list indexes of the transports with the wrong number of quantities. * &#x60;ROUTEOPTIMIZATION_UNREFERENCED_LOCATIONS&#x60; - Locations with IDs &#39;&#39; are not referenced or used anywhere. These and all other unreferenced locations must be left out.   * &#x60;locationIds&#x60; - The IDs of some unreferenced locations. * &#x60;ROUTEOPTIMIZATION_UNKNOWN_LOCATION_ID&#x60; - A location with ID &#39;&#39; does not exist in the locations list.   * &#x60;locationId&#x60; - The location ID. * &#x60;ROUTEOPTIMIZATION_UNKNOWN_TRANSPORT_ID&#x60; - A transport with ID &#39;&#39; does not exist in the transports list.   * &#x60;transportId&#x60; - The transport ID. * &#x60;ROUTEOPTIMIZATION_PICKUP_AT_UNEXPECTED_LOCATION&#x60; - Transport with ID &#39;&#39; should not be picked up at this location.   * &#x60;transportId&#x60; - The ID of the transport which is picked up at an unexpected location.   * &#x60;expectedPickupLocationId&#x60; - The location ID where transport should be picked up.   * &#x60;actualPickupLocationId&#x60; - The location ID of the stop where transport is actually picked up. * &#x60;ROUTEOPTIMIZATION_DELIVERY_AT_UNEXPECTED_LOCATION&#x60; - Transport with ID &#39;&#39; should not be delivered at this location.   * &#x60;transportId&#x60; - The ID of the transport which is delivered at an unexpected location.   * &#x60;expectedDeliveryLocationId&#x60; - The location ID where transport should be delivered.   * &#x60;actualDeliveryLocationId&#x60; - The location ID of the stop where transport is actually delivered. * &#x60;ROUTEOPTIMIZATION_ILLEGAL_SPLITTED_STOP&#x60; - Subsequent stops at the same location are only allowed if they are in different trips. The given stops must be merged to one stop.   * &#x60;stopIndexes&#x60; - The list indexes of the stops which should be merged. * &#x60;ROUTEOPTIMIZATION_INVALID_LOADING_SEQUENCE&#x60; - A location in a route is left with unfinished tasks: Either a location is left although there is still load FOR it on the vehicle or a location is visited again although there are still pickups FROM it on the vehicle.   * &#x60;locationId&#x60; - The location ID with unfinished tasks. * &#x60;ROUTEOPTIMIZATION_STOP_SERVICE_TIME_TOO_LONG&#x60; - The service time of the stop exceeds the travel time between daily rests defined by the driving time regulation. * &#x60;ROUTEOPTIMIZATION_PLANNING_HORIZON_TOO_LONG&#x60; - Planning horizon must not be longer than 14 days. * &#x60;ROUTEOPTIMIZATION_PLAN_IN_OPTIMIZATION&#x60; - Plan with ID &#39;&#39; is already in optimization. Please wait or terminate current optimization process.   * &#x60;planId&#x60; - The plan ID. * &#x60;ROUTEOPTIMIZATION_EMPTY_VALUE&#x60; - A parameter is empty or contains only whitespace.   **Error codes for** &#x60;ROUTEOPTIMIZATION_RESTRICTION_EXCEEDED&#x60; * &#x60;ROUTEOPTIMIZATION_NUMBER_OF_TRANSPORTS_EXCEEDED&#x60; - The request contains too many transports.   * &#x60;transports&#x60; - The number of transports.   * &#x60;limit&#x60; - The maximum number of transports. * &#x60;ROUTEOPTIMIZATION_NUMBER_OF_LOAD_CATEGORIES_EXCEEDED&#x60; - The request contains too many load categories.   * &#x60;load categories&#x60; - The number of load categories   * &#x60;limit&#x60; - The maximum number of load categories.  **Error codes for** &#x60;GENERAL_RESOURCE_NOT_FOUND&#x60; * &#x60;GENERAL_INVALID_ID&#x60; - The ID does not exist.   * &#x60;value&#x60; - The invalid ID.
   * @return errorCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A constant string that can be used to identify this error class programmatically. An errorCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified. Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.  **Error codes for** `GENERAL_VALIDATION_ERROR` * `GENERAL_INVALID_VALUE` - A parameter is set to an invalid value.   * `value` - The invalid value. * `GENERAL_UNRECOGNIZED_PARAMETER` - A parameter is unknown. * `GENERAL_MISSING_PARAMETER` - A required parameter is missing. * `GENERAL_INVALID_INTERVAL` - A time interval is invalid, i.e. start is greater than end. * `GENERAL_MINIMUM_LENGTH_VIOLATED` - The minimum length is violated.   * `minimumLength` - The minimum length (integer). * `GENERAL_MAXIMUM_LENGTH_VIOLATED` - The maximum length is violated.   * `maximumLength` - The maximum length (integer). * `GENERAL_DUPLICATE_ID` - Two or more objects of the same type have the same ID.   * `value` - The duplicated value.   * `indexes` - The list indexes of the objects with the same ID. * `GENERAL_MINIMUM_VALUE_VIOLATED` - The minimum value restriction is violated.   * `minimumValue` - The minimum value (integer or double). * `GENERAL_MAXIMUM_VALUE_VIOLATED` - The maximum value restriction is violated.   * `maximumValue` - The maximum value (integer or double). * `GENERAL_DUPLICATE_PARAMETER` - A parameter is duplicated. * `ROUTEOPTIMIZATION_EMPTY_ID` - The ID is empty or contains only whitespace. * `ROUTEOPTIMIZATION_LOCATION_CANNOT_BE_MATCHED` - The location cannot be matched to a street and no airline distance fallback is possible. * `ROUTEOPTIMIZATION_DUPLICATE_TRIP_ID` - Two or more trips have the same trip ID.   * `duplicatedTripId` - The duplicated trip ID.   * `routeIndexes` - The list indexes of the routes with the same trip ID. * `ROUTEOPTIMIZATION_DUPLICATE_TRANSPORT` - The transport with ID '' is picked up and/or delivered multiple times.   * `transportId` - The duplicated transport ID. * `ROUTEOPTIMIZATION_SINGLE_TRIP_PER_ROUTE_VIOLATED` - There is more than one trip in the given route although the restriction 'singleTripPerRoute' is activated. * `ROUTEOPTIMIZATION_SINGLE_DEPOT_PER_ROUTE_VIOLATED` - There is more than one depot in the given route although the restriction 'singleDepotPerRoute' is activated. * `ROUTEOPTIMIZATION_ILLEGAL_EMPTY_STOP` - Empty stops without any pickup or delivery are only allowed for the vehicle start/end location or for trip starts/ends at depots. * `ROUTEOPTIMIZATION_DELIVERY_EXECUTED_BEFORE_PICKUP` - Delivery of transport with ID '' is executed before the corresponding pickup.   * `transportId` - The transport ID. * `ROUTEOPTIMIZATION_NO_TRANSPORT_IN_ROUTE` - There is no transport in this route. Please add a transport or remove the whole route. * `ROUTEOPTIMIZATION_DELIVERY_MISSING_IN_ROUTE` - Delivery of transport with ID '' is missing in one of the trips in the given route. Pickup and delivery of a transport need to be in the same trip.   * `transportId` - The transport ID. * `ROUTEOPTIMIZATION_PICKUP_MISSING_IN_ROUTE` - Pickup of transport with ID '' is missing in one of the trips in the given route. Pickup and delivery of a transport need to be in the same trip.   * `transportId` - The transport ID. * `ROUTEOPTIMIZATION_PICKUP_EQUAL_TO_DELIVERY_LOCATION` - Pickup and delivery of transport with ID '' are at the same location. Pickup and delivery of a transport need to be at different locations.   * `transportId` - The transport ID.   * `locationId` - The location ID of the transport pickup and delivery. * `ROUTEOPTIMIZATION_TRIP_STRUCTURE_VIOLATED` - Trip structure violated. * `ROUTEOPTIMIZATION_INVALID_OR_INCONSISTENT_TRIP_ID` - Trip ID is invalid or not all stops of a trip have the same ID. * `ROUTEOPTIMIZATION_NO_TIME_INTERVAL` - The planning horizon is required if there is no other time interval given in the plan. * `ROUTEOPTIMIZATION_CONTIGUOUS_DRIVER_AVAILABILITIES` - The driver availability given in the parameter field must end at least two seconds before the driver availabilty with list index  starts or the contiguous intervals have to be merged.   * `contiguousAvailabilityIndex` - The list index of the driver availability where the start must have a gap of more than one second to the end of the availability given in the parameter field. * `ROUTEOPTIMIZATION_PICKUP_MISSING_IN_LOCATIONS` - The locations list does not contain the pickup location with ID ''.   * `locationId` - The location ID. * `ROUTEOPTIMIZATION_DELIVERY_MISSING_IN_LOCATIONS` - The locations list does not contain the delivery location with ID ''.   * `locationId` - The location ID. * `ROUTEOPTIMIZATION_UNKNOWN_VEHICLE_ID` - A vehicle with ID '' does not exist in the vehicles list.   * `vehicleId` - The vehicle ID. * `ROUTEOPTIMIZATION_VEHICLE_REFERENCED_BY_MULTIPLE_DRIVERS` - A vehicle can only be referenced by one driver. Vehicle with ID '' is referenced by multiple drivers.   * `vehicleId` - The vehicle ID.   * `driverIndexes` - The indexes of the drivers with the same vehicle ID. * `ROUTEOPTIMIZATION_VEHICLE_REFERENCED_BY_MULTIPLE_ROUTES` - A vehicle can only be referenced by one route. Vehicle with ID '' is referenced by multiple routes.   * `vehicleId` - The vehicle ID.   * `routeIndexes` - The indexes of the routes with the same vehicle ID. * `ROUTEOPTIMIZATION_VEHICLE_START_LOCATION_MISSING_IN_ROUTE` - Vehicle start location must be the first stop of the vehicle route.   * `routeIndex` - The list index of the route with missing start location.   * `expectedLocationIdOfFirstStop` - The expected location ID of the first stop of the route which is the given vehicle start location.   * `actualLocationIdOfFirstStop` - The actual location ID of the first stop of the route. * `ROUTEOPTIMIZATION_VEHICLE_END_LOCATION_MISSING_IN_ROUTE` - Vehicle end location must be the last stop of the vehicle route.   * `routeIndex` - The list index of the route with missing end location.   * `expectedLocationIdOfLastStop` - The expected location ID of the last stop of the route which is the given vehicle end location.   * `actualLocationIdOfLastStop` - The actual location ID of the last stop of the route. * `ROUTEOPTIMIZATION_INCONSISTENT_NUMBER_OF_QUANTITIES_AND_CAPACITIES` - The list of the capacities of all vehicles and the list of the quantities of all transports must have the same length. The reference list is given in the parameter field.   * `expectedLength` - The expected length of the list.   * `vehicleIndexes` - The list indexes of the vehicles with the wrong number of capacities.   * `transportIndexes` - The list indexes of the transports with the wrong number of quantities. * `ROUTEOPTIMIZATION_UNREFERENCED_LOCATIONS` - Locations with IDs '' are not referenced or used anywhere. These and all other unreferenced locations must be left out.   * `locationIds` - The IDs of some unreferenced locations. * `ROUTEOPTIMIZATION_UNKNOWN_LOCATION_ID` - A location with ID '' does not exist in the locations list.   * `locationId` - The location ID. * `ROUTEOPTIMIZATION_UNKNOWN_TRANSPORT_ID` - A transport with ID '' does not exist in the transports list.   * `transportId` - The transport ID. * `ROUTEOPTIMIZATION_PICKUP_AT_UNEXPECTED_LOCATION` - Transport with ID '' should not be picked up at this location.   * `transportId` - The ID of the transport which is picked up at an unexpected location.   * `expectedPickupLocationId` - The location ID where transport should be picked up.   * `actualPickupLocationId` - The location ID of the stop where transport is actually picked up. * `ROUTEOPTIMIZATION_DELIVERY_AT_UNEXPECTED_LOCATION` - Transport with ID '' should not be delivered at this location.   * `transportId` - The ID of the transport which is delivered at an unexpected location.   * `expectedDeliveryLocationId` - The location ID where transport should be delivered.   * `actualDeliveryLocationId` - The location ID of the stop where transport is actually delivered. * `ROUTEOPTIMIZATION_ILLEGAL_SPLITTED_STOP` - Subsequent stops at the same location are only allowed if they are in different trips. The given stops must be merged to one stop.   * `stopIndexes` - The list indexes of the stops which should be merged. * `ROUTEOPTIMIZATION_INVALID_LOADING_SEQUENCE` - A location in a route is left with unfinished tasks: Either a location is left although there is still load FOR it on the vehicle or a location is visited again although there are still pickups FROM it on the vehicle.   * `locationId` - The location ID with unfinished tasks. * `ROUTEOPTIMIZATION_STOP_SERVICE_TIME_TOO_LONG` - The service time of the stop exceeds the travel time between daily rests defined by the driving time regulation. * `ROUTEOPTIMIZATION_PLANNING_HORIZON_TOO_LONG` - Planning horizon must not be longer than 14 days. * `ROUTEOPTIMIZATION_PLAN_IN_OPTIMIZATION` - Plan with ID '' is already in optimization. Please wait or terminate current optimization process.   * `planId` - The plan ID. * `ROUTEOPTIMIZATION_EMPTY_VALUE` - A parameter is empty or contains only whitespace.   **Error codes for** `ROUTEOPTIMIZATION_RESTRICTION_EXCEEDED` * `ROUTEOPTIMIZATION_NUMBER_OF_TRANSPORTS_EXCEEDED` - The request contains too many transports.   * `transports` - The number of transports.   * `limit` - The maximum number of transports. * `ROUTEOPTIMIZATION_NUMBER_OF_LOAD_CATEGORIES_EXCEEDED` - The request contains too many load categories.   * `load categories` - The number of load categories   * `limit` - The maximum number of load categories.  **Error codes for** `GENERAL_RESOURCE_NOT_FOUND` * `GENERAL_INVALID_ID` - The ID does not exist.   * `value` - The invalid ID.")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getErrorCode() {
    return errorCode;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public CausingError parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

   /**
   * The name of the affected query or path parameter or a JSONPath to the affected property of the request.
   * @return parameter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the affected query or path parameter or a JSONPath to the affected property of the request.")
  @JsonProperty(JSON_PROPERTY_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParameter() {
    return parameter;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameter(String parameter) {
    this.parameter = parameter;
  }


  public CausingError details(Map<String, Object> details) {
    this.details = details;
    return this;
  }

  public CausingError putDetailsItem(String key, Object detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

   /**
   * Additional properties specific to this error class.
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional properties specific to this error class.")
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(Map<String, Object> details) {
    this.details = details;
  }


  /**
   * Return true if this CausingError object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CausingError causingError = (CausingError) o;
    return Objects.equals(this.description, causingError.description) &&
        Objects.equals(this.errorCode, causingError.errorCode) &&
        Objects.equals(this.parameter, causingError.parameter) &&
        Objects.equals(this.details, causingError.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, errorCode, parameter, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CausingError {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

