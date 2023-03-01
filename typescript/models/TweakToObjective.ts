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
 * A tweak to objective defines additional optimization criteria. Without any tweak, the standard optimization goal is to plan as many transports as possible with as few vehicles as possible. 
 *  * `AVOID_INTERSECTIONS` - The focus of this approach is to avoid intersections of edges, where an edge is a straight line drawn between two consecutive stops in a route. The number of routes may be higher compared to the standard optimization goal. 
 *  * `IGNORE_MINIMIZATION_OF_NUMBER_OF_ROUTES` - With this tweak, the number of vehicles used in a plan, and thus the number of routes, is not minimized.
 * @export
 * @enum {string}
 */
export enum TweakToObjective {
    AVOID_INTERSECTIONS = 'AVOID_INTERSECTIONS',
    IGNORE_MINIMIZATION_OF_NUMBER_OF_ROUTES = 'IGNORE_MINIMIZATION_OF_NUMBER_OF_ROUTES'
}

export function TweakToObjectiveFromJSON(json: any): TweakToObjective {
    return TweakToObjectiveFromJSONTyped(json, false);
}

export function TweakToObjectiveFromJSONTyped(json: any, ignoreDiscriminator: boolean): TweakToObjective {
    return json as TweakToObjective;
}

export function TweakToObjectiveToJSON(value?: TweakToObjective | null): any {
    return value as any;
}

