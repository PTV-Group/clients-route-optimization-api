/* tslint:disable */
/* eslint-disable */
/**
 * Route Optimization
 * With the Route Optimization service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * A route report contains a summary of the values of all events and all reports that belong to this route, including the start time and the end time of the route.
 * @export
 * @interface RouteReport
 */
export interface RouteReport {
    /**
     * The start time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * @type {Date}
     * @memberof RouteReport
     */
    startTime: Date;
    /**
     * The end time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * @type {Date}
     * @memberof RouteReport
     */
    endTime: Date;
    /**
     * The total travel time of the route [s]. Equals difference between end time and start time.
     * @type {number}
     * @memberof RouteReport
     */
    travelTime: number;
    /**
     * The total driving distance of the route [m].
     * @type {number}
     * @memberof RouteReport
     */
    distance: number;
    /**
     * The total driving time of the route [s].
     * @type {number}
     * @memberof RouteReport
     */
    drivingTime: number;
    /**
     * The total service time of the route [s].
     * @type {number}
     * @memberof RouteReport
     */
    serviceTime: number;
    /**
     * The total waiting time of the route [s].
     * @type {number}
     * @memberof RouteReport
     */
    waitingTime: number;
    /**
     * The total break time of the route [s].
     * @type {number}
     * @memberof RouteReport
     */
    breakTime: number;
    /**
     * The total rest time of the route [s].
     * @type {number}
     * @memberof RouteReport
     */
    restTime: number;
}

export function RouteReportFromJSON(json: any): RouteReport {
    return RouteReportFromJSONTyped(json, false);
}

export function RouteReportFromJSONTyped(json: any, ignoreDiscriminator: boolean): RouteReport {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'startTime': (new Date(json['startTime'])),
        'endTime': (new Date(json['endTime'])),
        'travelTime': json['travelTime'],
        'distance': json['distance'],
        'drivingTime': json['drivingTime'],
        'serviceTime': json['serviceTime'],
        'waitingTime': json['waitingTime'],
        'breakTime': json['breakTime'],
        'restTime': json['restTime'],
    };
}

export function RouteReportToJSON(value?: RouteReport | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'startTime': (value.startTime.toISOString()),
        'endTime': (value.endTime.toISOString()),
        'travelTime': value.travelTime,
        'distance': value.distance,
        'drivingTime': value.drivingTime,
        'serviceTime': value.serviceTime,
        'waitingTime': value.waitingTime,
        'breakTime': value.breakTime,
        'restTime': value.restTime,
    };
}

