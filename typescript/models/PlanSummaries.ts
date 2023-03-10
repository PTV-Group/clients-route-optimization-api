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
    PlanSummary,
    PlanSummaryFromJSON,
    PlanSummaryFromJSONTyped,
    PlanSummaryToJSON,
} from './PlanSummary';

/**
 * 
 * @export
 * @interface PlanSummaries
 */
export interface PlanSummaries {
    /**
     * 
     * @type {Array<PlanSummary>}
     * @memberof PlanSummaries
     */
    summaries: Array<PlanSummary>;
}

export function PlanSummariesFromJSON(json: any): PlanSummaries {
    return PlanSummariesFromJSONTyped(json, false);
}

export function PlanSummariesFromJSONTyped(json: any, ignoreDiscriminator: boolean): PlanSummaries {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'summaries': ((json['summaries'] as Array<any>).map(PlanSummaryFromJSON)),
    };
}

export function PlanSummariesToJSON(value?: PlanSummaries | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'summaries': ((value.summaries as Array<any>).map(PlanSummaryToJSON)),
    };
}

