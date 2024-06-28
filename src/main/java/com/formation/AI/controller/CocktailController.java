package com.formation.AI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formation.AI.model.CocktailModel;
import com.formation.AI.service.CocktailService;


@RestController
public class CocktailController {

    @Autowired
    private CocktailService cocktailService;

    @GetMapping("/cocktail")
    public ResponseEntity<List<CocktailModel>> getAllCocktails() {
        return ResponseEntity.ok(this.cocktailService.getAllCocktails());
    }

}
