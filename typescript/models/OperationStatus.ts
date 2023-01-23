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
 * Possible status of an operation.
 * @export
 * @enum {string}
 */
export enum OperationStatus {
    RUNNING = 'RUNNING',
    SUCCEEDED = 'SUCCEEDED',
    FAILED = 'FAILED'
}

export function OperationStatusFromJSON(json: any): OperationStatus {
    return OperationStatusFromJSONTyped(json, false);
}

export function OperationStatusFromJSONTyped(json: any, ignoreDiscriminator: boolean): OperationStatus {
    return json as OperationStatus;
}

export function OperationStatusToJSON(value?: OperationStatus | null): any {
    return value as any;
}

