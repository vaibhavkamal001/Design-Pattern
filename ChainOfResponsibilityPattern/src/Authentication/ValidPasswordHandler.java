package Authentication;

public class ValidPasswordHandler extends BaseHandler{
    DataBase dataBase;

    public ValidPasswordHandler(DataBase dataBase){
        this.dataBase = dataBase;
    }
    @Override
    public boolean handle(String username, String password) {
        if(!dataBase.isValidPassword(username,password)){
            System.out.println("Unauthorized access");
            return false;
        }
        return HandleNext(username,password);
    }
}
