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

import { exists, mapValues } from '../runtime';
import {
    BreakRule,
    BreakRuleFromJSON,
    BreakRuleFromJSONTyped,
    BreakRuleToJSON,
} from './BreakRule';
import {
    DailyRestRule,
    DailyRestRuleFromJSON,
    DailyRestRuleFromJSONTyped,
    DailyRestRuleToJSON,
} from './DailyRestRule';
import {
    TimeInterval,
    TimeIntervalFromJSON,
    TimeIntervalFromJSONTyped,
    TimeIntervalToJSON,
} from './TimeInterval';
import {
    WorkLogbook,
    WorkLogbookFromJSON,
    WorkLogbookFromJSONTyped,
    WorkLogbookToJSON,
} from './WorkLogbook';
import {
    WorkingHoursPreset,
    WorkingHoursPresetFromJSON,
    WorkingHoursPresetFromJSONTyped,
    WorkingHoursPresetToJSON,
} from './WorkingHoursPreset';

/**
 * A driver is always assigned to a specific vehicle and may not always be available to operate it. To be precise, a driver can only operate the corresponding vehicle within given time intervals.
 * @export
 * @interface Driver
 */
export interface Driver {
    /**
     * The unique ID of the driver.
     * @type {string}
     * @memberof Driver
     */
    id: string;
    /**
     * The ID of the driver's vehicle. This vehicle must not be referenced by another driver.
     * @type {string}
     * @memberof Driver
     */
    vehicleId: string;
    /**
     * Intervals during which the driver is available, each specified by two points in time - the beginning and the end of the interval. Each trip must lie completely within one of the intervals. The route start and trip start events must lie within one of the intervals. The intervals must have a gap of more than 1 second. Leaving this parameter empty means that the driver is always available.
     * @type {Array<TimeInterval>}
     * @memberof Driver
     */
    availabilities?: Array<TimeInterval>;
    /**
     * 
     * @type {WorkingHoursPreset}
     * @memberof Driver
     */
    workingHoursPreset?: WorkingHoursPreset | null;
    /**
     * 
     * @type {BreakRule}
     * @memberof Driver
     */
    breakRule?: BreakRule;
    /**
     * 
     * @type {DailyRestRule}
     * @memberof Driver
     */
    dailyRestRule?: DailyRestRule;
    /**
     * 
     * @type {WorkLogbook}
     * @memberof Driver
     */
    workLogbook?: WorkLogbook;
    /**
     * The maximum driving time of the driver [s]. 
     * 
     * This includes the driving time before the start of the route (see **accumulatedDrivingTimeSinceLastDailyRest** in **workLogbook**). The maximum driving time is considered as infinite if it is not set. Currently, each driver must have the same value specified.
     * @type {number}
     * @memberof Driver
     */
    maximumDrivingTime?: number | null;
    /**
     * The maximum travel time of the driver [s]. The travel time contains all waiting, service and driving times.
     * 
     * This includes the travel time before the start of the route (see **accumulatedTravelTimeSinceLastDailyRest** in **workLogbook**). The maximum travel time is considered as infinite if it is not set. Currently, each driver must have the same value specified.
     * @type {number}
     * @memberof Driver
     */
    maximumTravelTime?: number | null;
}

export function DriverFromJSON(json: any): Driver {
    return DriverFromJSONTyped(json, false);
}

export function DriverFromJSONTyped(json: any, ignoreDiscriminator: boolean): Driver {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'id': json['id'],
        'vehicleId': json['vehicleId'],
        'availabilities': !exists(json, 'availabilities') ? undefined : ((json['availabilities'] as Array<any>).map(TimeIntervalFromJSON)),
        'workingHoursPreset': !exists(json, 'workingHoursPreset') ? undefined : WorkingHoursPresetFromJSON(json['workingHoursPreset']),
        'breakRule': !exists(json, 'breakRule') ? undefined : BreakRuleFromJSON(json['breakRule']),
        'dailyRestRule': !exists(json, 'dailyRestRule') ? undefined : DailyRestRuleFromJSON(json['dailyRestRule']),
        'workLogbook': !exists(json, 'workLogbook') ? undefined : WorkLogbookFromJSON(json['workLogbook']),
        'maximumDrivingTime': !exists(json, 'maximumDrivingTime') ? undefined : json['maximumDrivingTime'],
        'maximumTravelTime': !exists(json, 'maximumTravelTime') ? undefined : json['maximumTravelTime'],
    };
}

export function DriverToJSON(value?: Driver | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'id': value.id,
        'vehicleId': value.vehicleId,
        'availabilities': value.availabilities === undefined ? undefined : ((value.availabilities as Array<any>).map(TimeIntervalToJSON)),
        'workingHoursPreset': WorkingHoursPresetToJSON(value.workingHoursPreset),
        'breakRule': BreakRuleToJSON(value.breakRule),
        'dailyRestRule': DailyRestRuleToJSON(value.dailyRestRule),
        'workLogbook': WorkLogbookToJSON(value.workLogbook),
        'maximumDrivingTime': value.maximumDrivingTime,
        'maximumTravelTime': value.maximumTravelTime,
    };
}

