package com.example.windfarm.controller;

import com.example.windfarm.domain.TrafficDataVesselAroundAsset;
import com.example.windfarm.service.TrafficDataVesselAroundAssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/traffic-data-vessels-around-assets")
public class TrafficDataVesselAroundAssetController {

    private final TrafficDataVesselAroundAssetService service;

    @Autowired
    public TrafficDataVesselAroundAssetController(@Lazy TrafficDataVesselAroundAssetService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ResponseEntity<List<TrafficDataVesselAroundAsset>> getAllTrafficDataVesselAroundAssets() {
        List<TrafficDataVesselAroundAsset> data = service.getAllTrafficDataVesselAroundAssets();
        return ResponseEntity.ok(data);
    }

    // Additional endpoints can be added here
}
