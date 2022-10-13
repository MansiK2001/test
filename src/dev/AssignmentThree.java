package dev;


import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class AssignmentThree {


    FirefoxDriver driver;
    String url ="https://qatechhub.com";
    public void invokeBrowser() {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\VICTUS\\Downloads\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url);
    }

    public void verifyPageTitle(){
        String expectedTitle = "QA Automation Tools trainings.";
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");

        }else {
            System.out.println("FAIL");
        }

    }

    public void navigateCommands(){
        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();
        String urlFromWebpage = driver.getCurrentUrl();
        System.out.println(urlFromWebpage);
        driver.navigate().forward();
        driver.navigate().refresh();



    }

    public void closeBrowser(){
        driver.close();
    }

    public static void main(String[] args) {
        AssignmentThree fire =new AssignmentThree();
        fire.invokeBrowser();
        fire.verifyPageTitle();
        fire.navigateCommands();
        fire.closeBrowser();

    }

}
//a