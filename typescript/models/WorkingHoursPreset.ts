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

/**
 * Specifies break and daily rest rule as well as maximum driving and travel time according to the chosen law.
 * 
 * If one of the concerned fields is specified as well the most restrictive rule holds. For example if a preset and maximumDrivingTime or maximumTravelTime are specified, the minimum of the specified value and the value defined by the preset counts. Currently, each driver must have the same value specified.
 * 
 * See [here](./concepts/drivers-working-hours-break-and-rest-rules) for more information.
 * @export
 * @enum {string}
 */
export enum WorkingHoursPreset {
    EU_DRIVING_TIME_REGULATION_FOR_SINGLE_DAY = 'EU_DRIVING_TIME_REGULATION_FOR_SINGLE_DAY',
    EU_DRIVING_TIME_REGULATION_FOR_LONG_SINGLE_DAY = 'EU_DRIVING_TIME_REGULATION_FOR_LONG_SINGLE_DAY',
    EU_WORKING_TIME_DIRECTIVE_FOR_SINGLE_DAY = 'EU_WORKING_TIME_DIRECTIVE_FOR_SINGLE_DAY',
    EU_WORKING_TIME_DIRECTIVE_FOR_LONG_SINGLE_DAY = 'EU_WORKING_TIME_DIRECTIVE_FOR_LONG_SINGLE_DAY',
    EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_DAYS = 'EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_DAYS',
    EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_SINGLE_DAYS = 'EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_SINGLE_DAYS',
    EU_DRIVING_TIME_REGULATION_FOR_TEAM_AND_MULTIPLE_DAYS = 'EU_DRIVING_TIME_REGULATION_FOR_TEAM_AND_MULTIPLE_DAYS',
    US_HOURS_OF_SERVICE_REGULATIONS_FOR_SINGLE_DAY = 'US_HOURS_OF_SERVICE_REGULATIONS_FOR_SINGLE_DAY',
    US_HOURS_OF_SERVICE_REGULATIONS_FOR_SHORT_HAUL_AND_SINGLE_DAY = 'US_HOURS_OF_SERVICE_REGULATIONS_FOR_SHORT_HAUL_AND_SINGLE_DAY',
    US_HOURS_OF_SERVICE_REGULATIONS_FOR_MULTIPLE_DAYS = 'US_HOURS_OF_SERVICE_REGULATIONS_FOR_MULTIPLE_DAYS',
    US_HOURS_OF_SERVICE_REGULATIONS_FOR_MULTIPLE_SINGLE_DAYS = 'US_HOURS_OF_SERVICE_REGULATIONS_FOR_MULTIPLE_SINGLE_DAYS',
    US_HOURS_OF_SERVICE_REGULATIONS_FOR_SHORT_HAUL_AND_MULTIPLE_SINGLE_DAYS = 'US_HOURS_OF_SERVICE_REGULATIONS_FOR_SHORT_HAUL_AND_MULTIPLE_SINGLE_DAYS'
}

export function WorkingHoursPresetFromJSON(json: any): WorkingHoursPreset {
    return WorkingHoursPresetFromJSONTyped(json, false);
}

export function WorkingHoursPresetFromJSONTyped(json: any, ignoreDiscriminator: boolean): WorkingHoursPreset {
    return json as WorkingHoursPreset;
}

export function WorkingHoursPresetToJSON(value?: WorkingHoursPreset | null): any {
    return value as any;
}

