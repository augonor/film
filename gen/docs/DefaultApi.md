# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**obtenirFilm**](DefaultApi.md#obtenirFilm) | **GET** /api/film/{id} | 


<a name="obtenirFilm"></a>
# **obtenirFilm**
> FilmDto obtenirFilm(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      FilmDto result = apiInstance.obtenirFilm(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#obtenirFilm");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**FilmDto**](FilmDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | default response |  -  |

