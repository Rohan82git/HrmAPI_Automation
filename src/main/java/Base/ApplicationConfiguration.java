package Base;

import org.testng.annotations.Test;

public class ApplicationConfiguration {

    public static String StringEnv(){
        String env = System.getProperty("enviroment");
        if(env == null || env.isEmpty()) {
            env = "qa";
        }
       System.out.println("The environment is set to: " + env.toUpperCase());
        return env;
    }

}
