package com.gingermadfire.banking.kafkacontroller;

import com.gingermadfire.banking.service.CurrencyUpdateService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class CurrencyUpdateKafkaController implements ApplicationListener<ApplicationReadyEvent> {

    private final CurrencyUpdateService currencyUpdateService;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        currencyUpdateService.receiveCurrencyUpdate().subscribe();
    }
}
