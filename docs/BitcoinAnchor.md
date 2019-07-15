
# BitcoinAnchor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**network** | [**NetworkEnum**](#NetworkEnum) | Indicates the blockchain network that contains this anchor. | 
**status** | [**StatusEnum**](#StatusEnum) | The confirmation status of the anchor. Either pending or confirmed. | 
**txId** | **String** | The bitcoin transaction ID for the transaction that includes the anchor message. |  [optional]
**blockHash** | **String** | The hash of the bitcoin block that contains the anchor message. |  [optional]


<a name="NetworkEnum"></a>
## Enum: NetworkEnum
Name | Value
---- | -----
BITCOIN | &quot;bitcoin&quot;
ETHEREUM | &quot;ethereum&quot;
FACTOM | &quot;factom&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;pending&quot;
CONFIRMED | &quot;confirmed&quot;



