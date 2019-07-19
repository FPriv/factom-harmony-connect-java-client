/*
 * Harmony Connect
 * An easy to use API that helps you access the Factom blockchain.
 *
 * OpenAPI spec version: 1.0.17
 * Contact: harmony-support@factom.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package harmony_connect_client.api;

import harmony_connect_client.*;
import harmony_connect_client.auth.*;
import harmony_connect_client.model.*;
import harmony_connect_client.ApiException;
import harmony_connect_client.model.Chain;
import harmony_connect_client.model.ChainCreate;
import harmony_connect_client.model.ChainList;
import harmony_connect_client.model.ChainShort;
import harmony_connect_client.model.EntryShort;
import harmony_connect_client.model.ErrorMessage;
import harmony_connect_client.model.IdentityChain;
import harmony_connect_client.model.IdentityCreate;
import harmony_connect_client.model.IdentityKey;
import harmony_connect_client.model.IdentityKeyReplace;
import harmony_connect_client.model.KeyList;
import harmony_connect_client.model.SearchBody;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.BeforeClass;
import org.junit.Assert;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * API tests for IdentitiesApi
 */
public class IdentitiesApiTest {

    static IdentitiesApi api = new IdentitiesApi();
    static String identityChainId;
    String timeNonce = Base64.getEncoder().encodeToString((System.currentTimeMillis()+"").getBytes());
    String testExtId = "ZXhhbXBsZS1leHRpZA==";

    private static class SetUpResults {
        String identityChainId;
        IdentitiesApi api;
    }

    @BeforeClass
    public static void setUp() {
        IdentitiesApiTest obj = new IdentitiesApiTest();
        SetUpResults setupResults = obj.setUpHelper();
        api = setupResults.api;
        identityChainId = setupResults.identityChainId;
    }

    public SetUpResults setUpHelper() {
        InputStream inputStream = null;
        String baseurl;
        String appid;
        String appkey;
        IdentitiesApi newApi = null;
        String newIdentityChainId = "";

		try {
			Properties prop = new Properties();

			inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("config.properties file not found in the classpath");
			}

			baseurl = prop.getProperty("baseurl");
			appid = prop.getProperty("appid");
            appkey = prop.getProperty("appkey");

            ApiClient defaultClient = Configuration.getDefaultApiClient();
            defaultClient.setBasePath(baseurl);
            ApiKeyAuth AppId = (ApiKeyAuth) defaultClient.getAuthentication("AppId");
            AppId.setApiKey(appid);
            ApiKeyAuth AppKey = (ApiKeyAuth) defaultClient.getAuthentication("AppKey");
            AppKey.setApiKey(appkey);
            newApi = new IdentitiesApi();
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }
        }

        IdentityCreate identityCreate = new IdentityCreate();
        List<String> externalIds = Arrays.asList(testExtId, timeNonce);
        List<String> keys = Arrays.asList("idpub3GqXS4EQyh3a1s3fB5REbAqbHwKyjG59Nbzh8rq92y64jru18j", "idpub2DuHkAWukKQ2ZiGUng67P8VQ6uhABnZFRdeL88LxFtL21oezoa", "idpub2nBbp3Lxk8unMURiGJeZAB42hZcBn6zHBxUigXvPyYVYx8KRRp");

        identityCreate.names(externalIds);
        identityCreate.keys(keys);
        try {
            ChainShort response = api.postIdChain(identityCreate);
            newIdentityChainId = response.getChainId();
            assertFalse(newIdentityChainId.isEmpty());
        } catch (Exception e) {
			System.out.println("Exception: " + e);
		}

        SetUpResults result = new SetUpResults();
        result.api = newApi;
        result.identityChainId = newIdentityChainId;
        return result;
    }

    /**
     * Get Identity Chain Info
     *
     * Retrieve the details about a particular Identity Chain.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIdChainbyIdTest() throws ApiException {
        IdentityChain response = api.getIdChainbyId(identityChainId);

        assertFalse(response.toString().isEmpty());
    }
    
    /**
     * Get Key Info
     *
     * Retreive information about a specific public key for a given Identity, including the heights at which the key was activated and retired if applicable.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getKeybyEntryHashTest() throws ApiException {
        String keyString = "idpub3GqXS4EQyh3a1s3fB5REbAqbHwKyjG59Nbzh8rq92y64jru18j";
        IdentityKey response = api.getKeybyEntryHash(identityChainId, keyString);

        assertFalse(response.getData().getEntryHash().isEmpty());
        assertEquals("entry hash for key entry should be 64 characters long", 64, response.getData().getEntryHash().length());
    }
    
    /**
     * Get Identity Chain's Keys
     *
     * Returns all of the keys, past and present, associated with a particular Identity. Results are paginated and ordered by activation height.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getKeysbyIdChainIdTest() throws ApiException {
        Integer limit = 10;
        Integer offset = 0;
        KeyList response = api.getKeysbyIdChainId(identityChainId, limit, offset);

        assertFalse(response.toString().isEmpty());
        Integer keyCount = response.getCount();
        assertTrue("test identity should have 3 keys", keyCount==3);
    }
    
    /**
     * Create Identity Chain
     *
     * Creates a new identity chain. To create the chain, you'll need to include a unique name array and an array of public keys. If successful, returns information about the chain that was created.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postIdChainTest() throws ApiException {
        IdentityCreate identityCreate = new IdentityCreate();
        List<String> externalIds = Arrays.asList("dGhyb3dhd2F5LXRlc3QtZXh0aWQ=", timeNonce);
        List<String> keys = Arrays.asList("idpub3GqXS4EQyh3a1s3fB5REbAqbHwKyjG59Nbzh8rq92y64jru18j", "idpub2DuHkAWukKQ2ZiGUng67P8VQ6uhABnZFRdeL88LxFtL21oezoa", "idpub2nBbp3Lxk8unMURiGJeZAB42hZcBn6zHBxUigXvPyYVYx8KRRp");

        identityCreate.names(externalIds);
        identityCreate.keys(keys);
        try {
            ChainShort response = api.postIdChain(identityCreate);
            String throwawayIdentityChainId = response.getChainId();
            assertFalse(throwawayIdentityChainId.isEmpty());
        } catch (Exception e) {
			System.out.println("Exception: " + e);
		}
    }
    
    /**
     * Replace Identity Key
     *
     * Retires an existing key from an identity and replaces it with a new one. To do this, a user must send the key to be replaced (&#x60;old_key&#x60;), the &#x60;new_key&#x60;, the signing key that authorizes the replacement and a signed message from the signing key. The signing key must be either equal to or senior to the key that is being replaced.  *Note: You may not reuse a key. If the &#x60;new_key&#x60; has been used by this Identity at any level, the replacement will fail.*
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void postKeytoIdChainIdTest() throws ApiException {
        IdentityKeyReplace identityKeyReplace = new IdentityKeyReplace();
        identityKeyReplace.oldKey("idpub2nBbp3Lxk8unMURiGJeZAB42hZcBn6zHBxUigXvPyYVYx8KRRp");
        identityKeyReplace.newKey("idpub3fGz4btKNzzYsYr4MnD2i2Co8NQ57wjUdXfXVQZw9VrHzPHEFa");
        identityKeyReplace.signerKey("idpub3GqXS4EQyh3a1s3fB5REbAqbHwKyjG59Nbzh8rq92y64jru18j");
        // TODO: sign key replacement entry (ES-50)
        EntryShort response = api.postKeytoIdChainId(identityChainId, identityKeyReplace);
    }
}
