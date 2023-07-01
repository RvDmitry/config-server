package my.home.dmitry.cloud.station.weather.third.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MainController {

    @Value("${test.value}")
    private String value;

    @GetMapping("/value")
    public String getValue() {
        return value;
    }
}
