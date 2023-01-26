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
 * Indicates at which position of a route daily rests are planned.
 * 
 * See [here](./Concepts/Drivers%20Working%20Hours.htm) for more information.
 * @export
 * @enum {string}
 */
export enum DailyRestPosition {
    BETWEEN_TRIPS = 'BETWEEN_TRIPS',
    ANYWHERE = 'ANYWHERE'
}

export function DailyRestPositionFromJSON(json: any): DailyRestPosition {
    return DailyRestPositionFromJSONTyped(json, false);
}

export function DailyRestPositionFromJSONTyped(json: any, ignoreDiscriminator: boolean): DailyRestPosition {
    return json as DailyRestPosition;
}

export function DailyRestPositionToJSON(value?: DailyRestPosition | null): any {
    return value as any;
}
