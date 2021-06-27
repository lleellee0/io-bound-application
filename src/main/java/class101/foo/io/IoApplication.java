package class101.foo.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling // cron 표현식을 이용하여 스케쥴링을 사용할 수 있게 함.
@SpringBootApplication
public class IoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IoApplication.class, args);
	}

}
