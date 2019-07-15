
# EntryData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entryHash** | **String** | The unique identitfier of the entry. | 
**chain** | [**EntryListChain**](EntryListChain.md) |  | 
**createdAt** | **String** | The time when this entry was created. Sent in [ISO 8601 Format](https://en.wikipedia.org/wiki/ISO_8601). For example: &#x60;YYYY-MM-DDThh:mm:ss.ssssssZ&#x60; |  [optional]
**externalIds** | **List&lt;String&gt;** | Tags that can be used to identify your entry. You can search for records that contain a particular &#x60;external_id&#x60; using Connect. External IDs are returned in Base64. | 
**content** | **String** | This is the data that is stored by the entry. Content will be sent in Base64 format. | 
**stage** | **String** | The level of immutability that this entry has reached. | 
**dblock** | [**EntryDataDblock**](EntryDataDblock.md) |  |  [optional]
**eblock** | [**EntryDataEblock**](EntryDataEblock.md) |  |  [optional]



