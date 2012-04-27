package net.mindengine.oculus.test.sample.flows.authorization;

import static net.mindengine.oculus.test.sample.flows.authorization.Flows.OCULUS_SAMPLE_PROJECT_FLOW;
import net.mindengine.oculus.experior.annotations.Action;
import net.mindengine.oculus.experior.annotations.Test;
import net.mindengine.oculus.experior.framework.test.OculusTest;
import net.mindengine.oculus.experior.reporter.ReportDesign;
import net.mindengine.oculus.experior.reporter.ReportIcon;

@Test(name = "Logout", project = OCULUS_SAMPLE_PROJECT_FLOW)
public class Logout extends OculusTest {

    @Action
    public void logout() {
        report.info("Click " + ReportDesign.bold("Logout") + " link").icon(ReportIcon.UI_CLICK);
    }
}
