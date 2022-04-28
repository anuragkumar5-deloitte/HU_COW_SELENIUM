package TestCases;
import PageObject.addreviewpage;
import org.testng.annotations.Test;

public class addreviewtest extends Base
{
    addreviewpage addreviewpage = new addreviewpage();



//    @BeforeTest
//    public void setUp(){
//        driverCreation();
//        addreviewpage = new addreviewpage();
//    }

//    @Test(priority = 1)
//    public void login() {
//        try {
//            addreviewpage.loginscreen();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    @Test(priority = 18)
    public void addareview()
    {
        try
        {
            addreviewpage.addreview();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}