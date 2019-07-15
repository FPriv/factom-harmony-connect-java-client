# Factom Harmony Connect - Java Client Library

This is an automatically generated Java client library for [Factom Harmony Connect](https://www.factom.com/products/harmony-connect/).

Connect is the fastest way to add blockchain capabilities to your app without cryptocurrencies, wallets, or network nodes. [Create an account](https://account.factom.com/) to get your free API key for the sandbox environment.

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [OpenAPI-spec](https://www.openapis.org/) from a remote server, you can easily generate an API client.

Harmony Connect
- API version: 1.0.19
  - Build date: 2019-02-19T17:12:36.829940300-06:00[America/Chicago]

 An easy to use API that helps you access the Factom blockchain.

   For more information, please visit [https://docs.harmony.factom.com](https://docs.harmony.factom.com)

 *Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>factomProject</groupId>
  <artifactId>harmony-connect-client</artifactId>
  <version>1.0.7</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "factomProject:harmony-connect-client:1.0.7"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/harmony-connect-client-1.0.7.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import harmony_connect_client.*;
import harmony_connect_client.auth.*;
import harmony_connect_client.model.*;
import harmony_connect_client.api.ChainsApi;

import java.io.File;
import java.util.*;

public class ChainsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: AppId
        ApiKeyAuth AppId = (ApiKeyAuth) defaultClient.getAuthentication("AppId");
        AppId.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //AppId.setApiKeyPrefix("Token");

        // Configure API key authorization: AppKey
        ApiKeyAuth AppKey = (ApiKeyAuth) defaultClient.getAuthentication("AppKey");
        AppKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //AppKey.setApiKeyPrefix("Token");

        ChainsApi apiInstance = new ChainsApi();
        String chainId = "6a6d796c77cc5654bb8600e9cb36e94c7767a7bb99d6abcfb0ab54b8187c7df8"; // String | Chain identifier
        try {
            Chain result = apiInstance.getChainByID(chainId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChainsApi#getChainByID");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://ephemeral.api.factom.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ChainsApi* | [**getChainByID**](docs/ChainsApi.md#getChainByID) | **GET** /chains/{chain_id} | Get Chain Info
*ChainsApi* | [**getChains**](docs/ChainsApi.md#getChains) | **GET** /chains | Get All Chains
*ChainsApi* | [**postChain**](docs/ChainsApi.md#postChain) | **POST** /chains | Create a Chain
*ChainsApi* | [**postChainSearch**](docs/ChainsApi.md#postChainSearch) | **POST** /chains/search | Search Chains
*EntriesApi* | [**getEntriesByChainID**](docs/EntriesApi.md#getEntriesByChainID) | **GET** /chains/{chain_id}/entries | Get Chain's Entries
*EntriesApi* | [**getEntryByHash**](docs/EntriesApi.md#getEntryByHash) | **GET** /chains/{chain_id}/entries/{entry_hash} | Get Entry Info
*EntriesApi* | [**getFirstEntry**](docs/EntriesApi.md#getFirstEntry) | **GET** /chains/{chain_id}/entries/first | Get Chain's First Entry
*EntriesApi* | [**getLastEntry**](docs/EntriesApi.md#getLastEntry) | **GET** /chains/{chain_id}/entries/last | Get Chain's Last Entry
*EntriesApi* | [**postEntriesSearch**](docs/EntriesApi.md#postEntriesSearch) | **POST** /chains/{chain_id}/entries/search | Search Chain's Entries
*EntriesApi* | [**postEntryToChainID**](docs/EntriesApi.md#postEntryToChainID) | **POST** /chains/{chain_id}/entries | Create an Entry
*IdentitiesApi* | [**getIdChainbyId**](docs/IdentitiesApi.md#getIdChainbyId) | **GET** /identities/{identity_chain_id} | Get Identity Chain Info
*IdentitiesApi* | [**getKeybyEntryHash**](docs/IdentitiesApi.md#getKeybyEntryHash) | **GET** /identities/{identity_chain_id}/keys/{key_string} | Get Key Info
*IdentitiesApi* | [**getKeysbyIdChainId**](docs/IdentitiesApi.md#getKeysbyIdChainId) | **GET** /identities/{identity_chain_id}/keys | Get Identity Chain's Keys
*IdentitiesApi* | [**postIdChain**](docs/IdentitiesApi.md#postIdChain) | **POST** /identities | Create Identity Chain
*IdentitiesApi* | [**postKeytoIdChainId**](docs/IdentitiesApi.md#postKeytoIdChainId) | **POST** /identities/{identity_chain_id}/keys | Replace Identity Key
*InfoApi* | [**getApiInfo**](docs/InfoApi.md#getApiInfo) | **GET** / | API Info
*ProofsApi* | [**getAnchorbySearch**](docs/ProofsApi.md#getanchorbysearch) | **GET** /anchors/{object_id} | Get Object's Anchors
*ProofsApi* | [**getReceiptsbyEntry**](docs/ProofsApi.md#getreceiptsbyentry) | **GET** /receipts/{entry_hash} | Get Entry's Receipts
*ProofsApi* | [**getSearch**](docs/ProofsApi.md#getsearch) | **GET** /search | Search


## Documentation for Models

 - [ABlockEntry](docs/ABlockEntry.md)
 - [ABlockEntryData](docs/ABlockEntryData.md)
 - [ABlockEntryLink](docs/ABlockEntryLink.md)
 - [ABlockEntryList](docs/ABlockEntryList.md)
 - [ABlockList](docs/ABlockList.md)
 - [ABlockLong](docs/ABlockLong.md)
 - [ABlockLongDblock](docs/ABlockLongDblock.md)
 - [ABlockLongNext](docs/ABlockLongNext.md)
 - [ABlockLongPrev](docs/ABlockLongPrev.md)
 - [ABlockShort](docs/ABlockShort.md)
 - [ABlockShortDblock](docs/ABlockShortDblock.md)
 - [Address](docs/Address.md)
 - [AddressLink](docs/AddressLink.md)
 - [AddressList](docs/AddressList.md)
 - [AllInfo](docs/AllInfo.md)
 - [AllInfoLinks](docs/AllInfoLinks.md)
 - [AnchorLong](docs/AnchorLong.md)
 - [AnchorLongData](docs/AnchorLongData.md)
 - [BitcoinAnchor](docs/BitcoinAnchor.md)
 - [Chain](docs/Chain.md)
 - [ChainCreate](docs/ChainCreate.md)
 - [ChainData](docs/ChainData.md)
 - [ChainDataDblock](docs/ChainDataDblock.md)
 - [ChainDataEblock](docs/ChainDataEblock.md)
 - [ChainDataEntries](docs/ChainDataEntries.md)
 - [ChainLink](docs/ChainLink.md)
 - [ChainList](docs/ChainList.md)
 - [ChainListData](docs/ChainListData.md)
 - [ChainShort](docs/ChainShort.md)
 - [CommitLink](docs/CommitLink.md)
 - [CommitLong](docs/CommitLong.md)
 - [DBlockLink](docs/DBlockLink.md)
 - [DBlockList](docs/DBlockList.md)
 - [DBlockLong](docs/DBlockLong.md)
 - [DBlockLongAblock](docs/DBlockLongAblock.md)
 - [DBlockLongBtcAnchorEntry](docs/DBlockLongBtcAnchorEntry.md)
 - [DBlockLongBtcAnchorEntryChain](docs/DBlockLongBtcAnchorEntryChain.md)
 - [DBlockLongEblocks](docs/DBlockLongEblocks.md)
 - [DBlockLongEcblock](docs/DBlockLongEcblock.md)
 - [DBlockLongFblock](docs/DBlockLongFblock.md)
 - [DBlockLongNext](docs/DBlockLongNext.md)
 - [DBlockLongPrev](docs/DBlockLongPrev.md)
 - [DBlockShort](docs/DBlockShort.md)
 - [EBlockLink](docs/EBlockLink.md)
 - [EBlockLinkChain](docs/EBlockLinkChain.md)
 - [EBlockList](docs/EBlockList.md)
 - [EBlockLong](docs/EBlockLong.md)
 - [EBlockLongNext](docs/EBlockLongNext.md)
 - [EBlockLongPrev](docs/EBlockLongPrev.md)
 - [EBlockShort](docs/EBlockShort.md)
 - [EBlockShortChain](docs/EBlockShortChain.md)
 - [EBlockShortDblock](docs/EBlockShortDblock.md)
 - [ECBlockEntryList](docs/ECBlockEntryList.md)
 - [ECBlockList](docs/ECBlockList.md)
 - [ECBlockLong](docs/ECBlockLong.md)
 - [ECBlockLongDblock](docs/ECBlockLongDblock.md)
 - [ECBlockShort](docs/ECBlockShort.md)
 - [Entry](docs/Entry.md)
 - [EntryCreate](docs/EntryCreate.md)
 - [EntryData](docs/EntryData.md)
 - [EntryDataDblock](docs/EntryDataDblock.md)
 - [EntryDataEblock](docs/EntryDataEblock.md)
 - [EntryList](docs/EntryList.md)
 - [EntryListChain](docs/EntryListChain.md)
 - [EntryListData](docs/EntryListData.md)
 - [EntrySearchResponse](docs/EntrySearchResponse.md)
 - [EntrySearchResponseData](docs/EntrySearchResponseData.md)
 - [EntryShort](docs/EntryShort.md)
 - [ErrorMessage](docs/ErrorMessage.md)
 - [ErrorMessageErrors](docs/ErrorMessageErrors.md)
 - [EthereumAnchor](docs/EthereumAnchor.md)
 - [FBlockList](docs/FBlockList.md)
 - [FBlockLong](docs/FBlockLong.md)
 - [FBlockLongNext](docs/FBlockLongNext.md)
 - [FBlockLongPrev](docs/FBlockLongPrev.md)
 - [FBlockShort](docs/FBlockShort.md)
 - [FactomAnchor](docs/FactomAnchor.md)
 - [IdentityChain](docs/IdentityChain.md)
 - [IdentityCreate](docs/IdentityCreate.md)
 - [IdentityKey](docs/IdentityKey.md)
 - [IdentityKeyData](docs/IdentityKeyData.md)
 - [IdentityKeyReplace](docs/IdentityKeyReplace.md)
 - [IdentityKeyShort](docs/IdentityKeyShort.md)
 - [IdentityKeyShortData](docs/IdentityKeyShortData.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse200Data](docs/InlineResponse200Data.md)
 - [KeyList](docs/KeyList.md)
 - [MerkleNode](docs/MerkleNode.md)
 - [ReceiptLong](docs/ReceiptLong.md)
 - [ReceiptLongData](docs/ReceiptLongData.md)
 - [SearchBody](docs/SearchBody.md)
 - [SingleAnchor](docs/SingleAnchor.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionLink](docs/TransactionLink.md)
 - [TransactionLinkShort](docs/TransactionLinkShort.md)
 - [TransactionList](docs/TransactionList.md)
 - [TransactionShort](docs/TransactionShort.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### AppId

- **Type**: API key
- **API key parameter name**: app_id
- **Location**: HTTP header

### AppKey

- **Type**: API key
- **API key parameter name**: app_key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Support

For more information, you can view the Connect documentation at [https://docs.harmony.factom.com](https://docs.harmony.factom.com)

For additional support, contact us at harmony-support@factom.com
