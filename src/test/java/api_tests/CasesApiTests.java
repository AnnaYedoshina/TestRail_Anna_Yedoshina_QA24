package api_tests;

import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import models.Project;
import models.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class CasesApiTests extends BaseApiTest {

    @Test
    public void addTestCaseFromFile() {
        File file = new File(System.getProperty("user.dir") + "/src/test/resources/requestCaseBody.json");
        given()
                .body(file)
                .when()
                .post("index.php?/api/v2/add_case/1")
                .then()
                .log().all()
                .statusCode(SC_OK);

    }

    @Test
    public void addTestCase() {
        TestCase expectedTestCase = TestCase.builder().setTitle("This is new testcase")
                .setEstimate("3m")
                .build();
        TestCase actualTestCase = given()
                .body(expectedTestCase, ObjectMapperType.GSON)
                .when()
                .post("index.php?/api/v2/add_case/1")
                .then()
                .log().all()
                .statusCode(SC_OK)
                .extract().as(TestCase.class, ObjectMapperType.GSON);
        Assert.assertEquals(expectedTestCase, actualTestCase);
    }

    @Test
    public void getTestCase() {
        TestCase expectedTestCase = TestCase.builder()
                .setTitle("This is new testcase")
                .setEstimate("3m")
                .build();
        TestCase actualTestCase = given()
                .pathParam("case_id", 8)
                .log().all()
                .when()
                .get("index.php?/api/v2/get_case/{case_id}")
                .then()
                .log().all()
                .statusCode(SC_OK)
                .extract().as(TestCase.class, ObjectMapperType.GSON);
        Assert.assertEquals(actualTestCase, expectedTestCase);
    }

    @Test
    public void updateTestCase() {
        TestCase expectedTestCase = TestCase.builder().setTitle("This is updated testcase")
                .setEstimate("3m")
                .build();
        TestCase actualTestCase = given()
                .pathParam("case_id", 8)
                .body(expectedTestCase, ObjectMapperType.GSON)
                .when()
                .post("index.php?/api/v2/update_case/{case_id}")
                .then()
                .log().all()
                .statusCode(SC_OK)
                .extract().as(TestCase.class, ObjectMapperType.GSON);
        Assert.assertEquals(expectedTestCase, actualTestCase);

    }

    @Test
    public void deleteTestCase() {
        given()
                .pathParam("case_id", 9)
                .log().all()
                .when()
                .post("index.php?/api/v2/delete_case/{case_id}")
                .then()
                .log().all()
                .statusCode(SC_OK);
    }

}

