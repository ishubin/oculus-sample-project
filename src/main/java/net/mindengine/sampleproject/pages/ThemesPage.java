package net.mindengine.sampleproject.pages;

import org.openqa.selenium.support.FindBy;

import net.mindengine.selenus.annotations.Named;
import net.mindengine.selenus.annotations.UseCache;
import net.mindengine.selenus.web.objects.Link;
import net.mindengine.selenus.web.objects.PageObjectList;

@Named("Themes")
public class ThemesPage extends MainPage {

    @Named("Themes") @FindBy(xpath="//div[@id='content']//ul/li/a")
    @UseCache
    public PageObjectList<Link> themesLinks;
}
