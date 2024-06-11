package com.formation.AI.repository;

import com.formation.AI.model.CocktailModel;

// Helper class to deserialize the API response (adjust based on actual response
// structure)
public class CocktailApiResponse {
    private CocktailModel[] drinks;

    public CocktailModel[] getDrinks() {
        return drinks;
    }

    public void setDrinks(CocktailModel[] drinks) {
        this.drinks = drinks;
    }
}