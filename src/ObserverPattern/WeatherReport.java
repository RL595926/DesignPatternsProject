package ObserverPattern;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 具体主题-ConcreteSubject
 * Subject（被观察者的实现类），将有关状态存入到具体的观察者对象中，
 * ——持有Observer的集合，给所有注册的观察者发送通知
 * **/
public class WeatherReport implements WeatherReportSubject{

    CopyOnWriteArrayList<PersonObserver> observersList = new CopyOnWriteArrayList<>();

    @Override
    public void add(PersonObserver observer) {
        if (!observersList.contains(observer)){
            observersList.add(observer);
        }
    }

    @Override
    public void remove(PersonObserver observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifyWeather(String weather, int temperature) {
        for(PersonObserver personObserver : observersList){
            personObserver.prepare(weather,temperature);
        }
    }
}
