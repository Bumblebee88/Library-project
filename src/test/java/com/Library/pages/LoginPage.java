package com.Library.pages;

import com.Library.utils.ConfigurationReader;
import com.Library.utils.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@id='inputEmail']")
    private WebElement emailAddress;

    @FindBy(xpath = "//input[@id='inputPassword']")
    private WebElement password;

    @FindBy(xpath = "//button[contains(text(),'Sign in')]" )
    private WebElement signInButton;

    @FindBy(xpath = "//div[@id='inputEmail-error']")
    private WebElement warningMessage;

    @FindBy(xpath = "//header/nav[1]/a[1]")
    private WebElement pageSubTitle;


    public String getPageSubTitleText(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfAllElements());
        return pageSubTitle.getText();
    }

    public String getWarningMessage(){
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return warningMessage.getText().trim();
    }


    public void login(){
        String studentValue = ConfigurationReader.getProperty("email1");
        String passwordValue = ConfigurationReader.getProperty("password1");
        emailAddress.sendKeys(studentValue);
        password.sendKeys(passwordValue);
        signInButton.click();
    }

    public void login(String student){
        String emailValue="";
        String passwordValue= "";

        if(student.equalsIgnoreCase("student91")){
            emailValue = ConfigurationReader.getProperty("email1");
            passwordValue = ConfigurationReader.getProperty("password1");
        }else if (student.equalsIgnoreCase("student92")){
            emailValue = ConfigurationReader.getProperty("email2");
            passwordValue = ConfigurationReader.getProperty("password2");
        }else {
            System.out.println("Enter the right credentials");
        }

        emailAddress.sendKeys(emailValue);
        password.sendKeys(passwordValue, Keys.ENTER);

    }


}
