package db;

public class DataBase extends db.БазаДаних {
    public String getUserData() {
        return super.отриматиДаніКористувача();
    }
    public String getStatisticalData () {
        return super.отриматиСтатистичніДані();
    }
}
