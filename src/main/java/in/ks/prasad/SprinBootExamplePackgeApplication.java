package in.ks.prasad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"in.ks","com.app"})
public class SprinBootExamplePackgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinBootExamplePackgeApplication.class, args);
	}

}