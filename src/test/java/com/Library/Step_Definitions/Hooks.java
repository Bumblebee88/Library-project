package com.Library.Step_Definitions;

import com.Library.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(Scenario scenario){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(scenario.getSourceTagNames());
     scenario.getSourceTagNames().forEach(tag->{
          if(tag.contains("opera")){
              Driver.getDriver("opera");
          }
      });



        System.out.println(":::Starting Automation::::");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

  /*  @Before("@db")
    public  void dbSetup(){
        System.out.println(":::Connecting to the database");
    }

       @After("@db")
     public  void dbTearDown(){
        System.out.println(":::Disconnecting to the database");
    }



   */




    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        Driver.closeDriver();
        System.out.println(":::End of test execution:::");
    }

}
