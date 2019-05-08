package zj.aware;

import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

@Component
public class MyEmbeddedValueResolverAware implements EmbeddedValueResolverAware {
    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        System.out.println("|EmbeddedValueResolverAware|param : StringValueResolver|component|");
    }
}
