package com.gingermadfire.banking.config;

import com.gingermadfire.banking.model.CurrencyUpdate;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.reactive.ReactiveKafkaProducerTemplate;
import reactor.kafka.sender.SenderOptions;

@Configuration
public class ReactiveKafkaProducerConfiguration {

    @Bean
    public ReactiveKafkaProducerTemplate<String, CurrencyUpdate> reactiveKafkaProducerTemplate(
            KafkaProperties kafkaProperties
    ) {
        return new ReactiveKafkaProducerTemplate<>(SenderOptions.create(kafkaProperties.buildProducerProperties()));
    }

}
