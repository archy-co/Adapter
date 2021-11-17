package db;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DataBaseTest {


    DataBase db_;

    @Before
    public void setUp() {
        db_ = new DataBase();
    }

    @Test
    public void getUserData() {
        Assert.assertEquals("hello", db_.getUserData());
    }

    @Test
    public void getStatisticalData() {
        Assert.assertEquals("hello2", db_.getStatisticalData());
    }
}