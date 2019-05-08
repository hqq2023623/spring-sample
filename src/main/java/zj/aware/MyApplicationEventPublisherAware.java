package zj.aware;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationEventPublisherAware implements ApplicationEventPublisherAware {
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        System.out.println("|ApplicationEventPublisherAware|param : ApplicationEventPublisher|component|");
    }
}
