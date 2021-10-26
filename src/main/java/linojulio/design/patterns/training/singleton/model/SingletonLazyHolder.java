package linojulio.design.patterns.training.singleton.model;

public class SingletonLazyHolder {

    private SingletonLazyHolder() {
        super();
    }

    private static class InstanceHolder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }
}
