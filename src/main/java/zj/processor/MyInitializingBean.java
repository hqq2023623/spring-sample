package zj.processor;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class MyInitializingBean implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("|InitializingBean@afterPropertiesSet|param : void|component|");
    }

}