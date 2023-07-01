package my.home.dmitry.cloud.station.weather.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableDiscoveryClient
@EnableScheduling
@SpringBootApplication
public class WeatherStationSecondApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherStationSecondApplication.class, args);
    }
}
