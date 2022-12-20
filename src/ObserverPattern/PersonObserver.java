package ObserverPattern;

/**
 * 抽象观察者-Observer
 * 为所有观察者定义一个接口，定义了观察者接收事件通知后需要执行的方法
 */
public interface PersonObserver {
    void prepare(String message,int temperature);
}
