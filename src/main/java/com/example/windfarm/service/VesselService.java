// VesselService.java
package com.example.windfarm.service;

import com.example.windfarm.domain.TrafficData;
import com.example.windfarm.dto.VesselPathDTO;
import com.example.windfarm.dto.VesselStatsDTO;
import com.example.windfarm.repository.TrafficDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VesselService {

    private final TrafficDataRepository trafficDataRepository;

    @Autowired
    public VesselService(@Lazy TrafficDataRepository trafficDataRepository) {
        this.trafficDataRepository = trafficDataRepository;
    }

    public List<VesselPathDTO> findVesselPathsByDate(LocalDate date) {
        LocalDateTime startOfDay = date.atStartOfDay();
        LocalDateTime endOfDay = date.atTime(23, 59, 59);
        List<TrafficData> trafficDataList = trafficDataRepository.findByDatetimeUtcBetween(startOfDay, endOfDay);

        return trafficDataList.stream()
                .map(this::toVesselPathDTO)
                .collect(Collectors.toList());
    }

    private VesselPathDTO toVesselPathDTO(TrafficData trafficData) {
        VesselPathDTO dto = new VesselPathDTO();
        dto.setMmsi(trafficData.getMmsi());
        dto.setPath(trafficData.getPosition()); // Assume this is a serialized path data
        // ... Set other DTO fields as required
        return dto;
    }

    // Additional service methods can be added here, such as calculateAverageSpeed, etc.
    // Additional method inside VesselService.java

    public Double calculateAverageSpeedByDate(LocalDate date) {
        LocalDateTime startOfDay = date.atStartOfDay();
        LocalDateTime endOfDay = date.atTime(23, 59, 59);
        List<TrafficData> trafficDataList = trafficDataRepository.findByDatetimeUtcBetween(startOfDay, endOfDay);

        return trafficDataList.stream()
                .mapToDouble(TrafficData::getSog) // SOG is Speed Over Ground
                .average()
                .orElse(Double.NaN); // Return NaN if no data is available
    }

    public VesselStatsDTO calculateStatistics(LocalDate date) {
        Double averageSpeed = calculateAverageSpeedByDate(date);
        VesselStatsDTO statsDTO = new VesselStatsDTO();
        statsDTO.setAverageSpeed(averageSpeed);
        // Set other statistical information
        return statsDTO;
    }

}
