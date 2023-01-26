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
    /// Defines the accumulated driving, working and travel times since the last break or daily rest.  See [here](./Concepts/Drivers%20Working%20Hours.htm) for more information.
    /// </summary>
    [DataContract(Name = "WorkLogbook")]
    public partial class WorkLogbook : IEquatable<WorkLogbook>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="WorkLogbook" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected WorkLogbook() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="WorkLogbook" /> class.
        /// </summary>
        /// <param name="lastTimeTheDriverWorked">The last time the driver worked formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00. The date must provide an offset to UTC. (required).</param>
        /// <param name="accumulatedDrivingTimeSinceLastBreak">Accumulated driving time since end of last break [s], this includes all time behind the wheel. Values higher than **maximumDrivingTimeBetweenBreaks** are capped and effectively equal to the value given by **maximumDrivingTimeBetweenBreaks**.  (default to 0).</param>
        /// <param name="accumulatedWorkingTimeSinceLastBreak">Accumulated working time since end of last break [s], this includes driving time, service time at depot and customers, and idle time if lower than working time threshold. Values higher than **maximumWorkingTimeBetweenBreaks** are capped and effectively equal to the value given by **maximumWorkingTimeBetweenBreaks**. May not be smaller than **accumulatedDrivingTimeSinceLastBreak** if the value is specified. If no other value is specified, the default value is 0..</param>
        /// <param name="accumulatedDrivingTimeSinceLastDailyRest">Accumulated driving time since end of last daily rest [s], this includes all time behind the wheel. Values higher than **maximumDrivingTimeBetweenDailyRests** are capped and effectively equal to the value given by **maximumDrivingTimeBetweenDailyRests**. May not be smaller than **accumulatedDrivingTimeSinceLastBreak** if the value is specified. If no other value is specified, the default value is 0..</param>
        /// <param name="accumulatedTravelTimeSinceLastDailyRest">Accumulated travel time since end of last daily rest [s], this includes all time since the last daily rest. Values higher than **maximumTravelTimeBetweenDailyRests** are capped and effectively equal to the value given by **maximumTravelTimeBetweenDailyRests**. May not be smaller than **accumulatedWorkingTimeSinceLastBreak** or **accumulatedDrivingTimeSinceLastDailyRest** if the values are specified. If no other value is specified, the default value is 0..</param>
        public WorkLogbook(DateTimeOffset lastTimeTheDriverWorked = default(DateTimeOffset), int accumulatedDrivingTimeSinceLastBreak = 0, int? accumulatedWorkingTimeSinceLastBreak = default(int?), int? accumulatedDrivingTimeSinceLastDailyRest = default(int?), int? accumulatedTravelTimeSinceLastDailyRest = default(int?))
        {
            this.LastTimeTheDriverWorked = lastTimeTheDriverWorked;
            this.AccumulatedDrivingTimeSinceLastBreak = accumulatedDrivingTimeSinceLastBreak;
            this.AccumulatedWorkingTimeSinceLastBreak = accumulatedWorkingTimeSinceLastBreak;
            this.AccumulatedDrivingTimeSinceLastDailyRest = accumulatedDrivingTimeSinceLastDailyRest;
            this.AccumulatedTravelTimeSinceLastDailyRest = accumulatedTravelTimeSinceLastDailyRest;
        }

        /// <summary>
        /// The last time the driver worked formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00. The date must provide an offset to UTC.
        /// </summary>
        /// <value>The last time the driver worked formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00. The date must provide an offset to UTC.</value>
        [DataMember(Name = "lastTimeTheDriverWorked", IsRequired = true, EmitDefaultValue = false)]
        public DateTimeOffset LastTimeTheDriverWorked { get; set; }

        /// <summary>
        /// Accumulated driving time since end of last break [s], this includes all time behind the wheel. Values higher than **maximumDrivingTimeBetweenBreaks** are capped and effectively equal to the value given by **maximumDrivingTimeBetweenBreaks**. 
        /// </summary>
        /// <value>Accumulated driving time since end of last break [s], this includes all time behind the wheel. Values higher than **maximumDrivingTimeBetweenBreaks** are capped and effectively equal to the value given by **maximumDrivingTimeBetweenBreaks**. </value>
        [DataMember(Name = "accumulatedDrivingTimeSinceLastBreak", EmitDefaultValue = false)]
        public int AccumulatedDrivingTimeSinceLastBreak { get; set; }

        /// <summary>
        /// Accumulated working time since end of last break [s], this includes driving time, service time at depot and customers, and idle time if lower than working time threshold. Values higher than **maximumWorkingTimeBetweenBreaks** are capped and effectively equal to the value given by **maximumWorkingTimeBetweenBreaks**. May not be smaller than **accumulatedDrivingTimeSinceLastBreak** if the value is specified. If no other value is specified, the default value is 0.
        /// </summary>
        /// <value>Accumulated working time since end of last break [s], this includes driving time, service time at depot and customers, and idle time if lower than working time threshold. Values higher than **maximumWorkingTimeBetweenBreaks** are capped and effectively equal to the value given by **maximumWorkingTimeBetweenBreaks**. May not be smaller than **accumulatedDrivingTimeSinceLastBreak** if the value is specified. If no other value is specified, the default value is 0.</value>
        [DataMember(Name = "accumulatedWorkingTimeSinceLastBreak", EmitDefaultValue = true)]
        public int? AccumulatedWorkingTimeSinceLastBreak { get; set; }

        /// <summary>
        /// Accumulated driving time since end of last daily rest [s], this includes all time behind the wheel. Values higher than **maximumDrivingTimeBetweenDailyRests** are capped and effectively equal to the value given by **maximumDrivingTimeBetweenDailyRests**. May not be smaller than **accumulatedDrivingTimeSinceLastBreak** if the value is specified. If no other value is specified, the default value is 0.
        /// </summary>
        /// <value>Accumulated driving time since end of last daily rest [s], this includes all time behind the wheel. Values higher than **maximumDrivingTimeBetweenDailyRests** are capped and effectively equal to the value given by **maximumDrivingTimeBetweenDailyRests**. May not be smaller than **accumulatedDrivingTimeSinceLastBreak** if the value is specified. If no other value is specified, the default value is 0.</value>
        [DataMember(Name = "accumulatedDrivingTimeSinceLastDailyRest", EmitDefaultValue = true)]
        public int? AccumulatedDrivingTimeSinceLastDailyRest { get; set; }

        /// <summary>
        /// Accumulated travel time since end of last daily rest [s], this includes all time since the last daily rest. Values higher than **maximumTravelTimeBetweenDailyRests** are capped and effectively equal to the value given by **maximumTravelTimeBetweenDailyRests**. May not be smaller than **accumulatedWorkingTimeSinceLastBreak** or **accumulatedDrivingTimeSinceLastDailyRest** if the values are specified. If no other value is specified, the default value is 0.
        /// </summary>
        /// <value>Accumulated travel time since end of last daily rest [s], this includes all time since the last daily rest. Values higher than **maximumTravelTimeBetweenDailyRests** are capped and effectively equal to the value given by **maximumTravelTimeBetweenDailyRests**. May not be smaller than **accumulatedWorkingTimeSinceLastBreak** or **accumulatedDrivingTimeSinceLastDailyRest** if the values are specified. If no other value is specified, the default value is 0.</value>
        [DataMember(Name = "accumulatedTravelTimeSinceLastDailyRest", EmitDefaultValue = true)]
        public int? AccumulatedTravelTimeSinceLastDailyRest { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class WorkLogbook {\n");
            sb.Append("  LastTimeTheDriverWorked: ").Append(LastTimeTheDriverWorked).Append("\n");
            sb.Append("  AccumulatedDrivingTimeSinceLastBreak: ").Append(AccumulatedDrivingTimeSinceLastBreak).Append("\n");
            sb.Append("  AccumulatedWorkingTimeSinceLastBreak: ").Append(AccumulatedWorkingTimeSinceLastBreak).Append("\n");
            sb.Append("  AccumulatedDrivingTimeSinceLastDailyRest: ").Append(AccumulatedDrivingTimeSinceLastDailyRest).Append("\n");
            sb.Append("  AccumulatedTravelTimeSinceLastDailyRest: ").Append(AccumulatedTravelTimeSinceLastDailyRest).Append("\n");
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
            return this.Equals(input as WorkLogbook);
        }

        /// <summary>
        /// Returns true if WorkLogbook instances are equal
        /// </summary>
        /// <param name="input">Instance of WorkLogbook to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WorkLogbook input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.LastTimeTheDriverWorked == input.LastTimeTheDriverWorked ||
                    (this.LastTimeTheDriverWorked != null &&
                    this.LastTimeTheDriverWorked.Equals(input.LastTimeTheDriverWorked))
                ) && 
                (
                    this.AccumulatedDrivingTimeSinceLastBreak == input.AccumulatedDrivingTimeSinceLastBreak ||
                    this.AccumulatedDrivingTimeSinceLastBreak.Equals(input.AccumulatedDrivingTimeSinceLastBreak)
                ) && 
                (
                    this.AccumulatedWorkingTimeSinceLastBreak == input.AccumulatedWorkingTimeSinceLastBreak ||
                    (this.AccumulatedWorkingTimeSinceLastBreak != null &&
                    this.AccumulatedWorkingTimeSinceLastBreak.Equals(input.AccumulatedWorkingTimeSinceLastBreak))
                ) && 
                (
                    this.AccumulatedDrivingTimeSinceLastDailyRest == input.AccumulatedDrivingTimeSinceLastDailyRest ||
                    (this.AccumulatedDrivingTimeSinceLastDailyRest != null &&
                    this.AccumulatedDrivingTimeSinceLastDailyRest.Equals(input.AccumulatedDrivingTimeSinceLastDailyRest))
                ) && 
                (
                    this.AccumulatedTravelTimeSinceLastDailyRest == input.AccumulatedTravelTimeSinceLastDailyRest ||
                    (this.AccumulatedTravelTimeSinceLastDailyRest != null &&
                    this.AccumulatedTravelTimeSinceLastDailyRest.Equals(input.AccumulatedTravelTimeSinceLastDailyRest))
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
                if (this.LastTimeTheDriverWorked != null)
                {
                    hashCode = (hashCode * 59) + this.LastTimeTheDriverWorked.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.AccumulatedDrivingTimeSinceLastBreak.GetHashCode();
                if (this.AccumulatedWorkingTimeSinceLastBreak != null)
                {
                    hashCode = (hashCode * 59) + this.AccumulatedWorkingTimeSinceLastBreak.GetHashCode();
                }
                if (this.AccumulatedDrivingTimeSinceLastDailyRest != null)
                {
                    hashCode = (hashCode * 59) + this.AccumulatedDrivingTimeSinceLastDailyRest.GetHashCode();
                }
                if (this.AccumulatedTravelTimeSinceLastDailyRest != null)
                {
                    hashCode = (hashCode * 59) + this.AccumulatedTravelTimeSinceLastDailyRest.GetHashCode();
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
            // AccumulatedDrivingTimeSinceLastBreak (int) minimum
            if (this.AccumulatedDrivingTimeSinceLastBreak < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for AccumulatedDrivingTimeSinceLastBreak, must be a value greater than or equal to 0.", new [] { "AccumulatedDrivingTimeSinceLastBreak" });
            }

            // AccumulatedWorkingTimeSinceLastBreak (int?) minimum
            if (this.AccumulatedWorkingTimeSinceLastBreak < (int?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for AccumulatedWorkingTimeSinceLastBreak, must be a value greater than or equal to 0.", new [] { "AccumulatedWorkingTimeSinceLastBreak" });
            }

            // AccumulatedDrivingTimeSinceLastDailyRest (int?) minimum
            if (this.AccumulatedDrivingTimeSinceLastDailyRest < (int?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for AccumulatedDrivingTimeSinceLastDailyRest, must be a value greater than or equal to 0.", new [] { "AccumulatedDrivingTimeSinceLastDailyRest" });
            }

            // AccumulatedTravelTimeSinceLastDailyRest (int?) minimum
            if (this.AccumulatedTravelTimeSinceLastDailyRest < (int?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for AccumulatedTravelTimeSinceLastDailyRest, must be a value greater than or equal to 0.", new [] { "AccumulatedTravelTimeSinceLastDailyRest" });
            }

            yield break;
        }
    }

}