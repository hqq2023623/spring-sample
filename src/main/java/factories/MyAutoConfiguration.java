package factories;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import zj.config.MyAutoProperties;

//在 spring-autoconfigure-metadata.properties 配置的话就不需要这个注解，可以减少@Configuration类的数量
//@org.springframework.context.annotation.Configuration
//把MyAutoProperties注入到spring容器
@EnableConfigurationProperties(MyAutoProperties.class)
@ConditionalOnClass(MyAutoProperties.class)
@ConditionalOnProperty(prefix="my", value="enable", matchIfMissing = true)
public class MyAutoConfiguration {

    private MyAutoProperties myAutoProperties;

    public MyAutoConfiguration(MyAutoProperties myAutoProperties) {
        this.myAutoProperties = myAutoProperties;
    }
}