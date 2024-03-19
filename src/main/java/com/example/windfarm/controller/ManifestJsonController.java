package com.example.windfarm.controller;

import com.example.windfarm.domain.ManifestJson;
import com.example.windfarm.service.ManifestJsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/manifests")
public class ManifestJsonController {

    private final ManifestJsonService manifestJsonService;

    @Autowired
    public ManifestJsonController(@Lazy ManifestJsonService manifestJsonService) {
        this.manifestJsonService = manifestJsonService;
    }

    @GetMapping("/")
    public ResponseEntity<List<ManifestJson>> getAllManifests() {
        List<ManifestJson> manifests = manifestJsonService.getAllManifests();
        return ResponseEntity.ok(manifests);
    }

    // Additional endpoints can be added here
}
