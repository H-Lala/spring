package app;

import app.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

/**
 * http://localhost:8081/users
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        SpringApplication.run(Application.class);
    }


}
