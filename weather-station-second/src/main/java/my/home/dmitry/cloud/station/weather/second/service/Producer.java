package my.home.dmitry.cloud.station.weather.second.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

@Service
@RequiredArgsConstructor
public class Producer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public ListenableFuture<SendResult<String, String>> sendMessage(String topic, String key, String message) {

        return this.kafkaTemplate.send(topic, key, message);
    }
}
