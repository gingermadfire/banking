package com.gingermadfire.banking.model;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CurrencyUpdate {

    private String currencyCode;

    private BigDecimal value;
}
