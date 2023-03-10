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
    CustomerLocationAttributes,
    CustomerLocationAttributesFromJSON,
    CustomerLocationAttributesFromJSONTyped,
    CustomerLocationAttributesToJSON,
} from './CustomerLocationAttributes';
import {
    DepotLocationAttributes,
    DepotLocationAttributesFromJSON,
    DepotLocationAttributesFromJSONTyped,
    DepotLocationAttributesToJSON,
} from './DepotLocationAttributes';
import {
    LocationType,
    LocationTypeFromJSON,
    LocationTypeFromJSONTyped,
    LocationTypeToJSON,
} from './LocationType';
import {
    TimeInterval,
    TimeIntervalFromJSON,
    TimeIntervalFromJSONTyped,
    TimeIntervalToJSON,
} from './TimeInterval';

/**
 * A specific location where goods have to be picked up or delivered, or where vehicles are located. A location is either a depot location or a customer location. Depot locations act as trip delimiters.
 * 
 * See [here](./concepts/locations-transports-and-stops) for more information.
 * @export
 * @interface Location
 */
export interface Location {
    /**
     * A unique ID for this location. This ID can be used to reference the location from other elements, for example from transports or vehicles. The ID does not influence the result.
     * @type {string}
     * @memberof Location
     */
    id: string;
    /**
     * 
     * @type {LocationType}
     * @memberof Location
     */
    type?: LocationType;
    /**
     * The latitude value of the location in degrees (WGS84/EPSG:4326) from south to north.
     * @type {number}
     * @memberof Location
     */
    latitude: number;
    /**
     * The longitude value of the location in degrees (WGS84/EPSG:4326) from west to east.
     * @type {number}
     * @memberof Location
     */
    longitude: number;
    /**
     * Indicates if vehicle-dependent service time factors are relevant for this location. The factors are typically relevant when the vehicles are (un)loaded by the drivers and may be irrelevant when the vehicles are (un)loaded by the location's staff. If this parameter is set to false, no vehicle-dependent service time factors are taken into account for this location when processing transports.
     * @type {boolean}
     * @memberof Location
     */
    applyVehicleDependentServiceTimeFactor?: boolean;
    /**
     * The opening intervals at this location, each specified by two points in time - the beginning and the end of the interval. Leaving this parameter empty means that the location is always open. Service (pickup or delivery) can only start within one of the opening intervals. If a planning horizon is defined for the request, all opening intervals outside of this horizon are not considered during the route optimization process. If no planning horizon is defined, it is required that the opening intervals of all locations do not span a horizon longer than two weeks.
     * @type {Array<TimeInterval>}
     * @memberof Location
     */
    openingIntervals?: Array<TimeInterval>;
    /**
     * 
     * @type {DepotLocationAttributes}
     * @memberof Location
     */
    depotLocationAttributes?: DepotLocationAttributes;
    /**
     * 
     * @type {CustomerLocationAttributes}
     * @memberof Location
     */
    customerLocationAttributes?: CustomerLocationAttributes;
}

export function LocationFromJSON(json: any): Location {
    return LocationFromJSONTyped(json, false);
}

export function LocationFromJSONTyped(json: any, ignoreDiscriminator: boolean): Location {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'id': json['id'],
        'type': !exists(json, 'type') ? undefined : LocationTypeFromJSON(json['type']),
        'latitude': json['latitude'],
        'longitude': json['longitude'],
        'applyVehicleDependentServiceTimeFactor': !exists(json, 'applyVehicleDependentServiceTimeFactor') ? undefined : json['applyVehicleDependentServiceTimeFactor'],
        'openingIntervals': !exists(json, 'openingIntervals') ? undefined : ((json['openingIntervals'] as Array<any>).map(TimeIntervalFromJSON)),
        'depotLocationAttributes': !exists(json, 'depotLocationAttributes') ? undefined : DepotLocationAttributesFromJSON(json['depotLocationAttributes']),
        'customerLocationAttributes': !exists(json, 'customerLocationAttributes') ? undefined : CustomerLocationAttributesFromJSON(json['customerLocationAttributes']),
    };
}

export function LocationToJSON(value?: Location | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'id': value.id,
        'type': LocationTypeToJSON(value.type),
        'latitude': value.latitude,
        'longitude': value.longitude,
        'applyVehicleDependentServiceTimeFactor': value.applyVehicleDependentServiceTimeFactor,
        'openingIntervals': value.openingIntervals === undefined ? undefined : ((value.openingIntervals as Array<any>).map(TimeIntervalToJSON)),
        'depotLocationAttributes': DepotLocationAttributesToJSON(value.depotLocationAttributes),
        'customerLocationAttributes': CustomerLocationAttributesToJSON(value.customerLocationAttributes),
    };
}

