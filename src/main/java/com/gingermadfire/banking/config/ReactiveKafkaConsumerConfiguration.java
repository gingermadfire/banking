package com.gingermadfire.banking.config;

import com.gingermadfire.banking.model.CurrencyUpdate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.reactive.ReactiveKafkaConsumerTemplate;
import reactor.kafka.receiver.ReceiverOptions;

import java.util.Collections;

@Configuration
public class ReactiveKafkaConsumerConfiguration {

    @Bean
    public ReceiverOptions<String, CurrencyUpdate> receiverOptions(
            @Value("${banking.kafka.topic.test-topic-1}") String topic,
            KafkaProperties kafkaProperties
    ) {
        ReceiverOptions<String, CurrencyUpdate> receiverOptions = ReceiverOptions.create(
                kafkaProperties.buildConsumerProperties()
        );
        return receiverOptions.subscription(Collections.singletonList(topic));
    }

    @Bean
    public ReactiveKafkaConsumerTemplate<String, CurrencyUpdate> reactiveKafkaConsumerTemplate(
            ReceiverOptions<String, CurrencyUpdate> receiverOptions
    ) {
        return new ReactiveKafkaConsumerTemplate<>(receiverOptions);
    }

}
