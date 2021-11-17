package facebook;

import facebook.FacebookUser;
import facebook.myFacebookUser;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.Date;

public class myFacebookUserTest {

    myFacebookUser myFbU;
    Date date = new Date();
    FacebookUser fbU = new FacebookUser("username@gmail.com", "USA", date);

    @Before
    public void setUp() {
        myFbU = new myFacebookUser(fbU);
    }

    @Test
    public void getCountry() {
        Assert.assertEquals(myFbU.getCountry(), "USA");
    }
}