
# EBlockLong

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keymr** | **String** | The Key Merkle Root for this entry block. | 
**sequence** | **Integer** | Shows where this entry block falls within the list of entry blocks that are contained in the parent directory block. | 
**prev** | [**EBlockLongPrev**](EBlockLongPrev.md) |  |  [optional]
**next** | [**EBlockLongNext**](EBlockLongNext.md) |  |  [optional]
**chain** | [**EBlockShortChain**](EBlockShortChain.md) |  | 
**dblock** | [**EBlockShortDblock**](EBlockShortDblock.md) |  | 
**startedAt** | [**Object**](.md) | The timestamp for when this block was built. Sent in [ISO 8601 Format](https://en.wikipedia.org/wiki/ISO_8601). For example: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; | 
**href** | **String** | An API link to retrieve all information about this entry block. | 
**entries** | **String** | An API link to all of the entries in this entry block. | 



