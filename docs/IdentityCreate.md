
# IdentityCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**names** | **List&lt;String&gt;** | A unique array of strings that together constitute the Identity's name. Each string should be in Base64 format.   *Note: It is best to avoid adding personally identifiable information to the blockchain.* | 
**keys** | **List&lt;String&gt;** | A list of public keys that will be used to verify this Indenty’s signatures. You may initiate an identity with as many keys as you like. The array of keys should be sent in order of priority with 0 being the master key. The keys should be sent as Base58 strings in IdPub format. | 
**callbackUrl** | **String** | The URL where you would like to receive the callback from Connect. If this is not specified, callbacks will not activate. |  [optional]
**callbackStages** | **List&lt;String&gt;** | The stages that you would like to trigger a callback from Connect. This list can include any or all of the three stages: &#x60;replicated&#x60;, &#x60;factom&#x60;, and &#x60;anchored&#x60;. If callbacks are activated and this field is not sent, it will default to &#x60;factom&#x60; and &#x60;anchored&#x60; |  [optional]



