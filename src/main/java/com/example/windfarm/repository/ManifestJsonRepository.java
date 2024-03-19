package com.example.windfarm.repository;

import com.example.windfarm.domain.ManifestJson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManifestJsonRepository extends JpaRepository<ManifestJson, Long> {
    // Custom query methods can be added here if needed
}
