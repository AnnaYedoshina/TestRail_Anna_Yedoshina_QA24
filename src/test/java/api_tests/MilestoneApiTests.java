package api_tests;

import io.restassured.mapper.ObjectMapperType;
import models.Milestone;
import models.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class MilestoneApiTests extends BaseApiTest {

    @Test
    public void addMilestone() {
        Milestone expectedMilestone = Milestone.builder()
                .setName("Release 1.0")
                .setDescription("New features added")
                .setReferences("RF-1")
                .build();
        Milestone actualMilestone = given()
                .pathParam("project_id", 7)
                .body(expectedMilestone, ObjectMapperType.GSON)
                .when()
                .post("index.php?/api/v2/add_milestone/{project_id}")
                .then()
                .log().all()
                .statusCode(SC_OK)
                .extract().as(Milestone.class, ObjectMapperType.GSON);
        Assert.assertEquals(expectedMilestone, actualMilestone);


    }

    @Test
    public void getMilestone() {
        Milestone expectedMilestone = Milestone.builder()
                .setName("Release 1.0")
                .setDescription("New features added")
                .setReferences("RF-1")
                .build();
        Milestone actualMilestone = given()
                .pathParam("milestone_id", 1)
                .log().all()
                .when()
                .get("index.php?/api/v2/get_milestone/{milestone_id}")
                .then()
                .log().all()
                .statusCode(SC_OK)
                .extract().as(Milestone.class, ObjectMapperType.GSON);
        Assert.assertEquals(actualMilestone, expectedMilestone);
    }

    @Test
    public void updateMilestone() {
        Milestone expectedMilestone = Milestone.builder()
                .setName("Release 1.1")
                .setDescription("New features added")
                .setReferences("RF-2")
                .build();
        Milestone actualMilestone = given()
                .pathParam("milestone_id", 1)
                .body(expectedMilestone, ObjectMapperType.GSON)
                .when()
                .post("index.php?/api/v2/update_milestone/{milestone_id}")
                .then()
                .log().all()
                .statusCode(SC_OK)
                .extract().as(Milestone.class, ObjectMapperType.GSON);
        Assert.assertEquals(expectedMilestone, actualMilestone);

    }

    @Test
    public void addMilestoneToDelete() {
        Milestone expectedMilestone = Milestone.builder()
                .setName("Release 2.0")
                .setDescription("New features added")
                .setReferences("RF-3")
                .build();
        Milestone actualMilestone = given()
                .pathParam("project_id", 7)
                .body(expectedMilestone, ObjectMapperType.GSON)
                .when()
                .post("index.php?/api/v2/add_milestone/{project_id}")
                .then()
                .log().all()
                .statusCode(SC_OK)
                .extract().as(Milestone.class, ObjectMapperType.GSON);
        Assert.assertEquals(expectedMilestone, actualMilestone);


    }

    @Test
    public void deleteMilestone() {
        given()
                .pathParam("milestone_id", 2)
                .log().all()
                .when()
                .post("index.php?/api/v2/delete_milestone/{milestone_id}")
                .then()
                .log().all()
                .statusCode(SC_OK);
    }

}