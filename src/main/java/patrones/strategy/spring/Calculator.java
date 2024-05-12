package patrones.strategy.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import patrones.strategy.patron.Operation;


public class Calculator {
	@Autowired
	private ApplicationContext context;
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Operation addOperation = context.getBean("addOperation", Operation.class);
        System.out.println("Addition result: " + addOperation.calculate(num1, num2));

        Operation subtractOperation = context.getBean("subtractOperation", Operation.class);
        System.out.println("Subtraction result: " + subtractOperation.calculate(num1, num2));
    }
}
