/*
 * Route Optimization
 *
 * With the Route Optimization service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.8
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
    /// PlanSummaries
    /// </summary>
    [DataContract(Name = "PlanSummaries")]
    public partial class PlanSummaries : IEquatable<PlanSummaries>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PlanSummaries" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PlanSummaries() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PlanSummaries" /> class.
        /// </summary>
        /// <param name="summaries">summaries (required).</param>
        public PlanSummaries(List<PlanSummary> summaries = default(List<PlanSummary>))
        {
            // to ensure "summaries" is required (not null)
            if (summaries == null) {
                throw new ArgumentNullException("summaries is a required property for PlanSummaries and cannot be null");
            }
            this.Summaries = summaries;
        }

        /// <summary>
        /// Gets or Sets Summaries
        /// </summary>
        [DataMember(Name = "summaries", IsRequired = true, EmitDefaultValue = false)]
        public List<PlanSummary> Summaries { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PlanSummaries {\n");
            sb.Append("  Summaries: ").Append(Summaries).Append("\n");
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
            return this.Equals(input as PlanSummaries);
        }

        /// <summary>
        /// Returns true if PlanSummaries instances are equal
        /// </summary>
        /// <param name="input">Instance of PlanSummaries to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PlanSummaries input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Summaries == input.Summaries ||
                    this.Summaries != null &&
                    input.Summaries != null &&
                    this.Summaries.SequenceEqual(input.Summaries)
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
                if (this.Summaries != null)
                {
                    hashCode = (hashCode * 59) + this.Summaries.GetHashCode();
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
