package owu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "owu")
public class WebConfig {


    @Bean
    public NumberGenerator numberGenerator() {
        NumberGenerator numberGenerator = new NumberGenerator();
        return numberGenerator;
    }


}