package com.example.windfarm.controller;

import com.example.windfarm.domain.Asset;
import com.example.windfarm.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assets")
public class AssetController {

    private final AssetService assetService;

    @Autowired
    public AssetController(@Lazy AssetService assetService) {
        this.assetService = assetService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Asset>> getAllAssets() {
        List<Asset> assets = assetService.getAllAssets();
        return ResponseEntity.ok(assets);
    }

    // Additional endpoints can be added here
}
