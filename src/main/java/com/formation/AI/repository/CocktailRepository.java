package com.formation.AI.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;


@Repository
public class CocktailRepository {

    
    @Value("${api.url}")
    private String apiUrl;

    @Value("${api.url.allCocktails}")
    private String apiUrlAllCocktails;

    @Autowired
    private RestTemplate restTemplate;

}
