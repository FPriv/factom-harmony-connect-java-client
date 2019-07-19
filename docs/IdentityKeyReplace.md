
# IdentityKeyReplace

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**oldKey** | **String** | The public key you would like to replace. This should be sent as a Base58 string in IdPub format. | 
**newKey** | **String** | The public key that you would like to activate. This should be sent as a Base58 string in IdPub format. | 
**signerKey** | **String** | The key you are using to authorize the replacement. Must be equal to or higher level than the key you want to replace. This should be sent as a Base58 string in IdPub format. | 
**signature** | **String** | A signature that proves ownership of the &#x60;signer_key&#x60;. This signature should use the [Ed25519](https://ed25519.cr.yp.to/) specification. The signed message should be the Identity Chain ID, the Old Key, and the New Key in that order. The message should be a single string with no whitespace or separators between the three parts. | 
**callbackUrl** | **String** | The URL where you would like to receive the callback from Connect. If this is not specified, callbacks will not activate. |  [optional]
**callbackStages** | **List&lt;String&gt;** | The stages that you would like to trigger a callback from Connect. This list can include any or all of the three stages: &#x60;replicated&#x60;, &#x60;factom&#x60;, and &#x60;anchored&#x60;. If callbacks are activated and this field is not sent, it will default to &#x60;factom&#x60; and &#x60;anchored&#x60; |  [optional]



