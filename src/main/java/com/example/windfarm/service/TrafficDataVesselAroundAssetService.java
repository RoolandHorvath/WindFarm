package com.example.windfarm.service;

import com.example.windfarm.domain.TrafficDataVesselAroundAsset;
import com.example.windfarm.repository.TrafficDataVesselAroundAssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrafficDataVesselAroundAssetService {

    private final TrafficDataVesselAroundAssetRepository repository;

    @Autowired
    public TrafficDataVesselAroundAssetService(@Lazy TrafficDataVesselAroundAssetRepository repository) {
        this.repository = repository;
    }

    public List<TrafficDataVesselAroundAsset> getAllTrafficDataVesselAroundAssets() {
        return repository.findAll();
    }
}
