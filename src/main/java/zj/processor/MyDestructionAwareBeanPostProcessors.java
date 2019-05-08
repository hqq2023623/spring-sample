package zj.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyDestructionAwareBeanPostProcessors implements DestructionAwareBeanPostProcessor {

    @Override
    public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
        if(beanName.contains("my")) {
            String s = "|DestructionAwareBeanPostProcessor@postProcessBeforeDestruction|param : Object,%s|component|";
            System.out.println(String.format(s, beanName));
        }
    }


}
