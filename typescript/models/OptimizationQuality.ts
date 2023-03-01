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
 * 
 * @export
 * @enum {string}
 */
export enum OptimizationQuality {
    STANDARD = 'STANDARD',
    HIGH = 'HIGH'
}

export function OptimizationQualityFromJSON(json: any): OptimizationQuality {
    return OptimizationQualityFromJSONTyped(json, false);
}

export function OptimizationQualityFromJSONTyped(json: any, ignoreDiscriminator: boolean): OptimizationQuality {
    return json as OptimizationQuality;
}

export function OptimizationQualityToJSON(value?: OptimizationQuality | null): any {
    return value as any;
}

