package co.com.company;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tinylog.Logger;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        Logger.info("Hello World INFO Log Test!");
        Logger.warn("Hello World WARNING Log Test!");
        Logger.error("Hello World ERROR Log Test!");
        Logger.tag("EXPOSE_WS").error("Hello World TAG ERROR TEST Log Test!");
    }
}
