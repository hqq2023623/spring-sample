package zj.aware;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

@Component
public class MyMessageSourceAware implements MessageSourceAware {
    @Override
    public void setMessageSource(MessageSource messageSource) {
        System.out.println("|MessageSourceAware|param : MessageSource|component|");

    }
}
