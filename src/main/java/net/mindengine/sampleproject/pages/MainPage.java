package net.mindengine.sampleproject.pages;

import org.openqa.selenium.support.FindBy;

import net.mindengine.selenus.annotations.Named;
import net.mindengine.selenus.web.Page;
import net.mindengine.selenus.web.objects.Link;
import net.mindengine.selenus.web.objects.WebLayout;
import net.mindengine.selenus.web.objects.form.Button;
import net.mindengine.selenus.web.objects.form.TextField;

@Named("Main")
public class MainPage extends Page {

    @Named("Login") @FindBy(id="loginLink")
    public Link loginLink;
    
    @Named("Login") @FindBy(id="login-popup")
    public LoginPopup loginPopup;
    
    
    public static class LoginPopup extends WebLayout {
        
        @Named("Login") @FindBy(xpath="//input[name='login']")
        public TextField loginText;
        
        @Named("Password") @FindBy(xpath="//input[@name='password']")
        public TextField passwordText;
        
        @Named("Login") @FindBy(xpath="//input[@value='login']")
        public Button loginButton;
        
        @Named("Cancel") @FindBy(xpath="//a[@class='cancel']")
        public Link cancelLink;
    }
}
