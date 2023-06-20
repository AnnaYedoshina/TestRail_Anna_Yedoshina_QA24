package tests;

import models.Milestone;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddMilestoneTests extends BaseTest {

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


    }
}
