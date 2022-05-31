package com.herokuapp.restful_booke.bookerinfo;

import com.herokuapp.restful_booke.model.BookerPojo;
import com.herokuapp.restful_booke.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class PutBookerTest extends TestBase {

    @Test
    public void updateBookingById(){

        HashMap<Object, Object> bookingDates = new HashMap<>();

        BookerPojo bookerPojo = new BookerPojo();
        bookerPojo.setFirstname("Amy");
        bookerPojo.setLastname("Smith");
        bookerPojo.setTotalprice(111);
        bookerPojo.setDepositpaid(false);
        bookerPojo.setBookingdates(bookingDates);
        bookerPojo.setAdditionalneeds("Brekfast");

        Response response = given()
                .header("Authorization","Bearer 0c90e41203eca75")
                .header("Content-Type","application/json")
                .body(bookerPojo)
                .pathParam("id","734")
                .put("/{id}");
        response.then().statusCode(200);
        response.then().time(lessThan(3000L));
        response.prettyPrint();




    }

}
