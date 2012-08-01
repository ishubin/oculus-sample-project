package net.mindengine.sampleproject.tests;

import net.mindengine.oculus.experior.annotations.Action;
import net.mindengine.oculus.experior.annotations.DataSource;
import net.mindengine.oculus.experior.annotations.InputParameter;
import net.mindengine.oculus.experior.annotations.Test;
import net.mindengine.oculus.experior.exception.TestConfigurationException;
import net.mindengine.oculus.experior.exception.TestInterruptedException;
import net.mindengine.oculus.experior.test.TestRunner;
import net.mindengine.sampleproject.pages.MainPage;
import net.mindengine.selenus.web.Browser;

@Test(name="Login", project=SampleTest.OCULUS_SAMPLE_PROJECT)
public class LoginTest extends SampleTest {
    
    @InputParameter(defaultValue="testuser") 
    public String login;
    
    @InputParameter(defaultValue="test123")
    public String password;
    
    @DataSource(provider="browser") 
    public Browser browser;
    
    
    
    @Action(name="Login")
    public void login(@DataSource(dependencies={"browser"}) MainPage mainPage) {
        browser.open(SELENUS_SAMPLE_WEBSITE_URL);
        
        mainPage.loginLink.click();
        mainPage.loginPopup.waitForItToAppear();
    }
    
    public static void main(String[] args) throws TestConfigurationException, TestInterruptedException {
        TestRunner.runTest(LoginTest.class);
    }
    
}
