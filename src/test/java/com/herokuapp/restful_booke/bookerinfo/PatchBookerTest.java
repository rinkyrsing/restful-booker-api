package com.herokuapp.restful_booke.bookerinfo;

import com.herokuapp.restful_booke.model.BookerPojo;
import com.herokuapp.restful_booke.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class PatchBookerTest extends TestBase {

@Test
    public void partiallyUpdateBooking(){
    BookerPojo bookerPojo = new BookerPojo();
    bookerPojo.setFirstname("Ram");
    bookerPojo.setLastname("Smith");

    Response response = given()
            .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
            .header("Content-Type","application/json")
            .body(bookerPojo)
            .when()
            .patch();
    response.then().statusCode(204);
    response.then().time(lessThan(3000L));
    response.prettyPrint();


}


}
