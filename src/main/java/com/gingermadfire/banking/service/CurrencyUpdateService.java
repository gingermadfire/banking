package com.gingermadfire.banking.service;

import com.gingermadfire.banking.model.CurrencyUpdate;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.core.reactive.ReactiveKafkaConsumerTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class CurrencyUpdateService {

    private final ReactiveKafkaConsumerTemplate<String, CurrencyUpdate> currencyConsumerTemplate;

    public Flux<CurrencyUpdate> receiveCurrencyUpdate() {
        return currencyConsumerTemplate.receiveAutoAck()
                .map(ConsumerRecord::value)
                .log();
    }
}
