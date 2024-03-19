package com.example.windfarm.controller;

import com.example.windfarm.domain.CardSwipeOnAsset;
import com.example.windfarm.service.CardSwipeOnAssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/card-swipes")
public class CardSwipeOnAssetController {

    private final CardSwipeOnAssetService cardSwipeOnAssetService;

    @Autowired
    public CardSwipeOnAssetController(@Lazy CardSwipeOnAssetService cardSwipeOnAssetService) {
        this.cardSwipeOnAssetService = cardSwipeOnAssetService;
    }

    @GetMapping("/")
    public ResponseEntity<List<CardSwipeOnAsset>> getAllCardSwipes() {
        List<CardSwipeOnAsset> cardSwipes = cardSwipeOnAssetService.getAllCardSwipes();
        return ResponseEntity.ok(cardSwipes);
    }

    // Additional endpoints can be added here
}
