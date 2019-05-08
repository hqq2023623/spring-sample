package zj.factories;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class MySpringApplicationRunListener implements SpringApplicationRunListener {

    private SpringApplication springApplication;

    private String[] args;

    public MySpringApplicationRunListener() {
    }

    public MySpringApplicationRunListener(SpringApplication springApplication, String[] args) {
        this.springApplication = springApplication;
        this.args = args;
    }

    @Override
    public void starting() {
        System.out.println("SpringApplicationRunListener starting");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        System.out.println("SpringApplicationRunListener environmentPrepared");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("SpringApplicationRunListener contextPrepared");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("SpringApplicationRunListener contextLoaded");
    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        System.out.println("SpringApplicationRunListener started");
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        System.out.println("SpringApplicationRunListener running");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("SpringApplicationRunListener failed");
    }

}
