package co.develhope.logging.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BasicService {

    private static final Logger logger = LoggerFactory.getLogger(BasicService.class);

    @Value("${my.custom.env.num1}")
    private int num1;

    @Value("${my.custom.env.num2}")
    private int num2;

    public String welcome() {
        logger.info("Welcome to my Spring Boot application");
        return "Welcome to my Spring Boot application";
    }
    public String exponent() {
        logger.debug("Starting exponent calculation");
        double result = Math.pow(num1, num2);
        logger.debug("Finished exponent calculation. Result: {}", result);
        return String.format("%d ^ %d = %.2f", num1, num2, result);
    }
    public void getErrors() {
        logger.error("An error occurred in the application");
        throw new RuntimeException("Oops, something went wrong");
    }
}
