# Clients for the Route Optimization API (Version 1.7.1)

Using client classes makes it easier and more convenient to integrate the API into an existing programming environment. We provide here clients for Java, C# and TypeScript. Alternatively you can generate the clients yourself by using this [tutorial](https://developer.myptv.com/en/resources/tutorials/general/how-generate-clients-ptv-developer-apis).


Language depending information:
* **DotNet:** Please add the following nuget packages to your client project
  * JsonSubTypes (1.8.0)
  * Polly (7.2.3)
  * RestSharp (106.13.0)
  * System.ComponentModel.Annotations (5.0.0)
  
  To initialize your client with your APIKey you can use the following snippet:
    ```
     var apiKey = new Dictionary<string, string>(){["apiKey"] = "Enter your ApiKey here" };
     var configuration = new Configuration() { ApiKey = apiKey };
     RoutingApi routingApi = new RoutingApi(configuration);
    ```

* **Java:** Please add the following dependencies to your project
  ```   <dependencies>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-core</artifactId>
            <version>2.10.4</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-annotations</artifactId>
            <version>2.10.4</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.10.4</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.datatype</groupId>
            <artifactId>jackson-datatype-jsr310</artifactId>
            <version>2.10.4</version>
        </dependency>
        <dependency>
            <groupId>org.openapitools</groupId>
            <artifactId>jackson-databind-nullable</artifactId>
            <version>0.2.1</version>
        </dependency>
        <dependency>
            <groupId>com.github.ptv-logistics</groupId>
            <artifactId>openapi-generator-cli</artifactId>
            <version>6.2.1</version>
        </dependency>
        <dependency>
            <groupId>javax.ws.rs</groupId>
            <artifactId>javax.ws.rs-api</artifactId>
            <version>2.1.1</version>
        </dependency>
  ```       
    To initialize your client with your APIKey you can use the following snippet:
   ```
     var apiClient = Configuration.getDefaultApiClient()
                .setRequestInterceptor(builder -> builder.setHeader("ApiKey", "Enter your ApiKey here"));
   ```


* **TypeScript:** Please add the following dependecies to your project
  * aurelia-api (3.2.1)
  * aurelia-fetch-client (1.8.2)
  * node-fetch (2.6.1)
  * polly-js (1.8.0)
  * typescript (4.1.2)"
  * typescript-http-client (0.10.1)
  
  
  To initialize your client with your APIKey you can use the following snippet:
    ```
    let configurationParameters: ConfigurationParameters = {headers: {ApiKey: "Enter your ApiKey here"}};
    let configuration: Configuration = new Configuration(configurationParameters);
    let routingApi: RoutingApi = new RoutingApi(configuration);
    ```

 &nbsp;  
 &nbsp;  
 Please refer to our [Route Optimization API](https://developer.myptv.com/en/documentation/route-optimization-api/quick-start-route-optimization-api) documentation. 
  
