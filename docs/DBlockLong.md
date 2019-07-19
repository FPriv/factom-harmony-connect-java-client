
# DBlockLong

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**height** | **String** | The height of a directory block indicates how many blocks were created before this block. This is used to identify blocks in the blockchain. |  [optional]
**startedAt** | **String** | The timestamp for when this block was built. Sent in [ISO 8601 Format](https://en.wikipedia.org/wiki/ISO_8601). For example: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; |  [optional]
**keymr** | **List&lt;String&gt;** | The Key Merkle Root for this block. |  [optional]
**btcAnchorEntry** | [**DBlockLongBtcAnchorEntry**](DBlockLongBtcAnchorEntry.md) |  |  [optional]
**btcBlockHash** | **String** | The bitcoin block hash for the bitcoin anchor that matches this directory block. |  [optional]
**btcTransaction** | **String** | The bitcoin transaction ID for the transaction that includes the anchor message. |  [optional]
**prev** | [**DBlockLongPrev**](DBlockLongPrev.md) |  |  [optional]
**next** | [**DBlockLongNext**](DBlockLongNext.md) |  |  [optional]
**ablock** | [**DBlockLongAblock**](DBlockLongAblock.md) |  |  [optional]
**ecblock** | [**DBlockLongEcblock**](DBlockLongEcblock.md) |  |  [optional]
**fblock** | [**DBlockLongFblock**](DBlockLongFblock.md) |  |  [optional]
**eblocks** | [**List&lt;DBlockLongEblocks&gt;**](DBlockLongEblocks.md) | The entry blocks contained in this directory block. |  [optional]



