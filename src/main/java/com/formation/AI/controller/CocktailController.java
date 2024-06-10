package com.formation.AI.controller;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formation.AI.model.CocktailModel;
import com.formation.AI.service.CocktailService;


@RestController
public class CocktailController {

// Suggested code may be subject to a license. Learn more: ~LicenseLog:2047674779.
    private final CocktailService cocktailService;

    public CocktailController(CocktailService cocktailService) {
        this.cocktailService = cocktailService;
    }


    @GetMapping("/cocktail")
    public ResponseEntity<List<CocktailModel>> getAllCocktails() {
        return ResponseEntity.ok(cocktailService.getAllCocktails());
    }

}
