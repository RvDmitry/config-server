package my.home.dmitry.cloud.station.weather.first.service;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.support.SendResult;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.Random;
import java.util.concurrent.ExecutionException;

@Component
@RequiredArgsConstructor
public class SendMessageTask {

    private static final String CITY = "Екатеринбург";
    private final Logger logger = LoggerFactory.getLogger(SendMessageTask.class);
    private final Producer producer;

    @Value("${spring.kafka.producer.topic}")
    private String topic;

    @Value("${spring.kafka.producer.key}")
    private String key;

    @Scheduled(fixedRateString = "${spring.kafka.task.scheduler.period}")
    public void send() throws ExecutionException, InterruptedException {
        var message = String.format(CITY + " T° %d", getTemperature(-20, 20));
        ListenableFuture<SendResult<String, String>> listenableFuture = this.producer.sendMessage(topic, key, message);
        SendResult<String, String> result = listenableFuture.get();
        logger.info(
                "Produced:\n"
                        + "topic: {}\n"
                        + "partition: {}\n"
                        + "offset: {}\n"
                        + "value size: {}\n"
                        + "message: {}",
                topic,
                result.getRecordMetadata().partition(),
                result.getRecordMetadata().offset(),
                result.getRecordMetadata().serializedValueSize(),
                message
        );
    }

    private int getTemperature(int min, int max) {
        int diff = max - min;
        Random random = new Random();
        return random.nextInt(diff + 1) + min;
    }
}
