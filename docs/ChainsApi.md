# ChainsApi

All URIs are relative to *https://connect-shared-sandbox-2445582615332.production.gw.apicast.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getChainByID**](ChainsApi.md#getChainByID) | **GET** /chains/{chain_id} | Get Chain Info
[**getChains**](ChainsApi.md#getChains) | **GET** /chains | Get All Chains
[**postChain**](ChainsApi.md#postChain) | **POST** /chains | Create a Chain
[**postChainSearch**](ChainsApi.md#postChainSearch) | **POST** /chains/search | Search Chains


<a name="getChainByID"></a>
# **getChainByID**
> Chain getChainByID(chainId)

Get Chain Info

Get information about a specific chain on Connect

### Example
```java
// Import classes:
//import harmony_connect_client.ApiClient;
//import harmony_connect_client.ApiException;
//import harmony_connect_client.Configuration;
//import harmony_connect_client.auth.*;
//import harmony_connect_client.api.ChainsApi;

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

ChainsApi apiInstance = new ChainsApi();
String chainId = 285904; // String | Chain identifier
try {
    Chain result = apiInstance.getChainByID(chainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainsApi#getChainByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| Chain identifier |

### Return type

[**Chain**](Chain.md)

### Authorization

[AppId](../README.md#AppId), [AppKey](../README.md#AppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getChains"></a>
# **getChains**
> ChainList getChains(limit, offset, stages)

Get All Chains

Returns all of the chains on factomd.

### Example
```java
// Import classes:
//import harmony_connect_client.ApiClient;
//import harmony_connect_client.ApiException;
//import harmony_connect_client.Configuration;
//import harmony_connect_client.auth.*;
//import harmony_connect_client.api.ChainsApi;

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

ChainsApi apiInstance = new ChainsApi();
Integer limit = 15; // Integer | The number of items you would like back in each page.
Integer offset = 2; // Integer | The offset parameter allows you to select which item you would like to start from when you get back a list from Connect. For example, if you've already seen the first 15 items and you'd like the next set, you would send an offset of 15. `offset=0` starts from the first item of the set and is the default position.
String stages = "stages_example"; // String | The immutability stages you want to restrict results to. You can choose any from `replicated`, `factom`, and `anchored`. If you would like to search among multiple stages, send them in a comma separated string. For example: `'replicated,factom'`.
try {
    ChainList result = apiInstance.getChains(limit, offset, stages);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainsApi#getChains");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The number of items you would like back in each page. | [optional]
 **offset** | **Integer**| The offset parameter allows you to select which item you would like to start from when you get back a list from Connect. For example, if you&#39;ve already seen the first 15 items and you&#39;d like the next set, you would send an offset of 15. &#x60;offset&#x3D;0&#x60; starts from the first item of the set and is the default position. | [optional]
 **stages** | **String**| The immutability stages you want to restrict results to. You can choose any from &#x60;replicated&#x60;, &#x60;factom&#x60;, and &#x60;anchored&#x60;. If you would like to search among multiple stages, send them in a comma separated string. For example: &#x60;&#39;replicated,factom&#39;&#x60;. | [optional]

### Return type

[**ChainList**](ChainList.md)

### Authorization

[AppId](../README.md#AppId), [AppKey](../README.md#AppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postChain"></a>
# **postChain**
> ChainShort postChain(chainCreate)

Create a Chain

Create a new chain. Each chain functions as a mini-blockchain such that all of the entries are linked. Every entry relies on data from previous entries in the chain. Any unauthorized alterations to any of these entries can be detected. Be aware that data entered into the &#x60;content&#x60; and &#x60;external_ids&#x60; fields must be in Base64 format. Sending this request will cause Connect to create the first entry of the chain. The data entered into the &#x60;content&#x60; and &#x60;external_id&#x60; fields will be applied to this entry.

### Example
```java
// Import classes:
//import harmony_connect_client.ApiClient;
//import harmony_connect_client.ApiException;
//import harmony_connect_client.Configuration;
//import harmony_connect_client.auth.*;
//import harmony_connect_client.api.ChainsApi;

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

ChainsApi apiInstance = new ChainsApi();
ChainCreate chainCreate = new ChainCreate(); // ChainCreate | 
try {
    ChainShort result = apiInstance.postChain(chainCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainsApi#postChain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainCreate** | [**ChainCreate**](ChainCreate.md)|  |

### Return type

[**ChainShort**](ChainShort.md)

### Authorization

[AppId](../README.md#AppId), [AppKey](../README.md#AppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postChainSearch"></a>
# **postChainSearch**
> ChainList postChainSearch(searchBody, limit, offset)

Search Chains

Finds all of the chains with &#x60;external_ids&#x60; that match what you&#39;ve entered. External IDs must be sent in Base64 format.

### Example
```java
// Import classes:
//import harmony_connect_client.ApiClient;
//import harmony_connect_client.ApiException;
//import harmony_connect_client.Configuration;
//import harmony_connect_client.auth.*;
//import harmony_connect_client.api.ChainsApi;

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

ChainsApi apiInstance = new ChainsApi();
SearchBody searchBody = new SearchBody(); // SearchBody | 
Integer limit = 15; // Integer | The number of items you would like back in each page.
Integer offset = 2; // Integer | The offset parameter allows you to select which item you would like to start from when you get back a list from Connect. For example, if you've already seen the first 15 items and you'd like the next set, you would send an offset of 15. `offset=0` starts from the first item of the set and is the default position.
try {
    ChainList result = apiInstance.postChainSearch(searchBody, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainsApi#postChainSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchBody** | [**SearchBody**](SearchBody.md)|  |
 **limit** | **Integer**| The number of items you would like back in each page. | [optional]
 **offset** | **Integer**| The offset parameter allows you to select which item you would like to start from when you get back a list from Connect. For example, if you&#39;ve already seen the first 15 items and you&#39;d like the next set, you would send an offset of 15. &#x60;offset&#x3D;0&#x60; starts from the first item of the set and is the default position. | [optional]

### Return type

[**ChainList**](ChainList.md)

### Authorization

[AppId](../README.md#AppId), [AppKey](../README.md#AppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

