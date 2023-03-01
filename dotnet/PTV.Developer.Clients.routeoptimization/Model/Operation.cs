/*
 * Route Optimization
 *
 * With the Route Optimization service you can schedule and optimize the routes of your fleet.
 *
 * The version of the OpenAPI document: 1.9
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
    /// Information about an operation.
    /// </summary>
    [DataContract(Name = "Operation")]
    public partial class Operation : IEquatable<Operation>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = false)]
        public OperationStatus Status { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Operation" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Operation() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Operation" /> class.
        /// </summary>
        /// <param name="name">The name of the operation, possible values: \&quot;optimization\&quot;, \&quot;evaluation\&quot;. (required).</param>
        /// <param name="status">status (required).</param>
        /// <param name="startTime">The start time of the operation formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339), by means the client can decide to delete the operation. The value is always returned in UTC time. (required).</param>
        /// <param name="elapsedTime">The elapsed time of the operation [s], by means the client can decide to delete the operation. It represents the duration from the start time until now when the operation is still active or from the start time until the end of operation when this operation is already completed. (required).</param>
        /// <param name="error">error.</param>
        public Operation(string name = default(string), OperationStatus status = default(OperationStatus), DateTimeOffset startTime = default(DateTimeOffset), int elapsedTime = default(int), ErrorResponse error = default(ErrorResponse))
        {
            // to ensure "name" is required (not null)
            if (name == null) {
                throw new ArgumentNullException("name is a required property for Operation and cannot be null");
            }
            this.Name = name;
            this.Status = status;
            this.StartTime = startTime;
            this.ElapsedTime = elapsedTime;
            this.Error = error;
        }

        /// <summary>
        /// The name of the operation, possible values: \&quot;optimization\&quot;, \&quot;evaluation\&quot;.
        /// </summary>
        /// <value>The name of the operation, possible values: \&quot;optimization\&quot;, \&quot;evaluation\&quot;.</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// The start time of the operation formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339), by means the client can decide to delete the operation. The value is always returned in UTC time.
        /// </summary>
        /// <value>The start time of the operation formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339), by means the client can decide to delete the operation. The value is always returned in UTC time.</value>
        [DataMember(Name = "startTime", IsRequired = true, EmitDefaultValue = false)]
        public DateTimeOffset StartTime { get; set; }

        /// <summary>
        /// The elapsed time of the operation [s], by means the client can decide to delete the operation. It represents the duration from the start time until now when the operation is still active or from the start time until the end of operation when this operation is already completed.
        /// </summary>
        /// <value>The elapsed time of the operation [s], by means the client can decide to delete the operation. It represents the duration from the start time until now when the operation is still active or from the start time until the end of operation when this operation is already completed.</value>
        [DataMember(Name = "elapsedTime", IsRequired = true, EmitDefaultValue = false)]
        public int ElapsedTime { get; set; }

        /// <summary>
        /// Gets or Sets Error
        /// </summary>
        [DataMember(Name = "error", EmitDefaultValue = false)]
        public ErrorResponse Error { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Operation {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  StartTime: ").Append(StartTime).Append("\n");
            sb.Append("  ElapsedTime: ").Append(ElapsedTime).Append("\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
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
            return this.Equals(input as Operation);
        }

        /// <summary>
        /// Returns true if Operation instances are equal
        /// </summary>
        /// <param name="input">Instance of Operation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Operation input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Status == input.Status ||
                    this.Status.Equals(input.Status)
                ) && 
                (
                    this.StartTime == input.StartTime ||
                    (this.StartTime != null &&
                    this.StartTime.Equals(input.StartTime))
                ) && 
                (
                    this.ElapsedTime == input.ElapsedTime ||
                    this.ElapsedTime.Equals(input.ElapsedTime)
                ) && 
                (
                    this.Error == input.Error ||
                    (this.Error != null &&
                    this.Error.Equals(input.Error))
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Status.GetHashCode();
                if (this.StartTime != null)
                {
                    hashCode = (hashCode * 59) + this.StartTime.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.ElapsedTime.GetHashCode();
                if (this.Error != null)
                {
                    hashCode = (hashCode * 59) + this.Error.GetHashCode();
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
