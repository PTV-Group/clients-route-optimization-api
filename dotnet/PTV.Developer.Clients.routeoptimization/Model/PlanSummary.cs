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
    /// The summary of a plan.
    /// </summary>
    [DataContract(Name = "PlanSummary")]
    public partial class PlanSummary : IEquatable<PlanSummary>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PlanSummary" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PlanSummary() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PlanSummary" /> class.
        /// </summary>
        /// <param name="id">The ID of the plan. (required).</param>
        /// <param name="numberOfLocations">Number of locations in the plan. (required).</param>
        /// <param name="numberOfVehicles">Number of vehicles in the plan. (required).</param>
        /// <param name="numberOfTransports">Number of transports in the plan. (required).</param>
        /// <param name="numberOfRoutes">Number of routes in the plan. (required).</param>
        /// <param name="description">The description of the plan..</param>
        /// <param name="updateTime">Time of the latest update of the plan formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). (required).</param>
        /// <param name="creationTime">Time of the creation of the plan formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). (required).</param>
        public PlanSummary(Guid id = default(Guid), int numberOfLocations = default(int), int numberOfVehicles = default(int), int numberOfTransports = default(int), int numberOfRoutes = default(int), string description = default(string), DateTimeOffset updateTime = default(DateTimeOffset), DateTimeOffset creationTime = default(DateTimeOffset))
        {
            this.Id = id;
            this.NumberOfLocations = numberOfLocations;
            this.NumberOfVehicles = numberOfVehicles;
            this.NumberOfTransports = numberOfTransports;
            this.NumberOfRoutes = numberOfRoutes;
            this.UpdateTime = updateTime;
            this.CreationTime = creationTime;
            this.Description = description;
        }

        /// <summary>
        /// The ID of the plan.
        /// </summary>
        /// <value>The ID of the plan.</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = false)]
        public Guid Id { get; set; }

        /// <summary>
        /// Number of locations in the plan.
        /// </summary>
        /// <value>Number of locations in the plan.</value>
        [DataMember(Name = "numberOfLocations", IsRequired = true, EmitDefaultValue = false)]
        public int NumberOfLocations { get; set; }

        /// <summary>
        /// Number of vehicles in the plan.
        /// </summary>
        /// <value>Number of vehicles in the plan.</value>
        [DataMember(Name = "numberOfVehicles", IsRequired = true, EmitDefaultValue = false)]
        public int NumberOfVehicles { get; set; }

        /// <summary>
        /// Number of transports in the plan.
        /// </summary>
        /// <value>Number of transports in the plan.</value>
        [DataMember(Name = "numberOfTransports", IsRequired = true, EmitDefaultValue = false)]
        public int NumberOfTransports { get; set; }

        /// <summary>
        /// Number of routes in the plan.
        /// </summary>
        /// <value>Number of routes in the plan.</value>
        [DataMember(Name = "numberOfRoutes", IsRequired = true, EmitDefaultValue = false)]
        public int NumberOfRoutes { get; set; }

        /// <summary>
        /// The description of the plan.
        /// </summary>
        /// <value>The description of the plan.</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// Time of the latest update of the plan formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
        /// </summary>
        /// <value>Time of the latest update of the plan formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).</value>
        [DataMember(Name = "updateTime", IsRequired = true, EmitDefaultValue = false)]
        public DateTimeOffset UpdateTime { get; set; }

        /// <summary>
        /// Time of the creation of the plan formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
        /// </summary>
        /// <value>Time of the creation of the plan formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).</value>
        [DataMember(Name = "creationTime", IsRequired = true, EmitDefaultValue = false)]
        public DateTimeOffset CreationTime { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PlanSummary {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  NumberOfLocations: ").Append(NumberOfLocations).Append("\n");
            sb.Append("  NumberOfVehicles: ").Append(NumberOfVehicles).Append("\n");
            sb.Append("  NumberOfTransports: ").Append(NumberOfTransports).Append("\n");
            sb.Append("  NumberOfRoutes: ").Append(NumberOfRoutes).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  UpdateTime: ").Append(UpdateTime).Append("\n");
            sb.Append("  CreationTime: ").Append(CreationTime).Append("\n");
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
            return this.Equals(input as PlanSummary);
        }

        /// <summary>
        /// Returns true if PlanSummary instances are equal
        /// </summary>
        /// <param name="input">Instance of PlanSummary to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PlanSummary input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.NumberOfLocations == input.NumberOfLocations ||
                    this.NumberOfLocations.Equals(input.NumberOfLocations)
                ) && 
                (
                    this.NumberOfVehicles == input.NumberOfVehicles ||
                    this.NumberOfVehicles.Equals(input.NumberOfVehicles)
                ) && 
                (
                    this.NumberOfTransports == input.NumberOfTransports ||
                    this.NumberOfTransports.Equals(input.NumberOfTransports)
                ) && 
                (
                    this.NumberOfRoutes == input.NumberOfRoutes ||
                    this.NumberOfRoutes.Equals(input.NumberOfRoutes)
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.UpdateTime == input.UpdateTime ||
                    (this.UpdateTime != null &&
                    this.UpdateTime.Equals(input.UpdateTime))
                ) && 
                (
                    this.CreationTime == input.CreationTime ||
                    (this.CreationTime != null &&
                    this.CreationTime.Equals(input.CreationTime))
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.NumberOfLocations.GetHashCode();
                hashCode = (hashCode * 59) + this.NumberOfVehicles.GetHashCode();
                hashCode = (hashCode * 59) + this.NumberOfTransports.GetHashCode();
                hashCode = (hashCode * 59) + this.NumberOfRoutes.GetHashCode();
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
                }
                if (this.UpdateTime != null)
                {
                    hashCode = (hashCode * 59) + this.UpdateTime.GetHashCode();
                }
                if (this.CreationTime != null)
                {
                    hashCode = (hashCode * 59) + this.CreationTime.GetHashCode();
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
