
# CommitLong

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hash** | **String** | The SHA256 Hash of this commit. | 
**txId** | **String** | The entry credit transaction ID that resulted in this commit. | 
**version** | **Integer** | The type version of this transaction. | 
**createdAt** | **String** | The timestamp for when this commit was created. Sent in [ISO 8601 Format](https://en.wikipedia.org/wiki/ISO_8601). For example: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; | 
**chainId** | **String** | The ID of the chain that was altered by this commit. | 
**weld** | **String** | The commit weld for this commit. This is the double hash (SHA256d) of the Entry Hash concatenated with the ChainID. | 
**entryHash** | **String** | The unique identifier of the entry that was created by this commit. | 
**entryCredits** | **Integer** | The number of entry credits spent on this commit. | 
**address** | **String** | The entry credit address that initiated this transaction. | 
**signature** | **String** | The signature that authorized this commit. | 
**ecBlock** | [**ECBlockShort**](ECBlockShort.md) |  |  [optional]



