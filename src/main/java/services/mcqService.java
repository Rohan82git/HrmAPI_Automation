package services;

import Base.ApplicationConfiguration;
import Entity.MCQPOJO.mcqPOJO.MCQRootPayload;
import io.restassured.response.Response;
import utility.JavaToJson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Base.API_ControlActions;

import static Entity.MCQPOJO.mcqPOJO.MCQRootPayload.*;

public class mcqService extends API_ControlActions {

    public Response submitQCQquestion(String candidateScreeningId , String questionId, String jobRoleId, String experience,
                                      String jobApplicationId, String candidateAnswer)  {
        MCQRootPayload mcqrootpayload = builder()
                .questionId(questionId)
                .type("mcq")
                .skill("api")
                .jobRoleId(jobRoleId)
                .experience(experience)
                .jobApplicationId(jobApplicationId)
                .timeSpent(9)
                .fullScreenExitCount(0)
                .tabSwitchCount(0)
                .candidateAnswer(candidateAnswer)
                .copyPasteAnalysis(CopyPasteAnalysis.builder()
                        .totalDuration(257)
                        .totalCopyEvents(0)
                        .optionCopyCount(0)
                        .fullQuestionCopyCount(0)
                        .hasQuestionCopying(false)
                        .hasOptionCopying(false)
                        .hasFullQuestionCopying(false)
                        .riskScore(0)
                        .riskLevel("low")
                        .isSuspicious(false)
                        .sessionId("copypaste_1766289737523_yq3hhq6i6")
                        .analysisVersion("2.0-mcq-focused")
                        .timestamp("2025-12-21T04:02:25.095Z")
                        .copyBreakdown(
                                CopyBreakdown.builder()
                                        .questionCopies(
                                                QuestionCopies.builder()
                                                        .count(0)
                                                        .averageLength(0)
                                                        .timestamps(new java.util.ArrayList<>(List.of()))
                                                        .build()
                                        )
                                        .optionCopies(
                                                OptionCopies.builder()
                                                        .count(0)
                                                        .averageLength(0)
                                                        .timestamps(new java.util.ArrayList<>(List.of()))
                                                        .build()
                                        )
                                        .fullQuestionCopies(
                                                FullQuestionCopies.builder()
                                                        .count(0)
                                                        .averageLength(0)
                                                        .timestamps(new java.util.ArrayList<>(List.of()))
                                                        .build()
                                        )
                                        .build()
                         )
                        .build()
                )
                .hasCopyPasteAnalysis(true)
                .build();


        String payload = JavaToJson.convertToJson(mcqrootpayload);
        Map<String , String>headers =  new HashMap<>();
        headers.put("Content-Type","application/json");
        headers.put("Accept","application/json");
        setHeaders(headers);
        setBody(payload);

        return executePATCHAPI("/api/candidateScreening/update-candidate-result/"+candidateScreeningId);

    }
}
