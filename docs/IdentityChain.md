
# IdentityChain

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **String** | The Identity Chain’s schema version. This details the format of this digital identity. More information about Factom Identity Chain schemas can be seen [here](). | 
**stage** | **String** | The immutability stage that this chain has reached. The identity can be considered in use once it reaches the &#x60;factom&#x60; stage. | 
**createdHeight** | **Integer** | The block height at which this chain was written into the Factom blockchain. This is &#x60;null&#x60; if the chain has not reached the &#x60;factom&#x60; stage. |  [optional]
**chainId** | **String** | The Chain ID for this identity chain. | 
**name** | **List&lt;String&gt;** | A unique array of strings that are associated with this identity. | 
**activeKeys** | [**List&lt;IdentityKeyShort&gt;**](IdentityKeyShort.md) | Contains the currently active public keys for this identity. | 
**allKeysHref** | **String** | An API link to retrieve the keys for this identity. | 



