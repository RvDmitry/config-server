package my.home.dmitry.cloud.station.weather.third;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableDiscoveryClient
@EnableScheduling
@SpringBootApplication
public class WeatherStationThirdApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherStationThirdApplication.class, args);
    }
}
