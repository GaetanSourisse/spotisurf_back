package com.spotisurf.api;

import com.spotisurf.api.Models.Spot;
import com.spotisurf.api.Repository.SpotRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner{

	private final Logger logger = LoggerFactory.getLogger(ApiApplication.class);

	@Autowired
	private SpotRepository spotRepository;

	public static void main(String[] args) {

		SpringApplication.run(ApiApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Optional<Spot> spot = spotRepository.findById("648adc3057112e8f3f9b7e15");
		if (spot.isPresent()) {
			logger.info(spot.get().getFields().getDestination());
		} else {
			logger.info("Spot not found");
		}
	}

}
