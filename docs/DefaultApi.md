# DefaultApi

All URIs are relative to *http://devapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**studentGet**](DefaultApi.md#studentGet) | **GET** /student | 
[**studentPut**](DefaultApi.md#studentPut) | **PUT** /student | 
[**studentfindGet**](DefaultApi.md#studentfindGet) | **GET** /student{find} | 
[**studentidDelete**](DefaultApi.md#studentidDelete) | **DELETE** /student{id} | 

<a name="studentGet"></a>
# **studentGet**
> Students studentGet(studentname)



Operation to fetch all the students

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String studentname = "studentname_example"; // String | 
try {
    Students result = apiInstance.studentGet(studentname);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#studentGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentname** | **String**|  |

### Return type

[**Students**](Students.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="studentPut"></a>
# **studentPut**
> studentPut(body)



Updates an existing students

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Student body = new Student(); // Student | 
try {
    apiInstance.studentPut(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#studentPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Student**](Student.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="studentfindGet"></a>
# **studentfindGet**
> Students studentfindGet(find)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String find = "find_example"; // String | 
try {
    Students result = apiInstance.studentfindGet(find);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#studentfindGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **find** | **String**|  |

### Return type

[**Students**](Students.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="studentidDelete"></a>
# **studentidDelete**
> Student studentidDelete(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | 
try {
    Student result = apiInstance.studentidDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#studentidDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**Student**](Student.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

