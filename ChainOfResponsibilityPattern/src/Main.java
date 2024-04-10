import Authentication.*;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> m = new HashMap<>();
        m.put("vaibhav","1234");
        m.put("kamal","1234");

        DataBase dataBase = new DataBase(m);
        BaseHandler baseHandler = new UserExistsHandler(dataBase)
                .setBaseHandler(new ValidPasswordHandler(dataBase));

        AuthService authService = new AuthService(baseHandler);

        authService.logIn("kamal","1234");


    }
}