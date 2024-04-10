package Singleton;

import java.util.Objects;

public class ThreadSafeSingleton {
    private Integer count;
    static private volatile ThreadSafeSingleton threadSafeSingleton;

    private ThreadSafeSingleton() {
        this.count = 0;
    }

    public static ThreadSafeSingleton getInstance() {
        if (Objects.isNull(threadSafeSingleton)) {
            synchronized (ThreadSafeSingleton.class) {
                if (Objects.isNull(threadSafeSingleton)) {
                    threadSafeSingleton = new ThreadSafeSingleton();
                }
            }
        }
        return threadSafeSingleton;
    }

    public Integer increase() {
        this.count += 1;
        return this.count;
    }

    public Integer decrease() {
        this.count -= 1;
        return this.count;
    }

}
