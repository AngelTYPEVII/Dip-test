package request 
 
import io.gatling.core.Predef._ 
import io.gatling.http.Predef._ 
import io.gatling.http.request.builder.HttpRequestBuilder 
import io.restassured.RestAssured.`given` 

 
 
object Request  {
 
  var request: HttpRequestBuilder = http("Element") 
    .post("/loadtest/api/runCollector".trim)
    .body(StringBody("{\"requestId\": \"Timur\",\"body\": \"OozZz\"}")).asJson
    .check(status.is(200)) 
 
  var requestInfo: HttpRequestBuilder = http("Info") 
    .post("/loadtest/api/bindQueue".trim)
    .body(StringBody("{\"queue\":\"test\"}")).asJson
    .check(status.is(200)) 
 
} 
