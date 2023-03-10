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
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A tweak to objective defines additional optimization criteria. Without any tweak, the standard optimization goal is to plan as many transports as possible with as few vehicles as possible.   * &#x60;AVOID_INTERSECTIONS&#x60; - The focus of this approach is to avoid intersections of edges, where an edge is a straight line drawn between two consecutive stops in a route. The number of routes may be higher compared to the standard optimization goal.   * &#x60;IGNORE_MINIMIZATION_OF_NUMBER_OF_ROUTES&#x60; - With this tweak, the number of vehicles used in a plan, and thus the number of routes, is not minimized.
 */
public enum TweakToObjective {
  
  AVOID_INTERSECTIONS("AVOID_INTERSECTIONS"),
  
  IGNORE_MINIMIZATION_OF_NUMBER_OF_ROUTES("IGNORE_MINIMIZATION_OF_NUMBER_OF_ROUTES");

  private String value;

  TweakToObjective(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TweakToObjective fromValue(String value) {
    for (TweakToObjective b : TweakToObjective.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

