package Subscriber;

public interface Observable {
    public void subscribeStudent(Observer o);
   
    public void unsubscribeStudent(Observer o);
    
    public void notifyStudent();
}
