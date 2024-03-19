package com.example.windfarm.service;

import com.example.windfarm.domain.TrafficData;
import com.example.windfarm.dto.VesselLocationDTO;
import com.example.windfarm.repository.TrafficDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrafficDataService {

    private final TrafficDataRepository trafficDataRepository;

    @Autowired
    public TrafficDataService(@Lazy TrafficDataRepository trafficDataRepository) {
        this.trafficDataRepository = trafficDataRepository;
    }

    public List<TrafficData> findAll() {
        return trafficDataRepository.findAll();
    }

    public List<TrafficData> findByDate(LocalDate date) {
        LocalDateTime startOfDay = date.atStartOfDay();
        LocalDateTime endOfDay = date.atTime(23, 59, 59);
        return trafficDataRepository.findByDatetimeUtcBetween(startOfDay, endOfDay);
    }

    public List<VesselLocationDTO> getVesselLocations() {
        List<TrafficData> trafficDataList = trafficDataRepository.findAll();
        return trafficDataList.stream()
                .map(this::toVesselLocationDTO)
                .collect(Collectors.toList());
    }

    private VesselLocationDTO toVesselLocationDTO(TrafficData trafficData) {
        VesselLocationDTO dto = new VesselLocationDTO();
        dto.setMmsi(trafficData.getMmsi());
        dto.setVesselName(lookupVesselNameByMMSI(trafficData.getMmsi())); // This needs to be implemented

        // Placeholder for decoding the Position - replace with actual logic
        String[] latLong = decodePosition(trafficData.getPosition()); // This is a placeholder
        dto.setLatitude(Double.parseDouble(latLong[0]));
        dto.setLongitude(Double.parseDouble(latLong[1]));

        dto.setSog(trafficData.getSog());
        dto.setCog(trafficData.getCog());
        dto.setHeading(trafficData.getHeading());

        return dto;
    }

    // Placeholder for actual decoding logic - replace with your actual decoding implementation
    private String[] decodePosition(String encodedPosition) {
        // For example, if encoded with Base64:
        String decoded = new String(Base64.getDecoder().decode(encodedPosition));
        return decoded.split(","); // Assuming the format "latitude,longitude"
    }

    // Placeholder for vessel name lookup
    private String lookupVesselNameByMMSI(String mmsi) {
        // Implement lookup logic, possibly querying another table
        return "Vessel Name"; // Placeholder
    }

    public List<TrafficData> getVesselMovements(String mmsi, LocalDateTime start, LocalDateTime end) {
        return trafficDataRepository.findByMmsiAndDatetimeUtcBetween(mmsi, start, end);
    }

    public List<String> getActiveVesselsForDate(LocalDate date) {
        LocalDateTime startOfDay = date.atStartOfDay();
        LocalDateTime endOfDay = date.atTime(23, 59, 59);
        //return trafficDataRepository.findDistinctMmsiByDatetimeUtcBetween(startOfDay, endOfDay);
        // temporary return until TrafficDataRepository issue is resolved
        ArrayList<String> tmp = new ArrayList<String>();
        return tmp;
    }
}
