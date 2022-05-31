package com.herokuapp.restful_booke.bookerinfo;

import com.herokuapp.restful_booke.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class DeleteBookerTest extends TestBase {

@Test
    public void deleteStore(){

    Response response = given()
            .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
            .header("Content-Type","application/json")
            .pathParam("id","1634")
            .when()
            .delete("{id}");
    response.then().statusCode(201);
    response.then().time(lessThan(3000L));
    response.prettyPrint();






}
}
