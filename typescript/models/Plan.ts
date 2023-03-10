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
    Driver,
    DriverFromJSON,
    DriverFromJSONTyped,
    DriverToJSON,
} from './Driver';
import {
    Location,
    LocationFromJSON,
    LocationFromJSONTyped,
    LocationToJSON,
} from './Location';
import {
    PlanningRestrictions,
    PlanningRestrictionsFromJSON,
    PlanningRestrictionsFromJSONTyped,
    PlanningRestrictionsToJSON,
} from './PlanningRestrictions';
import {
    Route,
    RouteFromJSON,
    RouteFromJSONTyped,
    RouteToJSON,
} from './Route';
import {
    TimeInterval,
    TimeIntervalFromJSON,
    TimeIntervalFromJSONTyped,
    TimeIntervalToJSON,
} from './TimeInterval';
import {
    Transport,
    TransportFromJSON,
    TransportFromJSONTyped,
    TransportToJSON,
} from './Transport';
import {
    Vehicle,
    VehicleFromJSON,
    VehicleFromJSONTyped,
    VehicleToJSON,
} from './Vehicle';

/**
 * The request object for the service method 'createPlan' and the result of the service method 'getPlan'.
 * @export
 * @interface Plan
 */
export interface Plan {
    /**
     * The ID of the plan. It is generated when the plan is created.
     * @type {string}
     * @memberof Plan
     */
    readonly id: string;
    /**
     * A description of the plan.
     * @type {string}
     * @memberof Plan
     */
    description?: string;
    /**
     * A list of depot or customer locations that may be referenced by vehicles, transports and stops. A location is either a depot location or a customer location. Depot locations act as trip delimiters. Each location must be referenced by another object. If a request contains a location not referenced by any other object, the request will be rejected.
     * @type {Array<Location>}
     * @memberof Plan
     */
    locations: Array<Location>;
    /**
     * A list of vehicles that can be used to transport goods.
     * @type {Array<Vehicle>}
     * @memberof Plan
     */
    vehicles: Array<Vehicle>;
    /**
     * A list of drivers. A driver is always assigned to a specific vehicle. In turn, a vehicle can but does not need to have a driver assigned to it. If a driver is assigned to a vehicle, the driver's restrictions apply, such as its limited availability. If no drivers are specified, the drivers of all vehicles are always available.
     * @type {Array<Driver>}
     * @memberof Plan
     */
    drivers?: Array<Driver>;
    /**
     * A list of transports, that is, orders to transport goods from one location to another location. Depending on your subscription, a more restrictive value for maximum number of transport may apply. Check request limits of your subscription.
     * @type {Array<Transport>}
     * @memberof Plan
     */
    transports: Array<Transport>;
    /**
     * The planning horizon for the plan, described by start and end date and time. All routes have to start and end within this planning horizon. All opening intervals outside of this planning horizon are not considered by the algorithm. If specified, the planning horizon is restricted to a maximum duration of two weeks. If not specified, the planning horizon is infinite. If no other time interval is specified within this plan, the planning horizon is required.
     * @type {TimeInterval}
     * @memberof Plan
     */
    planningHorizon?: TimeInterval | null;
    /**
     * 
     * @type {PlanningRestrictions}
     * @memberof Plan
     */
    restrictions?: PlanningRestrictions;
    /**
     * A list of routes. A route contains a sequence of stops. It specifies where and in which order goods are to be picked up or delivered. Each stop can be assigned to a trip. A route is subdivided into trips. Each route has at least one trip and a trip consists of at least two stops. At the beginning and end of each trip the vehicle does not carry any load. A trip starts at the vehicle start location or at a depot location, and ends at the vehicle end location or at a depot location. If routes are already given in input they are considered during planning. Transports which are already planned in an input route will also remain planned in the output routes. This might lead to violations of the routes. 
     * 
     * See [here](./concepts/routes-and-trips) for more information.
     * @type {Array<Route>}
     * @memberof Plan
     */
    routes?: Array<Route>;
    /**
     * Returns the vehicle IDs that are not used in the response of an optimization operation. These vehicles are not assigned to any route.
     * @type {Array<string>}
     * @memberof Plan
     */
    readonly unplannedVehicleIds?: Array<string>;
    /**
     * Returns the transport IDs that could not be planned in the response of an optimization operation. These transports are not part of the routes.
     * @type {Array<string>}
     * @memberof Plan
     */
    readonly unplannedTransportIds?: Array<string>;
}

export function PlanFromJSON(json: any): Plan {
    return PlanFromJSONTyped(json, false);
}

export function PlanFromJSONTyped(json: any, ignoreDiscriminator: boolean): Plan {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'id': json['id'],
        'description': !exists(json, 'description') ? undefined : json['description'],
        'locations': ((json['locations'] as Array<any>).map(LocationFromJSON)),
        'vehicles': ((json['vehicles'] as Array<any>).map(VehicleFromJSON)),
        'drivers': !exists(json, 'drivers') ? undefined : ((json['drivers'] as Array<any>).map(DriverFromJSON)),
        'transports': ((json['transports'] as Array<any>).map(TransportFromJSON)),
        'planningHorizon': !exists(json, 'planningHorizon') ? undefined : TimeIntervalFromJSON(json['planningHorizon']),
        'restrictions': !exists(json, 'restrictions') ? undefined : PlanningRestrictionsFromJSON(json['restrictions']),
        'routes': !exists(json, 'routes') ? undefined : ((json['routes'] as Array<any>).map(RouteFromJSON)),
        'unplannedVehicleIds': !exists(json, 'unplannedVehicleIds') ? undefined : json['unplannedVehicleIds'],
        'unplannedTransportIds': !exists(json, 'unplannedTransportIds') ? undefined : json['unplannedTransportIds'],
    };
}

export function PlanToJSON(value?: Plan | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'description': value.description,
        'locations': ((value.locations as Array<any>).map(LocationToJSON)),
        'vehicles': ((value.vehicles as Array<any>).map(VehicleToJSON)),
        'drivers': value.drivers === undefined ? undefined : ((value.drivers as Array<any>).map(DriverToJSON)),
        'transports': ((value.transports as Array<any>).map(TransportToJSON)),
        'planningHorizon': TimeIntervalToJSON(value.planningHorizon),
        'restrictions': PlanningRestrictionsToJSON(value.restrictions),
        'routes': value.routes === undefined ? undefined : ((value.routes as Array<any>).map(RouteToJSON)),
    };
}

