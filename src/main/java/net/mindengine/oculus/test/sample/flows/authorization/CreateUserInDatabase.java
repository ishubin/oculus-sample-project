package net.mindengine.oculus.test.sample.flows.authorization;

import static net.mindengine.oculus.experior.reporter.ReportDesign.bold;
import static net.mindengine.oculus.experior.reporter.ReportDesign.string;
import static net.mindengine.oculus.test.sample.flows.authorization.Flows.OCULUS_SAMPLE_PROJECT_FLOW;

import java.util.Date;

import net.mindengine.oculus.experior.annotations.Action;
import net.mindengine.oculus.experior.annotations.InputParameter;
import net.mindengine.oculus.experior.annotations.OutputParameter;
import net.mindengine.oculus.experior.annotations.Test;
import net.mindengine.oculus.experior.framework.test.OculusTest;
import net.mindengine.oculus.experior.reporter.ReportIcon;

@Test(name = "Create user in Database", project = OCULUS_SAMPLE_PROJECT_FLOW)
public class CreateUserInDatabase extends OculusTest {
    
    @InputParameter(defaultValue="")
    protected String prefix;
    
    @OutputParameter
    protected Long userId;
    
    @OutputParameter
    protected String email;
    
    @OutputParameter
    protected String password;
    
    
    @Action(silent=true)
    public void createUserInDb() {
        userId = generateUniqueId();
        email = prefix + Long.toString(userId) + "@mymail";
        password = "P@ssw0rd";
        
        report.info("Created user with email = " + string(email) + ", password = " + string(password) + ", userId = ").icon(ReportIcon.INFO);
        report.info("Using database " + bold("dbmaster1")).debug(true);
        report.info("insert into users").debug(true);
    }

    private Long generateUniqueId() {
        return new Date().getTime();
    }
}
