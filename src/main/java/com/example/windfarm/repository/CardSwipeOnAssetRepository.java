package com.example.windfarm.repository;

import com.example.windfarm.domain.CardSwipeOnAsset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardSwipeOnAssetRepository extends JpaRepository<CardSwipeOnAsset, Long> {
    // Custom query methods can be added here if needed
}
