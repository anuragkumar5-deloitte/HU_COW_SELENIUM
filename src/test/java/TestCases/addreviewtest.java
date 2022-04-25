package TestCases;
import PageObject.addreviewpage;

public class addreviewtest
{
    addreviewpage addreviewpage;

    public void setAddreviewpage()
    {
        addreviewpage = new addreviewpage();
    }

    public void login() {
        try {
            addreviewpage.loginscreen();
            addreviewpage.login();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void explorescreen()
    {
        try
        {
            addreviewpage.explorescreen();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public void addreview()
    {
        try
        {
            addreviewpage.explorescreen();
            addreviewpage.gurugramcorner();
            addreviewpage.addreview();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
