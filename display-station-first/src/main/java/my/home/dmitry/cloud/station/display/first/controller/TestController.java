package my.home.dmitry.cloud.station.display.first.controller;

import my.home.dmitry.cloud.station.display.first.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/value")
    public String test()  {
        return testService.getValue();
    }
}
