package org.stepdef;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import pojoVo.product;

import java.io.File;
import java.io.IOException;

public class apiStepDef {

    @Step
    @Given("insert call for products")
    public void insert_call_for_products() {

        System.out.println("Given");
        Serenity.recordReportData();
    }
    @When("enter details {int} {string} {string}")
    public void enter_details(int int1, String string, String string2) throws IOException {
        product prod=new product();
        ObjectMapper mapper=new ObjectMapper();
        //JSON
        prod=mapper.readValue(new File("C:\\SeleniumProj\\SeleniumProj\\src\\test\\resources\\insert.json"), product.class);
        //given().
        prod.productid=int1;
        prod.name=string;
        prod.description=string2;

        //RestAssured.baseURI="http://localhost:8080/insert";
        Response res= RestAssured.given().contentType("application/json").
                body(mapper.writeValueAsString(prod)).when().post("http://localhost:8080/insert");
       // scenario.log(res.asPrettyString());
        System.out.println(res.toString());

        if(res.statusCode()==200){
            System.out.println("Success");
        }

    }
    @Then("record should be inserted")
    public void record_should_be_inserted() {
        System.out.println("THEN");
    }
}
