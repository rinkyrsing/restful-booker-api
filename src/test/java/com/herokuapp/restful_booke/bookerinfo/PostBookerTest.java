package com.herokuapp.restful_booke.bookerinfo;

import com.herokuapp.restful_booke.model.BookerPojo;
import com.herokuapp.restful_booke.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class PostBookerTest extends TestBase {

    @Test
    public void createBooker(){

        HashMap<Object, Object> bookingDates = new HashMap<>();
        bookingDates.put("checkin","2013-02-23");
        bookingDates.put("checkout","2014-10-23");


        BookerPojo bookerPojo = new BookerPojo();
        bookerPojo.setFirstname("Jim");
        bookerPojo.setLastname("Brow");
        bookerPojo.setTotalprice(111);
        bookerPojo.setDepositpaid(true);
        bookerPojo.setBookingdates(bookingDates);
        //bookerPojo.setBookingdates(); //"checkin" : "2018-01-01",// "checkout" : "2019-01-01"

        Response response = given()
                .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .header("Content-Type","application/json")
                .body(bookerPojo)
                .when()
                .post();
        response.then().statusCode(200);
        response.then().time(lessThan(3000L));
        response.prettyPrint();



    }
}
