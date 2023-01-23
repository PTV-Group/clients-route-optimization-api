/*
 * Route Optimization
 *
 * With the Route Optimization service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.7
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = PTV.Developer.Clients.routeoptimization.Client.OpenAPIDateConverter;

namespace PTV.Developer.Clients.routeoptimization.Model
{
    /// <summary>
    /// Defines OptimizationQuality
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum OptimizationQuality
    {
        /// <summary>
        /// Enum STANDARD for value: STANDARD
        /// </summary>
        [EnumMember(Value = "STANDARD")]
        STANDARD = 1,

        /// <summary>
        /// Enum HIGH for value: HIGH
        /// </summary>
        [EnumMember(Value = "HIGH")]
        HIGH = 2

    }

}
