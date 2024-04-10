package Authentication;

import java.util.HashMap;

public class DataBase {
    private final HashMap<String,String> m;

    public DataBase(HashMap<String, String> m) {
        this.m = m;
    }

    public boolean isValidUser(String username){
        return m.containsKey(username);
    }

    public boolean isValidPassword(String username, String password){
        return password.equals(m.get(username));
    }
}
