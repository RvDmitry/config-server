package my.home.dmitry.cloud.station.display.first.service;

import my.home.dmitry.cloud.station.display.first.config.TestConfiguration;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private final TestConfiguration testConfiguration;

    public TestService(TestConfiguration testConfiguration) {
        this.testConfiguration = testConfiguration;
    }

    public String getValue() {
        return testConfiguration.getValue();
    }
}
