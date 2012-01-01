package net.mindengine.oculus.test.sample;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import net.mindengine.oculus.experior.annotations.Action;
import net.mindengine.oculus.experior.annotations.Test;
import net.mindengine.oculus.experior.annotations.events.AfterTest;
import net.mindengine.oculus.experior.annotations.events.BeforeTest;



@Test(name="Test With 3 Actions", project="sample-project")
public class TestWith3Actions {

    private StringBuffer buffer = new StringBuffer();
    
    @BeforeTest
    public void beforeTest() {
        buffer.append("[beforeTest]");
    }
    
    @AfterTest
    public void afterTest() throws IOException {
        buffer.append("[afterTest]");
        
        File file = new File("../../../../../data/logs/"+getClass().getName()+".log");
        file.createNewFile();
        FileUtils.writeStringToFile(file, buffer.toString());
    }
    
    @Action(name="Action 1", next="action2")
    public void action1() {
        System.out.println("action 1");
        buffer.append("[action1]");
    }
    
    @Action(name="Action 2", next="action3")
    public void action2() {
        System.out.println("action 2");
        buffer.append("[action2]");
    }
    
    @Action(name="Action 3")
    public void action3() {
        System.out.println("action 3");
        buffer.append("[action3]");
    }
}
