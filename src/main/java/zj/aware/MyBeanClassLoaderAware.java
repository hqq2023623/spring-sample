package zj.aware;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.stereotype.Component;

@Component
public class MyBeanClassLoaderAware implements BeanClassLoaderAware {

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("|BeanClassLoaderAware|param : ClassLoader|component|");
    }

}
