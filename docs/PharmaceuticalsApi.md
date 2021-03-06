# PharmaceuticalsApi

All URIs are relative to *https://api.pharmatrace.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPharmaceutical**](PharmaceuticalsApi.md#addPharmaceutical) | **POST** /pharmaceuticals | 
[**deletePharmaceutical**](PharmaceuticalsApi.md#deletePharmaceutical) | **DELETE** /pharmaceuticals/{id} | 
[**findPharmaceuticalById**](PharmaceuticalsApi.md#findPharmaceuticalById) | **GET** /pharmaceuticals/{id} | 
[**findPharmaceuticals**](PharmaceuticalsApi.md#findPharmaceuticals) | **GET** /pharmaceuticals | 


<a name="addPharmaceutical"></a>
# **addPharmaceutical**
> Pharmaceutical addPharmaceutical(pharmaceutical)



Creates a new pharmaceutical

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.public.ApiException;
//import io.pharmatrace.api.scin.public.api.PharmaceuticalsApi;


PharmaceuticalsApi apiInstance = new PharmaceuticalsApi();
Pharmaceutical pharmaceutical = new Pharmaceutical(); // Pharmaceutical | Pharmaceutical to create
try {
    Pharmaceutical result = apiInstance.addPharmaceutical(pharmaceutical);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PharmaceuticalsApi#addPharmaceutical");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pharmaceutical** | [**Pharmaceutical**](Pharmaceutical.md)| Pharmaceutical to create |

### Return type

[**Pharmaceutical**](Pharmaceutical.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePharmaceutical"></a>
# **deletePharmaceutical**
> deletePharmaceutical(id)



deletes a single pharmaceutical based on the ID supplied

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.public.ApiException;
//import io.pharmatrace.api.scin.public.api.PharmaceuticalsApi;


PharmaceuticalsApi apiInstance = new PharmaceuticalsApi();
Long id = 56L; // Long | ID of pharmaceutical to delete
try {
    apiInstance.deletePharmaceutical(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PharmaceuticalsApi#deletePharmaceutical");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of pharmaceutical to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findPharmaceuticalById"></a>
# **findPharmaceuticalById**
> Pharmaceutical findPharmaceuticalById(id)



Returns a pharmaceutical based on the ID

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.public.ApiException;
//import io.pharmatrace.api.scin.public.api.PharmaceuticalsApi;


PharmaceuticalsApi apiInstance = new PharmaceuticalsApi();
Long id = 56L; // Long | ID of pharmaceutical to fetch
try {
    Pharmaceutical result = apiInstance.findPharmaceuticalById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PharmaceuticalsApi#findPharmaceuticalById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of pharmaceutical to fetch |

### Return type

[**Pharmaceutical**](Pharmaceutical.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findPharmaceuticals"></a>
# **findPharmaceuticals**
> List&lt;Pharmaceutical&gt; findPharmaceuticals(tags, limit)



Returns all pharmaceuticals from the system that the user has access to Nam sed condimentum est. Maecenas tempor sagittis sapien, nec rhoncus sem sagittis sit amet. Aenean at gravida augue, ac iaculis sem. Curabitur odio lorem, ornare eget elementum nec, cursus id lectus. Duis mi turpis, pulvinar ac eros ac, tincidunt varius justo. In hac habitasse platea dictumst. Integer at adipiscing ante, a sagittis ligula. Aenean pharetra tempor ante molestie imperdiet. Vivamus id aliquam diam. Cras quis velit non tortor eleifend sagittis. Praesent at enim pharetra urna volutpat venenatis eget eget mauris. In eleifend fermentum facilisis. Praesent enim enim, gravida ac sodales sed, placerat id erat. Suspendisse lacus dolor, consectetur non augue vel, vehicula interdum libero. Morbi euismod sagittis libero sed lacinia.  Sed tempus felis lobortis leo pulvinar rutrum. Nam mattis velit nisl, eu condimentum ligula luctus nec. Phasellus semper velit eget aliquet faucibus. In a mattis elit. Phasellus vel urna viverra, condimentum lorem id, rhoncus nibh. Ut pellentesque posuere elementum. Sed a varius odio. Morbi rhoncus ligula libero, vel eleifend nunc tristique vitae. Fusce et sem dui. Aenean nec scelerisque tortor. Fusce malesuada accumsan magna vel tempus. Quisque mollis felis eu dolor tristique, sit amet auctor felis gravida. Sed libero lorem, molestie sed nisl in, accumsan tempor nisi. Fusce sollicitudin massa ut lacinia mattis. Sed vel eleifend lorem. Pellentesque vitae felis pretium, pulvinar elit eu, euismod sapien. 

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.public.ApiException;
//import io.pharmatrace.api.scin.public.api.PharmaceuticalsApi;


PharmaceuticalsApi apiInstance = new PharmaceuticalsApi();
List<String> tags = Arrays.asList(); // List<String> | tags to filter by
Integer limit = 56; // Integer | maximum number of results to return
try {
    List<Pharmaceutical> result = apiInstance.findPharmaceuticals(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PharmaceuticalsApi#findPharmaceuticals");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| maximum number of results to return | [optional]

### Return type

[**List&lt;Pharmaceutical&gt;**](Pharmaceutical.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

