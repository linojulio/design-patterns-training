package linojulio.design.patterns.training.singleton;

import linojulio.design.patterns.training.singleton.model.SingletonEager;
import linojulio.design.patterns.training.singleton.model.SingletonLazy;
import linojulio.design.patterns.training.singleton.model.SingletonLazyHolder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    SingletonLazy lazySingleton = SingletonLazy.getInstance();
    SingletonLazy lazySingleton2 = SingletonLazy.getInstance();
    SingletonEager eagerSingleton = SingletonEager.getInstance();
    SingletonEager eagerSingleton2 = SingletonEager.getInstance();
    SingletonLazyHolder lazyHolderSingleton = SingletonLazyHolder.getInstance();
    SingletonLazyHolder lazyHolderSingleton2 = SingletonLazyHolder.getInstance();

    @Test
    public void singletonInstanceShouldBeUnique() {
        Assertions.assertSame(lazySingleton, lazySingleton2);
        Assertions.assertSame(eagerSingleton, eagerSingleton2);
        Assertions.assertSame(lazyHolderSingleton, lazyHolderSingleton2);
    }

}
