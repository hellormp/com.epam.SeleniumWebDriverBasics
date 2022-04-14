package TestCheckMethods;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainTest {

    @BeforeTest
    public void first(){
        System.out.println("i'm first");
    }

    @Test(priority = 0)
    public void secound(){
        System.out.println("second");
    }

}
