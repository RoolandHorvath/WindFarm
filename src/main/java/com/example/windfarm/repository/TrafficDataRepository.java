// TrafficDataRepository.java
package com.example.windfarm.repository;

import com.example.windfarm.domain.TrafficData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TrafficDataRepository extends JpaRepository<TrafficData, Long> {
    List<TrafficData> findByDatetimeUtcBetween(LocalDateTime startDateTime, LocalDateTime endDateTime);
    List<TrafficData> findByMmsiAndDatetimeUtcBetween(String mmsi, LocalDateTime start, LocalDateTime end);

    //@Query("SELECT DISTINCT t.mmsi FROM TrafficData t WHERE t.datetimeUtc BETWEEN :start AND :end")
    //List<String> findDistinctMmsiByDatetimeUtcBetween(LocalDateTime start, LocalDateTime end);
}
