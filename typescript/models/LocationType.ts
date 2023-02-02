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
 * The type of the location.
 * @export
 * @enum {string}
 */
export enum LocationType {
    DEPOT = 'DEPOT',
    CUSTOMER = 'CUSTOMER'
}

export function LocationTypeFromJSON(json: any): LocationType {
    return LocationTypeFromJSONTyped(json, false);
}

export function LocationTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): LocationType {
    return json as LocationType;
}

export function LocationTypeToJSON(value?: LocationType | null): any {
    return value as any;
}

