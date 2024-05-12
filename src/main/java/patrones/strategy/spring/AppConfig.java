package patrones.strategy.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import patrones.strategy.patron.AddOperation;
import patrones.strategy.patron.Operation;
import patrones.strategy.patron.SubtractOperation;

@Configuration
public class AppConfig {
    @Bean
    public Operation addOperation() {
        return new AddOperation();
    }

    @Bean
    public Operation subtractOperation() {
        return new SubtractOperation();
    }
}

