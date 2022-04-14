package TestCheckMethods;


public class AfterTest implements catchAll{

    @org.testng.annotations.AfterTest
    public void last(){
        System.out.println("lastTC");
    }

    @org.testng.annotations.AfterTest
    @Override
    public void first() {
        System.out.println("testFromAfterClass");
    }
}
