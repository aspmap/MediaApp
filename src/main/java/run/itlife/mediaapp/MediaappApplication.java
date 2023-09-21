package run.itlife.mediaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class MediaappApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(MediaappApplication.class);
		app.run(args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api/persons").allowedOrigins("*");
				registry.addMapping("/api").allowedOrigins("*");
				registry.addMapping("/api/person/*").allowedOrigins("*");
			}
		};
	}

}
