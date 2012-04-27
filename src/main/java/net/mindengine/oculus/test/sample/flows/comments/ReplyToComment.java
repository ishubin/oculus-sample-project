package net.mindengine.oculus.test.sample.flows.comments;

import static net.mindengine.oculus.experior.reporter.ReportDesign.bold;
import static net.mindengine.oculus.experior.reporter.ReportDesign.string;
import static net.mindengine.oculus.experior.reporter.ReportDesign.url;
import static net.mindengine.oculus.experior.reporter.ReportIcon.OPEN;
import static net.mindengine.oculus.experior.reporter.ReportIcon.UI_CLICK;
import static net.mindengine.oculus.experior.reporter.ReportIcon.UI_TYPE;
import static net.mindengine.oculus.test.sample.flows.authorization.Flows.OCULUS_SAMPLE_PROJECT_FLOW;

import java.util.Date;

import net.mindengine.oculus.experior.annotations.Action;
import net.mindengine.oculus.experior.annotations.InputParameter;
import net.mindengine.oculus.experior.annotations.OutputParameter;
import net.mindengine.oculus.experior.annotations.Test;
import net.mindengine.oculus.experior.framework.test.OculusTest;

@Test(name = "Reply to a comment", project = OCULUS_SAMPLE_PROJECT_FLOW)
public class ReplyToComment extends OculusTest {

    @InputParameter(defaultValue = "0")
    public Long articleId;
    
    @InputParameter(defaultValue = "0")
    public Long originCommentId;
    
    @InputParameter(defaultValue = "Test comment")
    public String comment;
    
    @OutputParameter
    public Long commentId;

    @Action
    public void placeComment() { 
        report.info("Open " + url("http://localapp/article/" + articleId)).icon(OPEN);
        report.info("Click " + bold("Reply") + " button for " + originCommentId + " comment");
        report.info("Type " + string(comment) + " to " + bold("comment") + " text-field" ).icon(UI_TYPE);
        report.info("Click " + bold("Post comment") + "button").icon(UI_CLICK);
        
        commentId = new Date().getTime();
    }
}