package by.rymtsou.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("by.rymtsou")
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
}
