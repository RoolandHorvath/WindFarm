package com.example.windfarm.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "CardSwipesOnAssets")
public class CardSwipeOnAsset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Other columns follow the same pattern
    private String cardId;
    private String action;
    // ... other fields ...

    private LocalDateTime entryTime;
    // ... other fields ...

    public CardSwipeOnAsset() {
        // Default constructor
    }


    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCardId() { return cardId; }
    public void setCardId(String cardId) { this.cardId = cardId; }

    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }

    // ... other getters and setters ...
}
