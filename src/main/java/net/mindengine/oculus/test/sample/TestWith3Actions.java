package net.mindengine.oculus.test.sample;
import net.mindengine.oculus.experior.annotations.Action;
import net.mindengine.oculus.experior.annotations.Test;



@Test(name="Test With 3 Actions", project="sample-project")
public class TestWith3Actions {

    @Action(name="Action 1", next="action2")
    public void action1() {
        System.out.println("action 1");
    }
    
    @Action(name="Action 2", next="action3")
    public void action2() {
        System.out.println("action 2");
    }
    
    @Action(name="Action 3")
    public void action3() {
        System.out.println("action 3");
    }
}
