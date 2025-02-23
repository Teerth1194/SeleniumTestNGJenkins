import org.testng.annotations.Test;

public class DriverTest extends Basetest{

    @Test
    public void testDriver(){
        System.out.println("Current browser is "+ config.getDriver());
    }

}
