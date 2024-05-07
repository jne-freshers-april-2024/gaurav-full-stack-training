package com.thinkitive.microservice.currencyexchangeservice;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class CurrencyExchangeController {

    private Logger logger = LoggerFactory.getLogger(CurrencyExchangeController.class);

    @Autowired
    private CurrrencyExchangeRepository repository;

    @Autowired
    private Environment environment;
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retriveExchangeValue(@PathVariable String from ,@PathVariable String to){
//        CurrencyExchange currencyExchange = new CurrencyExchange(10001L, from ,to , BigDecimal.valueOf(65));

        logger.info("retiveexchange value called with {} to {}");
        CurrencyExchange currencyExchange =
                repository.findByFromAndTo(from ,to);
        if(currencyExchange == null){
            throw new RuntimeException("Unable to find the data " + from +" to "+to);
        }
        String port = environment.getProperty("local.server.port");
        currencyExchange.setEnvironment(port);
        return  currencyExchange;
    }
}