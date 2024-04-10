package Authentication;

import java.util.logging.Handler;

public class UserExistsHandler extends BaseHandler {
    DataBase dataBase;

    public UserExistsHandler(DataBase dataBase){
        this.dataBase = dataBase;
    }
    @Override
    public boolean handle(String username, String password) {
        if(!dataBase.isValidUser(username)){
            System.out.println("Unauthorized access");
            return false;
        }
        return HandleNext(username,password);
    }
}
