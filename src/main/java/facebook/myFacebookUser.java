package facebook;

import user.User;

import java.util.Date;

public class myFacebookUser implements User {

    FacebookUser fbU;

    public myFacebookUser(FacebookUser fbU){
        this.fbU = fbU;
    }

    public String getCountry(){
        return fbU.getUserCountry();
    }

    public Date getLastActiveTime(){
        return fbU.getUserActiveTime();
    }
}
