package org.appsmart.tests.api;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class StoreApiTest {

    @Test
    public void makeSureThatStoreIsUp() {
        given().when().get("https://hermes-dev.devteam.win/-bremen-2/").then().statusCode(200);
    }

    @Test
    public void get_single_product_returns_success_with_valid_paramerers() {
        String token = "fuIEWGcWJxqoOcFc";
        int param1 = 1954;
        int param2 = 31137;
        String url = String.format("https://dev.delivery-app.app-smart.services/api2.5/%s/get-single-product/%d/%d",
                token, param1, param2);
        given()
                .when()
                .get(url)
                .then()
                .statusCode(200)
                .body("success", is(true));
    }
}
