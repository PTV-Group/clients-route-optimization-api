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
    /// A stop report contains a summary of the values of the events at a stop, including the arrival time, the departure time and the service time. It also contains information about the loaded quantities when leaving the current stop.
    /// </summary>
    [DataContract(Name = "StopReport")]
    public partial class StopReport : IEquatable<StopReport>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="StopReport" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected StopReport() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="StopReport" /> class.
        /// </summary>
        /// <param name="arrivalTime">The planned time of arrival at the stop formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). (required).</param>
        /// <param name="departureTime">The planned time of departure from the stop formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). (required).</param>
        /// <param name="serviceTime">The service time at the stop [s]. (required).</param>
        /// <param name="waitingTime">The waiting time at the stop [s]. (required).</param>
        /// <param name="breakTime">The break time at the stop [s]. (required).</param>
        /// <param name="restTime">The rest time at the stop [s]. (required).</param>
        /// <param name="quantities">The quantities loaded on the vehicle when leaving the stop..</param>
        /// <param name="alternativeCapacitiesIndex">This field is only returned if the vehicle cannot transport the **quantities** loaded on the vehicle when leaving the stop with the given **capacities**. In this case this field contains the index of the chosen **alternativeCapacities**. If the route has at least one &#x60;VEHICLE_CAPACITY&#x60; violation this field will not be set.  See [here](./concepts/capacities-and-alternative-capacities) for more information..</param>
        public StopReport(DateTimeOffset arrivalTime = default(DateTimeOffset), DateTimeOffset departureTime = default(DateTimeOffset), int serviceTime = default(int), int waitingTime = default(int), int breakTime = default(int), int restTime = default(int), List<int> quantities = default(List<int>), int? alternativeCapacitiesIndex = default(int?))
        {
            this.ArrivalTime = arrivalTime;
            this.DepartureTime = departureTime;
            this.ServiceTime = serviceTime;
            this.WaitingTime = waitingTime;
            this.BreakTime = breakTime;
            this.RestTime = restTime;
            this.Quantities = quantities;
            this.AlternativeCapacitiesIndex = alternativeCapacitiesIndex;
        }

        /// <summary>
        /// The planned time of arrival at the stop formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
        /// </summary>
        /// <value>The planned time of arrival at the stop formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).</value>
        [DataMember(Name = "arrivalTime", IsRequired = true, EmitDefaultValue = false)]
        public DateTimeOffset ArrivalTime { get; set; }

        /// <summary>
        /// The planned time of departure from the stop formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
        /// </summary>
        /// <value>The planned time of departure from the stop formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).</value>
        [DataMember(Name = "departureTime", IsRequired = true, EmitDefaultValue = false)]
        public DateTimeOffset DepartureTime { get; set; }

        /// <summary>
        /// The service time at the stop [s].
        /// </summary>
        /// <value>The service time at the stop [s].</value>
        [DataMember(Name = "serviceTime", IsRequired = true, EmitDefaultValue = false)]
        public int ServiceTime { get; set; }

        /// <summary>
        /// The waiting time at the stop [s].
        /// </summary>
        /// <value>The waiting time at the stop [s].</value>
        [DataMember(Name = "waitingTime", IsRequired = true, EmitDefaultValue = false)]
        public int WaitingTime { get; set; }

        /// <summary>
        /// The break time at the stop [s].
        /// </summary>
        /// <value>The break time at the stop [s].</value>
        [DataMember(Name = "breakTime", IsRequired = true, EmitDefaultValue = false)]
        public int BreakTime { get; set; }

        /// <summary>
        /// The rest time at the stop [s].
        /// </summary>
        /// <value>The rest time at the stop [s].</value>
        [DataMember(Name = "restTime", IsRequired = true, EmitDefaultValue = false)]
        public int RestTime { get; set; }

        /// <summary>
        /// The quantities loaded on the vehicle when leaving the stop.
        /// </summary>
        /// <value>The quantities loaded on the vehicle when leaving the stop.</value>
        [DataMember(Name = "quantities", EmitDefaultValue = false)]
        public List<int> Quantities { get; set; }

        /// <summary>
        /// This field is only returned if the vehicle cannot transport the **quantities** loaded on the vehicle when leaving the stop with the given **capacities**. In this case this field contains the index of the chosen **alternativeCapacities**. If the route has at least one &#x60;VEHICLE_CAPACITY&#x60; violation this field will not be set.  See [here](./concepts/capacities-and-alternative-capacities) for more information.
        /// </summary>
        /// <value>This field is only returned if the vehicle cannot transport the **quantities** loaded on the vehicle when leaving the stop with the given **capacities**. In this case this field contains the index of the chosen **alternativeCapacities**. If the route has at least one &#x60;VEHICLE_CAPACITY&#x60; violation this field will not be set.  See [here](./concepts/capacities-and-alternative-capacities) for more information.</value>
        [DataMember(Name = "alternativeCapacitiesIndex", EmitDefaultValue = true)]
        public int? AlternativeCapacitiesIndex { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class StopReport {\n");
            sb.Append("  ArrivalTime: ").Append(ArrivalTime).Append("\n");
            sb.Append("  DepartureTime: ").Append(DepartureTime).Append("\n");
            sb.Append("  ServiceTime: ").Append(ServiceTime).Append("\n");
            sb.Append("  WaitingTime: ").Append(WaitingTime).Append("\n");
            sb.Append("  BreakTime: ").Append(BreakTime).Append("\n");
            sb.Append("  RestTime: ").Append(RestTime).Append("\n");
            sb.Append("  Quantities: ").Append(Quantities).Append("\n");
            sb.Append("  AlternativeCapacitiesIndex: ").Append(AlternativeCapacitiesIndex).Append("\n");
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
            return this.Equals(input as StopReport);
        }

        /// <summary>
        /// Returns true if StopReport instances are equal
        /// </summary>
        /// <param name="input">Instance of StopReport to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StopReport input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ArrivalTime == input.ArrivalTime ||
                    (this.ArrivalTime != null &&
                    this.ArrivalTime.Equals(input.ArrivalTime))
                ) && 
                (
                    this.DepartureTime == input.DepartureTime ||
                    (this.DepartureTime != null &&
                    this.DepartureTime.Equals(input.DepartureTime))
                ) && 
                (
                    this.ServiceTime == input.ServiceTime ||
                    this.ServiceTime.Equals(input.ServiceTime)
                ) && 
                (
                    this.WaitingTime == input.WaitingTime ||
                    this.WaitingTime.Equals(input.WaitingTime)
                ) && 
                (
                    this.BreakTime == input.BreakTime ||
                    this.BreakTime.Equals(input.BreakTime)
                ) && 
                (
                    this.RestTime == input.RestTime ||
                    this.RestTime.Equals(input.RestTime)
                ) && 
                (
                    this.Quantities == input.Quantities ||
                    this.Quantities != null &&
                    input.Quantities != null &&
                    this.Quantities.SequenceEqual(input.Quantities)
                ) && 
                (
                    this.AlternativeCapacitiesIndex == input.AlternativeCapacitiesIndex ||
                    (this.AlternativeCapacitiesIndex != null &&
                    this.AlternativeCapacitiesIndex.Equals(input.AlternativeCapacitiesIndex))
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
                if (this.ArrivalTime != null)
                {
                    hashCode = (hashCode * 59) + this.ArrivalTime.GetHashCode();
                }
                if (this.DepartureTime != null)
                {
                    hashCode = (hashCode * 59) + this.DepartureTime.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.ServiceTime.GetHashCode();
                hashCode = (hashCode * 59) + this.WaitingTime.GetHashCode();
                hashCode = (hashCode * 59) + this.BreakTime.GetHashCode();
                hashCode = (hashCode * 59) + this.RestTime.GetHashCode();
                if (this.Quantities != null)
                {
                    hashCode = (hashCode * 59) + this.Quantities.GetHashCode();
                }
                if (this.AlternativeCapacitiesIndex != null)
                {
                    hashCode = (hashCode * 59) + this.AlternativeCapacitiesIndex.GetHashCode();
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
