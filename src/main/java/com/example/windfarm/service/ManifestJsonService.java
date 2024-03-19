package com.example.windfarm.service;

import com.example.windfarm.domain.ManifestJson;
import com.example.windfarm.repository.ManifestJsonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManifestJsonService {

    private final ManifestJsonRepository manifestJsonRepository;

    @Autowired
    public ManifestJsonService(@Lazy ManifestJsonRepository manifestJsonRepository) {
        this.manifestJsonRepository = manifestJsonRepository;
    }

    public List<ManifestJson> getAllManifests() {
        return manifestJsonRepository.findAll();
    }
}
