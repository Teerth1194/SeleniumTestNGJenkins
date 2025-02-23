import org.testng.annotations.Test;

public class UrlTest extends Basetest{

    @Test
    public void testUrl() {
        System.out.println("Current url is " + config.getUrl());
    }
}
