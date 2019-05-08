package zj.aware;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class MyResourceLoaderAware implements ResourceLoaderAware {
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        System.out.println("|ResourceLoaderAware|param : ResourceLoader|component|");
    }
}
