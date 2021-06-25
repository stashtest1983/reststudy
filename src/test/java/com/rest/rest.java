package com.rest;
import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import com.pojo.Monitorgroup;
import groovy.util.logging.Log;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.get;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import lib.baseHelper;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;


public class rest {

baseHelper basehelper = new baseHelper();
RequestSpecification requestSpecification;
ResponseSpecification responseSpecification;

@BeforeClass
        public void beforeClass() {
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder().setRelaxedHTTPSValidation().setBaseUri(baseHelper.getBaseUri())
                .addHeader("Authorization", "Bearer " + baseHelper.getapiKey()).setBasePath("/rest/v1").setContentType(ContentType.JSON)
           .log(LogDetail.ALL);
        requestSpecification = requestSpecBuilder.build();

        ResponseSpecBuilder responseSpecBuilder = new ResponseSpecBuilder().expectContentType(ContentType.JSON).log(LogDetail.ALL);
        responseSpecification = responseSpecBuilder.build();
}
      @Test
    public void rest() {
        Response response = given(requestSpecification).when().get("/monitors/groups").then().spec(responseSpecification).assertThat().statusCode(200).extract().
                response();
        System.out.println(response.asString());
        System.out.println("Status Code:" + response.statusCode());
          JsonPath jsonPath = response.jsonPath();
        System.out.println(jsonPath.getList("name"));
}
}
