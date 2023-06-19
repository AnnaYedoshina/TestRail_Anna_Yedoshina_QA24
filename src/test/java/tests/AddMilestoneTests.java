package tests;

import models.Milestone;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddMilestoneTests extends BaseTest{

    @Test
    public void positiveAddMilestoneTest(){
        Milestone milestone = new Milestone();
        milestone.setName("1");
        milestone.setReferences("qwe");
        milestone.setDescription("first milestone");
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
