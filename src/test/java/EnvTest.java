import org.testng.annotations.Test;

public class EnvTest extends Basetest{

    @Test
    public void testEnv(){
        System.out.println("Current env is "+ config.getEnv());
    }
}
