package com.thinkitive.contentnegotiation.service;

import com.thinkitive.contentnegotiation.entity.Flight;

import java.util.List;

@org.springframework.stereotype.Service
public interface Service {
    public List<Flight> getAllFlightData();
    public Flight getFlightData(int id);
    public Flight createFlightInfo(Flight flight);
    public Flight upDate(int id);
    public void delete(int id);
}
