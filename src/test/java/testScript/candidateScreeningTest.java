package testScript;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.mcqService;

public class candidateScreeningTest {

    @Test
    public void candidatTestMCQScreening() {
        mcqService mcqServiceTest = new mcqService();
        Response submitMCQResponse = mcqServiceTest.submitQCQquestion(
                "694770d452e582fefe7e1ebc",
                "692d3aee3d9838750c2d6520",
                "68943b744df518afa9442034",
                "4",
                "69476ed0c41f0cc9ce8110f0",
                "SignatureException");
        Assert.assertEquals(submitMCQResponse.statusCode(),200,"Expected HTTP 200 when submitting MCQ answer");
    }
}
