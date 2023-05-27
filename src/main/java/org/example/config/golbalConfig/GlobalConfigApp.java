package org.example.config.golbalConfig;

import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GlobalConfigApp {

    private static AnnotationConfigApplicationContext context;

    private GlobalConfigApp() {
    }

    public static synchronized AnnotationConfigApplicationContext getContext() {
        if (context == null) {
            context = new AnnotationConfigApplicationContext(ProjectConfig.class);
            // Perform any necessary configuration or initialization
        }
        return context;
    }
}
