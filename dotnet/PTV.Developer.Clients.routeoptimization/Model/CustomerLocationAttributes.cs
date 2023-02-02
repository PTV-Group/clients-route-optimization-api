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
    /// Attributes for a location of type CUSTOMER.
    /// </summary>
    [DataContract(Name = "CustomerLocationAttributes")]
    public partial class CustomerLocationAttributes : IEquatable<CustomerLocationAttributes>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets PositionInTrip
        /// </summary>
        [DataMember(Name = "positionInTrip", EmitDefaultValue = true)]
        public PositionInTrip? PositionInTrip { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CustomerLocationAttributes" /> class.
        /// </summary>
        /// <param name="serviceTimePerTransportStop">The service time [s] that is required each time this location is visited in order to pick goods up or to deliver them. The location-dependent service time represents, for example, the time to enter the premises or to register at a customer. Besides a location-dependent service time, the user may specify additional vehicle-dependent and transport-dependent service times at the vehicles and the transports respectively. (default to 0).</param>
        /// <param name="customerId">ID of the customer that can be set to link several customer locations with different opening intervals. Customer locations with the same customer ID may only differ in the location ID and in the opening intervals. If successive stops at customer locations share the same customer ID, the service time per transport stop of the location and of the vehicle are only considered at the first stop of the sequence..</param>
        /// <param name="positionInTrip">positionInTrip.</param>
        /// <param name="tripSectionNumber">If tripSectionNumber is specified, a stop at this customer location will be visited after stops (within the same trip) at customer locations with specified lower tripSectionNumber and before stops (within the same trip) at customer locations with specified higher tripSectionNumber. Consequently, the trip section numbers of stops at customer locations must be non-decreasing within each trip.   If specified, positionInTrip must not be set for the same location.  See [here](./concepts/trip-sections-and-position-trips) for more information..</param>
        public CustomerLocationAttributes(int serviceTimePerTransportStop = 0, string customerId = default(string), PositionInTrip? positionInTrip = default(PositionInTrip?), int? tripSectionNumber = default(int?))
        {
            this.ServiceTimePerTransportStop = serviceTimePerTransportStop;
            this.CustomerId = customerId;
            this.PositionInTrip = positionInTrip;
            this.TripSectionNumber = tripSectionNumber;
        }

        /// <summary>
        /// The service time [s] that is required each time this location is visited in order to pick goods up or to deliver them. The location-dependent service time represents, for example, the time to enter the premises or to register at a customer. Besides a location-dependent service time, the user may specify additional vehicle-dependent and transport-dependent service times at the vehicles and the transports respectively.
        /// </summary>
        /// <value>The service time [s] that is required each time this location is visited in order to pick goods up or to deliver them. The location-dependent service time represents, for example, the time to enter the premises or to register at a customer. Besides a location-dependent service time, the user may specify additional vehicle-dependent and transport-dependent service times at the vehicles and the transports respectively.</value>
        [DataMember(Name = "serviceTimePerTransportStop", EmitDefaultValue = false)]
        public int ServiceTimePerTransportStop { get; set; }

        /// <summary>
        /// ID of the customer that can be set to link several customer locations with different opening intervals. Customer locations with the same customer ID may only differ in the location ID and in the opening intervals. If successive stops at customer locations share the same customer ID, the service time per transport stop of the location and of the vehicle are only considered at the first stop of the sequence.
        /// </summary>
        /// <value>ID of the customer that can be set to link several customer locations with different opening intervals. Customer locations with the same customer ID may only differ in the location ID and in the opening intervals. If successive stops at customer locations share the same customer ID, the service time per transport stop of the location and of the vehicle are only considered at the first stop of the sequence.</value>
        [DataMember(Name = "customerId", EmitDefaultValue = false)]
        public string CustomerId { get; set; }

        /// <summary>
        /// If tripSectionNumber is specified, a stop at this customer location will be visited after stops (within the same trip) at customer locations with specified lower tripSectionNumber and before stops (within the same trip) at customer locations with specified higher tripSectionNumber. Consequently, the trip section numbers of stops at customer locations must be non-decreasing within each trip.   If specified, positionInTrip must not be set for the same location.  See [here](./concepts/trip-sections-and-position-trips) for more information.
        /// </summary>
        /// <value>If tripSectionNumber is specified, a stop at this customer location will be visited after stops (within the same trip) at customer locations with specified lower tripSectionNumber and before stops (within the same trip) at customer locations with specified higher tripSectionNumber. Consequently, the trip section numbers of stops at customer locations must be non-decreasing within each trip.   If specified, positionInTrip must not be set for the same location.  See [here](./concepts/trip-sections-and-position-trips) for more information.</value>
        [DataMember(Name = "tripSectionNumber", EmitDefaultValue = true)]
        public int? TripSectionNumber { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CustomerLocationAttributes {\n");
            sb.Append("  ServiceTimePerTransportStop: ").Append(ServiceTimePerTransportStop).Append("\n");
            sb.Append("  CustomerId: ").Append(CustomerId).Append("\n");
            sb.Append("  PositionInTrip: ").Append(PositionInTrip).Append("\n");
            sb.Append("  TripSectionNumber: ").Append(TripSectionNumber).Append("\n");
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
            return this.Equals(input as CustomerLocationAttributes);
        }

        /// <summary>
        /// Returns true if CustomerLocationAttributes instances are equal
        /// </summary>
        /// <param name="input">Instance of CustomerLocationAttributes to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CustomerLocationAttributes input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ServiceTimePerTransportStop == input.ServiceTimePerTransportStop ||
                    this.ServiceTimePerTransportStop.Equals(input.ServiceTimePerTransportStop)
                ) && 
                (
                    this.CustomerId == input.CustomerId ||
                    (this.CustomerId != null &&
                    this.CustomerId.Equals(input.CustomerId))
                ) && 
                (
                    this.PositionInTrip == input.PositionInTrip ||
                    this.PositionInTrip.Equals(input.PositionInTrip)
                ) && 
                (
                    this.TripSectionNumber == input.TripSectionNumber ||
                    (this.TripSectionNumber != null &&
                    this.TripSectionNumber.Equals(input.TripSectionNumber))
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
                hashCode = (hashCode * 59) + this.ServiceTimePerTransportStop.GetHashCode();
                if (this.CustomerId != null)
                {
                    hashCode = (hashCode * 59) + this.CustomerId.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.PositionInTrip.GetHashCode();
                if (this.TripSectionNumber != null)
                {
                    hashCode = (hashCode * 59) + this.TripSectionNumber.GetHashCode();
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
            // ServiceTimePerTransportStop (int) minimum
            if (this.ServiceTimePerTransportStop < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for ServiceTimePerTransportStop, must be a value greater than or equal to 0.", new [] { "ServiceTimePerTransportStop" });
            }

            // CustomerId (string) pattern
            Regex regexCustomerId = new Regex(@".*[^ ].*", RegexOptions.CultureInvariant);
            if (false == regexCustomerId.Match(this.CustomerId).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for CustomerId, must match a pattern of " + regexCustomerId, new [] { "CustomerId" });
            }

            // TripSectionNumber (int?) minimum
            if (this.TripSectionNumber < (int?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TripSectionNumber, must be a value greater than or equal to 1.", new [] { "TripSectionNumber" });
            }

            yield break;
        }
    }

}
