import facebook.FacebookUser;
import facebook.myFacebookUser;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.Date;


public class MessageSenderTest {

    MessageSender mSender;
    myFacebookUser myFbU;
    Date date = new Date();
    FacebookUser fbU = new FacebookUser("username@gmail.com", "USA", date);

    @Before
    public void setUp() {
        mSender = new MessageSender();
        myFbU = new myFacebookUser(fbU);
    }

    @Test
    public void send() {
        Assert.assertTrue(mSender.send("You won! To claim your award, follow the link...", myFbU, "USA"));
        Assert.assertFalse(mSender.send("You won! To claim your award, follow the link...", myFbU, "China"));
    }

}