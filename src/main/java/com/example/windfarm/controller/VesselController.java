package com.example.windfarm.controller;

import com.example.windfarm.dto.VesselPathDTO;
import com.example.windfarm.service.VesselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/vessels")
public class VesselController {

    private final VesselService vesselService;

    @Autowired
    public VesselController(@Lazy VesselService vesselService) {
        this.vesselService = vesselService;
    }

    @GetMapping("/paths")
    public ResponseEntity<List<VesselPathDTO>> getVesselPaths(
            @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        List<VesselPathDTO> paths = vesselService.findVesselPathsByDate(date);
        return ResponseEntity.ok(paths);
    }

    // Other endpoints can be added here as needed
}
