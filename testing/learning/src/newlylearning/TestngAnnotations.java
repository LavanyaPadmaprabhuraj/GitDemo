package newlylearning;

import org.testng.annotations.*;


public class TestngAnnotations {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @Test
    public void testMethod() {
        System.out.println("Test Method");
    }
    
    @Test(invocationCount = 3)
    public void goTo()
    {
    	System.out.println("execute 5 times");
    }
    
    @DataProvider(name = "dataProvider")
    public Object[][] dataProvider() {
      return new Object[][] {
        {"username1", "password1"},
        {"username2", "password2"}
      };
    }

    @Test(dataProvider = "dataProvider")
    public void testExample3(String username, String password) {
      // Test code here
    }
}


