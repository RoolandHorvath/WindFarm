package com.example.windfarm.repository;

import com.example.windfarm.domain.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Long> {
    // This will automatically provide you with basic CRUD operations on Assets
}
