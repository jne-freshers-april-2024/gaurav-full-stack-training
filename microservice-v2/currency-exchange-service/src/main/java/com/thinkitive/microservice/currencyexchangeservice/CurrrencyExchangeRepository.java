package com.thinkitive.microservice.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
    CurrencyExchange findByFromAndTo(String from , String to);
}
