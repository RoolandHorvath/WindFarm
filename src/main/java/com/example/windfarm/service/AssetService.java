package com.example.windfarm.service;

import com.example.windfarm.domain.Asset;
import com.example.windfarm.repository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetService {

    private final AssetRepository assetRepository;

    @Autowired
    public AssetService(@Lazy AssetRepository assetRepository) {
        this.assetRepository = assetRepository;
    }

    public List<Asset> getAllAssets() {
        return assetRepository.findAll();
    }
}
