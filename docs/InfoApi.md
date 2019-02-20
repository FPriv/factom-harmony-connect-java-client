# InfoApi

All URIs are relative to *https://connect-shared-sandbox-2445582615332.production.gw.apicast.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApiInfo**](InfoApi.md#getApiInfo) | **GET** / | API Info


<a name="getApiInfo"></a>
# **getApiInfo**
> AllInfo getApiInfo()

API Info

Request general information about the Connect API such as the version and available endpoints.

### Example
```java
// Import classes:
//import harmony_connect_client.ApiClient;
//import harmony_connect_client.ApiException;
//import harmony_connect_client.Configuration;
//import harmony_connect_client.auth.*;
//import harmony_connect_client.api.InfoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AppId
ApiKeyAuth AppId = (ApiKeyAuth) defaultClient.getAuthentication("AppId");
AppId.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AppId.setApiKeyPrefix("Token");

// Configure API key authorization: AppKey
ApiKeyAuth AppKey = (ApiKeyAuth) defaultClient.getAuthentication("AppKey");
AppKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AppKey.setApiKeyPrefix("Token");

InfoApi apiInstance = new InfoApi();
try {
    AllInfo result = apiInstance.getApiInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InfoApi#getApiInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AllInfo**](AllInfo.md)

### Authorization

[AppId](../README.md#AppId), [AppKey](../README.md#AppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

