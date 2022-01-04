package co.uk.mailnewspapers.context;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Getter
@Configuration
@PropertySource(value = "classpath:env.properties")
public class Environment {

    @Value("${host}")
    private String host;

    @Value("${port}")
    private String port;
}