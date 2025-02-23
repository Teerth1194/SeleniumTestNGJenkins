import org.testng.annotations.Test;

public class AllTest extends Basetest{

        @Test
    public void test1(){
        System.out.println("Current env is "+ config.getEnv());
        System.out.println("Current url is "+ config.getUrl());
        System.out.println("Current browser is "+ config.getDriver());
    }
}
