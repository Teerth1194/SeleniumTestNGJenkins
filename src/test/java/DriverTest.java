import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DriverTest extends Basetest{

    @Test
    @Parameters("BROWSER")
    public void testDriver(){

        String browser = System.getProperty("BROWSER", config.getDriver());

        if (browser.equalsIgnoreCase("chrome")){
            System.out.println("Current browser is chrome");
        } else if (browser.equalsIgnoreCase("edge")) {
            System.out.println("Current browser is edge");
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.out.println("Current browser is firefox");
        } else {
            System.out.println("Current browser is invalid");
        }
    }

}
