package trybuild;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {


    @RequestMapping("/testa")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/testb")
    String home1() {
        return "wo shi wxq!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}
