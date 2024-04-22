package com.thinkitive.contentnegotiation.controller;

import com.thinkitive.contentnegotiation.entity.Flight;
import com.thinkitive.contentnegotiation.serviceimpl.ServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class FlightController {

    @Autowired
    private ServiceImplementation serviceImplementation;

    @GetMapping("flight/getFind/{id}")
    public ResponseEntity<?> getFlightById(@PathVariable int id) {
        Flight flight = serviceImplementation.getFlightData(id);
        if (flight != null) {
            return ResponseEntity.ok()
                    .body(flight);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Flight not found");
        }
    }

    @GetMapping("flight/getAll")
    public ResponseEntity<?> getAllFlightData() {
        List<Flight> flights = serviceImplementation.getAllFlightData();
        if (!flights.isEmpty()) {
            return ResponseEntity.ok()
                    .body(flights);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No flights found");
        }
    }

    @PostMapping("flight/create")
    public ResponseEntity<?> createFlightData(@RequestBody Flight flight) {
        Flight createdFlight = serviceImplementation.createFlightInfo(flight);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(createdFlight);
    }

    @PutMapping("flight/update/{id}")
    public ResponseEntity<?> updateFlight(@PathVariable int id) {
        Flight updatedFlight = serviceImplementation.upDate(id);
        if (updatedFlight != null) {
            return ResponseEntity.ok()
                    .body(updatedFlight);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Flight not found");
        }
    }

    @DeleteMapping("flight/delete/{id}")
    public ResponseEntity<?> deleteFlight(@PathVariable int id) {
        serviceImplementation.delete(id);
        return ResponseEntity.ok()
                .body("Flight deleted");
    }
}
