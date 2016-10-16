package org.gaosung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//启注解事务管理
@EnableTransactionManagement
public class TribuneBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TribuneBootApplication.class, args);
		/*ApplicationContext ctx = SpringApplication.run(TribuneBootApplication.class, args);
		String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();
		for (String profile : activeProfiles) {
			System.out.println("Spring Boot 使用profile为:{"+profile+"}");
		}*/
	}
}
