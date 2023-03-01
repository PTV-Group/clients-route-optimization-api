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
/**
 * A transport is the order to transport goods, that is, to pick them up at one location and deliver them to another location.
 * 
 * See [here](./concepts/locations-transports-and-stops) for more information.
 * @export
 * @interface Transport
 */
export interface Transport {
    /**
     * A unique ID across all transports. The ID does not influence the result.
     * @type {string}
     * @memberof Transport
     */
    id: string;
    /**
     * A list of quantity dimensions of goods that have to be transported from pickup location to delivery location. The maximum length of this list is 100. That is, up to 100 different quantity dimensions (e.g. number of pallets, weight, volume, etc.) can be distinguished. Transports can only be executed by a vehicle with a higher (or an equal) maximum capacity in every quantity dimension. The length of this list has to be the same for all transports and all capacities of all vehicles. If and only if this list of quantities is empty for all transports, the capacities of each vehicle must be empty.
     * @type {Array<number>}
     * @memberof Transport
     */
    quantities?: Array<number>;
    /**
     * The ID of the location where goods have to be picked up.
     * @type {string}
     * @memberof Transport
     */
    pickupLocationId: string;
    /**
     * The transport-dependent service time [s] that is required to pick up the transport goods at the pickup location.
     * @type {number}
     * @memberof Transport
     */
    pickupServiceTime?: number;
    /**
     * The ID of the location where goods have to be delivered to.
     * @type {string}
     * @memberof Transport
     */
    deliveryLocationId: string;
    /**
     * The transport-dependent service time [s] that is required to deliver the transport goods at the delivery location.
     * @type {number}
     * @memberof Transport
     */
    deliveryServiceTime?: number;
    /**
     * A list of required vehicle equipment. If empty, no equipment is required. A vehicle can only be assigned to the transport if this list is a subset of (or equal to) the vehicle's equipment.
     * @type {Array<string>}
     * @memberof Transport
     */
    requiredEquipment?: Array<string>;
    /**
     * The priority of this transport. 0 is the lowest priority, 9 the highest. This field is only considered during the optimization if considerTransportPriorities is set. In this case every transport must have a priority set otherwise an exception is thrown. If considerTransportPriorities is set to false either every or no transport may have a priority set.
     * 
     * See [here](./concepts/transport-priorities) for more information.
     * @type {number}
     * @memberof Transport
     */
    priority?: number | null;
    /**
     * The load category of this transport. To specify a load category is useful if there are transports with one load category that shall not be mixed with transports with another load category on one trip. If two load categories are mutually exclusive on a trip, this can be specified as a mixed loading prohibition. Transports with conflicting load categories will not be planned together on one trip.
     * 
     * See [here](./concepts/mixed-loading-prohibition) for more information.
     * @type {string}
     * @memberof Transport
     */
    loadCategory?: string;
}

export function TransportFromJSON(json: any): Transport {
    return TransportFromJSONTyped(json, false);
}

export function TransportFromJSONTyped(json: any, ignoreDiscriminator: boolean): Transport {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'id': json['id'],
        'quantities': !exists(json, 'quantities') ? undefined : json['quantities'],
        'pickupLocationId': json['pickupLocationId'],
        'pickupServiceTime': !exists(json, 'pickupServiceTime') ? undefined : json['pickupServiceTime'],
        'deliveryLocationId': json['deliveryLocationId'],
        'deliveryServiceTime': !exists(json, 'deliveryServiceTime') ? undefined : json['deliveryServiceTime'],
        'requiredEquipment': !exists(json, 'requiredEquipment') ? undefined : json['requiredEquipment'],
        'priority': !exists(json, 'priority') ? undefined : json['priority'],
        'loadCategory': !exists(json, 'loadCategory') ? undefined : json['loadCategory'],
    };
}

export function TransportToJSON(value?: Transport | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'id': value.id,
        'quantities': value.quantities,
        'pickupLocationId': value.pickupLocationId,
        'pickupServiceTime': value.pickupServiceTime,
        'deliveryLocationId': value.deliveryLocationId,
        'deliveryServiceTime': value.deliveryServiceTime,
        'requiredEquipment': value.requiredEquipment,
        'priority': value.priority,
        'loadCategory': value.loadCategory,
    };
}

