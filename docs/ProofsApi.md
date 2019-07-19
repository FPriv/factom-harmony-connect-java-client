# ProofsApi

All URIs are relative to *https://ephemeral.api.factom.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAnchorbySearch**](ProofsApi.md#getAnchorbySearch) | **GET** /anchors/{object_id} | Get Object's Anchors
[**getReceiptsbyEntry**](ProofsApi.md#getReceiptsbyEntry) | **GET** /receipts/{entry_hash} | Get Entry's Receipts
[**getSearch**](ProofsApi.md#getSearch) | **GET** /search | Search


<a name="getAnchorbySearch"></a>
# **getAnchorbySearch**
> AnchorLong getAnchorbySearch(objectId)

Get Object's Anchors

Retreive the blockchain anchors of an entry, chain, or block. Returns an array of anchors that may be of type ethereum, bitcoin, or factom. The valid identifiers for the objects that can be anchored are as follows:  * Entry - Entry Hash * Chain - Chain ID * Directory Block - Height or Key Merkle Root * Entry Block - Key Merkle Root * Factoid Block - Key Merkle Root

### Example
```java
// Import classes:
//import harmony_connect_client.ApiClient;
//import harmony_connect_client.ApiException;
//import harmony_connect_client.Configuration;
//import harmony_connect_client.auth.*;
//import harmony_connect_client.api.ProofsApi;

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

ProofsApi apiInstance = new ProofsApi();
String objectId = "objectId_example"; // String | Object identifier.  Used to identify an entry, chain, or block that has been published on the Factom blockchain. These objects can be identified by their hash, ID, height, or key Merkle root.
try {
    AnchorLong result = apiInstance.getAnchorbySearch(objectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProofsApi#getAnchorbySearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectId** | **String**| Object identifier.  Used to identify an entry, chain, or block that has been published on the Factom blockchain. These objects can be identified by their hash, ID, height, or key Merkle root. |

### Return type

[**AnchorLong**](AnchorLong.md)

### Authorization

[AppId](../README.md#AppId), [AppKey](../README.md#AppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReceiptsbyEntry"></a>
# **getReceiptsbyEntry**
> ReceiptLong getReceiptsbyEntry(entryHash)

Get Entry's Receipts

Retrieve a receipt providing cryptographically verifiable proof that information was recorded in the Factom blockchain.

### Example
```java
// Import classes:
//import harmony_connect_client.ApiClient;
//import harmony_connect_client.ApiException;
//import harmony_connect_client.Configuration;
//import harmony_connect_client.auth.*;
//import harmony_connect_client.api.ProofsApi;

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

ProofsApi apiInstance = new ProofsApi();
String entryHash = db; // String | The unique identitfier of the entry.
try {
    ReceiptLong result = apiInstance.getReceiptsbyEntry(entryHash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProofsApi#getReceiptsbyEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entryHash** | **String**| The unique identitfier of the entry. |

### Return type

[**ReceiptLong**](ReceiptLong.md)

### Authorization

[AppId](../README.md#AppId), [AppKey](../README.md#AppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSearch"></a>
# **getSearch**
> InlineResponse200 getSearch(term, allowedStages)

Search

Search for something on the Factom blockchain. You may search for Directory Blocks (by height or key Merkle root), Entry Blocks (by key Merkle root), Factoid Blocks (by key Merkle root), Chains (by Chain ID), Entries (by Entry Hash), Addresses (by user address or address), and Transactions (by transaction ID).

### Example
```java
// Import classes:
//import harmony_connect_client.ApiClient;
//import harmony_connect_client.ApiException;
//import harmony_connect_client.Configuration;
//import harmony_connect_client.auth.*;
//import harmony_connect_client.api.ProofsApi;

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

ProofsApi apiInstance = new ProofsApi();
String term = "term_example"; // String | The term that you are searching for. You may search for Directory Blocks (by height or key Merkle root), Entry Blocks (by key Merkle root), Factoid Blocks (by key Merkle root), Chains (by Chain ID), Entries (by Entry Hash), Addresses (by user address or address), and Transactions (by transaction ID).
String allowedStages = "allowedStages_example"; // String | When entered, filters chain and entry responses by immutability stage. Must be either `replicated`, `factom`, or `anchored`.
try {
    InlineResponse200 result = apiInstance.getSearch(term, allowedStages);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProofsApi#getSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **String**| The term that you are searching for. You may search for Directory Blocks (by height or key Merkle root), Entry Blocks (by key Merkle root), Factoid Blocks (by key Merkle root), Chains (by Chain ID), Entries (by Entry Hash), Addresses (by user address or address), and Transactions (by transaction ID). | [optional]
 **allowedStages** | **String**| When entered, filters chain and entry responses by immutability stage. Must be either &#x60;replicated&#x60;, &#x60;factom&#x60;, or &#x60;anchored&#x60;. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[AppId](../README.md#AppId), [AppKey](../README.md#AppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

