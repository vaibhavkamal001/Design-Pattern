package Authentication;

public class AuthService {
    BaseHandler baseHandler;
    public AuthService(BaseHandler baseHandler){
        this.baseHandler = baseHandler;
    }

    public boolean logIn(String username, String password){
        if(baseHandler.handle(username,password)){
            System.out.println("Authorization was successful");
            return true;
        }
        return false;
    }
}
