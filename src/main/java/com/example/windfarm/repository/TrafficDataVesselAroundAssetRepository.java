package com.example.windfarm.repository;

import com.example.windfarm.domain.TrafficDataVesselAroundAsset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrafficDataVesselAroundAssetRepository extends JpaRepository<TrafficDataVesselAroundAsset, Long> {
    // Custom query methods can be added here if needed
}
