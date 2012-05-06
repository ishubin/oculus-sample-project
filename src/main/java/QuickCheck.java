import java.io.File;

import net.mindengine.oculus.experior.ExperiorConfig;
import net.mindengine.oculus.experior.suite.Suite;
import net.mindengine.oculus.experior.suite.SuiteRunner;
import net.mindengine.oculus.experior.suite.XmlSuiteParser;
import net.mindengine.oculus.experior.test.TestRunnerConfiguration;


public class QuickCheck {

    public static void main(String[] args) throws Exception {
        Suite suite = XmlSuiteParser.parse(new File("/Users/ishubin/temp/suite.xml"));
        SuiteRunner suiteRunner = new SuiteRunner();
        
        TestRunnerConfiguration config = ExperiorConfig.getInstance().getTestRunnerConfiguration();
        suiteRunner.setTestRunnerConfiguration(config);
        suiteRunner.setSuite(suite);
        
        suiteRunner.runSuite();
    }
}
