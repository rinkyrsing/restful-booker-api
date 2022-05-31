package com.herokuapp.restful_booke.bookerinfo;

import com.herokuapp.restful_booke.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.awt.image.RescaleOp;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class GetBookerList extends TestBase {


    @Test
    public void getAllBookerInfo(){

        Response response = given()
                .when()
                .get();
        response.then().statusCode(200);
        //response.then().time(lessThan(300L));
        response.prettyPrint();
    }

    @Test
    public void bookingById(){


    }
}