/* tslint:disable */
/* eslint-disable */
/**
 * Route Optimization
 * With the Route Optimization service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
 * The type of an event.
 * @export
 * @enum {string}
 */
export enum EventType {
    DRIVING = 'DRIVING',
    SERVICE = 'SERVICE',
    WAITING = 'WAITING',
    BREAK = 'BREAK',
    DAILY_REST = 'DAILY_REST',
    TRIP_START = 'TRIP_START',
    TRIP_END = 'TRIP_END',
    ROUTE_START = 'ROUTE_START',
    ROUTE_END = 'ROUTE_END'
}

export function EventTypeFromJSON(json: any): EventType {
    return EventTypeFromJSONTyped(json, false);
}

export function EventTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): EventType {
    return json as EventType;
}

export function EventTypeToJSON(value?: EventType | null): any {
    return value as any;
}
