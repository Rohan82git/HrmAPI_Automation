package services;

import Entity.Vedio.generateURLPOJO.generateURL_Root;

public class vedioService {

    public void submitVedioAnswer(String questionId, String jobRoleId, String experience , String jobApplicationId , String candidateAnswer) {


    }

    public void AnalyzeVedioAnswer(String vedioPath) {

    }
    public void uploadVediofileToAsure(String vedioPath) {
    //PUT
    }

    public void generateVedioURL(String originalFilename, String fileType, String mimeType){
    //POST
        generateURL_Root generateURLPayload = generateURL_Root.builder()
                .originalFilename(originalFilename)
                .fileType(fileType)
                .mimeType(mimeType)
                .build();
    }
}
