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
import {
    EventType,
    EventTypeFromJSON,
    EventTypeFromJSONTyped,
    EventTypeToJSON,
} from './EventType';

/**
 * An event specifies what happens on a route at a certain point in time. It can describe the driver's activity such as driving or performing service, or it can denote the start/end of a route/trip.
 * @export
 * @interface Event
 */
export interface Event {
    /**
     * 
     * @type {EventType}
     * @memberof Event
     */
    type: EventType;
    /**
     * The start time of the event formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * @type {Date}
     * @memberof Event
     */
    startTime: Date;
    /**
     * The duration of the event [s]. The duration may be 0.
     * @type {number}
     * @memberof Event
     */
    duration: number;
    /**
     * The ID of the corresponding transport if the event is a service event. Otherwise the ID is null.
     * @type {string}
     * @memberof Event
     */
    transportId?: string;
}

export function EventFromJSON(json: any): Event {
    return EventFromJSONTyped(json, false);
}

export function EventFromJSONTyped(json: any, ignoreDiscriminator: boolean): Event {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'type': EventTypeFromJSON(json['type']),
        'startTime': (new Date(json['startTime'])),
        'duration': json['duration'],
        'transportId': !exists(json, 'transportId') ? undefined : json['transportId'],
    };
}

export function EventToJSON(value?: Event | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'type': EventTypeToJSON(value.type),
        'startTime': (value.startTime.toISOString()),
        'duration': value.duration,
        'transportId': value.transportId,
    };
}

