import org.testng.annotations.Test;

public class firstTestCase {

    @Test(priority = 2)
    void setup()
    {
        System.out.println("This is Setup Test");
    }
    @Test(priority = 1)
    void login(){
        System.out.println("this is login test");
    }

    @Test(priority = 3)
    void teardown(){
        System.out.println("closing btroser");
    }
}
