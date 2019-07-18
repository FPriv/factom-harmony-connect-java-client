
# FactomAnchor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**network** | [**NetworkEnum**](#NetworkEnum) | Indicates the blockchain network that contains this anchor. | 
**status** | [**StatusEnum**](#StatusEnum) | The confirmation status of the anchor. Either pending or confirmed. | 
**createdAt** | **String** | The time at which this entry was created. Sent in [ISO 8601 Format](https://en.wikipedia.org/wiki/ISO_8601). For example: &#x60;YYYY-MM-DDThh:mm:ss.ssssssZ&#x60; This will be null if the chain is not at least at the &#x60;factom&#x60; immutability stage. |  [optional]
**entrySerialized** | **String** | The raw data that makes up the entry. |  [optional]
**entryHash** | **String** | The unique identitfier of the entry. |  [optional]
**dblock** | [**DBlockLink**](DBlockLink.md) |  |  [optional]
**merkleBranch** | [**List&lt;MerkleNode&gt;**](MerkleNode.md) | The branch of the merkle tree that represents this anchor. Presented as an array of Merkle nodes. |  [optional]


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



