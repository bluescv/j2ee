package learning.mybatis.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class Application {

	@Bean
	MessageService mockMessageService() {
		return new MessageService() {
			public String getMessage() {
				return "Hello World!";
			}
		};
	}

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		// MessagePrinter printer = context.getBean(MessagePrinter.class);
		// printer.printMessage();
		UserService uservice = context.getBean(UserService.class);
		System.out.println(uservice.selectByPrimaryKey(1));
	}
}
