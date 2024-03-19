package com.example.windfarm.controller;

import com.example.windfarm.domain.TrafficData;
import com.example.windfarm.dto.VesselLocationDTO;
import com.example.windfarm.service.TrafficDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/traffic-data")
public class TrafficDataController {

    private final TrafficDataService trafficDataService;

    @Autowired
    public TrafficDataController(@Lazy TrafficDataService trafficDataService) {
        this.trafficDataService = trafficDataService;
    }

    @GetMapping("/")
    public ResponseEntity<List<TrafficData>> getAllTrafficData() {
        List<TrafficData> data = trafficDataService.findAll();
        return ResponseEntity.ok(data);
    }

    @GetMapping("/by-date")
    public ResponseEntity<List<TrafficData>> getTrafficDataByDate(
            @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        List<TrafficData> data = trafficDataService.findByDate(date);
        return ResponseEntity.ok(data);
    }

    @GetMapping("/vessel-locations")
    public ResponseEntity<List<VesselLocationDTO>> getVesselLocations() {
        List<VesselLocationDTO> locations = trafficDataService.getVesselLocations();
        return ResponseEntity.ok(locations);
    }

    @GetMapping("/vessel-movements")
    public ResponseEntity<List<TrafficData>> getVesselMovements(
            @RequestParam String mmsi,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime start,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime end) {

        List<TrafficData> movements = trafficDataService.getVesselMovements(mmsi, start, end);
        return ResponseEntity.ok(movements);
    }

    @GetMapping("/active-vessels")
    public ResponseEntity<List<String>> getActiveVesselsForDate(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        List<String> vessels = trafficDataService.getActiveVesselsForDate(date);
        return ResponseEntity.ok(vessels);
    }
}
