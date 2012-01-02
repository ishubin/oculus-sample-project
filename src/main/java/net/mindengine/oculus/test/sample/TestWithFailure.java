package net.mindengine.oculus.test.sample;

import net.mindengine.oculus.experior.annotations.Action;
import net.mindengine.oculus.experior.annotations.Test;

@Test(name="TestWithFailure", project="sample-project")
public class TestWithFailure {

    @Action(name="action")
    public void action() throws Exception {
        throw new Exception("Error from test");
    }
}
