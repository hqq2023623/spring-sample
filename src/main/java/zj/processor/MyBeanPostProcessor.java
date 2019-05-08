package zj.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.contains("my")) {
            String s = "|BeanPostProcessor@postProcessBeforeInitialization|param : Object,%s|component|";
            System.out.println(String.format(s, beanName));
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.contains("my")) {
            String s = "|BeanPostProcessor@postProcessAfterInitialization|param : Object,%s|component|";
            System.out.println(String.format(s, beanName));
        }
        return bean;
    }
}
