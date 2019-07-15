
# IdentityKeyData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The public key string in Base58 idpub format. | 
**activatedHeight** | **Integer** | The height at which this key became valid. |  [optional]
**retiredHeight** | **Integer** | The expiration height of this key. &#x60;null&#x60; if this key is currently active. |  [optional]
**priority** | **Integer** | The level of this key within the hierarchy. A lower number indicates a key that allows a holder to replace higher numbered keys. The master key is priority 0. |  [optional]
**entryHash** | **String** | The unique identifier of the entry on the Identity chain where this key was activated. |  [optional]



