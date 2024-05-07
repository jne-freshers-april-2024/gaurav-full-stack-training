package com.thinkitive.microservice.currencyconversionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;

@Configuration(proxyBeanMethods = false)
class RestTemplateConfiguration {

    @Bean
    RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}

@RestController
public class CurrencyConversionController {

    @Autowired
    private CurrencyExchangeProxy proxy;

    private RestTemplate restTemplate;

    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion getCurrecnyData(
            @PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity){

        HashMap<String, String> uriVariables = new HashMap<>();
        uriVariables.put("from", from);
        uriVariables.put("to", to);

        ResponseEntity<CurrencyConversion> forEntity = restTemplate.getForEntity("http://localhost:8001/currency-exchange/from/{from}/to/{to}", CurrencyConversion.class, uriVariables);
        CurrencyConversion body = forEntity.getBody();

        return new CurrencyConversion(body.getId(), from, to, quantity, body.getConversionMultiple(), quantity.multiply(body.getConversionMultiple()), body.getEnvironment()+" Rest Template");
    }

    @GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion getCurrecnyDataFeign(
            @PathVariable String from,
            @PathVariable String to,
            @PathVariable BigDecimal quantity)
    {

        CurrencyConversion body = proxy.getCurrecnyData(from, to);

        return new CurrencyConversion(body.getId(), from, to, quantity, body.getConversionMultiple(), quantity.multiply(body.getConversionMultiple()), body.getEnvironment()+" Feign");
    }
}