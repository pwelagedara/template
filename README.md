# template

The api documentation will be available in http://localhost:8088/v2/api-docs.
    
## To change the Spring Profile in IntelliJ 
In Terminal execute the following and restart the IDE.
```
launchctl setenv SPRING_PROFILES_ACTIVE production
```

## What is there?
* Swagger Documentation
* Exception Handling examples( Filter Level and Controller Level)
* Spring Security is enabled with Basic In-Memory Authentication
* Custom Error Messages for 401 and 403 responses from Spring Security
* Spring Data JPA
* Spring Profiles for Development and Production
* CORS Support for Web Apps

## Adding RestTemplate to Consume APIs
Below is an example.

```
// Rest Template
RestTemplate restTemplate = new RestTemplate();

String url  = "http://xxxxx.ngrok.io/abc/{planet}/{moon}";

 // URI (URL) parameters
Map<String, String> uriParams = new HashMap<String, String>();
uriParams.put("planet", "Mars");
uriParams.put("moon", "Phobos");

// Query parameters
UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url)
    // Add query parameter
    .queryParam("firstName", "Mark")
.   queryParam("lastName", "Watney");

//Map to store the headers required for the API Access
MultiValueMap<String, Object> headers = new LinkedMultiValueMap<>();
headers.add("Authorization", "Bearer 0ccd4b4fc32648098bd63ff9f3676575");
HttpEntity httpEntity = new HttpEntity(headers);

ResponseEntity<ApiAiResponse> response = restTemplate.exchange(
    builder.buildAndExpand(uriParams).toUri(),
    builder.buildAndExpand().toUri(),
    HttpMethod.GET,
    httpEntity,
    ApiAiResponse.class
    );

ApiAiResponse apiAiResponse = response.getBody();
```

Below is an HTTP POST example.

```
// Body
HttpEntity<Reply> request = new HttpEntity<>(new Reply(new Message(message), new Recipient(senderId)));

// We don't care about the response
restTemplate.exchange(
    builder.buildAndExpand().toUri(),
    HttpMethod.POST,
    request,
    Object.class
    );
```    