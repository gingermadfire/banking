package com.gingermadfire.banking.service;

import com.gingermadfire.banking.model.CurrencyUpdate;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.reactive.ReactiveKafkaProducerTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class CurrencyUpdateGeneratorService {

    private final ReactiveKafkaProducerTemplate<String, CurrencyUpdate> reactiveKafkaProducerTemplate;

  /*  public void generate() {
        CurrencyUpdate currency = generateCurrency();
        reactiveKafkaProducerTemplate.send("test-topic-1", currency).subscribe();

    }*/

    private CurrencyUpdate generateCurrency() {
        Random random = new Random();
        return new CurrencyUpdate("RUB", BigDecimal.valueOf(random.nextLong()));
    }

}

