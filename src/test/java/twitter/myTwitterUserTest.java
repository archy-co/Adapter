package twitter;

import facebook.FacebookUser;
import facebook.myFacebookUser;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.Date;

public class myTwitterUserTest {

    myTwitterUser myTwU;
    Date date = new Date();
    TwitterUser twU = new TwitterUser("username@gmail.com", "USA", date);

    @Before
    public void setUp() {
        myTwU = new myTwitterUser(twU);
    }

    @Test
    public void getCountry() {
        Assert.assertEquals(myTwU.getCountry(), "USA");
    }
}
