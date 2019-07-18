
# SingleAnchor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**network** | [**NetworkEnum**](#NetworkEnum) | Indicates the blockchain network that contains this anchor. | 
**status** | [**StatusEnum**](#StatusEnum) | The confirmation status of the anchor. Either pending or confirmed. | 
**txId** | **String** | Only returned for confirmed bitcoin or ethereum anchors. The bitcoin or ethereum transaction ID for the transaction that includes the anchor message. |  [optional]
**blockHash** | **String** | Only returned for confirmed bitcoin or ethereum anchors. The hash of the bitcoin or ethereum block that contains the anchor message. |  [optional]
**createdAt** | **String** | Only returned for confirmed factom anchors. The time at which this entry was created. Sent in [ISO 8601 Format](https://en.wikipedia.org/wiki/ISO_8601). For example: &#x60;YYYY-MM-DDThh:mm:ss.ssssssZ&#x60; This will be null if the chain is not at least at the &#x60;factom&#x60; immutability stage. |  [optional]
**entrySerialized** | **String** | Only returned for confirmed factom anchors. The raw data that makes up the entry. |  [optional]
**entryHash** | **String** | Only returned for confirmed factom anchors. The unique identitfier of the entry. |  [optional]
**dblock** | [**DBlockLink**](DBlockLink.md) |  |  [optional]
**merkleBranch** | [**List&lt;MerkleNode&gt;**](MerkleNode.md) | Only returned for confirmed factom or ethereum anchors. The branch of the merkle tree that represents this anchor. Presented as an array of Merkle nodes. |  [optional]
**windowStartHeight** | **Integer** | Only returned for confirmed ethereum anchors. The height of the first ethereum block that contains an anchor for this directory block. Valid anchors for the Directory block in question may also be contained in subsequent ethereum blocks. |  [optional]
**windowMr** | **String** | Only returned for confirmed ethereum anchors. Window Merkle Root. This is the Merkle root that was published in the ethereum transaction that anchors this directory block. The root represents every one of the 1000 Directory blocks that's included in this anchor. |  [optional]
**contractAddress** | **String** | Only returned for confirmed ethereum anchors. The address of the contract that initiated the anchor transaction. |  [optional]
**txIndex** | **Integer** | Only returned for confirmed ethereum anchors. The index of the transaction within the block. |  [optional]


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



