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
    /// Planning restrictions that must hold for all routes.
    /// </summary>
    [DataContract(Name = "PlanningRestrictions")]
    public partial class PlanningRestrictions : IEquatable<PlanningRestrictions>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PlanningRestrictions" /> class.
        /// </summary>
        /// <param name="singleTripPerRoute">Restricts the number of trips per route to one.  See [here](./Concepts/Route-structure%20control.htm) for more information. (default to false).</param>
        /// <param name="singleDepotPerRoute">Restricts the number of different depot locations in the route of a vehicle to at most one. The vehicle start and end locations do not count here.  See [here](./Concepts/Route-structure%20control.htm) for more information. (default to false).</param>
        /// <param name="mixedLoadingProhibitions">Defines restrictions regarding which load categories of transports are disallowed to be mixed on the same trip. .</param>
        public PlanningRestrictions(bool singleTripPerRoute = false, bool singleDepotPerRoute = false, List<MixedLoadingProhibition> mixedLoadingProhibitions = default(List<MixedLoadingProhibition>))
        {
            this.SingleTripPerRoute = singleTripPerRoute;
            this.SingleDepotPerRoute = singleDepotPerRoute;
            this.MixedLoadingProhibitions = mixedLoadingProhibitions;
        }

        /// <summary>
        /// Restricts the number of trips per route to one.  See [here](./Concepts/Route-structure%20control.htm) for more information.
        /// </summary>
        /// <value>Restricts the number of trips per route to one.  See [here](./Concepts/Route-structure%20control.htm) for more information.</value>
        [DataMember(Name = "singleTripPerRoute", EmitDefaultValue = true)]
        public bool SingleTripPerRoute { get; set; }

        /// <summary>
        /// Restricts the number of different depot locations in the route of a vehicle to at most one. The vehicle start and end locations do not count here.  See [here](./Concepts/Route-structure%20control.htm) for more information.
        /// </summary>
        /// <value>Restricts the number of different depot locations in the route of a vehicle to at most one. The vehicle start and end locations do not count here.  See [here](./Concepts/Route-structure%20control.htm) for more information.</value>
        [DataMember(Name = "singleDepotPerRoute", EmitDefaultValue = true)]
        public bool SingleDepotPerRoute { get; set; }

        /// <summary>
        /// Defines restrictions regarding which load categories of transports are disallowed to be mixed on the same trip. 
        /// </summary>
        /// <value>Defines restrictions regarding which load categories of transports are disallowed to be mixed on the same trip. </value>
        [DataMember(Name = "mixedLoadingProhibitions", EmitDefaultValue = false)]
        public List<MixedLoadingProhibition> MixedLoadingProhibitions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PlanningRestrictions {\n");
            sb.Append("  SingleTripPerRoute: ").Append(SingleTripPerRoute).Append("\n");
            sb.Append("  SingleDepotPerRoute: ").Append(SingleDepotPerRoute).Append("\n");
            sb.Append("  MixedLoadingProhibitions: ").Append(MixedLoadingProhibitions).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as PlanningRestrictions);
        }

        /// <summary>
        /// Returns true if PlanningRestrictions instances are equal
        /// </summary>
        /// <param name="input">Instance of PlanningRestrictions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PlanningRestrictions input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.SingleTripPerRoute == input.SingleTripPerRoute ||
                    this.SingleTripPerRoute.Equals(input.SingleTripPerRoute)
                ) && 
                (
                    this.SingleDepotPerRoute == input.SingleDepotPerRoute ||
                    this.SingleDepotPerRoute.Equals(input.SingleDepotPerRoute)
                ) && 
                (
                    this.MixedLoadingProhibitions == input.MixedLoadingProhibitions ||
                    this.MixedLoadingProhibitions != null &&
                    input.MixedLoadingProhibitions != null &&
                    this.MixedLoadingProhibitions.SequenceEqual(input.MixedLoadingProhibitions)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                hashCode = (hashCode * 59) + this.SingleTripPerRoute.GetHashCode();
                hashCode = (hashCode * 59) + this.SingleDepotPerRoute.GetHashCode();
                if (this.MixedLoadingProhibitions != null)
                {
                    hashCode = (hashCode * 59) + this.MixedLoadingProhibitions.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
