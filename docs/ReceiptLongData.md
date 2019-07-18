
# ReceiptLongData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | **String** | The timestamp for this entry. Sent in [ISO 8601 Format](https://en.wikipedia.org/wiki/ISO_8601). For example: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; | 
**entrySerialized** | **String** | The raw data that makes up the entry. | 
**entryHash** | **String** | The unique identitfier of the entry. | 
**merkleBranch** | [**List&lt;MerkleNode&gt;**](MerkleNode.md) | The branch of the merkle tree that represents this entry. Presented as an array of Merkle nodes. | 
**eblock** | [**EBlockLink**](EBlockLink.md) |  | 
**dblock** | [**DBlockLink**](DBlockLink.md) |  | 



