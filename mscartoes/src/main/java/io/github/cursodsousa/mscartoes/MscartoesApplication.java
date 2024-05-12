package io.github.cursodsousa.mscartoes;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableRabbit
@Slf4j
public class MscartoesApplication {

	public static void main(String[] args) {
		log.info("Starting MScartoesApplication INFO {}", 01123);
		log.error("Starting MScartoesApplication ERROR {}", 01123);
		log.warn("Starting MScartoesApplication WARN {}", 01123);
		log.debug("Starting MScartoesApplication DEBUG {}", 01123);
		SpringApplication.run(MscartoesApplication.class, args);
	}

}
