import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableAutoConfiguration
public class Hello {

    @RequestMapping("/")
    @ResponseBody
    public String helloPage(){
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(Hello.class, args);
    }

}
