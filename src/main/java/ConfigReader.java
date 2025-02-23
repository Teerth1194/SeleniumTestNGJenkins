import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private String url;
    private String driver;
    private String env;

    public String getUrl() {
        if (configReader("env").equalsIgnoreCase("production")){
            return configReader("url_prod");
        } else if (configReader("env").equalsIgnoreCase("staging")) {
            return configReader("url_stg");
        } else {
            return "unknown url";
        }
    }

    public String getEnv(){
        return configReader("env");
    }

    public String getDriver() {
        return configReader("driver");
    }

    public String configReader(String str){

        FileInputStream propFile = null;
        try {
            propFile = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");
            Properties prop = new Properties();
            prop.load(propFile);
            return prop.getProperty(str);

        } catch (Exception e) {
            System.out.println("Some exception occurred while reading config file");
            throw new RuntimeException(e);
        }
    }

}
