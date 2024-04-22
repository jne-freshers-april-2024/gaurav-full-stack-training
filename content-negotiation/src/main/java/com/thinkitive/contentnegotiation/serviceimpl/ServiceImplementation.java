package com.thinkitive.contentnegotiation.serviceimpl;

import com.thinkitive.contentnegotiation.entity.Flight;
import com.thinkitive.contentnegotiation.repository.FlightRepository;
import com.thinkitive.contentnegotiation.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ServiceImplementation implements Service {
    @Autowired
    private FlightRepository flightRepository;

    @Override
    public List<Flight> getAllFlightData() {
        List<Flight> flight = flightRepository.findAll();
        return flight;
    }

    @Override
    public Flight getFlightData(int id) {
        Flight flight = flightRepository.findById(id).get();
        return flight;
    }

    @Override
    public Flight createFlightInfo(Flight flight) {
        Flight create = flightRepository.save(flight);
        return create;
    }

    @Override
    public Flight upDate(int id) {
        Flight update = flightRepository.findById(id).get();
        Flight status = flightRepository.save(update);
        return status;
    }

    @Override
    public void delete(int id) {
        flightRepository.deleteById(id);
    }

//    public Emp createEmpData(Emp emp) {
//        Emp create = empRepository.save(emp);
//        return create;
//    }
}
