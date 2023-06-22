package tests;

import io.qameta.allure.Step;
import models.Milestone;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MilestoneTests extends BaseTest {

    @Test
    public void positiveAddMilestoneTest() {
        Milestone milestone = new Milestone.MilestoneBuilder("1")
                .setReferences("qwe")
                .setDescription("first milestone")
                .build();
        String projectName = "AnnaYedoshinaQA24";
        loginPage.logIn(EMAIL, PASSWORD);
        allProjectsPage.openProjectByName(projectName);
        projectPage.clickAddMilestoneButton();
        addMilestonePage.fillMilestone(milestone);
        addMilestonePage.checkCompletedMilestoneCheckbox();
        Assert.assertTrue(addMilestonePage.isCompletedMilestoneCheckboxChecked());
        addMilestonePage.clickAddMilestoneButton();
        Assert.assertTrue(milestonesPage.isMilestoneAdded());


    }
    @Test
    public void deleteMilestoneTest(){
        Milestone milestone = new Milestone.MilestoneBuilder("1")
                .setReferences("qwe")
                .setDescription("first milestone")
                .build();
        String projectName = "AnnaYedoshinaQA24";
        loginPage.logIn(EMAIL, PASSWORD);
        allProjectsPage.openProjectByName(projectName);
        projectPage.clickAddMilestoneButton();
        addMilestonePage.fillMilestone(milestone);
        addMilestonePage.checkCompletedMilestoneCheckbox();
        Assert.assertTrue(addMilestonePage.isCompletedMilestoneCheckboxChecked());
        addMilestonePage.clickAddMilestoneButton();
       // milestonesPage.deleteMilestone();

    }
}
