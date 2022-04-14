package TestCheckMethods;


import org.testng.annotations.Test;

public class SecondTest implements catchAll{


    @Test(priority = 2)
    public void just(){
        System.out.println("1 we are in middle");
    }

    @Override
    @Test(priority = 2)
    public void first() {
        System.out.println("testFromSecondClass");
    }
}
