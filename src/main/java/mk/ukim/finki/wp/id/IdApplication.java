package mk.ukim.finki.wp.id;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class IdApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdApplication.class, args);
	}

}
