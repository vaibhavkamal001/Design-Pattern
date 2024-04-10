package Singleton;

import java.util.Objects;

public class LazySingleton {
    private LazySingleton lazySingleton;
    private LazySingleton(){
    }
    public LazySingleton getInstance(){
        if(Objects.isNull(lazySingleton)){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
