package zj.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    /**
     * AOP AspectJAwareAdvisorAutoProxyCreator#postProcessBeforeInstantiation
     * 当返回值不为null时，就会用这个返回的object作为实例化的结果
     * @param beanClass
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if(beanName.contains("my")) {
            System.err.println("|MyInstantiationAwareBeanPostProcessor@postProcessBeforeInstantiation|AOP");
        }
        return null;
    }

    /**
     * 返回null表示有自定义的处理，不处理直接返回pvs
     * @param pvs
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        if(beanName.contains("my")) {
            System.err.println("|MyInstantiationAwareBeanPostProcessor@postProcessProperties|PropertyValues ");
        }
        return pvs;
    }
}
