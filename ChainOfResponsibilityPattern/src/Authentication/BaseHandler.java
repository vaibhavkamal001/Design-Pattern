package Authentication;

public abstract class BaseHandler {
    private BaseHandler next;
    public BaseHandler setBaseHandler(BaseHandler next){
        this.next = next;
        return next;
    }

    public abstract boolean handle(String username,String password);

    protected boolean HandleNext(String username,String password){
        if(next==null){
            return true;
        }
        return next.HandleNext(username,password);
    }
}
