package run.itlife.mediaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MediaappApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(MediaappApplication.class);
		app.run(args);
	}

}
