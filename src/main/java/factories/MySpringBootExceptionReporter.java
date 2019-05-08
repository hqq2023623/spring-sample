package factories;

import org.springframework.boot.SpringBootExceptionReporter;
import org.springframework.context.ConfigurableApplicationContext;

public class MySpringBootExceptionReporter implements SpringBootExceptionReporter {

    private ConfigurableApplicationContext configurableApplicationContext;

    public MySpringBootExceptionReporter() {
    }

    public MySpringBootExceptionReporter(ConfigurableApplicationContext configurableApplicationContext) {
        this.configurableApplicationContext = configurableApplicationContext;
    }

    @Override
    public boolean reportException(Throwable failure) {
        System.out.println("SpringBootExceptionReporter : Report a startup failure to the user.|invoke when SpringApplication.run throws exception");
        return true;
    }
}
