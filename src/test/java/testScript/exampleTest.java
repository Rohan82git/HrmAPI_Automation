package testScript;

import org.testng.annotations.Test;

public class exampleTest {

    public static String StringEnv(){
        String env = System.getProperty("enviroment");
        if(env == null || env.isEmpty()) {
            env = "dev";
        }
        System.out.println("The environment is set to: " + env.toUpperCase());
        return env;
    }

    @Test
    public void testEnvironment(){
        StringEnv();
    }
}
