package Subscriber;

public interface Observer {
    public void update(String msg);
    
    public void subscribeChat(String chatId);
    
    public void unsubscribeChat(String chatId);
}
