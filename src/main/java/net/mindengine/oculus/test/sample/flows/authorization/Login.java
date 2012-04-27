package net.mindengine.oculus.test.sample.flows.authorization;

import static net.mindengine.oculus.experior.reporter.ReportDesign.bold;
import static net.mindengine.oculus.experior.reporter.ReportDesign.string;
import static net.mindengine.oculus.experior.reporter.ReportIcon.UI_CLICK;
import static net.mindengine.oculus.test.sample.flows.authorization.Flows.OCULUS_SAMPLE_PROJECT_FLOW;
import net.mindengine.oculus.experior.annotations.Action;
import net.mindengine.oculus.experior.annotations.InputParameter;
import net.mindengine.oculus.experior.annotations.Test;
import net.mindengine.oculus.experior.framework.test.OculusTest;
import net.mindengine.oculus.experior.reporter.ReportIcon;


@Test(name = "Login", project = OCULUS_SAMPLE_PROJECT_FLOW)
public class Login extends OculusTest {

    @InputParameter(defaultValue="")
    protected String email;
    
    @InputParameter(defaultValue="")
    protected String password;
    
    @Action
    public void login() {
        report.info("Click " + bold("Login") + " page").icon(UI_CLICK);
        report.info("Type " + string(email) + " in " + bold("email") + " text-field").icon(ReportIcon.UI_TYPE);
        report.info("Type " + string(password) + " in " + bold("password") + " text-field").icon(ReportIcon.UI_TYPE);
        report.info("Click " + bold("Login") + " button").icon(UI_CLICK);
    }
}
