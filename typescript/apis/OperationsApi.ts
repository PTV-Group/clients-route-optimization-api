/* tslint:disable */
/* eslint-disable */
/**
 * Route Optimization
 * With the Route Optimization service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as runtime from '../runtime';
import {
    ErrorResponse,
    ErrorResponseFromJSON,
    ErrorResponseToJSON,
    Operation,
    OperationFromJSON,
    OperationToJSON,
    OptimizationQuality,
    OptimizationQualityFromJSON,
    OptimizationQualityToJSON,
    TweakToObjective,
    TweakToObjectiveFromJSON,
    TweakToObjectiveToJSON,
} from '../models';

export interface CancelOperationRequest {
    id: string;
}

export interface GetOperationStatusRequest {
    id: string;
}

export interface StartEvaluationRequest {
    id: string;
}

export interface StartOptimizationRequest {
    id: string;
    quality?: OptimizationQuality;
    tweaksToObjective?: Array<TweakToObjective>;
    considerTransportPriorities?: boolean;
    optimizationPremium?: boolean;
}

/**
 * 
 */
export class OperationsApi extends runtime.BaseAPI {

    /**
     * Cancels the current operation of a plan. After cancelling an operation, the operation status for this plan can no longer be retrieved.
     */
    async cancelOperationRaw(requestParameters: CancelOperationRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.id === null || requestParameters.id === undefined) {
            throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling cancelOperation.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/plans/{id}/operation`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Cancels the current operation of a plan. After cancelling an operation, the operation status for this plan can no longer be retrieved.
     */
    async cancelOperation(requestParameters: CancelOperationRequest, initOverrides?: RequestInit): Promise<void> {
        await this.cancelOperationRaw(requestParameters, initOverrides);
    }

    /**
     * Retrieves the status of the current operation that is executed for the plan. If currently no operation is executed the status of the last executed operation is returned.
     */
    async getOperationStatusRaw(requestParameters: GetOperationStatusRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<Operation>> {
        if (requestParameters.id === null || requestParameters.id === undefined) {
            throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling getOperationStatus.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/plans/{id}/operation`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => OperationFromJSON(jsonValue));
    }

    /**
     * Retrieves the status of the current operation that is executed for the plan. If currently no operation is executed the status of the last executed operation is returned.
     */
    async getOperationStatus(requestParameters: GetOperationStatusRequest, initOverrides?: RequestInit): Promise<Operation> {
        const response = await this.getOperationStatusRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Starts an asynchronous evaluation of the specified plan. Only one operation can be started for a plan at a time. Trying to start another operation before the current operation is finished results in an error. Whether an operation is finished or not can be checked with \"getOperationStatus\". To get the result after the operation is finished \"getPlan\" can be used. Evaluation of a plan calculates driving times, service times, break and rest times and waiting times taking into account given time intervals. It may happen that not all restrictions can be fullfilled in which case one or more violations are reported. Evaluation does not change which transports are scheduled into which route nor their sequence, it does also not change the assignments of routes to vehicles.
     */
    async startEvaluationRaw(requestParameters: StartEvaluationRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.id === null || requestParameters.id === undefined) {
            throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling startEvaluation.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/plans/{id}/operation/evaluation`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Starts an asynchronous evaluation of the specified plan. Only one operation can be started for a plan at a time. Trying to start another operation before the current operation is finished results in an error. Whether an operation is finished or not can be checked with \"getOperationStatus\". To get the result after the operation is finished \"getPlan\" can be used. Evaluation of a plan calculates driving times, service times, break and rest times and waiting times taking into account given time intervals. It may happen that not all restrictions can be fullfilled in which case one or more violations are reported. Evaluation does not change which transports are scheduled into which route nor their sequence, it does also not change the assignments of routes to vehicles.
     */
    async startEvaluation(requestParameters: StartEvaluationRequest, initOverrides?: RequestInit): Promise<void> {
        await this.startEvaluationRaw(requestParameters, initOverrides);
    }

    /**
     * Starts an asynchronous optimization of the specified plan. Only one operation can be started for a plan at a time. Trying to start another operation before the current operation is finished results in an error. Whether an operation is finished or not can be checked with \"getOperationStatus\". To get the result after the operation is finished \"getPlan\" can be used. In the optimized plan, routes ideally include all transports that are specified in the request. Routes have additional information like arrival and departure times, driving times, service times and more.  If you call startOptimization multiple times consecutively for the same id, the optimization uses the result of the previous optimization as input, so previously planned transports remain planned in the output routes. If this is not what you intend to do, you can create a new plan before another startOptimization call.  When starting the optimization, the number of transports in the plan is used to calculate the number of transactions, see [here](../../help/faq-help) for more information.
     */
    async startOptimizationRaw(requestParameters: StartOptimizationRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.id === null || requestParameters.id === undefined) {
            throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling startOptimization.');
        }

        const queryParameters: any = {};

        if (requestParameters.quality !== undefined) {
            queryParameters['quality'] = requestParameters.quality;
        }

        if (requestParameters.tweaksToObjective) {
            queryParameters['tweaksToObjective'] = requestParameters.tweaksToObjective.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        if (requestParameters.considerTransportPriorities !== undefined) {
            queryParameters['considerTransportPriorities'] = requestParameters.considerTransportPriorities;
        }

        if (requestParameters.optimizationPremium !== undefined) {
            queryParameters['optimizationPremium'] = requestParameters.optimizationPremium;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/plans/{id}/operation/optimization`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Starts an asynchronous optimization of the specified plan. Only one operation can be started for a plan at a time. Trying to start another operation before the current operation is finished results in an error. Whether an operation is finished or not can be checked with \"getOperationStatus\". To get the result after the operation is finished \"getPlan\" can be used. In the optimized plan, routes ideally include all transports that are specified in the request. Routes have additional information like arrival and departure times, driving times, service times and more.  If you call startOptimization multiple times consecutively for the same id, the optimization uses the result of the previous optimization as input, so previously planned transports remain planned in the output routes. If this is not what you intend to do, you can create a new plan before another startOptimization call.  When starting the optimization, the number of transports in the plan is used to calculate the number of transactions, see [here](../../help/faq-help) for more information.
     */
    async startOptimization(requestParameters: StartOptimizationRequest, initOverrides?: RequestInit): Promise<void> {
        await this.startOptimizationRaw(requestParameters, initOverrides);
    }

}
