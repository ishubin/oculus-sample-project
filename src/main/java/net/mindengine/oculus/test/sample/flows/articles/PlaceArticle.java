package net.mindengine.oculus.test.sample.flows.articles;

import static net.mindengine.oculus.experior.reporter.ReportDesign.bold;
import static net.mindengine.oculus.experior.reporter.ReportDesign.string;
import static net.mindengine.oculus.experior.reporter.ReportIcon.UI;
import static net.mindengine.oculus.experior.reporter.ReportIcon.UI_CLICK;
import static net.mindengine.oculus.experior.reporter.ReportIcon.UI_TYPE;

import java.util.Date;

import net.mindengine.oculus.experior.annotations.Action;
import net.mindengine.oculus.experior.annotations.InputParameter;
import net.mindengine.oculus.experior.annotations.OutputParameter;
import net.mindengine.oculus.experior.annotations.Test;
import net.mindengine.oculus.experior.framework.test.OculusTest;
import net.mindengine.oculus.test.sample.flows.authorization.Flows;

@Test(name = "Place article", project = Flows.OCULUS_SAMPLE_PROJECT_FLOW)
public class PlaceArticle extends OculusTest {
    
    @InputParameter(defaultValue="")
    public String section;
    
    @InputParameter(defaultValue="")
    public String title;
    
    @InputParameter(defaultValue="")
    public String description;
    
    @OutputParameter
    public Long articleId;

    @Action(silent=true)
    public void placeArticle() {
        report.info("Click " + bold("Place article") + " link").icon(UI_CLICK);
        report.info("Select " + string(section) + " section").icon(UI);
        report.info("Type " + string(title) + " in " + bold("title") + " text-field").icon(UI_TYPE);
        report.info("Type " + string(description) + " in " + bold("description") + " text-field").icon(UI_TYPE);
        report.info("Click " + bold("Place article") + " link").icon(UI_CLICK);
        
        articleId = new Date().getTime();
    }
}
