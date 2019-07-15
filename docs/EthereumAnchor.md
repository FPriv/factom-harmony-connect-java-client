
# EthereumAnchor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**network** | [**NetworkEnum**](#NetworkEnum) | Indicates the blockchain network that contains this anchor. | 
**status** | [**StatusEnum**](#StatusEnum) | The confirmation status of the anchor. Either pending or confirmed. | 
**windowStartHeight** | **Integer** | The height of the first ethereum block that contains an anchor for this directory block. Valid anchors for the Directory block in question may also be contained in subsequent ethereum blocks. |  [optional]
**windowMr** | **String** | Window Merkle Root. This is the Merkle root that was published in the ethereum transaction that anchors this directory block. The root represents every one of the 1000 Directory blocks that's included in this anchor. |  [optional]
**merkleBranch** | [**List&lt;MerkleNode&gt;**](MerkleNode.md) | The merkle branch that leads to the Directory block in question. Relates to the Window Merkle root. Presented as an array of Merkle nodes. |  [optional]
**contractAddress** | **String** | The address of the contract that initiated the anchor transaction. |  [optional]
**txId** | **String** | The ethereum transaction ID for the transaction that includes the anchor message. |  [optional]
**txIndex** | **Integer** | The index of the transaction within the block. |  [optional]
**blockHash** | **String** | The hash of the ethereum block that contains the anchor transaction. |  [optional]


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



