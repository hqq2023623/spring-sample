package zj.aware;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MyEnvironmentAware implements EnvironmentAware {

    @Override
    public void setEnvironment(Environment environment) {
        System.out.println("|EnvironmentAware|param : Environment|component|");
    }

}
