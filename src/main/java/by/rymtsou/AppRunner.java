package by.rymtsou;

import by.rymtsou.config.AppConfig;
import by.rymtsou.service.RandomService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppRunner {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        RandomService service = context.getBean(RandomService.class);
        service.simpleMethod();
        service.complexMethod();
        service.annotatedMethod();
    }
}
