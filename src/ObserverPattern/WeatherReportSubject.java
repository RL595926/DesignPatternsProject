package ObserverPattern;

/**
 * 抽象主题-Subject
 * 被观察者-Observable，这里是是个接口，将所有观察者的引用保存起来
 * ——定义了观察者订阅、取消订阅和状态发生变化时的通知方法
 **/
public interface WeatherReportSubject {
    void add(PersonObserver observer);

    void remove(PersonObserver observer);

    void notifyWeather(String weather,int temperature);
}
