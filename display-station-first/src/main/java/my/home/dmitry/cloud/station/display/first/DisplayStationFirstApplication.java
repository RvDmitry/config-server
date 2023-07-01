package my.home.dmitry.cloud.station.display.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DisplayStationFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(DisplayStationFirstApplication.class, args);
    }
}
