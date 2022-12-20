package ObserverPattern;

/**
 * 具体观察者-ConcreteObserver
 * 观察者的实现类，其中实现了接收到通知执行的具体方法，与Subject主题的状态进行关联
 * */
public class Person implements PersonObserver{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void prepare(String message, int temperature) {
        if (!name.equals("")){
            System.out.print(getName()+ " ：收到了WeatherApp通知-");
        }
        switch (message){
            case "rain":
                System.out.print("准备带伞-");
                if (temperature > 20){
                    System.out.println("并稍加了一点衣物！");
                }else{
                    System.out.println("并添加了保暖的衣物！");
                }
                break;
            case "wind":
                System.out.print("知道了大风天气-");
                if (temperature > 20){
                    System.out.println("所以稍加了一点衣物，想去放风筝！");
                }else{
                    System.out.println("所以添加了保暖的衣物！");
                }
                break;
            case "snow":
                System.out.println("计划在雪地打滚-并添加了很多保暖的衣物");
                break;
            default:
                System.out.print("知道了天气晴朗-");
                if (temperature > 20){
                    System.out.println("心情很好，跳了一段鸡你太美！");
                }else{
                    System.out.println("心情不多，添加了保暖的衣物！");
                }
        }
    }
}
