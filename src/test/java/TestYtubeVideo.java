import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestYtubeVideo {

    @BeforeClass
    public void setUp() {
        MainClassYTFlow.ytubeSetUp();
    }


    @Test
    public void ytubeVideo() {
        MainClassYTFlow.homepage();
        MainClassYTFlow.ytubeVideo();
    }

    @Test(priority = 1)
    public void verifyCorrectVideo() {
        System.out.println("The URL of the video is as expected. ");
        Assert.assertEquals("https://www.youtube.com/watch?v=uC6b8KIVeHU", MainClassYTFlow.driver.getCurrentUrl());

    }

    @Test(priority = 2)
    public void goToHomepage() {
        MainClassYTFlow.ytubeVideoEnd();
        System.out.println("Homepage and Goodbye");

    }

    
    @AfterClass
    public void endVideo() {
        MainClassYTFlow.quit();
        System.out.println("End of flow");
    }


}
