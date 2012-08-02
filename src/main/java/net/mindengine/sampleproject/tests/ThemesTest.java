package net.mindengine.sampleproject.tests;

import net.mindengine.oculus.experior.annotations.Action;
import net.mindengine.oculus.experior.annotations.DataSource;
import net.mindengine.oculus.experior.annotations.Test;
import net.mindengine.oculus.experior.exception.TestConfigurationException;
import net.mindengine.oculus.experior.exception.TestInterruptedException;
import net.mindengine.oculus.experior.test.TestRunner;
import net.mindengine.sampleproject.pages.ThemesPage;
import net.mindengine.selenus.web.Browser;

@Test(name="Themes test", project=SampleTest.OCULUS_SAMPLE_PROJECT)
public class ThemesTest extends SampleTest {

    @DataSource
    public Browser browser;
    
    @Action(name="Check themes links")
    public void checkThemesLinks(@DataSource(dependencies={"browser"}) ThemesPage themesPage) {
        browser.open(SELENUS_SAMPLE_WEBSITE_URL);
        
        themesPage.menu.themesLink.click();
        
        report.branch("validation", "Verify all themes links");
        themesPage.themesLinks.assertThat().size().is(3);
        themesPage.themesLinks.get(0).verifyThat().attribute("href").endsWith("/themes/1");
        themesPage.themesLinks.get(0).verifyThat().text().is("C++");
        
        themesPage.themesLinks.get(1).verifyThat().attribute("href").endsWith("/themes/2");
        themesPage.themesLinks.get(1).verifyThat().text().is("Java");
        
        themesPage.themesLinks.get(2).verifyThat().attribute("href").endsWith("/themes/3");
        themesPage.themesLinks.get(2).verifyThat().text().is("PHP");
        
    }
    
}
