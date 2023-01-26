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
 * Position where the **capacities** or **alternativeCapacities** of the vehicle may be changed.
 * @export
 * @enum {string}
 */
export enum CapacitiesChangePosition {
    BETWEEN_TRIPS = 'BETWEEN_TRIPS',
    AT_STOP = 'AT_STOP'
}

export function CapacitiesChangePositionFromJSON(json: any): CapacitiesChangePosition {
    return CapacitiesChangePositionFromJSONTyped(json, false);
}

export function CapacitiesChangePositionFromJSONTyped(json: any, ignoreDiscriminator: boolean): CapacitiesChangePosition {
    return json as CapacitiesChangePosition;
}

export function CapacitiesChangePositionToJSON(value?: CapacitiesChangePosition | null): any {
    return value as any;
}
