import user.User;

public class MessageSender {
    static boolean send(String text, User user, String country){
        if (user.getCountry() == country &&
            user.getLastActiveTime().getTime() >= (System.currentTimeMillis()/1000l) + 100*60*60)
        {
            return true;
        }
        return false;
    }
}
