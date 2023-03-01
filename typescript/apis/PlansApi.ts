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


import * as runtime from '../runtime';
import {
    ErrorResponse,
    ErrorResponseFromJSON,
    ErrorResponseToJSON,
    Plan,
    PlanFromJSON,
    PlanToJSON,
    PlanSummaries,
    PlanSummariesFromJSON,
    PlanSummariesToJSON,
} from '../models';

export interface CreatePlanRequest {
    plan: Plan;
}

export interface DeletePlanRequest {
    id: string;
}

export interface GetPlanRequest {
    id: string;
}

/**
 * 
 */
export class PlansApi extends runtime.BaseAPI {

    /**
     * Creates a new plan containing parts like vehicles and transports which should be used for a subsequent optimization. It persists and returns a slightly modified plan including a server generated ID that can be used for later retrieval. This returned plan can be used for automated route optimization via Operations API.
     */
    async createPlanRaw(requestParameters: CreatePlanRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<Plan>> {
        if (requestParameters.plan === null || requestParameters.plan === undefined) {
            throw new runtime.RequiredError('plan','Required parameter requestParameters.plan was null or undefined when calling createPlan.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/plans`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: PlanToJSON(requestParameters.plan),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => PlanFromJSON(jsonValue));
    }

    /**
     * Creates a new plan containing parts like vehicles and transports which should be used for a subsequent optimization. It persists and returns a slightly modified plan including a server generated ID that can be used for later retrieval. This returned plan can be used for automated route optimization via Operations API.
     */
    async createPlan(requestParameters: CreatePlanRequest, initOverrides?: RequestInit): Promise<Plan> {
        const response = await this.createPlanRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Deletes a plan identified by the ID. Also cancels a currently running optimization of the plan.
     */
    async deletePlanRaw(requestParameters: DeletePlanRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.id === null || requestParameters.id === undefined) {
            throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling deletePlan.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/plans/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Deletes a plan identified by the ID. Also cancels a currently running optimization of the plan.
     */
    async deletePlan(requestParameters: DeletePlanRequest, initOverrides?: RequestInit): Promise<void> {
        await this.deletePlanRaw(requestParameters, initOverrides);
    }

    /**
     * Retrieves a plan identified by the ID.
     */
    async getPlanRaw(requestParameters: GetPlanRequest, initOverrides?: RequestInit): Promise<runtime.ApiResponse<Plan>> {
        if (requestParameters.id === null || requestParameters.id === undefined) {
            throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling getPlan.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/plans/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => PlanFromJSON(jsonValue));
    }

    /**
     * Retrieves a plan identified by the ID.
     */
    async getPlan(requestParameters: GetPlanRequest, initOverrides?: RequestInit): Promise<Plan> {
        const response = await this.getPlanRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Retrieves a list of summaries for at most 1000 least recently updated available plans.
     */
    async getPlanSummariesRaw(initOverrides?: RequestInit): Promise<runtime.ApiResponse<PlanSummaries>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/plans/summaries`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => PlanSummariesFromJSON(jsonValue));
    }

    /**
     * Retrieves a list of summaries for at most 1000 least recently updated available plans.
     */
    async getPlanSummaries(initOverrides?: RequestInit): Promise<PlanSummaries> {
        const response = await this.getPlanSummariesRaw(initOverrides);
        return await response.value();
    }

}
