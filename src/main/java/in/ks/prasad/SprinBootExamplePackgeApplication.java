package in.ks.prasad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"in.ks","com.app"})
@RestController
public class SprinBootExamplePackgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinBootExamplePackgeApplication.class, args);

		int i = 22;
		int j = 55;
	}

}
