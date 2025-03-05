package by.rymtsou.service;

import by.rymtsou.annotation.LogAnnotation;
import org.springframework.stereotype.Service;

@Service
public class RandomService {

    public void simpleMethod() {
        System.out.println("Simple method...");
    }

    public void complexMethod() throws InterruptedException {
        System.out.println("Complex method...");
        Thread.sleep(1500);
        System.out.println("Complex method finished.");
    }

    @LogAnnotation
    public void annotatedMethod() throws InterruptedException {
        System.out.println("Annotated method...");
        Thread.sleep(500);
        System.out.println("Annotated method finished.");
    }
}
