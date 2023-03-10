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
    DailyRestPosition,
    DailyRestPositionFromJSON,
    DailyRestPositionFromJSONTyped,
    DailyRestPositionToJSON,
} from './DailyRestPosition';

/**
 * Defines when a daily rest becomes necessary and how long it should be. Currently, each driver must have the same values specified.
 * 
 * See [here](./concepts/drivers-working-hours-break-and-rest-rules) for more information.
 * @export
 * @interface DailyRestRule
 */
export interface DailyRestRule {
    /**
     * The minimum duration of a daily rest [s]. Minimum is 3 hours, maximum is 22 hours.
     * @type {number}
     * @memberof DailyRestRule
     */
    dailyRestTime: number;
    /**
     * Maximum duration that the driver is allowed to drive [s] before taking a daily rest. The maximum driving time is considered as infinite if it is not set.
     * @type {number}
     * @memberof DailyRestRule
     */
    maximumDrivingTimeBetweenDailyRests?: number | null;
    /**
     * Maximum duration that the driver is allowed to travel [s] before taking a daily. The maximum travel time is considered as infinite if it is not set.
     * @type {number}
     * @memberof DailyRestRule
     */
    maximumTravelTimeBetweenDailyRests?: number | null;
    /**
     * 
     * @type {DailyRestPosition}
     * @memberof DailyRestRule
     */
    dailyRestPosition?: DailyRestPosition;
}

export function DailyRestRuleFromJSON(json: any): DailyRestRule {
    return DailyRestRuleFromJSONTyped(json, false);
}

export function DailyRestRuleFromJSONTyped(json: any, ignoreDiscriminator: boolean): DailyRestRule {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'dailyRestTime': json['dailyRestTime'],
        'maximumDrivingTimeBetweenDailyRests': !exists(json, 'maximumDrivingTimeBetweenDailyRests') ? undefined : json['maximumDrivingTimeBetweenDailyRests'],
        'maximumTravelTimeBetweenDailyRests': !exists(json, 'maximumTravelTimeBetweenDailyRests') ? undefined : json['maximumTravelTimeBetweenDailyRests'],
        'dailyRestPosition': !exists(json, 'dailyRestPosition') ? undefined : DailyRestPositionFromJSON(json['dailyRestPosition']),
    };
}

export function DailyRestRuleToJSON(value?: DailyRestRule | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'dailyRestTime': value.dailyRestTime,
        'maximumDrivingTimeBetweenDailyRests': value.maximumDrivingTimeBetweenDailyRests,
        'maximumTravelTimeBetweenDailyRests': value.maximumTravelTimeBetweenDailyRests,
        'dailyRestPosition': DailyRestPositionToJSON(value.dailyRestPosition),
    };
}

