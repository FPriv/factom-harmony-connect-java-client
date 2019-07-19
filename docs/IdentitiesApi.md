# IdentitiesApi

All URIs are relative to *https://ephemeral.api.factom.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIdChainbyId**](IdentitiesApi.md#getIdChainbyId) | **GET** /identities/{identity_chain_id} | Get Identity Chain Info
[**getKeybyEntryHash**](IdentitiesApi.md#getKeybyEntryHash) | **GET** /identities/{identity_chain_id}/keys/{key_string} | Get Key Info
[**getKeysbyIdChainId**](IdentitiesApi.md#getKeysbyIdChainId) | **GET** /identities/{identity_chain_id}/keys | Get Identity Chain's Keys
[**postIdChain**](IdentitiesApi.md#postIdChain) | **POST** /identities | Create Identity Chain
[**postKeytoIdChainId**](IdentitiesApi.md#postKeytoIdChainId) | **POST** /identities/{identity_chain_id}/keys | Replace Identity Key


<a name="getIdChainbyId"></a>
# **getIdChainbyId**
> IdentityChain getIdChainbyId(identityChainId)

Get Identity Chain Info

Retrieve the details about a particular Identity Chain.

### Example
```java
// Import classes:
//import harmony_connect_client.ApiClient;
//import harmony_connect_client.ApiException;
//import harmony_connect_client.Configuration;
//import harmony_connect_client.auth.*;
//import harmony_connect_client.api.IdentitiesApi;

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

IdentitiesApi apiInstance = new IdentitiesApi();
String identityChainId = 72933895e24e77d8a46482731386a6f177d61777179a5b11dde582e692910eb0; // String | The hex encoded string that points to the identity's chain
try {
    IdentityChain result = apiInstance.getIdChainbyId(identityChainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentitiesApi#getIdChainbyId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identityChainId** | **String**| The hex encoded string that points to the identity's chain |

### Return type

[**IdentityChain**](IdentityChain.md)

### Authorization

[AppId](../README.md#AppId), [AppKey](../README.md#AppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getKeybyEntryHash"></a>
# **getKeybyEntryHash**
> IdentityKey getKeybyEntryHash(identityChainId, keyString)

Get Key Info

Retreive information about a specific public key for a given Identity, including the heights at which the key was activated and retired if applicable.

### Example
```java
// Import classes:
//import harmony_connect_client.ApiClient;
//import harmony_connect_client.ApiException;
//import harmony_connect_client.Configuration;
//import harmony_connect_client.auth.*;
//import harmony_connect_client.api.IdentitiesApi;

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

IdentitiesApi apiInstance = new IdentitiesApi();
String identityChainId = 72933895e24e77d8a46482731386a6f177d61777179a5b11dde582e692910eb0; // String | The hex encoded string that points to the identity's chain
String keyString = db; // String | The public key string. Must be in base58 idpub format.
try {
    IdentityKey result = apiInstance.getKeybyEntryHash(identityChainId, keyString);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentitiesApi#getKeybyEntryHash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identityChainId** | **String**| The hex encoded string that points to the identity's chain |
 **keyString** | **String**| The public key string. Must be in base58 idpub format. |

### Return type

[**IdentityKey**](IdentityKey.md)

### Authorization

[AppId](../README.md#AppId), [AppKey](../README.md#AppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getKeysbyIdChainId"></a>
# **getKeysbyIdChainId**
> KeyList getKeysbyIdChainId(identityChainId, limit, offset)

Get Identity Chain's Keys

Returns all of the keys, past and present, associated with a particular Identity. Results are paginated and ordered by activation height.

### Example
```java
// Import classes:
//import harmony_connect_client.ApiClient;
//import harmony_connect_client.ApiException;
//import harmony_connect_client.Configuration;
//import harmony_connect_client.auth.*;
//import harmony_connect_client.api.IdentitiesApi;

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

IdentitiesApi apiInstance = new IdentitiesApi();
String identityChainId = 72933895e24e77d8a46482731386a6f177d61777179a5b11dde582e692910eb0; // String | The hex encoded string that points to the identity's chain
Integer limit = 15; // Integer | The number of items you would like back in each page.
Integer offset = 2; // Integer | The offset parameter allows you to select which item you would like to start from when you get back a list from Connect. For example, if you've already seen the first 15 items and you'd like the next set, you would send an offset of 15. `offset=0` starts from the first item of the set and is the default position.
try {
    KeyList result = apiInstance.getKeysbyIdChainId(identityChainId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentitiesApi#getKeysbyIdChainId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identityChainId** | **String**| The hex encoded string that points to the identity's chain |
 **limit** | **Integer**| The number of items you would like back in each page. | [optional]
 **offset** | **Integer**| The offset parameter allows you to select which item you would like to start from when you get back a list from Connect. For example, if you've already seen the first 15 items and you'd like the next set, you would send an offset of 15. &#x60;offset&#x3D;0&#x60; starts from the first item of the set and is the default position. | [optional]

### Return type

[**KeyList**](KeyList.md)

### Authorization

[AppId](../README.md#AppId), [AppKey](../README.md#AppKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postIdChain"></a>
# **postIdChain**
> ChainShort postIdChain(identityCreate)

Create Identity Chain

Creates a new identity chain. To create the chain, you'll need to include a unique name array and an array of public keys. If successful, returns information about the chain that was created.

### Example
```java
// Import classes:
//import harmony_connect_client.ApiClient;
//import harmony_connect_client.ApiException;
//import harmony_connect_client.Configuration;
//import harmony_connect_client.auth.*;
//import harmony_connect_client.api.IdentitiesApi;

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

IdentitiesApi apiInstance = new IdentitiesApi();
IdentityCreate identityCreate = new IdentityCreate(); // IdentityCreate | 
try {
    ChainShort result = apiInstance.postIdChain(identityCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentitiesApi#postIdChain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identityCreate** | [**IdentityCreate**](IdentityCreate.md)|  |

### Return type

[**ChainShort**](ChainShort.md)

### Authorization

[AppId](../README.md#AppId), [AppKey](../README.md#AppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postKeytoIdChainId"></a>
# **postKeytoIdChainId**
> EntryShort postKeytoIdChainId(identityChainId, identityKeyReplace)

Replace Identity Key

Retires an existing key from an identity and replaces it with a new one. To do this, a user must send the key to be replaced (&#x60;old_key&#x60;), the &#x60;new_key&#x60;, the signing key that authorizes the replacement and a signed message from the signing key. The signing key must be either equal to or senior to the key that is being replaced.  *Note: You may not reuse a key. If the &#x60;new_key&#x60; has been used by this Identity at any level, the replacement will fail.*

### Example
```java
// Import classes:
//import harmony_connect_client.ApiClient;
//import harmony_connect_client.ApiException;
//import harmony_connect_client.Configuration;
//import harmony_connect_client.auth.*;
//import harmony_connect_client.api.IdentitiesApi;

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

IdentitiesApi apiInstance = new IdentitiesApi();
String identityChainId = 72933895e24e77d8a46482731386a6f177d61777179a5b11dde582e692910eb0; // String | The hex encoded string that points to the identity's chain
IdentityKeyReplace identityKeyReplace = new IdentityKeyReplace(); // IdentityKeyReplace | 
try {
    EntryShort result = apiInstance.postKeytoIdChainId(identityChainId, identityKeyReplace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentitiesApi#postKeytoIdChainId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identityChainId** | **String**| The hex encoded string that points to the identity's chain |
 **identityKeyReplace** | [**IdentityKeyReplace**](IdentityKeyReplace.md)|  |

### Return type

[**EntryShort**](EntryShort.md)

### Authorization

[AppId](../README.md#AppId), [AppKey](../README.md#AppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

