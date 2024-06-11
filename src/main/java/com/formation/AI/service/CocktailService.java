package com.formation.AI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.AI.model.CocktailModel;
import com.formation.AI.repository.CocktailRepository;

@Service
public class CocktailService {

    @Autowired
    private CocktailRepository cocktailRepository;

    public List<CocktailModel> getAllCocktails() {
        return cocktailRepository.getCocktails();
    }
}
