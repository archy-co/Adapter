package db;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AuthorizationTest {

    DataBase db_;
    Authorization auth;
    @Before
    public void setUp() {
        db_ = new DataBase();
        auth = new Authorization();
    }

    @Test
    public void authorize() {
        Assert.assertTrue(auth.authorize(db_));
    }

}