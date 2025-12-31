package Base;

import constants.filePath;
import io.qameta.allure.util.PropertiesUtils;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import utility.PropertyUtil;


import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;



public class API_ControlActions {
private static RequestSpecBuilder requestSpecBuilder;
private PropertyUtil propertyUtil = new PropertyUtil(filePath.EnviromentConfiguratoinFilePath);

    public void RequestSpecBuilder(){
        if(requestSpecBuilder == null){
            requestSpecBuilder = new RequestSpecBuilder();
        }
    }

    protected  void setBody(String Body){
         RequestSpecBuilder();
         requestSpecBuilder.setBody(Body);
    }

    protected  void setHeader(String key ,String value){
        RequestSpecBuilder();
        requestSpecBuilder.addHeader(key, value);
    }
    protected void setHeaders(java.util.Map<String, String> headers){
        RequestSpecBuilder();
        requestSpecBuilder.addHeaders(headers);
    }

    protected void setBaseURI(String baseURI){
        RequestSpecBuilder();
        requestSpecBuilder.setBaseUri(baseURI);
    }

    public Response executePATCHAPI(String endPoint) {
        String baseURI = propertyUtil.getProperty(ApplicationConfiguration.StringEnv());
        Response response = given()
               .spec(requestSpecBuilder.build())
               .baseUri(baseURI)
               .when()
               .patch(endPoint)
               .then().extract().response();
         requestSpecBuilder = null;
         return response;
    }

}
