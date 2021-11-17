package twitter;

import facebook.FacebookUser;
import user.User;

import java.util.Date;

public class myTwitterUser implements User {

    TwitterUser twU;

    public myTwitterUser(TwitterUser twU){
        this.twU = twU;
    }

    public String getCountry(){
        return twU.getCountry();
    }

    public Date getLastActiveTime(){
        return twU.getLastActiveTime();
    }
}
