package com.example.windfarm.service;

import com.example.windfarm.domain.CardSwipeOnAsset;
import com.example.windfarm.repository.CardSwipeOnAssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardSwipeOnAssetService {

    private final CardSwipeOnAssetRepository cardSwipeOnAssetRepository;

    @Autowired
    public CardSwipeOnAssetService(@Lazy CardSwipeOnAssetRepository cardSwipeOnAssetRepository) {
        this.cardSwipeOnAssetRepository = cardSwipeOnAssetRepository;
    }

    public List<CardSwipeOnAsset> getAllCardSwipes() {
        return cardSwipeOnAssetRepository.findAll();
    }
}
